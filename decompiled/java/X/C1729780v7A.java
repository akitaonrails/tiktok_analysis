package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;

/* JADX INFO: renamed from: X.0v7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel", f = "ImageListViewModel.kt", l = {103}, m = "onLoadMore")
public final class C1729780v7A extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ImageListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729780v7A(ImageListViewModel imageListViewModel, InterfaceC1364105Vn<? super C1729780v7A> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = imageListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageListViewModel@65ae.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0, this);
        C1C7U.LIZIZ("ImageListViewModel@65ae.onLoadMore$1");
        return objOnLoadMore;
    }
}
