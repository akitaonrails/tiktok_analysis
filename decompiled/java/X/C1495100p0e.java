package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.network.experiment.ZeroCopyConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0p0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495100p0e extends C09AY implements Function0<ZeroCopyConfig> {
    public C1495100p0e() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ZeroCopyConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ZeroCopyConfig zeroCopyConfig = C1495090p0d.LIZ;
            ZeroCopyConfig zeroCopyConfig2 = (ZeroCopyConfig) c0c64LJIILLIIL.LJJIIJ(true, "response_zero_copy_config", 31744, ZeroCopyConfig.class, zeroCopyConfig, 2);
            return zeroCopyConfig2 != null ? zeroCopyConfig2 : zeroCopyConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1495090p0d.LIZ;
        }
    }
}
