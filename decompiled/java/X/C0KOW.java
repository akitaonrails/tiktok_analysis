package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.pcs.PcsCoursePageSchemaSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KOW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KOW {
    public abstract void LIZJ(C0KOS c0kos);

    public abstract boolean LIZLLL(C0KOS c0kos);

    public static String LJI() {
        String strGa1 = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).ga1();
        if (strGa1.length() != 0) {
            return strGa1;
        }
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
        return "aweme://webview?url=https%3A%2F%2Ffeedback.tiktokv.com%2Ffeedback%2Foffline%2Fsubmit%3Ftrans_status_bar%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26container_color_auto_dark%3D1%26entrance%3Dsubscription_submit%26enter_from%3Dsubscription_submit%26_pia_%3D1%26version%3D1.0.0%26bdhm_bid%3Dcsp_im_inapp_hybrid";
    }

    public static void LJ(int i, int i2, String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_abnormal_subscribe_popup");
        c474500IjALIZ.LJJII(str, "fail_reason");
        c474500IjALIZ.LJJII(str, "failed_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "detail_error_code");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(int i, String str, int i2, String str2, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_abnormal_subscribe_popup_click");
        c474500IjALIZ.LJJII(str, "failed_reason");
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LJJII(str2, "type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "detail_error_code");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public final void LIZ(final C0KOS c0kos, String str, String str2, String str3, final Function0<Unit> function0) {
        String strLJI;
        Context topContext;
        if (c0kos.LIZ == null) {
            C766270U4b.LIZLLL(2131851936);
            return;
        }
        String str4 = "";
        if (Intrinsics.LJFF("", "course")) {
            strLJI = PcsCoursePageSchemaSetting.INSTANCE.getValue().getCourseFeedbackChatBotSchema();
            if (strLJI.length() <= 0) {
                strLJI = LJI();
            }
        } else {
            strLJI = LJI();
        }
        C495520Jby c495520Jby = new C495520Jby(strLJI);
        c495520Jby.LIZ(0, "trade_type");
        c495520Jby.LIZ(c0kos.LIZJ, "error_code");
        c495520Jby.LIZ(c0kos.LIZLLL, "detail_error_code");
        Uri uri = UriProtector.parse(c495520Jby.LIZLLL());
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        final Uri uriLJJJZ = C500260Jjc.LJJJZ(uri, "url", C500260Jjc.LJJJZ(UriProtector.parse(str4), "faq_id", "7359100774900636165").toString());
        try {
            if (C520010KaN.LJIIJJI(c0kos.LIZ)) {
                topContext = c0kos.LIZ;
            } else {
                topContext = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopContext();
            }
            C782110Um9 c782110Um9 = new C782110Um9(topContext);
            if (str.length() > 0) {
                c782110Um9.LIZJ = str;
            }
            if (str2.length() > 0) {
                c782110Um9.LJIIIZ(str2);
            }
            if (str3.length() > 0) {
                C753460Th2 c753460Th2 = new C753460Th2();
                c753460Th2.LIZLLL = R.attr.fy5;
                c753460Th2.LIZ = str3;
                c753460Th2.LJ = new InterfaceC753420Tgy() { // from class: X.0KOV
                    @Override // X.InterfaceC753420Tgy
                    public final void LIZ(DialogInterface dialogInterface) {
                        C0KOW c0kow = this.LIZ;
                        C0KOS c0kos2 = c0kos;
                        String str5 = c0kos2.LJ;
                        Map<String, String> map = c0kos2.LJI;
                        int i = c0kos2.LIZJ;
                        int i2 = c0kos2.LIZLLL;
                        c0kow.getClass();
                        C0KOW.LJFF(i, str5, i2, "google_page", map);
                        function0.invoke();
                    }
                };
                c782110Um9.LJIJJ = new C753450Th1(c753460Th2);
            }
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILIIL(2131851997, new InterfaceC743640TFa() { // from class: X.0KOU
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c0kos.LIZ, uriLJJJZ);
                    C0KOW c0kow = this;
                    C0KOS c0kos2 = c0kos;
                    String str5 = c0kos2.LJ;
                    Map<String, String> map = c0kos2.LJI;
                    int i = c0kos2.LIZJ;
                    int i2 = c0kos2.LIZLLL;
                    c0kow.getClass();
                    C0KOW.LJFF(i, str5, i2, "contact_us", map);
                }
            });
            c782110Um9.LJIIJ(2131851998, new InterfaceC743640TFa() { // from class: X.0KOX
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    C0KOW c0kow = this.LIZ;
                    C0KOS c0kos2 = c0kos;
                    String str5 = c0kos2.LJ;
                    Map<String, String> map = c0kos2.LJI;
                    int i = c0kos2.LIZJ;
                    int i2 = c0kos2.LIZLLL;
                    c0kow.getClass();
                    C0KOW.LJFF(i, str5, i2, "dismiss", map);
                    liveDialog.dismiss();
                }
            });
            C500260Jjc.LJJLIIIJLLLLLLLZ(c782110Um9.LIZ());
            LJ(c0kos.LIZJ, c0kos.LIZLLL, c0kos.LJ, c0kos.LJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("AbsPaymentExceptionHandler#displayAlert", e);
            C766270U4b.LIZLLL(2131851936);
        }
    }
}
