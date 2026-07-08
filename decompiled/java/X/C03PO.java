package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03PO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C03PO extends C2217421BqW implements Function1<PaymentMethod, Unit> {
    public C03PO(C03PI c03pi) {
        super(1, c03pi, C03PI.class, "fetchPaymentPreRisk", "fetchPaymentPreRisk(Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/dto/PaymentMethod;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r25) {
        /*
            r24 = this;
            r5 = r25
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r5
            r0 = r24
            java.lang.Object r4 = r0.receiver
            X.03PI r4 = (X.C03PI) r4
            r4.getClass()
            boolean r0 = X.AnonymousClass0368.LIZ()
            if (r0 == 0) goto L1f
            if (r5 != 0) goto L22
            X.09Fh r0 = X.C2341109Fh.LIZ
            r0.getClass()
            java.lang.String r0 = "paymentMethod is null"
            X.C2341109Fh.LJ(r0)
        L1f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L22:
            java.lang.String r2 = r5.id
            r1 = 0
            if (r2 == 0) goto L3f
            java.lang.String r0 = "pm_pi_ccdc_"
            boolean r1 = kotlin.text.u.LJJIIJZLJL(r2, r0, r1)
            r0 = 1
            if (r1 != r0) goto L3f
        L30:
            java.lang.String r8 = r5.token
            if (r8 != 0) goto L57
            X.09Fh r0 = X.C2341109Fh.LIZ
            r0.getClass()
            java.lang.String r0 = "Only saved ccdc can pre risk in re-payment"
            X.C2341109Fh.LJ(r0)
            goto L1f
        L3f:
            X.03SY r1 = X.C03SY.LIZ
            java.lang.String r0 = r5.id
            r1.getClass()
            boolean r0 = X.C03SY.LJIJI(r0)
            if (r0 != 0) goto L30
            X.09Fh r0 = X.C2341109Fh.LIZ
            r0.getClass()
            java.lang.String r0 = "CCDC pre risk only"
            X.C2341109Fh.LJ(r0)
            goto L1f
        L57:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData r1 = r4.LJIILIIL
            r3 = 0
            if (r1 == 0) goto L9a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r1.paymentMethodsData
            if (r0 == 0) goto L9a
            java.lang.String r2 = r0.pipoHost
        L62:
            com.google.gson.n r3 = r1.preRiskParam
        L64:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r6 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo
            java.lang.String r7 = r5.id
            java.util.List r9 = r5.LJJLIIIJL()
            r10 = 0
            r1 = r6
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r2 == 0) goto L1f
            if (r3 == 0) goto L1f
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.LJIILJJIL = r0
            if (r0 == 0) goto L9e
            X.C881703cV.LIZ(r0, r2, r1, r3)
            goto L1f
        L9a:
            r2 = r3
            if (r1 == 0) goto L64
            goto L62
        L9e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03PO.invoke(java.lang.Object):java.lang.Object");
    }
}
