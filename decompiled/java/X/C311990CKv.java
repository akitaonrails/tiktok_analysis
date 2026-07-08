package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311990CKv {
    public static final ConcurrentHashMap<C0CL2, InterfaceC312000CKw> LIZ = new ConcurrentHashMap<>();

    public static String LIZ() {
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it2 = LIZ.values().iterator();
        while (it2.hasNext()) {
            try {
                Pair<String, String> param = ((InterfaceC312000CKw) it2.next()).getParam();
                if (param != null && param.getSecond() != null) {
                    jSONObject.put(param.getFirst(), param.getSecond());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return C786410Ut5.J3(jSONObject);
    }
}
