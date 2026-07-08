package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel$actionOnFallbackCheckoutPaymentCredentialReady$1", f = "CheckoutViewModel.kt", l = {901}, m = "invokeSuspend")
public final class C333610D5z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CheckoutViewModel LLILLJJLI;
    public final /* synthetic */ CheckoutIntent LLILLL;
    public final /* synthetic */ CheckoutSession LLILZ;
    public final /* synthetic */ Function1<C189200o6<Unit>, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C333610D5z(CheckoutViewModel checkoutViewModel, CheckoutIntent checkoutIntent, CheckoutSession checkoutSession, Function1<? super C189200o6<Unit>, Unit> function1, InterfaceC1364105Vn<? super C333610D5z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = checkoutViewModel;
        this.LLILLL = checkoutIntent;
        this.LLILZ = checkoutSession;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333610D5z(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        String message;
        Object c098200Yq;
        C1C7U.LIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentCredentialReady$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0D6A c0d6a = this.LLILLJJLI.LLILZ;
            CheckoutIntent checkoutIntent = this.LLILLL;
            CheckoutSession checkoutSession = this.LLILZ;
            this.LL = 1;
            objLJ = c0d6a.LJ(checkoutIntent, checkoutSession, this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentCredentialReady$1");
                return objLJFF;
            }
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackCredentialReady: done success=");
        sbLIZ.append(C189200o6.m8isSuccessimpl(objLJ));
        sbLIZ.append(" err=");
        if (thM5exceptionOrNullimpl == null || (message = thM5exceptionOrNullimpl.getMessage()) == null) {
            message = "";
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        if (thM5exceptionOrNullimpl == null) {
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } else {
            c098200Yq = new C098200Yq(thM5exceptionOrNullimpl);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LLILZIL.invoke(C189200o6.m1boximpl(c098200Yq));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckoutViewModel@65b6.actionOnFallbackCheckoutPaymentCredentialReady$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
