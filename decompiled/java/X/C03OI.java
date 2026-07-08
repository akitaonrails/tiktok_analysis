package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CombinePaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.IndependentCombinePaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.IndependentCreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.IndependentPaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.IndependentPricingPaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03OI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OI {
    public static final C03OI LIZ = new C03OI();

    public static String LIZ(List list) {
        Object c098200Yq;
        String desc;
        String desc2;
        List<InstallmentPlan> list2;
        int size;
        String desc3;
        String desc4;
        PaymentPromotion paymentPromotion;
        PaymentPromotion paymentPromotion2;
        PaymentPromotion paymentPromotion3;
        Object obj = null;
        if (list == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                IndependentPricingPaymentMethodInfo independentPricingPaymentMethodInfo = (IndependentPricingPaymentMethodInfo) it2.next();
                JSONObject jSONObject = new JSONObject();
                C03PA.LIZ(jSONObject, "pm_id", independentPricingPaymentMethodInfo.id);
                C03PA.LIZ(jSONObject, "token", independentPricingPaymentMethodInfo.token);
                C03OI c03oi = LIZ;
                List<IndependentPricingPaymentMethodInfo> list3 = independentPricingPaymentMethodInfo.subPaymentMethods;
                c03oi.getClass();
                C03PA.LIZ(jSONObject, "sub_pm", LIZ(list3));
                List<PaymentPromotion> list4 = independentPricingPaymentMethodInfo.promotionInfo;
                if (list4 != null && (paymentPromotion3 = (PaymentPromotion) C13LP.LJJJJZI(list4)) != null) {
                    desc = paymentPromotion3.getDesc();
                } else {
                    desc = null;
                }
                C03PA.LIZ(jSONObject, "promotion_info", desc);
                PaymentServiceFeeInfo paymentServiceFeeInfo = independentPricingPaymentMethodInfo.paymentServiceFeeInfo;
                if (paymentServiceFeeInfo != null && (paymentPromotion2 = paymentServiceFeeInfo.paymentPromotionInfo) != null) {
                    desc2 = paymentPromotion2.getDesc();
                } else {
                    desc2 = null;
                }
                C03PA.LIZ(jSONObject, "payment_service_promotion", desc2);
                C03PA.LIZ(jSONObject, "unit_id", independentPricingPaymentMethodInfo.paymentUnitId);
                C03PA.LIZ(jSONObject, "is_installment", independentPricingPaymentMethodInfo.isInstallment);
                InstallmentInfo installmentInfo = independentPricingPaymentMethodInfo.installmentInfo;
                if (installmentInfo == null) {
                    List<InstallmentInfo> list5 = independentPricingPaymentMethodInfo.installmentInfoList;
                    if (list5 != null) {
                        installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list5);
                    } else {
                        installmentInfo = null;
                    }
                }
                if (installmentInfo == null) {
                    list2 = null;
                } else {
                    list2 = installmentInfo.installmentPlans;
                }
                if (list2 != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                C03PA.LIZ(jSONObject, "installment_plan_size", Integer.valueOf(size));
                C03PA.LIZ(jSONObject, "card_bin", independentPricingPaymentMethodInfo.cardBin);
                C03PA.LIZ(jSONObject, "last_four", independentPricingPaymentMethodInfo.lastFour);
                C03PA.LIZ(jSONObject, "is_client_bind", independentPricingPaymentMethodInfo.isClientBind);
                JSONArray jSONArray2 = new JSONArray();
                if (list2 != null) {
                    for (InstallmentPlan installmentPlan : list2) {
                        JSONObject jSONObject2 = new JSONObject();
                        C03PA.LIZ(jSONObject2, "tenure", installmentPlan.tenure);
                        C03PA.LIZ(jSONObject2, FollowStatusChangeMethod.PARAM_UID, installmentPlan.id);
                        C03PA.LIZ(jSONObject2, "unit_id", installmentPlan.paymentUnitId);
                        C03PA.LIZ(jSONObject2, "price_version_id", installmentPlan.paymentPriceVersionId);
                        PaymentServiceFeeInfo paymentServiceFeeInfo2 = installmentPlan.paymentServiceFeeInfo;
                        if (paymentServiceFeeInfo2 != null && (paymentPromotion = paymentServiceFeeInfo2.paymentPromotionInfo) != null) {
                            desc3 = paymentPromotion.getDesc();
                        } else {
                            desc3 = null;
                        }
                        C03PA.LIZ(jSONObject2, "payment_service_promotion", desc3);
                        PaymentPromotion paymentPromotion4 = installmentPlan.promotionInfo;
                        if (paymentPromotion4 != null) {
                            desc4 = paymentPromotion4.getDesc();
                        } else {
                            desc4 = null;
                        }
                        C03PA.LIZ(jSONObject2, "promotion_info", desc4);
                        jSONArray2.put(jSONObject2);
                    }
                }
                C03PA.LIZ(jSONObject, "installment_plans", jSONArray2);
                jSONArray.put(jSONObject);
            }
            c098200Yq = jSONArray.toString();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static String LIZIZ(List list) {
        Object c098200Yq;
        String desc;
        String desc2;
        String str;
        List<InstallmentPlan> list2;
        int size;
        String desc3;
        String desc4;
        String str2;
        PaymentPromotion paymentPromotion;
        PaymentPromotion paymentPromotion2;
        PaymentPromotion paymentPromotion3;
        Object obj = null;
        try {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    PaymentMethod paymentMethod = (PaymentMethod) it2.next();
                    JSONObject jSONObject = new JSONObject();
                    C03PA.LIZ(jSONObject, "pm_id", paymentMethod.id);
                    C03PA.LIZ(jSONObject, "token", paymentMethod.token);
                    C03OI c03oi = LIZ;
                    List<PaymentMethod> list3 = paymentMethod.subPaymentMethods;
                    c03oi.getClass();
                    C03PA.LIZ(jSONObject, "sub_pm", LIZIZ(list3));
                    List<PaymentPromotion> list4 = paymentMethod.promotionInfo;
                    if (list4 != null && (paymentPromotion3 = (PaymentPromotion) C13LP.LJJJJZI(list4)) != null) {
                        desc = paymentPromotion3.getDesc();
                    } else {
                        desc = null;
                    }
                    C03PA.LIZ(jSONObject, "promotion_info", desc);
                    PaymentServiceFeeInfo paymentServiceFeeInfo = paymentMethod.paymentServiceFeeInfo;
                    if (paymentServiceFeeInfo != null && (paymentPromotion2 = paymentServiceFeeInfo.paymentPromotionInfo) != null) {
                        desc2 = paymentPromotion2.getDesc();
                    } else {
                        desc2 = null;
                    }
                    C03PA.LIZ(jSONObject, "payment_service_promotion", desc2);
                    C03PA.LIZ(jSONObject, "unit_id", paymentMethod.paymentUnitId);
                    C03PA.LIZ(jSONObject, "price_version_id", paymentMethod.paymentPriceVersionId);
                    Availability availability = paymentMethod.availability;
                    if (availability != null) {
                        str = availability.statusCode;
                    } else {
                        str = null;
                    }
                    C03PA.LIZ(jSONObject, "status_code", str);
                    InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
                    if (installmentInfo == null) {
                        List<InstallmentInfo> list5 = paymentMethod.installmentInfoList;
                        if (list5 != null) {
                            installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list5);
                        } else {
                            installmentInfo = null;
                        }
                    }
                    if (installmentInfo == null) {
                        list2 = null;
                    } else {
                        list2 = installmentInfo.installmentPlans;
                    }
                    if (list2 != null) {
                        size = list2.size();
                    } else {
                        size = 0;
                    }
                    C03PA.LIZ(jSONObject, "installment_plan_size", Integer.valueOf(size));
                    jSONObject.put("card_bin", paymentMethod.cardBin);
                    C03PA.LIZ(jSONObject, "last_four", paymentMethod.lastFour);
                    C03PA.LIZ(jSONObject, "is_client_bind", paymentMethod.isClientBind);
                    JSONArray jSONArray2 = new JSONArray();
                    if (list2 != null) {
                        for (InstallmentPlan installmentPlan : list2) {
                            JSONObject jSONObject2 = new JSONObject();
                            C03PA.LIZ(jSONObject2, "tenure", installmentPlan.tenure);
                            C03PA.LIZ(jSONObject2, FollowStatusChangeMethod.PARAM_UID, installmentPlan.id);
                            C03PA.LIZ(jSONObject2, "unit_id", installmentPlan.paymentUnitId);
                            C03PA.LIZ(jSONObject2, "price_version_id", installmentPlan.paymentPriceVersionId);
                            PaymentServiceFeeInfo paymentServiceFeeInfo2 = installmentPlan.paymentServiceFeeInfo;
                            if (paymentServiceFeeInfo2 != null && (paymentPromotion = paymentServiceFeeInfo2.paymentPromotionInfo) != null) {
                                desc3 = paymentPromotion.getDesc();
                            } else {
                                desc3 = null;
                            }
                            C03PA.LIZ(jSONObject2, "payment_service_promotion", desc3);
                            PaymentPromotion paymentPromotion4 = installmentPlan.promotionInfo;
                            if (paymentPromotion4 != null) {
                                desc4 = paymentPromotion4.getDesc();
                            } else {
                                desc4 = null;
                            }
                            C03PA.LIZ(jSONObject2, "promotion_info", desc4);
                            Availability availability2 = installmentPlan.availability;
                            if (availability2 != null) {
                                str2 = availability2.statusCode;
                            } else {
                                str2 = null;
                            }
                            C03PA.LIZ(jSONObject2, "status_code", str2);
                            C03OI c03oi2 = LIZ;
                            List<PaymentMethod> list6 = installmentPlan.paymentMethods;
                            c03oi2.getClass();
                            C03PA.LIZ(jSONObject2, "plan_methods", LIZIZ(list6));
                            jSONArray2.put(jSONObject2);
                        }
                    }
                    C03PA.LIZ(jSONObject, "installment_plans", jSONArray2);
                    jSONArray.put(jSONObject);
                }
            }
            c098200Yq = jSONArray.toString();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static String LIZLLL(List list, PaymentMethodsData paymentMethodsData) {
        Object c098200Yq;
        List<CreditInfo> list2;
        Object obj = null;
        if (!EcPaymentIndependentPriceDefaultConfig.LIZIZ()) {
            return null;
        }
        try {
            if (paymentMethodsData != null) {
                JSONObject jSONObject = new JSONObject();
                C03OI c03oi = LIZ;
                List<PaymentMethod> list3 = paymentMethodsData.paymentMethods;
                c03oi.getClass();
                jSONObject.put("out_pm", LIZIZ(list3));
                CombinePaymentInfo combinePaymentInfo = paymentMethodsData.combinePaymentInfo;
                if (combinePaymentInfo != null && (list2 = combinePaymentInfo.creditInfoList) != null) {
                    for (CreditInfo creditInfo : list2) {
                        JSONObject jSONObject2 = new JSONObject();
                        PaymentMethod paymentMethod = creditInfo.creditPaymentMethod;
                        if (paymentMethod != null) {
                            C03OI c03oi2 = LIZ;
                            List listSingletonList = Collections.singletonList(paymentMethod);
                            c03oi2.getClass();
                            jSONObject2.put("credit_method", LIZIZ(listSingletonList));
                            jSONObject2.put("credit_pm", LIZIZ(creditInfo.paymentMethods));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("credit_info_");
                            sbLIZ.append(creditInfo.creditPaymentMethod.id);
                            jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject2);
                        }
                    }
                }
                C03PA.LIZ(jSONObject, "consultation_id", paymentMethodsData.consultationId);
                c098200Yq = C786410Ut5.J3(jSONObject);
            } else {
                LIZ.getClass();
                c098200Yq = LIZIZ(list);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static void LJFF(String str, String str2) {
        Boolean bool = EcPaymentIndependentPriceDefaultConfig.LIZJ().enableDebugTrack;
        if (bool != null && !bool.booleanValue()) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Scene.SCENE_SERVICE, str);
            linkedHashMap.put("debug_info", str2);
            LJII("rd_pipo_payment_price_info_track_debug", linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJI(String str, JSONObject jSONObject) {
        Boolean bool = EcPaymentIndependentPriceDefaultConfig.LIZJ().enableDebugTrack;
        if (bool != null && !bool.booleanValue()) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Scene.SCENE_SERVICE, str);
            linkedHashMap.put("debug_info", C786410Ut5.J3(jSONObject));
            LJII("rd_pipo_payment_price_info_track_debug", linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJII(String str, Map map) {
        if (!EcPaymentIndependentPriceDefaultConfig.LIZIZ()) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "Payment_Pricing_Page");
            C1018703yb.LIZIZ(str, linkedHashMap);
            C921903iz.LIZ.getClass();
            C921903iz.LIZIZ(4, linkedHashMap, str);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static String LIZJ(PaymentMethodsData paymentMethodsData, List list, IndependentPaymentMethodsData independentPaymentMethodsData) {
        Object c098200Yq;
        List<IndependentCreditInfo> list2;
        Object obj = null;
        if (!EcPaymentIndependentPriceDefaultConfig.LIZIZ()) {
            return null;
        }
        try {
            if (independentPaymentMethodsData != null) {
                JSONObject jSONObject = new JSONObject();
                C03PA.LIZ(jSONObject, "consultation_id", paymentMethodsData.consultationId);
                C03OI c03oi = LIZ;
                List<IndependentPricingPaymentMethodInfo> list3 = independentPaymentMethodsData.paymentMethods;
                c03oi.getClass();
                jSONObject.put("out_pm", LIZ(list3));
                IndependentCombinePaymentInfo independentCombinePaymentInfo = independentPaymentMethodsData.combinePaymentInfo;
                if (independentCombinePaymentInfo != null && (list2 = independentCombinePaymentInfo.creditInfoList) != null) {
                    for (IndependentCreditInfo independentCreditInfo : list2) {
                        JSONObject jSONObject2 = new JSONObject();
                        IndependentPricingPaymentMethodInfo independentPricingPaymentMethodInfo = independentCreditInfo.creditPaymentMethod;
                        if (independentPricingPaymentMethodInfo != null) {
                            C03OI c03oi2 = LIZ;
                            List listSingletonList = Collections.singletonList(independentPricingPaymentMethodInfo);
                            c03oi2.getClass();
                            jSONObject2.put("credit_method", LIZ(listSingletonList));
                            jSONObject2.put("credit_pm", LIZ(independentCreditInfo.paymentMethods));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("credit_info_");
                            sbLIZ.append(independentCreditInfo.creditPaymentMethod.id);
                            jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject2);
                        }
                    }
                }
                c098200Yq = C786410Ut5.J3(jSONObject);
            } else {
                LIZ.getClass();
                c098200Yq = LIZ(list);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static void LJ(C03OI c03oi, String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        long jLongValue;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        String str16 = str9;
        String str17 = str10;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            str11 = null;
        }
        if ((i & 32) != 0) {
            str12 = null;
        }
        if ((i & 64) != 0) {
            str13 = null;
        }
        if ((i & 128) != 0) {
            str14 = null;
        }
        if ((i & 256) != 0) {
            str15 = null;
        }
        if ((i & 512) != 0) {
            str16 = null;
        }
        if ((i & 1024) != 0) {
            str17 = null;
        }
        c03oi.getClass();
        if (EcPaymentIndependentPriceDefaultConfig.LIZIZ()) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put(Scene.SCENE_SERVICE, str);
                linkedHashMap.put("step", str2);
                if (str3 == null) {
                    str3 = "";
                }
                linkedHashMap.put("path", str3);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                linkedHashMap.put("api_duration", Long.valueOf(jLongValue));
                if (str11 == null) {
                    str11 = "";
                }
                linkedHashMap.put("code", str11);
                if (str12 == null) {
                    str12 = "";
                }
                linkedHashMap.put("message", str12);
                if (str13 == null) {
                    str13 = "";
                }
                linkedHashMap.put("request_payment_info", str13);
                if (str14 == null) {
                    str14 = "";
                }
                linkedHashMap.put("response_payment_info", str14);
                if (str15 == null) {
                    str15 = "";
                }
                linkedHashMap.put("response_price_info", str15);
                if (str16 == null) {
                    str16 = "";
                }
                linkedHashMap.put("service_fee_token", str16);
                if (str17 == null) {
                    str17 = "";
                }
                linkedHashMap.put("request_id", str17);
                LJII("rd_pipo_payment_price_info_debug", linkedHashMap);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
