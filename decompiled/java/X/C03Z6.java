package X;

import android.content.Context;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS86S1200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.payment.view.USCashierPaymentMethodView$showBind$1$2$1$3", f = "USCashierPaymentMethodView.kt", l = {339}, m = "invokeSuspend")
public final class C03Z6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03Z4 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ CommuteType LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03Z6(C03Z4 c03z4, String str, CommuteType commuteType, InterfaceC1364105Vn<? super C03Z6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03z4;
        this.LLILLL = str;
        this.LLILZ = commuteType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Z6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Boolean bool;
        String str2;
        String str3;
        PaymentMethodsData paymentMethodsData;
        BindInfo bindInfo;
        Function2<PaymentMethod, Function1<? super String, Unit>, Unit> getBindUrl;
        Object objLJIIJ = obj;
        C1C7U.LIZ("USCashierPaymentMethodView@b904.showBind$1$2$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIJ);
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = this.LLILLJJLI.getContext();
            PaymentMethod paymentMethod = this.LLILLJJLI.getPaymentMethod();
            n nVar = null;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = this.LLILLJJLI.getPaymentMethod();
            if (paymentMethod2 != null && (bindInfo = paymentMethod2.bindInfo) != null) {
                bool = bindInfo.isNeedPrebindVerify;
            } else {
                bool = null;
            }
            PaymentViewModel paymentViewModel = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel != null && (paymentMethodsData = paymentViewModel.LLJJIJIL) != null) {
                str2 = paymentMethodsData.consultationId;
            } else {
                str2 = null;
            }
            PaymentViewModel paymentViewModel2 = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel2 != null) {
                str3 = paymentViewModel2.LLJJJ;
            } else {
                str3 = null;
            }
            PaymentViewModel paymentViewModel3 = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel3 != null) {
                nVar = paymentViewModel3.LLJJJJLIIL;
            }
            this.LL = 1;
            objLJIIJ = paymentBindHelper.LJIIJ(context, str, bool, str2, null, str3, nVar, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("USCashierPaymentMethodView@b904.showBind$1$2$1$3");
                return objLJFF;
            }
        }
        if (((Boolean) objLJIIJ).booleanValue() && (getBindUrl = this.LLILLJJLI.getGetBindUrl()) != null) {
            getBindUrl.invoke(this.LLILLJJLI.getPaymentMethod(), new AwS86S1200000_1(this.LLILLJJLI, this.LLILLL, this.LLILZ, 27));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USCashierPaymentMethodView@b904.showBind$1$2$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
