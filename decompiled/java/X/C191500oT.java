package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00oT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C191500oT {
    public static void LIZ(DataChannel dataChannel, String str, String str2) {
        Long lValueOf;
        InterfaceC2262081DgM currentUser;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_list_appeal_submit_toast");
        c474500IjALIZ.LJJII(str, "record_id");
        c474500IjALIZ.LJJII(str2, "appeal_result");
        Long lValueOf2 = null;
        if (dataChannel != null) {
            lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            lValueOf2 = Long.valueOf(currentUser.getId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        c474500IjALIZ.LIZ();
    }
}
