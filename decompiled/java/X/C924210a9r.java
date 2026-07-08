package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0a9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924210a9r {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (C924230a9t.LIZ(32) || !LiveAbLabelSetting.INSTANCE.getBooleanValue("count_down_for_all_enable_phase2")) {
            return false;
        }
        return (!C930540aK4.LJJIJ() || C500260Jjc.LJJIJLIJ()) && C924240a9u.LIZ().codeTechSwitchForAndroid != 0;
    }

    public static boolean LIZIZ() {
        if (C924230a9t.LIZ(32)) {
            return false;
        }
        Boolean boolLIZLLL = C931820aM8.LIZLLL("count_down_for_all_enable_phase2");
        return (!C500260Jjc.LJJJI(Boolean.valueOf(boolLIZLLL != null ? boolLIZLLL.booleanValue() : true)) || C930540aK4.LJJIJ() || C924240a9u.LIZ().codeTechSwitchForAndroid == 0) ? false : true;
    }
}
