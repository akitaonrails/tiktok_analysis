package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.config.Config;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0Q4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664470Q4n {
    public static final Config LIZ = new Config(0, LivePreCreateNextRoomPlayer.ENABLE, LSPassThroughRecordSizeConfig.DEFAULT);
    public static Config LIZIZ;

    public static final Config LIZ() {
        Config config = LIZIZ;
        if (config != null) {
            return config;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Config config2 = LIZ;
        Config config3 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config2, "search_bsr_monitor_config", true);
        if (config3 != null) {
            config2 = config3;
        }
        LIZIZ = config2;
        return config2;
    }
}
