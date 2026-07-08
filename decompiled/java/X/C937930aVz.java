package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0aVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937930aVz {
    public static boolean LIZ() {
        return LIZIZ() == 1 || LIZIZ() == 2;
    }

    public static int LIZIZ() {
        if (C930540aK4.LIZJ()) {
            return LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_agree_apply_guide");
        }
        Integer numLJ = C931820aM8.LJ("multi_guest_agree_apply_guide");
        if (numLJ != null) {
            return numLJ.intValue();
        }
        return 0;
    }
}
