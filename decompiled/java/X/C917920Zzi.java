package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0Zzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917920Zzi {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return LiveAbLabelSetting.INSTANCE.getBooleanValue("multi_guest_skip_tip_for_enlarge_another");
    }

    public static boolean LIZIZ(boolean z) {
        if (z) {
            return LiveAbLabelSetting.INSTANCE.getBooleanValue("multi_guest_skip_enlarge_check_in_change_layout");
        }
        if (!z) {
            Boolean boolLIZLLL = C931820aM8.LIZLLL("multi_guest_skip_enlarge_check_in_change_layout");
            if (boolLIZLLL != null) {
                return boolLIZLLL.booleanValue();
            }
            return false;
        }
        throw new C1954807lC();
    }
}
