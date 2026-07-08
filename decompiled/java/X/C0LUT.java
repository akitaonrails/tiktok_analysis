package X;

import com.bytedance.scene.Scene;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LUT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LUT {
    public abstract C0LUU LIZ();

    public abstract C0LUV LIZIZ();

    public JSONObject LIZJ() throws JSONException {
        JSONObject jSONObjectLIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("unique_task_id", LIZ().LIZ);
        jSONObject.put("trace_id", LIZ().LIZIZ);
        jSONObject.put("business", LIZ().LIZJ);
        jSONObject.put(Scene.SCENE_SERVICE, LIZ().LIZLLL);
        jSONObject.put("task_type", LIZ().LJ);
        jSONObject.put("is_retry", LIZ().LJIIIZ);
        String str = LIZ().LJI;
        if (str != null) {
            jSONObject.put("did", str);
        }
        String str2 = LIZ().LJII;
        if (str2 != null) {
            jSONObject.put("uid", str2);
        }
        String str3 = LIZ().LJIIIIZZ;
        if (str3 != null) {
            jSONObject.put("creation_id", str3);
        }
        C0LUV c0luvLIZIZ = LIZIZ();
        if (c0luvLIZIZ != null && (jSONObjectLIZ = c0luvLIZIZ.LIZ()) != null) {
            Iterator<String> itKeys = jSONObjectLIZ.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectLIZ.get(next));
            }
        }
        return jSONObject;
    }
}
