package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Im8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476340Im8 {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(1);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.feed.watchlater.LiveWatchLaterMaxSizeSetting", new LiveSettingModel("live_watch_later_max_size", "int", new q((Number) 5)));
        return this.LIZ;
    }
}
