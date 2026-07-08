package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIInstallmentPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIInstallmentPlanAvailability;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPromotion;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709620uae {
    public final String LIZ;
    public final List<String> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();

    public C1709620uae(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map LIZ(C1709570uaZ c1709570uaZ, PaymentOption paymentOption) {
        String str;
        boolean z;
        Object[] objArr;
        PaymentOption paymentOptionLJJI;
        PODaInfo pODaInfo;
        String str2;
        PODaInfo pODaInfo2;
        String str3;
        String str4;
        if (paymentOption == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PaymentOption paymentOptionLIZLLL = c1709570uaZ.LJIILIIL.LIZLLL(paymentOption.LIZ);
        String strLJIL = paymentOption.LJIL();
        String str5 = "";
        if (strLJIL == null) {
            strLJIL = "";
        }
        linkedHashMap.put("payment_method_id", strLJIL);
        if (paymentOptionLIZLLL != null) {
            str = "sub_payment_type";
        } else {
            str = "payment_type";
        }
        linkedHashMap.put("option_type", str);
        PODaInfo pODaInfo3 = paymentOption.trackInfo;
        if (pODaInfo3 != null && (str4 = pODaInfo3.optionName) != null) {
            str5 = str4;
        }
        linkedHashMap.put("option_name", str5);
        linkedHashMap.put("status_code", String.valueOf(paymentOption.statusAttr.available ? 1 : 0));
        linkedHashMap.put("pay_bind_status", String.valueOf(paymentOption.LIZ().getValue()));
        PODaInfo pODaInfo4 = paymentOption.trackInfo;
        if (pODaInfo4 != null && Intrinsics.LJFF(pODaInfo4.isPIValue, "pi")) {
            z = true;
        } else {
            z = false;
        }
        String str6 = "1";
        if (z) {
            objArr = "1";
        } else {
            objArr = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_pay_saved", objArr);
        if (paymentOptionLIZLLL != null && (pODaInfo2 = paymentOptionLIZLLL.trackInfo) != null && (str3 = pODaInfo2.optionName) != null && C123100dR.LIZ(str3)) {
            linkedHashMap.put("parent_option_name", str3);
        }
        PODaInfo pODaInfo5 = paymentOption.trackInfo;
        if ((pODaInfo5 == null || pODaInfo5.bankCode == null) && (paymentOptionLJJI = paymentOption.LJJI(c1709570uaZ)) != null && (pODaInfo = paymentOptionLJJI.trackInfo) != null && (str2 = pODaInfo.bankCode) != null && C123100dR.LIZ(str2)) {
            linkedHashMap.put("bank_code", str2);
        }
        linkedHashMap.put("is_option_discounted", CardStruct.IStatusCode.DEFAULT);
        if (paymentOption.displayInfo.paymentPromotions == null || !(!r0.isEmpty())) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_payment_promoted", str6);
        return linkedHashMap;
    }

    public static Map LIZIZ(PaymentOption paymentOption, String str) {
        String str2;
        PODaInfo pODaInfo;
        String str3;
        List<POPromotion> list;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("option_type", "payment_type");
        if (paymentOption != null && (list = paymentOption.displayInfo.paymentPromotions) != null && (!list.isEmpty())) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_payment_promoted", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (paymentOption != null && (pODaInfo = paymentOption.trackInfo) != null && (str3 = pODaInfo.optionName) != null) {
            mapLJIIJ.put("option_name", str3);
        }
        if (str != null) {
            mapLJIIJ.put("button_type", str);
        }
        if (paymentOption != null) {
            if (paymentOption.LJIJ() || paymentOption.LJIIZILJ()) {
                mapLJIIJ.put("payment_option", "Credit Pay");
            }
            mapLJIIJ.put("pay_bind_status", String.valueOf(paymentOption.LIZ().getValue()));
        }
        return mapLJIIJ;
    }

    public static void LIZLLL(C1709620uae c1709620uae, String str, String str2, PaymentOption paymentOption) {
        c1709620uae.getClass();
        C1708610uZ1.LIZIZ(c1709620uae.LIZ).LJIIL(str2, str, Boolean.TRUE, LIZIZ(paymentOption, null));
    }

    public static void LJI(C1709620uae c1709620uae, C1709570uaZ c1709570uaZ, String str, int i, PaymentOption paymentOption) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!((ArrayList) c1709620uae.LIZIZ).contains(paymentOption.LIZ)) {
            ((ArrayList) c1709620uae.LIZIZ).add(paymentOption.LIZ);
            c1709620uae.LJII("tiktokls_option_show", c1709570uaZ, str, i, paymentOption, null, linkedHashMap);
        }
    }

    public static void LJFF(C1709620uae c1709620uae, C1709570uaZ c1709570uaZ, String str, int i, PaymentOption paymentOption, boolean z) {
        c1709620uae.LJII("tiktokls_select_option", c1709570uaZ, str, i, paymentOption, Boolean.valueOf(z), new LinkedHashMap());
    }

    public final void LJ(C1709570uaZ c1709570uaZ, String str, int i, PaymentOption paymentOption, CBIInstallmentPlan cBIInstallmentPlan, boolean z) {
        String string;
        String[] strArr = new String[4];
        strArr[0] = paymentOption.LIZ;
        Long l = cBIInstallmentPlan.tenure;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        String str2 = "";
        if (string == null) {
            string = "";
        }
        strArr[1] = string;
        String str3 = cBIInstallmentPlan.installmentPlanId;
        if (str3 == null) {
            str3 = "";
        }
        strArr[2] = str3;
        String str4 = cBIInstallmentPlan.installmentOptionId;
        if (str4 != null) {
            str2 = str4;
        }
        strArr[3] = str2;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "#", null, null, 0, null, null, 62);
        if (((ArrayList) this.LIZJ).contains(strLJJLIIIJ)) {
            return;
        }
        ((ArrayList) this.LIZJ).add(strLJJLIIIJ);
        LIZJ("tiktokls_option_show", c1709570uaZ, str, i, paymentOption, cBIInstallmentPlan, Boolean.valueOf(Intrinsics.LJFF(cBIInstallmentPlan.isDefault, Boolean.TRUE)), Boolean.valueOf(z), null, null);
    }

    public final void LJII(String str, C1709570uaZ c1709570uaZ, String str2, int i, PaymentOption paymentOption, Boolean bool, Map<String, String> map) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", str2);
        linkedHashMap.put("rank", String.valueOf(i + 1));
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_default", str3);
        }
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(LIZ(c1709570uaZ, paymentOption));
        C1708610uZ1.LIZIZ(this.LIZ).LIZ(str, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(String str, C1709570uaZ c1709570uaZ, String str2, int i, PaymentOption paymentOption, CBIInstallmentPlan cBIInstallmentPlan, Boolean bool, Boolean bool2, String str3, String str4) {
        String str5;
        String str6;
        Object[] objArr;
        String str7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ(c1709570uaZ, paymentOption));
        linkedHashMap.put("page_name", str2);
        linkedHashMap.put("rank", String.valueOf(i + 1));
        linkedHashMap.put("option_type", "installment_plan");
        String str8 = cBIInstallmentPlan.displayRawName;
        String str9 = "";
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("option_name", str8);
        PIPOPaymentMethod pIPOPaymentMethod = paymentOption.legacyPM;
        if (pIPOPaymentMethod != null && (str7 = pIPOPaymentMethod.rawCBIPaymentMethod) != null) {
            str9 = str7;
        }
        linkedHashMap.put("payment_method", str9);
        linkedHashMap.put("status_code", String.valueOf(cBIInstallmentPlan.LIZ() ? 1 : 0));
        Long l = cBIInstallmentPlan.tenure;
        if (l != null) {
            linkedHashMap.put("tenure", String.valueOf(l.longValue()));
        }
        String str10 = cBIInstallmentPlan.installmentPlanId;
        if (str10 != null && C123100dR.LIZ(str10)) {
            linkedHashMap.put("installment_plan_id", str10);
        }
        String str11 = cBIInstallmentPlan.installmentOptionId;
        if (str11 != null && C123100dR.LIZ(str11)) {
            linkedHashMap.put("installment_option_id", str11);
        }
        String str12 = "1";
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                objArr = "1";
            } else {
                objArr = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_default", objArr);
        }
        if (bool2 != null) {
            bool2.booleanValue();
            if (!bool2.booleanValue()) {
                str12 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_selected", str12);
        }
        CBIInstallmentPlanAvailability cBIInstallmentPlanAvailability = cBIInstallmentPlan.availability;
        if (cBIInstallmentPlanAvailability != null && (str6 = cBIInstallmentPlanAvailability.status) != null && C123100dR.LIZ(str6)) {
            linkedHashMap.put("installment_availability_status", str6);
        }
        CBIInstallmentPlanAvailability cBIInstallmentPlanAvailability2 = cBIInstallmentPlan.availability;
        if (cBIInstallmentPlanAvailability2 != null && (str5 = cBIInstallmentPlanAvailability2.unavailableReason) != null && C123100dR.LIZ(str5)) {
            linkedHashMap.put("installment_unavailable_reason", str5);
        }
        if (str3 != null) {
            linkedHashMap.put("result", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("fail_reason", str4);
        }
        C1708610uZ1.LIZIZ(this.LIZ).LIZ(str, linkedHashMap);
    }
}
