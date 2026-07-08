package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.view.FeedShoppingBagCard$setTitleInfo$1$iconLoadCallBack$1$onFail$1", f = "FeedShoppingBagCard.kt", l = {}, m = "invokeSuspend")
public final class C492301vt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C212201182l LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492301vt(C212201182l c212201182l, InterfaceC1364105Vn<? super C492301vt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c212201182l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C492301vt(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedShoppingBagCard@7eac.setTitleInfo$1$iconLoadCallBack$1$onFail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setTitleInfo(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedShoppingBagCard@7eac.setTitleInfo$1$iconLoadCallBack$1$onFail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
