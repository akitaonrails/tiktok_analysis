package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ibh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248990ibh {
    public static final Map<String, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair("profile_tab_base_item", Integer.valueOf(R.id.s6d)), new Pair("profile_tab_music", Integer.valueOf(R.id.s6m)), new Pair("profile_tab_public_post", Integer.valueOf(R.id.s6o)), new Pair("profile_tab_ecommerce_store", Integer.valueOf(R.id.s6h)), new Pair("profile_tab_ecommerce_showcase", Integer.valueOf(R.id.s6g)), new Pair("profile_tab_business_page", Integer.valueOf(R.id.s6e)), new Pair("profile_tab_effect", Integer.valueOf(R.id.s6i)), new Pair("profile_tab_sticker_store", Integer.valueOf(R.id.s6r)), new Pair("profile_tab_private", Integer.valueOf(R.id.s6n)), new Pair("profile_tab_favorite", Integer.valueOf(R.id.s6j)), new Pair("profile_tab_repost", Integer.valueOf(R.id.s6p)), new Pair("profile_tab_like", Integer.valueOf(R.id.s6k)), new Pair("profile_tab_short_drama", Integer.valueOf(R.id.s6q)), new Pair("profile_tab_live_game_org_account", Integer.valueOf(R.id.s6l)), new Pair("profile_tab_cast", Integer.valueOf(R.id.s6f)), new Pair("profile_nav_bar_start_back", Integer.valueOf(R.id.s2x)), new Pair("profile_nav_bar_start_find_friends", Integer.valueOf(R.id.s30)), new Pair("profile_nav_bar_start_tiktok_plus", Integer.valueOf(R.id.s38)), new Pair("profile_nav_bar_start_activity", Integer.valueOf(R.id.s2w)), new Pair("profile_nav_bar_start_share_profile", Integer.valueOf(R.id.s35)), new Pair("profile_nav_bar_start_edit", Integer.valueOf(R.id.s2z)), new Pair("profile_nav_bar_start_live", Integer.valueOf(R.id.s31)), new Pair("profile_nav_bar_start_viewer", Integer.valueOf(R.id.s39)), new Pair("profile_nav_bar_start_settings", Integer.valueOf(R.id.s34)), new Pair("profile_nav_bar_start_profile_menu", Integer.valueOf(R.id.s33)), new Pair("profile_nav_bar_start_bell", Integer.valueOf(R.id.s2y)), new Pair("profile_nav_bar_start_more", Integer.valueOf(R.id.s32)), new Pair("profile_nav_bar_start_social_follow", Integer.valueOf(R.id.s36)), new Pair("profile_nav_bar_start_social_message", Integer.valueOf(R.id.s37)), new Pair("profile_nav_bar_start_viewer_entrance", Integer.valueOf(R.id.s3_)), new Pair("profile_nav_bar_center_avatar", Integer.valueOf(R.id.s2g)), new Pair("profile_nav_bar_end_back", Integer.valueOf(R.id.s2i)), new Pair("profile_nav_bar_end_find_friends", Integer.valueOf(R.id.s2l)), new Pair("profile_nav_bar_end_tiktok_plus", Integer.valueOf(R.id.s2t)), new Pair("profile_nav_bar_end_activity", Integer.valueOf(R.id.s2h)), new Pair("profile_nav_bar_end_share_profile", Integer.valueOf(R.id.s2q)), new Pair("profile_nav_bar_end_edit", Integer.valueOf(R.id.s2k)), new Pair("profile_nav_bar_end_viewer_entrance", Integer.valueOf(R.id.s2v)), new Pair("profile_nav_bar_end_live", Integer.valueOf(R.id.s2m)), new Pair("profile_nav_bar_end_viewer", Integer.valueOf(R.id.s2u)), new Pair("profile_nav_bar_end_settings", Integer.valueOf(R.id.s2p)), new Pair("profile_nav_bar_end_profile_menu", Integer.valueOf(R.id.s2o)), new Pair("profile_nav_bar_end_bell", Integer.valueOf(R.id.s2j)), new Pair("profile_nav_bar_end_more", Integer.valueOf(R.id.s2n)), new Pair("profile_nav_bar_end_social_follow", Integer.valueOf(R.id.s2r)), new Pair("profile_nav_bar_end_social_message", Integer.valueOf(R.id.s2s)));

    public static void LIZ(View view, String str) {
        int iIntValue;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "profile_nav_bar_action_view_id", true, false) || view.getId() != -1) {
            return;
        }
        Integer num = LIZ.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (numValueOf.intValue() != -1) {
            view.setId(numValueOf.intValue());
        }
    }
}
