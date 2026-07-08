package X;

import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V1J {
    public static void LIZ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("crash_time", System.currentTimeMillis());
        jSONObject.put("is_main_process", C792400V6o.LJIIIZ());
        jSONObject.put("process_name", C792400V6o.LIZIZ());
        jSONObject.put("event_type", "battery_trace");
        jSONObject.put(Scene.SCENE_SERVICE, ActivityLifeObserver.getInstance().getTopActivityClassName());
    }
}
