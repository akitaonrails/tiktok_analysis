package X;

import Y.ARunnableS124S0100000_24;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.feed.platform.panel.adaption.impl.FeedRecommendScreenAdaptionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565460qq8 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ FeedRecommendScreenAdaptionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565460qq8(FeedRecommendScreenAdaptionComponent feedRecommendScreenAdaptionComponent) {
        super(1);
        this.LL = feedRecommendScreenAdaptionComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            C2487409ou.LIZ(new ARunnableS124S0100000_24(this.LL, 79));
            this.LL.CG();
        } else {
            FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LL.LLJLIL.getValue();
            if (feedRecommendSkylightDrawerAbility != null && feedRecommendSkylightDrawerAbility.Q91() > 0.0f) {
                C2487409ou.LIZLLL(300L, new ARunnableS124S0100000_24(this.LL, 80));
            } else {
                this.LL.adaptation();
            }
        }
        return Unit.LIZ;
    }
}
