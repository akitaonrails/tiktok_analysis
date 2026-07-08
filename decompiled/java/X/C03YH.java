package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03YH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$handleCombinePayment$1", f = "PaymentViewModel.kt", l = {4342}, m = "invokeSuspend")
public final class C03YH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PaymentViewModel LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<PaymentInfo, Boolean, Map<String, ? extends Object>, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03YH(PaymentViewModel paymentViewModel, PaymentMethod paymentMethod, Context context, InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C03YH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = paymentViewModel;
        this.LLILLL = paymentMethod;
        this.LLILZ = context;
        this.LLILZIL = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03YH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.03YF] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C842503Qx c842503Qx;
        PaymentMethodsData paymentMethodsData;
        final CreditInfo creditInfoLJIJJ;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        Availability availability;
        Availability availability2;
        InstallmentInfo installmentInfo;
        PaymentMethodsData paymentMethodsData2;
        String str;
        List<String> list;
        PaymentMethodsData paymentMethodsData3;
        CreditInfo creditInfoLJIJJ2;
        PaymentMethod paymentMethod3;
        Object objInvoke = obj;
        C1C7U.LIZ("PaymentViewModel@e450.handleCombinePayment$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objInvoke);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objInvoke);
            this.LLILLJJLI.setState(AFwS228S0000000_1.get$arr$(256));
            Function2<? super ChangeInfo, ? super InterfaceC1364105Vn<? super C842503Qx>, ? extends Object> function2 = this.LLILLJJLI.LLJJJJ;
            if (function2 != null) {
                this.LL = 1;
                objInvoke = function2.invoke(null, this);
                if (objInvoke == objLJFF) {
                    C1C7U.LIZIZ("PaymentViewModel@e450.handleCombinePayment$1");
                    return objLJFF;
                }
            } else {
                c842503Qx = null;
                this.LLILLJJLI.setState(AFwS228S0000000_1.get$arr$(257));
                if (c842503Qx != null && (paymentMethodsData = c842503Qx.LIZIZ) != null && (creditInfoLJIJJ = paymentMethodsData.LJIJJ(this.LLILLL)) != null) {
                    paymentMethod = creditInfoLJIJJ.creditPaymentMethod;
                    if (paymentMethod == null && (availability2 = paymentMethod.availability) != null && Intrinsics.LJFF(availability2.isAvailable(), true) && (installmentInfo = creditInfoLJIJJ.creditPaymentMethod.installmentInfo) != null) {
                        EnterParams enterParams = this.LLILLJJLI.LLJ;
                        if (enterParams != null && (paymentMethodsData3 = enterParams.paymentData) != null && (creditInfoLJIJJ2 = paymentMethodsData3.LJIJJ(this.LLILLL)) != null && (paymentMethod3 = creditInfoLJIJJ2.creditPaymentMethod) != null) {
                            paymentMethod3.installmentInfo = installmentInfo;
                        }
                        C03Q4 c03q4 = C03Q4.LIZ;
                        if (C03Q4.LJJ(c03q4, this.LLILLL)) {
                            PaymentViewModel paymentViewModel = this.LLILLJJLI;
                            EnterParams enterParams2 = paymentViewModel.LLJ;
                            if (enterParams2 != null) {
                                paymentMethodsData2 = enterParams2.paymentData;
                            } else {
                                paymentMethodsData2 = null;
                            }
                            EnterParams enterParams3 = PaymentViewModel.LLLIIIIL;
                            if (enterParams3 != null) {
                                str = enterParams3.LJIJJLI;
                                list = enterParams3.LJIL;
                                str2 = enterParams3.LJJ;
                            } else {
                                str = null;
                                list = null;
                            }
                            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(paymentViewModel);
                            String value = C03OW.SECOND_PAY_ANCHOR.getValue();
                            String string = UUID.randomUUID().toString();
                            final PaymentViewModel paymentViewModel2 = this.LLILLJJLI;
                            final Context context = this.LLILZ;
                            final InterfaceC1631620sYq<PaymentInfo, Boolean, Map<String, ? extends Object>, Unit> interfaceC1631620sYq = this.LLILZIL;
                            C03Q4.LJIJJ(c03q4, true, paymentMethodsData2, str, list, str2, viewModelScope, null, false, value, string, new C03QH() { // from class: X.03YF
                                @Override // X.C03QH
                                public final void onFailed() {
                                    PaymentViewModel.LR2(paymentViewModel2);
                                }

                                @Override // X.C03QH
                                public final void onSuccess() {
                                    paymentViewModel2.JR2(context, creditInfoLJIJJ.creditPaymentMethod, interfaceC1631620sYq);
                                }
                            }, 192);
                        } else {
                            this.LLILLJJLI.JR2(this.LLILZ, creditInfoLJIJJ.creditPaymentMethod, this.LLILZIL);
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PaymentViewModel@e450.handleCombinePayment$1");
                        return unit;
                    }
                    paymentMethod2 = creditInfoLJIJJ.creditPaymentMethod;
                    if (paymentMethod2 != null && (availability = paymentMethod2.availability) != null && Intrinsics.LJFF(availability.isAvailable(), true)) {
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("PaymentViewModel@e450.handleCombinePayment$1");
                        return unit2;
                    }
                }
                PaymentViewModel.LR2(this.LLILLJJLI);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("PaymentViewModel@e450.handleCombinePayment$1");
                return unit3;
            }
        }
        c842503Qx = (C842503Qx) objInvoke;
        this.LLILLJJLI.setState(AFwS228S0000000_1.get$arr$(257));
        if (c842503Qx != null) {
            paymentMethod = creditInfoLJIJJ.creditPaymentMethod;
            if (paymentMethod == null) {
            }
            paymentMethod2 = creditInfoLJIJJ.creditPaymentMethod;
            if (paymentMethod2 != null) {
                Unit unit22 = Unit.LIZ;
                C1C7U.LIZIZ("PaymentViewModel@e450.handleCombinePayment$1");
                return unit22;
            }
        }
        PaymentViewModel.LR2(this.LLILLJJLI);
        Unit unit32 = Unit.LIZ;
        C1C7U.LIZIZ("PaymentViewModel@e450.handleCombinePayment$1");
        return unit32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
