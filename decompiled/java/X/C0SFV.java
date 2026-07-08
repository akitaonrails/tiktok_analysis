package X;

/* JADX INFO: renamed from: X.0SFV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFV {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static C0SFW LIZLLL = C0SFW.STOP;

    public static long LIZ(long j) {
        if (LIZJ != j) {
            return 0L;
        }
        if (LIZIZ > 0 && LIZLLL == C0SFW.START) {
            LIZ += System.currentTimeMillis() - LIZIZ;
        }
        LIZLLL = C0SFW.STOP;
        long j2 = LIZ;
        LIZIZ = 0L;
        LIZJ = 0L;
        LIZ = 0L;
        return j2;
    }
}
