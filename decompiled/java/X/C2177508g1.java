package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08g1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2177508g1 {
    public final Map<String, Long> LIZ = new HashMap();
    public final String LIZIZ;

    public final synchronized void LJ() {
        Map<String, Long> map;
        try {
            try {
                HashMap map2 = new HashMap(this.LIZ);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("report() start, pushReportMetric.size: ");
                sbLIZ.append(map2.size());
                C2188811AlT.LIZIZ(sbLIZ);
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (Long) entry.getValue());
                }
                AppLogNewUtils.onEventV3(this.LIZIZ, jSONObject);
                int i2 = C2187451AjH.LIZ;
                map = this.LIZ;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("report() exception occurred, exception: ");
                sbLIZ2.append(e);
                C1720106oR.LIZ("ColdBootLoggerHelp", C2188811AlT.LIZIZ(sbLIZ2));
                C1AF0.LJFF(e, "exception_markPushReport");
                map = this.LIZ;
            }
            ((HashMap) map).clear();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((HashMap) this.LIZ).clear();
            throw th;
        }
    }

    public C2177508g1(String str) {
        this.LIZIZ = str;
    }

    public static boolean LIZIZ(String str) {
        if (str.length() == 0) {
            return true;
        }
        return false;
    }

    public final synchronized void LIZLLL(long j) {
        if (LIZIZ("checkUnfinishedSteps_count")) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid key for putMetric(): ");
            sbLIZ.append("checkUnfinishedSteps_count");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        ((HashMap) this.LIZ).put("checkUnfinishedSteps_count", Long.valueOf(j));
    }

    public final synchronized void LIZ(String str, boolean z) {
        if (LIZIZ(str)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid key for begin(): ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ((HashMap) this.LIZ).put(str, Long.valueOf(jUptimeMillis));
        if (z) {
            Map<String, Long> map = this.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("from_cold_boot_to_");
            sbLIZ2.append(str);
            ((HashMap) map).put(C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(jUptimeMillis - C202094145s.LJII));
        }
    }

    public final synchronized void LJFF(String str, Throwable th) {
        if (LIZIZ(str)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid key for reportException(): ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        Map<String, Long> map = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("from_cold_boot_to_");
        sbLIZ2.append(str);
        ((HashMap) map).put(C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(SystemClock.uptimeMillis() - C202094145s.LJII));
        C1AF0.LJFF(th, str);
    }

    public final synchronized void LIZJ(String str, String str2, boolean z) {
        if (LIZIZ(str)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid key for end(): ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        Long l = (Long) ((HashMap) this.LIZ).get(str);
        if (!z) {
            str2 = str;
        }
        if (l != null) {
            ((HashMap) this.LIZ).put(str2, Long.valueOf(jUptimeMillis - l.longValue()));
        } else {
            ((HashMap) this.LIZ).put(str2, -1L);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end(), begin == null, key = ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (z) {
            ((HashMap) this.LIZ).remove(str);
        }
    }
}
