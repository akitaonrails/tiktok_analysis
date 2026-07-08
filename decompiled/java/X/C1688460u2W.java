package X;

/* JADX INFO: renamed from: X.0u2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688460u2W {
    public static final int LIZIZ(C1688450u2V c1688450u2V) {
        int iLIZ;
        int iLIZ2 = c1688450u2V.LIZ(0);
        while (c1688450u2V.LIZIZ != 0 && c1688450u2V.LIZ(0) == iLIZ2) {
            c1688450u2V.LJI(0, c1688450u2V.LIZIZ());
            c1688450u2V.LJFF(c1688450u2V.LIZIZ - 1);
            int i = c1688450u2V.LIZIZ;
            int i2 = i >>> 1;
            int i3 = 0;
            while (i3 < i2) {
                int iLIZ3 = c1688450u2V.LIZ(i3);
                int i4 = (i3 + 1) * 2;
                int i5 = i4 - 1;
                int iLIZ4 = c1688450u2V.LIZ(i5);
                if (i4 < i && (iLIZ = c1688450u2V.LIZ(i4)) > iLIZ4) {
                    if (iLIZ > iLIZ3) {
                        c1688450u2V.LJI(i3, iLIZ);
                        c1688450u2V.LJI(i4, iLIZ3);
                        i3 = i4;
                    }
                } else if (iLIZ4 > iLIZ3) {
                    c1688450u2V.LJI(i3, iLIZ4);
                    c1688450u2V.LJI(i5, iLIZ3);
                    i3 = i5;
                }
            }
        }
        return iLIZ2;
    }

    public static final void LIZ(int i, C1688450u2V c1688450u2V) {
        if (c1688450u2V.LIZIZ != 0 && (c1688450u2V.LIZ(0) == i || c1688450u2V.LIZ(c1688450u2V.LIZIZ - 1) == i)) {
            return;
        }
        int i2 = c1688450u2V.LIZIZ;
        c1688450u2V.LIZJ(i);
        while (i2 > 0) {
            int i3 = ((i2 + 1) >>> 1) - 1;
            int iLIZ = c1688450u2V.LIZ(i3);
            if (i <= iLIZ) {
                break;
            }
            c1688450u2V.LJI(i2, iLIZ);
            i2 = i3;
        }
        c1688450u2V.LJI(i2, i);
    }
}
