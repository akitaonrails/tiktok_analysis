package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C20182713y5 implements InterfaceC20182813y6 {
    public static final void LIZ(String str, List list, JSONObject jSONObject) {
        try {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "key_offline_admission", true, false)) {
                if (str.equals("scene_first_feed")) {
                    JSONObject jSONObjectLIZIZ = C20182613y4.LIZIZ(jSONObject);
                    C20182613y4.LIZ(list, jSONObjectLIZIZ);
                    AppLogNewUtils.onEventV3("offline_admission_event", jSONObjectLIZIZ);
                }
                if (str.equals("scene_feed_fluency")) {
                    JSONObject jSONObjectLIZIZ2 = C20182613y4.LIZIZ(jSONObject);
                    C20182613y4.LIZ(list, jSONObjectLIZIZ2);
                    AppLogNewUtils.onEventV3("offline_admission_event", jSONObjectLIZIZ2);
                }
                if (str.equals("scene_FirstLive_EnterRoom") || str.equals("scene_FirstLive_PullStream")) {
                    JSONObject jSONObjectLIZIZ3 = C20182613y4.LIZIZ(jSONObject);
                    C20182613y4.LIZ(list, jSONObjectLIZIZ3);
                    AppLogNewUtils.onEventV3("offline_admission_event", jSONObjectLIZIZ3);
                }
                if (str.equals("scene_FirstLive_Prepare")) {
                    C20182613y4.LIZ(list, jSONObject);
                    AppLogNewUtils.onEventV3("offline_admission_event", jSONObject);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
