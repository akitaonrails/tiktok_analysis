package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAISummaryBoardSetting;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0xHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813080xHW {
    public static String LIZ = "";

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 2) {
                return "approved";
            }
            if (num.intValue() == 3) {
                return "tns_rejected";
            }
            if (num.intValue() == 1) {
                return "under_review";
            }
            if (num.intValue() == 4) {
                return "smb_rejected";
            }
            num.intValue();
            return "none";
        }
        return "none";
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 2) {
                return "approved";
            }
            if (num.intValue() != 3 && num.intValue() != 4) {
                if (num.intValue() == 1) {
                    return "under_review";
                }
                num.intValue();
                return "none";
            }
            return "rejected";
        }
        return "none";
    }

    public static void LJ(Integer num) {
        if (num == null) {
            C0IJT.LIZ("livesdk_in_live_ai_board_capsule_page_close").LIZ();
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_in_live_ai_board_capsule_page_click");
        c474500IjALIZ.LJJII(Integer.valueOf(num.intValue() + 1), "sub_position");
        c474500IjALIZ.LIZ();
        if (C1697810uHb.LJIIJJI(0, 3, 4).contains(Integer.valueOf(LiveAISummaryBoardSetting.INSTANCE.broadcastDialogStyle()))) {
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_in_live_ai_board_capsule_page_close");
        c474500IjALIZ2.LJJII(Integer.valueOf(num.intValue() + 1), "sub_position");
        c474500IjALIZ2.LIZ();
    }

    public static void LJFF(String str) {
        C474500IjA c474500IjALIZ;
        if (str != null && str.length() > 0) {
            c474500IjALIZ = C0IJT.LIZ("ai_board_auth_popup_click");
            c474500IjALIZ.LJJII(str, "click_type");
        } else {
            c474500IjALIZ = C0IJT.LIZ("ai_board_auth_popup_show");
        }
        c474500IjALIZ.LIZ();
    }

    public static C474500IjA LIZJ(Board board, boolean z, boolean z2, Integer num, String str, String str2, String str3, String str4, int i) {
        Object obj;
        String str5;
        String string;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_management_card");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str3, "room_id");
        c474500IjALIZ.LJJII(str4, "board_entrance");
        c474500IjALIZ.LJJII(Long.valueOf(board.id), "board_set_id");
        String str6 = "1";
        String str7 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_sponsorship_disclosure");
        c474500IjALIZ.LJJII(LIZIZ(Integer.valueOf(board.status)), "audit_status");
        if (!z2) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str6, "is_ongoing");
        c474500IjALIZ.LJJIIZ(LIZIZ(num), "audit_status", new C1813110xHZ(num));
        c474500IjALIZ.LJJII("rich_text_decoration", "board_type");
        RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
        if (recommendBoardInfo != null && (string = Integer.valueOf(recommendBoardInfo.boardSource).toString()) != null) {
            str7 = string;
        }
        c474500IjALIZ.LJJII(str7, "board_source");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJIIZ(str2, "click_type", new C1813070xHV(str2));
        c474500IjALIZ.LJJIIZ(LIZ, "ai_summary_board_design_style", new C1813090xHX(board));
        C1813100xHY c1813100xHY = new C1813100xHY(board);
        BoardItem boardItem = (BoardItem) C13LP.LJJJLL(board.boardItemList);
        if (boardItem == null || (str5 = boardItem.fullyCustomizedContent) == null) {
            str5 = "";
        }
        c474500IjALIZ.LJJIIZ(str5, "ai_summary_board_content", c1813100xHY);
        c474500IjALIZ.LJJIIZ(Integer.valueOf(i), "sub_position", new C1813120xHa(i));
        return c474500IjALIZ;
    }
}
