package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;

/* JADX INFO: renamed from: X.0v7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel", f = "TemplateListViewModel.kt", l = {97}, m = "onRefresh")
public final class C1729960v7S extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TemplateListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729960v7S(TemplateListViewModel templateListViewModel, InterfaceC1364105Vn<? super C1729960v7S> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = templateListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateListViewModel@ac46.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("TemplateListViewModel@ac46.onRefresh$1");
        return objOnRefresh;
    }
}
