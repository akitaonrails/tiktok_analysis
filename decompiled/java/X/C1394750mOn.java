package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394750mOn {
    public static C1394760mOo LIZ(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
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
            String strOptString = jSONObject.optString("music_id");
            String strOptString2 = jSONObject.optString("resource_id");
            if (strOptString.length() != 0 && strOptString2.length() != 0) {
                c098200Yq = new C1394760mOo(strOptString, strOptString2, jSONObject.optString("dispatch_type"));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C1394760mOo) obj;
    }
}
