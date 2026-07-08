package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0a8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923210a8F {
    public static int LIZ;

    public static void LIZ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        boolean z;
        if (multiLiveAnchorPanelSettings == null) {
            return;
        }
        if (!C01ZD.LIZ(1) ? multiLiveAnchorPanelSettings.LIZLLL == 3 : multiLiveAnchorPanelSettings.showAvailableSpot == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LJJIIZI("empty_seat_info", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1")), true);
                return;
            }
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 == null) {
            return;
        }
        interfaceC954180awCLLJLL2.LJIILL("empty_seat_info");
    }
}
