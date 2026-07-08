package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.DeviceZtiConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XDV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XDV extends C09AY implements Function0<DeviceZtiConfig> {
    public C0XDV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DeviceZtiConfig invoke() {
        Object c098200Yq;
        DeviceZtiConfig deviceZtiConfig = C0XDU.LIZ;
        try {
            c098200Yq = (DeviceZtiConfig) C0C64.LJIILLIIL().LJJII(DeviceZtiConfig.class, C0XDU.LIZ, "device_zti_config", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        DeviceZtiConfig deviceZtiConfig2 = (DeviceZtiConfig) c098200Yq;
        return (deviceZtiConfig2 == null || deviceZtiConfig2.configVersion < 3) ? C0XDU.LIZ : deviceZtiConfig2;
    }
}
