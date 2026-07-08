package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152290g5j {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(1);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings", new LiveSettingModel("live_like_degrade", "LiveLikeDegrade", new q("")));
        return this.LIZ;
    }
}
