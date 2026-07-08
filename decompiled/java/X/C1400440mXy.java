package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0mXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400440mXy {
    public static void LIZ(Context context, String str, String str2, String str3) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C1388190mED.LIZ(context), "aweme://challenge/detail/");
        smartRouteBuildRoute.withParam("cid", str);
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0);
        smartRouteBuildRoute.withParam("process_id", str3);
        smartRouteBuildRoute.open();
    }
}
