package X;

/* JADX INFO: renamed from: X.1B9D, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B9D {
    public int LIZJ;
    public double LIZIZ = -1.0d;
    public final int LIZ = (int) Math.ceil(20.0d);

    public final void LIZ(double d) {
        int i = this.LIZJ;
        if (i > this.LIZ) {
            this.LIZIZ = Math.exp((0.95d * Math.log(this.LIZIZ)) + (0.05d * Math.log(d)));
        } else if (i > 0) {
            double d2 = i;
            double d3 = (0.95d * d2) / (d2 + 1.0d);
            this.LIZIZ = Math.exp((d3 * Math.log(this.LIZIZ)) + ((1.0d - d3) * Math.log(d)));
        } else {
            this.LIZIZ = d;
        }
        this.LIZJ++;
    }
}
