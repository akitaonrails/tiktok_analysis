package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514520pVy {
    public final String LIZ;
    public final int LIZIZ;
    public final Map<String, C1514530pVz> LIZJ = new LinkedHashMap();

    public C1514520pVy(JSONObject jSONObject) {
        Object c098200Yq;
        this.LIZ = "";
        try {
            this.LIZ = jSONObject.optString("extends");
            this.LIZIZ = jSONObject.optInt("default_level", this.LIZIZ);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("issues_rules");
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.LIZJ.put(next, new C1514530pVz(jSONObjectOptJSONObject.optJSONObject(next)));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
    }
}
