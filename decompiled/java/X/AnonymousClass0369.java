package X;

/* JADX INFO: renamed from: X.0369, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0369 {
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.FinancingDetails LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r7, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r8, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r9) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = r7.installmentInfo
            r5 = 1
            r4 = 0
            if (r0 == 0) goto Lb8
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan> r0 = r0.installmentPlans
            if (r0 == 0) goto Lb8
            java.util.Iterator r6 = r0.iterator()
        Le:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r2
            java.lang.String r1 = r2.tenure
            if (r8 == 0) goto Lb3
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r8.paymentMethodInfo
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r0.tenure
        L25:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r2.installmentOptionId
            if (r8 == 0) goto Lb1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r8.paymentMethodInfo
            if (r0 == 0) goto Lb1
            java.lang.String r0 = r0.installmentOptionId
        L35:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Le
        L3b:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r3
            if (r3 == 0) goto Lb8
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r3 = r3.downpayment
        L41:
            if (r9 == 0) goto Laf
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r9.storedMethods
            if (r0 == 0) goto Laf
            java.util.Iterator r6 = r0.iterator()
        L4b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r2 = r6.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r1 = r0.id
            java.lang.String r0 = r7.id
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4b
        L62:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
            if (r2 == 0) goto Laf
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = r2.installmentInfo
            if (r0 == 0) goto Laf
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan> r0 = r0.installmentPlans
            if (r0 == 0) goto Laf
            java.lang.Object r0 = X.C13LP.LJJJJZI(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r0
            if (r0 == 0) goto Laf
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r1 = r0.downpayment
        L78:
            if (r8 == 0) goto La7
            boolean r0 = r8.LJI()
            if (r0 != r5) goto La7
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r3)
        L85:
            java.lang.Object r3 = r0.getFirst()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount) r3
            java.lang.Object r2 = r0.getSecond()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount) r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = r7.installmentInfo
            if (r0 == 0) goto La5
            java.lang.String r1 = r0.prequalifiedInstallmentPlanId
        L97:
            if (r8 == 0) goto L9f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r8.paymentMethodInfo
            if (r0 == 0) goto L9f
            java.lang.String r4 = r0.installmentPlanId
        L9f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.FinancingDetails r0 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.FinancingDetails
            r0.<init>(r3, r2, r1, r4)
            return r0
        La5:
            r1 = r4
            goto L97
        La7:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r4)
            goto L85
        Lad:
            r2 = r4
            goto L62
        Laf:
            r1 = r4
            goto L78
        Lb1:
            r0 = r4
            goto L35
        Lb3:
            r0 = r4
            goto L25
        Lb6:
            r3 = r4
            goto L3b
        Lb8:
            r3 = r4
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0369.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.FinancingDetails");
    }
}
