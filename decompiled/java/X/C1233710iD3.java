package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0iD3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233710iD3 {
    public static void LIZ(Context context, String str, String str2, String str3, int i, boolean z, Integer num) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("title_string", str2, bundle);
        C786410Ut5.LJJJI("description_string", str3, bundle);
        bundle.putInt("icon", i);
        bundle.putBoolean("is_skippable", z);
        if (num != null) {
            bundle.putInt("popup_freq", num.intValue());
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//account/login/auth/two_step_verification_management");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }
}
