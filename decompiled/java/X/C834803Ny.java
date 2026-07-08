package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.03Ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C834803Ny {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, PaymentMethod paymentMethod, Boolean bool, Boolean bool2, String str2, Long l, String str3, String str4, Boolean bool3, Boolean bool4, Boolean bool5, Long l2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool6, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool7, String str24, String str25, String str26, String str27, String str28, String str29, int i, int i2) {
        Boolean boolIsAvailable;
        String str30 = str5;
        String str31 = str4;
        String str32 = str3;
        String str33 = str2;
        String str34 = str29;
        String str35 = str28;
        String str36 = str26;
        String str37 = str25;
        String str38 = str24;
        String str39 = str23;
        String str40 = str21;
        String str41 = str20;
        String str42 = str19;
        String str43 = str18;
        String str44 = str17;
        String str45 = str15;
        String str46 = str13;
        String str47 = str7;
        String str48 = str12;
        String str49 = str11;
        String str50 = str10;
        String str51 = str8;
        String str52 = str9;
        String str53 = str22;
        String str54 = str14;
        String str55 = str16;
        String str56 = str27;
        String str57 = str6;
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            str33 = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            str32 = null;
        }
        if ((i & 128) != 0) {
            str31 = null;
        }
        if ((i & 256) != 0) {
            bool3 = null;
        }
        if ((i & 512) != 0) {
            bool4 = null;
        }
        if ((i & 1024) != 0) {
            bool5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            l2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str30 = null;
        }
        if ((i & 8192) != 0) {
            str57 = null;
        }
        if ((i & 16384) != 0) {
            str47 = null;
        }
        if ((32768 & i) != 0) {
            str51 = null;
        }
        if ((131072 & i) != 0) {
            str52 = null;
        }
        if ((262144 & i) != 0) {
            str50 = null;
        }
        if ((524288 & i) != 0) {
            str49 = null;
        }
        if ((1048576 & i) != 0) {
            str48 = null;
        }
        if ((2097152 & i) != 0) {
            bool6 = null;
        }
        if ((4194304 & i) != 0) {
            str46 = null;
        }
        if ((8388608 & i) != 0) {
            str54 = null;
        }
        if ((16777216 & i) != 0) {
            str45 = null;
        }
        if ((33554432 & i) != 0) {
            str55 = null;
        }
        if ((67108864 & i) != 0) {
            str44 = null;
        }
        if ((134217728 & i) != 0) {
            str43 = null;
        }
        if ((268435456 & i) != 0) {
            str42 = null;
        }
        if ((536870912 & i) != 0) {
            str41 = null;
        }
        if ((1073741824 & i) != 0) {
            str40 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            str53 = null;
        }
        if ((i2 & 1) != 0) {
            str39 = null;
        }
        if ((i2 & 2) != 0) {
            bool7 = null;
        }
        if ((i2 & 4) != 0) {
            str38 = null;
        }
        if ((i2 & 8) != 0) {
            str37 = null;
        }
        if ((i2 & 16) != 0) {
            str36 = null;
        }
        if ((i2 & 32) != 0) {
            str56 = null;
        }
        if ((i2 & 64) != 0) {
            str35 = null;
        }
        if ((i2 & 128) != 0) {
            str34 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stage", str);
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (bool3 != null) {
            linkedHashMap.put("is_poll_order", C893803eS.LIZ(bool3.booleanValue()));
        }
        if (bool4 != null) {
            linkedHashMap.put("is_three_order_campaign", C893803eS.LIZ(bool4.booleanValue()));
        }
        if (paymentMethod != null) {
            String str58 = paymentMethod.id;
            if (str58 != null) {
                linkedHashMap.put("payment_method_id", str58);
            }
            linkedHashMap.put("pay_type", paymentMethod.LJJIIZ());
            Availability availability = paymentMethod.availability;
            if (availability != null && (boolIsAvailable = availability.isAvailable()) != null) {
                linkedHashMap.put("pay_available", C893803eS.LIZ(boolIsAvailable.booleanValue()));
            }
        }
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", C893803eS.LIZ(bool.booleanValue()));
        }
        if (bool2 != null) {
            linkedHashMap.put("pay_is_bound", C893803eS.LIZ(bool2.booleanValue()));
        }
        if (str33 != null) {
            linkedHashMap.put("pay_route", str33);
        }
        if (l != null) {
            linkedHashMap.put("duration", Long.valueOf(l.longValue()));
        }
        if (str32 != null) {
            linkedHashMap.put("tenure", str32);
        }
        if (str31 != null) {
            linkedHashMap.put("installment_plan_id", str31);
        }
        if (bool5 != null) {
            linkedHashMap.put("pay_success", C893803eS.LIZ(bool5.booleanValue()));
        }
        if (l2 != null) {
            linkedHashMap.put("osp_ts", String.valueOf(l2.longValue()));
        }
        if (str30 != null) {
            linkedHashMap.put("error_code", str30);
        }
        if (str57 != null) {
            linkedHashMap.put("log_id", str57);
        }
        if (str47 != null) {
            linkedHashMap.put("price_total", str47);
        }
        if (str51 != null) {
            linkedHashMap.put("summary", str51);
        }
        if (str52 != null) {
            linkedHashMap.put("page_name", str52);
        }
        if (str50 != null) {
            linkedHashMap.put("pay_elements", str50);
        }
        if (str49 != null) {
            linkedHashMap.put("credit_amount", str49);
        }
        if (str48 != null) {
            linkedHashMap.put("remained_amount", str48);
        }
        if (bool6 != null) {
            linkedHashMap.put("is_credit_pay", C893803eS.LIZ(bool6.booleanValue()));
        }
        if (str46 != null) {
            linkedHashMap.put("total_amount_before", str46);
        }
        if (str54 != null) {
            linkedHashMap.put("total_amount", str54);
        }
        if (str45 != null) {
            linkedHashMap.put("pay_result", str45);
        }
        if (str55 != null) {
            linkedHashMap.put("pay_scene", str55);
        }
        if (str44 != null) {
            linkedHashMap.put("pay_url", str44);
        }
        if (str43 != null) {
            linkedHashMap.put("pay_error_code", str43);
        }
        if (str42 != null) {
            linkedHashMap.put("order_id", str42);
        }
        if (str41 != null) {
            linkedHashMap.put("pay_commute_type", str41);
        }
        if (str40 != null) {
            linkedHashMap.put("primary_payment_method_id", str40);
        }
        if (str53 != null) {
            linkedHashMap.put("consultation_id", str53);
        }
        if (str39 != null) {
            linkedHashMap.put("payment_price_param", str39);
        }
        if (bool7 != null) {
            linkedHashMap.put("sdk_enable", Boolean.valueOf(bool7.booleanValue()));
        }
        if (str38 != null) {
            linkedHashMap.put("anchor_tenure", str38);
        }
        if (str37 != null) {
            linkedHashMap.put("anchor_installment_plan_id", str37);
        }
        if (str36 != null) {
            linkedHashMap.put("error_msg", str36);
        }
        if (str56 != null) {
            linkedHashMap.put("error_type", str56);
        }
        if (str35 != null) {
            linkedHashMap.put("action_type", str35);
        }
        if (str34 != null) {
            linkedHashMap.put("url", str34);
        }
        C1018503yZ.LIZIZ("rd_pipo_payment_process", linkedHashMap, false);
        C921903iz.LIZ.getClass();
        C921903iz.LIZIZ(4, linkedHashMap, "rd_pipo_payment_process");
    }
}
