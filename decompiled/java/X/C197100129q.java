package X;

import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;

/* JADX INFO: renamed from: X.129q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel", f = "EffectRecommendationCarouselViewModel.kt", l = {597, 540}, m = "preloadBackgroundDetails")
public final class C197100129q extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ EffectRecommendationCarouselViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C197100129q(EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel, InterfaceC1364105Vn<? super C197100129q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = effectRecommendationCarouselViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectRecommendationCarouselViewModel@7d94.preloadBackgroundDetails$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLIZ.EQ2(this);
        C1C7U.LIZIZ("EffectRecommendationCarouselViewModel@7d94.preloadBackgroundDetails$1");
        return objEQ2;
    }
}
