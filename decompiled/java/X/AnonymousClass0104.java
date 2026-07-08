package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0104, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0104 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return LIZJ(j, 1000L, "k");
        }
        if (j < 1000000000) {
            return LIZJ(j, 1000000L, "m");
        }
        return LIZJ(j, 1000000000L, "b");
    }

    public static JSONObject LIZIZ(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    LIZIZ(jSONObject2);
                    jSONObject.put(next, jSONObject2);
                } else if (obj instanceof Long) {
                    jSONObject.put(next, String.valueOf(((Number) obj).longValue()));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("GameGuessingUtils", e);
            }
        }
        return jSONObject;
    }

    public static String LIZLLL(List list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) ListProtector.get(list, i));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static String LIZJ(long j, long j2, String str) {
        String string = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        if ('0' == string.charAt(string.length() - 1)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string.substring(0, string.length() - 2));
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
