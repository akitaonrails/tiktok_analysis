package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.manager.ShopTabCustomTimer$postBlock$2$1", f = "ShopTabCustomTimer.kt", l = {}, m = "invokeSuspend")
public final class C1303730k1z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1303740k20 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303730k1z(C1303740k20 c1303740k20, InterfaceC1364105Vn<? super C1303730k1z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1303740k20;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303730k1z(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopTabCustomTimer@5c56.postBlock$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopTabCustomTimer@5c56.postBlock$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
