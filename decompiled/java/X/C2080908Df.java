package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2080908Df {
    public static final /* synthetic */ C2080908Df LIZ = new C2080908Df();

    public static final String LIZ(C0X52<?> c0x52) {
        Object c098200Yq;
        JSONObject jSONObject;
        try {
            Object obj = new JSONObject(C2080708Dd.LIZ(c0x52.LIZ.LJ)).get("response");
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else if (obj instanceof String) {
                jSONObject = new JSONObject((String) obj);
            } else {
                jSONObject = new JSONObject();
            }
            c098200Yq = jSONObject.optString("error_code");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }
}
