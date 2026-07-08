package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.03Mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C831203Mo {
    public static C03ML LIZ(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        PaymentInfo paymentInfo;
        PaymentMethodsData paymentMethodsData;
        PaymentMethod paymentMethod;
        PaymentMethodsData paymentMethodsData2;
        PaymentInfo paymentInfo2 = orderSubmitAssemViewModel.getState().LLIZ;
        if ((paymentInfo2 != null && paymentInfo2.LIZLLL()) || (paymentInfo = orderSubmitAssemViewModel.getState().LLIZ) == null || !paymentInfo.LIZIZ()) {
            ActivateHelper activateHelper = ActivateHelper.LIZ;
            BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
            PaymentMethod paymentMethod2 = null;
            if (billInfoData != null) {
                paymentMethodsData = billInfoData.paymentMethods;
            } else {
                paymentMethodsData = null;
            }
            PaymentInfo paymentInfo3 = orderSubmitAssemViewModel.getState().LLIZ;
            if (paymentInfo3 != null) {
                paymentMethod = paymentInfo3.paymentMethod;
            } else {
                paymentMethod = null;
            }
            activateHelper.getClass();
            if (!ActivateHelper.LJI(paymentMethod, paymentMethodsData)) {
                BillInfoData billInfoData2 = orderSubmitAssemViewModel.LLJJI;
                if (billInfoData2 != null) {
                    paymentMethodsData2 = billInfoData2.paymentMethods;
                } else {
                    paymentMethodsData2 = null;
                }
                PaymentInfo paymentInfo4 = orderSubmitAssemViewModel.getState().LLIZ;
                if (paymentInfo4 != null) {
                    paymentMethod2 = paymentInfo4.paymentMethod;
                }
                if (!ActivateHelper.LJIIIIZZ(paymentMethod2, paymentMethodsData2) || orderSubmitAssemViewModel.j0) {
                    return C03ML.DEFAULT;
                }
            }
            return C03ML.BNPL_ACTIVATE;
        }
        return C03ML.COMBINED_PAYMENT;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r8) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r1 = r8.LLJJJ
            r5 = 1
            if (r1 == 0) goto Lae
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel r0 = X.C03S0.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r1.paymentMethod
            boolean r0 = X.C03S0.LIZJ(r0)
            if (r0 != r5) goto Lae
            r0 = 1
        L10:
            r2 = 0
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r8.LLJJJ
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
            if (r0 == 0) goto L25
            java.lang.Boolean r1 = r0.LJIIJJI
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L51
        L25:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r8.LLJJJ
            if (r0 == 0) goto L95
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZLLL
            if (r1 == 0) goto L95
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.id
        L33:
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L95
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r8.LLJJJ
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
            if (r0 == 0) goto Laa
            X.03Of r0 = r0.LJI
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.LIZ
            if (r0 == 0) goto Laa
            java.lang.String r0 = r0.id
        L4b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != r5) goto L95
        L51:
            boolean r0 = X.C034S.LIZ()
            if (r0 == 0) goto L9a
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.LIZ()
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r1
            if (r1 == 0) goto L98
            r8 = 1
        L6f:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.String r6 = r0.getName()
            if (r1 == 0) goto L96
            java.lang.Class r0 = r1.getClass()
            java.lang.String r7 = r0.getName()
        L7f:
            X.C1AQS.LIZJ(r3, r5, r6, r7, r8)
        L82:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r1
            android.app.Application r0 = r1.getApplication()
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L95
            r0 = 2131840235(0x7f114ceb, float:1.9313744E38)
            java.lang.String r2 = r1.getString(r0)
        L95:
            return r2
        L96:
            r7 = r2
            goto L7f
        L98:
            r8 = 0
            goto L6f
        L9a:
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.LIZ()
            X.04aq r1 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            X.0317 r1 = r1.LIZLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r1
            goto L82
        Laa:
            r0 = r2
            goto L4b
        Lac:
            r0 = r2
            goto L33
        Lae:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C831203Mo.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel):java.lang.String");
    }
}
