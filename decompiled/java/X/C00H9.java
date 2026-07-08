package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00H9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C00H9 {
    public final String LIZ;
    public final Map<String, String> LIZIZ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("active", 1);
            Map<String, String> map = this.LIZIZ;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Module: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" : ");
        sbLIZ.append(this.LIZIZ.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00H9(String str, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
