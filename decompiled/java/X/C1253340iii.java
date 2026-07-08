package X;

/* JADX INFO: renamed from: X.0iii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253340iii {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public final boolean LJII;

    public final long LIZ() {
        long j;
        long j2 = this.LIZ;
        if (1 > j2) {
            return -1L;
        }
        if (j2 < this.LIZLLL) {
            j = this.LIZLLL;
        } else {
            if (j2 >= this.LIZJ) {
                return -1L;
            }
            j = this.LIZJ;
        }
        return j - j2;
    }

    public C1253340iii(long j, boolean z, boolean z2, int i) {
        j = (i & 4) != 0 ? 0L : j;
        z = (i & 64) != 0 ? false : z;
        z2 = (i & 512) != 0 ? false : z2;
        this.LIZ = j;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = z;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = z2;
    }
}
