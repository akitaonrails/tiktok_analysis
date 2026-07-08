package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS616S0100000_2;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12869051v {
    public static final void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        LIZIZ(jSONObject2, new AwS616S0100000_2(jSONObject, 94));
    }

    public static final void LIZIZ(JSONObject jSONObject, Function2<? super String, Object, Unit> function2) {
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i = 0; i < length; i++) {
                String str = (String) jSONArrayNames.get(i);
                Object objOpt = jSONObject.opt(str);
                if (objOpt != null) {
                    function2.invoke(str, objOpt);
                }
            }
        }
    }

    public static Long LIZJ(n nVar, String str) {
        q qVarLJJIJIIJI;
        Long lValueOf;
        try {
            qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            qVarLJJIJIIJI = null;
        }
        if (qVarLJJIJIIJI != null) {
            try {
                lValueOf = Long.valueOf(qVarLJJIJIIJI.LJIIZILJ());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                lValueOf = null;
            }
            if (lValueOf != null) {
                return lValueOf;
            }
        }
        return null;
    }

    public static String LIZLLL(n nVar, String str) {
        q qVarLJJIJIIJI;
        String strLJIL;
        try {
            qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            qVarLJJIJIIJI = null;
        }
        if (qVarLJJIJIIJI != null) {
            try {
                strLJIL = qVarLJJIJIIJI.LJIL();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                strLJIL = null;
            }
            if (strLJIL != null) {
                return strLJIL;
            }
        }
        return null;
    }
}
