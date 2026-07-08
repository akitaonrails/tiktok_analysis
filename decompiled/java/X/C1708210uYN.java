package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS76S1000000_26;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0uYN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708210uYN {
    public static void LIZ(String str, String str2, String str3, boolean z) throws JSONException {
        SparkActivity sparkActivity;
        InterfaceC1708270uYT interfaceC1708270uYT;
        if (str.length() == 0) {
            return;
        }
        Map<String, WeakReference<InterfaceC1708270uYT>> map = C1708220uYO.LJ;
        Reference reference = (Reference) ((LinkedHashMap) map).get(str);
        if (reference != null && (interfaceC1708270uYT = (InterfaceC1708270uYT) reference.get()) != null && !interfaceC1708270uYT.getNotified()) {
            interfaceC1708270uYT.setNotified(true);
            map.remove(str);
            if (z) {
                C1708220uYO.LIZLLL.getClass();
                LIZJ(str, CardStruct.IStatusCode.DEFAULT, null, null);
                interfaceC1708270uYT.LIZ(0, null);
            } else {
                C1708220uYO.LIZLLL.getClass();
                LIZJ(str, "1", str2, str3);
                interfaceC1708270uYT.LIZ(1, str3);
            }
        }
        String str4 = (String) ((LinkedHashMap) C1708220uYO.LJFF).get(str);
        if (str4 != null) {
            SparkContext.Companion.getClass();
            InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str4);
            if (interfaceC1059280dfiLIZ != null) {
                interfaceC1059280dfiLIZ.close();
            }
        }
        Reference reference2 = (Reference) ((LinkedHashMap) C1708220uYO.LJI).get(str);
        if (reference2 != null && (sparkActivity = (SparkActivity) reference2.get()) != null && !sparkActivity.isFinishing() && !sparkActivity.isDestroyed()) {
            sparkActivity.finish();
        }
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        InterfaceC1708270uYT interfaceC1708270uYT;
        Map<String, WeakReference<InterfaceC1708270uYT>> map = C1708220uYO.LJ;
        Reference reference = (Reference) ((LinkedHashMap) map).get(str);
        if (reference != null) {
            interfaceC1708270uYT = (InterfaceC1708270uYT) reference.get();
        } else {
            interfaceC1708270uYT = null;
        }
        if (interfaceC1708270uYT != null) {
            if (!interfaceC1708270uYT.getNotified()) {
                interfaceC1708270uYT.setNotified(true);
                map.remove(str);
                C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("notifyBindStatusV2");
                sbLIZ.append(" notify result: ");
                sbLIZ.append(z);
                c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    C1708220uYO.LIZLLL.getClass();
                    LIZJ(str, CardStruct.IStatusCode.DEFAULT, null, null);
                    interfaceC1708270uYT.LIZ(0, null);
                } else {
                    C1708220uYO.LIZLLL.getClass();
                    LIZJ(str, "1", str2, str3);
                    interfaceC1708270uYT.LIZ(1, str3);
                }
                C1708220uYO.LIZLLL.getClass();
                ((ArrayList) C1708220uYO.LJIIIIZZ).remove(str);
                return;
            }
            C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("notifyBindStatusV2");
            sbLIZ2.append(" notified already");
            c1708720uZCLIZ2.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C1708720uZC c1708720uZCLIZ3 = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("notifyBindStatusV2");
        sbLIZ3.append(" callback is released");
        c1708720uZCLIZ3.LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void LIZJ(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1708220uYO.LIZLLL.getClass();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) C1708220uYO.LJII;
        HashMap map = (HashMap) linkedHashMap2.get(str);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("result", str2);
        if (str4 != null) {
            linkedHashMap.put("error_msg", str4);
        }
        if (str3 != null) {
            linkedHashMap.put("error_code", str3);
        }
        if (C1707770uXf.LIZ()) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_middle_page_optimize", str5);
        HashMap map2 = (HashMap) linkedHashMap2.get(str);
        if (map2 == null || (str6 = (String) map2.get("pay_request_id")) == null) {
            str6 = str;
        }
        C1708030uY5.LIZ.LIZ(new C1708140uYG(str)).LJ(linkedHashMap, new AwS76S1000000_26(str6, 0));
    }

    public static void LIZLLL(PaymentOption paymentOption, String str, String str2, String str3) {
        String strLJIL;
        PODaInfo pODaInfo;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str5 = "";
        if (paymentOption == null || (strLJIL = paymentOption.LJIL()) == null) {
            strLJIL = "";
        }
        linkedHashMap.put("payment_method_id", strLJIL);
        if (paymentOption != null && (pODaInfo = paymentOption.trackInfo) != null && (str4 = pODaInfo.optionName) != null) {
            str5 = str4;
        }
        linkedHashMap.put("payment_method", str5);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("pay_request_id", str2);
        C1708030uY5.LIZ.LIZ(new C1708140uYG(str3)).LIZLLL(linkedHashMap, new AwS76S1000000_26(str2, 1));
    }

    public static void LJ(PaymentOption paymentOption, C1709570uaZ c1709570uaZ, C19EG c19eg, String str, List list, Function1 function1, Function1 function12) {
        C1707990uY1 c1707990uY1;
        C1708030uY5.LIZ.LIZ(new C1708140uYG(str)).LIZJ(EnumC1708150uYH.PRE_RISK.getStepName(), null);
        if (c1709570uaZ != null && (c1707990uY1 = c1709570uaZ.LIZIZ) != null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1708390uYf(c1707990uY1, paymentOption, c1709570uaZ, list, function12, str, c19eg, function1, null), 2);
        }
    }
}
