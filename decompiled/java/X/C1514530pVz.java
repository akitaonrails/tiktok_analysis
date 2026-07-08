package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514530pVz {
    public final int LIZ;
    public final List<C1514550pW1> LIZIZ = new ArrayList();

    public C1514530pVz(JSONObject jSONObject) {
        Object c098200Yq;
        try {
            this.LIZ = jSONObject.optInt("default_level", this.LIZ);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rules");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.LIZIZ.add(new C1514550pW1(jSONArrayOptJSONArray.optJSONObject(i)));
                }
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
