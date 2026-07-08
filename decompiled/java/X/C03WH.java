package X;

import android.os.SystemClock;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsAddCardRiskControlSettingSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03WH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WH {
    public static final String[] LJIIJJI;
    public static final String[] LJIIL;
    public static PaymentMethod LJIILIIL;
    public static PaymentMethod LJIILJJIL;
    public final LinkedHashMap<String, Object> LIZ;
    public final EnterParams LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final C03WI LJFF;
    public long LJI;
    public long LJII;
    public final Map<String, Long> LJIIIIZZ;
    public boolean LJIIIZ;
    public final Map<String, Long> LJIIJ;

    static {
        String str;
        new C03WD();
        String[] strArr = new String[4];
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            while (true) {
                strArr[i2] = str;
                i2++;
                if (i2 >= 4) {
                    break loop0;
                } else {
                    str = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ",card_holder" : ",code" : ",date" : ",card_number";
                }
            }
        }
        LJIIJJI = strArr;
        String[] strArr2 = new String[4];
        do {
            strArr2[i] = LJIIJJI[i];
            i++;
        } while (i < 4);
        LJIIL = strArr2;
    }

    public C03WH(EnterParams enterParams) {
        String str;
        Object obj;
        Object obj2;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.LIZ = linkedHashMap;
        this.LIZIZ = enterParams;
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
        this.LJFF = new C03WI();
        this.LJIIIIZZ = new LinkedHashMap();
        this.LJIIJ = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("is_fullscreen", Integer.valueOf(!enterParams.LIZ ? 1 : 0));
        HashMap<String, Object> map = enterParams.trackParams;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (enterParams.LIZLLL()) {
            str = "payment_retry";
        } else if (C03WK.LIZ(enterParams)) {
            str = "split_payment";
        } else if (enterParams.LJJIJIIJI == EnumC837803Pc.OCP_PANEL) {
            str = "pay_express_checkout";
        } else if (enterParams.LJJIJ) {
            str = "pay_later_second_confirm";
        } else {
            str = "payment_method";
        }
        linkedHashMap.put("page_name", str);
        HashMap<String, Object> map2 = enterParams.trackParams;
        if (map2 != null && (obj2 = map2.get("cashier_original_track_id")) != null) {
            linkedHashMap.put("cashier_original_track_id", obj2.toString());
        }
        HashMap<String, Object> map3 = enterParams.trackParams;
        if (map3 != null && (obj = map3.get("rendering_num")) != null) {
            linkedHashMap.put("rendering_num", obj.toString());
        }
    }

    public static String LJJI(String str) {
        if (Intrinsics.LJFF(str, "expiration_date")) {
            return "date";
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public static String LJJIFFI(EnterParams enterParams) {
        Object obj;
        HashMap<String, Object> map = enterParams.trackParams;
        if (map == null || (obj = map.get("previous_page")) == null) {
            obj = "subscribe_and_save_order_detail";
        }
        String string = obj.toString();
        if (!C897503f3.LJI(enterParams)) {
            return "order_submit";
        }
        return string;
    }

    public final long LIZ(String str) {
        Long l = (Long) ((LinkedHashMap) this.LJIIJ).get(str);
        if (l != null) {
            long jLongValue = l.longValue();
            this.LJIIJ.remove(str);
            return SystemClock.elapsedRealtime() - jLongValue;
        }
        return 0L;
    }

    public final String LIZIZ(EnterParams enterParams) {
        if (enterParams == null) {
            enterParams = this.LIZIZ;
        }
        PaymentMethodsData paymentMethodsData = enterParams.paymentData;
        int i = 0;
        if (paymentMethodsData != null && paymentMethodsData.LJJI()) {
            i = 1;
        }
        return String.valueOf(i);
    }

    public final void LJI(PaymentMethod paymentMethod) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", "balance_tool_tips");
        linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
        linkedHashMap.put("option_type", "payment_type");
        C1018703yb.LIZIZ("tiktokec_button_click", linkedHashMap);
    }

    public final void LJII(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", str);
        LJJII("tiktokec_button_show", linkedHashMap);
    }

    public final void LJIIIIZZ(PaymentMethod paymentMethod) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
        linkedHashMap.put("option_type", "payment_type");
        LJJII("tiktokec_button_click", linkedHashMap);
    }

    public final void LJIIIZ(PaymentMethod paymentMethod) {
        if (((ArrayList) this.LJ).contains(paymentMethod.LJIIJ())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
        linkedHashMap.put("option_type", "payment_type");
        LJJII("tiktokec_button_show", linkedHashMap);
        ((ArrayList) this.LJ).add(paymentMethod.LJIIJ());
    }

    public final void LJJIII(Map<String, ? extends Object> map) {
        if (PipoTtsAddCardRiskControlSettingSettings.LIZIZ) {
            C1018703yb.LIZIZ("rd_pipo_add_card_risk_info", C2097608Jq.LJIIL(C2097608Jq.LJIIL(this.LIZ, map), C2097908Jt.LIZJ(new Pair("pipo_ts", Long.valueOf(System.currentTimeMillis())))));
        }
    }

    public final void LJJIIJ(String str) {
        this.LJIIJ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LJJII(String str, Map map) {
        C1018703yb.LIZIZ(str, map);
        C921903iz.LIZ.getClass();
        C921903iz.LIZIZ(4, map, str);
    }

    public final void LIZJ(EnterParams enterParams, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("input_box_name", str);
        if (enterParams != null) {
            if (!enterParams.LIZ) {
                str2 = "full_screen";
            } else {
                str2 = "seven_screen";
            }
            linkedHashMap.put("page_show_type", str2);
            linkedHashMap.put("source_previous_page", "order_submit");
            String str3 = enterParams.LJI;
            if (str3 != null) {
                linkedHashMap.put("trigger_event", str3);
            }
        }
        LJJII("tiktokec_input_click", linkedHashMap);
    }

    public final void LJFF(PaymentMethod paymentMethod, String str) {
        String str2;
        if (((ArrayList) this.LIZLLL).contains(paymentMethod.LJIIJ())) {
            return;
        }
        String strLJJIIZ = paymentMethod.LJJIIZ();
        boolean zLIZ = C770702zh.LIZ(paymentMethod.extraInfo);
        BindInfo bindInfo = paymentMethod.bindInfo;
        String str3 = null;
        if (bindInfo != null) {
            str2 = bindInfo.bindStatus;
        } else {
            str2 = null;
        }
        if (str == null) {
            Availability availability = paymentMethod.availability;
            if (availability != null) {
                str3 = availability.statusCode;
            }
            if (Intrinsics.LJFF(str3, "16")) {
                str = "reactivate";
            } else {
                str = "active_now";
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("button_type", "confirm");
        linkedHashMap.put("payment_option", strLJJIIZ);
        linkedHashMap.put("is_option_discounted", Integer.valueOf(zLIZ ? 1 : 0));
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("pay_bind_status", str2);
        }
        String strLJIJJ = paymentMethod.LJIJJ(false);
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
        String str4 = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        linkedHashMap.put("promotion_info", strLJIJJ);
        String strLJIJ = paymentMethod.LJIJ();
        if (strLJIJ != null) {
            str4 = strLJIJ;
        }
        linkedHashMap.put("marketing_batch_id", str4);
        LJJII("tiktokec_button_show", linkedHashMap);
    }

    public final void LJJ(PaymentMethod paymentMethod, String str, boolean z) {
        String str2;
        CreditInfo creditInfo;
        PaymentMethod paymentMethod2;
        boolean zLJFF;
        String str3;
        boolean zLJFF2 = false;
        if (paymentMethod == null || (str2 = paymentMethod.id) == null || str2.length() <= 0) {
            PaymentMethodsData paymentMethodsData = this.LIZIZ.paymentData;
            if (paymentMethodsData != null && (creditInfo = paymentMethodsData.creditInfo) != null && (paymentMethod2 = creditInfo.creditPaymentMethod) != null && Intrinsics.LJFF(paymentMethod2.LJJIIZ(), str)) {
                str2 = paymentMethod2.id;
            } else {
                str2 = null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("page_name", "payment_method");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("option_name", str);
        linkedHashMap.put("rank", 0);
        linkedHashMap.put("option_type", "payment_type");
        if (str2 != null) {
            linkedHashMap.put("payment_method_id", str2);
        }
        if (paymentMethod != null) {
            zLJFF = Intrinsics.LJFF(paymentMethod.isChooseRecommend, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        linkedHashMap.put("is_default", C893803eS.LIZ(zLJFF));
        if (z) {
            str3 = "open";
        } else {
            str3 = "close";
        }
        linkedHashMap.put("select_type", str3);
        C03WI c03wi = this.LJFF;
        if (paymentMethod != null) {
            zLJFF2 = Intrinsics.LJFF(paymentMethod.isChooseRecommend, Boolean.TRUE);
        }
        c03wi.LIZ(linkedHashMap, new C03WJ(str2, paymentMethod, null, zLJFF2), z, false, null, true);
        LJJII("tiktokec_select_option", linkedHashMap);
    }

    public final void LIZLLL(long j, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("input_method", str2);
        if (str3 != null) {
            linkedHashMap.put("option_name", str3);
        }
        LJJII("tiktokec_input_staytime", linkedHashMap);
    }

    public final void LJIIJJI(String str, String str2, long j, Integer num, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = this.LIZ.get("EVENT_ORIGIN_FEATURE");
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", obj);
        Object obj3 = this.LIZ.get("entrance_info");
        if (obj3 != null) {
            obj2 = obj3;
        }
        linkedHashMap.put("entrance_info", obj2);
        linkedHashMap.put("page_name", "payment_method");
        linkedHashMap.put("previous_page", "order_submit");
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(j));
        if (num != null) {
            num.intValue();
            linkedHashMap.put("ocr_mode", C893803eS.LIZIZ(num.intValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("is_valid", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("if_same_with_last_auto_result", str3);
        }
        LJJII("tiktokec_scan_result", linkedHashMap);
    }

    public final void LJIIJ(EnterParams enterParams, Boolean bool, String str, String str2, String str3, boolean z) {
        if (Intrinsics.LJFF(str3, str2)) {
            return;
        }
        LJIILIIL(enterParams, bool, str, str2, "card_number_ocr", null, z);
        LIZLLL(LIZ(str2), str2, "card_number_ocr", null);
    }

    public final void LJIILIIL(EnterParams enterParams, Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        String strLIZ;
        String str5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        if (str != null) {
            linkedHashMap.put("option_name", str);
        }
        linkedHashMap.put("is_valid", Integer.valueOf(z ? 1 : 0));
        if (str2 != null) {
            linkedHashMap.put("input_name", str2);
        }
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("input_method", str3);
        if (bool != null) {
            strLIZ = C893803eS.LIZ(bool.booleanValue());
        } else {
            strLIZ = "-1";
        }
        linkedHashMap.put("if_same_with_last_auto_result", strLIZ);
        if (str4 != null) {
            linkedHashMap.put("option_name", str4);
        }
        if (enterParams != null) {
            if (!enterParams.LIZ) {
                str5 = "full_screen";
            } else {
                str5 = "seven_screen";
            }
            linkedHashMap.put("page_show_type", str5);
            linkedHashMap.put("source_previous_page", "order_submit");
            String str6 = enterParams.LJI;
            if (str6 != null) {
                linkedHashMap.put("trigger_event", str6);
            }
        }
        LJJII("tiktokec_input_result", linkedHashMap);
    }

    public static void LJ(C03WH c03wh, String str, Boolean bool, String str2, Boolean bool2, PaymentMethod paymentMethod, String str3, int i) {
        String strLJIJ;
        String strLJIJJ = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i & 16) != 0) {
            paymentMethod = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        c03wh.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03wh.LIZ);
        if (str3 == null) {
            if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                str3 = "reactivate";
            } else {
                str3 = "active_now";
            }
        }
        linkedHashMap.put("button_name", str3);
        linkedHashMap.put("button_type", "confirm");
        if (str != null) {
            linkedHashMap.put("payment_option", str);
        }
        if (bool != null) {
            linkedHashMap.put("is_option_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("pay_bind_status", str2);
        }
        if (paymentMethod != null) {
            strLJIJJ = paymentMethod.LJIJJ(false);
        }
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
        String str4 = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        linkedHashMap.put("promotion_info", strLJIJJ);
        if (paymentMethod != null && (strLJIJ = paymentMethod.LJIJ()) != null) {
            str4 = strLJIJ;
        }
        linkedHashMap.put("marketing_batch_id", str4);
        LJJII("tiktokec_button_click", linkedHashMap);
    }

    public final void LJIIZILJ(String str, boolean z, String str2, String str3, String str4, Integer num, String str5, String str6, Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        C038N.LIZ(linkedHashMap, map);
        if (str != null) {
            linkedHashMap.put("pay_type", str);
        }
        if (str2 != null && str2.length() != 0) {
            linkedHashMap.put("pay_bind_status", str2);
        }
        linkedHashMap.put("is_pay_saved", Integer.valueOf(z ? 1 : 0));
        if (str3 != null) {
            linkedHashMap.put("total_payment", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("installment_cnt", str4);
        }
        if (num != null) {
            linkedHashMap.put("is_credit_pay", Integer.valueOf(num.intValue()));
        }
        if (str5 != null) {
            linkedHashMap.put("primary_pay_type", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("combination_payment_available", str6);
        }
        LJJII("tiktokec_pay_order", linkedHashMap);
    }

    public final void LJIJI(String str, PaymentMethod paymentMethod, boolean z, Boolean bool, String str2, Integer num, Integer num2, Map<String, ? extends Object> map, EnterParams enterParams) {
        String str3;
        this.LJI = SystemClock.elapsedRealtime() - this.LJII;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("stay_time", Long.valueOf(this.LJI));
        linkedHashMap.put("is_load_data", 1);
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("is_card_save", Integer.valueOf(z ? 1 : 0));
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_use_ocr", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str2 != null) {
            linkedHashMap.put("is_edit_ocr_result", str2);
        }
        if (num != null) {
            num.intValue();
            linkedHashMap.put("ocr_mode", C893803eS.LIZIZ(num.intValue()));
        }
        if (paymentMethod != null) {
            linkedHashMap.put("pay_type", paymentMethod.LJJIIZ());
        }
        if (num2 != null) {
            linkedHashMap.put("is_credit_select", Integer.valueOf(num2.intValue()));
        }
        if (!enterParams.LIZ) {
            str3 = "full_screen";
        } else {
            str3 = "seven_screen";
        }
        linkedHashMap.put("page_show_type", str3);
        linkedHashMap.put("source_previous_page", LJJIFFI(enterParams));
        String str4 = enterParams.LJI;
        if (str4 != null) {
            linkedHashMap.put("trigger_event", str4);
        }
        if (map != null) {
            C038N.LIZ(linkedHashMap, map);
        }
        LJJII("tiktokec_stay_page", linkedHashMap);
    }

    public final void LJIJJLI(String str, String str2, int i, boolean z, String str3, Boolean bool, InstallmentPlan installmentPlan, String str4, PaymentMethod paymentMethod, EnterParams enterParams, Boolean bool2, String str5) {
        Object obj;
        String str6;
        Object obj2;
        int iIntValue;
        String promotionBatchId;
        String str7;
        Map<String, Object> mapLIZ;
        String desc;
        Map<String, Object> mapConstructDaInfo;
        Map<String, Object> mapConstructDaInfo2;
        Integer num;
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        String str8;
        String str9;
        Object obj3;
        String string;
        String string2;
        Object obj4;
        Object obj5;
        String priceStr;
        String str10 = str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("parent_option_name", str);
        linkedHashMap.put("option_name", str2);
        linkedHashMap.put("option_type", "sub_payment_type");
        linkedHashMap.put("is_pre_credit", LIZIZ(enterParams));
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("rank", Integer.valueOf(i));
        if (str3 != null && str3.length() != 0) {
            linkedHashMap.put("status_code", str3);
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            linkedHashMap.put("is_default", 1);
        }
        String str11 = "";
        if (installmentPlan != null) {
            Amount amount = installmentPlan.totalFee;
            if (amount == null || (priceStr = amount.getPriceStr()) == null) {
                priceStr = "";
            }
            linkedHashMap.put("service_fee", priceStr);
            String str12 = installmentPlan.tenure;
            if (str12 == null) {
                str12 = "";
            }
            linkedHashMap.put("installment_cnt", str12);
            if (str10 == null) {
                str10 = "";
            }
            linkedHashMap.put("total_payment", str10);
            Map<String, Object> mapLIZ2 = installmentPlan.LIZ();
            if (mapLIZ2 != null) {
                linkedHashMap.putAll(mapLIZ2);
            }
        }
        if (paymentMethod != null) {
            String strLJIJJ = paymentMethod.LJIJJ(false);
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
            if (strLJIJJ == null) {
                strLJIJJ = "";
            }
            linkedHashMap.put("promotion_info", strLJIJJ);
            String strLJIJ = paymentMethod.LJIJ();
            if (strLJIJ == null) {
                strLJIJ = "";
            }
            linkedHashMap.put("marketing_batch_id", strLJIJ);
        }
        if (enterParams != null) {
            if (!enterParams.LIZ) {
                str9 = "full_screen";
            } else {
                str9 = "seven_screen";
            }
            linkedHashMap.put("page_show_type", str9);
            linkedHashMap.put("source_previous_page", LJJIFFI(enterParams));
            String str13 = enterParams.LJI;
            if (str13 != null) {
                linkedHashMap.put("trigger_event", str13);
            }
            HashMap<String, Object> map3 = enterParams.trackParams;
            if (map3 == null || (obj3 = map3.get("checkout_type")) == null) {
                obj3 = "";
            }
            linkedHashMap.put("checkout_type", obj3);
            HashMap<String, Object> map4 = enterParams.trackParams;
            if (map4 == null || (obj5 = map4.get("cashier_original_track_id")) == null || (string = obj5.toString()) == null) {
                string = "";
            }
            linkedHashMap.put("cashier_original_track_id", string);
            HashMap<String, Object> map5 = enterParams.trackParams;
            if (map5 == null || (obj4 = map5.get("rendering_num")) == null || (string2 = obj4.toString()) == null) {
                string2 = "";
            }
            linkedHashMap.put("rendering_num", string2);
        }
        if (paymentMethod != null && (str8 = paymentMethod.id) != null) {
            linkedHashMap.put("payment_method_id", str8);
        }
        if (bool2 != null) {
            linkedHashMap.put("is_recommended_tag", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (str5 != null) {
            linkedHashMap.put("promotion_type", str5);
        }
        LJJII("tiktokec_option_show", linkedHashMap);
        if (installmentPlan != null && installmentPlan.LJ()) {
            try {
                if (C03P6.LIZ()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(this.LIZ);
                    Unit unit = null;
                    if (enterParams == null || (map2 = enterParams.trackParams) == null) {
                        obj = null;
                    } else {
                        obj = map2.get("cashier_original_track_id");
                    }
                    if (!(obj instanceof String) || (str6 = (String) obj) == null) {
                        str6 = "";
                    }
                    linkedHashMap2.put("cashier_original_track_id", str6);
                    if (enterParams == null || (map = enterParams.trackParams) == null) {
                        obj2 = null;
                    } else {
                        obj2 = map.get("rendering_num");
                    }
                    if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    linkedHashMap2.put("rendering_num", Integer.valueOf(iIntValue));
                    linkedHashMap2.put("parent_option_name", str);
                    linkedHashMap2.put("option_name", str2);
                    linkedHashMap2.put("option_type", "sub_payment_type");
                    linkedHashMap2.put("rank", Integer.valueOf(i));
                    PaymentPromotion paymentPromotion = installmentPlan.promotionInfo;
                    if (paymentPromotion == null || (promotionBatchId = paymentPromotion.getPromotionBatchId()) == null) {
                        promotionBatchId = "";
                    }
                    linkedHashMap2.put("marketing_batch_id", promotionBatchId);
                    String str14 = installmentPlan.tenure;
                    if (str14 != null) {
                        str11 = str14;
                    }
                    linkedHashMap2.put("installment_cnt", str11);
                    PaymentPromotion paymentPromotion2 = installmentPlan.promotionInfo;
                    if (paymentPromotion2 != null && (mapConstructDaInfo2 = paymentPromotion2.constructDaInfo()) != null) {
                        linkedHashMap2.putAll(mapConstructDaInfo2);
                    }
                    PaymentPromotion paymentPromotion3 = installmentPlan.promotionInfo;
                    if (paymentPromotion3 != null && (desc = paymentPromotion3.getDesc()) != null && (!a0.LJJJIL(desc))) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                        linkedHashMap3.put("promotion_info", desc);
                        PaymentPromotion paymentPromotion4 = installmentPlan.promotionInfo;
                        if (paymentPromotion4 != null && (mapConstructDaInfo = paymentPromotion4.constructDaInfo()) != null) {
                            linkedHashMap3.putAll(mapConstructDaInfo);
                        }
                        C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap3);
                    }
                    InterestFeePromotion interestFeePromotion = installmentPlan.interestFeePromotion;
                    if (interestFeePromotion != null && (str7 = interestFeePromotion.desc) != null && (!a0.LJJJIL(str7))) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap2);
                        linkedHashMap4.put("promotion_info", str7);
                        InterestFeePromotion interestFeePromotion2 = installmentPlan.interestFeePromotion;
                        if (interestFeePromotion2 != null && (mapLIZ = interestFeePromotion2.LIZ()) != null) {
                            linkedHashMap4.putAll(mapLIZ);
                        }
                        C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap4);
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v87 */
    public final void LJIILL(PaymentMethod paymentMethod, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Boolean bool, Boolean bool2, EnterParams enterParams, String str3, String str4) {
        ?? BooleanValue;
        Object obj;
        Object obj2;
        Object obj3;
        int iIntValue;
        Object obj4;
        String str5;
        Object obj5;
        int iIntValue2;
        Unit unit;
        InterestFeePromotion interestFeePromotion;
        Map<String, Object> mapLIZ;
        Map<String, Object> mapConstructDaInfo;
        Integer num;
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        Integer num2;
        HashMap<String, Object> map3;
        HashMap<String, Object> map4;
        HashMap<String, Object> map5;
        PaymentPromotion paymentPromotion;
        String desc;
        String str6;
        String str7;
        if (((ArrayList) this.LIZJ).contains(paymentMethod.LJIIJ())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
        linkedHashMap.put("is_pre_credit", LIZIZ(enterParams));
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("option_type", "payment_type");
        linkedHashMap.put("is_pay_saved", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_balance_shown", Integer.valueOf(z3 ? 1 : 0));
        linkedHashMap.put("is_default", C893803eS.LIZ(z4));
        if (str != null && str.length() != 0) {
            linkedHashMap.put("option_unavailable_code", str);
        }
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null && (str7 = bindInfo.bindStatus) != null && str7.length() > 0) {
            linkedHashMap.put("pay_bind_status", str7);
        }
        if (str2 != null && str2.length() != 0) {
            linkedHashMap.put("status_code", str2);
        }
        String str8 = "";
        if (bool != null) {
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            String strLJIJJ = paymentMethod.LJIJJ(false);
            if (strLJIJJ == null) {
                strLJIJJ = "";
            }
            linkedHashMap.put("promotion_info", strLJIJJ);
            String strLJIJ = paymentMethod.LJIJ();
            if (strLJIJ == null) {
                strLJIJ = "";
            }
            linkedHashMap.put("marketing_batch_id", strLJIJ);
        }
        if (bool2 != null) {
            linkedHashMap.put("is_info_needed", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (enterParams != null) {
            if (!enterParams.LIZ) {
                str6 = "full_screen";
            } else {
                str6 = "seven_screen";
            }
            linkedHashMap.put("page_show_type", str6);
            linkedHashMap.put("source_previous_page", LJJIFFI(enterParams));
            String str9 = enterParams.LJI;
            if (str9 != null) {
                linkedHashMap.put("trigger_event", str9);
            }
        }
        String str10 = paymentMethod.id;
        if (str10 != null) {
            linkedHashMap.put("payment_method_id", str10);
        }
        Boolean bool3 = paymentMethod.needsIndependentPricing;
        if (bool3 != null) {
            BooleanValue = bool3.booleanValue();
        } else {
            BooleanValue = 0;
        }
        linkedHashMap.put("needs_independent_pricing", Integer.valueOf((int) BooleanValue));
        PaymentServiceFeeInfo paymentServiceFeeInfo = paymentMethod.paymentServiceFeeInfo;
        if (paymentServiceFeeInfo != null && (paymentPromotion = paymentServiceFeeInfo.paymentPromotionInfo) != null && (desc = paymentPromotion.getDesc()) != null) {
            linkedHashMap.put("service_fee_promotion", desc);
        }
        if (str3 != null) {
            linkedHashMap.put("payment_method_type", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("promotion_type", str4);
        }
        if (enterParams == null || (map5 = enterParams.trackParams) == null || (obj = map5.get("checkout_type")) == null) {
            obj = "";
        }
        linkedHashMap.put("checkout_type", obj);
        if (enterParams != null && (map4 = enterParams.trackParams) != null) {
            obj2 = map4.get("cashier_original_track_id");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof String) || obj2 == null) {
            obj2 = "";
        }
        linkedHashMap.put("cashier_original_track_id", obj2);
        if (enterParams != null && (map3 = enterParams.trackParams) != null) {
            obj3 = map3.get("rendering_num");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Integer) && (num2 = (Integer) obj3) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        linkedHashMap.put("rendering_num", Integer.valueOf(iIntValue));
        Map<String, Object> mapLIZIZ = paymentMethod.LIZIZ();
        if (mapLIZIZ != null && (!mapLIZIZ.isEmpty())) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        LJJII("tiktokec_option_show", linkedHashMap);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            String strLJJIIZ = paymentMethod.LJJIIZ();
            try {
                if (C03P6.LIZ()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(this.LIZ);
                    if (enterParams == null || (map2 = enterParams.trackParams) == null) {
                        obj4 = null;
                    } else {
                        obj4 = map2.get("cashier_original_track_id");
                    }
                    if (!(obj4 instanceof String) || (str5 = (String) obj4) == null) {
                        str5 = "";
                    }
                    linkedHashMap2.put("cashier_original_track_id", str5);
                    if (enterParams == null || (map = enterParams.trackParams) == null) {
                        obj5 = null;
                    } else {
                        obj5 = map.get("rendering_num");
                    }
                    if ((obj5 instanceof Integer) && (num = (Integer) obj5) != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    linkedHashMap2.put("rendering_num", Integer.valueOf(iIntValue2));
                    linkedHashMap2.put("option_name", strLJJIIZ);
                    linkedHashMap2.put("option_type", "payment_type");
                    linkedHashMap2.put("rank", Integer.valueOf(i));
                    String strLJIJ2 = paymentMethod.LJIJ();
                    if (strLJIJ2 != null) {
                        str8 = strLJIJ2;
                    }
                    linkedHashMap2.put("marketing_batch_id", str8);
                    String strLJIJJ2 = paymentMethod.LJIJJ(false);
                    if (strLJIJJ2 != null && (!a0.LJJJIL(strLJIJJ2))) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                        linkedHashMap3.put("promotion_info", strLJIJJ2);
                        PaymentPromotion paymentPromotionLJIILLIIL = paymentMethod.LJIILLIIL();
                        if (paymentPromotionLJIILLIIL != null && (mapConstructDaInfo = paymentPromotionLJIILLIIL.constructDaInfo()) != null) {
                            linkedHashMap3.putAll(mapConstructDaInfo);
                        }
                        C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap3);
                    }
                    String strLJJII = paymentMethod.LJJII();
                    if (strLJJII != null && (!a0.LJJJIL(strLJJII))) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap2);
                        linkedHashMap4.put("promotion_info", strLJJII);
                        InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
                        if (installmentInfo != null && (interestFeePromotion = installmentInfo.interestFeePromotion) != null && (mapLIZ = interestFeePromotion.LIZ()) != null) {
                            linkedHashMap4.putAll(mapLIZ);
                        }
                        C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap4);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        ((ArrayList) this.LIZJ).add(paymentMethod.LJIIJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01df A[PHI: r12
      0x01df: PHI (r12v6 java.lang.String) = (r12v3 java.lang.String), (r12v7 java.lang.String) binds: [B:115:0x01b3, B:112:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(X.C03WH r29, java.lang.String r30, java.lang.String r31, int r32, boolean r33, java.lang.String r34, java.lang.Boolean r35, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r36, java.lang.String r37, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r38, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r39, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r40, java.lang.Boolean r41, java.lang.String r42, boolean r43, X.C03WJ r44, int r45) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WH.LJIJJ(X.03WH, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams, java.lang.Boolean, java.lang.String, boolean, X.03WJ, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [int] */
    /* JADX WARN: Type inference failed for: r0v87 */
    public static void LJIJ(C03WH c03wh, String str, boolean z, int i, boolean z2, boolean z3, String str2, String str3, String str4, Boolean bool, Boolean bool2, Map map, PaymentMethod paymentMethod, EnterParams enterParams, String str5, String str6, boolean z4, int i2) {
        boolean z5;
        String str7;
        Object obj;
        Object obj2;
        Object obj3;
        int iIntValue;
        String str8;
        boolean zLJFF;
        HashMap<String, Object> map2;
        Object obj4;
        String str9;
        Object obj5;
        int iIntValue2;
        Unit unit;
        InterestFeePromotion interestFeePromotion;
        Map<String, Object> mapLIZ;
        Map<String, Object> mapConstructDaInfo;
        Integer num;
        Integer num2;
        HashMap<String, Object> map3;
        HashMap<String, Object> map4;
        HashMap<String, Object> map5;
        String str10;
        String str11;
        ?? BooleanValue;
        PaymentPromotion paymentPromotion;
        String desc;
        Map<String, Object> mapLIZIZ;
        boolean z6 = z4;
        String str12 = str6;
        String str13 = str5;
        EnterParams enterParams2 = enterParams;
        PaymentMethod paymentMethod2 = paymentMethod;
        Boolean bool3 = bool;
        Map map6 = map;
        String str14 = str2;
        if ((i2 & 128) != 0) {
            str14 = null;
        }
        if ((i2 & 1024) != 0) {
            bool3 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool2 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map6 = null;
        }
        if ((i2 & 8192) != 0) {
            paymentMethod2 = null;
        }
        if ((i2 & 16384) != 0) {
            enterParams2 = null;
        }
        if ((32768 & i2) != 0) {
            str13 = null;
        }
        if ((65536 & i2) != 0) {
            str12 = null;
        }
        if ((131072 & i2) != 0) {
            z6 = false;
        }
        if ((i2 & 262144) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        c03wh.getClass();
        boolean zLJFF2 = Intrinsics.LJFF(null, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03wh.LIZ);
        linkedHashMap.put("option_name", str);
        linkedHashMap.put("is_pre_credit", c03wh.LIZIZ(enterParams2));
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("option_type", "payment_type");
        if (zLJFF2) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_default", str7);
        linkedHashMap.put("is_pay_saved", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_balance_shown", Integer.valueOf(z3 ? 1 : 0));
        if (paymentMethod2 != null && (mapLIZIZ = paymentMethod2.LIZIZ()) != null && (!mapLIZIZ.isEmpty())) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        C038N.LIZ(linkedHashMap, map6);
        if (str14 != null && str14.length() != 0) {
            linkedHashMap.put("option_unavailable_code", str14);
        }
        if (str3 != null && str3.length() > 0) {
            linkedHashMap.put("pay_bind_status", str3);
        }
        if (str4 != null && str4.length() != 0) {
            linkedHashMap.put("status_code", str4);
        }
        if (bool3 != null) {
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_info_needed", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        String str15 = "";
        if (paymentMethod2 != null) {
            String strLJIJJ = paymentMethod2.LJIJJ(false);
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
            if (strLJIJJ == null) {
                strLJIJJ = "";
            }
            linkedHashMap.put("promotion_info", strLJIJJ);
            String strLJIJ = paymentMethod2.LJIJ();
            if (strLJIJ == null) {
                strLJIJ = "";
            }
            linkedHashMap.put("marketing_batch_id", strLJIJ);
            Boolean bool4 = paymentMethod2.needsIndependentPricing;
            if (bool4 != null) {
                BooleanValue = bool4.booleanValue();
            } else {
                BooleanValue = 0;
            }
            linkedHashMap.put("needs_independent_pricing", Integer.valueOf((int) BooleanValue));
            PaymentServiceFeeInfo paymentServiceFeeInfo = paymentMethod2.paymentServiceFeeInfo;
            if (paymentServiceFeeInfo != null && (paymentPromotion = paymentServiceFeeInfo.paymentPromotionInfo) != null && (desc = paymentPromotion.getDesc()) != null) {
                linkedHashMap.put("service_fee_promotion", desc);
            }
        }
        if (enterParams2 != null) {
            if (!enterParams2.LIZ) {
                str11 = "full_screen";
            } else {
                str11 = "seven_screen";
            }
            linkedHashMap.put("page_show_type", str11);
            linkedHashMap.put("source_previous_page", LJJIFFI(enterParams2));
            String str16 = enterParams2.LJI;
            if (str16 != null) {
                linkedHashMap.put("trigger_event", str16);
            }
        }
        if (paymentMethod2 != null && (str10 = paymentMethod2.id) != null) {
            linkedHashMap.put("payment_method_id", str10);
        }
        if (str13 != null) {
            linkedHashMap.put("payment_method_type", str13);
        }
        if (str12 != null) {
            linkedHashMap.put("promotion_type", str12);
        }
        if (enterParams2 == null || (map5 = enterParams2.trackParams) == null || (obj = map5.get("checkout_type")) == null) {
            obj = "";
        }
        linkedHashMap.put("checkout_type", obj);
        if (enterParams2 != null && (map4 = enterParams2.trackParams) != null) {
            obj2 = map4.get("cashier_original_track_id");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof String) || obj2 == null) {
            obj2 = "";
        }
        linkedHashMap.put("cashier_original_track_id", obj2);
        if (enterParams2 != null && (map3 = enterParams2.trackParams) != null) {
            obj3 = map3.get("rendering_num");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Integer) && (num2 = (Integer) obj3) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        linkedHashMap.put("rendering_num", Integer.valueOf(iIntValue));
        C03WI c03wi = c03wh.LJFF;
        if (paymentMethod2 != null) {
            str8 = paymentMethod2.id;
            zLJFF = Intrinsics.LJFF(paymentMethod2.isChooseRecommend, Boolean.TRUE);
        } else {
            str8 = null;
            zLJFF = false;
        }
        C03WJ c03wj = new C03WJ(str8, paymentMethod2, null, zLJFF);
        if (paymentMethod2 != null) {
            paymentMethod2.LJJLI();
        }
        c03wi.LIZ(linkedHashMap, c03wj, z6, false, null, z5);
        LJJII("tiktokec_select_option", linkedHashMap);
        if (Intrinsics.LJFF(bool3, Boolean.TRUE) && paymentMethod2 != null) {
            if (enterParams2 != null) {
                map2 = enterParams2.trackParams;
            } else {
                map2 = null;
            }
            try {
                if (C03P6.LIZ()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(c03wh.LIZ);
                    if (map2 == null) {
                        obj4 = null;
                    } else {
                        obj4 = map2.get("cashier_original_track_id");
                    }
                    if (!(obj4 instanceof String) || (str9 = (String) obj4) == null) {
                        str9 = "";
                    }
                    linkedHashMap2.put("cashier_original_track_id", str9);
                    if (map2 == null) {
                        obj5 = null;
                    } else {
                        obj5 = map2.get("rendering_num");
                    }
                    if ((obj5 instanceof Integer) && (num = (Integer) obj5) != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    linkedHashMap2.put("rendering_num", Integer.valueOf(iIntValue2));
                    linkedHashMap2.put("option_name", str);
                    linkedHashMap2.put("option_type", "payment_type");
                    linkedHashMap2.put("rank", Integer.valueOf(i));
                    String strLJIJ2 = paymentMethod2.LJIJ();
                    if (strLJIJ2 != null) {
                        str15 = strLJIJ2;
                    }
                    linkedHashMap2.put("marketing_batch_id", str15);
                    if (str12 != null) {
                        linkedHashMap2.put("promotion_type", str12);
                    }
                    String strLJIJJ2 = paymentMethod2.LJIJJ(false);
                    if (strLJIJJ2 != null && (!a0.LJJJIL(strLJIJJ2))) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                        linkedHashMap3.put("promotion_info", strLJIJJ2);
                        PaymentPromotion paymentPromotionLJIILLIIL = paymentMethod2.LJIILLIIL();
                        if (paymentPromotionLJIILLIIL != null && (mapConstructDaInfo = paymentPromotionLJIILLIIL.constructDaInfo()) != null) {
                            linkedHashMap3.putAll(mapConstructDaInfo);
                        }
                        C1018703yb.LIZIZ("tiktokec_promotion_select", linkedHashMap3);
                    }
                    String strLJJII = paymentMethod2.LJJII();
                    if (strLJJII != null && (!a0.LJJJIL(strLJJII))) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap2);
                        linkedHashMap4.put("promotion_info", strLJJII);
                        InstallmentInfo installmentInfo = paymentMethod2.installmentInfo;
                        if (installmentInfo != null && (interestFeePromotion = installmentInfo.interestFeePromotion) != null && (mapLIZ = interestFeePromotion.LIZ()) != null) {
                            linkedHashMap4.putAll(mapLIZ);
                        }
                        C1018703yb.LIZIZ("tiktokec_promotion_select", linkedHashMap4);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LJIIL(C03WH c03wh, String str, String str2, String str3, String[] strArr, Boolean bool, String str4, String str5, Boolean bool2, String str6, Integer num, String str7, String str8, Integer num2, Integer num3, Map map, Map map2, String str9, String str10, int i) {
        String strSubstring;
        String str11 = str3;
        String str12 = str5;
        String str13 = str4;
        String str14 = str9;
        Map map3 = map;
        String str15 = str8;
        Map map4 = map2;
        String str16 = str10;
        String str17 = str7;
        String str18 = str6;
        if ((i & 4) != 0) {
            str11 = null;
        }
        int i2 = i & 8;
        String[] strArr2 = LJIIJJI;
        if (i2 != 0) {
            strArr = strArr2;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            str13 = null;
        }
        if ((i & 64) != 0) {
            str12 = null;
        }
        if ((i & 128) != 0) {
            bool2 = null;
        }
        if ((i & 256) != 0) {
            str18 = null;
        }
        if ((i & 512) != 0) {
            num = null;
        }
        if ((i & 1024) != 0) {
            str17 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str15 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num2 = null;
        }
        if ((i & 8192) != 0) {
            num3 = null;
        }
        if ((i & 16384) != 0) {
            map3 = null;
        }
        if ((32768 & i) != 0) {
            map4 = null;
        }
        if ((65536 & i) != 0) {
            str14 = null;
        }
        if ((i & 262144) != 0) {
            str16 = null;
        }
        c03wh.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03wh.LIZ);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("option_type", "payment_type");
        C038N.LIZ(linkedHashMap, map3);
        if (str2 != null) {
            linkedHashMap.put("pay_type", str2);
            linkedHashMap.put("option_name", str2);
        }
        if (Intrinsics.LJFF(str2, "CCDC") || Intrinsics.LJFF(str15, "CCDC")) {
            if (str11 != null) {
                try {
                    linkedHashMap.put("is_card_save", str11);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            String strLIZIZ = "";
            int i3 = 0;
            do {
                if (LJIIL[i3] != null || strArr[i3] != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(strArr2[i3]);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                i3++;
            } while (i3 < 4);
            if (strLIZIZ.length() == 0) {
                strSubstring = "1";
            } else {
                strSubstring = strLIZIZ.substring(1);
            }
            C189200o6.m2constructorimpl(linkedHashMap.put("payment_info_finish", strSubstring));
        }
        if (bool2 != null) {
            bool2.booleanValue();
            linkedHashMap.put("is_use_ocr", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (str18 != null) {
            linkedHashMap.put("is_edit_ocr_result", str18);
        }
        if (num != null) {
            num.intValue();
            linkedHashMap.put("ocr_mode", C893803eS.LIZIZ(num.intValue()));
        }
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str13 != null && str13.length() > 0) {
            linkedHashMap.put("pay_bind_status", str13);
        }
        if (str12 != null) {
            linkedHashMap.put("total_payment", str12);
        }
        if (str17 != null) {
            linkedHashMap.put("installment_cnt", str17);
        }
        if (num2 != null) {
            linkedHashMap.put("is_credit_select", Integer.valueOf(num2.intValue()));
        }
        if (num3 != null) {
            linkedHashMap.put("is_credit_pay", Integer.valueOf(num3.intValue()));
        }
        if (map4 != null) {
            linkedHashMap.putAll(map4);
        }
        if (str14 != null) {
            linkedHashMap.put("primary_pay_type", str14);
        }
        if (str16 != null) {
            linkedHashMap.put("bnpl_status", str16);
        }
        LJJII("tiktokec_button_click", linkedHashMap);
    }
}
