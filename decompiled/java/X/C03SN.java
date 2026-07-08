package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.FinancingDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import njp.a;

/* JADX INFO: renamed from: X.03SN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$requestToUpdateBnplInstallmentInfo$4$1", f = "PaymentViewModel.kt", l = {4242}, m = "invokeSuspend")
public final class C03SN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PaymentListRequest LLILLJJLI;
    public final /* synthetic */ FinancingDetails LLILLL;
    public final /* synthetic */ PaymentViewModel LLILZ;
    public final /* synthetic */ Function1<PaymentMethod, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ PaymentMethod LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03SN(PaymentListRequest paymentListRequest, FinancingDetails financingDetails, PaymentViewModel paymentViewModel, Function1<? super PaymentMethod, Unit> function1, boolean z, PaymentMethod paymentMethod, InterfaceC1364105Vn<? super C03SN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = paymentListRequest;
        this.LLILLL = financingDetails;
        this.LLILZ = paymentViewModel;
        this.LLILZIL = function1;
        this.LLILZLL = z;
        this.LLIZ = paymentMethod;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03SN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentViewModel@e450.requestToUpdateBnplInstallmentInfo$4$1");
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
            C03SE c03se = C03PI.LJIJI;
            PaymentListRequest paymentListRequestLIZ = PaymentListRequest.LIZ(this.LLILLJJLI, null, this.LLILLL, 895);
            this.LL = 1;
            AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(260);
            c03se.getClass();
            obj = C03SE.LJIJ(paymentListRequestLIZ, aFwS228S0000000_1, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentViewModel@e450.requestToUpdateBnplInstallmentInfo$4$1");
                return objLJFF;
            }
        }
        C842503Qx c842503Qx = (C842503Qx) obj;
        this.LLILZ.setState(AFwS228S0000000_1.get$arr$(162));
        if (c842503Qx != null) {
            PaymentMethodsData paymentMethodsData = c842503Qx.LIZIZ;
            if (paymentMethodsData != null) {
                PaymentViewModel.OR2(this.LLILZLL, this.LLILZIL, this.LLIZ, paymentMethodsData);
            }
        } else {
            this.LLILZIL.invoke(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentViewModel@e450.requestToUpdateBnplInstallmentInfo$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
