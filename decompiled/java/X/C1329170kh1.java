package X;

import java.io.InputStream;

/* JADX INFO: renamed from: X.0kh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329170kh1 {
    public static final Class<?> LIZ = C1329170kh1.class;

    public static int LIZ(InputStream inputStream, int i) {
        int i2;
        int i3;
        boolean z;
        C1330240kik c1330240kik = new C1330240kik();
        if (i > 8) {
            int iLIZ = C1330190kif.LIZ(inputStream, 4, false);
            int i4 = i - 4;
            Class<?> cls = LIZ;
            if (iLIZ != 1229531648) {
                if (iLIZ != 1296891946) {
                    C1328570kg3.LIZJ(cls, "Invalid TIFF header");
                    i2 = 0;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            c1330240kik.LIZ = z;
            int iLIZ2 = C1330190kif.LIZ(inputStream, 4, z);
            c1330240kik.LIZIZ = iLIZ2;
            i2 = i4 - 4;
            if (iLIZ2 < 8 || iLIZ2 - 8 > i2) {
                C1328570kg3.LIZJ(cls, "Invalid offset");
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        int i5 = c1330240kik.LIZIZ - 8;
        if (i2 == 0 || i5 > i2) {
            return 0;
        }
        inputStream.skip(i5);
        int i6 = i2 - i5;
        boolean z2 = c1330240kik.LIZ;
        if (i6 >= 14) {
            int iLIZ3 = C1330190kif.LIZ(inputStream, 2, z2);
            int i7 = i6 - 2;
            while (true) {
                int i8 = iLIZ3 - 1;
                if (iLIZ3 > 0 && i7 >= 12) {
                    i3 = i7 - 2;
                    if (C1330190kif.LIZ(inputStream, 2, z2) == 274) {
                        break;
                    }
                    inputStream.skip(10L);
                    i7 = i3 - 10;
                    iLIZ3 = i8;
                } else {
                    break;
                }
            }
        } else {
            i3 = 0;
        }
        boolean z3 = c1330240kik.LIZ;
        if (i3 < 10 || C1330190kif.LIZ(inputStream, 2, z3) != 3 || C1330190kif.LIZ(inputStream, 4, z3) != 1) {
            return 0;
        }
        int iLIZ4 = C1330190kif.LIZ(inputStream, 2, z3);
        C1330190kif.LIZ(inputStream, 2, z3);
        return iLIZ4;
    }
}
