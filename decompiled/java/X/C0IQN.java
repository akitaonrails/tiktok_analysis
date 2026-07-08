package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IQN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment$onNodeHide$1", f = "ShopMallMixFragment.kt", l = {}, m = "invokeSuspend")
public final class C0IQN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShopMallMixFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IQN(ShopMallMixFragment shopMallMixFragment, InterfaceC1364105Vn<? super C0IQN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shopMallMixFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IQN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ShopMallMixFragment@3794.onNodeHide$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.cS();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixFragment@3794.onNodeHide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
