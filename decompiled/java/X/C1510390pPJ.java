package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510390pPJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510390pPJ(RunnableC1510400pPK runnableC1510400pPK) {
        super(0);
        this.LL = runnableC1510400pPK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final Runnable runnable = this.LL;
        C1511690pRP.LIZIZ(new Runnable() { // from class: X.01vw
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedItemFeatureInfoImpl@e939.initFeedFeature$7$1");
                try {
                    runnable.run();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedItemFeatureInfoImpl@e939.initFeedFeature$7$1");
            }
        });
        return Unit.LIZ;
    }
}
