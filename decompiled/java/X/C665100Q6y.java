package X;

import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665100Q6y {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "shoptab_bubble");
        jSONObject.put("step", str);
        if (str2 != null) {
            jSONObject.put("reason", str2);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_shoptab_bubble", jSONObject);
    }

    public static void LIZ(String str, String str2, String str3, Function1 function1) throws JSONException {
        int i;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bubble_position", "outmall_search_shoptab");
        jSONObject.put("bubble_type", "guide");
        jSONObject.put("bubble_text_type", "outmall_search");
        int i2 = 0;
        if (str2 != null) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("is_bubble_text_show", i);
        jSONObject.put("bubble_text", str2);
        if (str3 != null) {
            i2 = 1;
        }
        jSONObject.put("is_bubble_pic_show", i2);
        jSONObject.put("is_bubble_clickable", 1);
        C644560PPy.LIZ.getClass();
        jSONObject.put("tab_index", C644560PPy.LJIIZILJ());
        function1.invoke(jSONObject);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }
}
