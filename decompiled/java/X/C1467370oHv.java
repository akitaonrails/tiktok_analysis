package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467370oHv {
    public int LIZ;
    public long LIZIZ;
    public long LIZJ;

    public static JSONObject LIZ(C1467370oHv c1467370oHv) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, (Object) null);
            jSONObject.put("stage", c1467370oHv.LIZ);
            jSONObject.put("start", c1467370oHv.LIZIZ);
            jSONObject.put("end", c1467370oHv.LIZJ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
