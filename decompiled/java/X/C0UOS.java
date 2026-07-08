package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UOS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UOS {
    public static final C0UOS LIZ = new C0UOS();

    public static void LIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_age_gate_change_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        if (str != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ukr_safety_warning_popup_click");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(str, "action_type");
            c474500IjALIZ.LIZ();
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_ukr_safety_warning_popup_show");
        c474500IjALIZ2.LJIJJLI(dataChannel);
        c474500IjALIZ2.LIZ();
    }
}
