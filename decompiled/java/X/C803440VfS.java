package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803440VfS {
    public final String[] LIZ;
    public final String[] LIZIZ;
    public final JSONObject LIZJ;

    public C803440VfS(JSONArray jSONArray) {
        try {
            this.LIZ = jSONArray.optString(0).split(",");
            this.LIZIZ = jSONArray.optString(1).split(",");
            this.LIZJ = new JSONObject();
            for (int i = 2; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!"".equals(strOptString)) {
                    String[] strArrSplit = strOptString.split(":");
                    if (strArrSplit.length == 2) {
                        this.LIZJ.putOpt(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LIZ(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0 || "none".equals(strArr[0])) {
            return false;
        }
        if ("all".equals(strArr[0])) {
            return true;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
