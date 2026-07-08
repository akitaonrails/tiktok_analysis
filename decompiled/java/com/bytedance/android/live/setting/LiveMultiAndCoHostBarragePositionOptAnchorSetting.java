package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_multi_and_cohost_barrage_position_opt")
public final class LiveMultiAndCoHostBarragePositionOptAnchorSetting {
    public static final int BARRAGE_IN_STREAM = 3;
    public static final int DEFAULT = 0;
    public static final LiveMultiAndCoHostBarragePositionOptAnchorSetting INSTANCE = new LiveMultiAndCoHostBarragePositionOptAnchorSetting();
    public static final int SHOW_ON_DEMAND = 1;
    public static final int TOP_NO_MARGIN = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_multi_and_cohost_barrage_position_opt", DEFAULT);
    }
}
