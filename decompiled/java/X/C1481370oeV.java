package X;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481370oeV {
    public static JSONObject LIZ(C1481340oeS c1481340oeS) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        HashMap<String, Object> map = c1481340oeS.LJIIZILJ;
        if (map == null) {
            return jSONObject;
        }
        if (map.keySet().contains("extra_play_info")) {
            JSONObject jSONObjectOptJSONObject = ((JSONObject) c1481340oeS.LJIIZILJ.get("extra_play_info")).optJSONObject("ffr_state_obj");
            if (jSONObjectOptJSONObject != null) {
                jSONObject.put("100", jSONObjectOptJSONObject.optLong("feed_request_play", 0L));
                jSONObject.put("199", jSONObjectOptJSONObject.optLong("simkit_playermanger_start_ses", 0L));
                jSONObject.put("200", jSONObjectOptJSONObject.optLong("simkit_simplifypayer_prepare", 0L));
                jSONObject.put("210", jSONObjectOptJSONObject.optLong("ttmp_prepare", 0L));
                jSONObject.put("310", jSONObjectOptJSONObject.optLong("ttmp_on_prepare", 0L));
            }
            c1481340oeS.LJIIZILJ.remove("extra_play_info");
        }
        jSONObject.put("320", c1481340oeS.LJJIIJ);
        jSONObject.put("330", c1481340oeS.LJJIJIIJIL);
        jSONObject.put("340", c1481340oeS.LJJIJIIJI);
        jSONObject.put("350", c1481340oeS.LJJIIZI);
        jSONObject.put("360", c1481340oeS.LJJIJ);
        jSONObject.put("370", c1481340oeS.LJJIIJZLJL);
        jSONObject.put("380", c1481340oeS.LJJIIZ);
        return jSONObject;
    }
}
