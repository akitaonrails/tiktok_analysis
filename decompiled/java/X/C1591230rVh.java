package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.setting.ab.AdvancedConfig;
import com.ss.android.ugc.aweme.setting.ab.CleanupConfig;
import com.ss.android.ugc.aweme.setting.ab.IdleTriggerConfig;
import com.ss.android.ugc.aweme.setting.ab.MemoryTriggerConfig;
import com.ss.android.ugc.aweme.setting.ab.TabCleanConfig;
import com.ss.android.ugc.aweme.setting.ab.TargetConfig;
import com.ss.android.ugc.aweme.setting.ab.TriggerConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591230rVh extends C09AY implements Function0<TabCleanConfig> {
    public C1591230rVh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r20v0, types: [com.ss.android.ugc.aweme.setting.ab.TabCleanConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final TabCleanConfig invoke() {
        ?? LJJIIJ = C0C64.LJIILLIIL().LJJIIJ(true, "tab_memory_clean_config_new", 31744, TabCleanConfig.class, C1591220rVg.LIZ, 2);
        return LJJIIJ == 0 ? new TabCleanConfig(false, false, new TargetConfig(null, null, 0, 7, null), new TriggerConfig(new MemoryTriggerConfig(false, 1, 20000L, 4000L, 0.55f, 0.9f, 3, 0, 0.2d, 0.5d, Mp4ScreenVideoLoadTimeout.CONTROL), new IdleTriggerConfig(false, 60000L, 2, true)), new CleanupConfig(false, false), new AdvancedConfig(false, false, false, 30000L, 10000L)) : LJJIIJ;
    }
}
