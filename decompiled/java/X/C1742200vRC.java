package X;

import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;

/* JADX INFO: renamed from: X.0vRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCacheManager", f = "CartCacheManager.kt", l = {313}, m = "updateCacheByPreloadData")
public final class C1742200vRC extends AbstractC23140094w {
    public CartEntryFrom LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1742190vRB LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742200vRC(C1742190vRB c1742190vRB, InterfaceC1364105Vn<? super C1742200vRC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1742190vRB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartCacheManager@5d34.updateCacheByPreloadData$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZ.LJ(null, null, null, null, this);
        C1C7U.LIZIZ("CartCacheManager@5d34.updateCacheByPreloadData$1");
        return objLJ;
    }
}
