package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;

/* JADX INFO: renamed from: X.0NtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel", f = "HighlightsListViewModel.kt", l = {100}, m = "onRefresh")
public final class C608120NtC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ HighlightsListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608120NtC(HighlightsListViewModel highlightsListViewModel, InterfaceC1364105Vn<? super C608120NtC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = highlightsListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsListViewModel@8591.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("HighlightsListViewModel@8591.onRefresh$1");
        return objOnRefresh;
    }
}
