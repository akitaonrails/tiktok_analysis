package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0aCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925650aCB {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static int LIZ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
        if (multiLiveAnchorPanelSettings != null) {
            return multiLiveAnchorPanelSettings.multiGuestApplyAutoApprove;
        }
        return 0;
    }

    public static void LIZLLL(String str, boolean z) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long lValueOf = null;
        C01Z4.LIZ(null, linkedHashMap);
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        linkedHashMap.put("switch_to", str2);
        linkedHashMap.put("from_page", str);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        }
        linkedHashMap.put("anchor_id", String.valueOf(lValueOf));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_layoutsettings_auto_accept_request");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_auto_accept_request_popup");
        C924620aAW.LJIILIIL(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "click_decision");
        c474500IjALIZ.LJJII(str3, "enter_from_page");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(int i, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_auto_accept_request_inline_notice");
        C924620aAW.LJIILIIL(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "auto_accept_request_initiate_type");
        c474500IjALIZ.LJJII(str2, "icon_type");
        c474500IjALIZ.LIZ();
    }
}
