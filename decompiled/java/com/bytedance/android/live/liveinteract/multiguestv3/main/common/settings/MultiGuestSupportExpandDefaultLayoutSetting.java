package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_support_expand_default_layout")
public final class MultiGuestSupportExpandDefaultLayoutSetting {
    public static final int $stable;
    public static final ExpandLayoutInfo DEFAULT;
    public static final MultiGuestSupportExpandDefaultLayoutSetting INSTANCE = new MultiGuestSupportExpandDefaultLayoutSetting();

    public static final class ExpandLayoutInfo {
        public static final TypeAdapter ADAPTER;

        @C09CT("layout_style")
        public int layoutStyle;

        @C09CT("max_position")
        public int maxPosition;

        static {
            NormalGson.singleton();
            ADAPTER = new MultiGuestSupportExpandDefaultLayoutSetting_ExpandLayoutInfo_OptTypeAdapter();
        }
    }

    static {
        ExpandLayoutInfo expandLayoutInfo = new ExpandLayoutInfo();
        expandLayoutInfo.layoutStyle = 4;
        expandLayoutInfo.maxPosition = 9;
        DEFAULT = expandLayoutInfo;
        $stable = 8;
    }

    public final ExpandLayoutInfo getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ExpandLayoutInfo expandLayoutInfo = DEFAULT;
        ExpandLayoutInfo expandLayoutInfo2 = (ExpandLayoutInfo) settingsManager.getValueSafely("multi_guest_support_expand_default_layout", expandLayoutInfo);
        return expandLayoutInfo2 != null ? expandLayoutInfo2 : expandLayoutInfo;
    }
}
