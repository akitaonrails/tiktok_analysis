package X;

/* JADX INFO: renamed from: X.19k0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21624219k0 extends AbstractC199648139q {
    public static final int[] LIZ = {1, 1, 1};
    public static final int[] LIZIZ = {1, 1, 1, 1, 1};
    public static final int[] LIZJ = {1, 1, 1, 1, 1, 1};
    public static final int[][] LIZLLL;
    public static final int[][] LJ;

    static {
        int i = 10;
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        LIZLLL = iArr;
        int[][] iArr2 = new int[20][];
        LJ = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        do {
            int[] iArr3 = LIZLLL[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            LJ[i] = iArr4;
            i++;
        } while (i < 20);
    }

    public static boolean LIZ(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (LIZIZ(charSequence.subSequence(0, i)) != Character.digit(charSequence.charAt(i), 10)) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(CharSequence charSequence) throws C21628719kj {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt >= 0 && iCharAt <= 9) {
                i += iCharAt;
            } else {
                throw C21628719kj.getFormatInstance();
            }
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 >= 0 && iCharAt2 <= 9) {
                i3 += iCharAt2;
            } else {
                throw C21628719kj.getFormatInstance();
            }
        }
        return (1000 - i3) % 10;
    }
}
