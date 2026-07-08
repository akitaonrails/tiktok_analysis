package X;

import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801630VcX {
    public static void LIZ(File file) {
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> mapLIZJ = c802790VeP.LIZJ();
        if (mapLIZJ != null) {
            try {
                for (String str : mapLIZJ.keySet()) {
                    if (mapLIZJ.get(str) != null) {
                        jSONObject.put(str, mapLIZJ.get(str));
                    }
                }
                if (mapLIZJ.containsKey("version_name")) {
                    jSONObject.put("crash_version_name", mapLIZJ.get("version_name"));
                }
                if (mapLIZJ.containsKey("update_version_code")) {
                    jSONObject.put("crash_update_version_code", mapLIZJ.get("update_version_code"));
                }
                if (mapLIZJ.containsKey("version_code")) {
                    jSONObject.put("crash_version_code", mapLIZJ.get("version_code"));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (jSONObject.length() > 0) {
            C2112008Pe.LJII(new C0VSJ(file, "common_params.json"), C786410Ut5.J3(jSONObject));
        }
    }
}
