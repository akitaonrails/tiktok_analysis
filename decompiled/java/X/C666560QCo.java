package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C666560QCo {
    public static final C666550QCn LIZ = new AbstractC666570QCp() { // from class: X.0QCn
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            String str3;
            if (c653660PkS == null || (str2 = c653660PkS.LJIIJ) == null) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            C650950Pg5.Companion.getClass();
            C0PRW c0prwLIZIZ = C646000PVm.LIZIZ();
            if (c0prwLIZIZ == null || (str3 = c0prwLIZIZ.searchId) == null) {
                return "";
            }
            return str3;
        }
    };
    public static final C666590QCr LIZIZ = new AbstractC666570QCp() { // from class: X.0QCr
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            String str3;
            if (c653660PkS == null || (str2 = c653660PkS.LJFF) == null) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            C650950Pg5.Companion.getClass();
            C0PRW c0prwLIZIZ = C646000PVm.LIZIZ();
            if (c0prwLIZIZ == null || (str3 = c0prwLIZIZ.searchKeyword) == null) {
                return "";
            }
            return str3;
        }
    };
    public static final C666540QCm LIZJ = new AbstractC666570QCp() { // from class: X.0QCm
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            return C659130PtH.LIZ(aweme);
        }
    };
    public static final C666490QCh LIZLLL = new AbstractC666570QCp() { // from class: X.0QCh
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            User author;
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            return C662620Pyu.LIZ(author);
        }
    };
    public static final C666630QCv LJ = new AbstractC666570QCp() { // from class: X.0QCv
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            Function1<? super Aweme, String> function1;
            String strInvoke;
            if (c653660PkS == null || (function1 = c653660PkS.LJJLI) == null || (strInvoke = function1.invoke(aweme)) == null) {
                return "";
            }
            return strInvoke;
        }
    };
    public static final C666520QCk LJFF = new AbstractC666570QCp() { // from class: X.0QCk
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            if (c653660PkS == null || (str2 = c653660PkS.LIZLLL) == null) {
                return "";
            }
            return str2;
        }
    };
    public static final C666620QCu LJI = new AbstractC666570QCp() { // from class: X.0QCu
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            if (Intrinsics.LJFF(str, "search_result")) {
                return "video_search";
            }
            return str;
        }
    };
    public static final C666670QCz LJII = new AbstractC666570QCp() { // from class: X.0QCz
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            if (c653660PkS == null || (str2 = c653660PkS.LJIIJJI) == null) {
                return "";
            }
            return str2;
        }
    };
    public static final C666500QCi LJIIIIZZ = new AbstractC666570QCp() { // from class: X.0QCi
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            if (C1823107Cb.LIZ() || c653660PkS == null || (str2 = c653660PkS.LJJJI) == null) {
                return "";
            }
            return str2;
        }
    };
    public static final C666510QCj LJIIIZ = new AbstractC666570QCp() { // from class: X.0QCj
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            if (C1823107Cb.LIZ() || c653660PkS == null || (str2 = c653660PkS.LJJJ) == null) {
                return "";
            }
            return str2;
        }
    };
    public static final C666660QCy LJIIJ = new AbstractC666570QCp() { // from class: X.0QCy
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            if (c653660PkS == null || (str2 = c653660PkS.LJIIIZ) == null) {
                return "";
            }
            return str2;
        }
    };
    public static final C0QD1 LJIIJJI = new AbstractC666570QCp() { // from class: X.0QD1
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            if (c653660PkS == null || (str2 = c653660PkS.LJIILJJIL) == null) {
                return "";
            }
            return str2;
        }
    };
    public static final C0QD0 LJIIL = new AbstractC666570QCp() { // from class: X.0QD0
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            if (c653660PkS == null || (str2 = c653660PkS.LJJLIIIIJ) == null) {
                return "";
            }
            return str2;
        }
    };
    public static final C666480QCg LJIILIIL = new AbstractC666570QCp() { // from class: X.0QCg
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String aid;
            HashMap<String, String> searchExtraParams;
            String str2;
            Function1<? super Aweme, String> function1;
            String strInvoke;
            C649470Pdh.LIZ.getClass();
            String str3 = "";
            if (C649470Pdh.LJIILLIIL(aweme)) {
                return "";
            }
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            if (c653660PkS != null && (function1 = c653660PkS.LJJLIIIJL) != null && (strInvoke = function1.invoke(aweme)) != null) {
                str3 = strInvoke;
            }
            if (str3.length() > 0) {
                aid = str3;
            }
            if (aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null && (str2 = searchExtraParams.get("search_item_poi_id")) != null) {
                return str2;
            }
            return aid;
        }
    };
    public static final C666640QCw LJIILJJIL = new AbstractC666570QCp() { // from class: X.0QCw
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            Function1<? super Aweme, String> function1;
            String strInvoke;
            if (c653660PkS == null || (function1 = c653660PkS.LJJLIIIJLJLI) == null || (strInvoke = function1.invoke(aweme)) == null) {
                return "";
            }
            return strInvoke;
        }
    };
    public static final C0QD2 LJIILL = new AbstractC666570QCp() { // from class: X.0QD2
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            String str2;
            if (c653660PkS == null || (str2 = c653660PkS.LJJII) == null) {
                return "";
            }
            return str2;
        }
    };
    public static final C666600QCs LJIILLIIL = new AbstractC666570QCp() { // from class: X.0QCs
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            Integer numValueOf;
            if (c653660PkS != null) {
                numValueOf = Integer.valueOf(c653660PkS.LJJIIZ);
            } else {
                numValueOf = null;
            }
            return String.valueOf(numValueOf);
        }
    };
    public static final C666530QCl LJIIZILJ = new AbstractC666570QCp() { // from class: X.0QCl
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            return C659360Pte.LIZ(aweme);
        }
    };
    public static final C0QD3 LJIJ = new AbstractC666570QCp() { // from class: X.0QD3
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            return "1";
        }
    };
    public static final C666610QCt LJIJI = new AbstractC666570QCp() { // from class: X.0QCt
        @Override // X.AbstractC666570QCp
        public final String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS) {
            User author;
            String uid;
            if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
                return "";
            }
            return uid;
        }
    };
    public static final ConcurrentHashMap<String, WeakReference<C653660PkS>> LJIJJ = new ConcurrentHashMap<>();

    public static void LIZ(int i) {
        C666550QCn c666550QCn = LIZ;
        C666580QCq.LIZJ("search_result_show_video", "search_id", c666550QCn, i);
        C666590QCr c666590QCr = LIZIZ;
        C666580QCq.LIZJ("search_result_show_video", "search_keyword", c666590QCr, i);
        C666670QCz c666670QCz = LJII;
        C666580QCq.LIZJ("search_result_show_video", "impr_id", c666670QCz, i);
        C0QD1 c0qd1 = LJIIJJI;
        C666580QCq.LIZJ("search_result_show_video", "log_pb", c0qd1, i);
        C666630QCv c666630QCv = LJ;
        C666580QCq.LIZJ("search_result_show_video", "search_result_id", c666630QCv, i);
        C666540QCm c666540QCm = LIZJ;
        C666580QCq.LIZJ("search_result_show_video", "video_tag", c666540QCm, i);
        C666580QCq.LIZJ("search_result_show_partial", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("search_result_show_partial", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("search_result_show_partial", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("search_result_show_partial", "log_pb", c0qd1, i);
        C666580QCq.LIZJ("search_result_show_partial", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("search_result_show_partial", "video_tag", c666540QCm, i);
        C666580QCq.LIZJ("search_result_show", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("search_result_show", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("search_result_show", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("search_result_show", "log_pb", c0qd1, i);
        C666580QCq.LIZJ("search_result_show", "search_result_id", c666630QCv, i);
        C665580Q8u c665580Q8u = C665580Q8u.LIZIZ;
        C666520QCk c666520QCk = LJFF;
        c665580Q8u.LIZLLL("search_result_show", c666520QCk, i);
        C666580QCq.LIZJ("search_result_click", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("search_result_click", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("search_result_click", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("search_result_click", "log_pb", c0qd1, i);
        C666580QCq.LIZJ("search_result_click", "search_result_id", c666630QCv, i);
        c665580Q8u.LIZLLL("search_result_click", c666520QCk, i);
        C666580QCq.LIZJ("feed_enter", "video_tag", c666540QCm, i);
        C666490QCh c666490QCh = LIZLLL;
        C666580QCq.LIZJ("feed_enter", "user_tag", c666490QCh, i);
        C666580QCq.LIZJ("feed_enter", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("feed_enter", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("feed_enter", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("feed_enter", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("feed_enter", "log_pb", c0qd1, i);
        C0QD2 c0qd2 = LJIILL;
        C666580QCq.LIZJ("feed_enter", "token_type", c0qd2, i);
        C666530QCl c666530QCl = LJIIZILJ;
        C666580QCq.LIZJ("feed_enter", "anchor_info", c666530QCl, i);
        C666580QCq.LIZJ("video_play", "video_tag", c666540QCm, i);
        C666580QCq.LIZJ("video_play", "user_tag", c666490QCh, i);
        C666580QCq.LIZJ("video_play", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("video_play", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("video_play", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("video_play", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("video_play", "log_pb", c0qd1, i);
        C0QD0 c0qd0 = LJIIL;
        C666580QCq.LIZJ("video_play", "list_result_type", c0qd0, i);
        C666480QCg c666480QCg = LJIILIIL;
        C666580QCq.LIZJ("video_play", "list_item_id", c666480QCg, i);
        C666640QCw c666640QCw = LJIILJJIL;
        C666580QCq.LIZJ("video_play", "search_third_item_id", c666640QCw, i);
        C666580QCq.LIZJ("video_play", "token_type", c0qd2, i);
        C666600QCs c666600QCs = LJIILLIIL;
        C666580QCq.LIZJ("video_play", "is_quote_video", c666600QCs, i);
        C666580QCq.LIZJ("video_play", "anchor_info", c666530QCl, i);
        C666580QCq.LIZJ("play_time", "video_tag", c666540QCm, i);
        C666580QCq.LIZJ("play_time", "user_tag", c666490QCh, i);
        C666580QCq.LIZJ("play_time", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("play_time", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("play_time", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("play_time", "impr_id", c666670QCz, i);
        C666500QCi c666500QCi = LJIIIIZZ;
        C666580QCq.LIZJ("play_time", "req_visual_unified_tag_id", c666500QCi, i);
        C666510QCj c666510QCj = LJIIIZ;
        C666580QCq.LIZJ("play_time", "vs_result_feed_impr_id", c666510QCj, i);
        C666580QCq.LIZJ("play_time", "log_pb", c0qd1, i);
        C666580QCq.LIZJ("play_time", "list_result_type", c0qd0, i);
        C666580QCq.LIZJ("play_time", "list_item_id", c666480QCg, i);
        C666580QCq.LIZJ("play_time", "is_quote_video", c666600QCs, i);
        C666580QCq.LIZJ("play_time", "search_third_item_id", c666640QCw, i);
        C666580QCq.LIZJ("play_time", "token_type", c0qd2, i);
        C666580QCq.LIZJ("play_time", "anchor_info", c666530QCl, i);
        C666580QCq.LIZJ("video_play_finish", "video_tag", c666540QCm, i);
        C666580QCq.LIZJ("video_play_finish", "user_tag", c666490QCh, i);
        C666580QCq.LIZJ("video_play_finish", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("video_play_finish", "is_quote_video", c666600QCs, i);
        C666580QCq.LIZJ("video_play_finish", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("video_play_finish", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("video_play_finish", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("video_play_finish", "req_visual_unified_tag_id", c666500QCi, i);
        C666580QCq.LIZJ("video_play_finish", "vs_result_feed_impr_id", c666510QCj, i);
        C666580QCq.LIZJ("video_play_finish", "log_pb", c0qd1, i);
        C666580QCq.LIZJ("video_play_finish", "list_result_type", c0qd0, i);
        C666580QCq.LIZJ("video_play_finish", "list_item_id", c666480QCg, i);
        C666580QCq.LIZJ("video_play_finish", "search_third_item_id", c666640QCw, i);
        C666580QCq.LIZJ("video_play_finish", "token_type", c0qd2, i);
        C666580QCq.LIZJ("video_play_finish", "anchor_info", c666530QCl, i);
        C666580QCq.LIZJ("enter_personal_detail", "video_tag", c666540QCm, i);
        C666580QCq.LIZJ("enter_personal_detail", "user_tag", c666490QCh, i);
        C666580QCq.LIZJ("enter_personal_detail", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("enter_personal_detail", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("enter_personal_detail", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("enter_personal_detail", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("enter_tag_detail", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("enter_tag_detail", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("enter_tag_detail", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("enter_tag_detail", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("enter_music_detail", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("enter_music_detail", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("enter_music_detail", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("enter_music_detail", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("follow", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("follow", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("follow", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("follow", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("like", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("like", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("like", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("like", "impr_id", c666670QCz, i);
        C666610QCt c666610QCt = LJIJI;
        C666580QCq.LIZJ("like", "to_user_id", c666610QCt, i);
        C666580QCq.LIZJ("like_cancel", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("like_cancel", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("like_cancel", "search_type", c666520QCk, i);
        C666580QCq.LIZJ("like_cancel", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("like_cancel", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("like_cancel", "is_search_scene", LJIJ, i);
        C666580QCq.LIZJ("like_cancel", "to_user_id", c666610QCt, i);
        C666580QCq.LIZJ("click_comment_button", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("click_comment_button", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("click_comment_button", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("click_comment_button", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("click_comment_button", "search_type", c666520QCk, i);
        C666580QCq.LIZJ("post_comment", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("post_comment", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("post_comment", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("post_comment", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("click_more_button", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("click_more_button", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("click_more_button", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("click_more_button", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("click_more_button", "search_type", c666520QCk, i);
        C666580QCq.LIZJ("like_comment", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("like_comment", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("like_comment", "search_type", c666520QCk, i);
        C666580QCq.LIZJ("cancel_like_comment", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("cancel_like_comment", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("cancel_like_comment", "search_type", c666520QCk, i);
        C666580QCq.LIZJ("share_video", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("share_video", "search_keyword", c666590QCr, i);
        C666580QCq.LIZJ("share_video", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("share_video", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("search_video_play_finish", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("search_video_play_finish", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("search_video_play", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("search_video_play", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("search_play_time", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("search_play_time", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("search_follow", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("search_follow", "impr_id", c666670QCz, i);
        C666580QCq.LIZJ("tiktok_video_anchor_view", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("tiktok_video_anchor_view", "search_result_id", c666630QCv, i);
        C666620QCu c666620QCu = LJI;
        C666580QCq.LIZJ("tiktok_video_anchor_view", "enter_from", c666620QCu, i);
        C666580QCq.LIZJ("tiktok_video_anchor_click", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("tiktok_video_anchor_click", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("tiktok_video_anchor_click", "enter_from", c666620QCu, i);
        C666580QCq.LIZJ("tiktokec_product_show", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("tiktokec_product_show", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("tiktokec_product_show", "enter_from", c666620QCu, i);
        C666580QCq.LIZJ("tiktokec_product_click", "search_id", c666550QCn, i);
        C666580QCq.LIZJ("tiktokec_product_click", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("tiktokec_product_click", "enter_from", c666620QCu, i);
        C666580QCq.LIZJ("tiktokec_enter_product_detail", "search_id", c666630QCv, i);
        C666580QCq.LIZJ("tiktokec_enter_product_detail", "search_result_id", c666630QCv, i);
        C666580QCq.LIZJ("tiktokec_enter_product_detail", "enter_from", c666620QCu, i);
        C666580QCq.LIZJ("tiktokec_enter_product_detail", "enter_method", LJIIJ, i);
    }

    public static void LIZIZ(C653660PkS c653660PkS) {
        Map<String, Object> mapLIZLLL;
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        if (interfaceC649890PeNLIZ != null) {
            mapLIZLLL = interfaceC649890PeNLIZ.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        if (c653660PkS != null) {
            if (mapLIZLLL != null) {
                mapLIZLLL.put(C653670PkT.class.getSimpleName(), new WeakReference(c653660PkS));
            }
        } else {
            if (mapLIZLLL == null) {
                return;
            }
            mapLIZLLL.remove(C653670PkT.class.getSimpleName());
        }
    }

    public static void LIZJ(int i) {
        Iterator it2 = ((HashMap) C666580QCq.LIZ).values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((Set) it2.next()).iterator();
            while (it3.hasNext()) {
                if (((C666650QCx) it3.next()).LIZJ == i) {
                    it3.remove();
                }
            }
        }
    }
}
