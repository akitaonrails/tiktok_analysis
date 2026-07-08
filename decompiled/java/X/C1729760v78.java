package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;

/* JADX INFO: renamed from: X.0v78, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel", f = "ImageListViewModel.kt", l = {619}, m = "getPhotoResourceId")
public final class C1729760v78 extends AbstractC23140094w {
    public InterfaceC1729810v7D LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ImageListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729760v78(ImageListViewModel imageListViewModel, InterfaceC1364105Vn<? super C1729760v78> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = imageListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageListViewModel@65ae.getPhotoResourceId$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(null, this);
        C1C7U.LIZIZ("ImageListViewModel@65ae.getPhotoResourceId$1");
        return objYQ2;
    }
}
