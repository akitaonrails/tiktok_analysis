package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveParmasConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawShowAnimationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRecommendFallbackSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdk.model.LiveRecommendAtEnd;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0IKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464770IKl {
    public static boolean LJIIIZ;
    public static float LJIIJ;
    public static boolean LJIIJJI;
    public static final C464770IKl LIZ = new C464770IKl();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";
    public static String LJI = "";
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static final List<String> LJIIL = C1697810uHb.LJIILJJIL("following_window_live_cell_refresh", "homepage_follow_live_cell_refresh", "homepage_follow_video_head_refresh", "following_window_live_cell_loadmore", "homepage_follow_live_cell_loadmore", "homepage_follow_video_head_load_more", "message_live_cell_refresh", "message_live_cell_loadmore", "inner_push_inner_push_refresh", "inner_push_inner_push_loadmore", "push_push_refresh", "push_push_loadmore", "following_list_head_refresh", "following_list_head_loadmore", "related_live_refresh", "related_live_loadmore", "tiktok_message_inner_refresh", "tiktok_message_inner_loadmore", "toplive_user_host_room_refresh", "toplive_user_host_room_loadmore", "toplive_karaoke_room_refresh", "toplive_karaoke_room_loadmore", "toplive_draw_guess_room_refresh", "toplive_draw_guess_room_loadmore", "toplive_multi_guest_room_refresh", "toplive_multi_guest_room_loadmore", "toplive_multi_guest_button_refresh", "toplive_multi_guest_button_loadmore", "tikcast_taxonomy_drawer_inner_feed_refresh", "tikcast_taxonomy_drawer_inner_feed_loadmore", "toplive_live_explore_shop_inner_feed_refresh", "toplive_live_explore_shop_inner_feed_loadmore", "tikcast_game_drawer_inner_sub_feed_refresh", "tikcast_game_drawer_inner_sub_feed_loadmore", "friends_feed_refresh");
    public static String LJIILIIL = "";
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(216));

    public static boolean LJII() {
        return C13LQ.LJIILLIIL(LJIILIIL, LiveDrawShowAnimationSetting.INSTANCE.getCurrentValue());
    }

    public static String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0IUA.LJIILLIIL);
        sbLIZ.append('_');
        sbLIZ.append(C0IUA.LJIIZILJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJI() {
        String strLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromType: ");
        sbLIZ.append(strLIZLLL);
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        return MultiGuestTopLiveParmasConfigSetting.INSTANCE.getOtherEndAtMgTopLive().contains(strLIZLLL);
    }

    public final boolean LJ() {
        String strLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromType: ");
        sbLIZ.append(strLIZLLL);
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        return LJFF(strLIZLLL);
    }

    public static final boolean LJFF(String str) {
        LiveRecommendAtEnd value = RecommendEndAtFollowingSetting.INSTANCE.getValue();
        if (value.enableShowRecommend <= 0) {
            return false;
        }
        if (!value.followingEntrances.contains(str) && !C0IKP.LIZIZ(str) && !u.LJJIIJZLJL(str, "inner_flow_live_cover", false) && !LIZIZ(C0IUA.LJIILLIIL, C0IUA.LJIIZILJ) && !Intrinsics.LJFF("live_merge_watch_later", str)) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Intrinsics.LJFF(str, LIZLLL) && Intrinsics.LJFF(str2, LJ)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str, String str2) {
        if (!LiveRecommendFallbackSetting.INSTANCE.enable()) {
            return false;
        }
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(String str, String str2) {
        if (TextUtils.equals(str, "homepage_hot") && TextUtils.equals(str2, "live_cover") && !LJIIIZ) {
            return true;
        }
        return false;
    }
}
