package X;

/* JADX INFO: renamed from: X.0l5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344440l5e {
    public final boolean LIZ;
    public final String LIZIZ;
    public final long LIZLLL;
    public final InterfaceC1344310l5R LJII;
    public int LIZJ = 0;
    public long LJ = 0;
    public long LJFF = 0;
    public long LJI = 0;
    public boolean LJIIIIZZ = false;

    public final long LIZ() {
        long j = this.LJ;
        long j2 = this.LIZLLL;
        if (1 > j2 || j2 >= j) {
            return -1L;
        }
        return j - j2;
    }

    public final long LIZIZ() {
        long j = this.LJFF;
        long j2 = this.LJ;
        if (1 > j2 || j2 >= j) {
            return -1L;
        }
        return j - j2;
    }

    public final long LIZJ() {
        long j;
        long j2 = this.LIZLLL;
        if (1 > j2) {
            return -1L;
        }
        if (j2 < this.LJI) {
            j = this.LJI;
        } else {
            if (j2 >= this.LJFF) {
                return -1L;
            }
            j = this.LJFF;
        }
        return j - j2;
    }

    public final long LIZLLL() {
        long j = this.LJI;
        long j2 = this.LJFF;
        if (1 > j2 || j2 >= j) {
            return -1L;
        }
        return j - j2;
    }

    public C1344440l5e(boolean z, String str, long j, C1344450l5f c1344450l5f) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZLLL = j;
        this.LJII = c1344450l5f;
    }
}
