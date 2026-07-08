package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892630zLp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map map, JSONObject jSONObject, C1185050gwZ c1185050gwZ) {
        String string;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        jSONObject.put("room_id", str2);
        jSONObject.put("anchor_id", str3);
        jSONObject.put("current_page", "live_room_page");
        jSONObject.put("initial_poi_enter_from", str4);
        jSONObject.put("initial_poi_enter_method", str5);
        jSONObject.put("ttls_live_action_type", str12);
        jSONObject.put("request_id", str6);
        C1189060h32.LJJI("search_id", str7, jSONObject);
        C1189060h32.LJJI("search_result_id", str8, jSONObject);
        C1189060h32.LJJI("search_keyword", str9, jSONObject);
        C1189060h32.LJJI("search_type", str10, jSONObject);
        C1189060h32.LJJI("search_token_type", str11, jSONObject);
        C1189060h32.LJJI("ttls_live_from_group_id", str13, jSONObject);
        C1189060h32.LJJI("is_live_ad", str14, jSONObject);
        jSONObject.put("is_wand", str15);
        jSONObject.put("ttls_room_id", str2);
        jSONObject.put("ttls_anchor_id", str3);
        jSONObject.put("is_local_service_live", "1");
        for (Map.Entry entry : map.entrySet()) {
            String str16 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                string = value.toString();
            } else {
                string = null;
            }
            C1189060h32.LJJI(str16, string, jSONObject);
        }
        c1185040gwY.getClass();
        C1185040gwY.LIZJ(str, jSONObject, c1185050gwZ);
    }
}
