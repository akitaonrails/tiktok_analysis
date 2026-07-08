package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.ab.FeedComponentComplexityExpConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RKY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKY extends C09AY implements Function0<FeedComponentComplexityExpConfig> {
    public C0RKY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedComponentComplexityExpConfig invoke() {
        try {
            return (FeedComponentComplexityExpConfig) C0C64.LJIILLIIL().LJJII(FeedComponentComplexityExpConfig.class, C0RKZ.LIZ, "feed_component_complexity_opt", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C0RKZ.LIZ;
        }
    }
}
