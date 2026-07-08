package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0a9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924230a9t {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i) {
        int intValue;
        boolean z = false;
        if (!C930540aK4.LIZJ() && !C500260Jjc.LJJIJLIJ()) {
            Integer numLJ = C931820aM8.LJ("multi_guest_revert_enlarge_and_bussiness_capabilities");
            if (numLJ != null) {
                intValue = numLJ.intValue();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("capabilities = ");
            sbLIZ.append(i);
            sbLIZ.append(", res = ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("MultiGuestRevertEnlargeAndBusinessSettingHelper", C2188811AlT.LIZIZ(sbLIZ));
            return z;
        }
        intValue = LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_revert_enlarge_and_bussiness_capabilities");
        if (intValue != 0 && (intValue & i) == i) {
            z = true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("capabilities = ");
        sbLIZ2.append(i);
        sbLIZ2.append(", res = ");
        sbLIZ2.append(z);
        C20441214yg.LIZIZ("MultiGuestRevertEnlargeAndBusinessSettingHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }
}
