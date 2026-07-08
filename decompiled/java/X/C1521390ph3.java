package X;

import com.bytedance.scene.Scene;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ph3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521390ph3 {
    public static final JSONObject LIZ(C1521480phC c1521480phC) {
        JSONObject jSONObject = new JSONObject();
        C1520640pfq.LJIILIIL("event_type", "jsbPerf", jSONObject);
        C1520640pfq.LJIILIIL("bridge_name", c1521480phC.LIZ, jSONObject);
        C1520640pfq.LJIIJJI(c1521480phC.LIZIZ, "status_code", jSONObject);
        C1520640pfq.LJIILIIL("status_description", c1521480phC.LIZJ, jSONObject);
        C1520640pfq.LJIILIIL("protocol_version", null, jSONObject);
        C1520640pfq.LJIIL("cost_time", c1521480phC.LIZLLL, jSONObject);
        C1520640pfq.LJIIL("invoke_ts", c1521480phC.LJ, jSONObject);
        C1520640pfq.LJIIL("callback_ts", c1521480phC.LJFF, jSONObject);
        C1520640pfq.LJIIL("fireEvent_ts", 0L, jSONObject);
        return jSONObject;
    }

    public static final JSONObject LIZIZ(C1521520phG c1521520phG) {
        JSONObject jSONObject = new JSONObject();
        C1520640pfq.LJIILIIL("event_type", "jsbError", jSONObject);
        C1520640pfq.LJIILIIL("bridge_name", c1521520phG.LIZJ, jSONObject);
        C1520640pfq.LJIILIIL("error_activity", null, jSONObject);
        C1520640pfq.LJIIJJI(c1521520phG.LIZ, "error_code", jSONObject);
        C1520640pfq.LJIILIIL("error_message", c1521520phG.LIZIZ, jSONObject);
        C1520640pfq.LJIILIIL("js_type", null, jSONObject);
        C1520640pfq.LJIILIIL("error_url", c1521520phG.LIZLLL, jSONObject);
        C1520640pfq.LJIIJJI(0, "is_sync", jSONObject);
        return jSONObject;
    }

    public static final JSONObject LIZJ(String str, String str2, Integer num, Integer num2, Boolean bool) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        C1520640pfq.LJIILIIL("event_type", "nativeError", jSONObject);
        if (num != null) {
            num.intValue();
            C1520640pfq.LJIIJJI(num.intValue(), "error_code", jSONObject);
        }
        if (str2 != null) {
            C1520640pfq.LJIILIIL("error_msg", str2, jSONObject);
        }
        if (bool == null) {
            C1520640pfq.LJIILIIL(Scene.SCENE_SERVICE, "web_process_terminate", jSONObject);
        } else {
            if (bool.booleanValue()) {
                str3 = "main_frame";
            } else {
                str3 = "child_resource";
            }
            C1520640pfq.LJIILIIL(Scene.SCENE_SERVICE, str3, jSONObject);
        }
        if (str != null) {
            C1520640pfq.LJIILIIL("error_url", str, jSONObject);
        }
        if (num2 != null) {
            num2.intValue();
            C1520640pfq.LJIIJJI(num2.intValue(), "http_status", jSONObject);
        }
        return jSONObject;
    }
}
