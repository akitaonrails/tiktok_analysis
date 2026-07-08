package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ubR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710110ubR {
    public static final C1710110ubR LIZ = new C1710110ubR();

    public static String LIZJ(String str) {
        if (str == null) {
            return "null";
        }
        if (a0.LJJJIL(str)) {
            return "blank";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("len=");
        sbLIZ.append(str.length());
        sbLIZ.append(":hash=");
        sbLIZ.append(Integer.toHexString(str.hashCode()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(String str) {
        return C13LN.LJZL(160, u.LJJIFFI(u.LJJIFFI(str, "\n", " ", false), "\r", " ", false));
    }

    public static String LJI(String str) {
        if (str == null) {
            return "null";
        }
        if (a0.LJJJIL(str)) {
            return "blank";
        }
        return u.LJJIFFI(u.LJJIFFI(str, "\n", " ", false), "\r", " ", false);
    }

    public final void LIZ(String str, CashierKey cashierKey, Map<String, ? extends Object> map) {
        getClass();
        LIZLLL("callback", str, "business_callback", null, cashierKey, null, null, map);
    }

    public final void LIZIZ(String str, CashierKey cashierKey, Map<String, ? extends Object> map) {
        getClass();
        LIZLLL("click", str, "user_click", null, cashierKey, null, null, map);
    }

    public static void LJII(String str, String str2, String str3, String str4, String str5, Map map) {
        LIZLLL("server_mutation", str3, str, str2, null, str4, str5, map);
    }

    public static void LJIIIIZZ(String str, String str2, String str3, String str4, String str5, Map map) {
        LIZLLL("state_changed", str3, str, str2, null, str4, str5, map);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, CashierKey cashierKey, String str5, String str6, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type=");
        sbLIZ.append(LJFF(str));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("name=");
        sbLIZ2.append(LJFF(str2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("scene=");
        sbLIZ3.append(LJFF(str3));
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("ttls_cashier_state", C2188811AlT.LIZIZ(sbLIZ), C2188811AlT.LIZIZ(sbLIZ2), C2188811AlT.LIZIZ(sbLIZ3));
        if (cashierKey != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cashier_key=");
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("payRequestId=");
            sbLIZ5.append(LJI(cashierKey.payRequestId));
            sbLIZ5.append("|notificationId=");
            sbLIZ5.append(LJI(cashierKey.notificationId));
            sbLIZ4.append(C2188811AlT.LIZIZ(sbLIZ5));
            listLJIILJJIL.add(C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (str4 != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("reason=");
            sbLIZ6.append(LJFF(str4));
            listLJIILJJIL.add(C2188811AlT.LIZIZ(sbLIZ6));
        }
        if (str5 != null) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("before=");
            sbLIZ7.append(LJFF(str5));
            listLJIILJJIL.add(C2188811AlT.LIZIZ(sbLIZ7));
        }
        if (str6 != null) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("after=");
            sbLIZ8.append(LJFF(str6));
            listLJIILJJIL.add(C2188811AlT.LIZIZ(sbLIZ8));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str7 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append(LJFF(str7));
                sbLIZ9.append('=');
                sbLIZ9.append(LJFF(value.toString()));
                listLJIILJJIL.add(C2188811AlT.LIZIZ(sbLIZ9));
            }
        }
        C1708710uZB.LIZ("Cashier").LIZ(4, C13LP.LJJLIIIJ(listLJIILJJIL, ", ", null, null, 0, null, null, 62));
    }
}
