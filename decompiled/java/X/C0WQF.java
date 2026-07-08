package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.pusher.core.utils.AVLog;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WQF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQF {
    public static void LIZ(Thread thread, String str) {
        if (thread == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strLIZIZ = "";
            for (StackTraceElement stackTraceElement : ThreadMethodProxy.getStackTrace(thread)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(stackTraceElement.toString());
                sbLIZ.append("\n");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            jSONObject.put("name", thread.getName()).put(FollowStatusChangeMethod.PARAM_UID, thread.getId()).put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, ThreadMethodProxy.getState(thread)).put("stack", strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(".ANR");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            AVLog.logKibanaEvent(6, null, strLIZIZ2, false, C786410Ut5.J3(jSONObject), null);
            AVLog.ioe(strLIZIZ2, C786410Ut5.J3(jSONObject));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
