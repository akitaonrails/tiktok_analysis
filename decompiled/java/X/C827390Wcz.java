package X;

import com.bytedance.android.alog.Alog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827390Wcz {
    public static final C827390Wcz LIZ = new C827390Wcz();

    public static void LIZ(JSONObject jSONObject, boolean z) {
        Throwable th;
        String message;
        String strLJIIIZ;
        Alog alog;
        if (!C294900BhA.LIZ()) {
            return;
        }
        int iOptInt = jSONObject.optInt("code");
        Object objOpt = jSONObject.opt("exception_object");
        if (objOpt instanceof Exception) {
            th = (Throwable) objOpt;
        } else {
            th = null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event", "response");
            jSONObject2.put("is_success", z);
            jSONObject2.put("code", iOptInt);
            if (th != null) {
                message = th.getMessage();
            } else {
                message = null;
            }
            jSONObject2.put("exception", message);
            jSONObject2.put("errno", jSONObject.optInt("errno"));
            if (!z) {
                C827300Wcq.LIZ.getClass();
                try {
                    alog = C827300Wcq.LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (alog != null) {
                    strLJIIIZ = alog.LJIIIZ();
                } else {
                    strLJIIIZ = null;
                }
                jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, strLJIIIZ);
            }
            C793770VBv.LJII("feeds_alog_monitor", jSONObject2, null, jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
