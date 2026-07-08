package X;

import Y.AComparatorS22S0000000_3;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08lE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2209808lE {
    public static final C2209808lE LIZ = new C2209808lE();
    public static final ConcurrentHashMap<String, List<C2209908lF>> LIZIZ = new ConcurrentHashMap<>();

    public static List LIZ(String str) {
        return LIZIZ.get(a0.LJLIIIL(str).toString());
    }

    public static List LIZJ(String str) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        JSONArray jSONArray = new JSONArray(str);
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String string = a0.LJLIIIL(jSONObjectOptJSONObject.optString("text")).toString();
                if (!a0.LJJJIL(string)) {
                    LIZ.getClass();
                    Long lLIZIZ = LIZIZ("startMs", jSONObjectOptJSONObject);
                    if (lLIZIZ == null && (lLIZIZ = LIZIZ("start_ms", jSONObjectOptJSONObject)) == null) {
                        String strOptString = jSONObjectOptJSONObject.optString("start_time");
                        if (a0.LJJJIL(strOptString)) {
                            strOptString = jSONObjectOptJSONObject.optString("timestamp");
                        }
                        jLongValue = LIZLLL(strOptString);
                    } else {
                        jLongValue = lLIZIZ.longValue();
                    }
                    Long lLIZIZ2 = LIZIZ("endMs", jSONObjectOptJSONObject);
                    if (lLIZIZ2 == null && (lLIZIZ2 = LIZIZ("end_ms", jSONObjectOptJSONObject)) == null) {
                        jLongValue2 = LIZLLL(jSONObjectOptJSONObject.optString("end_time"));
                    } else {
                        jLongValue2 = lLIZIZ2.longValue();
                    }
                    Long lValueOf = Long.valueOf(jLongValue2);
                    if (lValueOf.longValue() > jLongValue) {
                        jLongValue3 = lValueOf.longValue();
                    } else {
                        jLongValue3 = jLongValue;
                    }
                    c13dvLIZIZ.add(new C2209908lF(jLongValue, jLongValue3, string));
                }
            }
        }
        return C13LP.LJLLLL(new AComparatorS22S0000000_3(23), C1697820uHc.LIZ(c13dvLIZIZ));
    }

    public static long LIZLLL(String str) {
        Long lLJIILIIL;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJLIIIL(str).toString(), new String[]{":"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() == 2 && (lLJIILIIL = C2095008Iq.LJIILIIL((String) ListProtector.get(listLJJLIIIJILLIZJL, 0))) != null) {
            long jLongValue = lLJIILIIL.longValue();
            Double dLJII = C2327809Ae.LJII((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
            if (dLJII != null) {
                return (jLongValue * 60000) + ((long) (dLJII.doubleValue() * 1000.0d));
            }
        }
        return 0L;
    }

    public static Long LIZIZ(String str, JSONObject jSONObject) {
        long jLIZLLL;
        Long lValueOf;
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null) {
            return null;
        }
        if (objOpt instanceof Number) {
            lValueOf = Long.valueOf(((Number) objOpt).longValue());
        } else {
            if (objOpt instanceof String) {
                String string = a0.LJLIIIL((String) objOpt).toString();
                if ((!a0.LJJJIL(string)) && string != null) {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(string);
                    if (lLJIILIIL != null) {
                        jLIZLLL = lLJIILIIL.longValue();
                    } else {
                        LIZ.getClass();
                        jLIZLLL = LIZLLL(string);
                    }
                    lValueOf = Long.valueOf(jLIZLLL);
                }
            }
            return null;
        }
        if (lValueOf == null || lValueOf.longValue() < 0) {
            return null;
        }
        return lValueOf;
    }
}
