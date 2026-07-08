package X;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: renamed from: X.1BU2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BU2 {
    public final C2205271BSr LIZ;
    public LatLng LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C1BU2(C2205271BSr c2205271BSr) {
        this.LIZ = c2205271BSr;
        this.LIZIZ = c2205271BSr.LIZ();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1BU2) {
            return this.LIZ.equals(((C1BU2) obj).LIZ);
        }
        return false;
    }
}
