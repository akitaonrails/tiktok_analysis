package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_text_header_mock")
public final class MultiGuestTextHeaderMockSetting {
    public static final MultiGuestTextHeaderMockSetting INSTANCE = new MultiGuestTextHeaderMockSetting();
    public static final TextHeaderMockConfig DEFAULT = new TextHeaderMockConfig(false, false, false, false);
    public static final int $stable = 8;

    public final TextHeaderMockConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TextHeaderMockConfig textHeaderMockConfig = DEFAULT;
        TextHeaderMockConfig textHeaderMockConfig2 = (TextHeaderMockConfig) settingsManager.getValueSafely("multi_guest_text_header_mock", textHeaderMockConfig);
        return textHeaderMockConfig2 != null ? textHeaderMockConfig2 : textHeaderMockConfig;
    }
}
