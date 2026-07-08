package X;

/* JADX INFO: renamed from: X.0MpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580140MpA {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public C580140MpA(long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
    }

    public static C580140MpA LIZ(C580140MpA c580140MpA, long j, long j2, String str, int i) {
        String str2 = str;
        long j3 = j2;
        long j4 = j;
        if ((i & 1) != 0) {
            j4 = c580140MpA.LIZ;
        }
        if ((i & 2) != 0) {
            j3 = c580140MpA.LIZIZ;
        }
        if ((i & 4) != 0) {
            str2 = c580140MpA.LIZJ;
        }
        c580140MpA.getClass();
        return new C580140MpA(j4, j3, str2);
    }
}
