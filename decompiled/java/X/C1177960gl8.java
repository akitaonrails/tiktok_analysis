package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0gl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177960gl8 implements Serializable {
    public final double lat;
    public final double lon;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1177960gl8)) {
            return false;
        }
        C1177960gl8 c1177960gl8 = (C1177960gl8) obj;
        return Double.compare(this.lat, c1177960gl8.lat) == 0 && Double.compare(this.lon, c1177960gl8.lon) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LatLon(lat=");
        sbLIZ.append(this.lat);
        sbLIZ.append(", lon=");
        sbLIZ.append(this.lon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1177960gl8(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }
}
