import java.util.Arrays;

/**
 * @skip-test
 */
/*
* This test case violates an assertion in the compiler.
* It does not depend on the fenum checker, it breaks for any checker.
*/
public class IdentityArrayList {
    public <T> T[] toArray(T[] a) {
    	return (T[]) Arrays.copyOf(null, 0, a.getClass());
    }
}
