package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927580aFI {
    public static boolean LIZ;

    public static void LIZIZ() {
        if (C930540aK4.LIZJ()) {
            String strLJIJI = C497740JfY.LJIJI(2131851254);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
            C924620aAW.LJIILIIL(c474500IjALIZ);
            c474500IjALIZ.LJJII("anchor", "user_type");
            c474500IjALIZ.LJJII(strLJIJI, "msg_content");
            c474500IjALIZ.LJJII("ttlive_audioModeMultiGuest_creatorScreen_cannotTurnOnCameraToast", "msg_id");
            c474500IjALIZ.LJJII("mg_downgrade_only_audio", "extra");
            c474500IjALIZ.LIZ();
            return;
        }
        String strLJIJI2 = C497740JfY.LJIJI(2131851259);
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_toast_msg_show");
        C924620aAW.LJIILIIL(c474500IjALIZ2);
        c474500IjALIZ2.LJJII("user", "user_type");
        c474500IjALIZ2.LJJII(strLJIJI2, "msg_content");
        c474500IjALIZ2.LJJII("ttlive_audioModeMultiGuest_guestScreen_settingsPanel_audioOnlyDesc", "msg_id");
        c474500IjALIZ2.LJJII("mg_downgrade_only_audio", "extra");
        c474500IjALIZ2.LIZ();
    }

    public static void LIZ(String str) {
        if (C927560aFG.LIZJ()) {
            MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
            if ((multiGuestDataHolderLJJIFFI != null && multiGuestDataHolderLJJIFFI.LJJIFFI == 1) || Intrinsics.LJFF(str, "disconnect_all")) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_downgrade_disconnect_panel");
                C924620aAW.LJIILIIL(c474500IjALIZ);
                c474500IjALIZ.LJJII(str, "trigger");
                c474500IjALIZ.LIZ();
            }
        }
    }
}
