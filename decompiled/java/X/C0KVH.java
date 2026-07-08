package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0KVH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KVH {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(3);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(3);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        this.LIZIZ.put("iap_merchant_id_live_event", ScopeValue.WALLET);
        this.LIZIZ.put("live_integrated_tracker_dolphin_configuration", ScopeValue.OTHER);
        this.LIZIZ.put("ttlive_buried_field_reduction_opt", ScopeValue.PERFORMANCE);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        LiveSettingModel liveSettingModel = new LiveSettingModel("iap_merchant_id_live_event", "java.lang.String", new q("80LRFZB70401"));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveEventIAPMerchantID", liveSettingModel);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting", new LiveSettingModel("live_integrated_tracker_dolphin_configuration", "LiveLogSampleConfigData", new q("")));
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("ttlive_buried_field_reduction_opt", "BuriedFieldData", new q(""));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting", liveSettingModel2);
        return this.LIZ;
    }
}
