package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.p;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2365509Or {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C051I());

    public static final Gson LIZ() {
        return (Gson) LIZ.getValue();
    }

    public static final String LIZIZ(String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            new p();
            k kVarLJJIIZ = p.LIZJ(str).LJIILIIL().LJJIIZ("incentive_type");
            if (kVarLJJIIZ != null) {
                c098200Yq = kVarLJJIIZ.LJIL();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LJ(Object obj) {
        return GsonProtectorUtils.toJson(LIZ(), obj);
    }

    public static final void LIZJ(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject.has(str)) {
            return;
        }
        LIZLLL(jSONObject, str, obj);
    }

    public static final void LIZLLL(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("safePut error, key: ");
                sbLIZ.append(str);
                sbLIZ.append(", value: ");
                sbLIZ.append(obj);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }
}
