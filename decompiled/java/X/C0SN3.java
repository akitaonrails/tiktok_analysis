package X;

/* JADX INFO: renamed from: X.0SN3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SN3 {
    public static boolean LIZIZ(boolean z) {
        int i;
        if (z) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        int iLJIIJ = C12ES.LJIIJ(C844470XAv.LIZ());
        int iLJIIIIZZ = C12ES.LJIIIIZZ(C844470XAv.LIZ());
        if (iLJIIIIZZ > 0) {
            i = iLJIIJ / iLJIIIIZZ;
        } else {
            i = 0;
        }
        if (i >= 0.47f) {
            return false;
        }
        return true;
    }

    public static C0SN2 LIZ(boolean z, boolean z2, Float f, boolean z3) {
        if (z2) {
            return C0SN2.UNKNOWN;
        }
        if (!z) {
            return C0SN2.UNKNOWN;
        }
        if (LIZIZ(z3)) {
            if (f != null) {
                f.floatValue();
                C0SN2 c0sn2 = C0SN2.SHORTER_THAN_1_TO_1;
                if (c0sn2.minValue <= f.floatValue() && f.floatValue() < c0sn2.maxValue) {
                    return c0sn2;
                }
                C0SN2 c0sn22 = C0SN2.BETWEEN_1_TO_1_AND_4_TO_3;
                if (c0sn22.minValue <= f.floatValue() && f.floatValue() < c0sn22.maxValue) {
                    return c0sn22;
                }
                C0SN2 c0sn23 = C0SN2.TALLER_THAN_4_TO_3;
                if (c0sn23.minValue <= f.floatValue() && f.floatValue() < c0sn23.maxValue) {
                    return c0sn23;
                }
                return C0SN2.UNKNOWN;
            }
            return C0SN2.UNKNOWN;
        }
        return C0SN2.UNKNOWN;
    }
}
