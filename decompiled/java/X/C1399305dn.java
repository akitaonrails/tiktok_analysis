package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1399305dn {
    public static final C1399305dn LIZ = new C1399305dn();

    public static JSONObject LIZ(HashMap map, Function1 function1) {
        Object obj;
        boolean z;
        JSONObject jSONObject;
        Object obj2 = null;
        try {
            Object obj3 = map.get("rd_ec_inner_feed_trace");
            String str = (String) obj3;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                obj3 = null;
            }
            String str2 = (String) obj3;
            if (str2 != null) {
                jSONObject = new JSONObject(str2);
            } else {
                jSONObject = new JSONObject();
            }
            function1.invoke(jSONObject);
            map.put("rd_ec_inner_feed_trace", C786410Ut5.J3(jSONObject));
            C189200o6.m2constructorimpl(jSONObject);
            obj = jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (JSONObject) obj2;
    }
}
