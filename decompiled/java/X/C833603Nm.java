package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$handleRecommendPaymentList$3", f = "OrderSubmitAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C833603Nm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentInfo LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C833603Nm(PaymentInfo paymentInfo, boolean z, OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z2, boolean z3, boolean z4, InterfaceC1364105Vn<? super C833603Nm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentInfo;
        this.LLILLJJLI = z;
        this.LLILLL = orderSubmitAssemViewModel;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C833603Nm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x03a7, code lost:
    
        if (r7 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012d, code lost:
    
        if (r3.LJI() == true) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0130, code lost:
    
        if (r1 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0181, code lost:
    
        if (r9 != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0390 A[PHI: r10
      0x0390: PHI (r10v12 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) = 
      (r10v11 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r10v13 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r10v13 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r10v13 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r10v13 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
     binds: [B:250:0x038d, B:241:0x0370, B:243:0x0376, B:245:0x037a, B:247:0x0386] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0335 A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C833603Nm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
