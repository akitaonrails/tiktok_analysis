package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guide_time")
public final class GuideTimeSetting {
    public static final GuideTimeSetting INSTANCE = new GuideTimeSetting();
    public static final GuideTimeConfig DEFAULT = new GuideTimeConfig(10000, 10000);
    public static final int $stable = 8;

    public static final class GuideTimeConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("apply_time")
        public long applyTime;

        @C09CT("guest_invite_time")
        public long guestInviteTime;

        static {
            NormalGson.singleton();
            ADAPTER = new GuideTimeSetting_GuideTimeConfig_OptTypeAdapter();
        }

        public GuideTimeConfig() {
            this(10000L, 10000L);
        }

        public GuideTimeConfig(long j, long j2) {
            this.guestInviteTime = j;
            this.applyTime = j2;
        }
    }

    public final GuideTimeConfig getSettingValue() {
        return (GuideTimeConfig) SettingsManager.INSTANCE.getValueSafely("multi_guest_guide_time", DEFAULT);
    }
}
