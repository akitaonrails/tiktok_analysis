package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0gWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169160gWw {
    public static final C1169160gWw LIZ = new C1169160gWw();

    public static void LJFF(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("panel_source", str2);
        C20684815ws.LJIILLIIL("create_playlist", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        C20684815ws.LJIILLIIL("edit_playlist", c2344009Gk.LIZ);
    }

    public static void LJIIZILJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("enter_playlist_selection_page", c2344009Gk.LIZ);
    }

    public static void LJIJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("enter_playlist_intro_page", c2344009Gk.LIZ);
    }

    public static void LJIJI(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("enter_playlist_name_page", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        C20684815ws.LJIILLIIL("add_multiple_playlist_video_fail", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_discard");
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        C20684815ws.LJIILLIIL("cancel_editing_playlist", c2344009Gk.LIZ);
    }

    public static void LJ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        c2344009Gk.LJIIIIZZ("playlist_status", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        C20684815ws.LJIILLIIL("add_split_to_playlist", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(int i, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", "manage_video");
        c2344009Gk.LIZJ(i, "add_cnt");
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        C20684815ws.LJIILLIIL("add_multiple_playlist_video", c2344009Gk.LIZ);
    }

    public static void LJIL(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        C20684815ws.LJIILLIIL("remove_multiple_playlist_video", c2344009Gk.LIZ);
    }

    public static void LJJI(String str, String str2, Aweme aweme) {
        String uid;
        User author;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "playlist");
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        c2344009Gk.LJIIIIZZ("playlist_previous_page", str2);
        String groupId = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        if (aweme != null) {
            groupId = aweme.getGroupId();
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        C20684815ws.LJIILLIIL("playlist_item_show", c2344009Gk.LIZ);
    }

    public static void LJJIFFI(Aweme aweme, String str, C1169150gWv c1169150gWv) {
        String uid;
        String str2;
        Integer numIsFromVideo;
        String str3;
        String str4;
        String str5;
        User author;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "general_search");
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        String groupId = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        if (c1169150gWv == null || (str2 = c1169150gWv.searchId) == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("search_id", str2);
        if (c1169150gWv != null) {
            numIsFromVideo = c1169150gWv.isFromVideo();
        } else {
            numIsFromVideo = null;
        }
        c2344009Gk.LJ(numIsFromVideo, "is_from_video");
        if (c1169150gWv != null) {
            str3 = c1169150gWv.searchType;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("search_type", str3);
        if (c1169150gWv != null) {
            str4 = c1169150gWv.searchResultId;
        } else {
            str4 = null;
        }
        if (C703302op.LIZ(str4)) {
            if (c1169150gWv != null) {
                str5 = c1169150gWv.searchResultId;
            } else {
                str5 = null;
            }
            c2344009Gk.LJFF("search_result_id", str5);
        }
        if (aweme != null) {
            groupId = aweme.getGroupId();
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        C20684815ws.LJIILLIIL("playlist_panel_click", c2344009Gk.LIZ);
    }

    public static void LJIILJJIL(Integer num, Integer num2, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "playlist_post_cnt");
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "is_sub_only_playlist");
        }
        C20684815ws.LJIILLIIL("delete_playlist", c2344009Gk.LIZ);
    }

    public static void LJIIJ(int i, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("playlist_id", str2);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        c2344009Gk.LIZJ(i, "order");
        C20684815ws.LJIILLIIL("choose_playlist_video", c2344009Gk.LIZ);
    }

    public static void LJI(Aweme aweme, String str, String str2, C1169150gWv c1169150gWv, String str3, String str4, String str5) {
        String uid;
        String str6;
        Integer numIsFromVideo;
        String str7;
        String str8;
        String str9;
        User author;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        String groupId = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        if (c1169150gWv == null || (str6 = c1169150gWv.searchId) == null) {
            str6 = "";
        }
        c2344009Gk.LJIIIIZZ("search_id", str6);
        if (c1169150gWv != null) {
            numIsFromVideo = c1169150gWv.isFromVideo();
        } else {
            numIsFromVideo = null;
        }
        c2344009Gk.LJ(numIsFromVideo, "is_from_video");
        if (c1169150gWv != null) {
            str7 = c1169150gWv.searchType;
        } else {
            str7 = null;
        }
        c2344009Gk.LJIIIIZZ("search_type", str7);
        if (c1169150gWv != null) {
            str8 = c1169150gWv.searchResultId;
        } else {
            str8 = null;
        }
        if (C703302op.LIZ(str8)) {
            if (c1169150gWv != null) {
                str9 = c1169150gWv.searchResultId;
            } else {
                str9 = null;
            }
            c2344009Gk.LJFF("search_result_id", str9);
        }
        if (C703302op.LIZ(str3)) {
            c2344009Gk.LJFF("enter_method", str3);
        }
        if (C703302op.LIZ(str4)) {
            c2344009Gk.LJFF("playlist_previous_page", str4);
        }
        c2344009Gk.LJIIIIZZ("playlist_session_id", str5);
        if (aweme != null) {
            groupId = aweme.getGroupId();
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        C20684815ws.LJIILLIIL("enter_playlist", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, int i, String str2, String str3, String str4, Integer num, Integer num2, Integer num3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "video_cnt");
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        if (str4 != null) {
            c2344009Gk.LJFF("choose_item_set", str4);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "sub_only_content_cnt");
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "playlist_post_cnt");
        }
        if (num3 != null) {
            c2344009Gk.LIZJ(num3.intValue(), "is_sub_only_playlist");
        }
        C20684815ws.LJIILLIIL("post_creating_playlist", c2344009Gk.LIZ);
    }

    public static void LJIJJLI(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str3);
        c2344009Gk.LJ(num, "video_cnt");
        c2344009Gk.LJIIIIZZ("group_list", str4);
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "sub_only_content_cnt");
        }
        if (num3 != null) {
            c2344009Gk.LIZJ(num3.intValue(), "playlist_post_cnt");
        }
        if (num4 != null) {
            c2344009Gk.LIZJ(num4.intValue(), "is_sub_only_playlist");
        }
        C20684815ws.LJIILLIIL("remove_playlist_video", c2344009Gk.LIZ);
    }

    public static void LJII(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str3);
        c2344009Gk.LJIIIIZZ("action_type", str4);
        c2344009Gk.LJ(num, "video_cnt");
        c2344009Gk.LJIIIIZZ("group_list", str5);
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "sub_only_content_cnt");
        }
        if (num3 != null) {
            c2344009Gk.LIZJ(num3.intValue(), "playlist_post_cnt");
        }
        if (num4 != null) {
            c2344009Gk.LIZJ(num4.intValue(), "is_sub_only_playlist");
        }
        C20684815ws.LJIILLIIL("add_playlist_video", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4, Float f, String str5, C1169150gWv c1169150gWv, Integer num, Integer num2, Integer num3) {
        String str6;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str5);
        c2344009Gk.LJIIIIZZ("playlist_id", str2);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        if (c1169150gWv != null) {
            String str7 = c1169150gWv.searchId;
            if (str7 == null) {
                str7 = "";
            }
            c2344009Gk.LJFF("search_id", str7);
            c2344009Gk.LJ(c1169150gWv.isFromVideo(), "is_from_video");
            c2344009Gk.LJFF("search_type", c1169150gWv.searchType);
        }
        String str8 = null;
        if (c1169150gWv != null) {
            str6 = c1169150gWv.searchResultId;
        } else {
            str6 = null;
        }
        if (C703302op.LIZ(str6)) {
            if (c1169150gWv != null) {
                str8 = c1169150gWv.searchResultId;
            }
            c2344009Gk.LJFF("search_result_id", str8);
        }
        if (f != null) {
            c2344009Gk.LIZIZ(f.floatValue(), "video_current_time");
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue() / LSPassThroughRecordSizeConfig.DEFAULT, "vDuration");
        }
        c2344009Gk.LJ(num2, "is_sub_only_group");
        c2344009Gk.LJ(num3, "is_sub_only_playlist");
        C20684815ws.LJIILLIIL("click_playlist_entrance", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("add_group_id", str3);
        c2344009Gk.LJ(num, "add_video_cnt");
        c2344009Gk.LJIIIIZZ("remove_group_id", str4);
        c2344009Gk.LJ(num2, "remove_video_cnt");
        c2344009Gk.LJ(num3, "is_reorder_playlist");
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        if (num4 != null) {
            c2344009Gk.LIZJ(num4.intValue(), "sub_only_content_cnt");
        }
        if (num5 != null) {
            c2344009Gk.LIZJ(num5.intValue(), "playlist_post_cnt");
        }
        if (num6 != null) {
            c2344009Gk.LIZJ(num6.intValue(), "is_sub_only_playlist");
        }
        C20684815ws.LJIILLIIL("complete_editing_playlist", c2344009Gk.LIZ);
    }

    public static void LJIJJ(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("playlist_previous_page", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str3);
        c2344009Gk.LJ(num, "playlist_item_cnt");
        c2344009Gk.LJIIIIZZ("author_id", str6);
        c2344009Gk.LJ(num4, "inflow_vv");
        c2344009Gk.LJIIIIZZ("from_group_id", str4);
        c2344009Gk.LJ(num2, "from_item_index");
        c2344009Gk.LJIIIIZZ("to_group_id", str5);
        c2344009Gk.LJ(num3, "to_item_index");
        c2344009Gk.LJIIIIZZ("playlist_session_id", str7);
        C20684815ws.LJIILLIIL("leave_playlist_detail", c2344009Gk.LIZ);
    }

    public static void LJJ(C1169160gWw c1169160gWw, String str, String str2, String str3, String str4, String str5, String str6, String str7, C1169150gWv c1169150gWv, Integer num, Integer num2, Integer num3, int i) {
        Integer numIsFromVideo;
        String str8;
        String str9;
        String str10;
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        }
        if ((i & 64) != 0) {
            str7 = "";
        }
        String str11 = null;
        if ((i & 128) != 0) {
            c1169150gWv = null;
        }
        if ((i & 256) != 0) {
            num = null;
        }
        if ((i & 512) != 0) {
            num2 = null;
        }
        if ((i & 1024) != 0) {
            num3 = 0;
        }
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("playlist_id", str2);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        if (c1169150gWv != null && (str10 = c1169150gWv.searchId) != null) {
            str5 = str10;
        }
        c2344009Gk.LJIIIIZZ("search_id", str5);
        c2344009Gk.LJIIIIZZ("search_result_id", str6);
        c2344009Gk.LJIIIIZZ("search_keyword", str7);
        if (c1169150gWv != null) {
            numIsFromVideo = c1169150gWv.isFromVideo();
        } else {
            numIsFromVideo = null;
        }
        c2344009Gk.LJ(numIsFromVideo, "is_from_video");
        if (c1169150gWv != null) {
            str8 = c1169150gWv.searchType;
        } else {
            str8 = null;
        }
        c2344009Gk.LJIIIIZZ("search_type", str8);
        if (c1169150gWv != null) {
            str9 = c1169150gWv.searchResultId;
        } else {
            str9 = null;
        }
        if (C703302op.LIZ(str9)) {
            if (c1169150gWv != null) {
                str11 = c1169150gWv.searchResultId;
            }
            c2344009Gk.LJFF("search_result_id", str11);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue() / LSPassThroughRecordSizeConfig.DEFAULT, "vDuration");
        }
        c2344009Gk.LJ(num2, "is_sub_only_group");
        c2344009Gk.LJ(num3, "is_sub_only_playlist");
        C20684815ws.LJIILLIIL("show_playlist_entrance", c2344009Gk.LIZ);
    }

    public static void LJIILL(C1169160gWw c1169160gWw, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, C1169150gWv c1169150gWv, Integer num, String str9, String str10, String str11, int i2) {
        Integer numIsFromVideo;
        String str12;
        String str13;
        String str14;
        C1169150gWv c1169150gWv2 = c1169150gWv;
        String str15 = str11;
        String str16 = str10;
        String str17 = "";
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 8) != 0) {
            str4 = "";
        }
        if ((i2 & 32) != 0) {
            str5 = "";
        }
        if ((i2 & 64) != 0) {
            str6 = "";
        }
        if ((i2 & 128) != 0) {
            str7 = "";
        }
        if ((i2 & 256) == 0) {
            str17 = str8;
        }
        String str18 = null;
        if ((i2 & 512) != 0) {
            c1169150gWv2 = null;
        }
        if ((i2 & 1024) != 0) {
            num = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str16 = null;
        }
        if ((i2 & 8192) != 0) {
            str15 = null;
        }
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str5);
        c2344009Gk.LJIIIIZZ("previous_page", str);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("author_id", str3);
        c2344009Gk.LJIIIIZZ("group_id", str4);
        c2344009Gk.LJIIIIZZ("playlist_id", str2);
        c2344009Gk.LIZJ(i, "order");
        if (c1169150gWv2 != null && (str14 = c1169150gWv2.searchId) != null) {
            str6 = str14;
        }
        c2344009Gk.LJIIIIZZ("search_id", str6);
        c2344009Gk.LJIIIIZZ("search_result_id", str7);
        if (c1169150gWv2 != null) {
            numIsFromVideo = c1169150gWv2.isFromVideo();
        } else {
            numIsFromVideo = null;
        }
        c2344009Gk.LJ(numIsFromVideo, "is_from_video");
        if (c1169150gWv2 != null) {
            str12 = c1169150gWv2.searchType;
        } else {
            str12 = null;
        }
        c2344009Gk.LJIIIIZZ("search_type", str12);
        c2344009Gk.LJIIIIZZ("playlist_session_id", str9);
        c2344009Gk.LJIIIIZZ("source_video_id", str16);
        c2344009Gk.LJIIIIZZ("source_author_id", str15);
        if (c1169150gWv2 != null) {
            str13 = c1169150gWv2.searchResultId;
        } else {
            str13 = null;
        }
        if (C703302op.LIZ(str13)) {
            if (c1169150gWv2 != null) {
                str18 = c1169150gWv2.searchResultId;
            }
            c2344009Gk.LJFF("search_result_id", str18);
        }
        if (C703302op.LIZ(str17)) {
            c2344009Gk.LJFF("search_keyword", str17);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue() / LSPassThroughRecordSizeConfig.DEFAULT, "vDuration");
        }
        C20684815ws.LJIILLIIL("enter_playlist_detail", c2344009Gk.LIZ);
    }
}
