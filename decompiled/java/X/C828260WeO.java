package X;

import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828260WeO extends C09AY implements Function0<List<? extends Object>> {
    public C828260WeO() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List<? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Object> invoke() {
        ?? r3;
        ArrayList arrayList;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("spark_allow_app_whitelist");
            JSONArray jSONArrayOptJSONArray = config != null ? config.optJSONArray("allowList") : null;
            if (jSONArrayOptJSONArray != null) {
                arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArrayOptJSONArray.get(i));
                }
            } else {
                arrayList = null;
            }
            C189200o6.m2constructorimpl(arrayList);
            r3 = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            r3 = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(r3)) {
            return null;
        }
        return r3;
    }
}
