package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletUserEnvLog;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796530wqp implements C0K8M {
    public static final C1796530wqp LIZ = new C1796530wqp();

    public static void LJIIJ(HashMap map) {
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_recharge_panel_load_package_success", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
    }

    @Override // X.C0K8M
    public final void LIZLLL(HashMap<String, Object> map) {
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_check_order_success", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
    }

    public static void LJII(String str, HashMap map) {
        C1796540wqq c1796540wqq = C1796540wqq.LIZ;
        EnumC1796260wqO enumC1796260wqO = EnumC1796260wqO.BOTH;
        c1796540wqq.LIZ(enumC1796260wqO, "livesdk_wallet_recharge_success", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
        if (LiveWalletUserEnvLog.INSTANCE.getValue()) {
            c1796540wqq.LIZ(enumC1796260wqO, "livesdk_iap_google_env_investigate", C1792860wku.LIZ(0, 0, ""), null, null, null, "wallet");
        }
        if (str != null && str.length() > 0) {
            C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1106030et7.Q5;
            c20337914i1.LIZIZ().remove(str);
            c20337914i1.LIZJ();
        }
    }

    public static void LJIIIZ(String str, HashMap map) {
        HashMap map2 = new HashMap();
        if (str != null) {
            try {
                if (str.length() > 0) {
                    C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1106030et7.Q5;
                    String str2 = c20337914i1.LIZIZ().get(str);
                    if (str2 != null) {
                        c20337914i1.LIZIZ().remove(str);
                        c20337914i1.LIZJ();
                        map2.put("restore_time_cost", Long.valueOf(System.currentTimeMillis() - CastLongProtector.parseLong(str2)));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_iap_finish_order_supply", C2348809Ig.LIZLLL(map), C2348809Ig.LIZLLL(map2), null, null, "wallet");
    }

    @Override // X.C0K8M
    public final void LJ(String str, HashMap map) throws JSONException {
        C1796540wqq c1796540wqq = C1796540wqq.LIZ;
        EnumC1796260wqO enumC1796260wqO = EnumC1796260wqO.BOTH;
        JSONObject jSONObjectLIZLLL = C2348809Ig.LIZLLL(map);
        if (jSONObjectLIZLLL != null) {
            jSONObjectLIZLLL.put("billing_country_code", ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).getBillingCountryCode());
        } else {
            jSONObjectLIZLLL = null;
        }
        c1796540wqq.LIZ(enumC1796260wqO, "livesdk_iap_create_order_success", jSONObjectLIZLLL, null, null, null, "wallet");
        if (str != null && str.length() > 0) {
            C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1106030et7.Q5;
            c20337914i1.LIZIZ().put(str, String.valueOf(System.currentTimeMillis()));
            c20337914i1.LIZJ();
        }
    }

    public static void LIZ(int i, int i2, String str) {
        if (LiveWalletUserEnvLog.INSTANCE.getValue()) {
            C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_iap_google_env_investigate", C1792860wku.LIZ(i, i2, str), null, null, null, "wallet");
        }
    }

    public static void LIZJ(int i, int i2, String str) {
        if (LiveWalletUserEnvLog.INSTANCE.getValue()) {
            C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_iap_google_env_investigate", C1792860wku.LIZ(i, i2, str), null, null, null, "wallet");
        }
    }

    @Override // X.C0K8M
    public final void LIZIZ(int i, String str, HashMap<String, Object> map) throws JSONException {
        HashMap map2 = new HashMap();
        map2.put("detail_code", Integer.valueOf(i));
        map2.put("error_code", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        map2.put("error_msg", str);
        if (map != null) {
            map2.putAll(map);
        }
        C1796540wqq c1796540wqq = C1796540wqq.LIZ;
        EnumC1796260wqO enumC1796260wqO = EnumC1796260wqO.BOTH;
        JSONObject jSONObjectLIZLLL = C2348809Ig.LIZLLL(map2);
        if (jSONObjectLIZLLL != null) {
            jSONObjectLIZLLL.put("billing_country_code", ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).getBillingCountryCode());
        } else {
            jSONObjectLIZLLL = null;
        }
        c1796540wqq.LIZ(enumC1796260wqO, "livesdk_iap_create_order_fail", jSONObjectLIZLLL, null, null, null, "wallet");
    }

    public static void LJIIIIZZ(int i, int i2, String str, HashMap map) {
        map.put("error_code", Integer.valueOf(i));
        map.put("detail_code", Integer.valueOf(i2));
        if (str == null) {
            str = "";
        }
        map.put("error_msg", str);
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_iap_finish_order_repeat_failed", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
    }

    @Override // X.C0K8M
    public final void LJFF(int i, String str, long j, String str2, String str3, boolean z) {
        String str4 = str3;
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("productId", str);
        map.put("orderId", str2);
        if (str4 == null) {
            str4 = "";
        }
        map.put("error_msg", str4);
        map.put("error_code", Integer.valueOf(i));
        map.put("is_subscription", Integer.valueOf(z ? 1 : 0));
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_check_order_failed", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
    }

    public static void LJI(int i, int i2, int i3, String str, String str2, String str3, HashMap map) {
        String str4;
        map.put("error_code", Integer.valueOf(i));
        map.put("detail_code", Integer.valueOf(i2));
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        map.put("error_msg", str4);
        map.put("stage", Integer.valueOf(i3));
        if (str2 == null) {
            str2 = "-1";
        }
        map.put("mapped_error_code", str2);
        if (str3 == null) {
            str3 = "";
        }
        map.put("mapped_error_message", str3);
        C1796540wqq c1796540wqq = C1796540wqq.LIZ;
        EnumC1796260wqO enumC1796260wqO = EnumC1796260wqO.BOTH;
        c1796540wqq.LIZ(enumC1796260wqO, "livesdk_wallet_recharge_failed", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
        if (LiveWalletUserEnvLog.INSTANCE.getValue()) {
            c1796540wqq.LIZ(enumC1796260wqO, "livesdk_iap_google_env_investigate", C1792860wku.LIZ(i, i2, str), null, null, null, "wallet");
        }
    }

    public static final void LJIIJJI(long j, long j2, long j3, long j4, long j5, String str, String str2, boolean z) {
        String str3;
        String str4 = str;
        String strLIZ = str2;
        HashMap map = new HashMap();
        if (z) {
            str3 = "livesdk_wallet_update_info_aftPay_success";
        } else {
            if (str4 == null) {
                str4 = "";
            }
            map.put("error_msg", str4);
            str3 = "livesdk_wallet_update_info_aftPay_failed";
        }
        map.put("duration", Long.valueOf(j));
        C1796540wqq c1796540wqq = C1796540wqq.LIZ;
        EnumC1796260wqO enumC1796260wqO = EnumC1796260wqO.BOTH;
        c1796540wqq.LIZ(enumC1796260wqO, str3, C2348809Ig.LIZLLL(map), null, null, null, "wallet");
        HashMap map2 = new HashMap();
        if (strLIZ == null) {
            strLIZ = C1796440wqg.LIZ();
        }
        map2.put("charge_channel", strLIZ);
        map2.put("is_update", Integer.valueOf(c1796540wqq.LIZIZ(j2, j3) ? 1 : 0));
        map2.put("request_succeeded", Integer.valueOf(z ? 1 : 0));
        map2.put("original_coin_version", Long.valueOf(j4));
        map2.put("updated_coin_version", Long.valueOf(j5));
        c1796540wqq.LIZ(enumC1796260wqO, "livesdk_recharge_coins_balance_response", C2348809Ig.LIZLLL(map2), null, null, null, "wallet");
    }
}
