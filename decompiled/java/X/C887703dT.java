package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03dT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVViewModel$bindCardSetPrimary$2", f = "CCDCFillCVVViewModel.kt", l = {121}, m = "invokeSuspend")
public final class C887703dT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CCDCFillCVVViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C887703dT(CCDCFillCVVViewModel cCDCFillCVVViewModel, InterfaceC1364105Vn<? super C887703dT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cCDCFillCVVViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C887703dT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r5 = "CCDCFillCVVViewModel@a21d.bindCardSetPrimary$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LL
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 != r4) goto L52
            X.C155000ia.LIZIZ(r15)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L19:
            X.C155000ia.LIZIZ(r15)
            X.03f3 r6 = X.C876103bb.LIZJ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVViewModel r2 = r14.LLILLJJLI
            X.03dQ r1 = r2.LL
            r11 = 0
            if (r1 == 0) goto L50
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r7 = r1.LLILLJJLI
        L27:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r8 = r2.LLILZIL
            java.lang.String r9 = r2.LLILLL
            if (r1 == 0) goto L4c
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r1.LLILLJJLI
            if (r0 == 0) goto L4c
            X.03dR r10 = r0.LJJIJL
        L33:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r1.LLILLJJLI
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r11 = r0.paymentData
        L39:
            X.04Jk r13 = new X.04Jk
            r0 = 4
            r13.<init>(r2, r0)
            r14.LL = r4
            r12 = 1
            java.lang.Object r0 = r6.LIZJ(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r5)
            return r3
        L4c:
            r10 = r11
            if (r1 == 0) goto L39
            goto L33
        L50:
            r7 = r11
            goto L27
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C887703dT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
