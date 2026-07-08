package X;

import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676320Qfu {
    public static C676310Qft LIZ;

    public static void LIZIZ() throws JSONException {
        C676310Qft c676310Qft = LIZ;
        if (c676310Qft == null || c676310Qft.LIZ) {
            return;
        }
        c676310Qft.LIZ = true;
        if (c676310Qft.LIZIZ == -1 && c676310Qft.LIZ) {
            return;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("end_to_end_cost", c676310Qft.LJII - c676310Qft.LIZIZ);
        jSONObject.put("route_cost", c676310Qft.LIZJ - c676310Qft.LIZIZ);
        jSONObject.put("init_cost", c676310Qft.LJI - c676310Qft.LIZJ);
        jSONObject.put("mix_init_cost", c676310Qft.LJI - c676310Qft.LIZLLL);
        jSONObject.put("image_fetch_cost", c676310Qft.LJFF - c676310Qft.LJ);
        jSONObject.put("mix_refresh_time", c676310Qft.LJII - c676310Qft.LJI);
        c676310Qft.LIZ(jSONObject);
        jSONObject.put(Scene.SCENE_SERVICE, "performance");
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_photo_search_trace", jSONObject);
    }

    public static void LIZ(String str) {
        C676310Qft c676310Qft = LIZ;
        if (c676310Qft != null) {
            c676310Qft.LIZ = true;
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            c676310Qft.LIZ(jSONObject);
            jSONObject.put(Scene.SCENE_SERVICE, "first_print_error");
            jSONObject.put("reason", str);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_photo_search_trace", jSONObject);
        }
    }

    public static void LIZJ(Function1 function1) {
        C676310Qft c676310Qft = LIZ;
        if (c676310Qft != null && !c676310Qft.LIZ && c676310Qft.LIZIZ != -1 && function1 != null) {
            function1.invoke(c676310Qft);
        }
    }
}
