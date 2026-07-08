package X;

/* JADX INFO: renamed from: X.0jML, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277910jML {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    public final boolean LIZ() {
        int i = this.LIZ;
        if (i == 0) {
            this.LJIIIIZZ = this.LJFF;
            this.LJI = this.LIZLLL;
            this.LJII = this.LJ;
            return true;
        }
        int i2 = this.LIZLLL;
        if (i2 == 0) {
            this.LJIIIIZZ = this.LIZJ;
            this.LJI = i;
            this.LJII = this.LIZIZ;
            return true;
        }
        int iMin = Math.min(i, i2);
        int iMin2 = Math.min(this.LIZJ, this.LJFF);
        if (iMin == this.LJI && iMin2 == this.LJIIIIZZ) {
            return false;
        }
        this.LJIIIIZZ = iMin2;
        this.LJI = iMin;
        this.LJII = iMin == this.LIZLLL ? this.LJ : this.LIZIZ;
        return true;
    }
}
