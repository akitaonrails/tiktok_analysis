package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QR8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QR8 {
    public static final C0QR8 LIZ = new C0QR8();
    public static long LIZIZ;
    public static long LIZJ;

    public static void LIZ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        if (j != 0) {
            long j2 = jCurrentTimeMillis - j;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gap", j2);
            jSONObject.put("keyword", str);
            jSONObject.put("type", "request_start");
            AppLogNewUtils.onEventV3("search_sug_frequency_monitor", jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" request_start gap:");
            sbLIZ.append(j2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZIZ = jCurrentTimeMillis;
    }

    public static void LIZIZ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZJ;
        if (j != 0) {
            long j2 = jCurrentTimeMillis - j;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gap", j2);
            jSONObject.put("keyword", str);
            jSONObject.put("type", "request_success");
            AppLogNewUtils.onEventV3("search_sug_frequency_monitor", jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" request_success gap:");
            sbLIZ.append(j2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZJ = jCurrentTimeMillis;
    }
}
