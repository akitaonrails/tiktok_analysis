package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1892, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1892 implements InterfaceC21246518Cp {
    @Override // X.InterfaceC21246518Cp
    public final int LIZ() {
        String strLIZIZ;
        AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
        if (C18CS.LIZ.LIZIZ().LJIIL() == 0) {
            C18G6 c18g6 = AnonymousClass1891.LIZJ;
            if (c18g6 == null || (strLIZIZ = c18g6.LIZIZ("key_bcm", "")) == null) {
                strLIZIZ = "";
            }
            if (strLIZIZ.length() > 0) {
                JSONObject jSONObject = new JSONObject(strLIZIZ);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Map<String, C212369188x> map = AnonymousClass1891.LIZIZ;
                    C212368188w c212368188w = C212369188x.LJ;
                    String strOptString = jSONObject.optString(next);
                    c212368188w.getClass();
                    map.put(next, C212368188w.LIZ(strOptString));
                }
            }
            C18G6 c18g62 = AnonymousClass1891.LIZJ;
            if (c18g62 != null) {
                c18g62.LIZJ("key_bcm", "");
            }
        } else {
            AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(291);
            AFwS223S0000000_32 aFwS223S0000000_322 = AFwS223S0000000_32.get$arr$(290);
            int iLJIIL = C18CS.LIZ.LIZIZ().LJIIL();
            if (iLJIIL != 1) {
                if (iLJIIL != 2) {
                    if (iLJIIL != 3) {
                        aFwS223S0000000_32.invoke();
                    } else {
                        aFwS223S0000000_322.invoke();
                    }
                } else if (!((Boolean) aFwS223S0000000_322.invoke()).booleanValue()) {
                    aFwS223S0000000_32.invoke();
                }
            } else if (!((Boolean) aFwS223S0000000_32.invoke()).booleanValue()) {
                aFwS223S0000000_322.invoke();
            }
        }
        return AnonymousClass1891.LIZIZ.size();
    }

    @Override // X.InterfaceC21246518Cp
    public final void LIZIZ() {
        Unit unit;
        AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
        try {
            C18G6 c18g6 = AnonymousClass1891.LIZJ;
            if (c18g6 != null) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, C212369188x> entry : AnonymousClass1891.LIZIZ.entrySet()) {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                }
                c18g6.LIZ("key_bcm", C786410Ut5.J3(jSONObject));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
