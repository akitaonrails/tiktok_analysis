package X;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794700wns extends C1793980wmi {
    public static volatile C1794700wns LIZJ;
    public String LIZ = "size of 0 list";
    public String LIZIZ = "size of 0 list";

    public static C1794700wns LJ() {
        if (LIZJ == null) {
            synchronized (C1794700wns.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1794700wns();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static JSONObject LIZLLL(Purchase purchase) {
        JSONObject jSONObject = new JSONObject();
        if (purchase != null) {
            String strOptString = purchase.LIZJ.optString("orderId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = null;
            }
            C1793980wmi.LIZIZ("purchase_gp_order_id", strOptString, jSONObject);
            C1793980wmi.LIZIZ("purchase_token", purchase.LJ(), jSONObject);
            C1793980wmi.LIZIZ("original_json", purchase.LIZ, jSONObject);
            C1793980wmi.LIZIZ("purchase_signature", purchase.LIZIZ, jSONObject);
            C1793980wmi.LIZIZ("purchase_sku_id", C1794860wo8.LIZ(purchase), jSONObject);
            C1793980wmi.LIZ("purchase_state", purchase.LIZLLL(), jSONObject);
            return jSONObject;
        }
        C1793980wmi.LIZIZ("purchase_gp_order_id", "unknown", jSONObject);
        C1793980wmi.LIZIZ("purchase_token", "unknown", jSONObject);
        C1793980wmi.LIZIZ("original_json", "unknown", jSONObject);
        C1793980wmi.LIZIZ("purchase_signature", "unknown", jSONObject);
        C1793980wmi.LIZIZ("purchase_sku_id", "unknown", jSONObject);
        C1793980wmi.LIZ("purchase_state", -1L, jSONObject);
        return jSONObject;
    }

    @Override // X.C1793980wmi
    public final void LIZJ(HashMap map, JSONObject jSONObject) {
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJFF(String str, String str2, String str3, String str4, boolean z, List list) {
        long j;
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZIZ("payment_method", EnumC1791830wjF.GOOGLE.channelName, jSONObject);
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        C1793980wmi.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, j, jSONObject);
        if (str3 != null) {
            C1793980wmi.LIZIZ("class_name", str3, jSONObject);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Purchase purchase = (Purchase) it2.next();
            sb.append("{getOriginalJson:");
            sb.append(purchase.LIZ);
            sb.append(",getPurchaseState:");
            sb.append(purchase.LIZLLL());
            sb.append(",getProducts:");
            sb.append(purchase.LIZJ());
            sb.append("}");
        }
        if (list.size() == 0) {
            sb.append("size of 0 list");
        }
        String string = sb.toString();
        C1793980wmi.LIZ("purchases_size", list.size(), jSONObject);
        C1793980wmi.LIZIZ("query_result", string, jSONObject);
        C1793980wmi.LIZIZ("query_type", str2, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        if (str != null) {
            C1793980wmi.LIZIZ("Original_BillingResult", str, jSONObject2);
        }
        C1793980wmi.LIZIZ("restore_entrance", str4, jSONObject);
        if ("inapp".equals(str2) && !string.equals(this.LIZ)) {
            InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
            EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.APP_LOG;
            C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
            c1794310wnF.getClass();
            c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_check_unverified_transaction", jSONObject, null, jSONObject2);
            this.LIZ = string;
        } else if ("subs".equals(str2) && !string.equals(this.LIZIZ)) {
            InterfaceC1794350wnJ interfaceC1794350wnJLJ2 = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
            EnumC1794330wnH enumC1794330wnH2 = EnumC1794330wnH.APP_LOG;
            C1794310wnF c1794310wnF2 = (C1794310wnF) interfaceC1794350wnJLJ2;
            c1794310wnF2.getClass();
            c1794310wnF2.LIZ(enumC1794330wnH2, "livesdk_iap_check_unverified_transaction", jSONObject, null, jSONObject2);
            this.LIZIZ = string;
        }
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
        if (!C1795410wp1.LJ(0.2d, "ttlive_livesdk_iap_check_unverified_transaction")) {
            return;
        }
        InterfaceC1794350wnJ interfaceC1794350wnJLJ3 = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH3 = EnumC1794330wnH.MONITOR;
        C1794310wnF c1794310wnF3 = (C1794310wnF) interfaceC1794350wnJLJ3;
        c1794310wnF3.getClass();
        c1794310wnF3.LIZ(enumC1794330wnH3, "livesdk_iap_check_unverified_transaction", jSONObject, null, jSONObject2);
    }
}
