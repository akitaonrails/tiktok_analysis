package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C186600ng {
    public static final void LIZ(String str, Map map) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            map.put("collect_info", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        map.put(next, objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }
}
