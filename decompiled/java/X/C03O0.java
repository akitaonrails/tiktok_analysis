package X;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsAddCardRiskControlSettingSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcTransactionRequestOpt;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS88S0201000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03O0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03O0 {
    public static int LJIIIZ;
    public static BPEAHandler LJIJI;
    public static boolean LJIJJ;
    public static PaymentMethod LJIL;
    public static PaymentMethod LJJ;
    public static final C03O0 LIZ = new C03O0();
    public static final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static long LJ = -1;
    public static long LJFF = -1;
    public static long LJI = -1;
    public static long LJII = -1;
    public static long LJIIIIZZ = -1;
    public static final List<String> LJIIJ = new ArrayList();
    public static final List<String> LJIIJJI = new ArrayList();
    public static final List<String> LJIIL = new ArrayList();
    public static final List<String> LJIILIIL = new ArrayList();
    public static final List<String> LJIILJJIL = new ArrayList();
    public static final List<String> LJIILL = new ArrayList();
    public static final List<String> LJIILLIIL = new ArrayList();
    public static final C03WI LJIIZILJ = new C03WI();
    public static String LJIJ = "";
    public static final Map<String, Long> LJIJJLI = new LinkedHashMap();
    public static boolean LJJI = true;
    public static long LJJIFFI = -1;
    public static final RunnableC835803Oi LJJII = RunnableC835803Oi.LL;

    public static void LJIIIIZZ() {
        LIZIZ.clear();
        LIZJ = -1L;
        LJII = -1L;
        LJIIIIZZ = -1L;
        LJIIIZ = 0;
        LIZLLL = -1L;
        LJ = -1L;
        LJFF = -1L;
        LJI = -1L;
        LJJIFFI = -1L;
        ((ArrayList) LJIIJ).clear();
        ((ArrayList) LJIIJJI).clear();
        ((ArrayList) LJIILIIL).clear();
        ((ArrayList) LJIIL).clear();
        ((ArrayList) LJIILJJIL).clear();
        ((ArrayList) LJIILL).clear();
        ((ArrayList) LJIILLIIL).clear();
        LJIIZILJ.LIZ = null;
        LJIL = null;
        LJJ = null;
        BPEAHandler bPEAHandler = LJIJI;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(LJJII);
        }
        LJIJI = null;
        LJIJJ = false;
    }

    public static Map LJIJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_type", "order_summary");
        linkedHashMap.put("option_name", "total");
        return linkedHashMap;
    }

    public static Map LJIJJ() {
        Unit unit;
        HashMap map = new HashMap();
        try {
            ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
            Object obj = concurrentHashMap.get("cashier_original_track_id");
            if (obj != null) {
                map.put("cashier_original_track_id", obj.toString());
            }
            Object obj2 = concurrentHashMap.get("rendering_num");
            if (obj2 != null) {
                map.put("rendering_num", obj2.toString());
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return map;
        }
    }

    public static void LJIJJLI() {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        concurrentHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        concurrentHashMap.put("page_name", "order_submit");
        LIZLLL = SystemClock.elapsedRealtime();
        LJIJI = new BPEAHandler(Looper.getMainLooper());
        LJIJJ = false;
        LJIIZILJ.LIZ = null;
    }

    public static void LJJLI() {
        OrderSubmitFragment.LLLIL.getClass();
        OrderSubmitFragment orderSubmitFragment = OrderSubmitFragment.LLLILZJ;
        if (orderSubmitFragment != null) {
            C1748720vbi.LIZIZ(orderSubmitFragment, new C048P(), null);
        }
    }

    public static void LJLZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(LIZIZ);
        linkedHashMap.put("button_name", "change_address");
        LLF("tiktokec_button_click", linkedHashMap);
    }

    public static void LJII() {
        LJFF = SystemClock.elapsedRealtime();
        LJI += SystemClock.elapsedRealtime() - LJ;
    }

    public static void LJJJLL() {
        new C839803Pw(SystemClock.elapsedRealtime() - LIZLLL, LJIIIIZZ, LJIIIZ).LIZIZ();
    }

    public static void LJZ() {
        LIZJ = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.Integer r5) {
        /*
            if (r5 == 0) goto L30
            int r5 = r5.intValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C03O0.LIZIZ
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.lang.String r3 = "entrance_info"
            java.util.HashMap r2 = X.C1741890vQh.LJ(r3, r4)
            java.lang.String r1 = "product_platform"
            if (r2 == 0) goto L24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.put(r1, r0)
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r2)
            if (r0 != 0) goto L26
        L24:
            java.lang.String r0 = "{}"
        L26:
            r4.put(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.put(r1, r0)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJFF(java.lang.Integer):void");
    }

    public static String LJI(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PaymentElement paymentElement = (PaymentElement) it2.next();
            sb.append(paymentElement.element);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(": ");
            sbLIZ.append(C123100dR.LIZ(paymentElement.paramValue));
            sbLIZ.append(' ');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return sb.toString();
    }

    public static long LJIIIZ(String str) {
        Map<String, Long> map = LJIJJLI;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            long jLongValue = l.longValue();
            map.remove(str);
            return SystemClock.elapsedRealtime() - jLongValue;
        }
        return 0L;
    }

    public static HashMap LJIIJJI(PlatformPromotion platformPromotion) {
        String str;
        Object obj;
        BonusInfo bonusInfo;
        String str2;
        if (platformPromotion != null) {
            str = platformPromotion.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        HashMap map = new HashMap();
        if (platformPromotion != null && (bonusInfo = platformPromotion.bonusInfo) != null && Intrinsics.LJFF(bonusInfo.useBonusRedeem, Boolean.TRUE) && (str2 = platformPromotion.bonusInfo.redeemAmountValue) != null) {
            map.put("redeem_bonus", str2);
        }
        if (mapLJIIJ != null) {
            map.putAll(mapLJIIJ);
            Object obj2 = mapLJIIJ.get("bonus_guide");
            if (obj2 != null) {
                map.put("bonus_guide", obj2);
            }
        }
        if (mapLJIIJ != null) {
            Object obj3 = mapLJIIJ.get("earn_bonus");
            if ((obj3 == null || map.put("earn_bonus", obj3) == null) && (obj = mapLJIIJ.get("bonus_to_be_earned_amount")) != null) {
                map.put("earn_bonus", obj);
            }
            Object obj4 = mapLJIIJ.get("plus_coupon_package_type");
            if (obj4 != null) {
                map.put("plus_coupon_package_type", obj4);
            }
        }
        return map;
    }

    public static List LJIIL(BillInfoData billInfoData) {
        ArrayList arrayList = new ArrayList();
        List<ShopOrderNew> list = billInfoData.newShopOrders;
        if (list != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list3 = it3.next().packedSkus;
                        if (list3 != null) {
                            Iterator<PackedSku> it4 = list3.iterator();
                            while (it4.hasNext()) {
                                String str = it4.next().skuId;
                                if (str != null) {
                                    arrayList.add(str);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static C7767031p LJIILIIL(PaymentInfo paymentInfo) {
        if (paymentInfo != null) {
            if (paymentInfo.LJI()) {
                PaymentMethod paymentMethod = paymentInfo.LIZ;
                if (paymentMethod != null) {
                    return paymentMethod.LJFF;
                }
                return null;
            }
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            if (paymentMethod2 != null) {
                return paymentMethod2.LJFF;
            }
            return null;
        }
        return null;
    }

    public static void LJJI(HashMap map) {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        if (map != null) {
            concurrentHashMap.putAll(map);
        }
    }

    public static void LJJII(String str) {
        if (!C03RP.LIZIZ().enableActivateLogTrack) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("popup_name", str);
        LLF("tiktokec_popup_show", linkedHashMap);
    }

    public static void LJJIIJ(PaymentMethod paymentMethod) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", "balance_tool_tips");
        linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
        linkedHashMap.put("option_type", "payment_type");
        LLF("tiktokec_button_click", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIIZI(Integer num) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = num;
        AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1(LIZIZ.get("click_buynow_start_time"), c259800zU, (C259800zU<Integer>) 96);
        if (EcTransactionRequestOpt.LIZ()) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01MK(awS402S0200000_1, null), 2);
        } else {
            awS402S0200000_1.invoke();
        }
    }

    public static void LJJIL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("payment_method_id", str);
        LLF("rd_pipo_clear_select_status", linkedHashMap);
    }

    public static void LJJJJ(PaymentMethod paymentMethod) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
        linkedHashMap.put("option_type", "payment_type");
        LLF("tiktokec_button_click", linkedHashMap);
    }

    public static void LJJJJI(PaymentMethod paymentMethod) {
        ArrayList arrayList = (ArrayList) LJIILL;
        if (arrayList.contains(paymentMethod.LJIIJ())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
        linkedHashMap.put("option_type", "payment_type");
        LLF("tiktokec_button_show", linkedHashMap);
        arrayList.add(paymentMethod.LJIIJ());
    }

    public static void LJJJJIZL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("page_name", "order_submit");
        LLF("tiktokec_input_click", linkedHashMap);
    }

    public static void LJJLIIIJLJLI(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        LLF("tiktokec_submit_order", linkedHashMap);
    }

    public static void LJJLIIIJLLLLLLLZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("module_name", "shop_orders_new");
        linkedHashMap.put("type", "show err");
        linkedHashMap.put("err_msg", str);
        LLF("rd_tiktokec_osp_custom_track_info", linkedHashMap);
    }

    public static void LJJLIIJ(String str) {
        long jElapsedRealtime;
        long j;
        if (LJFF > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            j = LJFF;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            j = LIZLLL;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime - j));
        LLF("tiktokec_order_submit_page_time", linkedHashMap);
    }

    public static void LJLJJL(boolean z) {
        if (LJIJJ) {
            return;
        }
        LJIJJ = true;
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        Object obj = concurrentHashMap.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(concurrentHashMap);
        linkedHashMap.put("page_name", "order_submit");
        if ((obj instanceof Long) && !Intrinsics.LJFF(obj, -1L)) {
            linkedHashMap.put("total_duration", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        linkedHashMap.put("code", Integer.valueOf(z ? 1 : 0));
        LLF("rd_tiktokec_render_page", linkedHashMap);
    }

    public static void LJLLL(Integer num) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("verify_object", "mobile_number");
        if (num != null && num.intValue() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("is_success", Integer.valueOf(i));
        if (num != null) {
            linkedHashMap.put("fail_reason", Integer.valueOf(num.intValue()));
        }
        LLF("tiktokec_verify_result", linkedHashMap);
    }

    public static void LJLLLLLL(PaymentMethod paymentMethod) {
        String str;
        ArrayList arrayList = (ArrayList) LJIILIIL;
        if (arrayList.contains(paymentMethod.LJIIJ())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str = bindInfo.bindStatus;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            linkedHashMap.put("pay_bind_status", str);
        }
        linkedHashMap.put("is_option_discounted", Integer.valueOf(C770702zh.LIZ(paymentMethod.extraInfo) ? 1 : 0));
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(paymentMethod.LJIJJ(false)) ? 1 : 0));
        linkedHashMap.put("payment_option", paymentMethod.LJJIIZ());
        linkedHashMap.put("button_name", "view_installment_plan");
        LLF("tiktokec_button_show", linkedHashMap);
        arrayList.add(paymentMethod.LJIIJ());
    }

    public static void LJZL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("invoke_reason", str);
        LLF("rd_tts_sns_place_order_intercept", linkedHashMap);
    }

    public static void LLFFF(Map map) {
        if (PipoTtsAddCardRiskControlSettingSettings.LIZIZ) {
            C1018703yb.LIZIZ("rd_pipo_add_card_risk_info", C2097608Jq.LJIIL(C2097608Jq.LJIIL(LIZIZ, map), C2097908Jt.LIZJ(new Pair("pipo_ts", Long.valueOf(System.currentTimeMillis())))));
        }
    }

    public static void LLFII(C03O0 c03o0) {
        if (LJIJJ) {
            c03o0.getClass();
            return;
        }
        c03o0.getClass();
        BPEAHandler bPEAHandler = LJIJI;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(LJJII);
        }
        BPEAHandler bPEAHandler2 = LJIJI;
        if (bPEAHandler2 == null) {
            return;
        }
        C786410Ut5.LJLIIL(1500L, bPEAHandler2, LJJII);
    }

    public static String LLIFFJFJJ(String str) {
        String str2;
        String value;
        String value2;
        List listLJJLIIIJILLIZJL;
        try {
            boolean z = false;
            MatchResult matchResultFind$default = Regex.find$default(new Regex("\"net_error\":-?\\d+"), str, 0, 2, null);
            if (matchResultFind$default != null && (value2 = matchResultFind$default.getValue()) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(value2, new String[]{":"}, 0, 6)) != null) {
                str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            } else {
                str2 = null;
            }
            MatchResult matchResultFind$default2 = Regex.find$default(new Regex("\\|.*?,"), str, 0, 2, null);
            if (matchResultFind$default2 == null || (value = matchResultFind$default2.getValue()) == null) {
                value = "";
            }
            if (str2 == null || a0.LJJJIL(str2)) {
                z = true;
            }
            if (z) {
                return "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(value);
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static void LIZJ(Map map, Map map2) {
        if (map2 != null && !map2.isEmpty()) {
            Object obj = map2.get("shipping_price");
            if (obj != null) {
                map.put("shipping_price", obj);
            }
            Object obj2 = map2.get("shipping_price_after_coupon");
            if (obj2 != null) {
                map.put("shipping_price_after_coupon", obj2);
            }
            Object obj3 = map2.get("discounted_shipping_price");
            if (obj3 != null) {
                map.put("discounted_shipping_price", obj3);
            }
        }
    }

    public static void LIZLLL(Map map, Map map2) {
        Object obj;
        if (map2 != null && !map2.isEmpty() && (obj = map2.get("sns_type")) != null) {
            ((HashMap) map).put("sns_type", obj);
        }
    }

    public static void LJIIJ(int i, HashMap map) {
        Object obj = LIZIZ.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        C1018703yb.LIZLLL("rd_tiktokec_enter_order_submit_duration", new AwS88S0201000_1(map, (HashMap<String, Object>) i, (int) obj, (Object) 13));
    }

    public static String LJIILJJIL(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null) {
            return null;
        }
        if (!Intrinsics.LJFF(paymentMethod.id, "pm_pi_ins_pipobnpl_c_d")) {
            C03SY c03sy = C03SY.LIZ;
            String str = paymentMethod.id;
            c03sy.getClass();
            if (!C03SY.LJIJI(str)) {
                for (Object obj : (ArrayList) list) {
                    if (((PaymentMethod) obj).LJJJJZ(paymentMethod)) {
                        if (obj == null) {
                            return null;
                        }
                        return paymentMethod.id;
                    }
                }
                return null;
            }
        }
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo == null) {
            return null;
        }
        return paymentMethodInfo.tenure;
    }

    public static InstallmentInfo LJIILL(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        Object next;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            if (paymentMethod.LIZIZ) {
                InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
                if (installmentInfo == null) {
                    List<InstallmentInfo> list2 = paymentMethod.installmentInfoList;
                    if (list2 == null) {
                        return null;
                    }
                    return (InstallmentInfo) C13LP.LJJJLL(list2);
                }
                return installmentInfo;
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (C899503fN.LIZIZ((PaymentMethod) next, paymentMethod)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod2 = (PaymentMethod) next;
                if (paymentMethod2 != null) {
                    InstallmentInfo installmentInfo2 = paymentMethod2.installmentInfo;
                    if (installmentInfo2 == null) {
                        List<InstallmentInfo> list3 = paymentMethod2.installmentInfoList;
                        if (list3 != null) {
                            return (InstallmentInfo) C13LP.LJJJLL(list3);
                        }
                    } else {
                        return installmentInfo2;
                    }
                }
            }
        }
        return null;
    }

    public static Pair LJIILLIIL(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        boolean z;
        Object next;
        Object objValueOf = null;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                z = false;
                if (it2.hasNext()) {
                    next = it2.next();
                    PaymentMethod paymentMethod2 = (PaymentMethod) next;
                    if (!Intrinsics.LJFF(paymentMethod2.id, "pm_pi_ccdc_all") && paymentMethod2.LJJJJZ(paymentMethod)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentMethod paymentMethod3 = (PaymentMethod) next;
            if (paymentMethod3 != null ? C899503fN.LIZIZ(paymentMethod3, LJIL) : C899503fN.LIZIZ(paymentMethod, LJIL)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (paymentMethod3 != null) {
                String str = paymentMethod.id;
                PaymentMethod paymentMethod4 = LJJ;
                if (paymentMethod4 != null) {
                    objValueOf = paymentMethod4.id;
                }
                objValueOf = Boolean.valueOf(Intrinsics.LJFF(str, objValueOf));
            }
            return new Pair(boolValueOf, objValueOf);
        }
        return new Pair(null, null);
    }

    public static String LJIIZILJ(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        Object next;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null) {
            return null;
        }
        if (!Intrinsics.LJFF(paymentMethod.id, "pm_pi_ins_pipobnpl_c_d")) {
            C03SY c03sy = C03SY.LIZ;
            String str = paymentMethod.id;
            c03sy.getClass();
            if (!C03SY.LJIJI(str)) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((PaymentMethod) next).LJJJJZ(paymentMethod)) {
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
                return C03OM.LIZIZ(paymentMethod2.id);
            }
        }
        return C03OM.LIZIZ(paymentMethod.id);
    }

    public static Map LJIJI(Long l, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "total_instruction");
        if (str != null) {
            linkedHashMap.put("quit_type", str);
        }
        if (l != null) {
            linkedHashMap.put("stay_time", Long.valueOf(l.longValue()));
        }
        return linkedHashMap;
    }

    public static void LJIL(PaymentMethod paymentMethod, List list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LJIL = paymentMethod;
            LJJ = null;
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PaymentMethod paymentMethod2 = (PaymentMethod) it2.next();
            if (C899503fN.LIZIZ(paymentMethod2, paymentMethod)) {
                LJIL = paymentMethod2;
                LJJ = null;
                return;
            } else if (paymentMethod2.LJJJJZ(paymentMethod)) {
                if (Intrinsics.LJFF(paymentMethod2.id, "pm_pi_ccdc_all")) {
                    LJIL = paymentMethod2;
                    LJJ = null;
                    return;
                } else {
                    LJIL = paymentMethod2;
                    LJJ = paymentMethod;
                    return;
                }
            }
        }
    }

    public static String LJJ(PaymentInfo paymentInfo, List list) {
        PaymentMethodInfo paymentMethodInfo;
        String str;
        List<InstallmentPlan> list2;
        String str2;
        PaymentMethodInfo paymentMethodInfo2;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && (str = paymentMethodInfo.tenure) != null && str.length() != 0) {
            InstallmentInfo installmentInfoLJIILL = LJIILL(paymentInfo, list);
            if (installmentInfoLJIILL != null && (list2 = installmentInfoLJIILL.installmentPlans) != null) {
                Iterator<InstallmentPlan> it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str3 = it2.next().tenure;
                    if (paymentInfo != null && (paymentMethodInfo2 = paymentInfo.paymentMethodInfo) != null) {
                        str2 = paymentMethodInfo2.tenure;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str3, str2)) {
                        return "1";
                    }
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "-2";
        }
        return "-1";
    }

    public static void LJJIFFI(String str, String str2) {
        if (!C03RP.LIZIZ().enableActivateLogTrack) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("popup_name", str);
        linkedHashMap.put("action_type", str2);
        LLF("tiktokec_popup_click", linkedHashMap);
    }

    public static void LJJIII(String str, HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        LLF(str, linkedHashMap);
    }

    public static void LJJJI(String str, HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("popup_name", "make_sure_address_for_instant");
        linkedHashMap.put("action_type", str);
        LLF("tiktokec_popup_click", linkedHashMap);
    }

    public static Map LJJJIL(EnumC805403Cq enumC805403Cq, HashMap map) {
        String str;
        String strValueOf;
        String str2;
        Object obj;
        Object objValueOf;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Pair[] pairArr = new Pair[13];
        pairArr[0] = new Pair("entrance_form", "pure_goods_card");
        EnumC805403Cq enumC805403Cq2 = EnumC805403Cq.ADD_ITEM_ORDER;
        if (enumC805403Cq == enumC805403Cq2) {
            str = "add_item_order_submit_rec";
        } else {
            str = "add_item_interception";
        }
        pairArr[1] = new Pair("source_page_type", str);
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        pairArr[2] = new Pair("parent_source_page_type", String.valueOf(concurrentHashMap.get("source_page_type")));
        if (enumC805403Cq == enumC805403Cq2) {
            strValueOf = String.valueOf(concurrentHashMap.get("previous_page"));
        } else {
            strValueOf = "order_submit";
        }
        pairArr[3] = new Pair("source_previous_page", strValueOf);
        if (enumC805403Cq == enumC805403Cq2) {
            str2 = "rec_order_submit_outer_add_on_reminder_module";
        } else {
            str2 = "rec_add_item_interception_outer_flow";
        }
        pairArr[4] = new Pair("source_module", str2);
        Object obj7 = null;
        if (enumC805403Cq == enumC805403Cq2) {
            objValueOf = 0;
        } else {
            HashMap mapLJ = C1741890vQh.LJ("entrance_info", concurrentHashMap);
            if (mapLJ != null) {
                obj = mapLJ.get("is_add_on_product");
            } else {
                obj = null;
            }
            objValueOf = String.valueOf(obj);
        }
        pairArr[5] = new Pair("is_add_on_product", objValueOf);
        if (map != null) {
            obj2 = map.get("track_id");
        } else {
            obj2 = null;
        }
        pairArr[6] = new Pair("track_id", String.valueOf(obj2));
        if (map != null) {
            obj3 = map.get("product_id");
        } else {
            obj3 = null;
        }
        pairArr[7] = new Pair("product_id", String.valueOf(obj3));
        if (map != null) {
            obj4 = map.get("request_id");
        } else {
            obj4 = null;
        }
        pairArr[8] = new Pair("request_id", String.valueOf(obj4));
        if (map != null) {
            obj5 = map.get("rec_params");
        } else {
            obj5 = null;
        }
        pairArr[9] = new Pair("rec_params", String.valueOf(obj5));
        if (map != null) {
            obj6 = map.get("action_type");
        } else {
            obj6 = null;
        }
        pairArr[10] = new Pair("action_type", String.valueOf(obj6));
        pairArr[11] = new Pair("enter_from_merge", String.valueOf(concurrentHashMap.get("enter_from_merge")));
        if (map != null) {
            obj7 = map.get("bcm_multiverse_id");
        }
        pairArr[12] = new Pair("bcm_multiverse_id", String.valueOf(obj7));
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        if (enumC805403Cq == EnumC805403Cq.ADD_ITEM_INTERCEPT) {
            mapLJI.put("enter_method", "add_on_entrance");
        }
        return mapLJI;
    }

    public static void LJJLJLI(PaymentMethod paymentMethod, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (str == null) {
            str = "active_now";
        }
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("payment_option", paymentMethod.LJJIIZ());
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str2 = bindInfo.bindStatus;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("pay_bind_status", str2);
        }
        linkedHashMap.put("is_option_discounted", Integer.valueOf(C770702zh.LIZ(paymentMethod.extraInfo) ? 1 : 0));
        String strLJIJJ = paymentMethod.LJIJJ(false);
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
        String str3 = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        linkedHashMap.put("promotion_info", strLJIJJ);
        String strLJIJ = paymentMethod.LJIJ();
        if (strLJIJ != null) {
            str3 = strLJIJ;
        }
        linkedHashMap.put("marketing_batch_id", str3);
        LLF("tiktokec_button_click", linkedHashMap);
    }

    public static void LJJLL(PaymentMethod paymentMethod, String str) {
        String str2;
        ArrayList arrayList = (ArrayList) LJIILJJIL;
        if (arrayList.contains(paymentMethod.LJIIJ())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (str == null) {
            str = "active_now";
        }
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("payment_option", paymentMethod.LJJIIZ());
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str2 = bindInfo.bindStatus;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("pay_bind_status", str2);
        }
        linkedHashMap.put("is_option_discounted", Integer.valueOf(C770702zh.LIZ(paymentMethod.extraInfo) ? 1 : 0));
        String strLJIJJ = paymentMethod.LJIJJ(false);
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
        String str3 = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        linkedHashMap.put("promotion_info", strLJIJJ);
        String strLJIJ = paymentMethod.LJIJ();
        if (strLJIJ != null) {
            str3 = strLJIJ;
        }
        linkedHashMap.put("marketing_batch_id", str3);
        LLF("tiktokec_button_show", linkedHashMap);
        arrayList.add(paymentMethod.LJIIJ());
    }

    public static void LJJZ(String str, String str2) {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("popup_name", "pi_appeal");
        pairArr[1] = new Pair("action_type", "appeal");
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("error_code", str);
        pairArr[3] = new Pair("option_type", "payment_type");
        if (str2 == null) {
            str2 = "";
        }
        pairArr[4] = new Pair("option_name", str2);
        LLF("tiktokec_popup_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LJJZZI(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("popup_name", "payment_failed");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("error_code", str);
        linkedHashMap.put("option_type", "payment_type");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("option_name", str2);
        LLF("tiktokec_popup_show", linkedHashMap);
    }

    public static void LJLIL(Map map, boolean z) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.putAll(LIZIZ);
        map2.put("first_refresh", Boolean.valueOf(z));
        LLF("rd_pipo_tts_cashier_info", map2);
    }

    public static void LJLLJ(PaymentMethod paymentMethod, String str) {
        boolean zLJFF;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("page_name", "order_submit");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("option_name", str);
        boolean zLJFF2 = false;
        linkedHashMap.put("rank", 0);
        linkedHashMap.put("option_type", "payment_type");
        if (paymentMethod != null) {
            String str3 = paymentMethod.id;
            if (str3 != null) {
                linkedHashMap.put("payment_method_id", str3);
            }
            zLJFF = Intrinsics.LJFF(paymentMethod.isChooseRecommend, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        linkedHashMap.put("is_default", C893803eS.LIZ(zLJFF));
        linkedHashMap.put("select_type", "close");
        C03WI c03wi = LJIIZILJ;
        if (paymentMethod != null) {
            str2 = paymentMethod.id;
            zLJFF2 = Intrinsics.LJFF(paymentMethod.isChooseRecommend, Boolean.TRUE);
        } else {
            str2 = null;
        }
        c03wi.LIZ(linkedHashMap, new C03WJ(str2, paymentMethod, null, zLJFF2), false, false, null, true);
        LLF("tiktokec_select_option", linkedHashMap);
    }

    public static void LJLLLL(PaymentMethod paymentMethod, Boolean bool) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str = bindInfo.bindStatus;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            linkedHashMap.put("pay_bind_status", str);
        }
        linkedHashMap.put("is_option_discounted", Integer.valueOf(C770702zh.LIZ(paymentMethod.extraInfo) ? 1 : 0));
        String strLJIJJ = paymentMethod.LJIJJ(false);
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
        String str2 = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        linkedHashMap.put("promotion_info", strLJIJJ);
        String strLJIJ = paymentMethod.LJIJ();
        if (strLJIJ != null) {
            str2 = strLJIJ;
        }
        linkedHashMap.put("marketing_batch_id", str2);
        linkedHashMap.put("payment_option", paymentMethod.LJJIIZ());
        linkedHashMap.put("button_name", "view_installment_plan");
        if (bool != null) {
            linkedHashMap.put("is_recommended_tag", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        LLF("tiktokec_button_click", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJZI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r4, java.util.List r5) {
        /*
            if (r4 == 0) goto L8c
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4 = r4.paymentMethod
            if (r4 == 0) goto L8c
            if (r5 == 0) goto L89
            java.util.Iterator r5 = r5.iterator()
        Lc:
            boolean r0 = r5.hasNext()
            r3 = 0
            if (r0 == 0) goto L4b
            java.lang.Object r2 = r5.next()
            r1 = r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r1
            boolean r0 = X.C899503fN.LIZIZ(r1, r4)
            if (r0 != 0) goto L26
            boolean r0 = r1.LJJJJZ(r4)
            if (r0 == 0) goto Lc
        L26:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
            if (r2 == 0) goto L89
            boolean r0 = X.C899503fN.LIZIZ(r2, r4)
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r2.availability
            if (r0 == 0) goto L49
            java.lang.Boolean r1 = r0.isAvailable()
        L38:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r4.availability
            if (r0 == 0) goto L40
            java.lang.Boolean r3 = r0.isAvailable()
        L40:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            java.lang.String r0 = X.C893803eS.LIZ(r0)
            return r0
        L49:
            r1 = r3
            goto L38
        L4b:
            r2 = r3
            goto L26
        L4d:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r2.subPaymentMethods
            if (r0 == 0) goto L87
            java.util.Iterator r2 = r0.iterator()
        L55:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            boolean r0 = X.C899503fN.LIZIZ(r0, r4)
            if (r0 == 0) goto L55
        L68:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r1
            if (r1 == 0) goto L87
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r1.availability
            if (r0 == 0) goto L87
            java.lang.Boolean r1 = r0.isAvailable()
        L74:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r4.availability
            if (r0 == 0) goto L7c
            java.lang.Boolean r3 = r0.isAvailable()
        L7c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            java.lang.String r0 = X.C893803eS.LIZ(r0)
            return r0
        L85:
            r1 = r3
            goto L68
        L87:
            r1 = r3
            goto L74
        L89:
            java.lang.String r0 = "-2"
            return r0
        L8c:
            java.lang.String r0 = "-1"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJZI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.util.List):java.lang.String");
    }

    public static String LL(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        Object next;
        Boolean boolIsAvailable;
        PaymentMethod next2;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                PaymentMethod paymentMethod2 = (PaymentMethod) next;
                if (C899503fN.LIZIZ(paymentMethod2, paymentMethod) || paymentMethod2.LJJJJZ(paymentMethod)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentMethod paymentMethod3 = (PaymentMethod) next;
        if (paymentMethod3 == null) {
            return null;
        }
        if (paymentMethod3.LJJJJZ(paymentMethod)) {
            List<PaymentMethod> list2 = paymentMethod3.subPaymentMethods;
            if (list2 == null) {
                return null;
            }
            Iterator<PaymentMethod> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (C899503fN.LIZIZ(next2, paymentMethod)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            paymentMethod3 = next2;
            if (paymentMethod3 == null) {
                return null;
            }
        }
        Availability availability = paymentMethod3.availability;
        if (availability == null || (boolIsAvailable = availability.isAvailable()) == null) {
            return null;
        }
        return C893803eS.LIZ(boolIsAvailable.booleanValue());
    }

    public static String LLD(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        Object next;
        PaymentMethod next2;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                PaymentMethod paymentMethod2 = (PaymentMethod) next;
                if (C899503fN.LIZIZ(paymentMethod2, paymentMethod) || paymentMethod2.LJJJJZ(paymentMethod)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentMethod paymentMethod3 = (PaymentMethod) next;
        if (paymentMethod3 == null) {
            return null;
        }
        if (paymentMethod3.LJJJJZ(paymentMethod)) {
            List<PaymentMethod> list2 = paymentMethod3.subPaymentMethods;
            if (list2 == null) {
                return null;
            }
            Iterator<PaymentMethod> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (C899503fN.LIZIZ(next2, paymentMethod)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            paymentMethod3 = next2;
            if (paymentMethod3 == null) {
                return null;
            }
        }
        Availability availability = paymentMethod3.availability;
        if (availability == null) {
            return null;
        }
        return availability.statusCode;
    }

    @InterfaceC1294060jmO
    public static void LLF(String str, Map map) {
        C1018503yZ.LIZIZ(str, map, false);
        C921903iz.LIZ.getClass();
        C921903iz.LIZIZ(4, map, str);
    }

    public static void LJJIJLIJ(String str, Long l, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (str != null) {
            linkedHashMap.put("fail_reason", str);
            linkedHashMap.put("err_msg", str);
        }
        if (l != null) {
            linkedHashMap.put("total_cost", Long.valueOf(l.longValue()));
        }
        if (bool != null) {
            linkedHashMap.put("is_first_load", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        LLF("rd_tiktokec_chunk_error", linkedHashMap);
    }

    public static void LJJIZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        C03VQ.LIZ.getClass();
        linkedHashMap.put("start_time", Long.valueOf(C03VQ.LJIILL));
        linkedHashMap.put("paylink_order_create_resp_ts", Long.valueOf(C03VQ.LJIILLIIL));
        linkedHashMap.put("paylink_handle_pay_info_start_ts", Long.valueOf(C03VQ.LJIIZILJ));
        linkedHashMap.put("paylink_handle_pay_info_finish_ts", Long.valueOf(C03VQ.LJIJ));
        linkedHashMap.put("paylink_pay_success_callback_ts", Long.valueOf(C03VQ.LJIJI));
        linkedHashMap.put("paylink_ec_common_pay_result_recv_ts", Long.valueOf(C03VQ.LJIJJ));
        linkedHashMap.put("paylink_poll_order_result_success_ts", Long.valueOf(C03VQ.LJIJJLI));
        linkedHashMap.put("paylink_open_pay_success_schema_ts", Long.valueOf(C03VQ.LJIL));
        if (str != null) {
            linkedHashMap.put("pay_request_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("pay_type", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("payment_status", str3);
        }
        LLF("rd_tiktokec_client_pay_process", linkedHashMap);
    }

    public static void LJJJJL(C03O0 c03o0, String str, Map map) {
        Object obj;
        c03o0.getClass();
        Object obj2 = LIZIZ.get("previous_page");
        if (map != null) {
            obj = map.get("module_name");
        } else {
            obj = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        if (obj == null) {
            obj = "add_on_module";
        }
        linkedHashMap.put("module_name", obj);
        linkedHashMap.put("glide_type", str);
        if (obj2 == null) {
            obj2 = "product_detail";
        }
        linkedHashMap.put("previous_page", obj2);
        LLF("tiktokec_module_glide", linkedHashMap);
    }

    public static void LJJLIIIIJ(int i, HashMap map, boolean z) {
        C836403Oo c836403Oo = new C836403Oo(i, map, z);
        if (EcTransactionRequestOpt.LIZ()) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C318801Lm(c836403Oo, null), 2);
        } else {
            c836403Oo.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJLIL(InterfaceC1740480vOQ interfaceC1740480vOQ, BillInfoData billInfoData, BillInfoRequest billInfoRequest) {
        C03RS c03rsLIZIZ;
        BillInfoResponse billInfoResponse;
        BillInfoData billInfoData2;
        if (billInfoRequest != null) {
            try {
                String strGenCacheKey = billInfoRequest.genCacheKey(null);
                if (strGenCacheKey != null) {
                    int buyType = billInfoRequest.getBuyType();
                    boolean z = C843303Rf.LIZ;
                    if (C843303Rf.LIZLLL(Integer.valueOf(buyType), strGenCacheKey) && (c03rsLIZIZ = C843303Rf.LIZIZ(Integer.valueOf(buyType), strGenCacheKey)) != null && (billInfoResponse = c03rsLIZIZ.LIZIZ) != null && (billInfoData2 = (BillInfoData) billInfoResponse.data) != null && interfaceC1740480vOQ != null) {
                        C1748720vbi.LIZIZ(interfaceC1740480vOQ, new C04CK() { // from class: X.048N
                            @Override // X.AbstractC1748790vbp
                            public final C1748850vbv LIZ() {
                                return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("diff_content", new C1747940vaS[0]), new C1748840vbu("is_single_sku", new C1747940vaS[0]), new C1748840vbu("preload_logid", new C1747940vaS[0]), new C1748840vbu("bill_info_logid", new C1747940vaS[0]));
                            }
                        }, new AwS367S0200000_1(billInfoData, billInfoData2, 325));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OSP logOspPreloadDiff Exception: ");
                sbLIZ.append(e.getMessage());
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static final void LJLJLJ(Map<String, ? extends Object> map, LinkedHashMap<String, Object> linkedHashMap, String str) {
        Object obj;
        Object obj2;
        if ((map == null || (obj2 = map.get(str)) == null || linkedHashMap.put(str, obj2) == null) && (obj = LIZIZ.get(str)) != null) {
            linkedHashMap.put(str, obj);
        }
    }

    public static void LJLJLLL(float f, String str, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("smooth_scroller_name", str);
        if (f > 0.0f) {
            linkedHashMap.put("scroll_total_time_ms", Float.valueOf(f));
        }
        if (i > 0) {
            linkedHashMap.put("scroll_distance_pixel", Integer.valueOf(i));
        }
        LLF("rd_tiktokec_order_submit_scroll_perf", linkedHashMap);
    }

    public static void LJLLILLLL(HashMap map, Map map2, Map map3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", "order_summary");
        linkedHashMap.put("previous_page", "order_submit");
        LIZ.getClass();
        LIZJ(linkedHashMap, map2);
        C038N.LIZ(linkedHashMap, map3);
        C1018503yZ.LIZIZ("tiktokec_enter_page", linkedHashMap, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLFF(BillInfoResponse billInfoResponse, Boolean bool, String str) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (str != null) {
            String strLLIFFJFJJ = LLIFFJFJJ(str);
            getClass();
            LJJIIJZLJL(false, zBooleanValue, strLLIFFJFJJ, null);
            return;
        }
        if (billInfoResponse == null) {
            getClass();
            LJJIIJZLJL(false, zBooleanValue, "-1", null);
            return;
        }
        if (!billInfoResponse.isCodeOK()) {
            String strValueOf = String.valueOf(billInfoResponse.code);
            getClass();
            LJJIIJZLJL(false, zBooleanValue, strValueOf, null);
            return;
        }
        T t = billInfoResponse.data;
        if (t != 0) {
            BillInfoData billInfoData = (BillInfoData) t;
            if (billInfoData.newShopOrders != null || billInfoData.summary != null || billInfoData.shippingAddress != null) {
                getClass();
                LJJIIJZLJL(true, zBooleanValue, null, null);
                return;
            }
        }
        Boolean bool2 = Boolean.TRUE;
        String str2 = billInfoResponse.message;
        if (str2 == null) {
            str2 = "-2";
        }
        LJJIIJZLJL(false, zBooleanValue, str2, bool2);
    }

    public static void LIZ(Map map, HashMap map2, String str, LaneParams laneParams) {
        if (map2 != null && !map2.isEmpty()) {
            Object obj = map2.get("bundle_id");
            if (obj != null) {
                if (map != null) {
                    map.put("bundle_id", obj);
                }
                if (laneParams != null) {
                    laneParams.put("bundle_id", obj);
                }
            }
            Object obj2 = map2.get("is_discounted_bundle_deal");
            if (obj2 != null) {
                if (map != null) {
                    map.put("is_discounted_bundle_deal", obj2);
                }
                if (laneParams != null) {
                    laneParams.put("is_discounted_bundle_deal", obj2);
                }
            }
            Object obj3 = map2.get("bundle_product_id");
            if (obj3 != null) {
                if (map != null) {
                    map.put("bundle_product_id", obj3);
                }
                if (laneParams != null) {
                    laneParams.put("bundle_product_id", obj3);
                }
            }
            Object obj4 = map2.get("campaign_id");
            if (obj4 != null) {
                if (map != null) {
                    map.put("campaign_id", obj4);
                }
                if (laneParams != null) {
                    laneParams.put("campaign_id", obj4);
                }
            }
            Object obj5 = map2.get("campaign_type");
            if (obj5 != null) {
                if (map != null) {
                    map.put("campaign_type", obj5);
                }
                if (laneParams != null) {
                    laneParams.put("campaign_type", obj5);
                }
            }
            Object obj6 = map2.get("campaign_user_tag");
            if (obj6 != null) {
                if (map != null) {
                    map.put("campaign_user_tag", obj6);
                }
                if (laneParams != null) {
                    laneParams.put("campaign_user_tag", obj6);
                }
            }
            if (str != null) {
                if (map != null) {
                    map.put("other_campaign", str);
                }
                if (laneParams != null) {
                    laneParams.put("other_campaign", str);
                }
            }
        }
    }

    public static void LJJIIJZLJL(boolean z, boolean z2, String str, Boolean bool) {
        boolean z3;
        boolean z4 = true;
        if (!z) {
            if (LJIIIZ > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            new C835403Oe(str, z3, z2).LIZIZ();
        }
        if (z2) {
            if (LJIIIZ <= 0) {
                z4 = false;
            }
            new C839703Pv(z4, z, str, bool).LIZIZ();
        }
    }

    public static void LJJJJJL(long j, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        linkedHashMap.putAll(concurrentHashMap);
        Object obj = concurrentHashMap.get("summary_info");
        if (obj != null) {
            linkedHashMap.put("order_summary_info", obj);
        }
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("input_method", str2);
        linkedHashMap.put("page_name", "order_submit");
        if (str3 != null) {
            linkedHashMap.put("option_name", str3);
        }
        LLF("tiktokec_input_staytime", linkedHashMap);
    }

    public static void LJJJJZI(C03O0 c03o0, String str, Boolean bool, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        c03o0.getClass();
        new C835003Oa(str, bool, null, LIZIZ.get("summary_info")).LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJLIIIJL(java.lang.String r8, java.lang.String r9, java.util.HashMap r10, java.util.Map r11) {
        /*
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C03O0.LIZIZ
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.lang.String r4 = "entrance_info"
            java.util.HashMap r7 = X.C1741890vQh.LJ(r4, r5)
            boolean r0 = X.C770702zh.LIZ(r9)
            if (r0 == 0) goto L50
            if (r7 == 0) goto L1f
            java.lang.String r0 = "track_id"
            r7.put(r0, r9)
        L1f:
            java.lang.String r3 = "source_module"
            if (r11 == 0) goto L5a
            java.lang.Object r2 = r11.get(r3)
        L27:
            if (r7 == 0) goto L4b
            java.lang.String r1 = "purchase_path"
            java.lang.String r0 = "skip_pdp"
            r7.put(r1, r0)
            java.lang.String r1 = "source_page_type"
            java.lang.String r0 = "add_on_order_submit_rec"
            r7.put(r1, r0)
            java.lang.String r1 = "entrance_form"
            java.lang.String r0 = "append_goods_card"
            r7.put(r1, r0)
            if (r2 != 0) goto L42
            java.lang.String r2 = "rec_order_submit_outer_add_on_module"
        L42:
            r7.put(r3, r2)
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r7)
            if (r0 != 0) goto L4d
        L4b:
            java.lang.String r0 = "{}"
        L4d:
            r5.put(r4, r0)
        L50:
            r6.putAll(r5)
            r6.putAll(r10)
            LLF(r8, r6)
            return
        L5a:
            r2 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJJLIIIJL(java.lang.String, java.lang.String, java.util.HashMap, java.util.Map):void");
    }

    public static void LJLI(PaymentMethod paymentMethod, boolean z, boolean z2, String str) {
        String str2;
        try {
            if (!C03P5.LIZ()) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(LIZIZ);
            String strLJJIIZ = "";
            if (paymentMethod == null || (str2 = paymentMethod.id) == null) {
                str2 = "";
            }
            linkedHashMap.put("payment_method_id", str2);
            if (paymentMethod != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            }
            linkedHashMap.put("pay_type", strLJJIIZ);
            linkedHashMap.put("is_poll_order", Boolean.valueOf(z));
            linkedHashMap.put("is_three_order_campaign", Boolean.valueOf(z2));
            linkedHashMap.put("source", str);
            LLF("rd_pipo_payment_success", linkedHashMap);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0210 A[PHI: r4
      0x0210: PHI (r4v6 java.lang.String) = (r4v5 java.lang.String), (r4v7 java.lang.String) binds: [B:22:0x007c, B:24:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r11, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress r12, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CartSummaryInfo r13, java.lang.String r14, java.util.HashMap r15) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJJIJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CartSummaryInfo, java.lang.String, java.util.HashMap):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJLI(java.lang.String r6, java.util.HashMap r7, X.C719102rN r8, java.lang.Integer r9, X.EnumC805403Cq r10) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJJJJLI(java.lang.String, java.util.HashMap, X.02rN, java.lang.Integer, X.03Cq):void");
    }

    public static void LJ(int i, String str, String str2, String str3, Integer num, String str4) {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        if (num != null) {
            concurrentHashMap.put("biz_type", num);
        } else {
            concurrentHashMap.remove("biz_type");
        }
        concurrentHashMap.put("product_id", str);
        concurrentHashMap.put("seller_product_id", str2);
        concurrentHashMap.put("platform_product_id", str3);
        concurrentHashMap.put("product_id_replaced", str4);
        concurrentHashMap.put("is_platform_product", Integer.valueOf(i));
    }

    public static void LJJIJIIJIL(int i, Integer num, HashMap map, Map map2, String str, Map map3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("intercept_reason", Integer.valueOf(i));
        linkedHashMap.put("intercept_entrance", String.valueOf(num));
        linkedHashMap.putAll(LIZIZ);
        if (str != null) {
            linkedHashMap.put("payment_method_id", str);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.putAll(map3);
        C038N.LIZ(linkedHashMap, map2);
        C1018703yb.LIZIZ("rd_place_order_check_reason", linkedHashMap);
    }

    public static void LJJJJJ(C03O0 c03o0, boolean z, String str, HashMap map, String str2, int i) {
        String str3;
        if ((i & 16) != 0) {
            str3 = "normal";
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("is_valid", Integer.valueOf(z ? 1 : 0));
        if (str != null) {
            linkedHashMap.put("input_name", str);
        }
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("input_method", str3);
        linkedHashMap.put("is_fullscreen", 1);
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.putAll(map);
        if (str2 != null) {
            linkedHashMap.put("option_name", str2);
        }
        LLF("tiktokec_input_result", linkedHashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLFZ(java.lang.String r63, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r64, java.lang.String r65, com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel r66, java.lang.String r67, boolean r68) {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LLFZ(java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel, java.lang.String, boolean):void");
    }

    public static void LJJIJL(Boolean bool, Long l, Long l2, Integer num, Boolean bool2, Boolean bool3, Long l3, Boolean bool4) {
        C03OH c03oh = new C03OH(bool, l, l2, num, bool2, bool3, l3, bool4);
        if (EcTransactionRequestOpt.LIZ()) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C318901Ln(c03oh, null), 2);
        } else {
            c03oh.invoke();
        }
    }

    public static void LJJLIIIJILLIZJL(C03O0 c03o0, String str, String str2, String str3, Map map, String str4, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            str4 = "order_submit";
        }
        if ((i & 32) != 0) {
            z = false;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.putAll(LIZIZ);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", str4);
        linkedHashMap.put("popup_name", str);
        if (str2 != null) {
            linkedHashMap.put("error_code", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("pay_type", str3);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LLF("tiktokec_popup_show", linkedHashMap);
    }

    public static void LJJLIIIJ(C03O0 c03o0, String str, String str2, String str3, String str4, Map map, String str5, boolean z, int i) {
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
        if ((i & 32) != 0) {
            str5 = "order_submit";
        }
        if ((i & 64) != 0) {
            z = false;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.putAll(LIZIZ);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", str5);
        linkedHashMap.put("popup_name", str);
        if (str2 != null) {
            linkedHashMap.put("action_type", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("error_code", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("pay_type", str4);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LLF("tiktokec_popup_click", linkedHashMap);
    }

    public static void LJJLIIIJJI(C03O0 c03o0, String str, String str2, Integer num, String str3, Map map, Integer num2, JSONObject jSONObject, String str4) {
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("previous_page", str);
        linkedHashMap.put("option_type", "insurance_type");
        linkedHashMap.put("option_name", str2);
        linkedHashMap.put("is_pre_credit", String.valueOf(0));
        if (num != null) {
            linkedHashMap.put("is_default", Integer.valueOf(num.intValue()));
        }
        if (num2 != null) {
            linkedHashMap.put("if_always_default", Integer.valueOf(num2.intValue()));
        }
        if (str3 != null) {
            linkedHashMap.put("option_price", str3);
        }
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.get(next));
            }
        }
        if (map != null) {
            C038N.LIZ(linkedHashMap, map);
        }
        if (str4 != null) {
            linkedHashMap.put("product_id", str4);
        }
        LLF("tiktokec_select_option", linkedHashMap);
    }

    public static void LJJLJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("source", str);
        if (str2 != null) {
            linkedHashMap.put("checkout_type", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("shop_tab_ab", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("payment_status", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("error_code", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("pay_type", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("pay_request_id", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("payment_method_id", str8);
        }
        if (str9 != null) {
            linkedHashMap.put("order_pay_schema", str9);
        }
        C1421105hJ.LIZJ("rd_tiktokec_pay_result_route", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIIJI(int r16, int r17, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r18, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r19, java.util.concurrent.CopyOnWriteArrayList r20, java.util.Map r21, int r22, java.util.Map r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJJIJIIJI(int, int, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.util.concurrent.CopyOnWriteArrayList, java.util.Map, int, java.util.Map, java.lang.String, java.lang.String):void");
    }

    public static void LJLJJLL(Integer num, long j, boolean z, long j2, Integer num2, String str, boolean z2, Boolean bool, Map map, Map map2) {
        if (num != null && num.intValue() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LJLJLJ(map, linkedHashMap, "checkout_type");
            LJLJLJ(map, linkedHashMap, "previous_page");
            LJLJLJ(map, linkedHashMap, "source_page_type");
            LJLJLJ(map, linkedHashMap, "enter_from");
            LJLJLJ(map, linkedHashMap, "enter_from_info");
            LJLJLJ(map, linkedHashMap, "entrance_form");
            LJLJLJ(map, linkedHashMap, "is_preload");
            LJLJLJ(map, linkedHashMap, "is_full_preload");
            C038N.LIZ(linkedHashMap, map2);
            linkedHashMap.put("change_type", num);
            Object obj = LIZIZ.get("page_name");
            if (obj == null) {
                obj = "order_submit";
            }
            linkedHashMap.put("page_name", obj);
            linkedHashMap.put("render_chunk_time_cost", Long.valueOf(j2));
            linkedHashMap.put("time_cost", Long.valueOf(j));
            linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("is_retry", Integer.valueOf(z2 ? 1 : 0));
            if (num2 != null) {
                linkedHashMap.put("error_code", Integer.valueOf(num2.intValue()));
            }
            if (str != null) {
                linkedHashMap.put("error_msg", str);
            }
            if (bool != null) {
                linkedHashMap.put("is_chunk", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            LLF("rd_tiktokec_second_refresh_perf", linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJLIIIL(java.lang.String r5, boolean r6, java.lang.String r7, java.lang.String r8, long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16, org.json.JSONObject r17, java.lang.Integer r18, java.util.Map r19) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJLIIIL(java.lang.String, boolean, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.json.JSONObject, java.lang.Integer, java.util.Map):void");
    }

    public static void LJJJZ(C03O0 c03o0, String str, HashMap map, String str2, String str3, Boolean bool, Integer num, String str4, String str5, Integer num2, Map map2, Map map3, String str6, String str7, int i) {
        String str8 = str6;
        String str9 = null;
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str4 = null;
        }
        if ((i & 8192) != 0) {
            str5 = null;
        }
        if ((i & 16384) != 0) {
            num2 = null;
        }
        if ((32768 & i) != 0) {
            map2 = null;
        }
        if ((131072 & i) != 0) {
            map3 = null;
        }
        if ((262144 & i) != 0) {
            str8 = null;
        }
        if ((i & 524288) == 0) {
            str9 = str7;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        linkedHashMap.put("module_name", str);
        if (Intrinsics.LJFF(str, "logistics") && str2 != null) {
            linkedHashMap.put("free_shipping_condition", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("pay_type", str3);
        }
        if (bool != null) {
            linkedHashMap.put("is_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (num != null) {
            num.intValue();
            linkedHashMap.put("is_valid", num);
        }
        if (str4 != null) {
            linkedHashMap.put("invalid_reason", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("invalid_reason_code", str5);
        }
        if (num2 != null) {
            linkedHashMap.put("rank", Integer.valueOf(num2.intValue()));
        }
        if (str8 != null) {
            linkedHashMap.put("trigger_event", str8);
        }
        if (str9 != null) {
            linkedHashMap.put("bubble_type", str9);
        }
        C038N.LIZ(linkedHashMap, map2);
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        LLF("tiktokec_module_show", linkedHashMap);
    }

    public static void LJJJLZIJ(C03O0 c03o0, String str, HashMap map, String str2, Boolean bool, Float f, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, Map map2, Map map3, String str9, String str10, int i) {
        String str11;
        String str12 = str2;
        String str13 = str3;
        Float f2 = f;
        Integer num2 = num;
        String str14 = str5;
        String str15 = str4;
        String str16 = str8;
        String str17 = str7;
        String str18 = str6;
        String str19 = str9;
        Map map4 = map3;
        Map map5 = map2;
        String str20 = null;
        if ((i & 8) != 0) {
            str12 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            f2 = null;
        }
        if ((i & 64) != 0) {
            str13 = null;
        }
        if ((i & 128) != 0) {
            str15 = null;
        }
        if ((i & 256) != 0) {
            str14 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num2 = null;
        }
        if ((i & 8192) != 0) {
            str18 = null;
        }
        if ((i & 16384) != 0) {
            str17 = null;
        }
        if ((32768 & i) != 0) {
            str16 = null;
        }
        if ((65536 & i) != 0) {
            map5 = null;
        }
        if ((131072 & i) != 0) {
            map4 = null;
        }
        if ((262144 & i) != 0) {
            str19 = null;
        }
        if ((i & 524288) == 0) {
            str20 = str10;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        linkedHashMap.put("module_name", str);
        if (str17 != null) {
            linkedHashMap.put("click_area", str17);
        }
        if (str12 != null) {
            linkedHashMap.put("action_type", str12);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str11 = "1";
            } else {
                str11 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_default", str11);
        }
        if (Intrinsics.LJFF(str, "logistics")) {
            if (f2 != null) {
                linkedHashMap.put("shipping_price", f2);
            }
            if (str13 != null) {
                linkedHashMap.put("shipping_currency", str13);
            }
            if (str15 != null) {
                linkedHashMap.put("free_shipping_condition", str15);
            }
        }
        if (str14 != null) {
            linkedHashMap.put("pay_type", str14);
        }
        if (str16 != null) {
            linkedHashMap.put("invalid_reason_code", str16);
        }
        if (num2 != null) {
            num2.intValue();
            linkedHashMap.put("is_valid", num2);
        }
        if (str18 != null) {
            linkedHashMap.put("invalid_reason", str18);
        }
        if (str19 != null) {
            linkedHashMap.put("trigger_event", str19);
        }
        if (str20 != null) {
            linkedHashMap.put("bubble_type", str20);
        }
        C038N.LIZ(linkedHashMap, map5);
        if (map4 != null) {
            linkedHashMap.putAll(map4);
        }
        LLF("tiktokec_module_click", linkedHashMap);
    }

    public static void LJLJJI(C03O0 c03o0, String str, Long l, String str2, String str3, Boolean bool, String str4, CommuteType commuteType, String str5, String str6, Long l2, Map map, Map map2, String str7, String str8, String str9, Map map3, int i) {
        Map map4 = map2;
        Map map5 = map;
        Long l3 = l2;
        String str10 = str4;
        String str11 = str9;
        String str12 = str3;
        String str13 = str8;
        String str14 = str2;
        CommuteType commuteType2 = commuteType;
        String str15 = str7;
        Long l4 = l;
        Map map6 = null;
        if ((i & 2) != 0) {
            l4 = null;
        }
        if ((i & 4) != 0) {
            str14 = null;
        }
        if ((i & 8) != 0) {
            str12 = null;
        }
        if ((i & 32) != 0) {
            str10 = null;
        }
        if ((i & 64) != 0) {
            commuteType2 = null;
        }
        if ((i & 512) != 0) {
            l3 = -1L;
        }
        if ((i & 1024) != 0) {
            map5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map4 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str15 = null;
        }
        if ((i & 8192) != 0) {
            str13 = null;
        }
        if ((i & 16384) != 0) {
            str11 = null;
        }
        if ((i & 32768) == 0) {
            map6 = map3;
        }
        c03o0.getClass();
        C1018703yb.LIZLLL("rd_tiktokec_pay_result", new C925203jW(commuteType2, bool, l3, l4, str, str14, str12, str10, str5, str6, str15, str13, str11, map5, map4, map6));
    }

    public static void LJJJJZ(C03O0 c03o0, String str, String str2, HashMap map, String str3, String str4, Boolean bool, Map map2, String str5, Integer num, String str6, Boolean bool2, Float f, Boolean bool3, HashMap map3, Map map4, String str7, String str8, int i) {
        Long l;
        HashMap<String, Object> mapLJIIJ;
        Map map5 = map2;
        String str9 = str5;
        String str10 = str6;
        String str11 = str7;
        Map map6 = map4;
        String str12 = str8;
        HashMap map7 = map3;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 1024) != 0) {
            bool = null;
        }
        if ((i & 8192) != 0) {
            map5 = null;
        }
        if ((i & 16384) != 0) {
            str9 = null;
        }
        if ((32768 & i) != 0) {
            num = null;
        }
        if ((65536 & i) != 0) {
            str10 = null;
        }
        if ((131072 & i) != 0) {
            bool2 = null;
        }
        if ((262144 & i) != 0) {
            f = null;
        }
        if ((524288 & i) != 0) {
            bool3 = null;
        }
        if ((1048576 & i) != 0) {
            map7 = null;
        }
        if ((2097152 & i) != 0) {
            map6 = null;
        }
        if ((4194304 & i) != 0) {
            str11 = null;
        }
        if ((i & 8388608) != 0) {
            str12 = null;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("button_type", str2);
        }
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_recommended", C893803eS.LIZ(bool.booleanValue()));
        }
        if (str4 != null) {
            linkedHashMap.put("page_name", str4);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (str3 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str3)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        if (map5 != null) {
            linkedHashMap.putAll(map5);
        }
        if (str9 != null) {
            linkedHashMap.put("error_code", str9);
        }
        if (num != null) {
            linkedHashMap.put("rank", Integer.valueOf(num.intValue()));
        }
        if (str10 != null) {
            linkedHashMap.put("shop_id", str10);
        }
        Object obj = linkedHashMap.get("enter_from");
        Object obj2 = obj;
        if (obj == null) {
            Object obj3 = linkedHashMap.get("enter_from_info");
            obj2 = obj3;
            if (obj3 == null) {
                obj2 = "";
            }
        }
        linkedHashMap.put("enter_from", obj2);
        Object objLIZ = C7726030a.LIZ("button_sub_text_countdown", linkedHashMap);
        if ((objLIZ instanceof Long) && (l = (Long) objLIZ) != null) {
            linkedHashMap.put("button_sub_text_countdown", Long.valueOf((l.longValue() - System.currentTimeMillis()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_cod_available", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (f != null) {
            linkedHashMap.put("discounted_amount", Float.valueOf(f.floatValue()));
        }
        if (bool3 != null) {
            linkedHashMap.put("disabled", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
        }
        if (map7 != null) {
            linkedHashMap.putAll(map7);
        }
        if (map6 != null) {
            linkedHashMap.putAll(map6);
        }
        if (str11 != null) {
            linkedHashMap.put("place_order_pay_later_show_type", str11);
        }
        if (str12 != null) {
            linkedHashMap.put("bnpl_status", str12);
        }
        C1018503yZ.LIZIZ("tiktokec_button_show", linkedHashMap, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    public static void LJLLI(C03O0 c03o0, String str, String str2, int i, boolean z, String str3, Boolean bool, InstallmentPlan installmentPlan, String str4, String str5, Boolean bool2, PaymentMethod paymentMethod, Boolean bool3, String str6, Map map, boolean z2, String str7, String str8, int i2) {
        Object obj;
        String promotionBatchId;
        String str9;
        Map<String, Object> mapLIZ;
        String desc;
        Map<String, Object> mapConstructDaInfo;
        String str10;
        String priceStr;
        PaymentPromotion paymentPromotion;
        String desc2;
        String strLJIJJ;
        String strLJIJ;
        Map map2 = map;
        String str11 = str6;
        String str12 = str7;
        PaymentMethod paymentMethod2 = paymentMethod;
        String str13 = str5;
        String str14 = str4;
        InstallmentPlan installmentPlan2 = installmentPlan;
        String str15 = str8;
        Boolean bool4 = bool;
        String str16 = str3;
        if ((i2 & 32) != 0) {
            str16 = null;
        }
        if ((i2 & 64) != 0) {
            bool4 = null;
        }
        if ((i2 & 128) != 0) {
            installmentPlan2 = null;
        }
        if ((i2 & 256) != 0) {
            str14 = null;
        }
        if ((i2 & 512) != 0) {
            str13 = null;
        }
        if ((i2 & 1024) != 0) {
            bool2 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            paymentMethod2 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool3 = null;
        }
        if ((i2 & 8192) != 0) {
            str11 = null;
        }
        if ((i2 & 16384) != 0) {
            map2 = null;
        }
        ?? r38 = z2;
        if ((32768 & i2) != 0) {
            r38 = 0;
        }
        if ((131072 & i2) != 0) {
            str12 = "normal";
        }
        if ((i2 & 262144) != 0) {
            str15 = null;
        }
        c03o0.getClass();
        List<String> list = LJIIJJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(i);
        if (!((ArrayList) list).contains(C2188811AlT.LIZIZ(sbLIZ))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
            linkedHashMap.putAll(concurrentHashMap);
            linkedHashMap.put("parent_option_name", str);
            linkedHashMap.put("option_name", str2);
            linkedHashMap.put("option_type", "sub_payment_type");
            linkedHashMap.put("rank", Integer.valueOf(i));
            linkedHashMap.put("is_pre_credit", String.valueOf((int) r38));
            linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
            if (bool2 != null) {
                linkedHashMap.put("is_payment_promoted", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
                if (paymentMethod2 == null || (strLJIJJ = paymentMethod2.LJIJJ(false)) == null) {
                    strLJIJJ = "";
                }
                linkedHashMap.put("promotion_info", strLJIJJ);
                if (paymentMethod2 == null || (strLJIJ = paymentMethod2.LJIJ()) == null) {
                    strLJIJ = "";
                }
                linkedHashMap.put("marketing_batch_id", strLJIJ);
            }
            if (str16 != null && str16.length() != 0) {
                linkedHashMap.put("status_code", str16);
            }
            linkedHashMap.put("is_default", C893803eS.LIZ(Intrinsics.LJFF(bool4, Boolean.TRUE)));
            if (installmentPlan2 != null) {
                Amount amount = installmentPlan2.totalFee;
                if (amount == null || (priceStr = amount.getPriceStr()) == null) {
                    priceStr = "";
                }
                linkedHashMap.put("service_fee", priceStr);
                String str17 = installmentPlan2.tenure;
                if (str17 == null) {
                    str17 = "";
                }
                linkedHashMap.put("installment_cnt", str17);
                if (str14 == null) {
                    str14 = "";
                }
                linkedHashMap.put("total_payment", str14);
                Map<String, Object> mapLIZ2 = installmentPlan2.LIZ();
                if (mapLIZ2 != null) {
                    linkedHashMap.putAll(mapLIZ2);
                }
                PaymentServiceFeeInfo paymentServiceFeeInfo = installmentPlan2.paymentServiceFeeInfo;
                if (paymentServiceFeeInfo != null && (paymentPromotion = paymentServiceFeeInfo.paymentPromotionInfo) != null && (desc2 = paymentPromotion.getDesc()) != null) {
                    linkedHashMap.put("service_fee_promotion", desc2);
                }
            }
            if (paymentMethod2 != null && (str10 = paymentMethod2.id) != null) {
                linkedHashMap.put("payment_method_id", str10);
            }
            if (str13 != null) {
                linkedHashMap.put("currency", str13);
            }
            if (bool3 != null) {
                linkedHashMap.put("is_recommended_tag", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
            }
            if (str11 != null) {
                linkedHashMap.put("promotion_type", str11);
            }
            linkedHashMap.put("trigger_event", str12);
            if (str15 != null) {
                linkedHashMap.put("bubble_type", str15);
            }
            if (map2 == null || (obj = map2.get("checkout_type")) == null) {
                obj = "";
            }
            linkedHashMap.put("checkout_type", obj);
            LLF("tiktokec_option_show", linkedHashMap);
            if (installmentPlan2 != null && installmentPlan2.LJ()) {
                try {
                    if (C03P6.LIZ()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(concurrentHashMap);
                        linkedHashMap2.put("parent_option_name", str);
                        try {
                            linkedHashMap2.put("option_name", str2);
                            linkedHashMap2.put("option_type", "sub_payment_type");
                            linkedHashMap2.put("rank", Integer.valueOf(i));
                            PaymentPromotion paymentPromotion2 = installmentPlan2.promotionInfo;
                            if (paymentPromotion2 == null || (promotionBatchId = paymentPromotion2.getPromotionBatchId()) == null) {
                                promotionBatchId = "";
                            }
                            linkedHashMap2.put("marketing_batch_id", promotionBatchId);
                            String str18 = installmentPlan2.tenure;
                            if (str18 == null) {
                                str18 = "";
                            }
                            linkedHashMap2.put("installment_cnt", str18);
                            if (str11 != null) {
                                linkedHashMap2.put("promotion_type", str11);
                            }
                            PaymentPromotion paymentPromotion3 = installmentPlan2.promotionInfo;
                            if (paymentPromotion3 != null && (desc = paymentPromotion3.getDesc()) != null && (!a0.LJJJIL(desc))) {
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                                linkedHashMap3.put("promotion_info", desc);
                                PaymentPromotion paymentPromotion4 = installmentPlan2.promotionInfo;
                                if (paymentPromotion4 != null && (mapConstructDaInfo = paymentPromotion4.constructDaInfo()) != null) {
                                    linkedHashMap3.putAll(mapConstructDaInfo);
                                }
                                C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap3);
                            }
                            InterestFeePromotion interestFeePromotion = installmentPlan2.interestFeePromotion;
                            if (interestFeePromotion != null && (str9 = interestFeePromotion.desc) != null && (!a0.LJJJIL(str9))) {
                                LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap2);
                                linkedHashMap4.put("promotion_info", str9);
                                InterestFeePromotion interestFeePromotion2 = installmentPlan2.interestFeePromotion;
                                if (interestFeePromotion2 != null && (mapLIZ = interestFeePromotion2.LIZ()) != null) {
                                    linkedHashMap4.putAll(mapLIZ);
                                }
                                C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap4);
                            }
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJFF(e, "logSubPaymentPromotionShow failed");
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            ((ArrayList) LJIIJJI).add(str2 + i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cf A[PHI: r10
      0x01cf: PHI (r10v9 java.lang.String) = (r10v6 java.lang.String), (r10v10 java.lang.String) binds: [B:115:0x01a3, B:112:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r46v1, types: [int] */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r46v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJLL(X.C03O0 r30, java.lang.String r31, java.lang.String r32, int r33, boolean r34, java.lang.String r35, java.lang.Boolean r36, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r37, java.lang.String r38, java.lang.String r39, java.lang.Boolean r40, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r41, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r42, java.lang.Boolean r43, java.lang.String r44, java.util.Map r45, boolean r46, boolean r47, X.C03WJ r48, int r49) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJLL(X.03O0, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, java.lang.String, java.lang.String, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.lang.Boolean, java.lang.String, java.util.Map, boolean, boolean, X.03WJ, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r40v1, types: [int] */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    public static void LJJZZIII(C03O0 c03o0, PaymentMethod paymentMethod, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, PaymentPromotion paymentPromotion, String str3, String str4, Map map, Map map2, String str5, String str6, boolean z5, int i2) {
        ?? BooleanValue;
        Object obj;
        InterestFeePromotion interestFeePromotion;
        Map<String, Object> mapLIZ;
        Map<String, Object> mapConstructDaInfo;
        String desc;
        String str7;
        String str8 = str5;
        Map map3 = map2;
        String str9 = str4;
        Map map4 = map;
        Boolean bool4 = bool;
        String str10 = str3;
        String str11 = str2;
        String str12 = str6;
        String str13 = str;
        if ((i2 & 128) != 0) {
            str13 = null;
        }
        if ((i2 & 256) != 0) {
            str11 = null;
        }
        if ((i2 & 512) != 0) {
            bool4 = null;
        }
        if ((i2 & 1024) != 0) {
            bool2 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool3 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            paymentPromotion = null;
        }
        if ((i2 & 8192) != 0) {
            str10 = null;
        }
        if ((i2 & 16384) != 0) {
            str9 = null;
        }
        if ((32768 & i2) != 0) {
            map4 = null;
        }
        if ((65536 & i2) != 0) {
            map3 = null;
        }
        if ((131072 & i2) != 0) {
            str8 = "normal";
        }
        if ((262144 & i2) != 0) {
            str12 = null;
        }
        ?? r40 = z5;
        if ((i2 & 524288) != 0) {
            r40 = 0;
        }
        c03o0.getClass();
        if (!((ArrayList) LJIIJ).contains(paymentMethod.LJIIJ())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
            linkedHashMap.putAll(concurrentHashMap);
            linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
            linkedHashMap.put("is_pre_credit", String.valueOf((int) r40));
            linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
            if (bool4 != null) {
                linkedHashMap.put("is_payment_promoted", Integer.valueOf(bool4.booleanValue() ? 1 : 0));
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
            linkedHashMap.put("rank", Integer.valueOf(i));
            linkedHashMap.put("option_type", "payment_type");
            linkedHashMap.put("is_pay_saved", Integer.valueOf(z2 ? 1 : 0));
            linkedHashMap.put("is_balance_shown", Integer.valueOf(z3 ? 1 : 0));
            linkedHashMap.put("is_default", C893803eS.LIZ(z4));
            if (str13 != null && str13.length() != 0) {
                linkedHashMap.put("option_unavailable_code", str13);
            }
            if (str11 != null && str11.length() != 0) {
                linkedHashMap.put("status_code", str11);
            }
            BindInfo bindInfo = paymentMethod.bindInfo;
            if (bindInfo != null && (str7 = bindInfo.bindStatus) != null && str7.length() > 0) {
                linkedHashMap.put("pay_bind_status", str7);
            }
            if (bool2 != null) {
                linkedHashMap.put("is_info_needed", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
            }
            String str14 = paymentMethod.id;
            if (str14 != null) {
                linkedHashMap.put("payment_method_id", str14);
            }
            if (bool3 != null) {
                linkedHashMap.put("is_installment", C893803eS.LIZ(bool3.booleanValue()));
            }
            if (paymentPromotion != null && (desc = paymentPromotion.getDesc()) != null) {
                linkedHashMap.put("service_fee_promotion", desc);
            }
            Boolean bool5 = paymentMethod.needsIndependentPricing;
            if (bool5 != null) {
                BooleanValue = bool5.booleanValue();
            } else {
                BooleanValue = 0;
            }
            linkedHashMap.put("needs_independent_pricing", Integer.valueOf((int) BooleanValue));
            if (str10 != null) {
                linkedHashMap.put("payment_method_type", str10);
            }
            if (str9 != null) {
                linkedHashMap.put("promotion_type", str9);
            }
            linkedHashMap.put("trigger_event", str8);
            if (str12 != null) {
                linkedHashMap.put("bubble_type", str12);
            }
            if (map4 == null || (obj = map4.get("checkout_type")) == null) {
                obj = "";
            }
            linkedHashMap.put("checkout_type", obj);
            Map<String, Object> mapLIZIZ = paymentMethod.LIZIZ();
            if (mapLIZIZ != null && (!mapLIZIZ.isEmpty())) {
                linkedHashMap.putAll(mapLIZIZ);
            }
            C038N.LIZ(linkedHashMap, map3);
            LLF("tiktokec_option_show", linkedHashMap);
            if (Intrinsics.LJFF(bool4, Boolean.TRUE)) {
                String strLJJIIZ = paymentMethod.LJJIIZ();
                try {
                    if (C03P6.LIZ()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(concurrentHashMap);
                        linkedHashMap2.put("option_name", strLJJIIZ);
                        linkedHashMap2.put("option_type", "payment_type");
                        linkedHashMap2.put("rank", Integer.valueOf(i));
                        String strLJIJ2 = paymentMethod.LJIJ();
                        if (strLJIJ2 == null) {
                            strLJIJ2 = "";
                        }
                        linkedHashMap2.put("marketing_batch_id", strLJIJ2);
                        if (str9 != null) {
                            linkedHashMap2.put("promotion_type", str9);
                        }
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
                        if (strLJJII != null && (true ^ a0.LJJJIL(strLJJII))) {
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap2);
                            linkedHashMap4.put("promotion_info", strLJJII);
                            InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
                            if (installmentInfo != null && (interestFeePromotion = installmentInfo.interestFeePromotion) != null && (mapLIZ = interestFeePromotion.LIZ()) != null) {
                                linkedHashMap4.putAll(mapLIZ);
                            }
                            C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap4);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "logPaymentPromotionShow failed");
                }
            }
            ((ArrayList) LJIIJ).add(paymentMethod.LJIIJ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r52v1, types: [int] */
    /* JADX WARN: Type inference failed for: r52v2 */
    /* JADX WARN: Type inference failed for: r52v3 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v42 */
    public static void LJL(C03O0 c03o0, String str, boolean z, int i, String str2, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, String str6, Boolean bool, Boolean bool2, Map map, PaymentMethod paymentMethod, Boolean bool3, PaymentPromotion paymentPromotion, String str7, boolean z5, String str8, String str9, Map map2, String str10, String str11, boolean z6, boolean z7, boolean z8, C03WJ c03wj, String str12, int i2) {
        boolean z9;
        ?? BooleanValue;
        Object obj;
        String str13;
        boolean zLJFF;
        boolean z10;
        InterestFeePromotion interestFeePromotion;
        Map<String, Object> mapLIZ;
        Map<String, Object> mapConstructDaInfo;
        PaymentServiceFeeInfo paymentServiceFeeInfo;
        PaymentPromotion paymentPromotion2;
        String desc;
        Boolean bool4;
        String desc2;
        String str14;
        Map<String, Object> mapLIZIZ;
        String strLJIJJ;
        String strLJIJ;
        String str15 = str12;
        C03WJ c03wj2 = c03wj;
        boolean z11 = z8;
        String str16 = str9;
        String str17 = str8;
        String str18 = str11;
        String str19 = str10;
        PaymentMethod paymentMethod2 = paymentMethod;
        Map map3 = map;
        String str20 = str3;
        Boolean bool5 = bool;
        Map map4 = map2;
        String str21 = str7;
        String str22 = str6;
        String str23 = str4;
        if ((i2 & 64) != 0) {
            str20 = null;
        }
        if ((i2 & 128) != 0) {
            str23 = null;
        }
        if ((i2 & 512) != 0) {
            z4 = false;
        }
        if ((i2 & 1024) != 0) {
            str22 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool5 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool2 = null;
        }
        if ((i2 & 8192) != 0) {
            map3 = null;
        }
        if ((i2 & 16384) != 0) {
            paymentMethod2 = null;
        }
        if ((32768 & i2) != 0) {
            bool3 = null;
        }
        if ((65536 & i2) != 0) {
            paymentPromotion = null;
        }
        if ((131072 & i2) != 0) {
            str21 = null;
        }
        if ((262144 & i2) != 0) {
            z5 = false;
        }
        if ((524288 & i2) != 0) {
            str17 = null;
        }
        if ((1048576 & i2) != 0) {
            str16 = null;
        }
        if ((2097152 & i2) != 0) {
            map4 = null;
        }
        if ((4194304 & i2) != 0) {
            str19 = "normal";
        }
        if ((8388608 & i2) != 0) {
            str18 = null;
        }
        ?? r52 = z6;
        if ((16777216 & i2) != 0) {
            r52 = 0;
        }
        if ((33554432 & i2) != 0) {
            z7 = false;
        }
        if ((67108864 & i2) != 0) {
            z11 = false;
        }
        if ((134217728 & i2) != 0) {
            c03wj2 = null;
        }
        if ((268435456 & i2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i2 & 536870912) != 0) {
            str15 = null;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        linkedHashMap.putAll(concurrentHashMap);
        linkedHashMap.put("option_name", str);
        linkedHashMap.put("is_pre_credit", String.valueOf((int) r52));
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        if (bool5 != null) {
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(bool5.booleanValue() ? 1 : 0));
            if (paymentMethod2 == null || (strLJIJJ = paymentMethod2.LJIJJ(false)) == null) {
                strLJIJJ = "";
            }
            linkedHashMap.put("promotion_info", strLJIJJ);
            if (paymentMethod2 == null || (strLJIJ = paymentMethod2.LJIJ()) == null) {
                strLJIJ = "";
            }
            linkedHashMap.put("marketing_batch_id", strLJIJ);
        }
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("option_type", str2);
        linkedHashMap.put("is_default", C893803eS.LIZ(z4));
        linkedHashMap.put("is_pay_saved", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_balance_shown", Integer.valueOf(z3 ? 1 : 0));
        if (paymentMethod2 != null && (mapLIZIZ = paymentMethod2.LIZIZ()) != null && (!mapLIZIZ.isEmpty())) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        if (str22 != null) {
            linkedHashMap.put("parent_option_name", str22);
        }
        if (str20 != null && str20.length() != 0) {
            linkedHashMap.put("option_unavailable_code", str20);
        }
        if (str23 != null && str23.length() != 0) {
            linkedHashMap.put("status_code", str23);
        }
        if (str5 != null && str5.length() > 0) {
            linkedHashMap.put("pay_bind_status", str5);
        }
        if (bool2 != null) {
            linkedHashMap.put("is_info_needed", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (paymentMethod2 != null && (str14 = paymentMethod2.id) != null) {
            linkedHashMap.put("payment_method_id", str14);
        }
        if (bool3 != null) {
            linkedHashMap.put("is_installment", C893803eS.LIZ(bool3.booleanValue()));
        }
        if (paymentPromotion != null && (desc2 = paymentPromotion.getDesc()) != null) {
            linkedHashMap.put("service_fee_promotion", desc2);
        }
        C038N.LIZ(linkedHashMap, map3);
        if (paymentMethod2 != null && (bool4 = paymentMethod2.needsIndependentPricing) != null) {
            BooleanValue = bool4.booleanValue();
        } else {
            BooleanValue = 0;
        }
        linkedHashMap.put("needs_independent_pricing", Integer.valueOf((int) BooleanValue));
        if (paymentMethod2 != null && (paymentServiceFeeInfo = paymentMethod2.paymentServiceFeeInfo) != null && (paymentPromotion2 = paymentServiceFeeInfo.paymentPromotionInfo) != null && (desc = paymentPromotion2.getDesc()) != null) {
            linkedHashMap.put("service_fee_promotion", desc);
        }
        if (str21 != null) {
            linkedHashMap.put("payment_method_type", str21);
        }
        linkedHashMap.put("is_combine_default", C893803eS.LIZ(z5));
        if (str17 != null) {
            linkedHashMap.put("combine_default_option_name", str17);
        }
        if (str16 != null) {
            linkedHashMap.put("promotion_type", str16);
        }
        linkedHashMap.put("trigger_event", str19);
        if (str18 != null) {
            linkedHashMap.put("bubble_type", str18);
        }
        if (str15 != null) {
            linkedHashMap.put("select_type", str15);
        }
        if (map4 == null || (obj = map4.get("checkout_type")) == null) {
            obj = "";
        }
        linkedHashMap.put("checkout_type", obj);
        C03WI c03wi = LJIIZILJ;
        if (paymentMethod2 != null) {
            str13 = paymentMethod2.id;
            zLJFF = Intrinsics.LJFF(paymentMethod2.isChooseRecommend, Boolean.TRUE);
        } else {
            str13 = null;
            zLJFF = false;
        }
        C03WJ c03wj3 = new C03WJ(str13, paymentMethod2, null, zLJFF);
        if (!z7 && !z5) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (paymentMethod2 != null) {
            paymentMethod2.LJJLI();
        }
        c03wi.LIZ(linkedHashMap, c03wj3, z10, z11, c03wj2, z9);
        C1018703yb.LIZIZ("tiktokec_select_option", linkedHashMap);
        C921903iz.LIZ.getClass();
        C921903iz.LIZIZ(4, linkedHashMap, "logPaymentSelectOption");
        if (Intrinsics.LJFF(bool5, Boolean.TRUE) && paymentMethod2 != null) {
            try {
                if (C03P6.LIZ()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(concurrentHashMap);
                    linkedHashMap2.put("option_name", str);
                    linkedHashMap2.put("option_type", str2);
                    linkedHashMap2.put("rank", Integer.valueOf(i));
                    String strLJIJ2 = paymentMethod2.LJIJ();
                    if (strLJIJ2 == null) {
                        strLJIJ2 = "";
                    }
                    linkedHashMap2.put("marketing_batch_id", strLJIJ2);
                    if (str16 != null) {
                        linkedHashMap2.put("promotion_type", str16);
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
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "logPaymentPromotionSelect failed");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r43v1, types: [int] */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v3 */
    public static void LJJLIIIJJIZ(C03O0 c03o0, boolean z, String str, Boolean bool, Boolean bool2, HashMap map, Long l, String str2, String str3, String str4, Integer num, String str5, String str6, Map map2, Map map3, Integer num2, Integer num3, Map map4, Integer num4, Map map5, Boolean bool3, Map map6, boolean z2, Boolean bool4, HashMap map7, String str7, Boolean bool5, Float f, Boolean bool6, List list, HashMap map8, String str8, String str9, Integer num5, int i, int i2) {
        LinkedHashMap linkedHashMap;
        Long l2;
        HashMap<String, Object> mapLJIIJ;
        Integer num6 = num;
        String str10 = str4;
        String str11 = str3;
        String str12 = str2;
        Long l3 = l;
        String str13 = str9;
        String str14 = str8;
        HashMap map9 = map8;
        Map map10 = map6;
        Map map11 = map4;
        String str15 = str7;
        Map map12 = map3;
        HashMap map13 = map7;
        Map map14 = map2;
        Map map15 = map5;
        String str16 = str6;
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            l3 = null;
        }
        if ((i & 64) != 0) {
            str12 = null;
        }
        if ((i & 128) != 0) {
            str11 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            num6 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str16 = null;
        }
        if ((i & 8192) != 0) {
            map14 = null;
        }
        if ((i & 16384) != 0) {
            map12 = null;
        }
        if ((32768 & i) != 0) {
            num2 = null;
        }
        if ((65536 & i) != 0) {
            num3 = null;
        }
        if ((131072 & i) != 0) {
            map11 = null;
        }
        if ((262144 & i) != 0) {
            num4 = null;
        }
        if ((524288 & i) != 0) {
            map15 = null;
        }
        if ((1048576 & i) != 0) {
            bool3 = null;
        }
        if ((2097152 & i) != 0) {
            map10 = null;
        }
        ?? r43 = z2;
        if ((4194304 & i) != 0) {
            r43 = 0;
        }
        if ((8388608 & i) != 0) {
            bool4 = null;
        }
        if ((16777216 & i) != 0) {
            map13 = null;
        }
        if ((33554432 & i) != 0) {
            str15 = null;
        }
        if ((67108864 & i) != 0) {
            bool5 = null;
        }
        if ((134217728 & i) != 0) {
            f = null;
        }
        if ((268435456 & i) != 0) {
            bool6 = null;
        }
        if ((536870912 & i) != 0) {
            list = null;
        }
        if ((1073741824 & i) != 0) {
            map9 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            str14 = null;
        }
        if ((i2 & 1) != 0) {
            str13 = null;
        }
        if ((i2 & 2) != 0) {
            num5 = null;
        }
        c03o0.getClass();
        if (LIZJ > 0) {
            linkedHashMap = new LinkedHashMap();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - LIZJ;
            linkedHashMap.putAll(LIZIZ);
            linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("quit_type", str);
            linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime));
            if (l3 != null) {
                l3.longValue();
                linkedHashMap.put("stay_time", l3);
            }
            if (bool != null) {
                linkedHashMap.put("is_edit_address", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            if (bool2 != null) {
                linkedHashMap.put("is_edit_quantity", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
            }
            if (str16 != null) {
                linkedHashMap.put("delivery_info", str16);
            }
            if (str12 != null) {
                linkedHashMap.put("page_name", str12);
            }
            if (str11 != null) {
                linkedHashMap.put("previous_page", str11);
            }
            linkedHashMap.putAll(map);
            if (str10 != null) {
                linkedHashMap.put("promotion_source", str10);
            }
            if (num6 != null) {
                num6.intValue();
                linkedHashMap.put("add_on_product_num", num6);
            }
            if (str5 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str5)) != null) {
                linkedHashMap.putAll(mapLJIIJ);
            }
            linkedHashMap.put("shipping_rights_content", LJIJ);
            C038N.LIZ(linkedHashMap, map14);
            if (map12 != null) {
                linkedHashMap.putAll(map12);
            }
            if (num2 != null) {
                linkedHashMap.put("is_delivery_info_complete_when_leave", Integer.valueOf(num2.intValue()));
            }
            if (num3 != null) {
                linkedHashMap.put("is_pay_info_complete_when_leave", Integer.valueOf(num3.intValue()));
            }
            LIZ.getClass();
            LIZJ(linkedHashMap, map11);
            if (num4 != null) {
                linkedHashMap.put("subscribe_sku_cnt", Integer.valueOf(num4.intValue()));
            }
            if (map15 != null) {
                linkedHashMap.putAll(map15);
            }
            if (bool3 != null) {
                linkedHashMap.put("if_item_insurance", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
            }
            if (map10 != null) {
                linkedHashMap.putAll(map10);
            }
            linkedHashMap.put("is_submit_order_success", Integer.valueOf((int) r43));
            if (bool4 != null) {
                linkedHashMap.put("is_open_redeem_bonus", Integer.valueOf(bool4.booleanValue() ? 1 : 0));
            }
            if (map13 != null) {
                linkedHashMap.putAll(map13);
            }
            if (str15 != null) {
                linkedHashMap.put("shipping_module_rk", str15);
            }
            Object objLIZ = C7726030a.LIZ("button_sub_text_countdown", linkedHashMap);
            if ((objLIZ instanceof Long) && (l2 = (Long) objLIZ) != null) {
                linkedHashMap.put("button_sub_text_countdown", Long.valueOf((l2.longValue() - System.currentTimeMillis()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            }
            if (bool5 != null) {
                linkedHashMap.put("is_cod_available", Integer.valueOf(bool5.booleanValue() ? 1 : 0));
            }
            if (f != null) {
                linkedHashMap.put("discounted_amount", Float.valueOf(f.floatValue()));
            }
            if (map9 != null) {
                linkedHashMap.putAll(map9);
            }
            if (bool6 != null) {
                linkedHashMap.put("is_email_info_complete", Boolean.valueOf(bool6.booleanValue()));
            }
            if (list != null) {
                linkedHashMap.putAll(C7806033c.LJIILLIIL(list));
            }
            if (str14 != null) {
                linkedHashMap.put("place_order_pay_later_show_type", str14);
            }
            if (str13 != null) {
                linkedHashMap.put("bnpl_status", str13);
            }
            if (num5 != null) {
                linkedHashMap.put("is_bundle", Integer.valueOf(num5.intValue()));
            }
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        C1421105hJ.LIZJ("tiktokec_stay_page", linkedHashMap);
    }

    public static void LJJJLIIL(C03O0 c03o0, Boolean bool, HashMap map, String str, String str2, String str3, Integer num, String str4, HashMap map2, SkuPrice skuPrice, String str5, String str6, Integer num2, C03P2 c03p2, String str7, String str8, String str9, Integer num3, Integer num4, HashMap map3, C737802uO c737802uO, HashMap map4, Map map5, Map map6, Map map7, Boolean bool2, Map map8, Integer num5, Map map9, Boolean bool3, Map map10, Boolean bool4, String str10, Boolean bool5, List list, String str11, String str12, Integer num6, int i, int i2) {
        Long l;
        Price price;
        String currency;
        HashMap<String, Object> mapLJIIJ;
        String priceVal;
        String currency2;
        String str13 = str2;
        String str14 = str;
        String str15 = str12;
        Map map11 = map8;
        Map map12 = map7;
        String str16 = str9;
        Map map13 = map5;
        HashMap map14 = map4;
        Map map15 = map6;
        String str17 = str8;
        String str18 = str11;
        C737802uO c737802uO2 = c737802uO;
        Integer num7 = num2;
        String str19 = str6;
        String str20 = str5;
        String str21 = str10;
        HashMap map16 = map3;
        SkuPrice skuPrice2 = skuPrice;
        String str22 = str7;
        HashMap map17 = map2;
        Map map18 = map10;
        String str23 = str4;
        C03P2 c03p22 = c03p2;
        Integer num8 = num;
        Map map19 = map9;
        String str24 = str3;
        if ((i & 4) != 0) {
            str14 = null;
        }
        if ((i & 8) != 0) {
            str13 = null;
        }
        if ((i & 32) != 0) {
            str24 = null;
        }
        if ((i & 64) != 0) {
            num8 = null;
        }
        if ((i & 128) != 0) {
            str23 = null;
        }
        if ((i & 256) != 0) {
            map17 = null;
        }
        if ((i & 512) != 0) {
            skuPrice2 = null;
        }
        if ((i & 1024) != 0) {
            str20 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str19 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num7 = null;
        }
        if ((i & 8192) != 0) {
            c03p22 = null;
        }
        if ((i & 16384) != 0) {
            str22 = null;
        }
        if ((32768 & i) != 0) {
            str17 = null;
        }
        if ((65536 & i) != 0) {
            str16 = null;
        }
        if ((131072 & i) != 0) {
            num3 = null;
        }
        if ((262144 & i) != 0) {
            num4 = null;
        }
        if ((524288 & i) != 0) {
            map16 = null;
        }
        if ((1048576 & i) != 0) {
            c737802uO2 = null;
        }
        if ((2097152 & i) != 0) {
            map14 = null;
        }
        if ((4194304 & i) != 0) {
            map13 = null;
        }
        if ((8388608 & i) != 0) {
            map15 = null;
        }
        if ((16777216 & i) != 0) {
            map12 = null;
        }
        if ((33554432 & i) != 0) {
            bool2 = null;
        }
        if ((67108864 & i) != 0) {
            map11 = null;
        }
        if ((134217728 & i) != 0) {
            num5 = null;
        }
        if ((268435456 & i) != 0) {
            map19 = null;
        }
        if ((536870912 & i) != 0) {
            bool3 = null;
        }
        if ((1073741824 & i) != 0) {
            map18 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            bool4 = null;
        }
        if ((i2 & 1) != 0) {
            str21 = null;
        }
        if ((i2 & 2) != 0) {
            bool5 = null;
        }
        if ((i2 & 4) != 0) {
            list = null;
        }
        if ((i2 & 8) != 0) {
            str18 = null;
        }
        if ((i2 & 16) != 0) {
            str15 = null;
        }
        if ((i2 & 32) != 0) {
            num6 = null;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        Object obj = concurrentHashMap.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        if (skuPrice2 != null) {
            Price price2 = skuPrice2.realPrice;
            if (price2 != null) {
                priceVal = price2.getPriceVal();
            } else {
                priceVal = null;
            }
            concurrentHashMap.put("sale_price_value", String.valueOf(priceVal));
            concurrentHashMap.put("original_price_value", String.valueOf(skuPrice2.originalPriceVal));
            Price price3 = skuPrice2.realPrice;
            if (price3 != null) {
                currency2 = price3.getCurrency();
            } else {
                currency2 = null;
            }
            concurrentHashMap.put("currency", String.valueOf(currency2));
        }
        linkedHashMap.putAll(concurrentHashMap);
        linkedHashMap.putAll(map);
        try {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(String.valueOf(concurrentHashMap.get("start_click_time")));
            Object obj2 = concurrentHashMap.get("previous_page");
            if (lLJIILIIL != null && (Intrinsics.LJFF(obj2, "cart") || Intrinsics.LJFF(obj2, "ecommerce_centre_page") || num4 != null)) {
                linkedHashMap.put("start_click_to_now", Long.valueOf(System.currentTimeMillis() - lLJIILIIL.longValue()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("logOSPEnterPage startClickTime exception");
        }
        if ((obj instanceof Long) && !Intrinsics.LJFF(obj, -1L)) {
            linkedHashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (str14 != null) {
            linkedHashMap.put("page_name", str14);
        }
        if (str13 != null) {
            linkedHashMap.put("previous_page", str13);
        }
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str24 != null) {
            linkedHashMap.put("cart_item_id", str24);
        }
        if (num8 != null) {
            linkedHashMap.put("osp_reload_tag", num8);
        }
        if (str23 != null) {
            linkedHashMap.put("payment_option", str23);
        }
        if (map17 != null) {
            linkedHashMap.putAll(map17);
        }
        if (str20 != null) {
            linkedHashMap.put("promotion_source", str20);
        }
        if (c03p22 != null) {
            C855703Vz.LIZJ(c03p22, linkedHashMap);
        }
        if (str22 != null) {
            linkedHashMap.put("delivery_info", str22);
        }
        if (list != null) {
            linkedHashMap.putAll(C7806033c.LJIILLIIL(list));
        }
        if (str19 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str19)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        if (str16 != null) {
            linkedHashMap.put("purchase_path", str16);
        }
        if (num3 != null) {
            linkedHashMap.put("is_mobile_number_complete", Integer.valueOf(num3.intValue()));
        }
        if (num7 != null) {
            num7.intValue();
            linkedHashMap.put("add_on_product_num", num7);
        }
        if (bool2 != null) {
            linkedHashMap.put("is_preload", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        linkedHashMap.put("shipping_rights_content", LJIJ);
        LIZ.getClass();
        LIZ(linkedHashMap, map16, str19, null);
        if (c737802uO2 != null) {
            C855703Vz.LIZIZ(c737802uO2, linkedHashMap);
        }
        if (map14 != null) {
            linkedHashMap.putAll(map14);
        }
        if (map13 != null) {
            linkedHashMap.putAll(map13);
        }
        C038N.LIZ(linkedHashMap, map15);
        if (map12 != null) {
            linkedHashMap.putAll(map12);
        }
        if (skuPrice2 != null && (price = skuPrice2.realPrice) != null && (currency = price.getCurrency()) != null) {
            linkedHashMap.put("shipping_currency", currency);
        }
        if (str17 != null) {
            linkedHashMap.put("shipping_rights_content", str17);
        }
        LIZJ(linkedHashMap, map11);
        if (num5 != null) {
            linkedHashMap.put("subscribe_sku_cnt", Integer.valueOf(num5.intValue()));
        }
        if (map19 != null) {
            linkedHashMap.putAll(map19);
        }
        if (bool3 != null) {
            linkedHashMap.put("if_item_insurance", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
        }
        if (map18 != null) {
            linkedHashMap.putAll(map18);
        }
        if (bool4 != null) {
            linkedHashMap.put("is_open_redeem_bonus", Integer.valueOf(bool4.booleanValue() ? 1 : 0));
        }
        if (str21 != null) {
            linkedHashMap.put("shipping_module_rk", str21);
        }
        Object objLIZ = C7726030a.LIZ("button_sub_text_countdown", linkedHashMap);
        if ((objLIZ instanceof Long) && (l = (Long) objLIZ) != null) {
            linkedHashMap.put("button_sub_text_countdown", Long.valueOf((l.longValue() - System.currentTimeMillis()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        if (bool5 != null) {
            linkedHashMap.put("is_cod_available", Integer.valueOf(bool5.booleanValue() ? 1 : 0));
        }
        if (str18 != null) {
            linkedHashMap.put("place_order_pay_later_show_type", str18);
        }
        if (str15 != null) {
            linkedHashMap.put("bnpl_status", str15);
        }
        if (num6 != null) {
            linkedHashMap.put("is_bundle", Integer.valueOf(num6.intValue()));
        }
        C1018503yZ.LIZIZ("tiktokec_enter_page", linkedHashMap, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x018c  */
    /* JADX WARN: Type inference failed for: r65v1, types: [int] */
    /* JADX WARN: Type inference failed for: r65v2 */
    /* JADX WARN: Type inference failed for: r65v3 */
    /* JADX WARN: Type inference failed for: r87v1, types: [int] */
    /* JADX WARN: Type inference failed for: r87v2 */
    /* JADX WARN: Type inference failed for: r87v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJLL(X.C03O0 r41, java.lang.String r42, java.lang.String r43, java.util.HashMap r44, java.lang.String r45, java.lang.String r46, java.lang.Integer r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.Boolean r51, java.lang.String r52, java.lang.String r53, java.util.HashMap r54, java.lang.String r55, java.lang.Boolean r56, java.lang.Boolean r57, X.C03P2 r58, java.lang.String r59, java.lang.String r60, java.util.HashMap r61, java.util.HashMap r62, java.lang.Boolean r63, java.util.Map r64, boolean r65, java.lang.Integer r66, java.util.Map r67, java.lang.String r68, java.lang.Integer r69, java.lang.String r70, java.lang.Integer r71, java.lang.String r72, java.lang.Boolean r73, java.lang.String r74, java.lang.Boolean r75, java.lang.String r76, java.util.HashMap r77, java.lang.String r78, java.util.Map r79, java.lang.String r80, java.util.Map r81, java.lang.String r82, java.lang.Integer r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, boolean r87, int r88, int r89) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O0.LJJJJLL(X.03O0, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.Boolean, java.lang.Boolean, X.03P2, java.lang.String, java.lang.String, java.util.HashMap, java.util.HashMap, java.lang.Boolean, java.util.Map, boolean, java.lang.Integer, java.util.Map, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.util.HashMap, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, int, int):void");
    }

    public static void LJLJI(String str, String str2, Boolean bool, HashMap map, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str3, String str4, String str5, String str6, String str7, Boolean bool7, Boolean bool8, Boolean bool9, CommuteType commuteType, String str8, String str9, String str10, Boolean bool10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool11, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Map map2, Long l, Boolean bool12, String str28, String str29, Boolean bool13, Boolean bool14, String str30, String str31, Boolean bool15) {
        String strLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (str != null) {
            linkedHashMap.put("payment_method_id", str);
        }
        linkedHashMap.put("pay_type", str2);
        if (bool != null) {
            linkedHashMap.put("is_credit_pay", C893803eS.LIZ(bool.booleanValue()));
        }
        linkedHashMap.putAll(map);
        if (bool2 != null) {
            linkedHashMap.put("is_edit_pay_method", C893803eS.LIZ(bool2.booleanValue()));
        }
        if (bool3 != null) {
            linkedHashMap.put("is_edit_quantity", C893803eS.LIZ(bool3.booleanValue()));
        }
        linkedHashMap.put("page_name", "order_submit");
        if (bool4 != null) {
            linkedHashMap.put("is_create_order", C893803eS.LIZ(bool4.booleanValue()));
        }
        if (bool5 != null) {
            bool5.booleanValue();
            linkedHashMap.put("is_default_first", C893803eS.LIZ(bool5.booleanValue()));
        }
        if (bool6 != null) {
            bool6.booleanValue();
            linkedHashMap.put("is_default_second", C893803eS.LIZ(bool6.booleanValue()));
        }
        if (str3 != null) {
            linkedHashMap.put("pay_bind_status", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("total_price_value", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("tenure", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("installment_plan_id", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("remote_installment_info", str7);
        }
        if (bool7 != null) {
            bool7.booleanValue();
            linkedHashMap.put("is_one_click_pay", C893803eS.LIZ(bool7.booleanValue()));
        }
        if (bool8 != null) {
            bool8.booleanValue();
            linkedHashMap.put("is_pay_saved", C893803eS.LIZ(bool8.booleanValue()));
        }
        if (bool9 != null) {
            bool9.booleanValue();
            linkedHashMap.put("is_recommended", C893803eS.LIZ(bool9.booleanValue()));
        }
        if (commuteType != null) {
            linkedHashMap.put("pay_commute_type", commuteType);
        }
        if (str8 != null) {
            linkedHashMap.put("pay_request_id", str8);
        }
        if (str9 != null) {
            linkedHashMap.put("credit_amount", str9);
        }
        if (str10 != null) {
            linkedHashMap.put("remained_amount", str10);
        }
        if (bool10 != null) {
            linkedHashMap.put("is_second_refresh", C893803eS.LIZ(bool10.booleanValue()));
        }
        if (str11 != null) {
            linkedHashMap.put("deeplink_url", str11);
        }
        if (str12 != null) {
            linkedHashMap.put("redirect_url", str12);
        }
        if (str13 != null) {
            linkedHashMap.put("order_info_from_bill", str13);
        }
        if (str14 != null) {
            linkedHashMap.put("consultation_id", str14);
        }
        if (str15 != null) {
            linkedHashMap.put("installment_available", str15);
        }
        if (str17 != null && str16 != null) {
            linkedHashMap.put("remote_payment_available", str17);
            if (bool11 != null) {
                strLIZ = C893803eS.LIZ(bool11.booleanValue());
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
        if (str21 != null) {
            linkedHashMap.put("last_click_sub_item", str21);
            if (str20 != null) {
                linkedHashMap.put("current_sub_item", str20);
            }
            linkedHashMap.put("is_manually_selected", C893803eS.LIZ(Intrinsics.LJFF(str21, str20)));
            C03OM.LIZ();
        }
        if (str22 != null) {
            linkedHashMap.put("error_code", str22);
        }
        if (str23 != null) {
            linkedHashMap.put("status_code", str23);
        }
        if (str24 != null) {
            linkedHashMap.put("remote_status_code", str24);
        }
        if (str25 != null) {
            linkedHashMap.put("log_id", str25);
        }
        if (str26 != null) {
            linkedHashMap.put("pay_result", str26);
        }
        if (str27 != null) {
            linkedHashMap.put("pay_result_redirect_url", str27);
        }
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        if (l != null) {
            l.longValue();
            linkedHashMap.put("api_duration", l);
        }
        if (bool12 != null) {
            bool12.booleanValue();
            linkedHashMap.put("pay_is_bound", C893803eS.LIZ(bool12.booleanValue()));
        }
        if (str28 != null) {
            linkedHashMap.put("pay_elements", str28);
        }
        if (str29 != null) {
            linkedHashMap.put("total_price_value", str29);
        }
        if (bool13 != null) {
            bool13.booleanValue();
            linkedHashMap.put("is_payment_promoted", C893803eS.LIZ(bool13.booleanValue()));
        }
        if (bool14 != null) {
            bool14.booleanValue();
            linkedHashMap.put("is_installment_promoted", C893803eS.LIZ(bool14.booleanValue()));
        }
        if (str30 != null) {
            linkedHashMap.put("payment_params", str30);
        }
        if (str31 != null) {
            linkedHashMap.put("invisible_params", str31);
        }
        if (bool15 != null) {
            linkedHashMap.put("is_inactivate", C893803eS.LIZ(bool15.booleanValue()));
        }
        LLF("rd_pipo_osp_payment_params_debug", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r66v1, types: [int] */
    /* JADX WARN: Type inference failed for: r66v2 */
    /* JADX WARN: Type inference failed for: r66v3 */
    public static void LJJL(C03O0 c03o0, boolean z, boolean z2, String str, boolean z3, String str2, String str3, HashMap map, String str4, Integer num, long j, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, HashMap map2, String str14, Boolean bool2, Boolean bool3, C03P2 c03p2, String str15, String str16, HashMap map3, C737802uO c737802uO, boolean z4, HashMap map4, Map map5, Boolean bool4, Map map6, boolean z5, Integer num2, Map map7, Boolean bool5, String str17, Integer num3, Boolean bool6, String str18, String str19, Boolean bool7, Boolean bool8, String str20, String str21, List list, String str22, String str23, String str24, Integer num4, String str25, int i, int i2) {
        int i3;
        int i4;
        HashMap mapLJ;
        Long l;
        HashMap<String, Object> mapLJIIJ;
        String str26 = str25;
        String str27 = str21;
        HashMap map8 = map4;
        String str28 = str19;
        String str29 = str17;
        Map map9 = map7;
        Map map10 = map6;
        Map map11 = map5;
        C737802uO c737802uO2 = c737802uO;
        String str30 = str18;
        String str31 = str23;
        String str32 = str16;
        String str33 = str22;
        String str34 = str15;
        C03P2 c03p22 = c03p2;
        String str35 = str14;
        HashMap map12 = map2;
        String str36 = str13;
        String str37 = str20;
        String str38 = str12;
        String str39 = str11;
        String str40 = str24;
        HashMap map13 = map3;
        String str41 = str10;
        if ((i & 32768) != 0) {
            bool = null;
        }
        if ((i & 65536) != 0) {
            str41 = null;
        }
        if ((i & 131072) != 0) {
            str39 = null;
        }
        if ((i & 262144) != 0) {
            str38 = null;
        }
        if ((i & 524288) != 0) {
            str36 = null;
        }
        if ((i & 1048576) != 0) {
            map12 = null;
        }
        if ((i & 2097152) != 0) {
            str35 = null;
        }
        if ((i & 4194304) != 0) {
            bool2 = null;
        }
        if ((i & 8388608) != 0) {
            bool3 = null;
        }
        if ((i & 16777216) != 0) {
            c03p22 = null;
        }
        if ((i & 33554432) != 0) {
            str34 = null;
        }
        if ((i & 67108864) != 0) {
            str32 = null;
        }
        if ((i & 134217728) != 0) {
            map13 = null;
        }
        if ((i & 268435456) != 0) {
            c737802uO2 = null;
        }
        if ((i & 1073741824) != 0) {
            map8 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            map11 = null;
        }
        if ((i2 & 1) != 0) {
            bool4 = null;
        }
        if ((i2 & 2) != 0) {
            map10 = null;
        }
        ?? r66 = z5;
        if ((i2 & 4) != 0) {
            r66 = 0;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if ((i2 & 16) != 0) {
            map9 = null;
        }
        if ((i2 & 32) != 0) {
            bool5 = null;
        }
        if ((i2 & 64) != 0) {
            str29 = null;
        }
        if ((i2 & 128) != 0) {
            num3 = null;
        }
        if ((i2 & 256) != 0) {
            bool6 = null;
        }
        if ((i2 & 512) != 0) {
            str30 = null;
        }
        if ((i2 & 1024) != 0) {
            str28 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool7 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool8 = null;
        }
        if ((i2 & 16384) != 0) {
            str37 = null;
        }
        if ((32768 & i2) != 0) {
            i3 = 65536;
            str27 = null;
        } else {
            i3 = 65536;
        }
        if ((i3 & i2) != 0) {
            list = null;
        }
        if ((131072 & i2) != 0) {
            i4 = 262144;
            str33 = null;
        } else {
            i4 = 262144;
        }
        if ((i4 & i2) != 0) {
            str31 = null;
        }
        if ((i2 & 524288) != 0) {
            str40 = null;
        }
        if ((i2 & 1048576) != 0) {
            num4 = null;
        }
        if ((i2 & 2097152) != 0) {
            str26 = null;
        }
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(LIZIZ);
        if (!Intrinsics.LJFF(str, "")) {
            linkedHashMap.remove("product_id");
            linkedHashMap.remove("author_id");
            mapLJ = C1741890vQh.LJ("entrance_info", linkedHashMap);
            if (mapLJ != null) {
                mapLJ.remove("product_id");
                mapLJ.remove("author_id");
            }
        } else {
            mapLJ = null;
        }
        if (str36 != null) {
            if (mapLJ != null || (mapLJ = C1741890vQh.LJ("entrance_info", linkedHashMap)) != null) {
                mapLJ.put("add_on_track_id", str36);
                linkedHashMap.put("entrance_info", C1741890vQh.LJIIIIZZ(mapLJ));
            }
        } else if (mapLJ != null) {
            linkedHashMap.put("entrance_info", C1741890vQh.LJIIIIZZ(mapLJ));
        }
        linkedHashMap.put("order_id", str);
        if (bool2 != null) {
            bool2.booleanValue();
            linkedHashMap.put("is_default_first", C893803eS.LIZ(bool2.booleanValue()));
        }
        if (bool3 != null) {
            bool3.booleanValue();
            linkedHashMap.put("is_default_second", C893803eS.LIZ(bool3.booleanValue()));
        }
        if (bool4 != null) {
            bool4.booleanValue();
            linkedHashMap.put("is_one_click_pay", C893803eS.LIZ(bool4.booleanValue()));
        }
        linkedHashMap.put("if_use_pickup_location", Integer.valueOf((int) r66));
        linkedHashMap.put("is_recommended", C893803eS.LIZ(z4));
        linkedHashMap.put("is_edit_address", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_edit_quantity", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_success", Integer.valueOf(z3 ? 1 : 0));
        linkedHashMap.put("fail_reason", str2);
        if (str3 != null) {
            linkedHashMap.put("error_code", str3);
        }
        if (z3) {
            linkedHashMap.put("total_time", Long.valueOf((SystemClock.elapsedRealtime() - LIZLLL) - LJI));
        }
        linkedHashMap.putAll(map);
        if (str4.length() != 0) {
            linkedHashMap.put("pay_type", str4);
        }
        if (num != null) {
            linkedHashMap.put("is_credit_pay", Integer.valueOf(num.intValue()));
        }
        linkedHashMap.put("api_duration", String.valueOf(j));
        linkedHashMap.put("cart_item_id", str5);
        if (str9 != null) {
            linkedHashMap.put("total_payment", str9);
        }
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str6 != null) {
            linkedHashMap.put("pay_error_code", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("pay_result", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("redirect_url", str8);
        }
        if (str41 != null && str41.length() != 0) {
            linkedHashMap.put("pay_bind_status", str41);
        }
        if (str39 != null) {
            linkedHashMap.put("combo_id", str39);
        }
        if (str38 != null) {
            linkedHashMap.put("installment_cnt", str38);
        }
        if (map12 != null) {
            linkedHashMap.putAll(map12);
        }
        if (str35 != null) {
            linkedHashMap.put("promotion_source", str35);
        }
        if (c03p22 != null) {
            C855703Vz.LIZJ(c03p22, linkedHashMap);
        }
        if (str34 != null) {
            linkedHashMap.put("delivery_info", str34);
        }
        if (str32 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str32)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        LIZ.getClass();
        LIZ(linkedHashMap, map13, str32, null);
        if (c737802uO2 != null) {
            C855703Vz.LIZIZ(c737802uO2, linkedHashMap);
        }
        linkedHashMap.remove("bundle_product_id");
        if (map8 != null) {
            linkedHashMap.putAll(map8);
        }
        linkedHashMap.put("shipping_rights_content", LJIJ);
        if (map11 != null) {
            linkedHashMap.putAll(map11);
        }
        C038N.LIZ(linkedHashMap, map10);
        if (num2 != null) {
            num2.intValue();
            linkedHashMap.put("is_retry", "1");
        }
        if (map9 != null) {
            linkedHashMap.putAll(map9);
        }
        if (bool5 != null) {
            linkedHashMap.put("if_item_insurance", Integer.valueOf(bool5.booleanValue() ? 1 : 0));
        }
        if (str29 != null) {
            linkedHashMap.put("payment_method_id", str29);
        }
        if (num3 != null) {
            linkedHashMap.put("subscribe_sku_cnt", Integer.valueOf(num3.intValue()));
        }
        if (bool6 != null) {
            linkedHashMap.put("is_open_redeem_bonus", Integer.valueOf(bool6.booleanValue() ? 1 : 0));
        }
        if (str30 != null) {
            linkedHashMap.put("shipping_module_rk", str30);
        }
        Object objLIZ = C7726030a.LIZ("button_sub_text_countdown", linkedHashMap);
        if ((objLIZ instanceof Long) && (l = (Long) objLIZ) != null) {
            linkedHashMap.put("button_sub_text_countdown", Long.valueOf((l.longValue() - System.currentTimeMillis()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        if (str28 != null) {
            linkedHashMap.put("primary_pay_type", str28);
        }
        if (bool7 != null) {
            linkedHashMap.put("is_cod_available", Integer.valueOf(bool7.booleanValue() ? 1 : 0));
        }
        if (bool8 != null) {
            linkedHashMap.put("is_recommended_tag", Integer.valueOf(bool8.booleanValue() ? 1 : 0));
        }
        if (str37 != null) {
            linkedHashMap.put("promotion_type", str37);
        }
        if (str40 != null) {
            linkedHashMap.put("bubble_type", str40);
        }
        if (num4 != null) {
            linkedHashMap.put("is_pay_bubble", Integer.valueOf(num4.intValue()));
        }
        if (str27 != null) {
            linkedHashMap.put("is_refundable_sample", str27);
        }
        if (list != null) {
            linkedHashMap.putAll(C7806033c.LJIILLIIL(list));
        }
        if (str33 != null) {
            linkedHashMap.put("place_order_pay_later_show_type", str33);
        }
        if (str31 != null) {
            linkedHashMap.put("bnpl_status", str31);
        }
        if (str26 != null) {
            linkedHashMap.put("popup_layer_name", str26);
        }
        C1421105hJ.LIZJ("tiktokec_submit_order_result", linkedHashMap);
    }
}
