package X;

import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641000PCg {
    public static final C641000PCg LIZ = new C641000PCg();

    public static void LIZ(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "search_after_search");
        jSONObject.put("stage", str);
        jSONObject.put("sub_stage", str2);
        jSONObject.put("reason", "");
        C20684815ws.LJIJ("rd_tiktokec_shop_tab_search_bubble", jSONObject);
    }
}
