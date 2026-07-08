package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.08LN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LN {
    public static final Pair<Double, Double> LIZ(double d, double d2) {
        double dPow;
        double d3;
        double d4 = ((((d / 1.7d) - 0.0d) / 20.0d) * 0.8d) + 0.0d;
        double d5 = 0.5d + ((((d2 / 1.7d) - 0.0d) / 20.0d) * 199.5d);
        if (d5 <= 18.0d) {
            dPow = ((Math.pow(d5, 3) * 7.0E-4d) - (Math.pow(d5, 2) * 0.031d)) + (0.64d * d5);
            d3 = 1.28d;
        } else if (d5 > 18.0d && d5 <= 44.0d) {
            dPow = ((Math.pow(d5, 3) * 4.4E-5d) - (Math.pow(d5, 2) * 0.006d)) + (0.36d * d5);
            d3 = 2.0d;
        } else if (d5 > 44.0d) {
            dPow = ((Math.pow(d5, 3) * 4.5E-7d) - (Math.pow(d5, 2) * 3.32E-4d)) + (0.1078d * d5);
            d3 = 5.84d;
        } else {
            throw new IllegalArgumentException("Invalid stiffness value");
        }
        double d6 = (((double) 2) * d4) - (d4 * d4);
        return new Pair<>(Double.valueOf((((d5 - 30.0d) / 50.0d) * 181.0d) + 194.0d), Double.valueOf((((((0.01d * d6) + ((1.0d - d6) * (dPow + d3))) - 8.0d) / 2.0d) * 6.0d) + 25.0d));
    }
}
