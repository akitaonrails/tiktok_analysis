package X;

/* JADX INFO: renamed from: X.19kC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21625419kC {
    public static final int[][] LIZ = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] LIZIZ = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] LIZJ = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] LIZLLL = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static boolean LJFF(int i) {
        return i == -1;
    }

    public static int LIZIZ(int i, int i2) {
        if (i2 != 0) {
            int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i2);
            int iNumberOfLeadingZeros2 = i << (iNumberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= iNumberOfLeadingZeros) {
                iNumberOfLeadingZeros2 ^= i2 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - iNumberOfLeadingZeros);
            }
            return iNumberOfLeadingZeros2;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void LIZJ(int i, int i2, C21625619kE c21625619kE) throws C21626019kI {
        int i3 = 0;
        do {
            int i4 = i + i3;
            if (LJFF(c21625619kE.LIZ(i4, i2))) {
                c21625619kE.LIZIZ(i4, i2, 0);
                i3++;
            } else {
                throw new C21626019kI();
            }
        } while (i3 < 8);
    }

    public static void LIZLLL(int i, int i2, C21625619kE c21625619kE) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = LIZ[i3];
            int i4 = 0;
            do {
                c21625619kE.LIZIZ(i + i4, i2 + i3, iArr[i4]);
                i4++;
            } while (i4 < 7);
        }
    }

    public static void LJ(int i, int i2, C21625619kE c21625619kE) throws C21626019kI {
        int i3 = 0;
        do {
            int i4 = i2 + i3;
            if (LJFF(c21625619kE.LIZ(i, i4))) {
                c21625619kE.LIZIZ(i, i4, 0);
                i3++;
            } else {
                throw new C21626019kI();
            }
        } while (i3 < 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C21622019je r16, X.C14L1 r17, X.C21625819kG r18, int r19, X.C21625619kE r20) throws X.C21626019kI {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21625419kC.LIZ(X.19je, X.14L1, X.19kG, int, X.19kE):void");
    }
}
