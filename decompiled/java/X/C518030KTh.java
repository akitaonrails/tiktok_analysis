package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0KTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518030KTh {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(2);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(2);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanEmoteNewTipSetting", new LiveSettingModel("live_super_fan_emote_new_tip", "boolean", new q(Boolean.FALSE)));
        this.LIZ.put("com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanPackagePrefetchSetting", new LiveSettingModel("live_super_fan_package_prefetch_setting", "boolean", new q(Boolean.TRUE)));
        return this.LIZ;
    }
}
