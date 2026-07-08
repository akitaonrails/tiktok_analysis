package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;

/* JADX INFO: renamed from: X.09gY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2435609gY {
    public static void LIZ(Context context) {
        String str;
        if (C10EU.LJIIIIZZ()) {
            str = "aweme://hyd_action/ad_confirm_child";
        } else {
            str = "aweme://hyd_action/ad_delete_confirm";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
        smartRouteBuildRoute.withParam("locale", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        smartRouteBuildRoute.withParam("hide_status_bar", true);
        smartRouteBuildRoute.withParam("hide_nav_bar", true);
        smartRouteBuildRoute.open();
    }
}
