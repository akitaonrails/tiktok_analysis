package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.subscription.LivePCSAnchorTitleAnaliseWithAIPreciseSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LivePCSAnchorTitleAnaliseWithAISetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121970fIp {
    public static int LIZ() {
        Double dLIZ = InterfaceC1106030et7.e8.LIZ();
        if (dLIZ != null) {
            return (int) dLIZ.doubleValue();
        }
        return 0;
    }

    public static boolean LIZJ() {
        return LivePCSAnchorTitleAnaliseWithAIPreciseSetting.INSTANCE.isEnabled() && LIZ() <= 10 && !Intrinsics.LJFF(InterfaceC1106030et7.a8.LIZ(), Boolean.TRUE) && LivePCSAnchorTitleAnaliseWithAISetting.INSTANCE.isEnabled();
    }

    public static void LIZIZ(DataChannel dataChannel, String str, String str2, int i, int i2) {
        Long lValueOf;
        User userLJIJJLI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_client_ai_anchor_opt_in_result");
        c474500IjALIZ.LJIJJLI(dataChannel);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
            lValueOf = Long.valueOf(userLJIJJLI.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "user_id");
        c474500IjALIZ.LJJII(str, "room_title");
        c474500IjALIZ.LJJII(str2, "anchor_intro");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "industry");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "error_code");
        c474500IjALIZ.LIZ();
    }
}
