package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ncl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597930Ncl {
    public static final String LIZ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("response", str2);
            jSONObject.put("log_id", str);
            jSONObject.put("page_source_info", C08JS.LIZLLL(C1766860w4y.LJ(C1766860w4y.LIZ, null, 3)));
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "{}";
        }
    }
}
