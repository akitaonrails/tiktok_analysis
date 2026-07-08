package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887430zDR {
    public static final JSONObject LIZ(int i, String str, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("lynx_data", str);
        jSONObject2.put("module_position", i - 1);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject2.put("live_center_structure_opt", C500260Jjc.LJJJI(Boolean.valueOf(LiveCenterStructureOpt.INSTANCE.isEnable())) ? 1 : 0);
        jSONObject.put("initial_data", jSONObject2);
        return jSONObject;
    }
}
