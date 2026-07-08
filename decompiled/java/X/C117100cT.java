package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C117100cT {
    public static Map<String, String> LIZJ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return map;
    }

    public static void LIZ(String str, long j, JSONObject jSONObject) {
        try {
            jSONObject.put(str, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
