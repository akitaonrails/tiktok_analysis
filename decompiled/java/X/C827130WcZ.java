package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IMultiAccountService;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827130WcZ {
    public static final C827130WcZ LIZ = new C827130WcZ();
    public static boolean LIZIZ;

    public static void LIZ(C827120WcY c827120WcY) {
        int i = C827100WcW.LIZ[c827120WcY.LIZ.ordinal()];
        final String str = "launch";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C844470XAv c844470XAv = C844470XAv.LIZ;
                    c844470XAv.getClass();
                    final String str2 = "terminate";
                    C810650Vr5.LIZ(C844470XAv.LIZ(), "monitor", "terminate");
                    final String str3 = c827120WcY.LIZIZ;
                    if (!C827150Wcb.LIZ()) {
                        c844470XAv.getClass();
                        final Context contextLIZ = C844470XAv.LIZ();
                        C15O7.LIZJ(new Callable() { // from class: X.0UNy
                            public final /* synthetic */ String LL = "monitor";

                            @Override // java.util.concurrent.Callable
                            public final Object call() throws JSONException {
                                String str4 = this.LL;
                                String str5 = str2;
                                String str6 = str3;
                                Context context = contextLIZ;
                                C1C7U.LIZ("LowRetainLog@884d.log$1L");
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("event", str4);
                                jSONObject.put("label", str5);
                                jSONObject.put("session_id", str6);
                                jSONObject.put(Scene.SCENE_SERVICE, "low_retain");
                                jSONObject.put("local_time", System.currentTimeMillis() / 1000);
                                AppLog.recordMiscLog(context, "app_perf", jSONObject);
                                C1C7U.LIZIZ("LowRetainLog@884d.log$1L");
                                return null;
                            }
                        });
                    }
                    LIZIZ = false;
                    CommonFeedLaunchServiceImpl.LJ().LIZIZ();
                    return;
                }
                return;
            }
            final String str4 = c827120WcY.LIZIZ;
            if (!C827150Wcb.LIZ()) {
                C844470XAv.LIZ.getClass();
                final Context contextLIZ2 = C844470XAv.LIZ();
                C15O7.LIZJ(new Callable() { // from class: X.0UNy
                    public final /* synthetic */ String LL = "monitor";

                    @Override // java.util.concurrent.Callable
                    public final Object call() throws JSONException {
                        String str42 = this.LL;
                        String str5 = str;
                        String str6 = str4;
                        Context context = contextLIZ2;
                        C1C7U.LIZ("LowRetainLog@884d.log$1L");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event", str42);
                        jSONObject.put("label", str5);
                        jSONObject.put("session_id", str6);
                        jSONObject.put(Scene.SCENE_SERVICE, "low_retain");
                        jSONObject.put("local_time", System.currentTimeMillis() / 1000);
                        AppLog.recordMiscLog(context, "app_perf", jSONObject);
                        C1C7U.LIZIZ("LowRetainLog@884d.log$1L");
                        return null;
                    }
                });
            }
            ((IMultiAccountService) ServiceManager.get().getService(IMultiAccountService.class)).LIZ();
            return;
        }
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C844470XAv.LIZ.getClass();
        C810650Vr5.LIZ(C844470XAv.LIZ(), "monitor", "launch");
    }
}
