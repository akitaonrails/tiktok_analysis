package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849070yDZ {
    public static C1849050yDX LIZ(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            c098200Yq = new C1849050yDX(jSONObject.optInt("version", 2), jSONObject.optString("lastBackend"), jSONObject.optString("lastSuccessDirection"), C1849080yDa.LIZ(jSONObject.optJSONObject("sourceSnapshot")), C1849080yDa.LIZ(jSONObject.optJSONObject("targetSnapshot")), jSONObject.optLong("updatedAt"), jSONObject.optString("lastResult"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C1849050yDX) obj;
    }
}
