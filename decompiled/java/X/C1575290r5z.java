package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0r5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575290r5z {
    public static final C1575290r5z LIZ = new C1575290r5z();

    public static void LIZIZ(VibeFeedInviteParam vibeFeedInviteParam, EnumC1575330r63 enumC1575330r63) {
        String str;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_type", vibeFeedInviteParam.getEntranceType());
        pairArr[1] = new Pair("enter_from", "chat");
        int i = C1575320r62.LIZ[enumC1575330r63.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "send_invite";
                } else {
                    str = "accept";
                }
            } else {
                str = "resend_invite";
            }
        } else {
            str = "invite_sent";
        }
        pairArr[2] = new Pair("invite_status", str);
        pairArr[3] = new Pair("conversation_id", vibeFeedInviteParam.getConversationId());
        pairArr[4] = new Pair("chat_type", vibeFeedInviteParam.getMutualFeedScene().stringValue());
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(C0P40.LIZ(vibeFeedInviteParam.getConversationId()));
        if (vibeFeedInviteParam.getMutualFeedScene().isPrivate()) {
            String strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(vibeFeedInviteParam.getConversationId());
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            mapLJIIJ.put("invitee_uid", strLIZJ);
        }
        C20684815ws.LJIILLIIL("ttsocial_shared_feed_panel_show", mapLJIIJ);
    }

    public static void LIZ(VibeFeedInviteParam vibeFeedInviteParam, EnumC1575330r63 enumC1575330r63, boolean z) {
        String str;
        String str2;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("enter_type", vibeFeedInviteParam.getEntranceType());
        pairArr[1] = new Pair("enter_from", "chat");
        int i = C1575320r62.LIZ[enumC1575330r63.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "send_invite";
                } else {
                    str = "accept";
                }
            } else {
                str = "resend_invite";
            }
        } else {
            str = "invite_sent";
        }
        pairArr[2] = new Pair("invite_status", str);
        pairArr[3] = new Pair("conversation_id", vibeFeedInviteParam.getConversationId());
        pairArr[4] = new Pair("chat_type", vibeFeedInviteParam.getMutualFeedScene().stringValue());
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("is_click_button", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String conversationId = vibeFeedInviteParam.getConversationId();
        Map<String, String> mapLIZ = C0P40.LIZ(conversationId);
        C0P40.LIZIZ.put(conversationId, mapLIZ);
        mapLJIIJ.putAll(mapLIZ);
        if (vibeFeedInviteParam.getMutualFeedScene().isPrivate()) {
            String strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(vibeFeedInviteParam.getConversationId());
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            mapLJIIJ.put("invitee_uid", strLIZJ);
        }
        C20684815ws.LJIILLIIL("ttsocial_shared_feed_panel_click", mapLJIIJ);
    }

    public static void LIZJ(String str, String str2, EnumC912680ZrG enumC912680ZrG) {
        String strLIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("conversation_id", str);
        c2344009Gk.LJIIIIZZ("invite_status", str2);
        c2344009Gk.LJIIIIZZ("chat_type", enumC912680ZrG.stringValue());
        if (enumC912680ZrG.isPrivate()) {
            strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(str);
        } else {
            strLIZJ = null;
        }
        if (strLIZJ != null) {
            strLIZJ.toString();
            c2344009Gk.LJFF("invitee_uid", strLIZJ);
        }
        Map<String, String> mapLJ = C0P40.LIZIZ.get(str);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        for (Map.Entry<String, String> entry : mapLJ.entrySet()) {
            c2344009Gk.LJFF(entry.getKey(), entry.getValue());
        }
        C20684815ws.LJIILLIIL("ttsocial_shared_feed_invite_result", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "shared_feed"), new Pair("shared_feed_id", str2), new Pair("conversation_id", str3), new Pair("button_type", str), new Pair("chat_type", enumC912680ZrG.stringValue()));
        if (enumC912680ZrG.isPrivate()) {
            String strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(str3);
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            mapLJIIJ.put("invitee_uid", strLIZJ);
        }
        C20684815ws.LJIILLIIL("ttsocial_shared_feed_menu_click", mapLJIIJ);
    }

    public static void LJFF(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "shared_feed"), new Pair("shared_feed_id", str2), new Pair("conversation_id", str), new Pair("popup_type", str3), new Pair("chat_type", enumC912680ZrG.stringValue()));
        if (enumC912680ZrG.isPrivate()) {
            String strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(str);
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            mapLJIIJ.put("invitee_uid", strLIZJ);
        }
        C20684815ws.LJIILLIIL("ttsocial_shared_feed_popup_show", mapLJIIJ);
    }

    public static void LJI(String str, String str2, String str3, String str4, EnumC912680ZrG enumC912680ZrG) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "shared_feed"), new Pair("shared_feed_id", str2), new Pair("conversation_id", str), new Pair("popup_type", str3), new Pair("chat_type", enumC912680ZrG.stringValue()), new Pair("button_type", str4));
        if (enumC912680ZrG.isPrivate()) {
            String strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(str);
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            mapLJIIJ.put("invitee_uid", strLIZJ);
        }
        C20684815ws.LJIILLIIL("ttsocial_shared_feed_popup_click", mapLJIIJ);
    }

    public static void LJ(boolean z, String str, String str2, String str3, EnumC1575470r6H enumC1575470r6H, EnumC912680ZrG enumC912680ZrG, int i) {
        String str4;
        String str5;
        if (z) {
            str4 = "ttsocial_shared_feed_end_page_show";
        } else {
            str4 = "ttsocial_shared_feed_end_page_click";
        }
        String strLIZLLL = C0P30.LIZ().LIZLLL(str2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "shared_feed");
        c2344009Gk.LJIIIIZZ("shared_feed_id", strLIZLLL);
        c2344009Gk.LJIIIIZZ("conversation_id", str2);
        c2344009Gk.LJIIIIZZ("enter_type", str3);
        c2344009Gk.LIZJ(i, "joint_like_num");
        c2344009Gk.LJIIIIZZ("chat_type", enumC912680ZrG.stringValue());
        if (!z && str != null && str.length() != 0) {
            c2344009Gk.LJFF("button_type", str);
        }
        if (enumC912680ZrG.isPrivate()) {
            if (enumC1575470r6H == EnumC1575470r6H.UNLOCKED) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("is_unlock_sharedlike", str5);
        } else {
            c2344009Gk.LJFF("unlock_status", enumC1575470r6H.getValue());
        }
        C20684815ws.LJIILLIIL(str4, c2344009Gk.LIZ);
    }
}
