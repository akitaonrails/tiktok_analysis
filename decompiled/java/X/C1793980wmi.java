package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1793980wmi {
    public void LIZJ(HashMap map, JSONObject jSONObject) {
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(String str, long j, JSONObject jSONObject) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
