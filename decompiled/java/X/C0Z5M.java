package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.experiment.DMLowEndDevicesConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z5M, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z5M extends C09AY implements Function0<DMLowEndDevicesConfig> {
    public C0Z5M() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final DMLowEndDevicesConfig invoke() {
        DMLowEndDevicesConfig dMLowEndDevicesConfig;
        try {
            DMLowEndDevicesConfig dMLowEndDevicesConfig2 = (DMLowEndDevicesConfig) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_load_end_devices_config", DMLowEndDevicesConfig.class, C0Z5L.LIZ);
            C189200o6.m2constructorimpl(dMLowEndDevicesConfig2);
            dMLowEndDevicesConfig = dMLowEndDevicesConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            dMLowEndDevicesConfig = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(dMLowEndDevicesConfig) || dMLowEndDevicesConfig == 0) ? C0Z5L.LIZ : dMLowEndDevicesConfig;
    }
}
