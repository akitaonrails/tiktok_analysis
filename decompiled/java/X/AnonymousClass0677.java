package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0677, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0677 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static void LIZ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("track_name", "observer_applog_run_event");
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            jSONObject.put("timestamp", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            jSONObject.put("mode", "app_log_observer");
            if (str2.length() > 0) {
                jSONObject.put("error", str2);
            }
            C1713870uhV.LIZIZ("rd_pipo_probe_sdk", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
