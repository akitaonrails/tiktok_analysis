package X;

import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel$prefetchPanelProductInfo$4$2", f = "ECommerceAnchorPanelViewModel.kt", l = {}, m = "invokeSuspend")
public final class C751700TeC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<GetItemProductInfoResponseData, Unit> LL;
    public final /* synthetic */ GetItemProductInfoResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C751700TeC(Function1<? super GetItemProductInfoResponseData, Unit> function1, GetItemProductInfoResponse getItemProductInfoResponse, InterfaceC1364105Vn<? super C751700TeC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = getItemProductInfoResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751700TeC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECommerceAnchorPanelViewModel@ca63.prefetchPanelProductInfo$4$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI.data);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceAnchorPanelViewModel@ca63.prefetchPanelProductInfo$4$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
