package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_board_template_official_config")
public final class MultiGuestBoardTemplateOfficialConfigSetting {
    public static final MultiGuestBoardTemplateOfficialConfigSetting INSTANCE = new MultiGuestBoardTemplateOfficialConfigSetting();
    public static final MultiGuestBoardTemplateOfficialConfig DEFAULT = new MultiGuestBoardTemplateOfficialConfig(2000, 500, 999);
    public static final int $stable = 8;

    public final MultiGuestBoardTemplateOfficialConfig getValue() {
        MultiGuestBoardTemplateOfficialConfig multiGuestBoardTemplateOfficialConfig = (MultiGuestBoardTemplateOfficialConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestBoardTemplateOfficialConfigSetting.class);
        return multiGuestBoardTemplateOfficialConfig == null ? DEFAULT : multiGuestBoardTemplateOfficialConfig;
    }
}
