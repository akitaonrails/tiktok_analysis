package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bsr.BSRLiveConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Blb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214371Blb extends C09AY implements Function0<BSRLiveConfig> {
    public C2214371Blb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final BSRLiveConfig invoke() {
        BSRLiveConfig bSRLiveConfig;
        try {
            C0C64.LJIILLIIL().getClass();
            bSRLiveConfig = (BSRLiveConfig) C0C64.LJJIFFI(true, "bsr_live_config_exp", 31744, BSRLiveConfig.class, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bSRLiveConfig = C2214381Blc.LIZ;
        }
        return bSRLiveConfig == null ? C2214381Blc.LIZ : bSRLiveConfig;
    }
}
