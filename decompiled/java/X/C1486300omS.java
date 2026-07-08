package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0omS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486300omS {
    public static int LJFF(int i) {
        if (i >= 5000000) {
            return 2160;
        }
        if (i >= 2200000) {
            return 1440;
        }
        if (i >= 1400000) {
            return 1080;
        }
        if (i >= 700000) {
            return 720;
        }
        if (i >= 420000) {
            return 540;
        }
        if (i >= 300000) {
            return 480;
        }
        if (i >= 110000) {
            return 360;
        }
        return i > 0 ? 240 : -1;
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = PatternProtector.compile("stream-[0-9]+").matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group();
    }

    public static String LIZJ(String str) {
        try {
            return new URI(str).getHost();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid play URL: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZIZ();
            return null;
        }
    }

    public static int LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        while (true) {
            String[] strArr = InterfaceC1488020opE.LIZ;
            if (i >= strArr.length) {
                return Integer.MAX_VALUE;
            }
            if (strArr[i].equals(str)) {
                return i;
            }
            i++;
        }
    }

    public static int LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.equals("live_stream_strategy_startup_bitrate_predict")) {
            return 21;
        }
        if (str.equals("live_stream_strategy_abr_predict_bitrate")) {
            return 23;
        }
        if (!str.equals("live_stream_strategy_bandwidth_estimator")) {
            return -1;
        }
        return 27;
    }

    public static C1486310omT LJIIIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("_");
        int i = 0;
        String str2 = strArrSplit[0];
        if (strArrSplit.length > 1) {
            try {
                i = CastIntegerProtector.parseInt(strArrSplit[1]);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new C1486310omT(str2, i);
    }

    public static void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            try {
                JSONArray jSONArrayNames = jSONObject2.names();
                if (jSONArrayNames == null) {
                    return;
                }
                for (int i = 0; i < jSONArrayNames.length(); i++) {
                    String strOptString = jSONArrayNames.optString(i);
                    jSONObject.put(strOptString, jSONObject2.opt(strOptString));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String LJIIIIZZ(String str, JSONObject jSONObject) {
        if (str != null && !str.isEmpty() && !"{}".equals(str)) {
            if (jSONObject.length() == 0) {
                return str;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
                JSONObject jSONObject3 = new JSONObject(str);
                Iterator<String> itKeys = jSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject2.optLong(next, 0L) + jSONObject3.optLong(next, 0L));
                }
                return C786410Ut5.J3(jSONObject2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mergeReasonSummary parse error: ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZIZ();
                return str;
            }
        }
        if (jSONObject.length() <= 0) {
            return "{}";
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static void LIZ(long j, String str, Map map) {
        long jLongValue;
        HashMap map2 = (HashMap) map;
        if (map2.containsKey(str)) {
            jLongValue = ((Long) map2.get(str)).longValue();
        } else {
            jLongValue = 0;
        }
        map2.put(str, Long.valueOf(Long.valueOf(jLongValue).longValue() + j));
    }

    public static Object LJ(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject.has(str)) {
            if (obj == null) {
                return jSONObject.optString(str, null);
            }
            if (obj.getClass() == String.class) {
                return jSONObject.optString(str, (String) obj);
            }
            if (obj.getClass() == Integer.class) {
                return Integer.valueOf(jSONObject.optInt(str, ((Integer) obj).intValue()));
            }
            if (obj.getClass() == Float.class) {
                return Float.valueOf(CastFloatProtector.parseFloat(jSONObject.optString(str)));
            }
            if (obj.getClass() == Long.class) {
                return Long.valueOf(jSONObject.optLong(str, ((Long) obj).longValue()));
            }
            if (obj.getClass() == Double.class) {
                return Double.valueOf(jSONObject.optDouble(str, ((Double) obj).doubleValue()));
            }
            if (obj.getClass() == Boolean.class) {
                return Boolean.valueOf(jSONObject.optBoolean(str, false));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknow type: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZ();
        }
        return obj;
    }
}
