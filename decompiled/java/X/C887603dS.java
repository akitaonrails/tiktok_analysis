package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03dS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVViewModel$doVerify$2", f = "CCDCFillCVVViewModel.kt", l = {97}, m = "invokeSuspend")
public final class C887603dS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CCDCFillCVVViewModel LLILLJJLI;
    public final /* synthetic */ PaymentElement LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C887603dS(CCDCFillCVVViewModel cCDCFillCVVViewModel, PaymentElement paymentElement, InterfaceC1364105Vn<? super C887603dS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cCDCFillCVVViewModel;
        this.LLILLL = paymentElement;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C887603dS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[PHI: r2
      0x011d: PHI (r2v3 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams) = 
      (r2v2 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams)
      (r2v6 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams)
     binds: [B:40:0x00ec, B:42:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126 A[PHI: r11
      0x0126: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String) binds: [B:55:0x0122, B:32:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C887603dS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
