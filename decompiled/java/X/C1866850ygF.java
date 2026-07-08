package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.ab.ComponentsUIShakeDetectConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ygF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1866850ygF extends C09AY implements Function0<ComponentsUIShakeDetectConfig> {
    public C1866850ygF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComponentsUIShakeDetectConfig invoke() {
        try {
            return (ComponentsUIShakeDetectConfig) C0C64.LJIILLIIL().LJJIIJ(true, "component_ui_shake_detect", 31744, ComponentsUIShakeDetectConfig.class, C1866840ygE.LIZ, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1866840ygE.LIZ;
        }
    }
}
