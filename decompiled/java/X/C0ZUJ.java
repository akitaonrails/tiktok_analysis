package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0ZUJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZUJ {
    public static final C0ZUJ LIZ = new C0ZUJ();

    public static void LIZ(Context context, String str, String str2, String str3) {
        C913060Zrs.LIZ(str, 0, 6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://aweme/detail/");
        sbLIZ.append(str);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        if (C1606640ruY.LIZIZ(C0ZUL.GROUP_HELPER)) {
            if (C1606640ruY.LIZLLL()) {
                smartRouteBuildRoute.withParam("use_saf", 1);
                smartRouteBuildRoute.withParam("im_chat_to_detail_saf", true);
            } else if (C1606640ruY.LJ()) {
                smartRouteBuildRoute.withParam("use_saf", 2);
                smartRouteBuildRoute.withParam("im_chat_to_detail_saf", true);
            }
        }
        smartRouteBuildRoute.withParam("refer", "chat");
        smartRouteBuildRoute.withParam("video_from", "from_chat");
        smartRouteBuildRoute.withParam("enter_method", "click_inline_dm_reply_msg");
        smartRouteBuildRoute.withParam("key_from_chat_room_playing", true);
        smartRouteBuildRoute.withParam("key_from_chat_room_real_aid", str);
        smartRouteBuildRoute.withParam("conversation_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        smartRouteBuildRoute.withParam("to_uid", str3);
        smartRouteBuildRoute.open();
    }
}
