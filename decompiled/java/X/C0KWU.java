package X;

import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0KWU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KWU {
    public static boolean LIZ = true;

    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C474500IjA r12, com.bytedance.ies.sdk.datachannel.DataChannel r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KWU.LIZ(X.0IjA, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LIZJ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_gift_vote_entrance_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(RedDotExtensionKt.LJIILLIIL(C0UX6.RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE))) ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_gift_vote_entrance_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(RedDotExtensionKt.LJIILLIIL(C0UX6.RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE))) ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(DataChannel dataChannel, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_settings_select_vote_page_icon");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LJJII(str2, "vote_type");
        c474500IjALIZ.LJJII(C0KYR.LIZJ(dataChannel), "admin_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(DataChannel dataChannel, String str, String str2, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_entrance_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LJJII(str2, "poll_type");
        c474500IjALIZ.LJJII("select_vote_panel", "request_page");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.FALSE) ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_grey");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(DataChannel dataChannel, String str, String str2, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_entrance_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LJJII(str2, "poll_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.FALSE) ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LJJII("select_vote_panel", "request_page");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_grey");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(DataChannel dataChannel, String str, String str2, String str3, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_select_poll_panel_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LJJII(str2, "live_type");
        c474500IjALIZ.LJJII(str3, "click_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LIZ();
    }
}
