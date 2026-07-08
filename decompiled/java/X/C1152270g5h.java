package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152270g5h {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(1);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.comp.impl.logger.slardarmonitor.LiveSlardarSdkConfigSetting", new LiveSettingModel("live_slardar_sdk_config", "java.lang.String", new q("")));
        return this.LIZ;
    }
}
