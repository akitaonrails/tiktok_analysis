package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051Y {
    public static final Map<String, Object> LIZ(Object obj) {
        Object c098200Yq;
        Object obj2 = null;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            c098200Yq = C12846050y.LIZLLL(new JSONObject((String) obj));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (Map) obj2;
    }

    public static final Integer LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return C2095008Iq.LJIIJJI((String) obj);
    }
}
