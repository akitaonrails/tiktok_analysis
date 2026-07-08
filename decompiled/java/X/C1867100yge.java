package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.HybridKitConfigTaskOptimizationConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867100yge extends C09AY implements Function0<Boolean> {
    public C1867100yge() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            HybridKitConfigTaskOptimizationConfigModel hybridKitConfigTaskOptimizationConfigModel = C1867110ygf.LIZ;
            HybridKitConfigTaskOptimizationConfigModel hybridKitConfigTaskOptimizationConfigModel2 = (HybridKitConfigTaskOptimizationConfigModel) c0c64LJIILLIIL.LJJIIJ(true, "hybridkitconfigtask_opt", 31744, HybridKitConfigTaskOptimizationConfigModel.class, hybridKitConfigTaskOptimizationConfigModel, 2);
            z = hybridKitConfigTaskOptimizationConfigModel2 != null ? hybridKitConfigTaskOptimizationConfigModel2.subThread : hybridKitConfigTaskOptimizationConfigModel.subThread;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = C1867110ygf.LIZ.subThread;
        }
        return Boolean.valueOf(z);
    }
}
