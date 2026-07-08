package X;

/* JADX INFO: renamed from: X.15DM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DM {
    public static C15DO LIZIZ(C976480bWA c976480bWA, boolean z, boolean z2, long j) {
        boolean z3;
        long j2 = c976480bWA.LIZIZ;
        long j3 = c976480bWA.LIZJ;
        long j4 = c976480bWA.LIZLLL;
        long j5 = c976480bWA.LJ;
        if (j == c976480bWA.LIZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        return LIZ(j2, j3, j4, j5, z, z2, z3);
    }

    public static C15DO LIZ(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = false;
        if (z) {
            return new C15DO(j, false, false);
        }
        if (j2 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z3) {
            return new C15DO(j, false, z4);
        }
        if (j2 > 0) {
            z5 = true;
        }
        return new C15DO(j - j2, z5, z4);
    }
}
