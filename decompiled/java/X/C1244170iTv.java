package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0iTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244170iTv {
    public static final C1244170iTv LIZ = new C1244170iTv();

    public static void LIZ() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1245240iVe.LIZ.getClass();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, "aweme://webview");
        SettingsManager.LIZLLL().getClass();
        smartRouteBuildRoute.withParam(UriProtector.parse(SettingsManager.LJI("email_notification_setting_link", "https://www.tiktok.com/email/h5/notifications?disableBounces=1")));
        smartRouteBuildRoute.open();
    }

    public static void LIZIZ() {
        LIZ();
        C1245240iVe.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("page_name", "notification_setting_page");
        c2344009Gk.LJIIIIZZ("previous_page", "notification_setting_page");
        c2344009Gk.LJIIIIZZ("exp_name", "email_notification_phase2");
        C20684815ws.LJIILLIIL("enter_email_notification_setting", c2344009Gk.LIZ);
    }
}
