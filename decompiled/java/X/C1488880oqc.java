package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488880oqc {
    public final Map<String, String> LIZ;
    public long LIZIZ;
    public long LIZJ;

    public final void LIZIZ() {
        if (((ConcurrentHashMap) this.LIZ).size() <= 2 || this.LIZIZ <= 0 || !((ConcurrentHashMap) this.LIZ).containsKey("scc_report_reason")) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LIZIZ;
        Map<String, String> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jUptimeMillis);
        sbLIZ.append("");
        ((ConcurrentHashMap) map).put("scc_total_cost", C2188811AlT.LIZIZ(sbLIZ));
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.LIZ);
        synchronized (C1489780os4.class) {
            try {
                C0C9C c0c9c = C1489780os4.LIZLLL;
                if (c0c9c == null) {
                    return;
                }
                c0c9c.LIZ("ttwebview_scc", mapUnmodifiableMap);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1488880oqc() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZ = concurrentHashMap;
        concurrentHashMap.put("scc_mode", "coreless");
        concurrentHashMap.put("scc_version", "1");
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
    }

    public final void LIZ(String str, boolean z) {
        String str2;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LIZJ;
        Map<String, String> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jUptimeMillis);
        sbLIZ.append("");
        ((ConcurrentHashMap) map).put("scc_cloudservice_user_wait_time", C2188811AlT.LIZIZ(sbLIZ));
        Map<String, String> map2 = this.LIZ;
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        ((ConcurrentHashMap) map2).put("scc_cloudservice_result_apply", str2);
        if (!TextUtils.isEmpty(str)) {
            String str3 = (String) ((ConcurrentHashMap) this.LIZ).get("scc_cloudservice_result");
            if (!TextUtils.isEmpty(str3)) {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    jSONObject.put("error", str);
                    ((ConcurrentHashMap) this.LIZ).put("scc_cloudservice_result", C786410Ut5.J3(jSONObject));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("json format error:");
                    sbLIZ2.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        LIZIZ();
    }
}
