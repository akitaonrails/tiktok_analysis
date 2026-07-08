package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0aRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934960aRC {
    public static int LIZ() {
        if (C930540aK4.LIZJ()) {
            return LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_layout_market_enable");
        }
        if (C500260Jjc.LJJIL()) {
            return LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_layout_market_enable");
        }
        Integer numLJ = C931820aM8.LJ("multi_guest_layout_market_enable");
        if (numLJ != null) {
            return numLJ.intValue();
        }
        return 0;
    }

    public static boolean LIZIZ() {
        return LIZ() == 2;
    }
}
