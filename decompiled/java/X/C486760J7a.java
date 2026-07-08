package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.experiment.LiveStatusBatchUpdateExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486760J7a extends C09AY implements Function0<LiveStatusBatchUpdateExp.LiveStatusBatchUpdateConfig> {
    public C486760J7a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LiveStatusBatchUpdateExp.LiveStatusBatchUpdateConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            LiveStatusBatchUpdateExp.LiveStatusBatchUpdateConfig liveStatusBatchUpdateConfig = LiveStatusBatchUpdateExp.LIZ;
            LiveStatusBatchUpdateExp.LiveStatusBatchUpdateConfig liveStatusBatchUpdateConfig2 = (LiveStatusBatchUpdateExp.LiveStatusBatchUpdateConfig) c0c64LJIILLIIL.LJJII(LiveStatusBatchUpdateExp.LiveStatusBatchUpdateConfig.class, liveStatusBatchUpdateConfig, "feed_live_status_batch_query_config", true);
            return liveStatusBatchUpdateConfig2 != null ? liveStatusBatchUpdateConfig2 : liveStatusBatchUpdateConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LiveStatusBatchUpdateExp.LIZ;
        }
    }
}
