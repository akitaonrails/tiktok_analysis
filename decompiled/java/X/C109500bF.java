package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00bF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C109500bF {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(String str, Map map) {
        String str2 = (String) map.get("personal_context_info");
        if (str2 == null) {
            return new Pair(map, str);
        }
        try {
            HashMap map2 = new HashMap(map);
            map2.remove("personal_context_info");
            if (str == null) {
                return new Pair(map2, str2);
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
            return new Pair(map2, C786410Ut5.J3(jSONObject));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return new Pair(map, str);
        }
    }
}
