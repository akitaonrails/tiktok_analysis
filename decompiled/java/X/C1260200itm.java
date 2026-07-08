package X;

/* JADX INFO: renamed from: X.0itm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260200itm {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final Long LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;

    public C1260200itm(long j, long j2, long j3, long j4, boolean z, Long l) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = z;
        this.LJFF = l;
        this.LJI = j2 - j;
        this.LJII = j3 - j2;
        this.LJIIIIZZ = j4 - j3;
    }

    public static C1260200itm LIZ(C1260200itm c1260200itm, long j, long j2, boolean z, Long l, int i) {
        long j3;
        Long l2 = l;
        boolean z2 = z;
        long j4 = j2;
        long j5 = j;
        long j6 = 0;
        if ((i & 1) != 0) {
            j3 = c1260200itm.LIZ;
        } else {
            j3 = 0;
        }
        if ((i & 2) != 0) {
            j5 = c1260200itm.LIZIZ;
        }
        if ((i & 4) != 0) {
            j4 = c1260200itm.LIZJ;
        }
        if ((i & 8) != 0) {
            j6 = c1260200itm.LIZLLL;
        }
        if ((i & 16) != 0) {
            z2 = c1260200itm.LJ;
        }
        if ((i & 32) != 0) {
            l2 = c1260200itm.LJFF;
        }
        return new C1260200itm(j3, j5, j4, j6, z2, l2);
    }
}
