package X;

/* JADX INFO: renamed from: X.0kKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1315300kKe {
    public float LIZ;
    public float LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public float LJ;
    public long LJFF;

    public final boolean LIZ() {
        return Float.compare(this.LJ, this.LIZIZ) == 0;
    }

    public final void LIZIZ(long j) {
        this.LJFF = j;
        if (this.LIZLLL == 0) {
            this.LIZLLL = j;
        }
        long j2 = this.LIZJ;
        if (j2 <= 0) {
            this.LJ = this.LIZIZ;
            return;
        }
        if (j >= this.LIZLLL + j2) {
            this.LJ = this.LIZIZ;
        } else {
            float f = this.LIZ;
            this.LJ = f + (((this.LIZIZ - f) * (j - r5)) / j2);
        }
    }
}
