package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FcpTooltipConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C295100BhU extends C09AY implements Function0<FcpTooltipConfig> {
    public C295100BhU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FcpTooltipConfig invoke() {
        try {
            return (FcpTooltipConfig) C0C64.LJIILLIIL().LJJIIJ(true, "fcp_tooltip_config", 31744, FcpTooltipConfig.class, null, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
