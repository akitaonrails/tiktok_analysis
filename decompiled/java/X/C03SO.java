package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import njp.a;

/* JADX INFO: renamed from: X.03SO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$requestToUpdateBnplInstallmentInfo$3", f = "PaymentViewModel.kt", l = {4217}, m = "invokeSuspend")
public final class C03SO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PaymentViewModel LLILLJJLI;
    public final /* synthetic */ BillInfoRequest LLILLL;
    public final /* synthetic */ Function1<PaymentMethod, Unit> LLILZ;
    public final /* synthetic */ PaymentMethod LLILZIL;
    public final /* synthetic */ C259800zU<PaymentInfo> LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03SO(PaymentViewModel paymentViewModel, BillInfoRequest billInfoRequest, Function1<? super PaymentMethod, Unit> function1, PaymentMethod paymentMethod, C259800zU<PaymentInfo> c259800zU, boolean z, InterfaceC1364105Vn<? super C03SO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = paymentViewModel;
        this.LLILLL = billInfoRequest;
        this.LLILZ = function1;
        this.LLILZIL = paymentMethod;
        this.LLILZLL = c259800zU;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03SO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJJJJZI = obj;
        C1C7U.LIZ("PaymentViewModel@e450.requestToUpdateBnplInstallmentInfo$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJJJJZI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJJJZI);
            C03WX c03wx = (C03WX) this.LLILLJJLI.LLL.getValue();
            BillInfoRequest billInfoRequest = this.LLILLL;
            HashMap<String, Object> map = this.LLILLJJLI.LLJJIJIIJIL;
            if (map == null) {
                map = new HashMap<>();
            }
            this.LL = 1;
            objLJJJJZI = c03wx.LJJJJZI(billInfoRequest, false, map, false, null, null, this);
            if (objLJJJJZI == objLJFF) {
                C1C7U.LIZIZ("PaymentViewModel@e450.requestToUpdateBnplInstallmentInfo$3");
                return objLJFF;
            }
        }
        BillInfoResponse billInfoResponse = (BillInfoResponse) objLJJJJZI;
        this.LLILLJJLI.setState(AFwS228S0000000_1.get$arr$(161));
        if (billInfoResponse != null && billInfoResponse.isValid()) {
            BillInfoData billInfoData = (BillInfoData) billInfoResponse.data;
            if (billInfoData != null) {
                PaymentMethod paymentMethod = this.LLILZIL;
                C259800zU<PaymentInfo> c259800zU = this.LLILZLL;
                boolean z2 = this.LLIZ;
                Function1<PaymentMethod, Unit> function1 = this.LLILZ;
                PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
                if (paymentMethodsData != null) {
                    String str = paymentMethod.id;
                    if (str == null) {
                        str = "";
                    }
                    PaymentInfo paymentInfo = c259800zU.element;
                    if (paymentInfo == null || !paymentInfo.LJI()) {
                        z = false;
                    }
                    C1440005kM.LIZ(new C03ON(paymentMethodsData, str, z));
                    PaymentViewModel.OR2(z2, function1, paymentMethod, paymentMethodsData);
                }
            }
        } else {
            this.LLILZ.invoke(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentViewModel@e450.requestToUpdateBnplInstallmentInfo$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
