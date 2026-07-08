package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0giu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176580giu implements Serializable {
    public final C1177960gl8 northeast;
    public final C1177960gl8 southwest;

    public final C1177960gl8 center() {
        C1177960gl8 c1177960gl8 = this.southwest;
        double d = c1177960gl8.lat;
        C1177960gl8 c1177960gl82 = this.northeast;
        double d2 = (d + c1177960gl82.lat) / 2.0d;
        double d3 = c1177960gl8.lon;
        double d4 = c1177960gl82.lon;
        double d5 = d3 <= d4 ? (d3 + d4) / 2.0d : ((d4 + 360.0d) + d3) / 2.0d;
        double d6 = 180;
        return new C1177960gl8(d2, ((d5 + d6) % ((double) 360)) - d6);
    }

    public final boolean contains(C1177960gl8 c1177960gl8) {
        C1177960gl8 c1177960gl82 = this.southwest;
        double d = c1177960gl82.lat;
        C1177960gl8 c1177960gl83 = this.northeast;
        double d2 = c1177960gl83.lat;
        double d3 = c1177960gl8.lat;
        if (d <= d3 && d3 <= d2) {
            double d4 = c1177960gl82.lon;
            double d5 = c1177960gl83.lon;
            double d6 = c1177960gl8.lon;
            if (d4 <= d6 && d6 <= d5) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1176580giu(C1177960gl8 c1177960gl8, C1177960gl8 c1177960gl82) {
        this.southwest = c1177960gl8;
        this.northeast = c1177960gl82;
    }

    public final boolean contains(double d, double d2) {
        C1177960gl8 c1177960gl8 = this.southwest;
        double d3 = c1177960gl8.lat;
        C1177960gl8 c1177960gl82 = this.northeast;
        if (d <= c1177960gl82.lat && d3 <= d) {
            double d4 = c1177960gl8.lon;
            if (d2 <= c1177960gl82.lon && d4 <= d2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean contains(double d, double d2, float f, int i) {
        double radians = Math.toRadians(center().lat);
        double dCos = ((double) i) * ((Math.cos(radians) * 156543.03392d) / ((double) (1 << ((int) f))));
        double d3 = dCos / 111319.0d;
        double dCos2 = dCos / (Math.cos(radians) * 111319.0d);
        C1177960gl8 c1177960gl8 = this.southwest;
        double d4 = c1177960gl8.lat - d3;
        C1177960gl8 c1177960gl82 = this.northeast;
        double d5 = c1177960gl82.lat + d3;
        double d6 = c1177960gl8.lon - dCos2;
        double d7 = c1177960gl82.lon + dCos2;
        if (d4 <= d && d <= d5 && d6 <= d2 && d2 <= d7) {
            return true;
        }
        return false;
    }
}
