package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C833903Np {
    public final InterfaceC836103Ol LIZ;

    public C833903Np(InterfaceC836103Ol interfaceC836103Ol) {
        this.LIZ = interfaceC836103Ol;
    }

    public static void LIZIZ(PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
        String str = null;
        if (paymentMethod2 != null) {
            str = paymentMethod2.id;
        }
        if (C03S8.LJJIFFI(str, false, false) && (paymentMethod = paymentInfo.paymentMethod) != null && Intrinsics.LJFF(paymentMethod.defaultSave, Boolean.TRUE)) {
            PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
            if ((paymentMethodInfo2 == null || paymentMethodInfo2.isChooseSave() == null) && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
                paymentMethodInfo.setChooseSave(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x0431, code lost:
    
        if (r1 == null) goto L322;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015f A[PHI: r1 r4
      0x015f: PHI (r1v49 java.util.List) = (r1v40 java.util.List), (r1v54 java.util.List) binds: [B:175:0x0236, B:100:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r4v6 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:175:0x0236, B:100:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0240 A[PHI: r4
      0x0240: PHI (r4v3 boolean) = (r4v2 boolean), (r4v6 boolean), (r4v7 boolean) binds: [B:175:0x0236, B:101:0x015f, B:100:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x041a A[PHI: r9
      0x041a: PHI (r9v8 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) = 
      (r9v7 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r9v9 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r9v9 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r9v9 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r9v9 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
     binds: [B:313:0x040e, B:304:0x03f2, B:306:0x03f8, B:308:0x03fc, B:310:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x03c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod LIZ(X.C833903Np r17, boolean r18, kotlin.jvm.internal.AwS580S0100000_1 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C833903Np.LIZ(X.03Np, boolean, kotlin.jvm.internal.AwS580S0100000_1, int):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r7, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r8, java.util.List r9, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r10) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r6 = r7.paymentMethod
            if (r6 == 0) goto L84
            r3 = 0
            if (r8 == 0) goto L97
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r8.availability
        L9:
            r6.availability = r0
            if (r8 == 0) goto L94
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip r0 = r8.paymentTip
        Lf:
            r6.paymentTip = r0
            if (r8 == 0) goto L91
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r4 = r8.installmentInfo
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo> r2 = r8.installmentInfoList
        L17:
            if (r10 == 0) goto L8f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType r1 = r10.cciCashierDisplayType
        L1b:
            r0 = 0
            X.C03S8.LJJIJ(r6, r4, r2, r1, r0)
            X.C03S8.LJJIIZI(r6, r9, r7)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r5 = r6.installmentInfo
            if (r5 != 0) goto L32
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo> r0 = r6.installmentInfoList
            if (r0 == 0) goto L8d
            java.lang.Object r5 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo) r5
            if (r5 == 0) goto L8d
        L32:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan> r0 = r5.installmentPlans
            if (r0 == 0) goto L59
            java.util.Iterator r4 = r0.iterator()
        L3a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r0
            java.lang.String r1 = r0.tenure
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r7.paymentMethodInfo
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.tenure
        L4f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3a
        L55:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r2
            if (r2 != 0) goto L63
        L59:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan> r0 = r5.installmentPlans
            if (r0 == 0) goto L8d
            java.lang.Object r2 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r2
        L63:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r1 = r7.paymentMethodInfo
            if (r1 == 0) goto L6e
            if (r2 == 0) goto L87
            java.lang.String r0 = r2.tenure
        L6b:
            r1.setTenure(r0)
        L6e:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r1 = r7.paymentMethodInfo
            if (r1 == 0) goto L79
            if (r2 == 0) goto L85
            java.lang.String r0 = r2.tenureCycle
        L76:
            r1.setTenureCycle(r0)
        L79:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r7.paymentMethodInfo
            if (r0 == 0) goto L84
            if (r2 == 0) goto L81
            java.lang.String r3 = r2.id
        L81:
            r0.setInstallmentPlanId(r3)
        L84:
            return
        L85:
            r0 = r3
            goto L76
        L87:
            r0 = r3
            goto L6b
        L89:
            r0 = r3
            goto L4f
        L8b:
            r2 = r3
            goto L55
        L8d:
            r2 = r3
            goto L63
        L8f:
            r1 = r3
            goto L1b
        L91:
            r4 = r3
            r2 = r3
            goto L17
        L94:
            r0 = r3
            goto Lf
        L97:
            r0 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C833903Np.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.util.List, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData):void");
    }
}
