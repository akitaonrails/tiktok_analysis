package X;

/* JADX INFO: renamed from: X.0R1P, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1P {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public /* synthetic */ C0R1P(long j, String str) {
        this(j, 0L, str);
    }

    public C0R1P(long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
    }

    public static C0R1P LIZ(C0R1P c0r1p, long j, long j2, int i) {
        String str;
        long j3 = j2;
        long j4 = j;
        if ((i & 1) != 0) {
            j4 = c0r1p.LIZ;
        }
        if ((i & 2) != 0) {
            j3 = c0r1p.LIZIZ;
        }
        if ((i & 4) != 0) {
            str = c0r1p.LIZJ;
        } else {
            str = null;
        }
        return new C0R1P(j4, j3, str);
    }
}
