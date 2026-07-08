package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1907607da {
    public static final Integer LIZ(String str, JSONObject jSONObject) {
        Object obj;
        Object c098200Yq;
        Object obj2 = null;
        if (jSONObject == null) {
            obj = null;
        } else {
            try {
                obj = jSONObject.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (obj instanceof Integer) {
            c098200Yq = (Integer) obj;
        } else {
            c098200Yq = null;
        }
        C189200o6.m2constructorimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (Integer) obj2;
    }

    public static final String LIZIZ(String str, JSONObject jSONObject) {
        Object obj;
        Object c098200Yq;
        Object obj2 = null;
        if (jSONObject == null) {
            obj = null;
        } else {
            try {
                obj = jSONObject.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (obj instanceof String) {
            c098200Yq = (String) obj;
        } else {
            c098200Yq = null;
        }
        C189200o6.m2constructorimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (String) obj2;
    }
}
