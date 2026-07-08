package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D60, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel$actionOnFallbackCheckoutPaymentSucceeded$1", f = "CheckoutViewModel.kt", l = {989, 997}, m = "invokeSuspend")
public final class C0D60 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CheckoutViewModel LLILLJJLI;
    public final /* synthetic */ CheckoutIntent LLILLL;
    public final /* synthetic */ CheckoutSession LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ CheckoutStoredUserAddress LLIZ;
    public final /* synthetic */ Function1<C189200o6<Unit>, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0D60(CheckoutViewModel checkoutViewModel, CheckoutIntent checkoutIntent, CheckoutSession checkoutSession, String str, String str2, CheckoutStoredUserAddress checkoutStoredUserAddress, Function1<? super C189200o6<Unit>, Unit> function1, InterfaceC1364105Vn<? super C0D60> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = checkoutViewModel;
        this.LLILLL = checkoutIntent;
        this.LLILZ = checkoutSession;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = checkoutStoredUserAddress;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D60(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentSucceeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentSucceeded$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0D6A c0d6a = this.LLILLJJLI.LLILZ;
            CheckoutIntent checkoutIntent = this.LLILLL;
            CheckoutSession checkoutSession = this.LLILZ;
            this.LL = 1;
            if (c0d6a.LIZJ(checkoutIntent, checkoutSession, this) == objLJFF) {
                C1C7U.LIZIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentSucceeded$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackPaymentSucceeded: completeOrder done, orderId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" paymentType=");
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(" hasShippingAddress=");
        if (this.LLIZ == null) {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0D61 c0d61 = new C0D61(this.LLIZLLLIL, this.LLILLJJLI, this.LLILLL, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0d61) == objLJFF) {
            C1C7U.LIZIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentSucceeded$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentSucceeded$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
