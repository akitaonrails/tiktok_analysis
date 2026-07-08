package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.FeedLynxCardFallbackExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14fN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20321514fN extends C09AY implements Function0<FeedLynxCardFallbackExperiment.FallbackModel> {
    public C20321514fN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FeedLynxCardFallbackExperiment.FallbackModel invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            FeedLynxCardFallbackExperiment.FallbackModel fallbackModel = FeedLynxCardFallbackExperiment.LIZIZ;
            FeedLynxCardFallbackExperiment.FallbackModel fallbackModel2 = (FeedLynxCardFallbackExperiment.FallbackModel) c0c64LJIILLIIL.LJJIIJ(true, "feed_lynx_card_fallback_exp", 31744, FeedLynxCardFallbackExperiment.FallbackModel.class, fallbackModel, 2);
            return fallbackModel2 != null ? fallbackModel2 : fallbackModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return FeedLynxCardFallbackExperiment.LIZIZ;
        }
    }
}
