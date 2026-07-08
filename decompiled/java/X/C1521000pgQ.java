package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521000pgQ {
    public static void LIZ(JSONObject jSONObject) {
        Object c098200Yq;
        boolean zBooleanValue;
        try {
            for (EnumC1520990pgP enumC1520990pgP : EnumC1520990pgP.values()) {
                if (jSONObject.has(enumC1520990pgP.getKey())) {
                    Object objOpt = jSONObject.opt(enumC1520990pgP.getKey());
                    if (objOpt instanceof JSONObject) {
                        enumC1520990pgP.setEnabled(true);
                        enumC1520990pgP.setOptions((JSONObject) objOpt);
                        enumC1520990pgP.bidACL = new C1514640pWA(objOpt);
                    } else {
                        EnumC1520990pgP.Companion.getClass();
                        if (objOpt instanceof String) {
                            zBooleanValue = u.LJIJI("true", (String) objOpt, true);
                        } else if (objOpt instanceof Boolean) {
                            zBooleanValue = ((Boolean) objOpt).booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        enumC1520990pgP.setEnabled(zBooleanValue);
                    }
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
