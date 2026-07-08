package X;

/* JADX INFO: renamed from: X.1B99, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B99 {
    public final double LIZ;
    public final int LIZIZ;
    public double LIZJ = -1.0d;
    public int LIZLLL;

    public C1B99(double d) {
        int iCeil;
        this.LIZ = d;
        if (d == 0.0d) {
            iCeil = Integer.MAX_VALUE;
        } else {
            iCeil = (int) Math.ceil(1.0d / d);
        }
        this.LIZIZ = iCeil;
    }

    public final void LIZ(double d) {
        double d2 = 1.0d - this.LIZ;
        int i = this.LIZLLL;
        if (i > this.LIZIZ) {
            this.LIZJ = Math.exp((d2 * Math.log(this.LIZJ)) + (this.LIZ * Math.log(d)));
        } else if (i > 0) {
            double d3 = (d2 * ((double) i)) / (((double) i) + 1.0d);
            this.LIZJ = Math.exp((d3 * Math.log(this.LIZJ)) + ((1.0d - d3) * Math.log(d)));
        } else {
            this.LIZJ = d;
        }
        this.LIZLLL++;
    }
}
