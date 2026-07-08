package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2$onBindItemView$6$orderSubmitPaymentItemView$1$5$2", f = "PaymentInfoCell2.kt", l = {945}, m = "invokeSuspend")
public final class C844503Rr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03ZB LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ PaymentInfoCell2 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ CommuteType LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C844503Rr(C03ZB c03zb, PaymentMethod paymentMethod, PaymentInfoCell2 paymentInfoCell2, String str, CommuteType commuteType, InterfaceC1364105Vn<? super C844503Rr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03zb;
        this.LLILLL = paymentMethod;
        this.LLILZ = paymentInfoCell2;
        this.LLILZIL = str;
        this.LLILZLL = commuteType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844503Rr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r3 = "PaymentInfoCell2@839a.onBindItemView$6$orderSubmitPaymentItemView$1$5$2"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LL
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L89
            X.C155000ia.LIZIZ(r13)
        L13:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r0 = r13.booleanValue()
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = r12.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r6 = r12.LLILLL
            kotlin.jvm.internal.AwS20S1400000_1 r4 = new kotlin.jvm.internal.AwS20S1400000_1
            X.03ZB r5 = r12.LLILLJJLI
            java.lang.String r7 = r12.LLILZIL
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType r8 = r12.LLILZLL
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r9 = r12.LLILZ
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.tR2(r6, r4)
        L34:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L3a:
            X.C155000ia.LIZIZ(r13)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper r4 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper.LIZ
            X.03ZB r0 = r12.LLILLJJLI
            android.content.Context r5 = r0.getContext()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r12.LLILLL
            r11 = 0
            if (r0 == 0) goto L86
            java.lang.String r6 = r0.id
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo r0 = r0.bindInfo
            if (r0 == 0) goto L87
            java.lang.Boolean r7 = r0.isNeedPrebindVerify
        L52:
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = r12.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r0.LLJJI
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.paymentMethods
            if (r0 == 0) goto L84
            java.lang.String r8 = r0.consultationId
        L62:
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = r12.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            java.lang.String r9 = r0.c
            java.lang.String r10 = "order_submit"
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = r12.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r0.LLJJI
            if (r0 == 0) goto L78
            com.google.gson.n r11 = r0.preRiskParam
        L78:
            r12.LL = r1
            java.lang.Object r13 = r4.LJIIJ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r2) goto L13
            X.C1C7U.LIZIZ(r3)
            return r2
        L84:
            r8 = r11
            goto L62
        L86:
            r6 = r11
        L87:
            r7 = r11
            goto L52
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C844503Rr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
