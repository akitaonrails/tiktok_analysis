package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1586, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1586 extends C09AY implements Function0<C1097220eeu> {
    public AnonymousClass1586() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1097220eeu invoke() {
        LiveLogDensityMonitorSetting liveLogDensityMonitorSetting = LiveLogDensityMonitorSetting.INSTANCE;
        return new C1097220eeu(liveLogDensityMonitorSetting.getAppLogSampleConfig().getMonitorQueueLen(), liveLogDensityMonitorSetting.getAppLogSampleConfig().getMonitorReportTopN(), liveLogDensityMonitorSetting.getAppLogSampleConfig().getMonitorIntervalMs(), new AnonymousClass1588());
    }
}
