package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197481AzS {
    public static final /* synthetic */ int LJIJJLI = 0;
    public boolean LJI;
    public long LJIILIIL;
    public String LJIJ;
    public C1232850iBf LJIJJ;
    public final HashMap<String, Long> LIZ = new HashMap<>();
    public String LIZIZ = "";
    public final String LIZJ = C1017903yT.LIZ();
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public C2197361AzG LJII = new C2197361AzG(null, 3);
    public final String LJIIIIZZ = "";
    public final String LJIIIZ = "";
    public final String LJIIJ = "";
    public double LJIIJJI = -1.0d;
    public String LJIIL = "";
    public long LJIILJJIL = -1;
    public String LJIILL = "";
    public String LJIILLIIL = "";
    public HashMap<String, String> LJIIZILJ = new HashMap<>();
    public Integer LJIJI = 0;

    public final long LIZ(String str) {
        Long l;
        if (this.LIZ.containsKey(str) && (l = this.LIZ.get(str)) != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                return System.currentTimeMillis() - jLongValue;
            }
        }
        return -1L;
    }

    public static void LIZLLL(String str, Map map) {
        long jLongValue;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!str2.equals("duration") && !str2.equals("full_payment_duration") && !str2.equals("recharge_and_pay_duration") && !str2.equals("stay_duration")) {
                    jSONObject.put(str2, str3);
                } else {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(str3);
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reportApm, value:");
                    sbLIZ.append(str3);
                    sbLIZ.append(", valueLong:");
                    sbLIZ.append(jLongValue);
                    C2188811AlT.LIZIZ(sbLIZ);
                    jSONObject2.put(str2, jLongValue);
                }
            }
            C08S3.LIZ.getClass();
            C08S3.LIZ(str, jSONObject, jSONObject2, jSONObject3);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportApm, category:");
            sbLIZ2.append(jSONObject);
            sbLIZ2.append(", metrics:");
            sbLIZ2.append(jSONObject2);
            sbLIZ2.append(", extraLog:");
            sbLIZ2.append(jSONObject3);
            C2188811AlT.LIZIZ(sbLIZ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(C2197481AzS c2197481AzS, String str, long j, int i, String str2, String str3, String str4, int i2) {
        Set<String> setKeySet;
        String str5;
        String str6 = "";
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            j = -1;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        if ((i2 & 32) == 0) {
            str6 = str4;
        }
        c2197481AzS.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        HashMap<String, String> map = c2197481AzS.LJIIZILJ;
        if (map != null && (setKeySet = map.keySet()) != null) {
            for (String str7 : setKeySet) {
                HashMap<String, String> map2 = c2197481AzS.LJIIZILJ;
                if (map2 != null && (str5 = map2.get(str7)) != null) {
                    c2344009Gk.LJFF(str7, str5);
                }
            }
        }
        c2344009Gk.LJFF("ttoclid", c2197481AzS.LJII.LIZ);
        c2344009Gk.LJFF("flow_id", c2197481AzS.LIZJ);
        c2344009Gk.LJFF("episode_id", c2197481AzS.LJIIIZ);
        c2344009Gk.LJFF("collection_id", c2197481AzS.LJIIIIZZ);
        c2344009Gk.LJFF("product_id", c2197481AzS.LJIIJ);
        if (Intrinsics.LJFF(str, "tm_recharge_panel_show") || Intrinsics.LJFF(str, "tm_recharge_panel_exit") || Intrinsics.LJFF(str, "tm_recharge_panel_click")) {
            c2344009Gk.LIZLLL(c2197481AzS.LJIILIIL, "recharge_beans_amount");
        }
        if (Intrinsics.LJFF(str, "tm_recharge_and_unlock_panel_show") || Intrinsics.LJFF(str, "tm_recharge_and_unlock_panel_pur_button_click") || Intrinsics.LJFF(str, "tm_recharge_and_unlock_panel_exit")) {
            c2344009Gk.LIZLLL(c2197481AzS.LJIILIIL, "topup_beans_amount");
        }
        if (Intrinsics.LJFF(str, "tm_unlock_N_episodes_panel_show") || Intrinsics.LJFF(str, "tm_unlock_N_episodes_panel_pur_button_click") || Intrinsics.LJFF(str, "tm_unlock_N_episodes_panel_exit")) {
            c2344009Gk.LIZLLL(c2197481AzS.LJIILIIL, "consume_beans_amount");
        }
        if (Intrinsics.LJFF(str, "tm_recharge_and_unlock_panel_show") || Intrinsics.LJFF(str, "tm_recharge_and_unlock_panel_pur_button_click") || Intrinsics.LJFF(str, "tm_recharge_and_unlock_panel_exit")) {
            c2344009Gk.LIZLLL(c2197481AzS.LJIILIIL, "recharge_beans_amount");
            c2344009Gk.LIZLLL(c2197481AzS.LJIILJJIL, "consume_beans_amount");
        }
        if (Intrinsics.LJFF(str, "tm_recharge_and_unlock_panel_show") || Intrinsics.LJFF(str, "tm_recharge_and_unlock_panel_pur_button_click")) {
            c2344009Gk.LJFF("sku_type", c2197481AzS.LJIILLIIL);
        }
        if (str2.length() != 0) {
            c2344009Gk.LJFF("exit_method", str2);
        }
        String str8 = c2197481AzS.LJIIL;
        if (str8 != null && str8.length() != 0) {
            c2344009Gk.LJFF("recharge_currency", c2197481AzS.LJIIL);
        }
        double d = c2197481AzS.LJIIJJI;
        if (d > 0.0d) {
            c2344009Gk.LIZ(d, "recharge_denomination");
        }
        if (j > 0) {
            c2344009Gk.LIZLLL(j, "stay_duration");
        }
        if (i >= 0) {
            c2344009Gk.LIZJ(i, "terms_status");
        }
        if (str3.length() != 0) {
            c2344009Gk.LJFF("pay_method", str3);
        }
        if (str6.length() != 0) {
            c2344009Gk.LJFF("click_position", str6);
        }
        c2344009Gk.LIZJ(C204575153d.LIZIZ() ? 1 : 0, "is_debug");
        Map<String, String> map3 = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ(str, map3);
        LIZLLL(str, map3);
    }

    public static void LIZJ(C2197481AzS c2197481AzS, String str, int i, String str2, long j, int i2, long j2, long j3, String str3, String str4, int i3, String str5, String str6, boolean z, Integer num, String str7, C1232850iBf c1232850iBf, int i4) {
        String str8;
        int iIntValue;
        String string;
        boolean z2;
        String str9;
        int i5;
        String strValueOf;
        Set<String> setKeySet;
        String str10;
        String str11 = str2;
        int i6 = i;
        String str12 = str;
        C1232850iBf c1232850iBf2 = c1232850iBf;
        int i7 = i3;
        String str13 = str4;
        String str14 = str6;
        String str15 = str3;
        String str16 = str5;
        long j4 = j2;
        int i8 = i2;
        long j5 = j;
        String str17 = "";
        if ((i4 & 1) != 0) {
            str12 = "";
        }
        if ((i4 & 2) != 0) {
            i6 = Integer.MIN_VALUE;
        }
        if ((i4 & 4) != 0) {
            str11 = "";
        }
        long j6 = -1;
        if ((i4 & 8) != 0) {
            j5 = -1;
        }
        if ((i4 & 16) != 0) {
            i8 = -1;
        }
        if ((i4 & 32) != 0) {
            j4 = -1;
        }
        if ((i4 & 64) == 0) {
            j6 = j3;
        }
        if ((i4 & 128) != 0) {
            str15 = "";
        }
        if ((i4 & 256) != 0) {
            str13 = "";
        }
        if ((i4 & 512) != 0) {
            i7 = -1;
        }
        if ((i4 & 1024) != 0) {
            str16 = "";
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str14 = "";
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z = false;
        }
        if ((i4 & 8192) != 0) {
            num = null;
        }
        if ((i4 & 16384) != 0) {
            str7 = null;
        }
        if ((i4 & 32768) != 0) {
            c1232850iBf2 = null;
        }
        String str18 = c2197481AzS.LJIJ;
        Integer num2 = c2197481AzS.LJIJI;
        if (num2 != null && num2.intValue() == Integer.MIN_VALUE) {
            num2 = 0;
        }
        int i9 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordFlowStep, flowStep:");
        sbLIZ.append(str12);
        sbLIZ.append(", errorCode:");
        sbLIZ.append(i6);
        sbLIZ.append(", lastStep:");
        sbLIZ.append(str18);
        sbLIZ.append(", lastStepErrorCode:");
        sbLIZ.append(num2);
        C2188811AlT.LIZIZ(sbLIZ);
        c2197481AzS.LJIJ = str12;
        c2197481AzS.LJIJI = Integer.valueOf(i6);
        c2197481AzS.LJIJJ = c1232850iBf2;
        if (z) {
            c2197481AzS.LIZ.put(str12, Long.valueOf(System.currentTimeMillis()));
        }
        if (!Intrinsics.LJFF(str12, "minis_checkbalance_jsb_result_fail") && !Intrinsics.LJFF(str12, "minis_recharge_jsb_result_fail") && !Intrinsics.LJFF(str12, "minis_pay_jsb_result_fail") && (a0.LJJIIZI(str12, "fail", false) || a0.LJJIIZI(str12, "timeout", false))) {
            c2197481AzS.LIZIZ = str12;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        HashMap<String, String> map = c2197481AzS.LJIIZILJ;
        if (map != null && (setKeySet = map.keySet()) != null) {
            for (String str19 : setKeySet) {
                HashMap<String, String> map2 = c2197481AzS.LJIIZILJ;
                if (map2 != null && (str10 = map2.get(str19)) != null) {
                    c2344009Gk.LJFF(str19, str10);
                }
            }
        }
        c2344009Gk.LJFF("flow_name", c2197481AzS.LIZLLL);
        c2344009Gk.LJFF("step", str12);
        c2344009Gk.LJFF("flow_id", c2197481AzS.LIZJ);
        c2344009Gk.LJFF("ttoclid", c2197481AzS.LJII.LIZ);
        if (Intrinsics.LJFF(str12, "minis_checkbalance_jsb_result_fail") || Intrinsics.LJFF(str12, "minis_recharge_jsb_result_fail") || Intrinsics.LJFF(str12, "minis_pay_jsb_result_fail") || Intrinsics.LJFF(str12, "minis_recharge_jsb_result_success") || Intrinsics.LJFF(str12, "minis_pay_jsb_result_success") || Intrinsics.LJFF(str12, "minis_checkbalance_jsb_result_success")) {
            if (str18 == null) {
                str8 = "";
            } else {
                str8 = str18;
            }
            c2344009Gk.LJFF("last_step", str8);
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            c2344009Gk.LIZJ(iIntValue, "last_step_error_code");
            c2344009Gk.LJFF("error_msg", str11);
            int i10 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("recordFlowStep, record jsb result, lastStep:");
            sbLIZ2.append(str18);
            sbLIZ2.append(", tempLastStepCode:");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(", errorMsg:");
            sbLIZ2.append(str11);
            C2188811AlT.LIZIZ(sbLIZ2);
            c2197481AzS.LJIJ = null;
            c2197481AzS.LJIJI = null;
        }
        if (i6 != Integer.MIN_VALUE) {
            if (c1232850iBf2 == null || (strValueOf = c1232850iBf2.LIZ()) == null) {
                strValueOf = String.valueOf(i6);
            }
            c2344009Gk.LJFF("error_code", strValueOf);
        }
        if (j5 >= 0) {
            c2344009Gk.LIZLLL(j5, "duration");
        }
        if (i7 >= 0) {
            c2344009Gk.LIZJ(i7, "is_term_checked");
        }
        if (i8 >= 0) {
            c2344009Gk.LIZJ(i8, "query_order_count");
        }
        long j7 = c2197481AzS.LJIILIIL;
        if (j7 > 0) {
            c2344009Gk.LIZLLL(j7, "beans");
        }
        long j8 = c2197481AzS.LJIILJJIL;
        if (j8 > 0) {
            c2344009Gk.LIZLLL(j8, "target_consume_amount");
        }
        String str20 = c2197481AzS.LJIIL;
        if (str20 != null && str20.length() != 0) {
            c2344009Gk.LJFF("currency_type", c2197481AzS.LJIIL);
        }
        double d = c2197481AzS.LJIIJJI;
        if (d > 0.0d) {
            c2344009Gk.LIZ(d, "price");
        }
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        c2344009Gk.LJFF("inner_error_code", string);
        if (str7 != null) {
            str17 = str7;
        }
        c2344009Gk.LJFF("inner_error_msg", str17);
        if (j6 >= 0) {
            c2344009Gk.LIZLLL(j6, "recharge_and_pay_duration");
        }
        if (Intrinsics.LJFF(str12, "dismiss_recharge_sheet") || Intrinsics.LJFF(str12, "dismiss_normal_pay_sheet") || Intrinsics.LJFF(str12, "dismiss_recharge_and_pay_sheet")) {
            c2344009Gk.LJFF("dismiss_reason", str15);
        }
        if (Intrinsics.LJFF(str12, "show_recharge_and_pay_sheet")) {
            if (c2197481AzS.LJIILIIL == c2197481AzS.LJIILJJIL) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            c2344009Gk.LIZJ(i5, "is_match_tier_beans");
        }
        if (str13.length() != 0) {
            c2344009Gk.LJFF("last_fail_reason", str13);
        }
        if (str16.length() != 0) {
            c2344009Gk.LJFF("error_src", str16);
        }
        if (str14.length() != 0) {
            c2344009Gk.LJFF("extras", str14);
        }
        if (j4 > 0) {
            c2344009Gk.LIZLLL(j4, "full_payment_duration");
        }
        String str21 = c2197481AzS.LJ;
        if (str21 != null && str21.length() != 0) {
            c2344009Gk.LJFF("recharge_trade_order_id", c2197481AzS.LJ);
        }
        String str22 = c2197481AzS.LJFF;
        if (str22 != null && str22.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            c2344009Gk.LJFF("pay_trade_order_id", c2197481AzS.LJFF);
        }
        String str23 = c2197481AzS.LJFF;
        if (str23 != null && str23.length() != 0) {
            c2344009Gk.LJFF("pay_trade_order_id", c2197481AzS.LJFF);
        }
        String str24 = c2197481AzS.LJIILL;
        if (str24 != null && str24.length() != 0) {
            c2344009Gk.LJFF("button_mode", c2197481AzS.LJIILL);
        }
        if (c2197481AzS.LJI) {
            str9 = "external";
        } else {
            str9 = "iap";
        }
        c2344009Gk.LJFF("pay_method", str9);
        c2344009Gk.LIZJ(C204575153d.LIZIZ() ? 1 : 0, "is_debug");
        Map<String, String> map3 = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("minis_payment_client_event", map3);
        LIZLLL("minis_payment_client_event", map3);
    }
}
