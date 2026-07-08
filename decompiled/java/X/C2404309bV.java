package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09bV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2404309bV {
    public static void LIZIZ() {
        C792400V6o.LJIIIIZZ();
    }

    public static JSONObject LIZ(boolean z, int i, Exception exc, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("success", z);
            jSONObject.put("code", i);
            if (exc != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(exc.getMessage());
                sbLIZ.append(C0V2X.LIZ(exc));
                jSONObject.put("exception", C2188811AlT.LIZIZ(sbLIZ));
                jSONObject.put("exception_object", exc);
                return jSONObject;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }
}
