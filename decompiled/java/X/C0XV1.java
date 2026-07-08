package X;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XV1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XV1 {
    public static void LIZ(C0XU9 c0xu9, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            c0xu9.LIZ = jSONObject.optInt("error_code", c0xu9.LIZ);
        } else if (jSONObject.has("code")) {
            c0xu9.LIZ = jSONObject.optInt("code", c0xu9.LIZ);
        }
        c0xu9.LIZIZ = jSONObject.optString("description");
        if (c0xu9.LIZ == 1075) {
            jSONObject.optLong("apply_time");
            jSONObject.optString("avatar_url");
            jSONObject.optString("nick_name");
            jSONObject.optString("token");
            jSONObject.optLong("cancel_time");
        }
        if (c0xu9.LIZ == 2001) {
            c0xu9.LJ = jSONObject.optString("bind_prompt");
        }
    }

    public static void LIZJ(AbstractC849240XTe abstractC849240XTe, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            abstractC849240XTe.LIZ = jSONObject.optInt("error_code", abstractC849240XTe.LIZ);
        } else if (jSONObject.has("code")) {
            abstractC849240XTe.LIZ = jSONObject.optInt("code", abstractC849240XTe.LIZ);
        }
        abstractC849240XTe.LIZJ = jSONObject.optString("description");
        abstractC849240XTe.LIZLLL = jSONObject.optString("captcha");
        jSONObject.optString("alert_text");
        if (abstractC849240XTe.LIZ == 1001 && (abstractC849240XTe instanceof C850300XXg)) {
            jSONObject.optString("dialog_tips");
        }
        if (abstractC849240XTe.LIZ == 1057 && (abstractC849240XTe instanceof C850300XXg)) {
            jSONObject.optString("dialog_tips");
            ((C850300XXg) abstractC849240XTe).LJIIIIZZ = jSONObject.optString("next_url");
        }
        if (abstractC849240XTe.LIZ == 1057 && (abstractC849240XTe instanceof C0XV2)) {
            jSONObject.optString("dialog_tips");
            jSONObject.optString("next_url");
        }
        if (abstractC849240XTe.LIZ == 1075) {
            jSONObject.optLong("apply_time");
            jSONObject.optString("avatar_url");
            jSONObject.optString("nick_name");
            jSONObject.optString("token");
            jSONObject.optLong("cancel_time");
        }
    }

    public static C846070XGz LIZIZ(String str, String str2, String str3, String str4, String str5, Map map) {
        C846070XGz c846070XGz = new C846070XGz();
        if (!TextUtils.isEmpty(str)) {
            c846070XGz.LIZJ("platform", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c846070XGz.LIZJ("access_token", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            c846070XGz.LIZJ("expires_in", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            c846070XGz.LIZJ("code", str4);
        }
        if (!TextUtils.isEmpty(null)) {
            c846070XGz.LIZJ("profile_key", null);
        }
        if (!TextUtils.isEmpty(str5)) {
            c846070XGz.LIZJ("platform_app_id", str5);
        }
        if (map != null && !map.isEmpty()) {
            for (String str6 : map.keySet()) {
                if (!TextUtils.isEmpty(str6)) {
                    c846070XGz.LIZJ(str6, (String) map.get(str6));
                }
            }
        }
        return c846070XGz;
    }
}
