package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.LaunchBindBigCore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587370N1z extends C09AY implements Function0<LaunchBindBigCore> {
    public C587370N1z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LaunchBindBigCore invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            LaunchBindBigCore launchBindBigCore = C587360N1y.LIZ;
            LaunchBindBigCore launchBindBigCore2 = (LaunchBindBigCore) c0c64LJIILLIIL.LJJIIJ(true, "optimize_cold_boot_bindcore", 31744, LaunchBindBigCore.class, launchBindBigCore, 2);
            return launchBindBigCore2 != null ? launchBindBigCore2 : launchBindBigCore;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C587360N1y.LIZ;
        }
    }
}
