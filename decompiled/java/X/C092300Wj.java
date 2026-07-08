package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00Wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C092300Wj {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LIZ(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            itKeys.remove();
            map.put(next, strOptString);
        }
        return map;
    }
}
