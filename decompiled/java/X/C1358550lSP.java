package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358550lSP {
    public static final C1358550lSP LIZ = new C1358550lSP();

    public static void LJIIL(int i) {
        C20684815ws.LJIJI("ttk_repost_digg_api", new Pair(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
    }

    public static void LJFF(String str, String str2) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (Intrinsics.LJFF(str, "show")) {
            str3 = "repost_mention_entrance_show";
        } else {
            str3 = "repost_mention_entrance_click";
        }
        C20684815ws.LJIILLIIL(str3, c2344009Gk.LIZ);
    }

    public static void LJIJJ(String str, String str2) {
        C20684815ws.LJIJI("ttsocial_repost_text_guide_popup_click", new Pair(str, "enter_from"), new Pair("after_text_added", Scene.SCENE_SERVICE), new Pair(str2, "button_name"));
    }

    public static void LIZJ(User user, EnumC1260930iux enumC1260930iux, String str) {
        String str2;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(str);
        c1260910iuv.LJJJJIZL("repost_sheet");
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LLFII = Boolean.TRUE;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        String str3 = null;
        if (matchedFriendStruct != null) {
            str2 = matchedFriendStruct.recType;
        } else {
            str2 = null;
        }
        c1260910iuv.LJJJJJL(str2);
        c1260910iuv.LJJLIIIJJIZ = C736430Suf.LIZ(user);
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJJJZI(user);
        MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
        if (matchedFriendStruct2 != null) {
            str3 = matchedFriendStruct2.relationType;
        }
        c1260910iuv.LJJJJL(str3);
        c1260910iuv.LJIILJJIL();
    }

    public static void LJIILL(String str, String str2, String str3) {
        C20684815ws.LJIJI("ttsocial_repost_panel_hide_show", new Pair(str, "enter_from"), new Pair("recommend_panel", "enter_method"), new Pair(str2, "group_id"), new Pair(str3, "reposter_uid"));
    }

    public static void LJJI(String str, Aweme aweme, UpvoteStruct upvoteStruct) {
        String uid;
        String str2;
        int length;
        String strLIZLLL;
        User user;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String aid = "";
        if (upvoteStruct == null || (user = upvoteStruct.user) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        if (upvoteStruct != null) {
            str2 = upvoteStruct.textId;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("object_id", str2);
        c2344009Gk.LJIIIIZZ("object_type", "repost_with_text");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "repost_panel");
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (upvoteStruct != null && (strLIZLLL = C1359720lUI.LIZLLL(upvoteStruct)) != null) {
            length = strLIZLLL.length();
        } else {
            length = 0;
        }
        c2344009Gk.LIZJ(length, "repost_length");
        C20684815ws.LJIILLIIL("click_report", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, AbstractC343940De4 abstractC343940De4) {
        String str4;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(str, "enter_from");
        if (abstractC343940De4 instanceof C343980De8) {
            str4 = "icon";
        } else {
            str4 = "other";
        }
        pairArr[1] = new Pair(str4, "enter_method");
        pairArr[2] = new Pair(str3, "author_id");
        pairArr[3] = new Pair(str2, "group_id");
        C20684815ws.LJIJI("close_recommend_panel", pairArr);
    }

    public static void LJIIIZ(int i, String str, long j, String str2) {
        C20684815ws.LJIJI("ttk_upvote_publish_monitor", new Pair(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), new Pair(str, "enter_from"), new Pair(str2, "enter_method"), new Pair(Long.valueOf(j), "duration_network"));
    }

    public static void LJJIFFI(Integer num, Long l, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJ(l, "duration");
        c2344009Gk.LJ(num, "repost_count");
        C20684815ws.LJIILLIIL("repost_panel_open_performance", c2344009Gk.LIZ);
    }

    public static void LJIJ(String str, String str2, String str3, String str4, String str5) {
        String str6;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        C1358170lRn.LIZ(c2344009Gk, "aggregate_notice_type", str4);
        c2344009Gk.LJIIIIZZ("group_id", str5);
        if (Intrinsics.LJFF(str, "up")) {
            str6 = "ttsocial_repost_panel_slide_up";
        } else if (!Intrinsics.LJFF(str, "down")) {
            return;
        } else {
            str6 = "ttsocial_repost_panel_slide_down";
        }
        C20684815ws.LJIILLIIL(str6, c2344009Gk.LIZ);
    }

    public static void LJIIJ(String str, UpvoteStruct upvoteStruct, String str2, String str3, String str4, Boolean bool) {
        String uid;
        String string;
        User user;
        User user2;
        if (upvoteStruct == null || (user2 = upvoteStruct.user) == null || (uid = user2.getUid()) == null) {
            uid = "";
        }
        Integer numValueOf = null;
        if (upvoteStruct != null && (user = upvoteStruct.user) != null) {
            string = Integer.valueOf(user.getFollowStatus()).toString();
        } else {
            string = null;
        }
        boolean zLJIIZILJ = C10EU.LJIIZILJ(uid);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "click_recommend_avatar");
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        c2344009Gk.LJIIIIZZ("follow_status", string);
        c2344009Gk.LIZJ(zLJIIZILJ ? 1 : 0, "is_self");
        c2344009Gk.LJIIIIZZ("panel_style", "list");
        C1358170lRn.LIZJ(c2344009Gk, upvoteStruct);
        C1358170lRn.LIZ(c2344009Gk, "comment_id", str2);
        C1358170lRn.LIZ(c2344009Gk, "group_id", str3);
        C1358170lRn.LIZ(c2344009Gk, "repost_type", str4);
        if (bool != null) {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        C1358170lRn.LIZ(c2344009Gk, "has_explanatory_line", numValueOf);
        C20684815ws.LJIILLIIL("recommend_panel_cell_show", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(String str, String str2, String str3, Aweme aweme, String str4, UpvoteStruct upvoteStruct) {
        String aid;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("event_type", str3);
        IMAIMojiSticker iMAIMojiStickerLIZJ = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("emoji", str4);
        C1358170lRn.LIZJ(c2344009Gk, upvoteStruct);
        c2344009Gk.LIZJ(C424430Gkb.LIZ() ? 1 : 0, "is_ai_emoji");
        c2344009Gk.LJIIIIZZ("panel_style", "list");
        if (upvoteStruct != null) {
            iMAIMojiStickerLIZJ = C1359720lUI.LIZJ(upvoteStruct);
        }
        C1358170lRn.LIZIZ(c2344009Gk, iMAIMojiStickerLIZJ);
        C20684815ws.LJIILLIIL("repost_panel_quick_reply", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(String str, String str2, String str3, String str4, Aweme aweme, UpvoteStruct upvoteStruct) {
        String aid;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("event_type", str3);
        c2344009Gk.LJIIIIZZ("button_name", str4);
        IMAIMojiSticker iMAIMojiStickerLIZJ = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        C1358170lRn.LIZJ(c2344009Gk, upvoteStruct);
        if (upvoteStruct != null) {
            iMAIMojiStickerLIZJ = C1359720lUI.LIZJ(upvoteStruct);
        }
        C1358170lRn.LIZIZ(c2344009Gk, iMAIMojiStickerLIZJ);
        C20684815ws.LJIILLIIL("repost_panel_im", c2344009Gk.LIZ);
    }

    public static void LJIJI(String str, String str2, String str3, Integer num, Integer num2, EnumC429870GtN enumC429870GtN, String str4) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("from_user_id", str3);
        c2344009Gk.LJ(num, "follow_status");
        c2344009Gk.LJ(num2, "follower_status");
        c2344009Gk.LIZJ(enumC429870GtN.getValue(), "with_repost_text_exposed_bubble");
        if (Intrinsics.LJFF(str, "click")) {
            c2344009Gk.LJFF("click_area", str4);
            str5 = "ttsocial_repost_tab_cover_click";
        } else {
            str5 = "ttsocial_repost_tab_cover_show";
        }
        C20684815ws.LJIILLIIL(str5, c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public static void LJIIIIZZ(String str, String str2, UpvotePublishMobParam upvotePublishMobParam, String str3, String str4, Boolean bool, int i, String str5) {
        Integer numValueOf;
        ?? BooleanValue;
        int iIntValue;
        Integer num;
        Integer num2;
        Boolean bool2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        if (bool != null) {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "result");
        c2344009Gk.LIZJ(i, "error_code");
        c2344009Gk.LJIIIIZZ("panel_style", str5);
        int iIntValue2 = 0;
        if (upvotePublishMobParam != null && (bool2 = upvotePublishMobParam.withRecommend) != null) {
            BooleanValue = bool2.booleanValue();
        } else {
            BooleanValue = 0;
        }
        C1358170lRn.LIZ(c2344009Gk, "with_recommend", Integer.valueOf((int) BooleanValue));
        if (upvotePublishMobParam != null && (num2 = upvotePublishMobParam.messageCount) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        C1358170lRn.LIZ(c2344009Gk, "share_to_private_chat_num", Integer.valueOf(iIntValue));
        if (upvotePublishMobParam != null && (num = upvotePublishMobParam.groupMemberCount) != null) {
            iIntValue2 = num.intValue();
        }
        C1358170lRn.LIZ(c2344009Gk, "share_to_group_member_cnt", Integer.valueOf(iIntValue2));
        C20684815ws.LJIILLIIL("add_recommendation_finish_result", c2344009Gk.LIZ);
    }

    public static void LJIL(int i, int i2, long j, long j2, boolean z, boolean z2, C1358870lSv c1358870lSv, int i3) {
        C20684815ws.LJIJI("ttk_upvote_batch_list_monitor", new Pair(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), new Pair(Integer.valueOf(i2), "upvote_scene"), new Pair(Long.valueOf(j), "duration_network"), new Pair(Long.valueOf(j2), "duration_before_network"), new Pair(Integer.valueOf(z ? 1 : 0), "is_force_insert"), new Pair(Integer.valueOf(z2 ? 1 : 0), "is_first_page"), new Pair(c1358870lSv.LIZIZ, "request_trigger_reason"), new Pair(Integer.valueOf(i3), "current_items_size"));
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, UpvoteList upvoteList, String str6, String str7, String str8) {
        int size;
        List<UpvoteStruct> list;
        int i = 0;
        if (upvoteList != null && (list = upvoteList.upvotes) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (C1358940lT2.LIZJ(upvoteList) != null) {
            i = 1;
            if (C1358940lT2.LIZJ(upvoteList) != null && size > 1) {
                i = 2;
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("click_from", str5);
        c2344009Gk.LJIIIIZZ("panel_style", "list");
        c2344009Gk.LIZJ(i, "is_self");
        c2344009Gk.LIZJ(size, "repost_num");
        c2344009Gk.LJIIIIZZ("click_position", str8);
        C1358170lRn.LIZ(c2344009Gk, "aggregate_notice_type", str7);
        if (C123100dR.LIZ(str6)) {
            c2344009Gk.LJFF("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str6))));
        }
        C20684815ws.LJIILLIIL("enter_recommend_panel", c2344009Gk.LIZ);
    }

    public static void LJIIZILJ(C1358550lSP c1358550lSP, String str, String str2, String str3, User user, Aweme aweme, UpvoteStruct upvoteStruct, String str4, int i) {
        String uid;
        String uid2;
        Integer numValueOf;
        String strLIZLLL;
        String aid;
        User author;
        IMAIMojiSticker iMAIMojiStickerLIZJ = null;
        if ((i & 64) != 0) {
            str4 = null;
        }
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("panel_enter_from", str2);
        c2344009Gk.LJIIIIZZ("message_type", str3);
        String str5 = "";
        if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str5 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str5);
        if (user != null) {
            uid2 = user.getUid();
        } else {
            uid2 = null;
        }
        c2344009Gk.LJIIIIZZ("to_user_id", uid2);
        if (user != null) {
            numValueOf = Integer.valueOf(user.getFollowStatus());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "follow_status");
        if (upvoteStruct != null) {
            strLIZLLL = C1359720lUI.LIZLLL(upvoteStruct);
        } else {
            strLIZLLL = null;
        }
        c2344009Gk.LIZJ(C703302op.LIZ(strLIZLLL) ? 1 : 0, "with_recommendation");
        c2344009Gk.LJIIIIZZ("sticker_content", str4);
        c2344009Gk.LIZJ(0, "input_style");
        c2344009Gk.LIZJ(C424430Gkb.LIZ() ? 1 : 0, "is_ai_emoji");
        c2344009Gk.LIZJ(0, "is_shorten_path");
        C1358170lRn.LIZJ(c2344009Gk, upvoteStruct);
        if (upvoteStruct != null) {
            iMAIMojiStickerLIZJ = C1359720lUI.LIZJ(upvoteStruct);
        }
        C1358170lRn.LIZIZ(c2344009Gk, iMAIMojiStickerLIZJ);
        C20684815ws.LJIILLIIL("repost_panel_message", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10) {
        String str11;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        C1358170lRn.LIZ(c2344009Gk, "aggregate_notice_type", str4);
        c2344009Gk.LJIIIIZZ("group_id", str5);
        c2344009Gk.LJIIIIZZ("like_type", str6);
        c2344009Gk.LJIIIIZZ("liked_uid", str7);
        c2344009Gk.LJ(num, "follow_status");
        C1358170lRn.LIZ(c2344009Gk, "repost_id", str8);
        C1358170lRn.LIZ(c2344009Gk, "reply_id", str9);
        if (C123100dR.LIZ(str10)) {
            C1358170lRn.LIZ(c2344009Gk, "is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str10))));
        }
        if (Intrinsics.LJFF(str, "like")) {
            str11 = "ttsocial_repost_panel_like_repost";
        } else if (!Intrinsics.LJFF(str, "cancel_like")) {
            return;
        } else {
            str11 = "ttsocial_repost_panel_like_repost_cancel";
        }
        C20684815ws.LJIILLIIL(str11, c2344009Gk.LIZ);
    }

    public static void LJJ(int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (!C1697810uHb.LJIIJJI("ttsocial_repost_panel_view_more_replies_show", "ttsocial_repost_panel_view_more_replies_click", "ttsocial_repost_panel_hide_reply_show", "ttsocial_repost_panel_hide_reply_click").contains(str)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        C1358170lRn.LIZ(c2344009Gk, "aggregate_notice_type", str4);
        c2344009Gk.LJIIIIZZ("group_id", str5);
        c2344009Gk.LIZJ(i, "follow_status");
        c2344009Gk.LJIIIIZZ("reposter_uid", str6);
        c2344009Gk.LIZJ(i2, "with_text");
        c2344009Gk.LIZJ(i3, "hide_reply_num");
        c2344009Gk.LJIIIIZZ("repost_id", str7);
        if (C123100dR.LIZ(str8)) {
            C1358170lRn.LIZ(c2344009Gk, "is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str8))));
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LJIILJJIL(C1358550lSP c1358550lSP, String str, String str2, UpvoteStruct upvoteStruct, User user, String str3, boolean z, String str4, String str5, String str6, Boolean bool, int i) {
        String uid;
        User user2;
        Integer numValueOf;
        User user3;
        User user4;
        Integer numValueOf2 = null;
        if ((i & 8) != 0) {
            user = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        if ((i & 256) != 0) {
            str5 = null;
        }
        if ((i & 512) != 0) {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            bool = null;
        }
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (upvoteStruct != null && (user4 = upvoteStruct.user) != null) {
            uid = user4.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        if (upvoteStruct != null) {
            user2 = upvoteStruct.user;
        } else {
            user2 = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIILLIIL(user2) ? 1 : 0, "is_self");
        if (upvoteStruct != null && (user3 = upvoteStruct.user) != null) {
            numValueOf = Integer.valueOf(user3.getFollowStatus());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "follow_status");
        c2344009Gk.LJIIIIZZ("click_area", str3);
        c2344009Gk.LIZJ(z ? 1 : 0, "unread_label_show");
        c2344009Gk.LJIIIIZZ("panel_style", "list");
        C1358170lRn.LIZ(c2344009Gk, "is_self", Integer.valueOf(C10EU.LJIILLIIL(user) ? 1 : 0));
        c2344009Gk.LJIIIIZZ("text_type", C1358170lRn.LJFF(str4));
        C1358170lRn.LIZ(c2344009Gk, "comment_id", str5);
        C1358170lRn.LIZ(c2344009Gk, "repost_type", str6);
        if (bool != null) {
            numValueOf2 = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        C1358170lRn.LIZ(c2344009Gk, "has_explanatory_line", numValueOf2);
        if (upvoteStruct != null) {
            C1358170lRn.LIZJ(c2344009Gk, upvoteStruct);
        }
        C20684815ws.LJIILLIIL("recommend_panel_cell_click", c2344009Gk.LIZ);
    }

    public static void LJIJJLI(C1358550lSP c1358550lSP, String str, String str2, Aweme aweme, String str3, String str4, int i, String str5, String str6, String str7, String str8, int i2) {
        String aid;
        User author;
        String aid2;
        UpvoteStruct upvoteStructLIZJ;
        String str9 = str5;
        String str10 = str6;
        String str11 = str7;
        String str12 = str8;
        String uid = null;
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        if ((i2 & 64) != 0) {
            str9 = null;
        }
        if ((i2 & 128) != 0) {
            str10 = null;
        }
        if ((i2 & 256) != 0) {
            str11 = null;
        }
        if ((i2 & 512) != 0) {
            str12 = null;
        }
        c1358550lSP.getClass();
        if (str12 == null) {
            C1358880lSw c1358880lSw = C1358880lSw.LIZ;
            if (aweme == null || (aid2 = aweme.getAid()) == null) {
                aid2 = "";
            }
            c1358880lSw.getClass();
            UpvoteList upvoteListLJFF = C1358880lSw.LJFF(aid2);
            if (upvoteListLJFF != null && (upvoteStructLIZJ = C1358940lT2.LIZJ(upvoteListLJFF)) != null && upvoteStructLIZJ.repostItemSource == 1) {
                str12 = "video_comment";
            } else {
                str12 = "video";
            }
        }
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair(str, "enter_from");
        pairArr[1] = new Pair(str2, "enter_method");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        pairArr[2] = new Pair(aid, "group_id");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        }
        pairArr[3] = new Pair(uid, "author_id");
        pairArr[4] = new Pair(str3, "action_type");
        pairArr[5] = new Pair(str4, "panel_style");
        pairArr[6] = new Pair(Integer.valueOf(i), "is_show_note_guide");
        pairArr[7] = new Pair(str9, "click_button_type");
        pairArr[8] = new Pair(str10, "comment_id");
        pairArr[9] = new Pair(str11, "comment_uid");
        pairArr[10] = new Pair(str12, "repost_type");
        C20684815ws.LJIJI("repost_text_entrance", pairArr);
    }

    public static void LJIILIIL(C1358550lSP c1358550lSP, String str, String str2, Aweme aweme, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, int i) {
        String aid;
        User author;
        String uid = null;
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        if ((i & 256) != 0) {
            str7 = null;
        }
        if ((i & 512) != 0) {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            str9 = null;
        }
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_type", str2);
        C1358170lRn.LIZ(c2344009Gk, "aggregate_notice_type", str8);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("panel_source", "recommend_panel");
        c2344009Gk.LJIIIIZZ("button_name", str3);
        C1358170lRn.LIZ(c2344009Gk, "author_uid", str4);
        C1358170lRn.LIZ(c2344009Gk, "follow_status", num);
        C1358170lRn.LIZ(c2344009Gk, "repost_id", str5);
        C1358170lRn.LIZ(c2344009Gk, "reply_id", str6);
        C1358170lRn.LIZ(c2344009Gk, "share_repost_type", str7);
        C1358170lRn.LIZ(c2344009Gk, "comment_id", str9);
        C20684815ws.LJIILLIIL("ttsocial_repost_panel_btn_click", c2344009Gk.LIZ);
    }

    public static void LJI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, Integer num, int i2) {
        String strLJFF;
        if (!C1697810uHb.LJIIJJI("enter_text", "ttsocial_repost_reply_publish", "ttsocial_repost_reply_publish_response").contains(str)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("group_id", str4);
        c2344009Gk.LJIIIIZZ("publish_reply_type", str6);
        c2344009Gk.LJIIIIZZ("replied_repost_type", str5);
        c2344009Gk.LJIIIIZZ("replied_uid", str7);
        c2344009Gk.LIZJ(i, "follow_status");
        c2344009Gk.LIZJ(i2, "is_mention");
        if (str8 != null) {
            strLJFF = C1358170lRn.LJFF(str8);
        } else {
            strLJFF = null;
        }
        C1358170lRn.LIZ(c2344009Gk, "content_type", strLJFF);
        C1358170lRn.LIZ(c2344009Gk, "repost_id", str9);
        C1358170lRn.LIZ(c2344009Gk, "reply_id", str10);
        C1358170lRn.LIZ(c2344009Gk, "result_code", num);
        if (C123100dR.LIZ(str11)) {
            c2344009Gk.LJFF("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str11))));
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJII(String str, String str2, UpvotePublishMobParam upvotePublishMobParam, String str3, String str4, String str5, String str6, int i, String str7, String str8, C453740Hqm c453740Hqm, Integer num, int i2, String str9) {
        int i3;
        Integer numValueOf;
        Set<String> set;
        String str10;
        UpvoteStruct upvoteStructLIZJ;
        int iLJI = C1358170lRn.LJI(str6);
        ?? BooleanValue = 0;
        if (c453740Hqm == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        String str11 = upvotePublishMobParam.repostType;
        String str12 = null;
        if (str11 == null) {
            C1358880lSw c1358880lSw = C1358880lSw.LIZ;
            if (str3 == null) {
                str10 = "";
            } else {
                str10 = str3;
            }
            c1358880lSw.getClass();
            UpvoteList upvoteListLJFF = C1358880lSw.LJFF(str10);
            if (upvoteListLJFF != null && (upvoteStructLIZJ = C1358940lT2.LIZJ(upvoteListLJFF)) != null && upvoteStructLIZJ.repostItemSource == 1) {
                str11 = "video_comment";
            } else {
                str11 = "video";
            }
        }
        String str13 = upvotePublishMobParam.publishRepostTextEnterMethod;
        if (str13 == null) {
            str13 = str2;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobPublishText enter_method override=");
            sbLIZ.append(upvotePublishMobParam.publishRepostTextEnterMethod);
            sbLIZ.append(" (origin=");
            sbLIZ.append(str2);
            sbLIZ.append(')');
            C429430Gsf.LIZ("RepostMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str13);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        if (str6 != null) {
            numValueOf = Integer.valueOf(str6.length());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "length");
        c2344009Gk.LIZJ(iLJI, "has_emoji");
        c2344009Gk.LJIIIIZZ("follow_status", str5);
        c2344009Gk.LJIIIIZZ("panel_style", str8);
        c2344009Gk.LIZJ(i, "mention_cnt");
        c2344009Gk.LJIIIIZZ("mention_uid", str7);
        c2344009Gk.LIZJ(i3, "has_social_avatar_reaction");
        if (c453740Hqm != null && (set = c453740Hqm.LLILZIL) != null) {
            str12 = (String) C13LP.LJJJLIIL(set);
        }
        c2344009Gk.LJIIIIZZ("avatar_expression", str12);
        c2344009Gk.LJ(num, "avatar_position");
        c2344009Gk.LIZJ(i2, "is_show_note_guide");
        Boolean bool = upvotePublishMobParam.withRecommend;
        if (bool != null) {
            BooleanValue = bool.booleanValue();
        }
        C1358170lRn.LIZ(c2344009Gk, "with_recommend", Integer.valueOf((int) BooleanValue));
        C1358170lRn.LIZ(c2344009Gk, "share_to_private_chat_num", upvotePublishMobParam.messageCount);
        C1358170lRn.LIZ(c2344009Gk, "share_to_group_member_cnt", upvotePublishMobParam.groupMemberCount);
        C1358170lRn.LIZ(c2344009Gk, "panel_detail", str9);
        c2344009Gk.LJIIIIZZ("repost_type", str11);
        String str14 = upvotePublishMobParam.commentId;
        if (str14 != null) {
            c2344009Gk.LJFF("comment_id", str14);
        }
        String str15 = upvotePublishMobParam.commentUid;
        if (str15 != null) {
            c2344009Gk.LJFF("comment_uid", str15);
        }
        String str16 = upvotePublishMobParam.relationTag;
        if (str16 != null) {
            c2344009Gk.LJFF("relation_tag", str16);
        }
        C20684815ws.LJIILLIIL("publish_repost_text", c2344009Gk.LIZ);
    }
}
