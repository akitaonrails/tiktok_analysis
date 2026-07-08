package X;

/* JADX INFO: renamed from: X.12BW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12BW {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;

    public final boolean LIZ() {
        double d = this.LIZ;
        if (0.0d > d || d > 1.0d) {
            return false;
        }
        double d2 = this.LIZIZ;
        if (0.0d > d2 || d2 > 1.0d) {
            return false;
        }
        double d3 = this.LIZJ;
        return 0.0d <= d3 && d3 <= 1.0d;
    }

    public C12BW(double d, double d2, double d3) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
    }
}
