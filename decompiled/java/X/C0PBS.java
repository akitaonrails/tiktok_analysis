package X;

import com.bytedance.scene.Scene;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PBS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PBS {
    public static final C0PBS LIZ = new C0PBS();
    public static volatile C0P7V LIZIZ;

    public static void LIZ(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", str);
        jSONObject.put(Scene.SCENE_SERVICE, "general search");
        jSONObject.put("reason", str2);
        C20684815ws.LJIJ("rd_tiktokec_shop_tab_search_bubble", jSONObject);
    }
}
