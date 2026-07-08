package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.experiment.Config;

/* JADX INFO: renamed from: X.0gCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156780gCy {
    public static final Config LIZ;
    public static final Config LIZIZ;

    static {
        Config config = new Config(false, 0, false);
        LIZ = config;
        try {
            Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, config, "background_playback_leak_opt", true);
            if (config2 != null) {
                config = config2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            config = LIZ;
        }
        LIZIZ = config;
    }
}
