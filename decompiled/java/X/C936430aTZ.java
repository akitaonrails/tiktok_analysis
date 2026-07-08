package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicFixLiveStudioEnableMediaState;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0aTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936430aTZ {
    public static boolean LIZ;

    public static int LIZIZ() {
        if (LIZ) {
            return LiveAbLabelSetting.INSTANCE.getIntValue("live_linkmic_enable_state_consistency");
        }
        Integer numLJ = C931820aM8.LJ("live_linkmic_enable_state_consistency");
        return numLJ != null ? numLJ.intValue() : LinkMicFixLiveStudioEnableMediaState.INSTANCE.isEnable() ? 3 : 0;
    }

    public static boolean LIZ() {
        return (LIZIZ() & 1) == 1;
    }
}
