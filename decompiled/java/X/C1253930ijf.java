package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ijf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253930ijf {
    public static final C1253930ijf LIZ = new C1253930ijf();

    public static void LIZIZ(boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(z ? 1 : 0, "complete_status");
        c2344009Gk.LJIIIIZZ("enter_method", "click_hint");
        c2344009Gk.LJIIIIZZ("enter_from", "add_bio");
        C20684815ws.LJIILLIIL("enter_profile_bio", c2344009Gk.LIZ);
    }

    public static void LJ(String str) {
        String curUserId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("click_live_event_icon", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
            curUserId = "";
        }
        c2344009Gk2.LJIIIIZZ("anchor_id", curUserId);
        c2344009Gk2.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk2.LJIIIIZZ("event_page", "personal_homepage");
        c2344009Gk2.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("livesdk_live_event_list_entrance", c2344009Gk2.LIZ);
    }

    public static void LJIIIZ(C553680Lna c553680Lna) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", curUserId);
        c2344009Gk.LIZJ(0, "is_from_edit_tab");
        c2344009Gk.LIZJ(c553680Lna.LIZ, "draft_cnt");
        C20684815ws.LJIILLIIL("draft_show", c2344009Gk.LIZ);
    }

    public static void LJJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("cert", str);
        C20684815ws.LJIILLIIL("profile_permission_failuer", c2344009Gk.LIZ);
    }

    public static void LIZ(User user, String str) {
        String str2;
        String bioEmail;
        if (user != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            LIZ.getClass();
            if (C10EU.LJIILLIIL(user)) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("link_type", str);
            c2344009Gk.LJIIIIZZ("author_id", user.getUid());
            if (Intrinsics.LJFF(str, "weblink")) {
                bioEmail = user.getBioUrl();
            } else {
                bioEmail = user.getBioEmail();
            }
            c2344009Gk.LJIIIIZZ("link", bioEmail);
            C20684815ws.LJIILLIIL("click_link", c2344009Gk.LIZ);
        }
    }

    public static String LIZJ(String str, String str2) {
        List<String> listLIZ;
        String str3;
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(?:^|,)\\s*");
        Regex.Companion.getClass();
        sbLIZ.append(Pattern.quote(str2));
        sbLIZ.append("\\s*:\\s*(.*?)(?=,\\s*[A-Za-z_][A-Za-z0-9_]*\\s*:|$)");
        MatchResult matchResultFind$default = Regex.find$default(new Regex(C2188811AlT.LIZIZ(sbLIZ)), str, 0, 2, null);
        if (matchResultFind$default == null || (listLIZ = matchResultFind$default.LIZ()) == null || (str3 = (String) C13LP.LJJJLZIJ(1, listLIZ)) == null || (string = a0.LJLIIIL(str3).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public static void LJIIIIZZ(C553680Lna c553680Lna, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(c553680Lna.LIZ, "draft_cnt");
        c2344009Gk.LJIIIIZZ("method", str);
        C20684815ws.LJIILLIIL("draft_entrance_show", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("avatar_type", "photo");
        if (str != null) {
            c2344009Gk.LJFF("error_code", str);
        }
        C20684815ws.LJIILLIIL("profile_avatar_upload_result", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(String str, String str2) {
        C20684815ws.LJFF().execute(new ARunnableS113S0100000_13(new C418401jy(str2, str), (Function0<Unit>) 159));
    }

    public static void LJIJ(String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[2];
        if (z) {
            str2 = "self";
        } else {
            str2 = "others";
        }
        pairArr[0] = new Pair("profile_type", str2);
        pairArr[1] = new Pair("resource_id", str);
        C20684815ws.LJIILLIIL("profile_top_effect_badge_show", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LJIIJJI(int i, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "is_exit");
        C20684815ws.LJIILLIIL("fold_follow_card", c2344009Gk.LIZ);
    }

    public static void LJIIL(int i, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "action_type");
        C20684815ws.LJIILLIIL("follow_request_pop_up_response", c2344009Gk.LIZ);
    }

    public static void LJIILJJIL(int i, int i2, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LIZJ(i, "profile_visitor_status");
        c2344009Gk.LIZJ(i2, "viewers_cnt");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("entrance_type", "normal");
        C20684815ws.LJIILLIIL("profile_viewers_fix_entrance", c2344009Gk.LIZ);
    }

    public static void LJIIZILJ(String str, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJ(Boolean.valueOf(z), "enter_profile_detail");
        C20684815ws.LJIILLIIL("spread_follow_card", c2344009Gk.LIZ);
    }

    public static void LJII(int i, String str, long j, String str2) {
        String curUserId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("anchor_id", curUserId);
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZJ(i, "success");
        c2344009Gk.LJIIIIZZ("biz", "live_info");
        c2344009Gk.LJIIIIZZ("module", str2);
        if (str != null) {
            c2344009Gk.LJFF("reason", str);
        }
        C20684815ws.LJIILLIIL("livesdk_preloadKitView", c2344009Gk.LIZ);
    }

    public static void LJIIJ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("to_user_id", str3);
        if (str4 != null) {
            c2344009Gk.LJFF("new_fans_count", str4);
        }
        C20684815ws.LJIILLIIL("enter_relation_tab", c2344009Gk.LIZ);
    }

    public static void LJIJI(String str, String str2, String str3, String str4) {
        C20684815ws.LJIILLIIL(str, C2097608Jq.LJIIJ(new Pair("tab_name", "repost_history"), new Pair("enter_from", str2), new Pair("to_user_id", str3), new Pair("enter_method", str4)));
    }

    public static void LJIJJ(Context context, String str, int i, String str2) {
        if (context instanceof InterfaceC1603190roz) {
            C20684815ws.LJIILLIIL("tiktokec_enter_list", C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", "personal_homepage"), new Pair("enter_from", "personal_homepage"), new Pair("list_name", "favorite"), new Pair("list_num", String.valueOf(i)), new Pair("previous_page", "personal_homepage"), new Pair("previous_list_name", str), new Pair("enter_method", str2)));
        }
    }

    public static final void LJIJJLI(int i, long j, Context context, String str) {
        if ((context instanceof InterfaceC1603190roz) && Intrinsics.LJFF(str, "favorite")) {
            C20684815ws.LJIILLIIL("tiktokec_stay_list", C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", "personal_homepage"), new Pair("enter_from", "personal_homepage"), new Pair("list_name", "favorite"), new Pair("list_num", String.valueOf(i)), new Pair("previous_page", "personal_homepage"), new Pair("previous_list_name", str), new Pair("stay_time", String.valueOf(j))));
        }
    }

    public static void LJJIFFI(final String str, final String str2, final String str3, final String str4) {
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if (iCommercePromoteService != null) {
            iCommercePromoteService.LJJII();
        }
        if (!C300140Bpc.LIZ()) {
            return;
        }
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0ije
            public final void LIZ() {
                C0LAB c0lab = new C0LAB();
                c0lab.LIZIZ(C1256070in7.LIZ, "profile_entrance_id");
                c0lab.LJ("homepage_uid", str);
                c0lab.LJ("enter_from", str2);
                c0lab.LJ("previous_page", str3);
                c0lab.LJ("action_type", str4);
                C20684815ws.LJIILLIIL("profile_exit", c0lab.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProfileStatistics@a865.reportProfileExit$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProfileStatistics@a865.reportProfileExit$1");
            }
        });
    }

    public static void LJI(int i, String str, int i2, long j, boolean z) {
        String curUserId;
        int i3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("anchor_id", curUserId);
        c2344009Gk.LIZLLL(j, "duration");
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c2344009Gk.LIZJ(i3, "success");
        if (z) {
            c2344009Gk.LIZJ(i2, "result");
        } else {
            c2344009Gk.LIZJ(i, "code");
            c2344009Gk.LJFF("error_message", str);
        }
        C20684815ws.LJIILLIIL("livesdk_live_info_algorithm_call", c2344009Gk.LIZ);
    }

    public static void LJIILL(int i, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "profile_visitor_list");
        c2344009Gk.LJIIIIZZ("previous_page", str);
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("follow_status", str3);
        c2344009Gk.LIZJ(i, "unread_num");
        if (str4 != null) {
            c2344009Gk.LJFF("active_status", str4);
        }
        C20684815ws.LJIILLIIL("profile_visitors_list_show", c2344009Gk.LIZ);
    }

    public static void LJIL(String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("ranking_method", str4);
        c2344009Gk.LJIIIIZZ("previous_method", str5);
        c2344009Gk.LJIIIIZZ("current_tab", "output");
        C20684815ws.LJIILLIIL("click_profile_vv_ranking", c2344009Gk.LIZ);
    }

    public static void LJJIIJZLJL(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair(str4, str2);
        if (z) {
            str5 = "anchor";
        } else {
            str5 = "user";
        }
        pairArr[1] = new Pair("user_type", str5);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (!z) {
            mapLJIIJ.put("subscribe_state", str3);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(mapLJIIJ);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LJJI(String str, UrlModel urlModel, String str2, JSONObject jSONObject, Long l, Boolean bool, String str3) {
        List<String> urlList;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("tag", str);
            List<String> urlList2 = null;
            if (urlModel != null) {
                urlList = urlModel.getUrlList();
            } else {
                urlList = null;
            }
            c2344009Gk.LJ(urlList, "url_model");
            c2344009Gk.LJIIIIZZ("request_id", str2);
            c2344009Gk.LJ(jSONObject, "load_json_object");
            c2344009Gk.LJ(bool, "is_mine");
            c2344009Gk.LJIIIIZZ("itemID", str3);
            C20684815ws.LJIILLIIL("post_cover_load_error", c2344009Gk.LIZ);
            if (urlModel != null) {
                urlList2 = urlModel.getUrlList();
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tag: ");
            sbLIZ.append(str);
            sbLIZ.append(", urlModel: ");
            sbLIZ.append(urlModel);
            sbLIZ.append(", urlList: ");
            sbLIZ.append(urlList2);
            sbLIZ.append(", requestId: ");
            sbLIZ.append(str2);
            sbLIZ.append(", jsonObject: ");
            sbLIZ.append(jSONObject);
            sbLIZ.append(", isMyProfile:");
            sbLIZ.append(bool);
            sbLIZ.append(", itemId:");
            sbLIZ.append(str3);
            sbLIZ.append(", duration: ");
            sbLIZ.append(l);
            C1720106oR.LIZ("profile.PostCover", C2188811AlT.LIZIZ(sbLIZ));
        } catch (ConcurrentModificationException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, LiveEventStruct liveEventStruct, List list, String str5, String str6) {
        int size;
        int i;
        String id;
        String str7;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        int size2;
        boolean z;
        String str8;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size > 1) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_multi_event");
        String strLJJLIIIJ3 = null;
        if (liveEventStruct != null) {
            id = liveEventStruct.getId();
        } else {
            id = null;
        }
        c2344009Gk.LJIIIIZZ("main_live_event_id", id);
        if (liveEventStruct != null) {
            str7 = "upcoming";
        } else {
            str7 = null;
        }
        c2344009Gk.LJIIIIZZ("main_live_event_status", str7);
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS257S0000000_19.get$arr$(569), 30);
        } else {
            strLJJLIIIJ = null;
        }
        c2344009Gk.LJIIIIZZ("live_event_status", strLJJLIIIJ);
        if (list != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS257S0000000_19.get$arr$(570), 30);
        } else {
            strLJJLIIIJ2 = null;
        }
        c2344009Gk.LJIIIIZZ("live_event_id", strLJJLIIIJ2);
        if (list != null) {
            strLJJLIIIJ3 = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS257S0000000_19.get$arr$(571), 30);
        }
        c2344009Gk.LJIIIIZZ("live_event_type", strLJJLIIIJ3);
        if (list != null) {
            size2 = list.size();
        } else {
            size2 = 0;
        }
        c2344009Gk.LIZJ(size2, "live_event_cnt");
        if (liveEventStruct != null && liveEventStruct.isPaidEvent()) {
            z = true;
        } else {
            z = false;
        }
        String str9 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_free_event", str8);
        if (liveEventStruct == null || !liveEventStruct.isPaidEvent()) {
            str9 = "1";
        }
        c2344009Gk.LJIIIIZZ("is_free", str9);
        c2344009Gk.LJIIIIZZ("event_page", str4);
        c2344009Gk.LJIIIIZZ("anchor_id", str5);
        c2344009Gk.LJIIIIZZ("tab_area", str6);
        c2344009Gk.LJIIIIZZ("action_type", str2);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LJFF(C1253930ijf c1253930ijf, String str, String str2, int i, String str3, Map map, String str4, int i2) {
        if ((i2 & 16) != 0) {
            map = null;
        }
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        c1253930ijf.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", str3);
        c2344009Gk.LIZJ(i, "tab_pos");
        c2344009Gk.LJIIIIZZ("admin_type", str2);
        c2344009Gk.LJIIIIZZ("tab_area", str4);
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJII(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.Map r14, X.C1252480ihK r15, int r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1253930ijf.LJJII(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.0ihK, int):void");
    }

    public static void LJJIII(C1253930ijf c1253930ijf, String str, String str2, String str3, String str4, EnumC1248370iah enumC1248370iah, String str5, C1252480ihK c1252480ihK, int i) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            c1252480ihK = null;
        }
        c1253930ijf.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str4);
        int i2 = 1;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().LIZ() == 1) {
            i2 = 3;
        }
        c2344009Gk.LIZJ(i2, "pad_interface_orientation");
        c2344009Gk.LJIIIIZZ("component_field", enumC1248370iah.name().toLowerCase(Locale.ROOT));
        c2344009Gk.LIZLLL(C1256070in7.LIZ, "profile_entrance_id");
        if (str5 != null) {
            c2344009Gk.LJFF("result", str5);
        }
        C1252470ihJ.LIZ(c2344009Gk, c1252480ihK);
        C1251280ifO.LIZ("profile_info_click", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIIJ(C1253930ijf c1253930ijf, String str, Integer num, String str2, User user, String str3, String str4, Map map, int i) {
        ShopTab shopTab;
        Map map2 = map;
        String str5 = str4;
        String str6 = str3;
        if ((i & 256) != 0) {
            str6 = null;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        if ((i & 512) != 0) {
            str5 = "";
        }
        if ((i & 1024) != 0) {
            map2 = null;
        }
        c1253930ijf.getClass();
        Map<String, String> mapFetchSearchParams = C1ER1.LIZIZ.fetchSearchParams(str2, "");
        String str7 = mapFetchSearchParams.get("search_id");
        String str8 = mapFetchSearchParams.get("search_result_id");
        TabSetting tabSetting = user.getTabSetting();
        if (tabSetting != null && (shopTab = tabSetting.shopTab) != null) {
            String str9 = shopTab.shopSchemaV2;
            String str10 = shopTab.shopSchema;
            if (C703302op.LIZ(str9)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str9), "sellerId");
            } else if (C703302op.LIZ(str10)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str10), "sellerId");
            }
        }
        IEcommerceStoreBizLogService iEcommerceStoreBizLogService = (IEcommerceStoreBizLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreBizLogService.class, false, false, false, 14, null);
        if (iEcommerceStoreBizLogService != 0) {
            iEcommerceStoreBizLogService.LIZ(user, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str, num, str2, null, null, str7, str8, str6, str5, map2);
        }
    }
}
