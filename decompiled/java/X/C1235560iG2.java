package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iG2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235560iG2 {
    public static final C1235560iG2 LIZ = new C1235560iG2();

    public static void LIZ(C19EG c19eg, String str) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://roma_redirect/?spark_page=TT_CSP_Login_login_page_front");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withAnimation(R.anim.fv, R.anim.aa);
        smartRouteBuildRoute.open();
    }
}
