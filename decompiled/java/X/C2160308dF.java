package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08dF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2160308dF {
    public static JSONObject LIZ() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Runtime.getRuntime().totalMemory() / 1024) / 1024);
            sbLIZ.append("MB");
            jSONObject.put("used_memory", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((Runtime.getRuntime().maxMemory() / 1024) / 1024);
            sbLIZ2.append("MB");
            jSONObject.put("total_memory", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(C2160208dE.LIZIZ()[0]);
            sbLIZ3.append("MB");
            jSONObject.put("sd_all_size", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(C2160208dE.LIZIZ()[1]);
            sbLIZ4.append("MB");
            jSONObject.put("sd_avail_size", C2188811AlT.LIZIZ(sbLIZ4));
            String strLIZIZ = "";
            for (String str : C2160208dE.LIZ()) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append(str);
                sbLIZ5.append("  ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            }
            jSONObject.put("cpu_info", strLIZIZ);
            jSONObject.put("kernel_version", C2160208dE.LIZJ()[0]);
            jSONObject.put("firmware_version", C2160208dE.LIZJ()[1]);
            jSONObject.put("model", C2160208dE.LIZJ()[2]);
            jSONObject.put("system_version", C2160208dE.LIZJ()[3]);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
