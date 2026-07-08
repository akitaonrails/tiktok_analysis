package com.bytedance.android.live.slot;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_shop_add_permission_business")
public final class LiveShopAddPermissionBusinessSetting {
    public static final boolean DEFAULT = true;
    public static final LiveShopAddPermissionBusinessSetting INSTANCE = new LiveShopAddPermissionBusinessSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_shop_add_permission_business", DEFAULT);
    }
}
