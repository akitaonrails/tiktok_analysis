package X;

import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Y1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel$prefetchPanelProductInfo$4$3", f = "ECommerceAnchorPanelViewModel.kt", l = {}, m = "invokeSuspend")
public final class C01Y1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<GetItemProductInfoResponseData, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01Y1(Function1<? super GetItemProductInfoResponseData, Unit> function1, InterfaceC1364105Vn<? super C01Y1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01Y1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECommerceAnchorPanelViewModel@ca63.prefetchPanelProductInfo$4$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceAnchorPanelViewModel@ca63.prefetchPanelProductInfo$4$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
