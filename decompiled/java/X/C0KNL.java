package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS216S0300000_7;

/* JADX INFO: renamed from: X.0KNL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KNL {
    public abstract void LIZLLL(C0KNO c0kno);

    public abstract boolean LJ(C0KNO c0kno);

    public static Uri LIZJ(String str, C0KNO c0kno) {
        C495520Jby c495520Jby = new C495520Jby(str);
        c495520Jby.LIZ(0, "trade_type");
        c495520Jby.LIZ(c0kno.LIZJ, "error_code");
        Uri uri = UriProtector.parse(c495520Jby.LIZLLL());
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        return C0K51.LJIIIIZZ(uri, "url", C0K51.LJIIIIZZ(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), "faq_id", "7359100774900636165").toString());
    }

    public static void LJFF(int i, String str, String str2, Map map) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_abnormal_subscribe_popup");
        c511970K5z.LIZIZ("1", "is_from_pgc_subscription");
        c511970K5z.LIZIZ(str2, "show_entrance");
        c511970K5z.LIZIZ(str, "fail_reason");
        c511970K5z.LIZIZ(str, "failed_reason");
        c511970K5z.LIZIZ(Integer.valueOf(i), "error_code");
        c511970K5z.LIZJ(map);
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZLLL();
    }

    public static void LJI(int i, String str, String str2, String str3, Map map) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_abnormal_subscribe_popup_click");
        c511970K5z.LIZIZ("1", "is_from_pgc_subscription");
        c511970K5z.LIZIZ(str, "failed_reason");
        c511970K5z.LIZIZ(str2, "click_type");
        c511970K5z.LIZIZ(str2, "type");
        c511970K5z.LIZIZ(Integer.valueOf(i), "error_code");
        c511970K5z.LIZIZ(str3, "show_entrance");
        c511970K5z.LIZJ(map);
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZLLL();
    }

    public void LIZ(C0KNO c0kno, String str, String str2, String str3, Function0<Unit> function0) {
        Context topContext;
        if (c0kno.LIZ == null) {
            C0JCX.LIZ(2131839337);
            return;
        }
        String strLJIIJJI = C0K7G.LJIIJJI();
        if (strLJIIJJI.length() == 0) {
            strLJIIJJI = "aweme://webview?url=https%3A%2F%2Ffeedback.tiktokv.com%2Ffeedback%2Foffline%2Fsubmit%3Ftrans_status_bar%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26container_color_auto_dark%3D1%26entrance%3Dsubscription_submit%26enter_from%3Dsubscription_submit%26_pia_%3D1%26version%3D1.0.0%26bdhm_bid%3Dcsp_im_inapp_hybrid";
        }
        Uri uriLIZJ = LIZJ(strLJIIJJI, c0kno);
        try {
            if (C0K51.LJII(c0kno.LIZ)) {
                topContext = c0kno.LIZ;
            } else {
                topContext = C1931507hR.LIZ().getTopContext();
            }
            if (topContext == null) {
                C0JCX.LIZ(2131839337);
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(C0HE8.LIZ(topContext));
            if (str.length() > 0) {
                c1397580mTM.LJI(str);
            }
            if (str2.length() > 0) {
                c1397580mTM.LIZIZ(str2);
            }
            if (str3.length() > 0) {
                C1397720mTa.LIZ(c1397580mTM, str3, new AwS216S0300000_7(this, (C0KNL) c0kno, (C0KNO) function0, (Function0<Unit>) 16));
            }
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS216S0300000_7(c0kno, uriLIZJ, this, 17));
            new C1397510mTF(c1397580mTM).LIZLLL();
            LJFF(c0kno.LIZJ, c0kno.LJ, c0kno.LJIIIIZZ, c0kno.LJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0K6D.LIZJ(e, "AbsPaymentExceptionHandler#displayAlert", C2097608Jq.LJ());
            C0JCX.LIZ(2131839337);
        }
    }
}
