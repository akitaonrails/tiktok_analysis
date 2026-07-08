package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.experiment.ProfileTabDoubleTapSwitchConfig;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849710XUz {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(279));

    public static JSONArray LIZ() {
        String string = ((Keva) LIZ.getValue()).getString("entries", "");
        if (string == null || string.length() == 0) {
            return new JSONArray();
        }
        try {
            return new JSONArray(string);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new JSONArray();
        }
    }

    public static JSONObject LIZIZ() {
        String string = ((Keva) LIZ.getValue()).getString("foreground_active", "");
        if (string == null || string.length() == 0) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new JSONObject();
        }
    }

    public static final boolean LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONArray jSONArrayLIZ = LIZ();
        long j = jCurrentTimeMillis - 604800000;
        HashMap map = new HashMap();
        int length = jSONArrayLIZ.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayLIZ.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optLong("ts", 0L) >= j) {
                String strOptString = jSONObjectOptJSONObject.optString("uid", "");
                if (strOptString.length() != 0) {
                    Integer num = (Integer) map.get(strOptString);
                    map.put(strOptString, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
        }
        int iLJZI = C13LP.LJZI(map.values());
        return iLJZI != 0 && ((double) C13LP.LJZI(C13LP.LL(C13LP.LJLLL(map.values()), 2))) / ((double) iLJZI) >= ((double) C13LZ.LJ(ProfileTabDoubleTapSwitchConfig.LIZ().concentrationThresholdPct, 0, 100)) / 100.0d;
    }

    public static final synchronized void LIZJ(long j, String str) {
        if (str.length() == 0) {
            return;
        }
        JSONObject jSONObjectLIZIZ = LIZIZ();
        jSONObjectLIZIZ.put(str, j);
        ((Keva) LIZ.getValue()).storeString("foreground_active", C786410Ut5.J3(jSONObjectLIZIZ));
    }
}
