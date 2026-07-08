package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.158A, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158A extends C09AY implements Function0<Boolean> {
    public C158A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(ThreadLocalRandom.current().nextDouble() < LiveLogDensityMonitorSetting.INSTANCE.getAppLogSampleConfig().getMonitorSampleRate());
    }
}
