package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.ab.RealtimeFcpClientExpConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SVB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVB extends C09AY implements Function0<RealtimeFcpClientExpConfig> {
    public C0SVB() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final RealtimeFcpClientExpConfig invoke() {
        try {
            return (RealtimeFcpClientExpConfig) C0C64.LJIILLIIL().LJJII(RealtimeFcpClientExpConfig.class, C0SVA.LIZ, "fcp_personalization_client_config", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C0SVA.LIZ;
        }
    }
}
