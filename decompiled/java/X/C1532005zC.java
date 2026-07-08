package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.EcLiveProductCard$showCardIfNeeded$1$4$5$onLoadResult$1", f = "EcLiveProductCard.kt", l = {}, m = "invokeSuspend")
public final class C1532005zC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C212206182q LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532005zC(C212206182q c212206182q, InterfaceC1364105Vn<? super C1532005zC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c212206182q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1532005zC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcLiveProductCard@521a.showCardIfNeeded$1$4$5$onLoadResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C212206182q.LJIIJ(this.LL.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcLiveProductCard@521a.showCardIfNeeded$1$4$5$onLoadResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
