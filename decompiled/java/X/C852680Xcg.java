package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0Xcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852680Xcg {
    public static final /* synthetic */ int LIZ = 0;

    public static final SmartRoute LIZ(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//account/login/signup_or_login");
        smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.LOGIN.getValue());
        smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.PHONE_EMAIL_LOGIN.getValue());
        smartRouteBuildRoute.withParam("login_panel_type", "login");
        return smartRouteBuildRoute;
    }

    public static final SmartRoute LIZIZ(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//account/ftc");
        smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.SIGN_UP.getValue());
        smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.FTC_CREATE_ACCOUNT.getValue());
        smartRouteBuildRoute.withParam("login_panel_type", "signup");
        return smartRouteBuildRoute;
    }

    public static final SmartRoute LIZJ(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//account/login/signup_or_login");
        smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.SIGN_UP.getValue());
        smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.PHONE_EMAIL_SIGN_UP.getValue());
        smartRouteBuildRoute.withParam("login_panel_type", "signup");
        return smartRouteBuildRoute;
    }
}
