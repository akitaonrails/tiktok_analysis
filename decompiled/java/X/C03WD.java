package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS0S6300000_1;
import kotlin.jvm.internal.AwS17S2200000_1;
import kotlin.jvm.internal.AwS1S3200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03WD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WD {
    public static String LIZ(EnterParams enterParams) {
        Object next;
        PaymentMethodsData paymentMethodsData = enterParams.paymentData;
        if (paymentMethodsData == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) PaymentMethodsData.LJFF(paymentMethodsData, false, false, 15)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                PaymentMethod paymentMethod = (PaymentMethod) next;
                if (Intrinsics.LJFF(paymentMethod.id, "pm_pi_ins_pipobnpl_c_d") && !paymentMethod.LJJJJJL()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) next;
        if (paymentMethod2 == null) {
            return null;
        }
        if (Intrinsics.LJFF(paymentMethod2.isChooseRecommend, Boolean.TRUE)) {
            return "authorized_and_pre_selected";
        }
        return "authorized_not_pre_selected";
    }

    public static void LJIIL(PaymentMethod paymentMethod) {
        C03WH.LJIILIIL = paymentMethod;
    }

    public static void LJIILIIL(PaymentMethod paymentMethod) {
        C03WH.LJIILJJIL = paymentMethod;
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C1018703yb.LIZLLL("rd_tiktokec_pay_error", new C03WF(str, str2, str3));
    }

    public static void LJI(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("type", str);
        map.put("message", str2);
        if (str3 != null) {
            map.put("extra", str3);
        }
        C1018703yb.LIZIZ("rd_pipo_tts_cashier_debug", map);
    }

    public static void LIZIZ(Boolean bool, String str, String str2, Long l) {
        C1018703yb.LIZLLL("rd_tiktokec_pay_redirect_blank", new AwS17S2200000_1(bool, str, str2, l, 1));
    }

    public static void LJIIJ(Boolean bool, Long l, String str, String str2) {
        C1018703yb.LIZLLL("rd_tiktokec_sdk_time", new AwS1S3200000_1(l, str, (String) null, str2, bool, 0));
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4, String str5) {
        C1018703yb.LIZLLL("rd_tiktokec_toast_show", new C03W3(str, str2, str3, str4, str5));
    }

    public static void LJFF(String str, String str2, String str3, String str4, Map map, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str2 == null) {
            str2 = "payment_method";
        }
        linkedHashMap.put("page_name", str2);
        linkedHashMap.put("popup_name", str);
        if (str3 != null) {
            linkedHashMap.put("action_type", str3);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (str4 != null) {
            linkedHashMap.put("pay_type", str4);
        }
        C1018703yb.LIZIZ("tiktokec_popup_click", linkedHashMap);
    }

    public static void LJ(String str, String str2, Integer num, String str3, String str4, String str5, Map map, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str5 == null) {
            str5 = "payment_method";
        }
        linkedHashMap.put("page_name", str5);
        linkedHashMap.put("popup_name", str);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (str2 != null) {
            linkedHashMap.put("pay_type", str2);
        }
        if (num != null) {
            linkedHashMap.put("installment_cnt", Integer.valueOf(num.intValue()));
        }
        if (str3 != null) {
            linkedHashMap.put("entrance_info", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("previous_page", str4);
        }
        C1018703yb.LIZIZ("tiktokec_popup_show", linkedHashMap);
    }

    public static void LJII(String str, Long l, String str2, String str3, Boolean bool, String str4, CommuteType commuteType, String str5, String str6) {
        C1018703yb.LIZLLL("rd_tiktokec_pay_result", new AwS0S6300000_1(str, l, str2, str3, bool, str4, commuteType, str5, str6, 0));
        C1018703yb.LIZLLL("rd_tiktokec_pay_result_v2", new AwS0S6300000_1(str, l, str2, str3, bool, str4, commuteType, str5, str6, 1));
    }

    public static void LIZJ(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C1018703yb.LIZLLL("rd_tiktokec_page_load_duration", new C03WE(j2, j, str, str2, str3, str4, str6, str5, str7, z));
    }

    public static void LJIIIIZZ(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C1018703yb.LIZLLL("rd_tiktokec_request_duration", new C03W2(str, str2, j, str3, str4, str5, str6, str7, str8, str9, str10));
    }
}
