package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$resumeRefreshPaymentList$1$1", f = "OrderSubmitAssemViewModel.kt", l = {6219}, m = "invokeSuspend")
public final class C834503Nv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C834503Nv(OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C834503Nv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C834503Nv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PaymentMethod paymentMethod;
        PaymentInfo paymentInfo;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        PaymentInfo paymentInfo2;
        PaymentMethod paymentMethodLJIIIZ;
        PaymentMethodsData paymentMethodsData;
        PaymentMethodsData paymentMethodsData2;
        PaymentMethodsData paymentMethodsData3;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.resumeRefreshPaymentList$1$1");
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
            PaymentCacheHelper.LIZ.getClass();
            PaymentCacheHelper.LJIIL();
            BillInfoData billInfoData = this.LLILLJJLI.LLJJI;
            if (billInfoData != null && (paymentMethodsData3 = billInfoData.paymentMethods) != null) {
                paymentMethodsData3.LJIIIIZZ = null;
            }
            if (billInfoData != null && (paymentMethodsData2 = billInfoData.paymentMethods) != null) {
                for (PaymentMethod paymentMethod2 : (ArrayList) PaymentMethodsData.LJFF(paymentMethodsData2, false, false, 15)) {
                    Availability availability = paymentMethod2.LJIL;
                    if (availability != null) {
                        paymentMethod2.availability = availability.copy(availability.isAvailable, availability.unavailableCode, availability.unavailableReason, availability.unavailablePopupTitle, availability.statusCode);
                    }
                }
            }
            PaymentInfo paymentInfo3 = this.LLILLJJLI.LLJJJ;
            if (paymentInfo3 != null && paymentInfo3.paymentMethod == null && paymentInfo3 != null && paymentInfo3.LJI() && (paymentInfo2 = (orderSubmitAssemViewModel = this.LLILLJJLI).LLJJJ) != null) {
                BillInfoData billInfoData2 = orderSubmitAssemViewModel.LLJJI;
                if (billInfoData2 != null && (paymentMethodsData = billInfoData2.paymentMethods) != null) {
                    paymentMethodLJIIIZ = paymentMethodsData.LJIIIZ();
                } else {
                    paymentMethodLJIIIZ = null;
                }
                paymentInfo2.LIZ = paymentMethodLJIIIZ;
            }
            CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = this.LLILLJJLI.LLJL;
            ArrayList arrayList = new ArrayList();
            for (PaymentMethod paymentMethod3 : copyOnWriteArrayList) {
                Availability availability2 = paymentMethod3.LJIL;
                if (availability2 != null) {
                    paymentMethod3.availability = availability2.copy(availability2.isAvailable, availability2.unavailableCode, availability2.unavailableReason, availability2.unavailablePopupTitle, availability2.statusCode);
                }
                if (!PaymentMethod.LJJJLIIL(paymentMethod3)) {
                    arrayList.add(paymentMethod3);
                }
            }
            PaymentInfo paymentInfo4 = this.LLILLJJLI.LLJJJ;
            if (paymentInfo4 != null && (paymentMethod = paymentInfo4.paymentMethod) != null && PaymentMethod.LJJJLIIL(paymentMethod) && (paymentInfo = this.LLILLJJLI.LLJJJ) != null) {
                paymentInfo.paymentMethod = null;
            }
            this.LLILLJJLI.LLJL.clear();
            this.LLILLJJLI.LLJL.addAll(arrayList);
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILLJJLI;
            PaymentInfo paymentInfo5 = orderSubmitAssemViewModel2.LLJJJ;
            this.LL = 1;
            if (OrderSubmitAssemViewModel.eS2(orderSubmitAssemViewModel2, paymentInfo5, false, false, false, true, this, 14) == objLJFF) {
                C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.resumeRefreshPaymentList$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.resumeRefreshPaymentList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
