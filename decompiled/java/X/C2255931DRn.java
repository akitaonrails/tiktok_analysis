package X;

/* JADX INFO: renamed from: X.1DRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255931DRn {
    public Long LIZ;
    public Long LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public int LJFF;
    public Long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;

    public final void LIZ(long j) {
        Long l = this.LJI;
        if (l != null) {
            long jMax = Math.max(0L, j - l.longValue());
            int i = this.LJFF;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.LJIIIZ += jMax;
                    }
                } else {
                    this.LJIIIIZZ += jMax;
                }
            } else {
                this.LJII += jMax;
            }
            this.LJI = Long.valueOf(j);
        }
    }

    public final long LIZIZ(int i, long j) {
        long j2;
        Long l;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    j2 = 0;
                } else {
                    j2 = this.LJIIIZ;
                }
            } else {
                j2 = this.LJIIIIZZ;
            }
        } else {
            j2 = this.LJII;
        }
        if (this.LJFF == i && (l = this.LJI) != null) {
            return j2 + Math.max(0L, j - l.longValue());
        }
        return j2;
    }

    public final void LIZJ(int i, long j) {
        if (this.LJFF == i) {
            return;
        }
        LIZ(j);
        this.LJFF = i;
        this.LJI = Long.valueOf(j);
    }
}
