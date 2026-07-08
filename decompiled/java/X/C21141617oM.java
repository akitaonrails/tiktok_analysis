package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.psp.TTMConfigSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21141617oM extends C09AY implements Function0<TTMConfigSettings.TTMConfig> {
    public C21141617oM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TTMConfigSettings.TTMConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            TTMConfigSettings.TTMConfig tTMConfig = TTMConfigSettings.LIZ;
            TTMConfigSettings.TTMConfig tTMConfig2 = (TTMConfigSettings.TTMConfig) c0c64LJIILLIIL.LJJII(TTMConfigSettings.TTMConfig.class, tTMConfig, "ttk_ttm_core_configs", true);
            return tTMConfig2 != null ? tTMConfig2 : tTMConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return TTMConfigSettings.LIZ;
        }
    }
}
