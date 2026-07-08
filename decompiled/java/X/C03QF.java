package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBindPayItemModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBindPayModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentOriginDataConfigItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03QF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03QF {
    public static List LIZ(List list) {
        ArrayList arrayList;
        Object next;
        Object next2;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomMergeBindPayModel ecomMergeBindPayModel = C03QG.LIZ;
        EcomMergeBindPayModel ecomMergeBindPayModel2 = (EcomMergeBindPayModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_merge_bind_pay", EcomMergeBindPayModel.class, ecomMergeBindPayModel);
        if (ecomMergeBindPayModel2 != null) {
            ecomMergeBindPayModel = ecomMergeBindPayModel2;
        }
        List<EcomMergeBindPayItemModel> list2 = ecomMergeBindPayModel.configs;
        if (list2 != null) {
            ArrayList<EcomMergeBindPayItemModel> arrayList2 = new ArrayList();
            for (EcomMergeBindPayItemModel ecomMergeBindPayItemModel : list2) {
                EcomMergeBindPayItemModel ecomMergeBindPayItemModel2 = ecomMergeBindPayItemModel;
                if (C770702zh.LIZIZ(ecomMergeBindPayItemModel2.payPmId) && C770702zh.LIZIZ(ecomMergeBindPayItemModel2.bindPmId)) {
                    arrayList2.add(ecomMergeBindPayItemModel);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (list != null) {
                    arrayList = new ArrayList(list);
                } else {
                    arrayList = null;
                }
                for (EcomMergeBindPayItemModel ecomMergeBindPayItemModel3 : arrayList2) {
                    String str = ecomMergeBindPayItemModel3.payPmId;
                    String str2 = ecomMergeBindPayItemModel3.bindPmId;
                    if (arrayList != null && !arrayList.isEmpty() && str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((PaymentMethod) next).id, str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        PaymentMethod paymentMethod = (PaymentMethod) next;
                        if (paymentMethod != null) {
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    if (Intrinsics.LJFF(((PaymentMethod) next2).id, str2)) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            PaymentMethod paymentMethod2 = (PaymentMethod) next2;
                            if (paymentMethod2 != null) {
                                paymentMethod.LJI = new C835503Of(paymentMethod2);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (!Intrinsics.LJFF(((PaymentMethod) obj).id, str2)) {
                                        arrayList3.add(obj);
                                    }
                                }
                                arrayList = arrayList3;
                            }
                        }
                    }
                }
                return arrayList;
            }
        }
        return list;
    }

    public static List LIZIZ(List list) {
        List<EcomPaymentOriginDataConfigItem> list2;
        Object next;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        C03OY c03oy;
        PaymentMethod next2;
        PaymentMethod next3;
        if (list != null && !list.isEmpty() && (list2 = C03S0.LIZIZ().paymentOriginDataConfigs) != null) {
            ArrayList arrayList = new ArrayList();
            for (EcomPaymentOriginDataConfigItem ecomPaymentOriginDataConfigItem : list2) {
                if (C770702zh.LIZIZ(ecomPaymentOriginDataConfigItem.parentPmId)) {
                    arrayList.add(ecomPaymentOriginDataConfigItem);
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    PaymentMethod paymentMethod3 = (PaymentMethod) it2.next();
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(((EcomPaymentOriginDataConfigItem) next).parentPmId, paymentMethod3.id)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    EcomPaymentOriginDataConfigItem ecomPaymentOriginDataConfigItem2 = (EcomPaymentOriginDataConfigItem) next;
                    if (ecomPaymentOriginDataConfigItem2 != null) {
                        List<PaymentMethod> list3 = paymentMethod3.subPaymentMethods;
                        if (list3 != null && !list3.isEmpty()) {
                            List<PaymentMethod> list4 = paymentMethod3.subPaymentMethods;
                            if (list4 != null) {
                                Iterator<PaymentMethod> it4 = list4.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next3 = it4.next();
                                        PaymentMethod paymentMethod4 = next3;
                                        if (C770702zh.LIZIZ(ecomPaymentOriginDataConfigItem2.displayPmId) && Intrinsics.LJFF(paymentMethod4.id, ecomPaymentOriginDataConfigItem2.displayPmId)) {
                                            break;
                                        }
                                    } else {
                                        next3 = null;
                                        break;
                                    }
                                }
                                paymentMethod = next3;
                            } else {
                                paymentMethod = null;
                            }
                            List<PaymentMethod> list5 = paymentMethod3.subPaymentMethods;
                            if (list5 != null) {
                                Iterator<PaymentMethod> it5 = list5.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next2 = it5.next();
                                        PaymentMethod paymentMethod5 = next2;
                                        if (C770702zh.LIZIZ(ecomPaymentOriginDataConfigItem2.mergedPmId) && Intrinsics.LJFF(paymentMethod5.id, ecomPaymentOriginDataConfigItem2.mergedPmId)) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                paymentMethod2 = next2;
                            } else {
                                paymentMethod2 = null;
                            }
                            if (paymentMethod != null) {
                                if (paymentMethod2 != null && C770702zh.LIZIZ(paymentMethod.saveDisplayText)) {
                                    c03oy = new C03OY(paymentMethod2, paymentMethod2.id, paymentMethod2.promotionInfo);
                                } else {
                                    c03oy = null;
                                }
                                paymentMethod.LJIIL = c03oy;
                                paymentMethod3 = paymentMethod;
                            } else if (Intrinsics.LJFF(ecomPaymentOriginDataConfigItem2.filterInvalid, Boolean.TRUE)) {
                            }
                        }
                        arrayList2.add(paymentMethod3);
                    } else if (paymentMethod3 != null) {
                        arrayList2.add(paymentMethod3);
                    }
                }
                return arrayList2;
            }
        }
        return list;
    }

    public static List LIZJ(List list) {
        boolean z;
        Availability availabilityCopy;
        List<PaymentMethod> listLIZ = LIZ(LIZIZ(list));
        if (listLIZ != null) {
            for (PaymentMethod paymentMethod : listLIZ) {
                List<PaymentMethod> list2 = paymentMethod.subPaymentMethods;
                if (list2 != null && !list2.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                Availability availabilityCopy2 = null;
                if (z) {
                    if (paymentMethod.LJIL == null) {
                        Availability availability = paymentMethod.availability;
                        if (availability != null) {
                            availabilityCopy2 = availability.copy(availability.isAvailable, availability.unavailableCode, availability.unavailableReason, availability.unavailablePopupTitle, availability.statusCode);
                        }
                        paymentMethod.LJIL = availabilityCopy2;
                    }
                    LIZLLL(paymentMethod);
                } else {
                    List<PaymentMethod> list3 = paymentMethod.subPaymentMethods;
                    if (list3 != null) {
                        for (PaymentMethod paymentMethod2 : list3) {
                            if (paymentMethod2.LJIL == null) {
                                Availability availability2 = paymentMethod2.availability;
                                if (availability2 != null) {
                                    availabilityCopy = availability2.copy(availability2.isAvailable, availability2.unavailableCode, availability2.unavailableReason, availability2.unavailablePopupTitle, availability2.statusCode);
                                } else {
                                    availabilityCopy = null;
                                }
                                paymentMethod2.LJIL = availabilityCopy;
                            }
                            LIZLLL(paymentMethod2);
                        }
                    }
                    paymentMethod.subPaymentMethods = LJ(paymentMethod.subPaymentMethods);
                }
            }
        }
        return LJ(listLIZ);
    }

    public static final void LIZLLL(PaymentMethod paymentMethod) {
        CommuteType commuteType;
        C03QI.LIZ.getClass();
        CommuteInfo commuteInfoLJJIIJ = paymentMethod.LJJIIJ(C03QI.LIZ().enableOptimize);
        CommuteType commuteType2 = null;
        if (commuteInfoLJJIIJ != null) {
            commuteType = commuteInfoLJJIIJ.commuteType;
        } else {
            commuteType = null;
        }
        CommuteType commuteType3 = CommuteType.APP_DISPLAY_TIPS_IF_NOT_INSTALL;
        if (commuteType != commuteType3) {
            CommuteInfo commuteInfoLJII = paymentMethod.LJII(C03QI.LIZ().enableOptimize);
            if (commuteInfoLJII != null) {
                commuteType2 = commuteInfoLJII.commuteType;
            }
            if (commuteType2 != commuteType3) {
                return;
            }
        }
        Availability availability = paymentMethod.availability;
        if (availability != null) {
            availability.setAvailable(Boolean.FALSE);
        }
        Availability availability2 = paymentMethod.availability;
        if (availability2 != null) {
            availability2.setStatusCode("9990");
        }
    }

    public static final List<PaymentMethod> LJ(List<PaymentMethod> list) {
        String str;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (PaymentMethod paymentMethod : list) {
            Availability availability = paymentMethod.availability;
            if (availability != null) {
                str = availability.statusCode;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, "9990")) {
                C03Q4 c03q4 = C03Q4.LIZ;
                c03q4.getClass();
                Boolean bool = EcPaymentIndependentPriceDefaultConfig.LIZJ().sortUnavailablePm;
                if ((bool != null && !bool.booleanValue()) || !C03Q4.LJJ(c03q4, paymentMethod) || !C03Q4.LJJIFFI(paymentMethod)) {
                    arrayList2.add(paymentMethod);
                }
            }
            arrayList.add(paymentMethod);
        }
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static boolean LJI(List list) {
        Availability availability;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PaymentMethod paymentMethod = (PaymentMethod) it2.next();
                if (Intrinsics.LJFF(paymentMethod.id, "pm_pi_cod_cod_c_d") && (availability = paymentMethod.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r3, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r4) {
        /*
            X.09Fh r0 = X.C2341109Fh.LIZ
            r0.getClass()
            java.lang.String r0 = "handlePaymentMethodsForCommuteType"
            X.C2341109Fh.LIZ(r0)
            if (r3 == 0) goto L45
            boolean r0 = r3.LJI()
            r2 = 1
            if (r0 != r2) goto L45
        L13:
            r1 = 0
            if (r2 == 0) goto L3a
            if (r3 == 0) goto L38
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r3.LIZ
            if (r0 == 0) goto L38
            X.031p r0 = r0.LJFF
            if (r0 == 0) goto L38
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.LJI
        L22:
            java.util.List r0 = LIZJ(r0)
        L26:
            if (r2 == 0) goto L47
            if (r3 == 0) goto L34
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r3.LIZ
            if (r0 == 0) goto L34
            X.031p r0 = r0.LJFF
            if (r0 == 0) goto L34
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r1 = r0.LJFF
        L34:
            LIZJ(r1)
            return
        L38:
            r0 = r1
            goto L22
        L3a:
            if (r4 == 0) goto L43
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r4.paymentMethods
        L3e:
            java.util.List r0 = LIZJ(r0)
            goto L26
        L43:
            r0 = r1
            goto L3e
        L45:
            r2 = 0
            goto L13
        L47:
            if (r4 == 0) goto L4b
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r1 = r4.storedMethods
        L4b:
            LIZJ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QF.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData):void");
    }
}
