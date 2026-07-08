package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234940iF2 {
    public static final C1234940iF2 LIZ = new C1234940iF2();

    public static void LIZ(String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("text", "click_recovery");
        C20684815ws.LJIILLIIL("click_login_acct_recovery", c0xgr.LIZ);
    }

    public static void LIZIZ(C1234940iF2 c1234940iF2, Context context, String str) {
        c1234940iF2.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://account_recover");
        smartRouteBuildRoute.withParam("feedback_id", "6437");
        smartRouteBuildRoute.withParam("from_type", "");
        smartRouteBuildRoute.withParam("group", CardStruct.IStatusCode.DEFAULT);
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withAnimation(R.anim.fv, R.anim.aa);
        smartRouteBuildRoute.open();
    }
}
