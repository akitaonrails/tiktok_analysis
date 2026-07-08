package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152250g5f {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(1);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.impl.revenue.strategy.settings.LiveRechargePanelFallBackSetting", new LiveSettingModel("live_recharge_campaign_panel_fallback", "boolean", new q(Boolean.FALSE)));
        return this.LIZ;
    }
}
