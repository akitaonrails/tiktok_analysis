package X;

/* JADX INFO: renamed from: X.1Dzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274191Dzt {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final double LJI;

    public /* synthetic */ C2274191Dzt(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }

    public C2274191Dzt(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
        this.LJ = d5;
        this.LJFF = d6;
        this.LJI = d7;
        if (!Double.isNaN(d2) && !Double.isNaN(d3) && !Double.isNaN(d4) && !Double.isNaN(d5) && !Double.isNaN(d6) && !Double.isNaN(d7) && !Double.isNaN(d)) {
            if (d != -2.0d && d != -3.0d) {
                if (d5 >= 0.0d && d5 <= 1.0d) {
                    if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
                        throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
                    }
                    if (d5 >= 1.0d && d4 == 0.0d) {
                        throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
                    }
                    if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
                        throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
                    }
                    if (d4 >= 0.0d) {
                        if (d2 >= 0.0d && d >= 0.0d) {
                            return;
                        } else {
                            throw new IllegalArgumentException("The transfer function must be positive or increasing");
                        }
                    }
                    throw new IllegalArgumentException("The transfer function must be increasing");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Parameter d must be in the range [0..1], was ");
                sbLIZ.append(d5);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        throw new IllegalArgumentException("Parameters cannot be NaN");
    }
}
