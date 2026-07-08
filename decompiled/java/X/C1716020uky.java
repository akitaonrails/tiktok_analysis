package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716020uky {
    public static String LIZ;

    public static boolean LIZ() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emitBiometryRegistrationFlowEnded result: ");
        sbLIZ.append(z);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BiometricUtils", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", z);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "pipo.BiometryRegistrationFlowEnded"));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("from", "bio_enroll");
        jSONObject2.put("result", z);
        jSONObject2.put("action_type", "biometric");
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis2, new C1323820kYO(jSONObject2), "ec_checkout_guide_exit"));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("stage", "pay");
        jSONObject3.put("pay_scene", "send_ec_checkout_guide_exit");
        jSONObject3.put("page_name", LIZ);
        jSONObject3.put("pay_result", String.valueOf(z));
        jSONObject3.put("action_type", "biometric");
        C1713870uhV.LIZIZ("rd_pipo_payment_process", jSONObject3);
    }

    public static void LIZJ(C19EG c19eg) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Intent intent = new Intent("android.settings.BIOMETRIC_ENROLL");
            intent.putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 15);
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, c19eg);
                C2204961BRm.LJIILLIIL(c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/B0jdsW6Xmm4L/HzzxrcIoyV/EyGodjYw3XRXbHdwpc+TtCejCJoSp", null));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (i >= 28) {
            Intent intent2 = new Intent("android.settings.FINGERPRINT_ENROLL");
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent2, "Context_startActivity_1");
                C1701330uNH.LIZ(intent2, c19eg);
                C2204961BRm.LJIILLIIL(c19eg, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/B0jdsW6Xmm4L/HzzxrcIoyV/EyGodjYw3XRXbHdwpc+TtCejCJoSp", null));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static C1716060ul2 LIZLLL(Uri uri) {
        if (uri.isHierarchical()) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "merchant_id");
            String str = "";
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "merchant_uid");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pipo_product_code");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "previous_page_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
            }
            LIZ = str;
            return new C1716060ul2(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, "normal", str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, str);
        }
        return new C1716060ul2("", "", "", "", "", "", "");
    }
}
