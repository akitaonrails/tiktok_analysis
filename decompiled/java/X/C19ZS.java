package X;

/* JADX INFO: renamed from: X.19ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19ZS {
    public static C19ZS LIZLLL;
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;

    public final void LIZ(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin(2.0f * r7) * 3.4906598739326E-4d) + (Math.sin(r7 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r6 - 9.0E-4f)) - r2) + 9.0E-4f)) + ((-d2) / 360.0d) + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(dAsin))) / (Math.cos(d4) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.LIZJ = 1;
            this.LIZ = -1L;
            this.LIZIZ = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.LIZJ = 0;
                this.LIZ = -1L;
                this.LIZIZ = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.LIZ = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.LIZIZ = jRound;
            if (jRound < j && this.LIZ > j) {
                this.LIZJ = 0;
            } else {
                this.LIZJ = 1;
            }
        }
    }
}
