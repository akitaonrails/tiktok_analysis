package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1U, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V1U {
    public final Map<String, C0V1V> LIZ = new HashMap();

    public static List<C0V1V> LIZ(int i, String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (i != 0) {
                if (i == 1) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!next.equals("bdwk_create")) {
                            arrayList.add(new C0V1V(next, jSONObject.optString(next)));
                        }
                    }
                }
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bdwk_create");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        arrayList.add(new C0V1V(next2, jSONObjectOptJSONObject.optString(next2)));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C786950Utx.LIZ("AddressParam");
        }
        return arrayList;
    }
}
