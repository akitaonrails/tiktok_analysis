package com.bytedance.android.live.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_send_show_event_on_setup")
public final class LiveSendShowEventOnSetupSetting {
    public static final LiveSendShowEventOnSetupConfig DEFAULT;
    public static final LiveSendShowEventOnSetupSetting INSTANCE = new LiveSendShowEventOnSetupSetting();
    public static final List<String> allowedEnterFromMerge;
    public static final LiveSendShowEventOnSetupConfig value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveSendShowEventOnSetupConfig liveSendShowEventOnSetupConfig = new LiveSendShowEventOnSetupConfig(null, 1, null);
        DEFAULT = liveSendShowEventOnSetupConfig;
        LiveSendShowEventOnSetupConfig liveSendShowEventOnSetupConfig2 = (LiveSendShowEventOnSetupConfig) SettingsManager.INSTANCE.getValueSafely("live_send_show_event_on_setup", liveSendShowEventOnSetupConfig);
        if (liveSendShowEventOnSetupConfig2 != null) {
            liveSendShowEventOnSetupConfig = liveSendShowEventOnSetupConfig2;
        }
        value = liveSendShowEventOnSetupConfig;
        allowedEnterFromMerge = liveSendShowEventOnSetupConfig.allowedEnterFromMerge;
    }

    public static final LiveSendShowEventOnSetupConfig getValue() {
        return value;
    }

    public final List<String> getAllowedEnterFromMerge() {
        return allowedEnterFromMerge;
    }

    public final LiveSendShowEventOnSetupConfig getDEFAULT() {
        return DEFAULT;
    }
}
