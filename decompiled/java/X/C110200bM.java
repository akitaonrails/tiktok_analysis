package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00bM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C110200bM {
    public static final C110200bM LIZ = new C110200bM();

    public static final void LIZ(String str, String str2, Map<String, ? extends Object> map) {
        LIZ.getClass();
        LIZIZ(str, "fail", str2, map);
    }

    public static void LIZIZ(String str, String str2, String str3, Map map) {
        Unit unit;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("stage", str);
            jSONObject.put("result", str2);
            jSONObject.put("fail_reason", str3);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    jSONObject.put(str4, value);
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("share_to_story_stream_publish", jSONObject);
    }
}
