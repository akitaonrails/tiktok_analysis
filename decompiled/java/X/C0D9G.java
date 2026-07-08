package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D9G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel$requestCreateCheckout$1", f = "CheckoutViewModel.kt", l = {650}, m = "invokeSuspend")
public final class C0D9G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CheckoutViewModel LLILLJJLI;
    public final /* synthetic */ C334570D9r LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D9G(CheckoutViewModel checkoutViewModel, C334570D9r c334570D9r, Function0<Unit> function0, InterfaceC1364105Vn<? super C0D9G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = checkoutViewModel;
        this.LLILLL = c334570D9r;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D9G(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C334550D9p c334550D9pLIZLLL;
        C1C7U.LIZ("CheckoutViewModel@65b6.requestCreateCheckout$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0D7Z c0d7z = this.LLILLJJLI.LLILLL;
            C334570D9r c334570D9r = this.LLILLL;
            CheckoutIntent checkoutIntent = c334570D9r.LIZ;
            CheckoutStoredUserAddress checkoutStoredUserAddress = c334570D9r.LIZIZ;
            this.LL = 1;
            obj = c0d7z.LIZIZ(checkoutIntent, checkoutStoredUserAddress, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CheckoutViewModel@65b6.requestCreateCheckout$1");
                return objLJFF;
            }
        }
        AbstractC333960D7i abstractC333960D7i = (AbstractC333960D7i) obj;
        if (abstractC333960D7i instanceof C333950D7h) {
            CheckoutViewModel checkoutViewModel = this.LLILLJJLI;
            CheckoutSession checkoutSession = (CheckoutSession) ((C333950D7h) abstractC333960D7i).LIZIZ;
            Function0<Unit> function0 = this.LLILZ;
            checkoutViewModel.getClass();
            CheckoutViewModel.lR2(checkoutViewModel, "protocol.resolve.session.create", checkoutSession, null, false, 12);
            if (C334040D7q.LIZIZ(checkoutSession)) {
                checkoutViewModel.KQ2(checkoutSession, "create.applied");
                Map<String, String> map = C0D9H.LIZ;
                long jAR2 = checkoutViewModel.aR2();
                String strLIZJ = C0DBE.LIZJ(new C0DBF(C0D9H.LIZ, C0DBL.RAW_CONTENT), null, checkoutSession.messages);
                if (strLIZJ != null && (c334550D9pLIZLLL = C0D9H.LIZLLL(jAR2, strLIZJ, C0D9J.USER_ACTION_BLOCKED)) != null) {
                    checkoutViewModel.cR2(c334550D9pLIZLLL);
                }
                checkoutViewModel.jR2(C0DB0.LIZ, "createCheckoutSuccess");
            } else {
                Map<String, String> map2 = C0D9H.LIZ;
                checkoutViewModel.cR2(C0D9H.LIZJ(checkoutViewModel.aR2(), C0D7D.CREATE_CHECKOUT, checkoutSession.messages));
                checkoutViewModel.jR2(C334780DAm.LIZ, "createCheckoutSessionFailure");
                if (function0 != null) {
                    function0.invoke();
                }
            }
        } else if (abstractC333960D7i instanceof C333940D7g) {
            Function0<Unit> function02 = this.LLILZ;
            if (function02 != null) {
                function02.invoke();
            }
            CheckoutViewModel checkoutViewModel2 = this.LLILLJJLI;
            Throwable th = ((C333940D7g) abstractC333960D7i).LIZIZ;
            checkoutViewModel2.getClass();
            CheckoutViewModel.lR2(checkoutViewModel2, "protocol.resolve.error.create", null, th.getMessage(), false, 10);
            Map<String, String> map3 = C0D9H.LIZ;
            checkoutViewModel2.cR2(C0D9H.LIZIZ(checkoutViewModel2.aR2(), th, C0D9O.LIZ));
            checkoutViewModel2.jR2(C334780DAm.LIZ, "createCheckoutSystemError");
        } else {
            throw new C1954807lC();
        }
        CheckoutViewModel checkoutViewModel3 = this.LLILLJJLI;
        checkoutViewModel3.LLJJJJJIL = null;
        checkoutViewModel3.RQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckoutViewModel@65b6.requestCreateCheckout$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
