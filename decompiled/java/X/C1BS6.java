package X;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: renamed from: X.1BS6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BS6 {
    public final double LIZ;

    public C1BS6(double d) {
        this.LIZ = d;
    }

    public final LatLng LIZ(C1BS7 c1bs7) {
        double d = c1bs7.LIZ;
        double d2 = this.LIZ;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (c1bs7.LIZIZ / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BSB] */
    public final C1BSB LIZIZ(LatLng latLng) {
        double d = (latLng.longitude / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.latitude));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d2 = this.LIZ;
        final double d3 = d * d2;
        final double d4 = dLog * d2;
        return new C1BS7(d3, d4) { // from class: X.1BSB
        };
    }
}
