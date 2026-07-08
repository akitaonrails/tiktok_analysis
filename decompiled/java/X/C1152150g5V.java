package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152150g5V {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(6);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(6);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.OTHER;
        map.put("check_ve_plugin_installed", scopeValue);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.BROADCAST;
        map2.put("live_algorithm_model_download_downgrade_models", scopeValue2);
        this.LIZIZ.put("live_anchor_makeup_ab_group", scopeValue2);
        this.LIZIZ.put("live_audience_makeup_ab_group", scopeValue);
        this.LIZIZ.put("multi_guest_shared_bg_activity_tech", scopeValue);
        this.LIZIZ.put("count_down_effect_download_number", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.TRUE;
        this.LIZ.put("com.bytedance.android.live.effect.CheckVePluginInstalledSetting", new LiveSettingModel("check_ve_plugin_installed", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_algorithm_model_download_downgrade_models", "boolean", new q(Boolean.FALSE));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.effect.LiveAlgorithmModelDownloadSetting", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_anchor_makeup_ab_group", "int", new q((Number) 0));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.effect.LiveAnchorMakeupAbGroupSetting", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("live_audience_makeup_ab_group", "int", new q((Number) 0));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.effect.LiveAudienceMakeupAbGroupSetting", liveSettingModel3);
        this.LIZ.put("com.bytedance.android.live.effect.MultiGuestSharedBgActivityTechSetting", new LiveSettingModel("multi_guest_shared_bg_activity_tech", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.effect.countdown.CountDownEffectDownloadNumberSetting", new LiveSettingModel("count_down_effect_download_number", "int", new q((Number) 0)));
        return this.LIZ;
    }
}
