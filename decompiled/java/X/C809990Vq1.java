package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809990Vq1 {
    public static final C809990Vq1 LIZ = new C809990Vq1();

    public static void LIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        try {
            if (jSONObject.has("sdk_key_PushSDK")) {
                jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "sdk_key_PushSDK");
            } else {
                jSONObject2 = new JSONObject();
            }
            if (jSONObject2.has("un_duplicate_message_settings")) {
                jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "un_duplicate_message_settings");
            } else {
                jSONObject3 = new JSONObject();
            }
            jSONObject3.put("max_cache_time_in_hour", 72);
            jSONObject2.put("un_duplicate_message_settings", jSONObject3);
            jSONObject.put("sdk_key_PushSDK", jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C810890VrT.LIZIZ.LJII("exception_updateMaxCacheTime4LocalNotify", e);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMaxCacheTime4LocalNotify() - New Settings: ");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
