package X;

/* JADX INFO: renamed from: X.0Y44, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y44 {
    public final long LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;

    public C0Y44() {
        this(0L, 0L, "", false);
    }

    public C0Y44(long j, long j2, String str, boolean z) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = j2;
    }

    public static C0Y44 LIZ(C0Y44 c0y44, String str, long j, int i) {
        long j2;
        boolean z;
        long j3 = j;
        String str2 = str;
        if ((i & 1) != 0) {
            j2 = c0y44.LIZ;
        } else {
            j2 = 0;
        }
        if ((i & 2) != 0) {
            str2 = c0y44.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c0y44.LIZJ;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            j3 = c0y44.LIZLLL;
        }
        return new C0Y44(j2, j3, str2, z);
    }
}
