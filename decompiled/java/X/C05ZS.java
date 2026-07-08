package X;

/* JADX INFO: renamed from: X.05ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05ZS {
    public static final boolean LIZ(C20066813fO c20066813fO) {
        if (!c20066813fO.LJII && c20066813fO.LIZLLL) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(C20066813fO c20066813fO) {
        if (!c20066813fO.LIZIZ() && c20066813fO.LJII && !c20066813fO.LIZLLL) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(C20066813fO c20066813fO) {
        if (c20066813fO.LJII && !c20066813fO.LIZLLL) {
            return true;
        }
        return false;
    }

    public static final long LJ(C20066813fO c20066813fO, boolean z) {
        long jLJFF = C1378605aS.LJFF(c20066813fO.LIZJ, c20066813fO.LJI);
        if (!z && c20066813fO.LIZIZ()) {
            return 0L;
        }
        return jLJFF;
    }

    public static final boolean LIZLLL(C20066813fO c20066813fO, long j, long j2) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (c20066813fO.LJIIIIZZ == 1) {
            i = 1;
        } else {
            i = 0;
        }
        long j3 = c20066813fO.LIZJ;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        float f3 = ((int) (j & 4294967295L)) + fIntBitsToFloat4;
        if (fIntBitsToFloat < (-fIntBitsToFloat3)) {
            z = true;
        } else {
            z = false;
        }
        if (fIntBitsToFloat > f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (fIntBitsToFloat2 < (-fIntBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (fIntBitsToFloat2 > f3) {
            z4 = true;
        }
        return z6 | z4;
    }
}
