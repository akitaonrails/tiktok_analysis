package X;

import com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0OBY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_dm_seen", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("conversation_id", str2)));
    }

    public static void LIZIZ(String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_dm_seen", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("conversation_id", str2)));
    }

    public static void LIZJ(String str, SessionInfo sessionInfo) {
        String strLIZJ;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", str);
        IIMChatRoomAnalytics.LIZ.getClass();
        IIMChatRoomAnalytics iIMChatRoomAnalyticsLIZ = C06Q7.LIZ();
        if (iIMChatRoomAnalyticsLIZ == null || (strLIZJ = iIMChatRoomAnalyticsLIZ.LIZJ(sessionInfo)) == null) {
            strLIZJ = "";
        }
        pairArr[1] = new Pair("chat_type", strLIZJ);
        C20684815ws.LJIILLIIL("show_seen_status", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
