package X;

/* JADX INFO: renamed from: X.0jkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292860jkS {
    public final String LIZ;
    public final String LIZIZ;
    public final double LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final double LJFF;
    public final double LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;

    public final int hashCode() {
        int iHashCode = (((((int) (((double) (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31)) + this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ;
        long jDoubleToLongBits = Double.doubleToLongBits(this.LJFF);
        return (((iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + this.LJII;
    }

    public C1292860jkS(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, int i5, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = d;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = d2;
        this.LJI = d3;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = i5;
        this.LJIIJ = z;
    }
}
