package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData;
import com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;

/* JADX INFO: renamed from: X.043H, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService", f = "CartService.kt", l = {368, 404, 459}, m = "addToCart")
public final class C043H extends AbstractC23140094w {
    public Object LL;
    public C043Y LLILLJJLI;
    public EnterCartParam LLILLL;
    public Object LLILZ;
    public AddItemToCartData LLILZIL;
    public C10372043u LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ CartService LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C043H(CartService cartService, InterfaceC1364105Vn<? super C043H> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = cartService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartService@8ce4.addToCart$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJI = this.LLIZLLLIL.LJI(null, null, null, null, this);
        C1C7U.LIZIZ("CartService@8ce4.addToCart$1");
        return objLJI;
    }
}
