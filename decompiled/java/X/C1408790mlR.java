package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCacheManager$setCache$1", f = "CartCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C1408790mlR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408790mlR(String str, InterfaceC1364105Vn<? super C1408790mlR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408790mlR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartCacheManager@5d34.setCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1742190vRB c1742190vRB = C1742190vRB.LIZ;
        String str = this.LL;
        c1742190vRB.getClass();
        C1742190vRB.LJFF(str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CartCacheManager@5d34.setCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
