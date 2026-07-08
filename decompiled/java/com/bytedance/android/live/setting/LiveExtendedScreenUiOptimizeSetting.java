package com.bytedance.android.live.setting;

import X.C500260Jjc;
import X.C751980Tee;
import X.C781520UlC;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_extended_screen_ui_optimize")
public final class LiveExtendedScreenUiOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final LiveExtendedScreenUiOptimizeSetting INSTANCE = new LiveExtendedScreenUiOptimizeSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_extended_screen_ui_optimize", DEFAULT);
    }

    public final boolean enableUIOptimize(DataChannel dataChannel) {
        if (getValue() > 0 && !C500260Jjc.LJJIZ(dataChannel) && !C781520UlC.LIZJ(C751980Tee.LIZJ(dataChannel))) {
            return true;
        }
        return false;
    }

    public final boolean giftTrayOptimize(DataChannel dataChannel) {
        if (getValue() == 3 && !C500260Jjc.LJJIZ(dataChannel) && !C781520UlC.LIZJ(C751980Tee.LIZJ(dataChannel))) {
            return true;
        }
        return false;
    }

    public final boolean hideFirstRow(DataChannel dataChannel) {
        if (getValue() > 1 && !C500260Jjc.LJJIZ(dataChannel) && !C781520UlC.LIZJ(C751980Tee.LIZJ(dataChannel))) {
            return true;
        }
        return false;
    }

    public final boolean hideSecondRow(DataChannel dataChannel) {
        if (getValue() > 0 && !C500260Jjc.LJJIZ(dataChannel) && !C781520UlC.LIZJ(C751980Tee.LIZJ(dataChannel))) {
            return true;
        }
        return false;
    }
}
