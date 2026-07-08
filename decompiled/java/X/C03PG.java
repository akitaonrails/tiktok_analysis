package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTTSParamsCheckV2Settings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodLocalInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentExtra;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PriceInfoRequestParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03PG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PG {
    public static final C03PG LIZ = new C03PG();

    public static PaymentMethodLocalInfo LIZJ(PaymentMethod paymentMethod) {
        ArrayList arrayList;
        String str = paymentMethod.id;
        String str2 = paymentMethod.token;
        Boolean boolValueOf = Boolean.valueOf(paymentMethod.LIZIZ);
        List<PaymentMethod> list = paymentMethod.subPaymentMethods;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (PaymentMethod paymentMethod2 : list) {
                LIZ.getClass();
                arrayList.add(LIZJ(paymentMethod2));
            }
        } else {
            arrayList = null;
        }
        return new PaymentMethodLocalInfo(str, str2, boolValueOf, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsLocalData LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r13, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r14) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03PG.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsLocalData");
    }

    public static void LIZ(PaymentListResponseData paymentListResponseData, PayRequest payRequest, PaymentInfo paymentInfo) throws JSONException {
        PaymentMethodInfo paymentMethodInfo;
        List<PaymentElement> list;
        PaymentMethod paymentMethod;
        List<PaymentPrice> list2;
        List<PaymentBillSummary> list3;
        String strLIZ = PipoTTSParamsCheckV2Settings.LIZ("pay");
        boolean z = true;
        if (strLIZ != null && C123100dR.LIZ(strLIZ)) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PaymentMethodsData paymentMethodsData = paymentListResponseData.paymentMethodsData;
            if (paymentMethodsData != null) {
                linkedHashMap.put("payment_methods", paymentMethodsData);
            }
            List<PaymentPrice> list4 = paymentListResponseData.paymentPrice;
            if (list4 != null) {
                linkedHashMap.put("payment_price", list4);
            }
            Summary summary = paymentListResponseData.defaultSummary;
            if (summary != null) {
                linkedHashMap.put("default_summary", summary);
            }
            PaymentMethodsData paymentMethodsData2 = paymentListResponseData.paymentMethodsData;
            if (paymentMethodsData2 != null && (list3 = paymentMethodsData2.LIZIZ) != null) {
                linkedHashMap.put("cached_payment_bill_summary_list", list3);
            }
            PaymentMethodsData paymentMethodsData3 = paymentListResponseData.paymentMethodsData;
            if (paymentMethodsData3 != null && (list2 = paymentMethodsData3.LJ) != null) {
                linkedHashMap.put("cached_payment_price_list", list2);
            }
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                linkedHashMap2.put("original_pm", paymentMethod);
                Boolean bool = paymentMethod.LJIIJ;
                if (bool == null || !Intrinsics.LJFF(bool, Boolean.FALSE)) {
                    z = false;
                }
                linkedHashMap2.put("cci_no_installment", Boolean.valueOf(z));
            }
            String str = "";
            if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && (list = paymentMethodInfo.paymentElements) != null) {
                linkedHashMap2.put("payment_elements", list);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<PaymentElement> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = it2.next().paramValue;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList2.add(str2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (C123100dR.LIZ((String) obj)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList.addAll(arrayList3);
            }
            PaymentMethodsData paymentMethodsData4 = paymentListResponseData.paymentMethodsData;
            if (paymentMethodsData4 != null) {
                LIZ.getClass();
                linkedHashMap2.put("payment_methods_local_info", LIZLLL(paymentInfo, paymentMethodsData4));
            }
            String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(linkedHashMap2);
            jSONObject.put("payment_lists_info", new JSONObject(strLJIIIIZZ));
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(payRequest);
            if (strLJI != null) {
                str = strLJI;
            }
            jSONObject.put("oec_pay_info", new JSONObject(str));
            jSONObject.put("extra_info", new JSONObject(strLJIIIIZZ2));
            ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJIILL("pipo_tts_cashier", strLIZ, null, jSONObject, arrayList, null);
        }
    }

    public static void LIZIZ(BillInfoData billInfoData, CreateOrderRequest createOrderRequest, String str, PaymentInfo paymentInfo, String str2) throws JSONException {
        List<PaymentElement> list;
        List<PaymentPrice> list2;
        List<PaymentBillSummary> list3;
        String strLIZ = PipoTTSParamsCheckV2Settings.LIZ("tts_place_order");
        boolean z = true;
        if (strLIZ != null && C123100dR.LIZ(strLIZ)) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
            if (paymentMethodsData != null) {
                linkedHashMap.put("payment_methods", paymentMethodsData);
            }
            List<PaymentBillSummary> list4 = billInfoData.paymentSummary;
            if (list4 != null) {
                linkedHashMap.put("payment_summary", list4);
            }
            Summary summary = billInfoData.summary;
            if (summary != null) {
                linkedHashMap.put("summary", summary);
            }
            PaymentMethodsData paymentMethodsData2 = billInfoData.paymentMethods;
            if (paymentMethodsData2 != null && (list3 = paymentMethodsData2.LIZIZ) != null) {
                linkedHashMap.put("cached_payment_bill_summary_list", list3);
            }
            PaymentMethodsData paymentMethodsData3 = billInfoData.paymentMethods;
            if (paymentMethodsData3 != null && (list2 = paymentMethodsData3.LJ) != null) {
                linkedHashMap.put("cached_payment_price_list", list2);
            }
            String str3 = billInfoData.requestId;
            if (str3 != null) {
                linkedHashMap.put("request_id", str3);
            }
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            PriceInfoRequestParams priceInfoRequestParams = createOrderRequest.priceInfo;
            if (priceInfoRequestParams != null) {
                linkedHashMap2.put("price_info", priceInfoRequestParams);
            }
            Boolean bool = createOrderRequest.isNewPayment;
            if (bool != null) {
                linkedHashMap2.put("is_new_user", Boolean.valueOf(bool.booleanValue()));
            }
            PaymentMethodInfo paymentMethodInfo = createOrderRequest.paymentMethod;
            if (paymentMethodInfo != null) {
                linkedHashMap2.put("payment_method", paymentMethodInfo);
            }
            String str4 = createOrderRequest.redirectUrl;
            if (str4 != null) {
                linkedHashMap2.put("redirect_url", str4);
            }
            String str5 = createOrderRequest.deepLink;
            if (str5 != null) {
                linkedHashMap2.put("deeplink", str5);
            }
            PaymentExtra paymentExtra = createOrderRequest.paymentExtra;
            if (paymentExtra != null) {
                linkedHashMap2.put("payment_extra", paymentExtra);
            }
            List<PaymentMethodPayInfo> list5 = createOrderRequest.paymentMethodCombination;
            if (list5 != null) {
                linkedHashMap2.put("payment_method_combination", list5);
            }
            CommuteType commuteType = createOrderRequest.commuteType;
            if (commuteType != null) {
                linkedHashMap2.put("commute_type", commuteType);
            }
            String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(linkedHashMap2);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            if (paymentInfo != null) {
                PaymentMethod paymentMethod = paymentInfo.paymentMethod;
                if (paymentMethod != null) {
                    linkedHashMap3.put("original_pm", paymentMethod);
                    Boolean bool2 = paymentMethod.LJIIJ;
                    if (bool2 == null || !Intrinsics.LJFF(bool2, Boolean.FALSE)) {
                        z = false;
                    }
                    linkedHashMap3.put("cci_no_installment", Boolean.valueOf(z));
                }
                PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
                if (paymentMethodInfo2 != null && (list = paymentMethodInfo2.paymentElements) != null) {
                    linkedHashMap3.put("payment_elements", list);
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<PaymentElement> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str6 = it2.next().paramValue;
                        if (str6 == null) {
                            str6 = "";
                        }
                        arrayList2.add(str6);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (C123100dR.LIZ((String) obj)) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
            }
            PaymentMethodsData paymentMethodsData4 = billInfoData.paymentMethods;
            if (paymentMethodsData4 != null) {
                LIZ.getClass();
                linkedHashMap3.put("payment_methods_local_info", LIZLLL(paymentInfo, paymentMethodsData4));
            }
            String strLJIIIIZZ3 = C1741890vQh.LJIIIIZZ(linkedHashMap3);
            jSONObject.put("bill_info", new JSONObject(strLJIIIIZZ));
            jSONObject.put("order_create_info", new JSONObject(strLJIIIIZZ2));
            jSONObject.put("extra_info", new JSONObject(strLJIIIIZZ3));
            ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJIILL("pipo_tts_cashier", strLIZ, str, jSONObject, arrayList, str2);
        }
    }
}
