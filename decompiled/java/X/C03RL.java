package X;

import android.content.Context;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS20S1400000_1;
import njp.a;

/* JADX INFO: renamed from: X.03RL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell$PaymentAdapter$bindPaymentViewHolder$1$4$2", f = "USPaymentInfoCell.kt", l = {1275}, m = "invokeSuspend")
public final class C03RL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03ZC LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ USPaymentInfoCell LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ CommuteType LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03RL(C03ZC c03zc, PaymentMethod paymentMethod, USPaymentInfoCell uSPaymentInfoCell, String str, CommuteType commuteType, InterfaceC1364105Vn<? super C03RL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03zc;
        this.LLILLL = paymentMethod;
        this.LLILZ = uSPaymentInfoCell;
        this.LLILZIL = str;
        this.LLILZLL = commuteType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03RL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean bool;
        String str;
        PaymentMethodsData paymentMethodsData;
        C1C7U.LIZ("USPaymentInfoCell$PaymentAdapter@a112.bindPaymentViewHolder$1$4$2");
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
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = this.LLILLJJLI.getContext();
            PaymentMethod paymentMethod = this.LLILLL;
            String str2 = paymentMethod.id;
            BindInfo bindInfo = paymentMethod.bindInfo;
            n nVar = null;
            if (bindInfo != null) {
                bool = bindInfo.isNeedPrebindVerify;
            } else {
                bool = null;
            }
            BillInfoData billInfoData = this.LLILZ.T5().LLJJI;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                str = paymentMethodsData.consultationId;
            } else {
                str = null;
            }
            String str3 = this.LLILZ.T5().c;
            BillInfoData billInfoData2 = this.LLILZ.T5().LLJJI;
            if (billInfoData2 != null) {
                nVar = billInfoData2.preRiskParam;
            }
            this.LL = 1;
            obj = paymentBindHelper.LJIIJ(context, str2, bool, str, str3, "order_submit", nVar, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("USPaymentInfoCell$PaymentAdapter@a112.bindPaymentViewHolder$1$4$2");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModelT5 = this.LLILZ.T5();
            PaymentMethod paymentMethod2 = this.LLILLL;
            orderSubmitAssemViewModelT5.tR2(paymentMethod2, new AwS20S1400000_1(this.LLILLJJLI, paymentMethod2, this.LLILZIL, this.LLILZLL, this.LLILZ, 4));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USPaymentInfoCell$PaymentAdapter@a112.bindPaymentViewHolder$1$4$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
