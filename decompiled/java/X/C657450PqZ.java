package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0PqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657450PqZ {
    public static final C657450PqZ LIZ = new C657450PqZ();

    public static void LIZ(Context context, User user) {
        if (context == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_from", "search_result");
        smartRouteBuildRoute.withParam("previous_page", "search_result");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "search_result");
        smartRouteBuildRoute.withParam("extra_from_event_enter_from", "search_result");
        smartRouteBuildRoute.withParam("profile_enterprise_type", user.getCommerceUserLevel());
        smartRouteBuildRoute.withParam("extra_previous_page_position", "main_head");
        smartRouteBuildRoute.withParam("search_request_id", user.getRequestId());
        smartRouteBuildRoute.open();
    }
}
