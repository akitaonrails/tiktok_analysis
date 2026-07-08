package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipOpenCashierParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipPaymentMethodChangeEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C886203dE {
    public static final C886203dE LIZ = new C886203dE();

    public static boolean LJ(MembershipOpenCashierParams membershipOpenCashierParams) {
        String str;
        String str2;
        String str3;
        String str4 = membershipOpenCashierParams.entrance;
        if (str4 == null || str4.length() == 0 || (str = membershipOpenCashierParams.membershipMode) == null || str.length() == 0) {
            return false;
        }
        String str5 = membershipOpenCashierParams.membershipMode;
        if ((str5 == null || !u.LJIJI(str5, "paid", true)) && ((str2 = membershipOpenCashierParams.merchantUserId) == null || str2.length() == 0 || (str3 = membershipOpenCashierParams.currency) == null || str3.length() == 0)) {
            return false;
        }
        return true;
    }

    public static void LJI(String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MembershipCashierHelper: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
    }

    public static boolean LJIIIZ(MembershipOpenCashierParams membershipOpenCashierParams) {
        String str = membershipOpenCashierParams.paymentMethodToken;
        if ((str != null && str.length() != 0) || !Intrinsics.LJFF(membershipOpenCashierParams.paymentMethodCode, "pm_pi_ccdc_all")) {
            return false;
        }
        return true;
    }

    public static PaymentInfo LJIIJ(PaymentMethod paymentMethod) {
        return new PaymentInfo(new PaymentMethodInfo(paymentMethod.id, paymentMethod.token, new ArrayList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null), paymentMethod, null, Boolean.TRUE, null, null, null, null, null, new LinkedHashMap(), null);
    }

    public static PaymentInfo LIZ(PaymentMethodsData paymentMethodsData, MembershipOpenCashierParams membershipOpenCashierParams) {
        PaymentMethod paymentMethodLIZIZ = LIZIZ(paymentMethodsData, membershipOpenCashierParams);
        if (paymentMethodLIZIZ != null) {
            return LJIIJ(paymentMethodLIZIZ);
        }
        if (paymentMethodsData != null) {
            return paymentMethodsData.LJIILJJIL();
        }
        return null;
    }

    public static PaymentMethod LIZIZ(PaymentMethodsData paymentMethodsData, MembershipOpenCashierParams membershipOpenCashierParams) {
        PaymentInfo paymentInfoLJIILJJIL;
        Object next;
        String str;
        Object next2;
        ArrayList arrayList = new ArrayList();
        if (paymentMethodsData != null) {
            List<PaymentMethod> list = paymentMethodsData.paymentMethods;
            if (list != null) {
                Iterator<PaymentMethod> it2 = list.iterator();
                while (it2.hasNext()) {
                    LIZJ(it2.next(), arrayList);
                }
            }
            List<PaymentMethod> list2 = paymentMethodsData.storedMethods;
            if (list2 != null) {
                Iterator<PaymentMethod> it3 = list2.iterator();
                while (it3.hasNext()) {
                    LIZJ(it3.next(), arrayList);
                }
            }
        }
        String str2 = membershipOpenCashierParams.paymentMethodToken;
        if (str2 != null) {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (Intrinsics.LJFF(((PaymentMethod) next2).token, str2)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            PaymentMethod paymentMethod = (PaymentMethod) next2;
            if (paymentMethod != null) {
                return paymentMethod;
            }
        }
        String str3 = membershipOpenCashierParams.paymentMethodCode;
        if (str3 != null) {
            Iterator it5 = arrayList.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next = it5.next();
                    PaymentMethod paymentMethod2 = (PaymentMethod) next;
                    if (Intrinsics.LJFF(paymentMethod2.id, str3) && ((str = paymentMethod2.token) == null || str.length() == 0)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentMethod paymentMethod3 = (PaymentMethod) next;
            if (paymentMethod3 != null) {
                return paymentMethod3;
            }
        }
        if (paymentMethodsData == null || (paymentInfoLJIILJJIL = paymentMethodsData.LJIILJJIL()) == null) {
            return null;
        }
        return paymentInfoLJIILJJIL.paymentMethod;
    }

    public static final void LIZJ(PaymentMethod paymentMethod, List list) {
        if (paymentMethod == null) {
            return;
        }
        ((ArrayList) list).add(paymentMethod);
        List<PaymentMethod> list2 = paymentMethod.subPaymentMethods;
        if (list2 != null) {
            Iterator<PaymentMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                LIZJ(it2.next(), list);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r4, java.lang.Throwable r5) {
        /*
            if (r5 == 0) goto L22
            java.lang.String r2 = r5.getMessage()
            if (r2 == 0) goto L22
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", error="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            if (r3 != 0) goto L24
        L22:
            java.lang.String r3 = ""
        L24:
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "MembershipCashierHelper: "
            r1.append(r0)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZJ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C886203dE.LJFF(java.lang.String, java.lang.Throwable):void");
    }

    public static void LJIIIIZZ(PaymentInfo paymentInfo, boolean z) {
        PaymentMethod paymentMethod;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (paymentInfo != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishPaymentMethodChange type=");
        String str8 = "add_new_payment_method";
        if (z) {
            str = "add_new_payment_method";
        } else {
            str = "change_payment_method";
        }
        sbLIZ.append(str);
        sbLIZ.append(", paymentMethodId=");
        if (paymentMethod != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(", token=");
        if (paymentMethod != null) {
            str3 = paymentMethod.token;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        LJI(C2188811AlT.LIZIZ(sbLIZ));
        String str9 = null;
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            if (!z) {
                str8 = "change_payment_method";
            }
            if (paymentMethod != null) {
                str4 = paymentMethod.id;
                str5 = paymentMethod.token;
                str6 = paymentMethod.displayName;
                str9 = paymentMethod.iconUrl;
                str7 = paymentMethod.iconUrlDark;
            } else {
                str4 = null;
                str5 = null;
                str6 = null;
            }
            iEventCenter.LIZ("ec_pipo_change_payment_method", C1741890vQh.LJIIIIZZ(new MembershipPaymentMethodChangeEvent(str8, str4, str5, str6, str9, str7)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[PHI: r6
      0x00c4: PHI (r6v1 X.19EG) = (r6v0 X.19EG), (r6v2 X.19EG) binds: [B:36:0x00ac, B:40:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.app.Activity r19, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipPreCheckPaymentRiskResponse r20, X.InterfaceC1364105Vn<? super java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C886203dE.LIZLLL(android.app.Activity, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipPreCheckPaymentRiskResponse, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(android.app.Activity r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.InterfaceC1364105Vn<? super java.lang.String> r25) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C886203dE.LJII(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
