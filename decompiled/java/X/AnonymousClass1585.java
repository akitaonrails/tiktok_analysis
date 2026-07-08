package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1585, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1585 extends C09AY implements Function0<C1097220eeu> {
    public AnonymousClass1585() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1097220eeu invoke() {
        LiveLogDensityMonitorSetting liveLogDensityMonitorSetting = LiveLogDensityMonitorSetting.INSTANCE;
        return new C1097220eeu(liveLogDensityMonitorSetting.getAlogSampleConfig().getMonitorQueueLen(), liveLogDensityMonitorSetting.getAlogSampleConfig().getMonitorReportTopN(), liveLogDensityMonitorSetting.getAlogSampleConfig().getMonitorIntervalMs(), new AnonymousClass1587());
    }
}
