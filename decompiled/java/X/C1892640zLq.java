package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892640zLq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, C1185050gwZ c1185050gwZ) throws JSONException {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        jSONObject.put("room_id", str2);
        jSONObject.put("anchor_id", str3);
        jSONObject.put("live_status", str5);
        jSONObject.put("current_page", str6);
        jSONObject.put("author_type", str4);
        jSONObject.put("ttls_room_id", str2);
        jSONObject.put("ttls_anchor_id", str3);
        jSONObject.put("is_local_service_live", "1");
        c1185040gwY.getClass();
        C1185040gwY.LIZJ(str, jSONObject, c1185050gwZ);
    }
}
