package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03QQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayService$handleOneClickPaymentResult$1", f = "OneClickPayService.kt", l = {395}, m = "invokeSuspend")
public final class C03QQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03QL LLILLJJLI;
    public final /* synthetic */ C043B<?> LLILLL;
    public final /* synthetic */ BillInfoData LLILZ;
    public final /* synthetic */ HashMap<String, Object> LLILZIL;
    public final /* synthetic */ C860903Xz LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QQ(C03QL c03ql, C043B<?> c043b, BillInfoData billInfoData, HashMap<String, Object> map, C860903Xz c860903Xz, InterfaceC1364105Vn<? super C03QQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03ql;
        this.LLILLL = c043b;
        this.LLILZ = billInfoData;
        this.LLILZIL = map;
        this.LLILZLL = c860903Xz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03QQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneClickPayService@2466.handleOneClickPaymentResult$1");
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
            C03QL c03ql = this.LLILLJJLI;
            C043B<?> c043b = this.LLILLL;
            BillInfoData billInfoData = this.LLILZ;
            HashMap<String, Object> map = this.LLILZIL;
            C860903Xz c860903Xz = this.LLILZLL;
            PaymentMethod paymentMethod = c860903Xz.LIZJ;
            PaymentMethodInfo paymentMethodInfo = c860903Xz.LIZIZ;
            PaymentInfo paymentInfo = c860903Xz.LIZLLL;
            this.LL = 1;
            if (c03ql.LIZ(c043b, billInfoData, map, paymentMethod, paymentMethodInfo, paymentInfo, this) == objLJFF) {
                C1C7U.LIZIZ("OneClickPayService@2466.handleOneClickPaymentResult$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OneClickPayService@2466.handleOneClickPaymentResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
