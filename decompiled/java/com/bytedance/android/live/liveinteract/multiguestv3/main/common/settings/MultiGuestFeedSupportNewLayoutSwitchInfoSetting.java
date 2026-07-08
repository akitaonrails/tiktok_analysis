package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_feed_support_new_layout_switch_info")
public final class MultiGuestFeedSupportNewLayoutSwitchInfoSetting {
    public static final MultiGuestFeedSupportNewLayoutSwitchInfoSetting INSTANCE = new MultiGuestFeedSupportNewLayoutSwitchInfoSetting();
    public static final FeedSupportNewLayoutSwitchInfo DEFAULT = new FeedSupportNewLayoutSwitchInfo(true, true, true, true, true, true, true, true, true, true);
    public static final int $stable = 8;

    public final FeedSupportNewLayoutSwitchInfo getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FeedSupportNewLayoutSwitchInfo feedSupportNewLayoutSwitchInfo = DEFAULT;
        FeedSupportNewLayoutSwitchInfo feedSupportNewLayoutSwitchInfo2 = (FeedSupportNewLayoutSwitchInfo) settingsManager.getValueSafely("multi_guest_feed_support_new_layout_switch_info", feedSupportNewLayoutSwitchInfo);
        return feedSupportNewLayoutSwitchInfo2 != null ? feedSupportNewLayoutSwitchInfo2 : feedSupportNewLayoutSwitchInfo;
    }

    public static final class FeedSupportNewLayoutSwitchInfo {
        public static final TypeAdapter ADAPTER = new MultiGuestFeedSupportNewLayoutSwitchInfoSetting_FeedSupportNewLayoutSwitchInfo_OptTypeAdapter(NormalGson.singleton());

        @C09CT("add_show_log")
        public boolean addShowLog;

        @C09CT("fix_memory_leak")
        public boolean fixMemoryLeak;

        @C09CT("fix_multiguest_v3_manager_data_holder_init_way")
        public boolean fixMultiGuestV3ManagerDataHolderInitWay;

        @C09CT("layout_attach_parent_opt")
        public boolean layoutAttachParentOpt;

        @C09CT("online_state_opt")
        public boolean onlineStateOpt;

        @C09CT("opt_link_mic_close_logic")
        public boolean optLinkMicCloseLogic;

        @C09CT("search_empty_view_opt")
        public boolean searchEmptyViewOpt;

        @C09CT("shared_bg_load_opt")
        public boolean sharedBgLoadOpt;

        @C09CT("ui_opt")
        public boolean uiOpt;

        @C09CT("use_injected_layout_manager")
        public boolean useInjectedLayoutManager;

        public FeedSupportNewLayoutSwitchInfo() {
            this(true, true, true, true, true, true, true, true, true, true);
        }

        public FeedSupportNewLayoutSwitchInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
            this.uiOpt = z;
            this.sharedBgLoadOpt = z2;
            this.searchEmptyViewOpt = z3;
            this.layoutAttachParentOpt = z4;
            this.addShowLog = z5;
            this.fixMultiGuestV3ManagerDataHolderInitWay = z6;
            this.onlineStateOpt = z7;
            this.fixMemoryLeak = z8;
            this.optLinkMicCloseLogic = z9;
            this.useInjectedLayoutManager = z10;
        }
    }
}
