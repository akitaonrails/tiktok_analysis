package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.08HU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HU {
    public static final C08HU LIZ = new C08HU();

    public static void LIZ(Context context) {
        C2089008Gi c2089008Gi = new C2089008Gi("https://ads.tiktok.com/help/article/about-organization-account-permission-management-in-the-tiktok-app");
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        smartRouteBuildRoute.withParam("url", c2089008Gi.LJ());
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.open();
    }
}
