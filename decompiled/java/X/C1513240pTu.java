package X;

import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513240pTu {
    public static final C1513240pTu LIZ = new C1513240pTu();
    public static boolean LIZIZ = false;
    public static float LIZJ;
    public static C1513250pTv LIZLLL;

    public static void LIZ(float f, int i, int i2, long j) throws JSONException {
        C1513250pTv c1513250pTv;
        C1513250pTv c1513250pTv2;
        if (!LIZIZ || (c1513250pTv = LIZLLL) == null) {
            return;
        }
        c1513250pTv.LJ = i;
        c1513250pTv.LJIIIIZZ = j;
        c1513250pTv.LJI = i2;
        c1513250pTv.LJII = f;
        if (AbstractC19994813Le.Default.nextFloat() < LIZJ && (c1513250pTv2 = LIZLLL) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "ohr_android");
            jSONObject.put("duration", c1513250pTv2.LJIIIIZZ - c1513250pTv2.LIZ);
            jSONObject.put("data_cost", c1513250pTv2.LIZIZ);
            jSONObject.put("pre_cost", c1513250pTv2.LIZJ);
            jSONObject.put("infer_cost", c1513250pTv2.LIZLLL);
            jSONObject.put("success", c1513250pTv2.LJ);
            jSONObject.put("sdk_success", c1513250pTv2.LJFF);
            jSONObject.put("s_result", String.valueOf(c1513250pTv2.LJI));
            jSONObject.put("f_result", Float.valueOf(c1513250pTv2.LJII));
            C20684815ws.LJIJ("ml_scene_run", jSONObject);
        }
        LIZLLL = null;
    }
}
