package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472890IgZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Long l, String str) {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        long jLongValue2 = 0;
        if (l != null) {
            try {
                jLongValue = l.longValue();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            jLongValue = 0;
        }
        jSONObject.put("room_id", jLongValue);
        jSONObject.put("reason", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId: ");
        if (l != null) {
            jLongValue2 = l.longValue();
        }
        sbLIZ.append(jLongValue2);
        sbLIZ.append(" reason: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("pin_log_intercepted", C2188811AlT.LIZIZ(sbLIZ));
        C1CC2.LJI("ttlive_pin_comment_intercepted_monitor", new JSONObject(), null, jSONObject);
    }

    public static void LIZIZ(int i, long j, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_id", j);
            jSONObject.put("reason", str);
            jSONObject.put("operation_type", z);
            jSONObject.put("current_mask", i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("roomId: ");
            sbLIZ.append(j);
            sbLIZ.append(" reason: ");
            sbLIZ.append(str);
            sbLIZ.append(" operation_type: ");
            sbLIZ.append(z);
            sbLIZ.append(" current_mask: ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("[AvoidNotify]pin_log_status", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC2.LJI("ttlive_pin_comment_status_monitor", new JSONObject(), null, jSONObject);
    }
}
