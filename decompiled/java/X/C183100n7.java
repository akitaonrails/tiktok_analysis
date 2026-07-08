package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C183100n7 {
    public static final int LIZIZ(JSONObject jSONObject) {
        Object c098200Yq;
        int iIntValue;
        Integer numLJIIJJI;
        try {
            Object objOpt = jSONObject.opt("log_type");
            if (objOpt instanceof Number) {
                iIntValue = ((Number) objOpt).intValue();
            } else if ((objOpt instanceof String) && (numLJIIJJI = C2095008Iq.LJIIJJI((String) objOpt)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            c098200Yq = Integer.valueOf(iIntValue);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0;
        }
        return ((Number) c098200Yq).intValue();
    }

    public static final void LIZ(String str, JSONObject jSONObject) throws JSONException {
        String strLIZJ = LIZJ("code", jSONObject);
        if (a0.LJJJIL(strLIZJ)) {
            strLIZJ = "unknown";
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("business", str);
        jSONObject2.putOpt("code", strLIZJ);
        C1CC2.LIZJ("pitaya_message_call", jSONObject2, null, new JSONObject());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("pitaya_message_call");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
    }

    public static final String LIZJ(String str, JSONObject jSONObject) {
        Object c098200Yq;
        Object obj = "";
        try {
            Object objOpt = jSONObject.opt(str);
            if (objOpt == null) {
                c098200Yq = "";
            } else if (objOpt instanceof String) {
                c098200Yq = (String) objOpt;
            } else {
                c098200Yq = objOpt.toString();
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
}
