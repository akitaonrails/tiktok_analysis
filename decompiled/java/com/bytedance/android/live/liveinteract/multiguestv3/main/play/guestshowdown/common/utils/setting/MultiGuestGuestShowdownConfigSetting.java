package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guest_showdown_config")
public final class MultiGuestGuestShowdownConfigSetting {
    public static final int $stable;
    public static final GuestShowDownConfig DEFAULT;
    public static final MultiGuestGuestShowdownConfigSetting INSTANCE = new MultiGuestGuestShowdownConfigSetting();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("winner", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/mg_rank_winner.png~0x0.png");
        linkedHashMap.put("loser", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/mg_rank_loser.png~0x0.png");
        linkedHashMap.put("loser_phase1", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_1@3x.png~0x0.png");
        linkedHashMap.put("loser_phase2", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_2@3x.png~0x0.png");
        linkedHashMap.put("loser_phase3", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_3@3x.png~0x0.png");
        DEFAULT = new GuestShowDownConfig("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Fguest-showdown-faq%2Ftemplate.js&height=70%25&gravity=bottom&radius=12&landscape_height=100%25&landscape_width=390&gecko_url_redirection=1&use_forest=1&bdhm_bid=tiktok_live_interaction_multi_guest", 1, 0, 1, 9, 600L, 59940L, 7, linkedHashMap);
        $stable = 8;
    }

    public final GuestShowDownConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GuestShowDownConfig guestShowDownConfig = DEFAULT;
        GuestShowDownConfig guestShowDownConfig2 = (GuestShowDownConfig) settingsManager.getValueSafely("multi_guest_guest_showdown_config", guestShowDownConfig);
        return guestShowDownConfig2 != null ? guestShowDownConfig2 : guestShowDownConfig;
    }

    public final boolean isTechSwitchOn() {
        return getSettingValue().techSwitch == 1;
    }
}
