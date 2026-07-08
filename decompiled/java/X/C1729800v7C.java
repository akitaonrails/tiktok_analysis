package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;

/* JADX INFO: renamed from: X.0v7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel", f = "ImageListViewModel.kt", l = {154}, m = "fetchImages")
public final class C1729800v7C extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ImageListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729800v7C(ImageListViewModel imageListViewModel, InterfaceC1364105Vn<? super C1729800v7C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = imageListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageListViewModel@65ae.fetchImages$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(0, null, this);
        C1C7U.LIZIZ("ImageListViewModel@65ae.fetchImages$1");
        return objWQ2;
    }
}
