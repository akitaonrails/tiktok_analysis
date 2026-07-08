package X;

import Y.ARunnableS126S0100000_26;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707910uXt {
    public static C1709570uaZ LJFF;
    public static final C1707910uXt LIZ = new C1707910uXt();
    public static final HashMap<CashierKey, C1707790uXh> LIZIZ = new HashMap<>();
    public static final List<CashierKey> LIZJ = new ArrayList();
    public static final Map<CashierKey, Runnable> LIZLLL = new LinkedHashMap();
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public static final ArrayList<CashierKey> LJI = new ArrayList<>();
    public static final ArrayList<CashierKey> LJII = new ArrayList<>();
    public static final ArrayList<CashierKey> LJIIIIZZ = new ArrayList<>();

    public static boolean LIZ(CashierKey cashierKey) {
        C1708990uZd c1708990uZd;
        C1709570uaZ c1709570uaZ = LJFF;
        if (c1709570uaZ != null && (c1708990uZd = c1709570uaZ.LJIIZILJ) != null && c1708990uZd.LJIIIZ) {
            return false;
        }
        if ((!TextUtils.isEmpty(cashierKey.payRequestId) || !TextUtils.isEmpty(cashierKey.notificationId)) && LJI.contains(cashierKey)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(CashierKey cashierKey) {
        if ((TextUtils.isEmpty(cashierKey.payRequestId) && TextUtils.isEmpty(cashierKey.notificationId)) || !LJII.contains(cashierKey)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(CashierKey cashierKey) {
        return !LIZIZ(cashierKey);
    }

    public static void LJII(CashierKey cashierKey) {
        LJI(cashierKey, 0, null, null, null);
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notify pay succ: ");
        sbLIZ.append(cashierKey);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL(CashierKey cashierKey, String str, String str2) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notify pay cancel: ");
        sbLIZ.append(cashierKey);
        sbLIZ.append(",scene: ");
        sbLIZ.append(str);
        sbLIZ.append(", reason: ");
        sbLIZ.append(str2);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        LJI(cashierKey, 2, null, null, null);
    }

    public static void LJIIIZ(String str, CashierKey cashierKey, C1709570uaZ c1709570uaZ) {
        ArrayList arrayList = (ArrayList) LIZJ;
        if (!arrayList.contains(cashierKey)) {
            arrayList.add(cashierKey);
        }
        LJFF = c1709570uaZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1709570uaZ.LJIIJJI());
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("type", String.valueOf(Intrinsics.LJFF(str, "secondary_payment_method") ? 1 : 0));
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        String str2 = cashierKey.payRequestId;
        if (str2 == null) {
            str2 = "";
        }
        c1708030uY5.LIZ(new C1708070uY9(str2)).LIZLLL(linkedHashMap, new AwS605S0100000_26(cashierKey, 746));
    }

    public static final void LJ(CashierKey cashierKey, long j, String str, String str2) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notify pay complete: ");
        sbLIZ.append(cashierKey);
        sbLIZ.append(",scene: ");
        sbLIZ.append(str);
        sbLIZ.append(", reason: ");
        sbLIZ.append(str2);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        if (j > 0) {
            ARunnableS126S0100000_26 aRunnableS126S0100000_26 = new ARunnableS126S0100000_26(cashierKey, 104);
            LIZLLL.put(cashierKey, aRunnableS126S0100000_26);
            C786410Ut5.LJLIIL(j, LJ, aRunnableS126S0100000_26);
            return;
        }
        LJI(cashierKey, 3, null, null, null);
    }

    public static void LJFF(CashierKey cashierKey, int i, String str, String str2, int i2) {
        C1707930uXv c1707930uXv;
        if ((i2 & 64) != 0) {
            str2 = null;
        }
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notify pay err: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(cashierKey);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        C1710930ucl.LIZ.getClass();
        try {
            if (str2 == null) {
                str2 = "{}";
            }
            JSONObject jSONObject = new JSONObject(str2);
            c1707930uXv = new C1707930uXv(jSONObject.optString("oe_code"), jSONObject.optString("oe_message"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            c1707930uXv = new C1707930uXv(null, null);
        }
        LJI(cashierKey, 1, Integer.valueOf(i), str, c1707930uXv);
    }

    public static void LJI(CashierKey cashierKey, int i, Integer num, String str, C1707930uXv c1707930uXv) {
        boolean z;
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notify pay event: ");
        sbLIZ.append(cashierKey);
        sbLIZ.append(", result: ");
        sbLIZ.append(i);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        boolean zLIZ = LIZ(cashierKey);
        boolean z2 = false;
        if (zLIZ) {
            C1710110ubR.LIZ.LIZ("pipo_pay_result_skip", cashierKey, C2097608Jq.LJIIIIZZ(new Pair("eventName", "pipo_pay_result"), new Pair("result", Integer.valueOf(i)), new Pair("reason", "already_notified")));
            return;
        }
        LJI.add(cashierKey);
        LJII.remove(cashierKey);
        C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("endPayQuery ");
        sbLIZ2.append(cashierKey);
        c1708720uZCLIZ2.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
        C1707970uXz.LIZ.remove(cashierKey.toString());
        n nVar = new n();
        nVar.LJJIIJ("pay_request_id", cashierKey.payRequestId);
        nVar.LJJIIJ("notification_id", cashierKey.notificationId);
        nVar.LJJIII(Integer.valueOf(i), "result");
        if (str != null) {
            nVar.LJJIIJ("error_msg", str);
        }
        if (num != null) {
            nVar.LJJIIJ("error_code", String.valueOf(num.intValue()));
        }
        if (c1707930uXv != null) {
            String str2 = c1707930uXv.LIZ;
            if (str2 != null) {
                nVar.LJJIIJ("oe_code", str2);
            }
            String str3 = c1707930uXv.LIZIZ;
            if (str3 != null) {
                nVar.LJJIIJ("oe_message", str3);
            }
        }
        String string = nVar.toString();
        C1710110ubR c1710110ubR = C1710110ubR.LIZ;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("eventName", "pipo_pay_result");
        pairArr[1] = new Pair("result", Integer.valueOf(i));
        pairArr[2] = new Pair("errorCode", num);
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        pairArr[3] = new Pair("hasErrorMsg", Boolean.valueOf(!z));
        if (c1707930uXv != null) {
            z2 = true;
        }
        pairArr[4] = new Pair("hasOEError", Boolean.valueOf(z2));
        c1710110ubR.LIZ("pipo_pay_result", cashierKey, C2097608Jq.LJIIIIZZ(pairArr));
        new C1548870qPN().LJ("pipo_pay_result", string);
        LJIIIIZZ(cashierKey, i, num, str, null, null);
    }

    public static void LJIIIIZZ(CashierKey cashierKey, int i, Integer num, String str, C1707930uXv c1707930uXv, String str2) {
        String str3;
        ArrayList arrayList = (ArrayList) LIZJ;
        if (arrayList.contains(cashierKey)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", String.valueOf(i));
            C1709570uaZ c1709570uaZ = LJFF;
            if (c1709570uaZ != null) {
                linkedHashMap.putAll(c1709570uaZ.LJIIJJI());
            }
            if (str != null) {
                linkedHashMap.put("error_msg", str);
            }
            if (num != null) {
                linkedHashMap.put("error_code", String.valueOf(num.intValue()));
            }
            if (c1707930uXv != null) {
                String str4 = c1707930uXv.LIZ;
                if (str4 != null) {
                    linkedHashMap.put("oe_code", str4);
                }
                String str5 = c1707930uXv.LIZIZ;
                if (str5 != null) {
                    linkedHashMap.put("oe_message", str5);
                }
            }
            if (str2 != null) {
                linkedHashMap.put("internal_error_code", str2);
            }
            if (C1707770uXf.LIZ()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_middle_page_optimize", str3);
            C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
            String str6 = cashierKey.payRequestId;
            if (str6 == null) {
                str6 = "";
            }
            c1708030uY5.LIZ(new C1708070uY9(str6)).LJ(linkedHashMap, new AwS605S0100000_26(cashierKey, 745));
            arrayList.remove(cashierKey);
            C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report pay result: ");
            sbLIZ.append(cashierKey);
            sbLIZ.append(", params: ");
            sbLIZ.append(linkedHashMap);
            c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
