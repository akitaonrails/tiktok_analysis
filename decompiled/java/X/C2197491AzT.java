package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197491AzT {
    public Integer LJIIJ;
    public String LJIIL;
    public C1232850iBf LJIIZILJ;
    public boolean LJIJ;
    public final HashMap<String, Long> LIZ = new HashMap<>();
    public String LIZIZ = "";
    public final String LIZJ = C1017903yT.LIZ();
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public C2197361AzG LJI = new C2197361AzG(null, 3);
    public double LJII = -1.0d;
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public HashMap<String, String> LJIIJJI = new HashMap<>();
    public Integer LJIILIIL = 0;
    public int LJIILJJIL = -1;
    public long LJIILL = -1;
    public String LJIILLIIL = "";
    public String LJIJI = "none";
    public String LJIJJ = "";

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

    public static void LIZIZ(C2197491AzT c2197491AzT, String str, int i, String str2, long j, int i2, long j2, String str3, String str4, String str5, String str6, boolean z, Integer num, String str7, C1232850iBf c1232850iBf, int i3) {
        boolean z2;
        int iIntValue;
        String string;
        String str8;
        long jLongValue;
        String strValueOf;
        Set<String> setKeySet;
        String str9;
        String str10 = str2;
        int i4 = i;
        String str11 = str;
        String str12 = str6;
        int i5 = i2;
        String str13 = str3;
        String str14 = str4;
        C1232850iBf c1232850iBf2 = c1232850iBf;
        String str15 = str5;
        long j3 = j;
        String str16 = "";
        if ((i3 & 1) != 0) {
            str11 = "";
        }
        if ((i3 & 2) != 0) {
            i4 = Integer.MIN_VALUE;
        }
        if ((i3 & 4) != 0) {
            str10 = "";
        }
        long j4 = -1;
        if ((i3 & 8) != 0) {
            j3 = -1;
        }
        if ((i3 & 16) != 0) {
            i5 = -1;
        }
        if ((i3 & 32) == 0) {
            j4 = j2;
        }
        if ((i3 & 64) != 0) {
            str13 = "";
        }
        if ((i3 & 128) != 0) {
            str14 = "";
        }
        if ((i3 & 256) != 0) {
            str15 = "";
        }
        if ((i3 & 512) != 0) {
            str12 = "";
        }
        if ((i3 & 1024) != 0) {
            z = false;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str7 = null;
        }
        if ((i3 & 8192) != 0) {
            c1232850iBf2 = null;
        }
        String str17 = c2197491AzT.LJIIL;
        Integer num2 = c2197491AzT.LJIILIIL;
        if (num2 != null && num2.intValue() == Integer.MIN_VALUE) {
            num2 = 0;
        }
        int i6 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordFlowStep, flowStep:");
        sbLIZ.append(str11);
        sbLIZ.append(", errorCode:");
        sbLIZ.append(i4);
        sbLIZ.append(", lastStep:");
        sbLIZ.append(str17);
        sbLIZ.append(", lastStepErrorCode:");
        sbLIZ.append(num2);
        C2188811AlT.LIZIZ(sbLIZ);
        c2197491AzT.LJIIL = str11;
        c2197491AzT.LJIILIIL = Integer.valueOf(i4);
        c2197491AzT.LJIIZILJ = c1232850iBf2;
        if (z) {
            c2197491AzT.LIZ.put(str11, Long.valueOf(System.currentTimeMillis()));
        }
        if (!Intrinsics.LJFF(str11, "minis_checkbalance_jsb_result_fail") && !Intrinsics.LJFF(str11, "minis_recharge_jsb_result_fail") && !Intrinsics.LJFF(str11, "minis_pay_jsb_result_fail") && (a0.LJJIIZI(str11, "fail", false) || a0.LJJIIZI(str11, "timeout", false))) {
            c2197491AzT.LIZIZ = str11;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        HashMap<String, String> map = c2197491AzT.LJIIJJI;
        if (map != null && (setKeySet = map.keySet()) != null) {
            for (String str18 : setKeySet) {
                HashMap<String, String> map2 = c2197491AzT.LJIIJJI;
                if (map2 != null && (str9 = map2.get(str18)) != null) {
                    c2344009Gk.LJFF(str18, str9);
                }
            }
        }
        c2344009Gk.LJFF("flow_name", c2197491AzT.LIZLLL);
        c2344009Gk.LJFF("step", str11);
        c2344009Gk.LJFF("flow_id", c2197491AzT.LIZJ);
        c2344009Gk.LJFF("ttoclid", c2197491AzT.LJI.LIZ);
        if (str12.length() != 0) {
            c2344009Gk.LJFF("extras", str12);
        }
        if (str10.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c2344009Gk.LJFF("error_msg", str10);
        }
        if (Intrinsics.LJFF(str11, "dismiss_recharge_sheet") || Intrinsics.LJFF(str11, "dismiss_normal_pay_sheet") || Intrinsics.LJFF(str11, "dismiss_recharge_and_pay_sheet")) {
            c2344009Gk.LJFF("dismiss_reason", str13);
        }
        if (Intrinsics.LJFF(str11, "minis_checkbalance_jsb_result_fail") || Intrinsics.LJFF(str11, "minis_recharge_jsb_result_fail") || Intrinsics.LJFF(str11, "minis_pay_jsb_result_fail") || Intrinsics.LJFF(str11, "minis_recharge_jsb_result_success") || Intrinsics.LJFF(str11, "minis_pay_jsb_result_success") || Intrinsics.LJFF(str11, "minis_checkbalance_jsb_result_success") || Intrinsics.LJFF(str11, "minis_subscription_jsb_result_success") || Intrinsics.LJFF(str11, "minis_subscription_jsb_result_fail")) {
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            c2344009Gk.LIZJ(iIntValue, "last_step_error_code");
            c2344009Gk.LJFF("error_msg", str10);
            if (C123100dR.LIZ(str13)) {
                c2344009Gk.LJFF("dismiss_reason", str13);
            }
            int i7 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("recordFlowStep, record jsb result, lastStep:");
            sbLIZ2.append(str17);
            sbLIZ2.append(", tempLastStepCode:");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(", errorMsg:");
            sbLIZ2.append(str10);
            C2188811AlT.LIZIZ(sbLIZ2);
            c2197491AzT.LJIIL = null;
            c2197491AzT.LJIILIIL = null;
        }
        if (i4 != Integer.MIN_VALUE) {
            if (c1232850iBf2 == null || (strValueOf = c1232850iBf2.LIZ()) == null) {
                strValueOf = String.valueOf(i4);
            }
            c2344009Gk.LJFF("error_code", strValueOf);
        }
        if (j3 >= 0) {
            c2344009Gk.LIZLLL(j3, "duration");
        }
        if (i5 >= 0) {
            c2344009Gk.LIZJ(i5, "query_order_count");
        }
        String str19 = c2197491AzT.LJIIIIZZ;
        if (str19 != null && str19.length() != 0) {
            c2344009Gk.LJFF("currency_type", c2197491AzT.LJIIIIZZ);
        }
        double d = c2197491AzT.LJII;
        if (d > 0.0d) {
            c2344009Gk.LIZ(d, "price");
        }
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        c2344009Gk.LJFF("inner_error_code", string);
        if (str7 != null) {
            str16 = str7;
        }
        c2344009Gk.LJFF("inner_error_msg", str16);
        if (str14.length() != 0) {
            c2344009Gk.LJFF("last_fail_reason", str14);
        }
        if (str15.length() != 0) {
            c2344009Gk.LJFF("error_src", str15);
        }
        if (j4 > 0) {
            c2344009Gk.LIZLLL(j4, "full_payment_duration");
        }
        String str20 = c2197491AzT.LJ;
        if (str20 != null && str20.length() != 0) {
            c2344009Gk.LJFF("subscription_trade_order_id", c2197491AzT.LJ);
        }
        String str21 = c2197491AzT.LJFF;
        if (str21 != null && str21.length() != 0) {
            c2344009Gk.LJFF("subscription_id", c2197491AzT.LJFF);
        }
        String str22 = c2197491AzT.LJIIIZ;
        if (str22 != null && str22.length() != 0) {
            c2344009Gk.LJFF("tier_id", c2197491AzT.LJIIIZ);
        }
        Integer num3 = c2197491AzT.LJIIJ;
        if (num3 != null) {
            c2344009Gk.LJ(num3, "deduct_cycle");
        }
        if (c2197491AzT.LJIJ) {
            str8 = "external";
        } else {
            str8 = "iap";
        }
        c2344009Gk.LJFF("pay_method", str8);
        c2344009Gk.LJFF("discount_source", c2197491AzT.LJIJI);
        if (c2197491AzT.LJIJJ.length() > 0) {
            c2344009Gk.LJFF("discount_rate", c2197491AzT.LJIJJ);
        }
        Map<String, String> map3 = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("minis_subscription_client_event", map3);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry : ((HashMap) map3).entrySet()) {
                String str23 = (String) entry.getKey();
                String str24 = (String) entry.getValue();
                if (!str23.equals("duration") && !str23.equals("full_payment_duration") && !str23.equals("stay_duration")) {
                    jSONObject.put(str23, str24);
                } else {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(str24);
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    int i8 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("reportApm, value:");
                    sbLIZ3.append(str24);
                    sbLIZ3.append(", valueLong:");
                    sbLIZ3.append(jLongValue);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    jSONObject2.put(str23, jLongValue);
                }
            }
            C08S3.LIZ.getClass();
            C08S3.LIZ("minis_subscription_client_event", jSONObject, jSONObject2, jSONObject3);
            int i9 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("reportApm, category:");
            sbLIZ4.append(jSONObject);
            sbLIZ4.append(", metrics:");
            sbLIZ4.append(jSONObject2);
            sbLIZ4.append(", extraLog:");
            sbLIZ4.append(jSONObject3);
            C2188811AlT.LIZIZ(sbLIZ4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
