package X;

/* JADX INFO: renamed from: X.0git, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176570git {
    public static final double LIZJ(double d, double d2) {
        double d3 = d - d2;
        while (d3 > 180.0d) {
            double d4 = 360;
            d -= d4;
            d3 -= d4;
        }
        while (d3 < -180.0d) {
            double d5 = 360;
            d += d5;
            d3 += d5;
        }
        return d;
    }

    public static final double LIZ(double d) {
        return Math.log(Math.tan((Math.toRadians(C13LZ.LIZJ(d, -85.05112878d, 85.05112878d)) / ((double) 2)) + 0.7853981633974483d)) * 6378137.0d;
    }

    public static final C1176560gis LIZIZ(C1176580giu c1176580giu, double d) {
        double dLIZJ = LIZJ(c1176580giu.southwest.lon, d);
        double dLIZJ2 = LIZJ(c1176580giu.northeast.lon, d);
        if (dLIZJ2 < dLIZJ - 1.0E-12d) {
            dLIZJ2 += 360.0d;
        }
        return new C1176560gis(Math.toRadians(dLIZJ) * 6378137.0d, LIZ(c1176580giu.southwest.lat), Math.toRadians(dLIZJ2) * 6378137.0d, LIZ(c1176580giu.northeast.lat));
    }
}
