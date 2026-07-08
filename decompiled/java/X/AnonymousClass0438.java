package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0438, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService$performAddToCartAction$1$1$1", f = "CartService.kt", l = {134, 137}, m = "invokeSuspend")
public final class AnonymousClass0438 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CartService LLILLJJLI;
    public final /* synthetic */ C043Y LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ AnonymousClass0431 LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ EnterCartParam LLIZ;
    public final /* synthetic */ InterfaceC1748810vbr LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0438(CartService cartService, C043Y c043y, boolean z, AnonymousClass0431 anonymousClass0431, View view, EnterCartParam enterCartParam, InterfaceC1748810vbr interfaceC1748810vbr, InterfaceC1364105Vn<? super AnonymousClass0438> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cartService;
        this.LLILLL = c043y;
        this.LLILZ = z;
        this.LLILZIL = anonymousClass0431;
        this.LLILZLL = view;
        this.LLIZ = enterCartParam;
        this.LLIZLLLIL = interfaceC1748810vbr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0438(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartService@8ce4.performAddToCartAction$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            CartService cartService = this.LLILLJJLI;
            C043Y c043y = this.LLILLL;
            AddToCartRequestParam addToCartRequestParam = c043y.LIZ;
            cartService.LLILLJJLI = addToCartRequestParam.productId;
            if (c043y.LJFF == null) {
                cartService.LL = null;
            }
            String str = addToCartRequestParam.skuId;
            if ((str == null || a0.LJJJIL(str)) && this.LLILZ) {
                final AnonymousClass0431 anonymousClass0431 = this.LLILZIL;
                final C043Y c043y2 = this.LLILLL;
                final View view = this.LLILZLL;
                final EnterCartParam enterCartParam = this.LLIZ;
                AnonymousClass0431 anonymousClass04312 = new AnonymousClass0431(anonymousClass0431, c043y2, view, enterCartParam) { // from class: X.0432
                    public final AnonymousClass0431 LIZ;
                    public final C043Y LIZIZ;
                    public final View LIZJ;
                    public final EnterCartParam LIZLLL;

                    @Override // X.AnonymousClass0431
                    public final void LIZIZ() {
                        AnonymousClass0431 anonymousClass04313 = this.LIZ;
                        if (anonymousClass04313 != null) {
                            anonymousClass04313.LIZIZ();
                        }
                    }

                    @Override // X.AnonymousClass0431
                    public final void LIZJ() {
                        AnonymousClass0431 anonymousClass04313 = this.LIZ;
                        if (anonymousClass04313 != null) {
                            anonymousClass04313.LIZJ();
                        }
                    }

                    @Override // X.AnonymousClass0431
                    public final void LJ() {
                        AnonymousClass0431 anonymousClass04313 = this.LIZ;
                        if (anonymousClass04313 != null) {
                            anonymousClass04313.LJ();
                        }
                    }

                    @Override // X.AnonymousClass0431
                    public final EnterCartParam LIZLLL() {
                        return this.LIZLLL;
                    }

                    @Override // X.AnonymousClass0431
                    public final View LJFF() {
                        return this.LIZJ;
                    }

                    @Override // X.AnonymousClass0431
                    public final C043Y LJI() {
                        return this.LIZIZ;
                    }

                    @Override // X.AnonymousClass0431
                    public final void LIZ(C10372043u c10372043u) {
                        AnonymousClass0431 anonymousClass04313 = this.LIZ;
                        if (anonymousClass04313 != null) {
                            anonymousClass04313.LIZ(c10372043u);
                        }
                    }

                    {
                        this.LIZ = anonymousClass0431;
                        this.LIZIZ = c043y2;
                        this.LIZJ = view;
                        this.LIZLLL = enterCartParam;
                    }
                };
                CartService cartService2 = this.LLILLJJLI;
                InterfaceC1748810vbr interfaceC1748810vbr = this.LLIZLLLIL;
                this.LL = 1;
                cartService2.getClass();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new AnonymousClass0439(cartService2, view, c043y2, interfaceC1748810vbr, anonymousClass04312, null), 3);
                if (Unit.LIZ == objLJFF) {
                    C1C7U.LIZIZ("CartService@8ce4.performAddToCartAction$1$1$1");
                    return objLJFF;
                }
            } else {
                CartService cartService3 = this.LLILLJJLI;
                View view2 = this.LLILZLL;
                C043Y c043y3 = this.LLILLL;
                EnterCartParam enterCartParam2 = this.LLIZ;
                AnonymousClass0431 anonymousClass04313 = this.LLILZIL;
                this.LL = 2;
                if (cartService3.LJI(view2, c043y3, enterCartParam2, anonymousClass04313, this) == objLJFF) {
                    C1C7U.LIZIZ("CartService@8ce4.performAddToCartAction$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CartService@8ce4.performAddToCartAction$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
