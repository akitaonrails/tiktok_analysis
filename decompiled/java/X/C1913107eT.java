package X;

import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07eT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1913107eT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1046));

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static int LIZIZ() {
        return ((Number) C1821407Bk.LIZ.getValue()).intValue() == 2 ? 4 : 0;
    }

    public static int LIZJ() {
        int iIntValue = ((Number) C1821407Bk.LIZ.getValue()).intValue();
        if (iIntValue != 1) {
            return iIntValue != 2 ? 0 : 8;
        }
        return 6;
    }

    public static int LIZLLL() {
        int iIntValue = ((Number) C1821407Bk.LIZ.getValue()).intValue();
        if (iIntValue != 1) {
            return iIntValue != 2 ? 0 : 8;
        }
        return 6;
    }

    public static int LJ() {
        int iLIZ = LIZ();
        if (iLIZ != 1) {
            return (iLIZ == 2 || iLIZ == 5) ? 5 : 0;
        }
        return 3;
    }

    public static int LJFF() {
        int iLIZ = LIZ();
        if (iLIZ == 1 || iLIZ == 2) {
            return 10;
        }
        if (iLIZ == 3) {
            return 12;
        }
        if (iLIZ != 5) {
            return iLIZ != 6 ? 0 : 12;
        }
        return 10;
    }

    public static int LJI() {
        int iLIZ = LIZ();
        if (iLIZ != 1 && iLIZ != 2) {
            if (iLIZ != 3) {
                if (iLIZ != 5) {
                    if (iLIZ != 6) {
                        return 0;
                    }
                }
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    }

    public static float LJII() {
        int iLIZ = LIZ();
        return (iLIZ == 4 || iLIZ == 5 || iLIZ == 6) ? 0.6666667f : 0.625f;
    }
}
