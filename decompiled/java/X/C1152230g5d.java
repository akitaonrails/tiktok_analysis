package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152230g5d {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(2);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(2);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_service_manager_init_opt_for_host_service", "boolean", new q(Boolean.FALSE));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.settings.LiveServiceManagerInitOptForHostService", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_service_manager_init_opt_for_live_service", "boolean", new q(Boolean.TRUE));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.settings.LiveServiceManagerInitOptForLiveService", liveSettingModel2);
        return this.LIZ;
    }
}
