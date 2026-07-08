package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0gxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185500gxI {
    public static Map LIZ(PoiListApi.PoiDetailResponse poiDetailResponse, C1185410gx9 c1185410gx9, Map map) {
        String string;
        String string2;
        PoiLocation poiLocation;
        String str;
        PoiLocation poiLocation2;
        Double d;
        PoiLocation poiLocation3;
        Double d2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1386820mC0.LIZ(c2344009Gk);
        linkedHashMap.putAll(c2344009Gk.LIZ);
        String anchorInteractMethod = null;
        if (poiDetailResponse != null && (poiLocation3 = poiDetailResponse.getPoiLocation()) != null && (d2 = poiLocation3.lng) != null) {
            string = d2.toString();
        } else {
            string = null;
        }
        String str2 = "";
        if (string == null) {
            string = "";
        }
        linkedHashMap.put("poi_longitude_wgs84", string);
        if (poiDetailResponse == null || (poiLocation2 = poiDetailResponse.getPoiLocation()) == null || (d = poiLocation2.lat) == null || (string2 = d.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("poi_latitude_wgs84", string2);
        if (poiDetailResponse != null && (poiLocation = poiDetailResponse.getPoiLocation()) != null && (str = poiLocation.geohash) != null) {
            str2 = str;
        }
        linkedHashMap.put("poi_geohash_wgs84", str2);
        if (c1185410gx9 != null) {
            anchorInteractMethod = c1185410gx9.getAnchorInteractMethod();
        }
        C1189060h32.LJJ("anchor_interact_method", anchorInteractMethod, linkedHashMap);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        return linkedHashMap;
    }
}
