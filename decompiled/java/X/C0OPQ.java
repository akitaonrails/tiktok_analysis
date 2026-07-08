package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OPQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OPQ {
    public static final C0OPQ LIZ = new C0OPQ();

    public static void LJJIIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board");
        c2344009Gk.LJIIIIZZ("activity_page", "animation");
        c2344009Gk.LJIIIIZZ("activity_id", str);
        c2344009Gk.LJIIIIZZ("click_position", "celebrate");
        C20684815ws.LJIILLIIL("mdp_easter_egg_click", c2344009Gk.LIZ);
    }

    public static void LJJIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        C20684815ws.LJIILLIIL("bulletin_quota_limit_toast", c2344009Gk.LIZ);
    }

    public static void LJJJJ(Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", (String) map.get("enter_from"));
        c2344009Gk.LJIIIIZZ("channel_id", (String) map.get("channel_id"));
        c2344009Gk.LJIIIIZZ("entrance_page", (String) map.get("entrance_page"));
        C20684815ws.LJIILLIIL("subscribe_bulletin_board", c2344009Gk.LIZ);
    }

    public static void LIZJ(C2344009Gk c2344009Gk, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (C123100dR.LIZ((String) entry.getKey()) && C123100dR.LIZ((String) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c2344009Gk.LJII(linkedHashMap);
    }

    public static void LIZLLL(C2344009Gk c2344009Gk, List list) {
        String str;
        String str2;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BulletinCardKV bulletinCardKV = (BulletinCardKV) it2.next();
                if (bulletinCardKV != null && (str = bulletinCardKV.key) != null && (str2 = bulletinCardKV.value) != null && str.length() > 0 && str2.length() > 0) {
                    c2344009Gk.LJFF(str, str2);
                }
            }
        }
    }

    public static void LJFF(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel_id", str);
        for (Map.Entry entry : map.entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
        }
        C20684815ws.LJIILLIIL("bulletin_board_text_guide_icon", c2344009Gk.LIZ);
    }

    public static void LJIIJ(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("previous_page", (String) map.get("previous_page"));
        c2344009Gk.LJIIIIZZ("enter_method", (String) map.get("enter_method"));
        C20684815ws.LJIILLIIL("click_send_bulletin_entrance", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_detail_page");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("action_type", (String) map.get("action_type"));
        if (Intrinsics.LJFF(map.get("action_type"), "click")) {
            c2344009Gk.LJFF("click_type", (String) map.get("click_type"));
        }
        C20684815ws.LJIILLIIL("close_bulletin_board_popup", c2344009Gk.LIZ);
    }

    public static void LJIIL(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", str);
        if (map != null) {
            if (!Intrinsics.LJFF(map.get("should_show"), CardStruct.IStatusCode.DEFAULT)) {
                map.remove("cant_show_reason");
            }
            LIZ.getClass();
            LIZJ(c2344009Gk, map);
        }
        C20684815ws.LJIILLIIL("create_bb_guide_banner_progress", c2344009Gk.LIZ);
    }

    public static void LJIJI(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", (String) map.get("enter_from"));
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("action_type", (String) map.get("action_type"));
        if (Intrinsics.LJFF(map.get("action_type"), "click")) {
            c2344009Gk.LJFF("click_type", (String) map.get("click_type"));
        }
        C20684815ws.LJIILLIIL("delete_bulletin_board_popup", c2344009Gk.LIZ);
    }

    public static void LJIL(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("channel_id", (String) map.get("channel_id"));
        c2344009Gk.LJIIIIZZ("action_type", (String) map.get("action_type"));
        c2344009Gk.LJIIIIZZ("is_author", (String) map.get("is_author"));
        c2344009Gk.LJIIIIZZ("url", str);
        String str2 = (String) map.get("message_id");
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("message_id", str2);
        C20684815ws.LJIILLIIL("bulletin_external_link", c2344009Gk.LIZ);
    }

    public static void LJJIIZI(long j, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJII(map);
        c2344009Gk.LIZLLL(j, "channel_id");
        C20684815ws.LJIILLIIL("enter_bulletin_text_editing_page", c2344009Gk.LIZ);
    }

    public static void LJJIZ(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("entrance_page", (String) map.get("entrance_page"));
        c2344009Gk.LJIIIIZZ("message_type", "bulletin");
        c2344009Gk.LJIIIIZZ("is_author", (String) map.get("is_author"));
        c2344009Gk.LJIIIIZZ("message_id", (String) map.get("message_id"));
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("channel_status", (String) map.get("channel_status"));
        c2344009Gk.LJIIIIZZ("content_type", (String) map.get("content_type"));
        CharSequence charSequence = (CharSequence) map.get("from_user_id");
        if (charSequence == null || charSequence.length() == 0) {
            c2344009Gk.LJFF("from_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        if (Intrinsics.LJFF(map.get("is_author"), "1")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove("is_subscribed");
            map = linkedHashMap;
        }
        LIZJ(c2344009Gk, map);
        C20684815ws.LJIILLIIL("read_bulletin_message", c2344009Gk.LIZ);
    }

    public static void LJJJ(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("message_type", "bulletin");
        c2344009Gk.LIZJ(1, "is_author");
        c2344009Gk.LJIIIIZZ("enter_method", (String) map.get("enter_method"));
        c2344009Gk.LJIIIIZZ("content_type", (String) map.get("content_type"));
        c2344009Gk.LJIIIIZZ("entrance_page", (String) map.get("entrance_page"));
        LIZJ(c2344009Gk, map);
        C20684815ws.LJIILLIIL("send_bulletin_message", c2344009Gk.LIZ);
    }

    public static void LJJJI(String str, Map map) {
        Integer numLJIIJJI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        c2344009Gk.LJIIIIZZ("enter_from", (String) linkedHashMap.get("enter_from"));
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("message_type", "bulletin");
        c2344009Gk.LIZJ(1, "is_author");
        c2344009Gk.LJIIIIZZ("enter_method", (String) linkedHashMap.get("enter_method"));
        c2344009Gk.LJIIIIZZ("content_type", (String) linkedHashMap.get("content_type"));
        c2344009Gk.LJIIIIZZ("entrance_page", (String) linkedHashMap.get("entrance_page"));
        c2344009Gk.LJIIIIZZ("send_status", (String) linkedHashMap.get("send_status"));
        LIZJ(c2344009Gk, map);
        String str2 = (String) linkedHashMap.get("send_status");
        if (str2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null && numLJIIJJI.intValue() == 1) {
            c2344009Gk.LJFF("message_id", (String) linkedHashMap.get("message_id"));
        } else {
            c2344009Gk.LJFF("error_code", (String) linkedHashMap.get("error_code"));
            c2344009Gk.LJFF("error_message", (String) linkedHashMap.get("error_message"));
        }
        C20684815ws.LJIILLIIL("send_bulletin_message_response", c2344009Gk.LIZ);
    }

    public static void LJJJIL(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("previous_page", (String) map.get("previous_page"));
        c2344009Gk.LJIIIIZZ("enter_method", (String) map.get("enter_method"));
        C20684815ws.LJIILLIIL("click_shoot_bulletin_entrance", c2344009Gk.LIZ);
    }

    public static void LJ(Boolean bool, String str, Map map) {
        int iIntValue;
        int iIntValue2;
        String str2;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel_id", str);
        if (bool != null) {
            c2344009Gk.LIZJ(bool.booleanValue() ? 1 : 0, "is_author");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (Intrinsics.LJFF(map.get("is_author"), "1")) {
            linkedHashMap.remove("is_subscribed");
        }
        String str3 = (String) linkedHashMap.remove("show_cnt");
        if (str3 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str3)) != null) {
            iIntValue = numLJIIJJI3.intValue();
        } else {
            iIntValue = 0;
        }
        String str4 = (String) linkedHashMap.remove("channel_status");
        if (str4 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str4)) != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        } else {
            iIntValue2 = Integer.MIN_VALUE;
        }
        LIZJ(c2344009Gk, linkedHashMap);
        if (Intrinsics.LJFF(linkedHashMap.get("notice_type"), "report_null")) {
            String str5 = (String) linkedHashMap.get("emoji_interaction_cnt");
            if (str5 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str5)) != null && numLJIIJJI.intValue() > 0) {
                c2344009Gk.LJFF("notice_type", "emoji_interaction");
            } else {
                c2344009Gk.LJFF("notice_type", "be_null");
            }
        } else {
            c2344009Gk.LJFF("show_cnt", String.valueOf(iIntValue));
        }
        if (iIntValue2 != Integer.MIN_VALUE) {
            if (iIntValue2 != 0) {
                if (iIntValue2 != 1) {
                    str2 = "unknow";
                } else {
                    str2 = "open";
                }
            } else {
                str2 = "close";
            }
            c2344009Gk.LJFF("channel_status", str2);
        } else if (C123100dR.LIZ(str4)) {
            c2344009Gk.LJFF("channel_status", str4);
        }
        String str6 = C0NBD.LIZ;
        if (str6 == null) {
            str6 = "";
        }
        c2344009Gk.LJFF("inbox_session_id", str6);
        C20684815ws.LJIILLIIL("bulletin_board_cell", c2344009Gk.LIZ);
    }

    public static void LJI(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_member_list_page");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("click_type", str3);
        C20684815ws.LJIILLIIL("bulletin_member_list_click", c2344009Gk.LIZ);
    }

    public static void LJII(Integer num, Integer num2, String str) {
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        if (Intrinsics.LJFF(str, "quick_message_location") && num != null) {
            if (num.intValue() > 20) {
                string = "20";
            } else {
                string = num.toString();
            }
            c2344009Gk.LJFF("show_unread_cnt", string);
            c2344009Gk.LJFF("real_unread_cnt", String.valueOf(num2));
        }
        C20684815ws.LJIILLIIL("click_bulletin_message_quick_location", c2344009Gk.LIZ);
    }

    public static void LJIILJJIL(String str, String str2, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "profile_is_show");
        if (str2 != null && str2.length() > 0) {
            c2344009Gk.LJFF("user_type", str2);
        }
        C20684815ws.LJIILLIIL("create_bulletin_board", c2344009Gk.LIZ);
    }

    public static void LJIILL(int i, String str, String str2) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        if (i == 1) {
            str3 = "show";
        } else {
            str3 = "click";
        }
        c2344009Gk.LJIIIIZZ("action_type", str3);
        if (i == 2) {
            c2344009Gk.LJFF("click_type", str);
        }
        if (str2 != null) {
            c2344009Gk.LJFF("user_type", str2);
        }
        C20684815ws.LJIILLIIL("create_bulletin_board_notice", c2344009Gk.LIZ);
    }

    public static void LJJIIJ(int i, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("channel_id", str2);
        c2344009Gk.LIZJ(i, "mute_status");
        C20684815ws.LJIILLIIL("bulletin_board_mute_button", c2344009Gk.LIZ);
    }

    public static void LJJIIJZLJL(int i, int i2, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("bubble_type", "share_bulletin_board");
        c2344009Gk.LIZJ(i, "is_author");
        if (i != EnumC617060OIe.IDENTITY_CREATOR.getValue() && i2 != -1) {
            c2344009Gk.LIZJ(i2, "is_subscribed");
        }
        C20684815ws.LJIILLIIL("bulletin_board_bubble", c2344009Gk.LIZ);
    }

    public static void LJJIJIIJI(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", str);
        c2344009Gk.LJIIIIZZ("event_page", "bulletin_board_settings_page");
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_detail_page");
        c2344009Gk.LJIIIIZZ("switch_type", str2);
        c2344009Gk.LJIIIIZZ("action_type", str3);
        C20684815ws.LJIILLIIL("livesdk_live_bbautoshare_switch_click", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(int i, String str, String str2, String str3) {
        String str4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (i == 1) {
            str4 = "show";
        } else {
            str4 = "click";
        }
        c2344009Gk.LJIIIIZZ("action_type", str4);
        if (str2 != null && str2.length() > 0) {
            c2344009Gk.LJFF("click_type", str2);
        }
        if (str3 != null && str3.length() > 0) {
            c2344009Gk.LJFF("user_type", str3);
        }
        C20684815ws.LJIILLIIL("create_bulletin_board_panel", c2344009Gk.LIZ);
    }

    public static void LJIJJ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("button_name", "download");
        c2344009Gk.LJIIIIZZ("channel_id", str2);
        c2344009Gk.LJIIIIZZ("message_id", str3);
        c2344009Gk.LJIIIIZZ("content_type", str4);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LJIIIZ(int i, int i2, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LIZJ(i, "is_author");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("message_id", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        if (i == 0) {
            c2344009Gk.LIZJ(i2, "is_subscribed");
        }
        C20684815ws.LJIILLIIL("click_emoji_reaction_button", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(C0OPQ c0opq, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = "notification_page";
        }
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        if (str2 != null) {
            c2344009Gk.LJFF("user_type", str2);
        }
        C20684815ws.LJIILLIIL("create_bulletin_board_entrance", c2344009Gk.LIZ);
    }

    public static void LJIJJLI(int i, int i2, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LIZJ(i, "is_author");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("message_id", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        if (i == 0) {
            c2344009Gk.LIZJ(i2, "is_subscribed");
        }
        C20684815ws.LJIILLIIL("enter_bulletin_interaction_details", c2344009Gk.LIZ);
    }

    public static void LJJI(String str, String str2, String str3, Map map, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("enter_method", "icon");
        c2344009Gk.LJIIIIZZ("action_type", str2);
        c2344009Gk.LJIIIIZZ("click_type", "enter");
        if (z) {
            c2344009Gk.LJFF("notice_type", "yellow_dot");
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (str3 == null) {
            str3 = "bulletin_board_analytics_entrance";
        }
        C20684815ws.LJIILLIIL(str3, c2344009Gk.LIZ);
    }

    public static void LJJIJ(long j, String str, String str2, Map map, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LIZLLL(j, "channel_id");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "has_text_input");
        c2344009Gk.LJIIIIZZ("exit_method", str);
        if (str2 != null) {
            c2344009Gk.LJFF("activity_id", str2);
        }
        C20684815ws.LJIILLIIL("exit_bulletin_text_editing_page", c2344009Gk.LIZ);
    }

    public static void LJJJJI(C0OPQ c0opq, String str, String str2, String str3, int i) {
        String str4;
        if ((i & 1) != 0) {
            str4 = "bulletin_board_detail_page";
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("channel_id", str3);
        if (str2 != null) {
            c2344009Gk.LJFF("click_type", str2);
        }
        C20684815ws.LJIILLIIL("unsubscribe_bulletin_board_popup", c2344009Gk.LIZ);
    }

    public static void LJJ(String str, String str2, String str3, String str4, String str5, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("message_id", str2);
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("action_type", str4);
        if (str5 != null) {
            c2344009Gk.LJFF("click_type", str5);
        }
        if (map != null) {
            c2344009Gk.LJII(map);
        }
        C20684815ws.LJIILLIIL("guide_to_join_bb_popup", c2344009Gk.LIZ);
    }

    public static void LJJIJIIJIL(String str, String str2, String str3, String str4, String str5, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", str);
        c2344009Gk.LJIIIIZZ("event_page", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("toast_type", str4);
        c2344009Gk.LJIIIIZZ("action_type", str5);
        for (Map.Entry entry : map.entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
        }
        C20684815ws.LJIILLIIL("livesdk_bbshare_toast", c2344009Gk.LIZ);
    }

    public static void LJIIIIZZ(C0OPQ c0opq, String str, String str2, int i, int i2, String str3, int i3) {
        if ((i3 & 4) != 0) {
            i = 1;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            str3 = null;
        }
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_detail_page");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LIZJ(i, "is_author");
        c2344009Gk.LJIIIIZZ("click_type", str2);
        if (i != 1 && i2 != -1) {
            c2344009Gk.LIZJ(i2, "is_subscribed");
        }
        if (C123100dR.LIZ(str3)) {
            c2344009Gk.LJFF("enter_method", str3);
        }
        C20684815ws.LJIILLIIL("click_bulletin_board_detail_page", c2344009Gk.LIZ);
    }

    public static void LJIIZILJ(String str, boolean z, String str2, String str3, String str4, Integer num, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "profile_is_show");
        int iIntValue = 0;
        c2344009Gk.LIZJ(0, "enable_reply");
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        if (str3 == null) {
            str3 = "empty";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        if (str4 == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str4);
        c2344009Gk.LJ(Boolean.valueOf(C0OPC.LIZ()), "isCreator");
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (num != null) {
            iIntValue = num.intValue();
        }
        c2344009Gk.LIZJ(iIntValue, "error_code");
        if (str5 == null) {
            str5 = "";
        }
        c2344009Gk.LJIIIIZZ("error_message", str5);
        C20684815ws.LJIILLIIL("create_bulletin_board_status", c2344009Gk.LIZ);
    }

    public static void LJJIFFI(String str, boolean z, boolean z2, String str2, boolean z3, String str3, Map map) {
        String str4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("entrance_page", str);
        c2344009Gk.LJIIIIZZ("channel_id", str2);
        if (z3) {
            str4 = "open";
        } else {
            str4 = "close";
        }
        c2344009Gk.LJIIIIZZ("channel_status", str4);
        c2344009Gk.LJIIIIZZ("action_type", str3);
        if (z) {
            c2344009Gk.LIZJ(1, "is_author");
        } else {
            c2344009Gk.LIZJ(0, "is_author");
            c2344009Gk.LIZJ(1 ^ (z2 ? 1 : 0), "is_subscribed");
        }
        for (Map.Entry entry : map.entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
        }
        C20684815ws.LJIILLIIL("bulletin_board_bar", c2344009Gk.LIZ);
    }

    public static void LJJIJL(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("platform", str2);
        c2344009Gk.LJIIIIZZ("panel_source", str3);
        c2344009Gk.LIZJ(i, "is_author");
        c2344009Gk.LJFF("enter_method", str5);
        if (i != EnumC617060OIe.IDENTITY_CREATOR.getValue() && i2 != -1) {
            c2344009Gk.LIZJ(i2, "is_subscribed");
        }
        C20684815ws.LJIILLIIL("share_bulletin_board", c2344009Gk.LIZ);
    }

    public static void LIZ(int i, String str, String str2, int i2, String str3, String str4, List list, Map map) {
        String str5;
        if (i == C0OPR.EMOJI_ACTION_TYPE_SEND.getType()) {
            str5 = "send_bulletin_emoji";
        } else if (i != C0OPR.EMOJI_ACTION_TYPE_CANCEL.getType()) {
            return;
        } else {
            str5 = "cancel_bulletin_emoji";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LIZJ(i2, "is_author");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("message_id", str2);
        c2344009Gk.LJIIIIZZ("emoji_id", str4);
        LIZLLL(c2344009Gk, list);
        LIZJ(c2344009Gk, map);
        C20684815ws.LJIILLIIL(str5, c2344009Gk.LIZ);
    }

    public static void LJJIJLIJ(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("platform", str2);
        c2344009Gk.LJIIIIZZ("panel_source", str3);
        c2344009Gk.LIZJ(i, "is_author");
        c2344009Gk.LIZJ(i3, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJFF("enter_method", str5);
        if (i != EnumC617060OIe.IDENTITY_CREATOR.getValue() && i2 != -1) {
            c2344009Gk.LIZJ(i2, "is_subscribed");
        }
        C20684815ws.LJIILLIIL("share_bulletin_board_response", c2344009Gk.LIZ);
    }

    public static void LIZIZ(int i, String str, String str2, int i2, String str3, String str4, boolean z, List list, Map map) {
        String str5;
        String str6;
        if (i == C0OPR.EMOJI_ACTION_TYPE_SEND.getType()) {
            str5 = "send_bulletin_emoji_response";
        } else if (i != C0OPR.EMOJI_ACTION_TYPE_CANCEL.getType()) {
            return;
        } else {
            str5 = "cancel_bulletin_emoji_response";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LIZJ(i2, "is_author");
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("message_id", str2);
        c2344009Gk.LJIIIIZZ("emoji_id", str4);
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("send_status", str6);
        LIZLLL(c2344009Gk, list);
        LIZJ(c2344009Gk, map);
        C20684815ws.LJIILLIIL(str5, c2344009Gk.LIZ);
    }

    public static void LJJII(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, int i3, int i4, String str7, String str8, String str9, String str10) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("channel_id", str3);
        c2344009Gk.LIZJ(i, "is_author");
        c2344009Gk.LIZJ(i2, "is_subscribed");
        c2344009Gk.LJIIIIZZ("message_id", str4);
        c2344009Gk.LJIIIIZZ("content_type", str5);
        c2344009Gk.LJIIIIZZ("comment_id", str6);
        c2344009Gk.LIZJ(i3, "is_filtered");
        c2344009Gk.LIZJ(i4, "position");
        c2344009Gk.LIZJ(i3, "is_filtered");
        c2344009Gk.LJIIIIZZ("source_language", str7);
        c2344009Gk.LJIIIIZZ("from_user_id", str8);
        c2344009Gk.LJIIIIZZ("action_type", str9);
        if (str10 != null) {
            c2344009Gk.LJFF("click_type", str10);
        }
        C20684815ws.LJIILLIIL("bulletin_board_comment", c2344009Gk.LIZ);
    }

    public static void LJJIJIL(String str, String str2, String str3, int i, int i2, String str4, String str5, int i3, String str6, String str7, int i4, String str8, String str9, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("channel_id", str3);
        c2344009Gk.LIZJ(i, "is_author");
        c2344009Gk.LIZJ(i2, "is_subscribed");
        c2344009Gk.LJIIIIZZ("message_id", str4);
        c2344009Gk.LJIIIIZZ("content_type", str5);
        c2344009Gk.LIZJ(i3, "send_status");
        c2344009Gk.LJIIIIZZ("comment_id", str6);
        c2344009Gk.LJIIIIZZ("source_language", str7);
        c2344009Gk.LIZJ(i4, "is_reply");
        c2344009Gk.LJIIIIZZ("from_comment_id", str8);
        c2344009Gk.LJIIIIZZ("from_user_id", str9);
        LIZJ(c2344009Gk, map);
        C20684815ws.LJIILLIIL("send_bulletin_comment_response", c2344009Gk.LIZ);
    }
}
