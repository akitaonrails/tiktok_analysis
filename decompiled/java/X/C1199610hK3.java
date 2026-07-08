package X;

import com.ss.android.ugc.aweme.poi.PoiMobParam;
import java.util.Map;

/* JADX INFO: renamed from: X.0hK3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199610hK3 {
    public static final void LIZ(Map<String, String> map, PoiMobParam poiMobParam) {
        String str;
        String str2;
        Map<String, String> map2;
        String str3 = null;
        if (poiMobParam != null) {
            str = poiMobParam.creationId;
        } else {
            str = null;
        }
        C1189060h32.LJIJI(map, "creation_id", str);
        if (poiMobParam != null) {
            str2 = poiMobParam.contentType;
        } else {
            str2 = null;
        }
        C1189060h32.LJIJI(map, "content_type", str2);
        if (poiMobParam != null) {
            str3 = poiMobParam.shootWay;
        }
        C1189060h32.LJIJI(map, "shoot_way", str3);
        if (poiMobParam != null && (map2 = poiMobParam.creationExtraData) != null) {
            map.putAll(map2);
        }
    }
}
