package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.RiskInfo;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708600uZ0 {
    public static String LIZJ() {
        try {
            return C786410Ut5.J3(LIZ(null, null, null, UUID.randomUUID().toString(), null, null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return "";
        }
    }

    public static JSONObject LIZ(String str, String str2, String str3, String str4, Number number, Number number2) {
        HashMap<String, Object> mapLJJLIIIJLJLI;
        try {
            C1711340udQ c1711340udQ = C1711340udQ.LIZ;
            RiskInfo riskInfo = new RiskInfo(null, null, null, null, null, null, null, null, null, null, str2, null, str3, str4, 3071, null);
            c1711340udQ.getClass();
            JSONObject jSONObject = new JSONObject(C1711340udQ.LJ(riskInfo));
            if (str != null) {
                jSONObject.put("verify_request_id", str);
            }
            if (number != null) {
                jSONObject.put("longitude", number);
            }
            if (number2 != null) {
                jSONObject.put("latitude", number2);
            }
            IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
            if (iProbeService != null && (mapLJJLIIIJLJLI = iProbeService.LJJLIIIJLJLI()) != null) {
                for (Map.Entry<String, Object> entry : mapLJJLIIIJLJLI.entrySet()) {
                    if (jSONObject.isNull(entry.getKey())) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                return jSONObject;
            }
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return new JSONObject();
        }
    }
}
