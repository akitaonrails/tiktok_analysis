package X;

import com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183661AdA extends C09AY implements Function0<Boolean> {
    public C2183661AdA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        MonitorSamplingConfig monitorSamplingConfig = MonitorSamplingConfig.LIZ;
        return Boolean.valueOf(((MonitorSamplingConfig.ConfigValue) MonitorSamplingConfig.LIZJ.getValue()).recUserScene >= MonitorSamplingConfig.LIZ());
    }
}
