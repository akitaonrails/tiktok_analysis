package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Im7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476330Im7 {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(6);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(6);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.WATCHLIVE;
        map.put("live_drawer_disable_game_landing", scopeValue);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.FEED;
        map2.put("live_drawer_game_landing_fix", scopeValue2);
        this.LIZIZ.put("live_drawer_tab_landing_custom", scopeValue);
        this.LIZIZ.put("live_drawer_tab_landing_support_type", scopeValue);
        this.LIZIZ.put("live_drawer_tab_support_server_ctl", scopeValue2);
        this.LIZIZ.put("live_drawer_tab_update_delay", scopeValue2);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveDrawerDisableGameLandingSetting", new LiveSettingModel("live_drawer_disable_game_landing", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveDrawerGameLandingFixSetting", new LiveSettingModel("live_drawer_game_landing_fix", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveDrawerTabLandingCustomSetting", new LiveSettingModel("live_drawer_tab_landing_custom", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveDrawerTabLandingSupportTypeSetting", new LiveSettingModel("live_drawer_tab_landing_support_type", "java.lang.String[]", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveDrawerTabSupportServerCtlSetting", new LiveSettingModel("live_drawer_tab_support_server_ctl", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveDrawerTabUpdateDelaySetting", new LiveSettingModel("live_drawer_tab_update_delay", "long", new q((Number) (-1L))));
        return this.LIZ;
    }
}
