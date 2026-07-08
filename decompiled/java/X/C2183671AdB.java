package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183671AdB extends C09AY implements Function0<MonitorSamplingConfig.ConfigValue> {
    public C2183671AdB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig$ConfigValue, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final MonitorSamplingConfig.ConfigValue invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MonitorSamplingConfig.ConfigValue configValue = MonitorSamplingConfig.LIZIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("relation_monitor_sampling", MonitorSamplingConfig.ConfigValue.class, configValue);
        return LJIIIIZZ != 0 ? LJIIIIZZ : configValue;
    }
}
