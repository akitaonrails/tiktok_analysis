package X;

/* JADX INFO: renamed from: X.0typ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686170typ {
    public float LIZ = 1.0f;
    public double LIZIZ = Math.sqrt(50.0d);
    public float LIZJ = 1.0f;

    public final long LIZ(float f, float f2, long j) {
        double dExp;
        double dExp2;
        float f3 = f - this.LIZ;
        double d = j / 1000.0d;
        float f4 = this.LIZJ;
        double d2 = ((double) f4) * ((double) f4);
        double d3 = this.LIZIZ;
        double d4 = ((double) (-f4)) * d3;
        if (f4 > 1.0f) {
            double dSqrt = d3 * Math.sqrt(d2 - ((double) 1));
            double d5 = d4 + dSqrt;
            double d6 = d4 - dSqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - ((double) f2)) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            dExp = (Math.exp(d10) * d9) + (Math.exp(d11) * d8);
            dExp2 = (d9 * d6 * Math.exp(d10)) + (d8 * d5 * Math.exp(d11));
        } else if (f4 == 1.0f) {
            double d12 = f3;
            double d13 = ((double) f2) + (d3 * d12);
            double d14 = (-d3) * d;
            double d15 = d12 + (d * d13);
            dExp = d15 * Math.exp(d14);
            dExp2 = (d15 * Math.exp(d14) * (-this.LIZIZ)) + (d13 * Math.exp(d14));
        } else {
            double d16 = 1;
            double dSqrt2 = d3 * Math.sqrt(d16 - d2);
            double d17 = f3;
            double d18 = (d16 / dSqrt2) * (((-d4) * d17) + ((double) f2));
            double d19 = dSqrt2 * d;
            double d20 = d * d4;
            dExp = Math.exp(d20) * ((Math.cos(d19) * d17) + (Math.sin(d19) * d18));
            dExp2 = (d4 * dExp) + (Math.exp(d20) * (((-dSqrt2) * d17 * Math.sin(d19)) + (dSqrt2 * d18 * Math.cos(d19))));
        }
        return (((long) Float.floatToRawIntBits((float) dExp2)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp + ((double) this.LIZ))) << 32);
    }
}
