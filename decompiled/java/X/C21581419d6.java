package X;

/* JADX INFO: renamed from: X.19d6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21581419d6 {
    public double LIZ;
    public double LIZIZ;
    public boolean LIZJ;
    public double LIZLLL;
    public double LJ;
    public double LJFF;
    public double LJI;
    public double LJII;
    public double LJIIIIZZ;
    public final C21581519d7 LJIIIZ;

    public C21581419d6() {
        this.LIZ = Math.sqrt(1500.0d);
        this.LIZIZ = 0.5d;
        this.LIZJ = false;
        this.LJIIIIZZ = Double.MAX_VALUE;
        this.LJIIIZ = new C21581519d7();
    }

    public C21581419d6(float f) {
        this.LIZ = Math.sqrt(1500.0d);
        this.LIZIZ = 0.5d;
        this.LIZJ = false;
        this.LJIIIZ = new C21581519d7();
        this.LJIIIIZZ = f;
    }

    public final void LIZ(float f) {
        if (f >= 0.0f) {
            this.LIZIZ = f;
            this.LIZJ = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void LIZIZ(float f) {
        if (f > 0.0f) {
            this.LIZ = Math.sqrt(f);
            this.LIZJ = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final C21581519d7 LIZJ(double d, double d2, long j) {
        double dPow;
        double dCos;
        if (!this.LIZJ) {
            if (this.LJIIIIZZ != Double.MAX_VALUE) {
                double d3 = this.LIZIZ;
                if (d3 > 1.0d) {
                    double d4 = this.LIZ;
                    this.LJFF = ((-d3) * d4) + (d4 * Math.sqrt((d3 * d3) - 1.0d));
                    double d5 = this.LIZIZ;
                    double d6 = this.LIZ;
                    this.LJI = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
                } else if (d3 >= 0.0d && d3 < 1.0d) {
                    this.LJII = this.LIZ * Math.sqrt(1.0d - (d3 * d3));
                }
                this.LIZJ = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.LJIIIIZZ;
        double d9 = this.LIZIZ;
        if (d9 > 1.0d) {
            double d10 = this.LJI;
            double d11 = this.LJFF;
            double d12 = d8 - (((d10 * d8) - d2) / (d10 - d11));
            double d13 = ((d8 * d10) - d2) / (d10 - d11);
            dPow = (Math.pow(2.718281828459045d, d10 * d7) * d12) + (Math.pow(2.718281828459045d, this.LJFF * d7) * d13);
            double d14 = this.LJI;
            double dPow2 = d12 * d14 * Math.pow(2.718281828459045d, d14 * d7);
            double d15 = this.LJFF;
            dCos = dPow2 + (d13 * d15 * Math.pow(2.718281828459045d, d15 * d7));
        } else if (d9 == 1.0d) {
            double d16 = this.LIZ;
            double d17 = d2 + (d16 * d8);
            double d18 = d8 + (d17 * d7);
            dPow = Math.pow(2.718281828459045d, (-d16) * d7) * d18;
            double dPow3 = d18 * Math.pow(2.718281828459045d, (-this.LIZ) * d7);
            double d19 = this.LIZ;
            dCos = (d17 * Math.pow(2.718281828459045d, (-d19) * d7)) + (dPow3 * (-d19));
        } else {
            double d20 = 1.0d / this.LJII;
            double d21 = this.LIZ;
            double d22 = d20 * ((d9 * d21 * d8) + d2);
            dPow = Math.pow(2.718281828459045d, (-d9) * d21 * d7) * ((Math.cos(this.LJII * d7) * d8) + (Math.sin(this.LJII * d7) * d22));
            double d23 = this.LIZ;
            double d24 = this.LIZIZ;
            double d25 = (-d23) * dPow * d24;
            double dPow4 = Math.pow(2.718281828459045d, (-d24) * d23 * d7);
            double d26 = this.LJII;
            double dSin = (-d26) * d8 * Math.sin(d26 * d7);
            double d27 = this.LJII;
            dCos = d25 + (dPow4 * (dSin + (d22 * d27 * Math.cos(d27 * d7))));
        }
        C21581519d7 c21581519d7 = this.LJIIIZ;
        c21581519d7.LIZ = (float) (dPow + this.LJIIIIZZ);
        c21581519d7.LIZIZ = (float) dCos;
        return c21581519d7;
    }
}
