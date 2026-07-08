package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bsr.BSRConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Blh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214431Blh extends C09AY implements Function0<BSRConfig> {
    public C2214431Blh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final BSRConfig invoke() {
        BSRConfig bSRConfig;
        try {
            C0C64.LJIILLIIL().getClass();
            Object objLJJIFFI = C0C64.LJJIFFI(true, "bsr_config_exp", 31744, BSRConfig.class, 2);
            bSRConfig = (BSRConfig) objLJJIFFI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bSRConfig = C1DS1.LIZ;
        }
        return bSRConfig == null ? C1DS1.LIZ : bSRConfig;
    }
}
