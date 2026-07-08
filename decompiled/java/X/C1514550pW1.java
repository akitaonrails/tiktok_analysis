package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514550pW1 {
    public final Integer LIZ;
    public final EnumC1514560pW2 LIZIZ;
    public final C1522520pis LIZJ;

    public C1514550pW1(JSONObject jSONObject) {
        Object c098200Yq;
        EnumC1514560pW2 enumC1514560pW2;
        try {
            this.LIZ = Integer.valueOf(jSONObject.optInt("level"));
            String strOptString = jSONObject.optString("engine");
            if (Intrinsics.LJFF(strOptString, "web")) {
                enumC1514560pW2 = EnumC1514560pW2.Web;
            } else if (Intrinsics.LJFF(strOptString, "lynx")) {
                enumC1514560pW2 = EnumC1514560pW2.Lynx;
            } else {
                enumC1514560pW2 = EnumC1514560pW2.All;
            }
            this.LIZIZ = enumC1514560pW2;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rule");
            this.LIZJ = new C1522520pis(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
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
