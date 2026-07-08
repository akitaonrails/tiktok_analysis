package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799510VXx {
    public static Map<String, Long> LIZ(String str) {
        String[] strArrSplit;
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(";|:")) != null && strArrSplit.length != 0) {
            for (int i = 0; i < strArrSplit.length - 1; i += 2) {
                try {
                    map.put(strArrSplit[i], Long.valueOf(CastLongProtector.parseLong(strArrSplit[i + 1])));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return map;
    }

    public static String LJI(Map map) {
        String strJ3 = null;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    strJ3 = C786410Ut5.J3(new JSONObject(map));
                    return strJ3;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e.toString());
                sbLIZ.append(", :");
                sbLIZ.append(map);
                C1471660oOq.LIZIZ("LoggerUtils", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return strJ3;
    }

    public static void LIZIZ(int i, String str, Map map) {
        if (i != Integer.MIN_VALUE) {
            ((HashMap) map).put(str, Integer.valueOf(i));
        }
    }

    public static void LIZJ(long j, String str, Map map) {
        if (j != -2147483648L) {
            ((HashMap) map).put(str, Long.valueOf(j));
        }
    }

    public static void LIZLLL(String str, float f, Map map) {
        if (f != Float.MIN_VALUE && !Float.isNaN(f)) {
            ((HashMap) map).put(str, Float.valueOf(f));
        }
    }

    public static void LJ(String str, String str2, Map map) {
        if (!TextUtils.isEmpty(str2)) {
            ((HashMap) map).put(str, str2);
        }
    }

    public static void LJFF(String str, List list, Map map) {
        if (list != null && !list.isEmpty()) {
            ((HashMap) map).put(str, list);
        }
    }
}
