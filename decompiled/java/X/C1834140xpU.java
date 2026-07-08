package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0xpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834140xpU {
    public static final C1834140xpU LIZ = new C1834140xpU();

    public static void LIZ(Context context, String str, String str2, String str3, float f, String str4, EnumC1782300wTs enumC1782300wTs, String str5, boolean z, boolean z2, String str6) {
        if (context == null || str == null || str2 == null || str3 == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webcast_highlight_page");
        smartRouteBuildRoute.withParam("fragment_id", str);
        smartRouteBuildRoute.withParam("replay_room_id", str2);
        smartRouteBuildRoute.withParam("anchor_id", str3);
        smartRouteBuildRoute.withParam("tab_id", enumC1782300wTs.getValue());
        smartRouteBuildRoute.withParam("click_position", "highlights_and_clips");
        smartRouteBuildRoute.withParam("last_page", "live_replay");
        smartRouteBuildRoute.withParam("enter_method", str4);
        C1833570xoZ.LIZ.getClass();
        smartRouteBuildRoute.withParam("enter_from_page", C1833570xoZ.LIZIZ);
        smartRouteBuildRoute.withParam("enter_from", str5);
        smartRouteBuildRoute.withParam("start_progress", String.valueOf(f / 100.0f));
        smartRouteBuildRoute.withParam("support_bb_download", z);
        smartRouteBuildRoute.withParam("is_bb_fans", z2);
        smartRouteBuildRoute.withParam("user_type", str6);
        smartRouteBuildRoute.open();
    }
}
