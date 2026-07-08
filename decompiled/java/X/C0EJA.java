package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0EJA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJA {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3206));

    public static int LJFF() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static Integer LIZ() {
        int iLJFF = LJFF();
        return (iLJFF == 1 || iLJFF == 2 || iLJFF == 3) ? 22 : null;
    }

    public static final boolean LJI() {
        return LJFF() != 0;
    }

    public static Integer LIZIZ(int i) {
        int i2;
        C0EJE c0ejeLJ = LJ(i);
        int iLJFF = LJFF();
        if (iLJFF != 1 && iLJFF != 2 && iLJFF != 3) {
            return null;
        }
        int i3 = C0EJD.LIZ[c0ejeLJ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                throw new C1954807lC();
            }
            i2 = 14;
        } else {
            i2 = 12;
        }
        return Integer.valueOf(i2);
    }

    public static Integer LIZJ(int i) {
        int i2;
        C0EJE c0ejeLJ = LJ(i);
        int iLJFF = LJFF();
        if (iLJFF != 1 && iLJFF != 2 && iLJFF != 3) {
            return null;
        }
        int i3 = C0EJD.LIZ[c0ejeLJ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                throw new C1954807lC();
            }
            i2 = 70;
        } else {
            i2 = 66;
        }
        return Integer.valueOf(i2);
    }

    public static Integer LIZLLL(int i) {
        C0EJE c0ejeLJ = LJ(i);
        int iLJFF = LJFF();
        int i2 = 3;
        if (iLJFF != 1 && iLJFF != 2 && iLJFF != 3) {
            return null;
        }
        int i3 = C0EJD.LIZ[c0ejeLJ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = 5;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i2 = 4;
            }
        }
        return Integer.valueOf(i2);
    }

    public static C0EJE LJ(int i) {
        if (i < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375))) {
            return C0EJE.SMALL;
        }
        if (i >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(420))) {
            return C0EJE.WIDE;
        }
        return C0EJE.NORMAL;
    }
}
