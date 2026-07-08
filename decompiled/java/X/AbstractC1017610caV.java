package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0caV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1017610caV implements InterfaceC1017100cZg {
    public static boolean LIZIZ(Object obj) {
        Object c098200Yq;
        if (obj instanceof JSONObject) {
            return LIZJ(((JSONObject) obj).opt("translation_fields"));
        }
        if (obj instanceof Map) {
            try {
                c098200Yq = ((Map) obj).get("translation_fields");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            return LIZJ(c098200Yq);
        }
        return false;
    }

    public static boolean LIZJ(Object obj) {
        if (obj instanceof Collection) {
            if (((Collection) obj).isEmpty()) {
                return false;
            }
        } else if (obj instanceof Object[]) {
            if (((Object[]) obj).length == 0) {
                return false;
            }
        } else {
            if ((obj instanceof JSONArray) && ((JSONArray) obj).length() > 0) {
                return true;
            }
            return false;
        }
        return true;
    }
}
