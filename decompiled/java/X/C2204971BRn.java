package X;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: renamed from: X.1BRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204971BRn {
    public double LIZ = Double.POSITIVE_INFINITY;
    public double LIZIZ = Double.NEGATIVE_INFINITY;
    public double LIZJ = Double.NaN;
    public double LIZLLL = Double.NaN;

    public final LatLngBounds LIZ() {
        C0W3J.LJIIJ("no included points", !Double.isNaN(this.LIZJ));
        return new LatLngBounds(new LatLng(this.LIZ, this.LIZJ), new LatLng(this.LIZIZ, this.LIZLLL));
    }
}
