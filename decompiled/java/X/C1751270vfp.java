package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel;

/* JADX INFO: renamed from: X.0vfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel", f = "SellerMessageListViewModel.kt", l = {210}, m = "onLoadMore")
public final class C1751270vfp extends AbstractC23140094w {
    public C1751300vfs LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SellerMessageListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751270vfp(SellerMessageListViewModel sellerMessageListViewModel, InterfaceC1364105Vn<? super C1751270vfp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = sellerMessageListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SellerMessageListViewModel@16a7.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.onLoadMore(null, this);
        C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onLoadMore$1");
        return objYQ2;
    }
}
