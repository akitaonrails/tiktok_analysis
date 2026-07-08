package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0glz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178490glz implements Serializable {
    public final double latitude;
    public final double longitude;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1178490glz)) {
            return false;
        }
        C1178490glz c1178490glz = (C1178490glz) obj;
        return Double.compare(this.latitude, c1178490glz.latitude) == 0 && Double.compare(this.longitude, c1178490glz.longitude) == 0;
    }

    public int hashCode() {
        return (C786410Ut5.X2(this.latitude) * 31) + C786410Ut5.X2(this.longitude);
    }

    public C1178490glz() {
        this(0.0d, 0.0d);
    }

    public C1178490glz(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }
}
