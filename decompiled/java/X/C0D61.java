package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D61, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel$actionOnFallbackCheckoutPaymentSucceeded$1$1", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0D61 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C189200o6<Unit>, Unit> LL;
    public final /* synthetic */ CheckoutViewModel LLILLJJLI;
    public final /* synthetic */ CheckoutIntent LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0D61(Function1<? super C189200o6<Unit>, Unit> function1, CheckoutViewModel checkoutViewModel, CheckoutIntent checkoutIntent, String str, InterfaceC1364105Vn<? super C0D61> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = checkoutViewModel;
        this.LLILLL = checkoutIntent;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D61(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentSucceeded$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<C189200o6<Unit>, Unit> function1 = this.LL;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        function1.invoke(C189200o6.m1boximpl(unit));
        CheckoutViewModel checkoutViewModel = this.LLILLJJLI;
        C2252331DDr c2252331DDr = checkoutViewModel.LLJILLL;
        CheckoutIntent checkoutIntent = this.LLILLL;
        C332710D2n c332710D2n = checkoutViewModel.LLILZLL;
        c2252331DDr.LIZJ(new C0D64(checkoutIntent, c332710D2n.copy(c332710D2n.entryCheckoutType, c332710D2n.paymentType, c332710D2n.viewSiteType, c332710D2n.viewSiteUrl)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackPaymentSucceeded: route ThankYou orderId=");
        sbLIZ.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1C7U.LIZIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentSucceeded$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
