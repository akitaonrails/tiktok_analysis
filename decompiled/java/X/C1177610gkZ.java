package X;

import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;

/* JADX INFO: renamed from: X.0gkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177610gkZ {
    public static final C1177960gl8 LIZ(PoiLocation poiLocation) {
        Double d = poiLocation.lat;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d2 = poiLocation.lng;
            if (d2 != null) {
                return new C1177960gl8(dDoubleValue, d2.doubleValue());
            }
        }
        return null;
    }
}
