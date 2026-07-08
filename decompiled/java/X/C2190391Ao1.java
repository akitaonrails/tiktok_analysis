package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.psp.PSPSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ao1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190391Ao1 extends C09AY implements Function0<PSPSettings.TTMCenterConfig> {
    public C2190391Ao1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PSPSettings.TTMCenterConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PSPSettings.TTMCenterConfig tTMCenterConfig = PSPSettings.LIZ;
            PSPSettings.TTMCenterConfig tTMCenterConfig2 = (PSPSettings.TTMCenterConfig) c0c64LJIILLIIL.LJJII(PSPSettings.TTMCenterConfig.class, tTMCenterConfig, "ttk_psp_strategy_center_config", true);
            return tTMCenterConfig2 != null ? tTMCenterConfig2 : tTMCenterConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return PSPSettings.LIZ;
        }
    }
}
