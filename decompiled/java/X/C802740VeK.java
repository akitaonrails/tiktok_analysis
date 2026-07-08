package X;

import android.app.ApplicationExitInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802740VeK {
    public static void LIZ(JSONObject jSONObject) {
        try {
            List<ApplicationExitInfo> listLIZIZ = C802860VeW.LIZIZ();
            if (listLIZIZ == null) {
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("custom");
            long jOptLong = jSONObject.optLong("crash_time");
            int iOptInt = jSONObject.optInt("pid");
            String strOptString = jSONObject.optString("process_name");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            for (ApplicationExitInfo applicationExitInfo : listLIZIZ) {
                if (applicationExitInfo.getProcessName().equals(strOptString) && iOptInt == applicationExitInfo.getPid()) {
                    long timestamp = applicationExitInfo.getTimestamp() - jOptLong;
                    if (timestamp > 0 && timestamp <= 30000) {
                        if (applicationExitInfo.getReason() == 6) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(applicationExitInfo.getDescription());
                            sbLIZ.append(",");
                            sb3.append(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(applicationExitInfo.getReason());
                        sbLIZ2.append(",");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("timestamp=");
                        sbLIZ3.append(applicationExitInfo.getTimestamp());
                        sb2.append(C2188811AlT.LIZIZ(sbLIZ3));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(" crash_pid=");
                        sbLIZ4.append(iOptInt);
                        sb2.append(C2188811AlT.LIZIZ(sbLIZ4));
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(" crash_time=");
                        sbLIZ5.append(jOptLong);
                        sbLIZ5.append(" \n");
                        sb2.append(C2188811AlT.LIZIZ(sbLIZ5));
                        sb2.append(applicationExitInfo);
                        sb2.append("\n");
                    }
                }
            }
            if (sb2.length() > 0) {
                jSONObjectOptJSONObject.put("history_exit_process_list", sb2);
            }
            jSONObject.put("exit_reason", sb);
            if (sb3.length() > 0) {
                jSONObject.put("anr_reason_from_exit", sb3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
