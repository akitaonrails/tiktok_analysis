package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1589, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1589 extends C09AY implements Function0<Boolean> {
    public AnonymousClass1589() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(ThreadLocalRandom.current().nextDouble() < LiveLogDensityMonitorSetting.INSTANCE.getAlogSampleConfig().getMonitorSampleRate());
    }
}
