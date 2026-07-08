package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class C2080208Cy {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, HashMap map) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c2344009Gk.LJFF(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
