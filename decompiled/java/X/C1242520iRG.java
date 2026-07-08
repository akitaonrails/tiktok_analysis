package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0iRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242520iRG {
    public static final void LIZ(String str, String str2, String str3, HashMap<String, String> map) {
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", str);
        smartRouteBuildRoute.withParam("enter_from", str3);
        smartRouteBuildRoute.withParam("sec_user_id", str2);
        smartRouteBuildRoute.withParam("previous_page", "message");
        smartRouteBuildRoute.withParam("enter_method", "follow_button");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "notification_page");
        smartRouteBuildRoute.withParam("extra_previous_page_position", "card_head");
        C1357130lQ7.LJ(smartRouteBuildRoute, map);
        smartRouteBuildRoute.open();
    }
}
