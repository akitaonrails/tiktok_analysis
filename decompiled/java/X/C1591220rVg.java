package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.setting.ab.AdvancedConfig;
import com.ss.android.ugc.aweme.setting.ab.CleanupConfig;
import com.ss.android.ugc.aweme.setting.ab.IdleTriggerConfig;
import com.ss.android.ugc.aweme.setting.ab.MemoryTriggerConfig;
import com.ss.android.ugc.aweme.setting.ab.TabCleanConfig;
import com.ss.android.ugc.aweme.setting.ab.TargetConfig;
import com.ss.android.ugc.aweme.setting.ab.TriggerConfig;

/* JADX INFO: renamed from: X.0rVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591220rVg {
    public static final TabCleanConfig LIZ = new TabCleanConfig(false, false, new TargetConfig(null, null, 0, 7, null), new TriggerConfig(new MemoryTriggerConfig(false, 1, 20000, 4000, 0.55f, 0.9f, 3, 0, 0.2d, 0.5d, Mp4ScreenVideoLoadTimeout.CONTROL), new IdleTriggerConfig(false, 60000, 2, true)), new CleanupConfig(false, false), new AdvancedConfig(false, false, false, 30000, 10000));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1591230rVh());

    public static TabCleanConfig LIZJ() {
        return (TabCleanConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        return LIZJ().enable;
    }

    public static final boolean LIZIZ() {
        return LIZJ().cleanup.enableViewRelease;
    }

    public static boolean LIZLLL() {
        return LIZJ().cleanup.enableMemLeakFix;
    }
}
