package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0ToS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758060ToS {
    public static final boolean LIZ() {
        return InterfaceC1106030et7.f145u4.LIZIZ().booleanValue() || InterfaceC772390URp.LLZZLLIL.LIZIZ().booleanValue();
    }

    public static final void LIZIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_toggle_first_popup");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(C772130UQp.LIZ(C758680TpS.LIZ(dataChannel), C758680TpS.LIZIZ(dataChannel)), "anchor_type");
        c474500IjALIZ.LIZ();
    }
}
