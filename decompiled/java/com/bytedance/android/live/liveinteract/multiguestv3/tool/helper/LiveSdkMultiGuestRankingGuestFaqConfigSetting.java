package com.bytedance.android.live.liveinteract.multiguestv3.tool.helper;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_ranking_guest_faq_config")
public final class LiveSdkMultiGuestRankingGuestFaqConfigSetting {
    public static final LiveSdkMultiGuestRankingGuestFaqConfigSetting INSTANCE = new LiveSdkMultiGuestRankingGuestFaqConfigSetting();
    public static final FaqConfig DEFAULT = new FaqConfig(null, null, 3, null);
    public static String anchorRegion = "";
    public static final int $stable = 8;

    public final FaqConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FaqConfig faqConfig = DEFAULT;
        FaqConfig faqConfig2 = (FaqConfig) settingsManager.getValueSafely("live_sdk_multi_guest_ranking_guest_faq_config", faqConfig);
        return faqConfig2 != null ? faqConfig2 : faqConfig;
    }

    public final boolean isShowFaqRegion() {
        return getSettingValue().showRegionList.contains(anchorRegion.toUpperCase(Locale.ROOT));
    }

    public final String getAnchorRegion() {
        return anchorRegion;
    }

    public final void setAnchorRegion(String str) {
        anchorRegion = str;
    }
}
