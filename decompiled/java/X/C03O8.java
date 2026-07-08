package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.03O8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03O8 {
    public static final LinkedHashMap<String, Object> LIZ;

    static {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        LIZ = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "payment_method");
    }

    public static void LIZ(String str, String str2, Boolean bool, HashMap map, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, String str8, Boolean bool4, Boolean bool5, CommuteType commuteType, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool6, String str17, String str18, String str19, Boolean bool7, Boolean bool8, String str20, String str21, Boolean bool9) {
        String strLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        if (str != null) {
            linkedHashMap.put("payment_method_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("pay_type", str2);
        }
        if (bool != null) {
            linkedHashMap.put("is_credit_pay", C893803eS.LIZ(bool.booleanValue()));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (bool2 != null) {
            linkedHashMap.put("is_edit_pay_method", C893803eS.LIZ(bool2.booleanValue()));
        }
        linkedHashMap.put("page_name", str3);
        if (bool3 != null) {
            linkedHashMap.put("is_create_order", C893803eS.LIZ(bool3.booleanValue()));
        }
        if (str4 != null) {
            linkedHashMap.put("pay_bind_status", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("total_price_value", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("tenure", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("installment_plan_id", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("remote_installment_info", str8);
        }
        if (bool4 != null) {
            bool4.booleanValue();
            linkedHashMap.put("is_one_click_pay", C893803eS.LIZ(bool4.booleanValue()));
        }
        if (bool5 != null) {
            bool5.booleanValue();
            linkedHashMap.put("is_pay_saved", C893803eS.LIZ(bool5.booleanValue()));
        }
        if (commuteType != null) {
            linkedHashMap.put("pay_commute_type", commuteType);
        }
        if (str9 != null) {
            linkedHashMap.put("pay_request_id", str9);
        }
        if (str10 != null) {
            linkedHashMap.put("credit_amount", str10);
        }
        if (str11 != null) {
            linkedHashMap.put("remained_amount", str11);
        }
        if (str12 != null) {
            linkedHashMap.put("deeplink_url", str12);
        }
        if (str13 != null) {
            linkedHashMap.put("redirect_url", str13);
        }
        if (str14 != null) {
            linkedHashMap.put("consultation_id", str14);
        }
        linkedHashMap.put("installment_available", str15);
        if (str17 != null) {
            linkedHashMap.put("remote_payment_available", str17);
            if (bool6 != null) {
                strLIZ = C893803eS.LIZ(bool6.booleanValue());
            } else {
                strLIZ = "";
            }
            linkedHashMap.put("current_payment_available", strLIZ);
            linkedHashMap.put("payment_available", str16);
        }
        if (str18 != null) {
            linkedHashMap.put("package_name", str18);
        }
        if (str19 != null) {
            linkedHashMap.put("payment_extra_info", str19);
        }
        if (bool7 != null) {
            bool7.booleanValue();
            linkedHashMap.put("is_payment_promoted", C893803eS.LIZ(bool7.booleanValue()));
        }
        if (bool8 != null) {
            bool8.booleanValue();
            linkedHashMap.put("is_installment_promoted", C893803eS.LIZ(bool8.booleanValue()));
        }
        if (str20 != null) {
            linkedHashMap.put("payment_params", str20);
        }
        if (str21 != null) {
            linkedHashMap.put("invisible_params", str21);
        }
        if (bool9 != null) {
            linkedHashMap.put("is_inactivate", C893803eS.LIZ(bool9.booleanValue()));
        }
        C1018703yb.LIZIZ("rd_pipo_second_pay_params_debug", linkedHashMap);
    }
}
