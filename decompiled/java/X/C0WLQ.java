package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WLQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLQ {
    public static volatile Map<String, Double> LIZ = C2097608Jq.LJ();

    public static void LIZ(long j, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "dynamicRule");
        jSONObject.put("timing", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", j);
        LIZIZ("pns_hybrid_performance", jSONObject, jSONObject2);
    }

    public static void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        double dDoubleValue;
        Double d = LIZ.get(str);
        double dLIZJ = 0.01d;
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.01d;
        }
        if (!Double.isNaN(dDoubleValue)) {
            dLIZJ = C13LZ.LIZJ(dDoubleValue, 0.0d, 1.0d);
        }
        if (AbstractC19994813Le.Default.nextDouble() < dLIZJ) {
            C0VZK.LIZIZ().monitorEvent(str, jSONObject, jSONObject2, null);
        }
    }
}
