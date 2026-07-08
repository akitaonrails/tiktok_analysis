package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03S7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03S7 {
    public static final /* synthetic */ int LIZ = 0;

    public static C03S9 LIZIZ(PaymentMethodInfo paymentMethodInfo) {
        ArrayList arrayList;
        String str = paymentMethodInfo.id;
        List<PaymentElement> list = paymentMethodInfo.paymentElements;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (PaymentElement paymentElement : list) {
                C03SA c03sa = new C03SA(paymentElement.element, paymentElement.paramName, paymentElement.paramValue);
                c03sa.LIZLLL = paymentElement.isEncrypted().booleanValue();
                arrayList.add(c03sa);
            }
        } else {
            arrayList = null;
        }
        C03S9 c03s9 = new C03S9(str, arrayList);
        c03s9.LIZIZ = paymentMethodInfo.token;
        c03s9.LIZLLL = paymentMethodInfo.tenure;
        c03s9.LJ = paymentMethodInfo.installmentPlanId;
        c03s9.LJFF = paymentMethodInfo.bankCode;
        if (C03S8.LJIJJ(paymentMethodInfo.id) && C123100dR.LIZ(paymentMethodInfo.tenure) && C123100dR.LIZ(paymentMethodInfo.installmentPlanId)) {
            c03s9.LJI = Boolean.TRUE;
        }
        if (Intrinsics.LJFF(paymentMethodInfo.isAnchored(), Boolean.TRUE)) {
            c03s9.LJII.put("is_hybrid_anchor", "true");
        }
        return c03s9;
    }

    public static PaymentMethodInfo LJ(String str) {
        return new PaymentMethodInfo(null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null);
    }

    public static PaymentExtra LIZLLL(PaymentInfo paymentInfo, PaymentExtra paymentExtra) {
        PaymentMethodInfo paymentMethodInfo;
        List<PaymentElement> list;
        if (paymentInfo == null || (paymentMethodInfo = paymentInfo.paymentMethodInfo) == null || (list = paymentMethodInfo.paymentElements) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PaymentElement paymentElement : list) {
            String str = paymentElement.element;
            if (str != null && Intrinsics.LJFF(str, "eg_ccdc_global_cvv")) {
                arrayList.add(paymentElement);
            }
        }
        if (!arrayList.isEmpty()) {
            if (paymentExtra != null) {
                return PaymentExtra.LIZ(paymentExtra, Boolean.TRUE, null, 5);
            }
            return new PaymentExtra(null, Boolean.TRUE, null);
        }
        return paymentExtra;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r12, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03S7.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, java.lang.String):java.lang.String");
    }

    public static HybridPaymentInfo LIZJ(PaymentInfo paymentInfo, PaymentMethod paymentMethod, PaymentMethodInfo paymentMethodInfo) {
        String str;
        List<InstallmentPlan> list;
        InstallmentPlan next;
        String str2;
        String str3;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "pm_pi_ins_pipobnpl_c_d")) {
            InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
            if (installmentInfo == null || (list = installmentInfo.installmentPlans) == null) {
                return null;
            }
            Iterator<InstallmentPlan> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InstallmentPlan installmentPlan = next;
                    String str4 = installmentPlan.tenure;
                    if (paymentMethodInfo != null) {
                        str2 = paymentMethodInfo.tenure;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str4, str2)) {
                        String str5 = installmentPlan.id;
                        if (paymentMethodInfo != null) {
                            str3 = paymentMethodInfo.installmentPlanId;
                        } else {
                            str3 = null;
                        }
                        if (Intrinsics.LJFF(str5, str3)) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InstallmentPlan installmentPlan2 = next;
            if (installmentPlan2 == null) {
                return null;
            }
            return installmentPlan2.hybridPaymentInfo;
        }
        C03Q4 c03q4 = C03Q4.LIZ;
        PaymentMethod paymentMethodLJIIJJI = c03q4.LJIIJJI(paymentMethod, c03q4.LJIIL(paymentInfo, null), "PayBeanProcessor_getHybridPaymentInfo");
        if (paymentMethodLJIIJJI == null) {
            if (paymentMethod == null) {
                return null;
            }
        } else {
            paymentMethod = paymentMethodLJIIJJI;
        }
        return paymentMethod.hybridPaymentInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017f A[PHI: r5
      0x017f: PHI (r5v2 java.lang.Boolean) = (r5v53 java.lang.Boolean), (r5v53 java.lang.Boolean), (r5v54 java.lang.Boolean) binds: [B:13:0x0016, B:15:0x001a, B:11:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184 A[PHI: r2 r5
      0x0184: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:111:0x0180, B:20:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0184: PHI (r5v3 java.lang.Boolean) = (r5v2 java.lang.Boolean), (r5v52 java.lang.Boolean) binds: [B:111:0x0180, B:20:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019d A[PHI: r0
      0x019d: PHI (r0v22 ??) = (r0v7 ??), (r0v26 ??) binds: [B:122:0x019b, B:219:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028a A[PHI: r0
      0x028a: PHI (r0v8 ??) = (r0v7 ??), (r0v22 ??) binds: [B:122:0x019b, B:124:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0290 A[PHI: r0 r20
      0x0290: PHI (r0v9 ??) = (r0v83 ??), (r0v84 ??) binds: [B:199:0x028c, B:127:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r20v1 java.lang.Boolean) = (r20v0 java.lang.Boolean), (r20v13 java.lang.Boolean) binds: [B:199:0x028c, B:127:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0295 A[PHI: r0 r9 r20
      0x0295: PHI (r0v10 ??) = (r0v81 ??), (r0v82 ??) binds: [B:202:0x0291, B:130:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v11 java.lang.String) binds: [B:202:0x0291, B:130:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r20v2 java.lang.Boolean) = (r20v1 java.lang.Boolean), (r20v12 java.lang.Boolean) binds: [B:202:0x0291, B:130:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029b A[PHI: r0 r9 r20 r25
      0x029b: PHI (r0v11 ??) = (r0v79 ??), (r0v80 ??) binds: [B:205:0x0297, B:133:0x01b5] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v10 java.lang.String) binds: [B:205:0x0297, B:133:0x01b5] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r20v3 java.lang.Boolean) = (r20v2 java.lang.Boolean), (r20v11 java.lang.Boolean) binds: [B:205:0x0297, B:133:0x01b5] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r25v1 java.lang.Boolean) = (r25v0 java.lang.Boolean), (r25v9 java.lang.Boolean) binds: [B:205:0x0297, B:133:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a1 A[PHI: r0 r9 r20 r25 r26
      0x02a1: PHI (r0v12 ??) = (r0v77 ??), (r0v78 ??) binds: [B:208:0x029d, B:136:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v9 java.lang.String) binds: [B:208:0x029d, B:136:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r20v4 java.lang.Boolean) = (r20v3 java.lang.Boolean), (r20v10 java.lang.Boolean) binds: [B:208:0x029d, B:136:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r25v2 java.lang.Boolean) = (r25v1 java.lang.Boolean), (r25v8 java.lang.Boolean) binds: [B:208:0x029d, B:136:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r26v1 java.lang.Boolean) = (r26v0 java.lang.Boolean), (r26v7 java.lang.Boolean) binds: [B:208:0x029d, B:136:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a6 A[PHI: r0 r8 r9 r20 r25 r26
      0x02a6: PHI (r0v13 ??) = (r0v75 ??), (r0v76 ??) binds: [B:211:0x02a2, B:139:0x01c3] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v7 java.lang.String) binds: [B:211:0x02a2, B:139:0x01c3] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r9v4 java.lang.String) = (r9v3 java.lang.String), (r9v8 java.lang.String) binds: [B:211:0x02a2, B:139:0x01c3] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r20v5 java.lang.Boolean) = (r20v4 java.lang.Boolean), (r20v9 java.lang.Boolean) binds: [B:211:0x02a2, B:139:0x01c3] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r25v3 java.lang.Boolean) = (r25v2 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:211:0x02a2, B:139:0x01c3] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r26v2 java.lang.Boolean) = (r26v1 java.lang.Boolean), (r26v6 java.lang.Boolean) binds: [B:211:0x02a2, B:139:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ab A[PHI: r0 r7 r8 r9 r20 r25 r26
      0x02ab: PHI (r0v14 ??) = (r0v73 ??), (r0v74 ??) binds: [B:214:0x02a7, B:142:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:214:0x02a7, B:142:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r8v4 java.lang.String) = (r8v3 java.lang.String), (r8v6 java.lang.String) binds: [B:214:0x02a7, B:142:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v7 java.lang.String) binds: [B:214:0x02a7, B:142:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r20v6 java.lang.Boolean) = (r20v5 java.lang.Boolean), (r20v8 java.lang.Boolean) binds: [B:214:0x02a7, B:142:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r25v4 java.lang.Boolean) = (r25v3 java.lang.Boolean), (r25v6 java.lang.Boolean) binds: [B:214:0x02a7, B:142:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r26v3 java.lang.Boolean) = (r26v2 java.lang.Boolean), (r26v5 java.lang.Boolean) binds: [B:214:0x02a7, B:142:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d A[PHI: r4 r13 r14 r15
      0x005d: PHI (r4v8 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan) = 
      (r4v5 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan)
      (r4v9 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan)
     binds: [B:74:0x0108, B:41:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r13v4 java.lang.String) = (r13v1 java.lang.String), (r13v5 java.lang.String) binds: [B:74:0x0108, B:41:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r14v5 java.lang.String) = (r14v2 java.lang.String), (r14v6 java.lang.String) binds: [B:74:0x0108, B:41:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r15v6 java.lang.String) = (r15v3 java.lang.String), (r15v7 java.lang.String) binds: [B:74:0x0108, B:41:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9 A[PHI: r4 r15
      0x00f9: PHI (r4v3 boolean) = (r4v11 boolean), (r4v12 boolean), (r4v12 boolean) binds: [B:34:0x004d, B:31:0x0047, B:32:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r15v1 java.lang.String) = (r15v9 java.lang.String), (r15v10 java.lang.String), (r15v10 java.lang.String) binds: [B:34:0x004d, B:31:0x0047, B:32:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100 A[PHI: r4 r14 r15
      0x0100: PHI (r4v4 boolean) = (r4v3 boolean), (r4v3 boolean), (r4v10 boolean) binds: [B:66:0x00fa, B:67:0x00fc, B:37:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v0 java.lang.String), (r14v7 java.lang.String) binds: [B:66:0x00fa, B:67:0x00fc, B:37:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v8 java.lang.String) binds: [B:66:0x00fa, B:67:0x00fc, B:37:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107 A[PHI: r13 r14 r15
      0x0107: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v0 java.lang.String), (r13v5 java.lang.String) binds: [B:70:0x0101, B:71:0x0103, B:40:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v1 java.lang.String), (r14v6 java.lang.String) binds: [B:70:0x0101, B:71:0x0103, B:40:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v2 java.lang.String), (r15v7 java.lang.String) binds: [B:70:0x0101, B:71:0x0103, B:40:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c A[PHI: r4 r13 r14 r15
      0x010c: PHI (r4v6 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan) = 
      (r4v5 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan)
      (r4v8 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan)
     binds: [B:74:0x0108, B:43:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v4 java.lang.String) binds: [B:74:0x0108, B:43:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v5 java.lang.String) binds: [B:74:0x0108, B:43:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r15v4 java.lang.String) = (r15v3 java.lang.String), (r15v6 java.lang.String) binds: [B:74:0x0108, B:43:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo LJI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r32, boolean r33, int r34) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03S7.LJI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean, int):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r27, boolean r28, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r29, kotlin.jvm.internal.AFwS228S0000000_1 r30, int r31) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03S7.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, kotlin.jvm.internal.AFwS228S0000000_1, int):java.util.List");
    }
}
