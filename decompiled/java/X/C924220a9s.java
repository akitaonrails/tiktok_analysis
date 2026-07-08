package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0a9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924220a9s {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        LiveAbLabelSetting liveAbLabelSetting = LiveAbLabelSetting.INSTANCE;
        int intValue = liveAbLabelSetting.getIntValue("multi_guest_revert_enlarge_and_bussiness_capabilities");
        boolean z = intValue != 0 && (intValue & 32) == 32;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("capabilities = ");
        sbLIZ.append(32);
        sbLIZ.append(", res = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiGuestRevertEnlargeAndBusinessSettingHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (z || !liveAbLabelSetting.getBooleanValue("count_down_for_all_enable_phase2")) {
            return false;
        }
        return (!C930540aK4.LJJIJ() || C500260Jjc.LJJIJLIJ()) && C924240a9u.LIZ().codeTechSwitchForAndroid != 0;
    }

    public static InterfaceC927690aFT LIZ() {
        if (LIZJ()) {
            C20441214yg.LIZIZ("CountDownForAllWrapper", "[getService] v2");
            return C310401Ig.LIZ();
        }
        C20441214yg.LIZIZ("CountDownForAllWrapper", "[getService] null");
        return null;
    }

    public static boolean LIZJ() {
        return C930540aK4.LIZJ() ? C924210a9r.LIZ() : C924210a9r.LIZIZ();
    }
}
