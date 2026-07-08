package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z6Y {
    public static void LIZ(Context context, String str, String str2) {
        IMGroupChatDetailAnalytics.LIZ.LJFF("edit_group_info", new Pair[]{new Pair("enter_from", str2)}, C0I0B.LJFF.LIZIZ());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/new/detail/edit_info");
        smartRouteBuildRoute.withParam("key_conversation_id", str);
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.open();
    }
}
