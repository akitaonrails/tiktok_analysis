package X;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomRefreshConfig;

/* JADX INFO: renamed from: X.0ITv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("room_status_monitor")
public final class C467210ITv {
    public static final C467210ITv LIZ = new C467210ITv();
    public static final LiveRoomRefreshConfig LIZIZ;

    static {
        LiveRoomRefreshConfig liveRoomRefreshConfig = new LiveRoomRefreshConfig(40, 20, false, 1, true, false, true, false, true);
        LiveRoomRefreshConfig liveRoomRefreshConfig2 = (LiveRoomRefreshConfig) SettingsManager.INSTANCE.getValueSafely("room_status_monitor", liveRoomRefreshConfig);
        if (liveRoomRefreshConfig2 != null) {
            liveRoomRefreshConfig = liveRoomRefreshConfig2;
        }
        LIZIZ = liveRoomRefreshConfig;
    }
}
