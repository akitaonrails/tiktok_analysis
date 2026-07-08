package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0Oir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627190Oir {
    public static final C627190Oir LIZ = new C627190Oir();

    public static void LIZ(Context context, String str, long j, String str2, String str3, C1607950rwf c1607950rwf) {
        Bundle bundleLJFF;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, str, bundle);
        C786410Ut5.LJJJI("userid", String.valueOf(j), bundle);
        C786410Ut5.LJJJI("sec_userid", str2, bundle);
        bundle.putInt("video_type", 97);
        C786410Ut5.LJJJI("enter_from", str3, bundle);
        C786410Ut5.LJJJI("video_from", "SUB_VIDEO_LIST_ENTRANCE", bundle);
        smartRouteBuildRoute.withParam(bundle);
        if (c1607950rwf != null && (bundleLJFF = c1607950rwf.LJFF()) != null) {
            smartRouteBuildRoute.withBundleAnimation(bundleLJFF);
        }
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        smartRouteBuildRoute.open();
    }
}
