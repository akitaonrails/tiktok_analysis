package X;

/* JADX INFO: renamed from: X.0EGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EGJ {
    public boolean LIZ;
    public long LIZIZ = -1;
    public boolean LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public boolean LJI;

    public final void LIZ(long j, long j2) {
        this.LIZLLL = Long.valueOf(j);
        Long l = this.LJ;
        if (l != null) {
            this.LJFF = Long.valueOf(l.longValue() - j);
        }
        this.LIZIZ = j2;
        if (!this.LIZJ) {
            this.LIZ = true;
            this.LIZJ = true;
        } else {
            this.LIZ = false;
        }
    }
}
