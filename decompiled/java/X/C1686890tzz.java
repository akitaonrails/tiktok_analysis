package X;

import com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel;

/* JADX INFO: renamed from: X.0tzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel", f = "AIPortraitCustomizeViewModel.kt", l = {613}, m = "fetchRecommendStyles")
public final class C1686890tzz extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIPortraitCustomizeViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686890tzz(AIPortraitCustomizeViewModel aIPortraitCustomizeViewModel, InterfaceC1364105Vn<? super C1686890tzz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIPortraitCustomizeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitCustomizeViewModel@66a9.fetchRecommendStyles$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLL.AQ2(null, this);
        C1C7U.LIZIZ("AIPortraitCustomizeViewModel@66a9.fetchRecommendStyles$1");
        return objAQ2;
    }
}
