package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672920QaQ {
    public static final void LIZ(String str, Map<String, ? extends Object> map) {
        Object obj;
        Object obj2;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "prefetch");
            jSONObject.put("step", str);
            Object obj3 = null;
            if (map == null) {
                obj = null;
            } else {
                obj = map.get("entrance_form");
            }
            jSONObject.put("entrance_form", obj);
            if (map != null) {
                obj3 = map.get("enter_from_info");
            }
            jSONObject.put("enter_from_info", obj3);
            if (map != null) {
                Object obj4 = map.get("click_product_start_time");
                if (obj4 != null && (obj4 instanceof Long)) {
                    ((Number) obj4).longValue();
                    jSONObject.put("click_duration", SystemClock.elapsedRealtime() - ((Number) obj4).longValue());
                }
                if (map != null && (obj2 = map.get("click_scene_start_time")) != null && (obj2 instanceof Long)) {
                    ((Number) obj2).longValue();
                    jSONObject.put("total_duration", SystemClock.elapsedRealtime() - ((Number) obj2).longValue());
                }
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_prefetch_trace", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
    }
}
