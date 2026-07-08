package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;

/* JADX INFO: renamed from: X.0wBQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel", f = "ShopMallMixViewModel.kt", l = {267}, m = "loadMixData")
public final class C1770860wBQ extends AbstractC23140094w {
    public boolean LL;
    public boolean LLILLJJLI;
    public n LLILLL;
    public C1771590wCb LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ ShopMallMixViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770860wBQ(ShopMallMixViewModel shopMallMixViewModel, InterfaceC1364105Vn<? super C1770860wBQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = shopMallMixViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallMixViewModel@a591.loadMixData$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLIZ.vQ2(false, null, null, this);
        C1C7U.LIZIZ("ShopMallMixViewModel@a591.loadMixData$1");
        return objVQ2;
    }
}
