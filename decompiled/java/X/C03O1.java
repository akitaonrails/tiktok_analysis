package X;

import Y.ARunnableS101S0100000_1;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
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
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECPaymentCategorySettings;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcTransactionRequestOpt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03O1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03O1 {
    public int LJIIIIZZ;
    public BPEAHandler LJIJ;
    public boolean LJIJI;
    public PaymentMethod LJIJJLI;
    public PaymentMethod LJIL;
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public final List<String> LJIIIZ = new ArrayList();
    public final List<String> LJIIJ = new ArrayList();
    public final List<String> LJIIJJI = new ArrayList();
    public final List<String> LJIIL = new ArrayList();
    public final List<String> LJIILIIL = new ArrayList();
    public final List<String> LJIILJJIL = new ArrayList();
    public final List<String> LJIILL = new ArrayList();
    public final C03WI LJIILLIIL = new C03WI();
    public final String LJIIZILJ = "";
    public final Map<String, Long> LJIJJ = new LinkedHashMap();
    public final ARunnableS101S0100000_1 LJJ = new ARunnableS101S0100000_1(this, 75);

    public static String LIZIZ(List list) {
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

    public static C7767031p LIZJ(PaymentInfo paymentInfo) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(Integer num) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = num;
        AwS245S0300000_1 awS245S0300000_1 = new AwS245S0300000_1(this, (C03O1) this.LIZ.get("click_buynow_start_time"), (Object) c259800zU, (C259800zU<Integer>) 42);
        if (EcTransactionRequestOpt.LIZ()) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01MJ(awS245S0300000_1, null), 2);
        } else {
            awS245S0300000_1.invoke();
        }
    }

    public final void LJIJI(HashMap<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.putAll(map);
        LJJIJIIJIL("tiktokec_submit_order", linkedHashMap);
    }

    public final void LJIJJ(String str) {
        long jElapsedRealtime;
        long j;
        if (this.LJ > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            j = this.LJ;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            j = this.LIZJ;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime - j));
        LJJIJIIJIL("tiktokec_order_submit_page_time", linkedHashMap);
    }

    public final void LJJIIZI(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("invoke_reason", str);
        LJJIJIIJIL("rd_tts_sns_place_order_intercept", linkedHashMap);
    }

    public static String LIZLLL(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null) {
            return null;
        }
        if (!Intrinsics.LJFF(paymentMethod.id, "pm_pi_ins_pipobnpl_c_d")) {
            C03SY c03sy = C03SY.LIZ;
            String str = paymentMethod.id;
            c03sy.getClass();
            if (!C03SY.LJIJI(str)) {
                if (list == null) {
                    return null;
                }
                for (Object obj : list) {
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

    public static InstallmentInfo LJ(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        Object next;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null && list != null) {
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
                return paymentMethod2.installmentInfo;
            }
        }
        return null;
    }

    public static String LJI(PaymentInfo paymentInfo, List list) {
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
                if (list == null) {
                    return null;
                }
                Iterator it2 = list.iterator();
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

    public static String LJII(PaymentInfo paymentInfo, List list) {
        PaymentMethodInfo paymentMethodInfo;
        String str;
        List<InstallmentPlan> list2;
        String str2;
        PaymentMethodInfo paymentMethodInfo2;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && (str = paymentMethodInfo.tenure) != null && str.length() != 0) {
            InstallmentInfo installmentInfoLJ = LJ(paymentInfo, list);
            if (installmentInfoLJ != null && (list2 = installmentInfoLJ.installmentPlans) != null) {
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

    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r4, java.util.List r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C03O1.LJJIIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.util.List):java.lang.String");
    }

    public static String LJJIJ(PaymentInfo paymentInfo, List list) {
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

    public static String LJJIJIIJI(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        Object next;
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
        if (availability == null) {
            return null;
        }
        return availability.statusCode;
    }

    public static void LJJIJIIJIL(String str, Map map) {
        C1018503yZ.LIZIZ(str, map, false);
        C921903iz.LIZ.getClass();
        C921903iz.LIZIZ(4, map, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r8, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r9) {
        /*
            r7 = this;
            r4 = 0
            if (r8 == 0) goto L66
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r6 = r8.paymentMethod
            if (r6 == 0) goto L66
            if (r9 == 0) goto L64
            java.util.Iterator r3 = r9.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r5 = r3.next()
            r2 = r5
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
            java.lang.String r1 = r2.id
            java.lang.String r0 = "pm_pi_ccdc_all"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto Ld
            boolean r0 = r2.LJJJJZ(r6)
            if (r0 == 0) goto Ld
        L2a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r5
        L2c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r7.LJIJJLI
            if (r0 != 0) goto L49
            r3 = r4
        L31:
            kotlin.Pair r2 = new kotlin.Pair
            if (r5 == 0) goto L45
            java.lang.String r1 = r6.id
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r7.LJIL
            if (r0 == 0) goto L3d
            java.lang.String r4 = r0.id
        L3d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L45:
            r2.<init>(r3, r4)
            return r2
        L49:
            if (r5 != 0) goto L54
            boolean r0 = X.C899503fN.LIZIZ(r6, r0)
            if (r0 == 0) goto L5f
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L31
        L54:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r7.LJIJJLI
            boolean r0 = X.C899503fN.LIZIZ(r5, r0)
            if (r0 == 0) goto L5f
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L31
        L5f:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L31
        L62:
            r5 = r4
            goto L2a
        L64:
            r5 = r4
            goto L2c
        L66:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O1.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.util.List):kotlin.Pair");
    }

    public final void LJJI(Map map, boolean z) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.putAll(this.LIZ);
        map2.put("first_refresh", Boolean.valueOf(z));
        LJJIJIIJIL("rd_pipo_tts_cashier_info", map2);
    }

    public final void LJIILL(int i, HashMap map, boolean z) {
        C836303On c836303On = new C836303On(this, i, z, map);
        if (EcTransactionRequestOpt.LIZ()) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01LN(c836303On, null), 2);
        } else {
            c836303On.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJIL(BillInfoResponse billInfoResponse, Boolean bool, String str) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (str != null) {
            C03O0.LIZ.getClass();
            LJIIIIZZ(false, zBooleanValue, C03O0.LLIFFJFJJ(str), null);
            return;
        }
        if (billInfoResponse == null) {
            LJIIIIZZ(false, zBooleanValue, "-1", null);
            return;
        }
        if (!billInfoResponse.isCodeOK()) {
            LJIIIIZZ(false, zBooleanValue, String.valueOf(billInfoResponse.code), null);
            return;
        }
        T t = billInfoResponse.data;
        if (t != 0) {
            BillInfoData billInfoData = (BillInfoData) t;
            if (billInfoData.newShopOrders != null || billInfoData.summary != null || billInfoData.shippingAddress != null) {
                LJIIIIZZ(true, zBooleanValue, null, null);
                return;
            }
        }
        Boolean bool2 = Boolean.TRUE;
        String str2 = billInfoResponse.message;
        if (str2 == null) {
            str2 = "-2";
        }
        LJIIIIZZ(false, zBooleanValue, str2, bool2);
    }

    public static void LJIILIIL(C03O1 c03o1, String str, HashMap map, int i) {
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03o1.LIZ);
        linkedHashMap.putAll(map);
        linkedHashMap.put("module_name", str);
        Intrinsics.LJFF(str, "logistics");
        LJJIJIIJIL("tiktokec_module_show", linkedHashMap);
    }

    public static void LJJII(C03O1 c03o1, int i, long j, String str) {
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("product_type", 1);
        linkedHashMap.put(Scene.SCENE_SERVICE, Integer.valueOf(i));
        linkedHashMap.put("duration", Long.valueOf(j));
        linkedHashMap.put("payment_method_id", str);
        LJJIJIIJIL("rd_tiktokec_poll_order_success", linkedHashMap);
    }

    public final void LJIIIIZZ(boolean z, boolean z2, String str, Boolean bool) {
        boolean z3;
        boolean z4 = true;
        if (!z) {
            if (this.LJIIIIZZ > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            new C835403Oe(str, z3, z2).LIZIZ();
        }
        if (z2) {
            if (this.LJIIIIZZ <= 0) {
                z4 = false;
            }
            new C839703Pv(z4, z, str, bool).LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(int r23, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r24, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r25, java.util.concurrent.CopyOnWriteArrayList r26, java.util.Map r27) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O1.LJIIJJI(int, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.util.concurrent.CopyOnWriteArrayList, java.util.Map):void");
    }

    public final void LIZ(int i, String str, String str2, String str3, Integer num, String str4) {
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZ;
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

    public static void LJIIZILJ(C03O1 c03o1, String str, String str2, String str3, Map map, String str4, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
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
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.putAll(c03o1.LIZ);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", str4);
        if (str != null) {
            linkedHashMap.put("popup_name", str);
        }
        if (str2 != null) {
            linkedHashMap.put("error_code", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("pay_type", str3);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LJJIJIIJIL("tiktokec_popup_show", linkedHashMap);
    }

    public static void LJJ(C03O1 c03o1, String str, boolean z, String str2, String str3, long j, String str4, int i) {
        String strLJIIIIZZ;
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap<String, Object> concurrentHashMap = c03o1.LIZ;
        if (concurrentHashMap != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(concurrentHashMap);
            HashMap mapLJ = C1741890vQh.LJ("entrance_info", linkedHashMap2);
            if (mapLJ == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(mapLJ)) == null) {
                strLJIIIIZZ = "{}";
            }
            linkedHashMap2.put("entrance_info", strLJIIIIZZ);
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.put("order_id", str);
        linkedHashMap.put("if_use_pickup_location", 0);
        linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("fail_reason", str2);
        if (z) {
            linkedHashMap.put("total_time", Long.valueOf((SystemClock.elapsedRealtime() - c03o1.LIZJ) - c03o1.LJFF));
        }
        if (str3.length() != 0) {
            linkedHashMap.put("pay_type", str3);
        }
        linkedHashMap.put("api_duration", String.valueOf(j));
        if (str4 != null) {
            linkedHashMap.put("payment_method_id", str4);
            for (Map.Entry<String, List<String>> entry : ECPaymentCategorySettings.LIZ().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value != null && value.contains(str4)) {
                    linkedHashMap.put("payment_pay_category", key);
                }
            }
        }
        LJJIJIIJIL("rd_tiktokec_submit_order_result", linkedHashMap);
    }

    public static void LJIILLIIL(C03O1 c03o1, String str, String str2, String str3, String str4, Map map, String str5, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
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
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.putAll(c03o1.LIZ);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", str5);
        if (str != null) {
            linkedHashMap.put("popup_name", str);
        }
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
        LJJIJIIJIL("tiktokec_popup_click", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    public static void LJIJ(C03O1 c03o1, boolean z, String str, HashMap map, Map map2, boolean z2, Boolean bool, Boolean bool2, int i) {
        if ((i & 512) != 0) {
            map2 = null;
        }
        ?? r10 = z2;
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            r10 = 0;
        }
        if ((i & 8192) != 0) {
            bool = null;
        }
        if ((i & 16384) != 0) {
            bool2 = null;
        }
        if (c03o1.LIZIZ > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c03o1.LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c03o1.LIZ);
            linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("quit_type", str);
            linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime));
            linkedHashMap.putAll(map);
            linkedHashMap.put("shipping_rights_content", c03o1.LJIIZILJ);
            C038N.LIZ(linkedHashMap, map2);
            linkedHashMap.put("is_submit_order_success", Integer.valueOf((int) r10));
            if (bool != null) {
                linkedHashMap.put("is_membership_check_success", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            if (bool2 != null) {
                linkedHashMap.put("is_membership_success", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
            }
            LJJIJIIJIL("tiktokec_stay_page", linkedHashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v58 */
    public static void LJIJJLI(C03O1 c03o1, PaymentMethod paymentMethod, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Boolean bool, Map map, boolean z5) {
        ?? BooleanValue;
        Object obj;
        InterestFeePromotion interestFeePromotion;
        Map<String, Object> mapLIZ;
        Map<String, Object> mapConstructDaInfo;
        String str3;
        if (!((ArrayList) c03o1.LJIIIZ).contains(paymentMethod.LJIIJ())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c03o1.LIZ);
            linkedHashMap.put("option_name", paymentMethod.LJJIIZ());
            linkedHashMap.put("is_pre_credit", String.valueOf(z5 ? 1 : 0));
            linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
            String str4 = "";
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
            linkedHashMap.put("rank", Integer.valueOf(i));
            linkedHashMap.put("option_type", "payment_type");
            linkedHashMap.put("is_pay_saved", Integer.valueOf(z2 ? 1 : 0));
            linkedHashMap.put("is_balance_shown", Integer.valueOf(z3 ? 1 : 0));
            linkedHashMap.put("is_default", C893803eS.LIZ(z4));
            if (str != null && str.length() != 0) {
                linkedHashMap.put("option_unavailable_code", str);
            }
            if (str2 != null && str2.length() != 0) {
                linkedHashMap.put("status_code", str2);
            }
            BindInfo bindInfo = paymentMethod.bindInfo;
            if (bindInfo != null && (str3 = bindInfo.bindStatus) != null && str3.length() > 0) {
                linkedHashMap.put("pay_bind_status", str3);
            }
            String str5 = paymentMethod.id;
            if (str5 != null) {
                linkedHashMap.put("payment_method_id", str5);
            }
            Boolean bool2 = paymentMethod.needsIndependentPricing;
            if (bool2 != null) {
                BooleanValue = bool2.booleanValue();
            } else {
                BooleanValue = 0;
            }
            linkedHashMap.put("needs_independent_pricing", Integer.valueOf((int) BooleanValue));
            if (map == null || (obj = map.get("checkout_type")) == null) {
                obj = "";
            }
            linkedHashMap.put("checkout_type", obj);
            Map<String, Object> mapLIZIZ = paymentMethod.LIZIZ();
            if (mapLIZIZ != null && (!mapLIZIZ.isEmpty())) {
                linkedHashMap.putAll(mapLIZIZ);
            }
            C1018703yb.LIZIZ("tiktokec_option_show", linkedHashMap);
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                String strLJJIIZ = paymentMethod.LJJIIZ();
                try {
                    if (C03P6.LIZ()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(c03o1.LIZ);
                        linkedHashMap2.put("option_name", strLJJIIZ);
                        linkedHashMap2.put("option_type", "payment_type");
                        linkedHashMap2.put("rank", Integer.valueOf(i));
                        String strLJIJ2 = paymentMethod.LJIJ();
                        if (strLJIJ2 != null) {
                            str4 = strLJIJ2;
                        }
                        linkedHashMap2.put("marketing_batch_id", str4);
                        String strLJIJJ2 = paymentMethod.LJIJJ(false);
                        if (strLJIJJ2 != null && (!a0.LJJJIL(strLJIJJ2))) {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                            linkedHashMap3.put("promotion_info", strLJIJJ2);
                            PaymentPromotion paymentPromotionLJIILLIIL = paymentMethod.LJIILLIIL();
                            if (paymentPromotionLJIILLIIL != null && (mapConstructDaInfo = paymentPromotionLJIILLIIL.constructDaInfo()) != null) {
                                linkedHashMap3.putAll(mapConstructDaInfo);
                            }
                            linkedHashMap3.put("promotion_type", "instant_discount");
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
                            linkedHashMap4.put("promotion_type", "interest_fee");
                            C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap4);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "logPaymentPromotionShow failed");
                }
            }
            ((ArrayList) c03o1.LJIIIZ).add(paymentMethod.LJIIJ());
        }
    }

    public final void LJJIIJ(String str, String str2, int i, boolean z, String str3, Boolean bool, InstallmentPlan installmentPlan, String str4, String str5, Boolean bool2, PaymentMethod paymentMethod, Map map, boolean z2) {
        Object obj;
        String promotionBatchId;
        String str6;
        Map<String, Object> mapLIZ;
        String desc;
        Map<String, Object> mapConstructDaInfo;
        String str7;
        String priceStr;
        PaymentPromotion paymentPromotion;
        String desc2;
        String strLJIJJ;
        String strLJIJ;
        String str8 = str4;
        List<String> list = this.LJIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(i);
        if (((ArrayList) list).contains(C2188811AlT.LIZIZ(sbLIZ))) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("parent_option_name", str);
        linkedHashMap.put("option_name", str2);
        linkedHashMap.put("option_type", "sub_payment_type");
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("is_pre_credit", String.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        if (bool2 != null) {
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
            if (paymentMethod == null || (strLJIJJ = paymentMethod.LJIJJ(false)) == null) {
                strLJIJJ = "";
            }
            linkedHashMap.put("promotion_info", strLJIJJ);
            if (paymentMethod == null || (strLJIJ = paymentMethod.LJIJ()) == null) {
                strLJIJ = "";
            }
            linkedHashMap.put("marketing_batch_id", strLJIJ);
        }
        if (str3 != null && str3.length() != 0) {
            linkedHashMap.put("status_code", str3);
        }
        linkedHashMap.put("is_default", C893803eS.LIZ(Intrinsics.LJFF(bool, Boolean.TRUE)));
        if (installmentPlan != null) {
            Amount amount = installmentPlan.totalFee;
            if (amount == null || (priceStr = amount.getPriceStr()) == null) {
                priceStr = "";
            }
            linkedHashMap.put("service_fee", priceStr);
            String str9 = installmentPlan.tenure;
            if (str9 == null) {
                str9 = "";
            }
            linkedHashMap.put("installment_cnt", str9);
            if (str8 == null) {
                str8 = "";
            }
            linkedHashMap.put("total_payment", str8);
            Map<String, Object> mapLIZ2 = installmentPlan.LIZ();
            if (mapLIZ2 != null) {
                linkedHashMap.putAll(mapLIZ2);
            }
            PaymentServiceFeeInfo paymentServiceFeeInfo = installmentPlan.paymentServiceFeeInfo;
            if (paymentServiceFeeInfo != null && (paymentPromotion = paymentServiceFeeInfo.paymentPromotionInfo) != null && (desc2 = paymentPromotion.getDesc()) != null) {
                linkedHashMap.put("service_fee_promotion", desc2);
            }
        }
        if (paymentMethod != null && (str7 = paymentMethod.id) != null) {
            linkedHashMap.put("payment_method_id", str7);
        }
        if (str5 != null) {
            linkedHashMap.put("currency", str5);
        }
        if (map == null || (obj = map.get("checkout_type")) == null) {
            obj = "";
        }
        linkedHashMap.put("checkout_type", obj);
        C1018703yb.LIZIZ("tiktokec_option_show", linkedHashMap);
        if (installmentPlan != null && installmentPlan.LJ()) {
            try {
                if (C03P6.LIZ()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(this.LIZ);
                    linkedHashMap2.put("parent_option_name", str);
                    linkedHashMap2.put("option_name", str2);
                    linkedHashMap2.put("option_type", "sub_payment_type");
                    linkedHashMap2.put("rank", Integer.valueOf(i));
                    PaymentPromotion paymentPromotion2 = installmentPlan.promotionInfo;
                    if (paymentPromotion2 == null || (promotionBatchId = paymentPromotion2.getPromotionBatchId()) == null) {
                        promotionBatchId = "";
                    }
                    linkedHashMap2.put("marketing_batch_id", promotionBatchId);
                    String str10 = installmentPlan.tenure;
                    if (str10 == null) {
                        str10 = "";
                    }
                    linkedHashMap2.put("installment_cnt", str10);
                    String strLIZIZ = installmentPlan.LIZIZ();
                    if (strLIZIZ == null) {
                        strLIZIZ = "";
                    }
                    linkedHashMap2.put("promotion_type", strLIZIZ);
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
                    if (interestFeePromotion != null && (str6 = interestFeePromotion.desc) != null && (!a0.LJJJIL(str6))) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap2);
                        linkedHashMap4.put("promotion_info", str6);
                        InterestFeePromotion interestFeePromotion2 = installmentPlan.interestFeePromotion;
                        if (interestFeePromotion2 != null && (mapLIZ = interestFeePromotion2.LIZ()) != null) {
                            linkedHashMap4.putAll(mapLIZ);
                        }
                        C1018703yb.LIZIZ("tiktokec_promotion_show", linkedHashMap4);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "logSubPaymentPromotionShow failed");
            }
        }
        ((ArrayList) this.LJIIJ).add(str2 + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0197 A[PHI: r10
      0x0197: PHI (r10v7 java.lang.String) = (r10v4 java.lang.String), (r10v8 java.lang.String) binds: [B:102:0x016b, B:99:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r43v1, types: [int] */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIII(X.C03O1 r29, java.lang.String r30, java.lang.String r31, int r32, boolean r33, java.lang.String r34, java.lang.Boolean r35, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r36, java.lang.String r37, java.lang.String r38, java.lang.Boolean r39, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r40, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r41, java.util.Map r42, boolean r43, boolean r44, X.C03WJ r45, int r46) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O1.LJJIII(X.03O1, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, java.lang.String, java.lang.String, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.util.Map, boolean, boolean, X.03WJ, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v1, types: [int] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3 */
    public static void LJIL(C03O1 c03o1, String str, boolean z, int i, String str2, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, String str6, Boolean bool, Map map, PaymentMethod paymentMethod, Map map2, boolean z5, boolean z6, boolean z7, int i2) {
        Object obj;
        String str7;
        boolean zLJFF;
        InterestFeePromotion interestFeePromotion;
        Map<String, Object> mapLIZ;
        Map<String, Object> mapConstructDaInfo;
        Map<String, Object> mapLIZIZ;
        String str8;
        String strLJIJJ;
        String strLJIJ;
        boolean z8 = z6;
        Map map3 = map2;
        PaymentMethod paymentMethod2 = paymentMethod;
        boolean z9 = z7;
        String str9 = str3;
        Boolean bool2 = bool;
        String str10 = str6;
        Map map4 = map;
        String str11 = str4;
        if ((i2 & 64) != 0) {
            str9 = null;
        }
        if ((i2 & 128) != 0) {
            str11 = null;
        }
        if ((i2 & 512) != 0) {
            z4 = false;
        }
        if ((i2 & 1024) != 0) {
            str10 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool2 = null;
        }
        if ((i2 & 8192) != 0) {
            map4 = null;
        }
        if ((i2 & 16384) != 0) {
            paymentMethod2 = null;
        }
        if ((32768 & i2) != 0) {
            map3 = null;
        }
        ?? r39 = z5;
        if ((65536 & i2) != 0) {
            r39 = 0;
        }
        if ((131072 & i2) != 0) {
            z8 = false;
        }
        if ((i2 & 262144) != 0) {
            z9 = false;
        }
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03o1.LIZ);
        linkedHashMap.put("option_name", str);
        linkedHashMap.put("is_pre_credit", String.valueOf((int) r39));
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
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("option_type", str2);
        linkedHashMap.put("is_default", C893803eS.LIZ(z4));
        linkedHashMap.put("is_pay_saved", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_balance_shown", Integer.valueOf(z3 ? 1 : 0));
        if (str10 != null) {
            linkedHashMap.put("parent_option_name", str10);
        }
        if (str9 != null && str9.length() != 0) {
            linkedHashMap.put("option_unavailable_code", str9);
        }
        if (str11 != null && str11.length() != 0) {
            linkedHashMap.put("status_code", str11);
        }
        if (str5 != null && str5.length() > 0) {
            linkedHashMap.put("pay_bind_status", str5);
        }
        if (paymentMethod2 != null && (str8 = paymentMethod2.id) != null) {
            linkedHashMap.put("payment_method_id", str8);
        }
        C038N.LIZ(linkedHashMap, map4);
        if (map3 == null || (obj = map3.get("checkout_type")) == null) {
            obj = "";
        }
        linkedHashMap.put("checkout_type", obj);
        if (paymentMethod2 != null && (mapLIZIZ = paymentMethod2.LIZIZ()) != null && (!mapLIZIZ.isEmpty())) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        C03WI c03wi = c03o1.LJIILLIIL;
        if (paymentMethod2 != null) {
            str7 = paymentMethod2.id;
            zLJFF = Intrinsics.LJFF(paymentMethod2.isChooseRecommend, Boolean.TRUE);
        } else {
            str7 = null;
            zLJFF = false;
        }
        c03wi.LIZ(linkedHashMap, new C03WJ(str7, paymentMethod2, null, zLJFF), z8, z9, null, true);
        C1018703yb.LIZIZ("tiktokec_select_option", linkedHashMap);
        C921903iz.LIZ.getClass();
        C921903iz.LIZIZ(4, linkedHashMap, "logPaymentSelectOption");
        if (Intrinsics.LJFF(bool2, Boolean.TRUE) && paymentMethod2 != null) {
            try {
                if (C03P6.LIZ()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(c03o1.LIZ);
                    linkedHashMap2.put("option_name", str);
                    linkedHashMap2.put("option_type", str2);
                    linkedHashMap2.put("rank", Integer.valueOf(i));
                    String strLJIJ2 = paymentMethod2.LJIJ();
                    if (strLJIJ2 == null) {
                        strLJIJ2 = "";
                    }
                    linkedHashMap2.put("marketing_batch_id", strLJIJ2);
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

    public static void LJIIL(C03O1 c03o1, String str, String str2, HashMap map, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, HashMap map2, Boolean bool2, Boolean bool3, C03P2 c03p2, HashMap map3, Boolean bool4, Map map4, String str8, Boolean bool5, Boolean bool6, int i) {
        String str9 = str2;
        HashMap map5 = map;
        String str10 = str3;
        String str11 = str4;
        String str12 = str6;
        String str13 = str5;
        HashMap map6 = map2;
        String str14 = str7;
        String str15 = str8;
        HashMap map7 = map3;
        Map map8 = map4;
        C03P2 c03p22 = c03p2;
        if ((i & 2) != 0) {
            str9 = null;
        }
        if ((i & 4) != 0) {
            map5 = null;
        }
        if ((i & 8) != 0) {
            str10 = null;
        }
        if ((i & 256) != 0) {
            str11 = null;
        }
        if ((i & 512) != 0) {
            num = null;
        }
        if ((i & 1024) != 0) {
            str13 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str12 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str14 = null;
        }
        if ((i & 8192) != 0) {
            bool = null;
        }
        if ((i & 16384) != 0) {
            map6 = null;
        }
        if ((65536 & i) != 0) {
            bool2 = null;
        }
        if ((131072 & i) != 0) {
            bool3 = null;
        }
        if ((262144 & i) != 0) {
            c03p22 = null;
        }
        if ((1048576 & i) != 0) {
            map7 = null;
        }
        if ((2097152 & i) != 0) {
            bool4 = null;
        }
        if ((8388608 & i) != 0) {
            map8 = null;
        }
        if ((536870912 & i) != 0) {
            str15 = null;
        }
        if ((1073741824 & i) != 0) {
            bool5 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            bool6 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03o1.LIZ);
        Object obj = linkedHashMap.get("checkout_type");
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("checkout_type", obj);
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
            linkedHashMap.put("is_recommended", C893803eS.LIZ(bool4.booleanValue()));
        }
        linkedHashMap.put("button_name", str);
        if (str9 != null) {
            linkedHashMap.put("button_type", str9);
        }
        linkedHashMap.put("if_use_pickup_location", 0);
        if (str10 != null) {
            linkedHashMap.put("page_name", str10);
        }
        if (map5 != null) {
            linkedHashMap.putAll(map5);
        }
        if (str11 != null) {
            linkedHashMap.put("pay_type", str11);
        }
        if (num != null) {
            linkedHashMap.put("is_credit_pay", Integer.valueOf(num.intValue()));
        }
        if (str13 != null && str13.length() != 0) {
            linkedHashMap.put("pay_bind_status", str13);
        }
        if (str12 != null) {
            linkedHashMap.put("total_payment", str12);
        }
        if (str14 != null) {
            linkedHashMap.put("installment_cnt", str14);
        }
        if (bool != null) {
            linkedHashMap.put("is_payment_method_selected", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (map6 != null) {
            linkedHashMap.putAll(map6);
        }
        if (c03p22 != null) {
            C855703Vz.LIZJ(c03p22, linkedHashMap);
        }
        if (map7 != null) {
            linkedHashMap.putAll(map7);
        }
        Object obj2 = linkedHashMap.get("enter_from");
        if (obj2 == null && (obj2 = linkedHashMap.get("enter_from_info")) == null) {
            obj2 = "";
        }
        linkedHashMap.put("enter_from", obj2);
        C038N.LIZ(linkedHashMap, map8);
        if (str15 != null) {
            linkedHashMap.put("payment_method", str15);
        }
        if (bool5 != null) {
            linkedHashMap.put("is_clickable", Boolean.valueOf(bool5.booleanValue()));
        }
        if (bool6 != null) {
            linkedHashMap.put("is_membership_check_success", Integer.valueOf(bool6.booleanValue() ? 1 : 0));
        }
        C1421105hJ.LIZJ("tiktokec_button_click", linkedHashMap);
    }

    public static void LJIILJJIL(C03O1 c03o1, String str, boolean z, String str2, String str3, HashMap map, String str4, Integer num, long j, String str5, String str6, Boolean bool, String str7, String str8, String str9, HashMap map2, Boolean bool2, Boolean bool3, C03P2 c03p2, C737802uO c737802uO, Boolean bool4, HashMap map3, Map map4, Boolean bool5, Map map5, Integer num2, String str10, Boolean bool6, String str11, int i) {
        Map map6 = map4;
        String str12 = str9;
        HashMap map7 = map3;
        C737802uO c737802uO2 = c737802uO;
        String str13 = str10;
        C03P2 c03p22 = c03p2;
        Map map8 = map5;
        String str14 = str8;
        HashMap map9 = map2;
        String str15 = str7;
        if ((i & 8192) != 0) {
            bool = null;
        }
        if ((i & 16384) != 0) {
            str15 = null;
        }
        if ((32768 & i) != 0) {
            str14 = null;
        }
        if ((65536 & i) != 0) {
            str12 = null;
        }
        if ((131072 & i) != 0) {
            map9 = null;
        }
        if ((524288 & i) != 0) {
            bool2 = null;
        }
        if ((1048576 & i) != 0) {
            bool3 = null;
        }
        if ((2097152 & i) != 0) {
            c03p22 = null;
        }
        if ((8388608 & i) != 0) {
            c737802uO2 = null;
        }
        if ((16777216 & i) != 0) {
            bool4 = null;
        }
        if ((33554432 & i) != 0) {
            map7 = null;
        }
        if ((67108864 & i) != 0) {
            map6 = null;
        }
        if ((134217728 & i) != 0) {
            bool5 = null;
        }
        if ((268435456 & i) != 0) {
            map8 = null;
        }
        if ((1073741824 & i) != 0) {
            num2 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            str13 = null;
        }
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03o1.LIZ);
        if (!Intrinsics.LJFF(str, "")) {
            linkedHashMap.remove("product_id");
            linkedHashMap.remove("author_id");
            HashMap mapLJ = C1741890vQh.LJ("entrance_info", linkedHashMap);
            if (mapLJ != null) {
                mapLJ.remove("product_id");
                mapLJ.remove("author_id");
                if (mapLJ != null) {
                    linkedHashMap.put("entrance_info", C1741890vQh.LJIIIIZZ(mapLJ));
                }
            }
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
        if (bool5 != null) {
            bool5.booleanValue();
            linkedHashMap.put("is_one_click_pay", C893803eS.LIZ(bool5.booleanValue()));
        }
        linkedHashMap.put("if_use_pickup_location", 0);
        if (bool4 != null) {
            linkedHashMap.put("is_recommended", C893803eS.LIZ(bool4.booleanValue()));
        }
        linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("fail_reason", str2);
        if (str3 != null) {
            linkedHashMap.put("error_code", str3);
        }
        if (z) {
            linkedHashMap.put("total_time", Long.valueOf((SystemClock.elapsedRealtime() - c03o1.LIZJ) - c03o1.LJFF));
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
        if (str6 != null) {
            linkedHashMap.put("total_payment", str6);
        }
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str15 != null && str15.length() != 0) {
            linkedHashMap.put("pay_bind_status", str15);
        }
        if (str14 != null) {
            linkedHashMap.put("combo_id", str14);
        }
        if (str12 != null) {
            linkedHashMap.put("installment_cnt", str12);
        }
        if (map9 != null) {
            linkedHashMap.putAll(map9);
        }
        if (c03p22 != null) {
            C855703Vz.LIZJ(c03p22, linkedHashMap);
        }
        if (c737802uO2 != null) {
            C855703Vz.LIZIZ(c737802uO2, linkedHashMap);
        }
        linkedHashMap.remove("bundle_product_id");
        if (map7 != null) {
            linkedHashMap.putAll(map7);
        }
        linkedHashMap.put("shipping_rights_content", c03o1.LJIIZILJ);
        if (map6 != null) {
            linkedHashMap.putAll(map6);
        }
        C038N.LIZ(linkedHashMap, map8);
        if (num2 != null) {
            num2.intValue();
            linkedHashMap.put("is_retry", "1");
        }
        if (str13 != null) {
            linkedHashMap.put("payment_method_id", str13);
        }
        linkedHashMap.put("payment_method", str11);
        if (bool6 != null) {
            linkedHashMap.put("is_membership_check_success", Integer.valueOf(bool6.booleanValue() ? 1 : 0));
        }
        C1421105hJ.LIZJ("tiktokec_submit_order_result", linkedHashMap);
    }

    public static void LJJIFFI(C03O1 c03o1, String str, String str2, Boolean bool, HashMap map, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str3, String str4, String str5, String str6, String str7, Boolean bool7, Boolean bool8, Boolean bool9, CommuteType commuteType, String str8, String str9, String str10, Boolean bool10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool11, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Map map2, Long l, Boolean bool12, String str28, String str29, Boolean bool13, Boolean bool14) {
        String strLIZ;
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03o1.LIZ);
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
        linkedHashMap.put("page_name", "mini_order_submit");
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
        linkedHashMap.put("installment_available", str15);
        if (str17 != null) {
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
        linkedHashMap.put("error_code", str22);
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
        LJJIJIIJIL("rd_pipo_osp_payment_params_debug", linkedHashMap);
    }
}
