package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.pcs.PcsCoursePageSchemaSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KQI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KQI {
    public abstract void LIZJ(C0KQK c0kqk);

    public abstract boolean LIZLLL(C0KQK c0kqk);

    public static void LJ(C0KQK c0kqk, String str) {
        String str2 = c0kqk.LJ;
        Map<String, String> map = c0kqk.LJI;
        int i = c0kqk.LIZJ;
        int i2 = c0kqk.LIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_abnormal_subscribe_popup_click");
        c474500IjALIZ.LJJII(str2, "failed_reason");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJJII(str, "type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "detail_error_code");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJI(C501470JlZ c501470JlZ, int i) {
        C500260Jjc.LJJLIIIJJIZ(new C0KQP(c501470JlZ, i));
    }

    public static void LJFF(int i, int i2, String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_abnormal_subscribe_popup");
        c474500IjALIZ.LJJII(str, "fail_reason");
        c474500IjALIZ.LJJII(str, "failed_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "detail_error_code");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public final void LIZ(final C0KQK c0kqk, String str, String str2, String str3, final Function0<Unit> function0) {
        String courseFeedbackChatBotSchema;
        Context topContext;
        if (c0kqk.LIZ == null) {
            C766270U4b.LIZLLL(2131851936);
            return;
        }
        String str4 = "";
        if (!Intrinsics.LJFF(c0kqk.LJII, "course")) {
            courseFeedbackChatBotSchema = "";
        } else {
            courseFeedbackChatBotSchema = PcsCoursePageSchemaSetting.INSTANCE.getValue().getCourseFeedbackChatBotSchema();
        }
        C495520Jby c495520Jby = new C495520Jby(courseFeedbackChatBotSchema);
        c495520Jby.LIZ(0, "trade_type");
        c495520Jby.LIZ(c0kqk.LIZJ, "error_code");
        c495520Jby.LIZ(c0kqk.LIZLLL, "detail_error_code");
        Uri uri = UriProtector.parse(c495520Jby.LIZLLL());
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        final Uri uriLJJJZ = C500260Jjc.LJJJZ(uri, "url", C500260Jjc.LJJJZ(UriProtector.parse(str4), "faq_id", "7359100774900636165").toString());
        try {
            if (C520010KaN.LJIIJJI(c0kqk.LIZ)) {
                topContext = c0kqk.LIZ;
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
                c753460Th2.LJ = new InterfaceC753420Tgy() { // from class: X.0KQO
                    @Override // X.InterfaceC753420Tgy
                    public final void LIZ(DialogInterface dialogInterface) {
                        C0KQI c0kqi = this.LIZ;
                        C0KQK c0kqk2 = c0kqk;
                        c0kqi.getClass();
                        C0KQI.LJ(c0kqk2, "google_page");
                        function0.invoke();
                    }
                };
                c782110Um9.LJIJJ = new C753450Th1(c753460Th2);
            }
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILIIL(2131851997, new InterfaceC743640TFa() { // from class: X.0KQJ
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c0kqk.LIZ, uriLJJJZ);
                    C0KQI c0kqi = this;
                    C0KQK c0kqk2 = c0kqk;
                    c0kqi.getClass();
                    C0KQI.LJ(c0kqk2, "contact_us");
                }
            });
            c782110Um9.LJIIJ(2131851998, new InterfaceC743640TFa() { // from class: X.0KQQ
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    C0KQI c0kqi = this.LIZ;
                    C0KQK c0kqk2 = c0kqk;
                    c0kqi.getClass();
                    C0KQI.LJ(c0kqk2, "dismiss");
                    liveDialog.dismiss();
                }
            });
            C500260Jjc.LJJLIIIJLLLLLLLZ(c782110Um9.LIZ());
            LJFF(c0kqk.LIZJ, c0kqk.LIZLLL, c0kqk.LJ, c0kqk.LJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("AbsPaymentExceptionHandler#displayAlert", e);
            C766270U4b.LIZLLL(2131851936);
        }
    }
}
