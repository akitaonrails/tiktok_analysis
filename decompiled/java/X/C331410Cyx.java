package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;

/* JADX INFO: renamed from: X.0Cyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel", f = "ShopMallMixViewModel.kt", l = {854}, m = "reportImpression")
public final class C331410Cyx extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ShopMallMixViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331410Cyx(ShopMallMixViewModel shopMallMixViewModel, InterfaceC1364105Vn<? super C331410Cyx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = shopMallMixViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallMixViewModel@a591.reportImpression$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(null, this);
        C1C7U.LIZIZ("ShopMallMixViewModel@a591.reportImpression$1");
        return objWQ2;
    }
}
