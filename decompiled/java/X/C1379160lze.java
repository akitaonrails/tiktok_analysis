package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379160lze {
    public static final C1379160lze LIZ = new C1379160lze();

    public static Map LIZ(Aweme aweme, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        User author;
        int i8;
        int i9;
        Pair[] pairArr = new Pair[33];
        pairArr[0] = new Pair("play_list", new C1376820lvs(C735730StX.LIZ(aweme), R.raw.icon_playlist_fill));
        pairArr[1] = new Pair("ad_personalization_new", new C1376820lvs(R.raw.icon_2pt_question_mark_circle_ltr, R.raw.icon_question_mark_circle_fill_ltr));
        pairArr[2] = new Pair("tt_plus", new C1376820lvs(R.raw.icon_tiktok_plus, R.raw.icon_tiktok_plus));
        if (C736340SuW.LIZJ()) {
            i = R.raw.icon_exclamation_mark_triangle;
        } else if (C736340SuW.LIZ() == 3) {
            i = R.raw.icon_exclamation_mark_bubble;
        } else {
            i = R.raw.icon_2pt_flag;
        }
        if (C736340SuW.LIZJ()) {
            i2 = R.raw.icon_exclamation_mark_triangle_fill;
        } else if (C736340SuW.LIZ() == 3) {
            i2 = R.raw.icon_exclamation_mark_bubble_fill;
        } else {
            i2 = R.raw.icon_flag_fill;
        }
        pairArr[3] = new Pair("report", new C1376820lvs(i, i2));
        pairArr[4] = new Pair("unfollow", new C1376820lvs(R.raw.icon_2pt_person_x_mark, R.raw.icon_2pt_person_x_mark));
        boolean z = C737330Sw7.LIZ;
        int i10 = R.raw.icon_thumbs_down_fill;
        if (z) {
            i3 = R.raw.icon_thumbs_down_fill;
        } else {
            i3 = R.raw.icon_2pt_broken_heart;
            i10 = R.raw.icon_heart_broken_fill;
        }
        pairArr[5] = new Pair("dislike", new C1376820lvs(i3, i10));
        pairArr[6] = new Pair("bc_remove_tag", new C1376820lvs(R.raw.icon_2pt_block, R.raw.icon_block_fill));
        pairArr[7] = new Pair("bc_view_insights", new C1376820lvs(R.raw.icon_2pt_line_chart, R.raw.icon_line_chart_fill));
        pairArr[8] = new Pair("save", new C1376820lvs(R.raw.icon_arrow_down_to_line, R.raw.icon_arrow_down_to_line_bold));
        pairArr[9] = new Pair("save_photo", new C1376820lvs(R.raw.icon_arrow_down_to_line, R.raw.icon_arrow_down_to_line_bold));
        pairArr[10] = new Pair("now_save", new C1376820lvs(R.raw.icon_2pt_arrow_to_bottom, R.raw.icon_arrow_down_to_line_bold));
        pairArr[11] = new Pair("following_feed_0_following", new C1376820lvs(R.raw.icon_personalization, R.raw.icon_personalization_fill));
        int i11 = R.raw.icon_2pt_bookmark;
        if (aweme != null && AwemeExtKt.isCollected(aweme)) {
            i11 = R.raw.icon_2pt_bookmark_fill;
        }
        pairArr[12] = new Pair("favorite", new C1376820lvs(i11, R.raw.icon_bookmark_fill));
        pairArr[13] = new Pair("auto_scroll", new C1376820lvs(C1379280lzq.LIZIZ(), C1379280lzq.LIZ()));
        pairArr[14] = new Pair("duet", new C1376820lvs(R.raw.icon_2pt_duet, R.raw.icon_duet_fill));
        pairArr[15] = new Pair("stitch", new C1376820lvs(R.raw.icon_2pt_stitch, R.raw.icon_stitch_fill));
        pairArr[16] = new Pair("create_sticker", new C1376820lvs(R.raw.icon_2pt_rectangle_smile_face_plus, R.raw.icon_sticker_plus_fill));
        pairArr[17] = new Pair("live_photo", new C1376820lvs(R.raw.icon_live_wallpaper, R.raw.icon_live_wallpaper_fill));
        pairArr[18] = new Pair("gif", new C1376820lvs(R.raw.icon_2pt_gif, R.raw.icon_gif_fill));
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        boolean zLIZJ = C586380MzE.LIZ().LIZJ(str);
        boolean zLIZIZ = C299650Bop.LIZIZ();
        int i12 = R.raw.icon_chevron_collapse_fill;
        if (zLIZIZ) {
            if (zLIZJ) {
                i4 = R.raw.icon_chevron_collapse_fill;
            } else {
                i4 = R.raw.icon_full_screen_fill;
            }
        } else if (zLIZJ) {
            i4 = R.raw.icon_2pt_slash_rectangle_x_mark;
        } else {
            i4 = R.raw.icon_2pt_slash_rectangle;
        }
        boolean zLIZJ2 = C586380MzE.LIZ().LIZJ(str);
        if (C299650Bop.LIZIZ()) {
            if (!zLIZJ2) {
                i12 = R.raw.icon_full_screen_fill;
            }
        } else if (zLIZJ2) {
            i12 = R.raw.icon_doc_text_fill_ltr;
        } else {
            i12 = R.raw.icon_slash_rectangle_fill;
        }
        pairArr[19] = new Pair("clear_mode", new C1376820lvs(i4, i12));
        pairArr[20] = new Pair("captions", new C1376820lvs(R.raw.icon_text_latin, R.raw.icon_text_latin));
        pairArr[21] = new Pair("translation", new C1376820lvs(R.raw.icon_languages_fill, R.raw.icon_languages_fill));
        pairArr[22] = new Pair("playback_speed", new C1376820lvs(R.raw.icon_2pt_speed, R.raw.icon_speed_meter_fill));
        pairArr[23] = new Pair("campaign_detail", new C1376820lvs(R.raw.icon_2pt_shopping_bag_star, R.raw.icon_shopping_bag_star_fill));
        pairArr[24] = new Pair("effect info action", new C1376820lvs(R.raw.icon_2pt_info_circle, R.raw.icon_info_circle_fill));
        pairArr[25] = new Pair("playback_speed", new C1376820lvs(R.raw.icon_2pt_speed, R.raw.icon_speed_meter_fill));
        int iLIZ = C1379380m00.LIZ();
        if (((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJJ()) {
            i5 = R.raw.icon_rectangle_rectangle_fill_1_ltr;
        } else {
            i5 = R.raw.icon_rectangle_rectangle_fill_ltr;
        }
        pairArr[26] = new Pair("picture_in_picture", new C1376820lvs(iLIZ, i5));
        C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
        if (!c1383760m74.LJJIIJ() && c1383760m74.LJJII()) {
            i6 = R.raw.icon_danmu_slash;
        } else {
            i6 = R.raw.icon_danmu;
        }
        if (!c1383760m74.LJJIIJ() && c1383760m74.LJJII()) {
            i7 = R.raw.icon_danmu_slash_fill;
        } else {
            i7 = R.raw.icon_danmu_fill;
        }
        pairArr[27] = new Pair("danmaku", new C1376820lvs(i6, i7));
        pairArr[28] = new Pair("share_to_story", new C1376820lvs(R.raw.icon_add_to_story, R.raw.icon_add_to_story_fill));
        pairArr[29] = new Pair("manage_feed", new C1376820lvs(R.raw.icon_personalization, R.raw.icon_personalization_fill));
        pairArr[30] = new Pair("promote_for_others_fyp", new C1376820lvs(R.raw.icon_2pt_fire, R.raw.icon_fire_fill));
        User author2 = null;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        if (C1393100mM8.LIZIZ(author)) {
            i8 = R.raw.icon_eye;
        } else {
            i8 = R.raw.icon_eye_slash;
        }
        if (aweme != null) {
            author2 = aweme.getAuthor();
        }
        if (C1393100mM8.LIZIZ(author2)) {
            i9 = R.raw.icon_eye_fill;
        } else {
            i9 = R.raw.icon_eye_slash_fill;
        }
        pairArr[31] = new Pair("mute_their_posts", new C1376820lvs(i8, i9));
        pairArr[32] = new Pair("show_in_chat", new C1376820lvs(R.raw.icon_bubble_ellipsis_right_fill, R.raw.icon_bubble_ellipsis_right_fill));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
