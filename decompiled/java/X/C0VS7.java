package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VS7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VS7 {
    public static boolean LIZ(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C2209791BeD.LJIJJ().LJIIZILJ(Collections.singletonList("JsonUtils"), "Merge json interrupted.", e, new Object[0]);
                return;
            }
        }
    }
}
