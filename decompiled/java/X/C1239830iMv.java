package X;

import android.view.View;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.EmailCodeVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.SendEmailCodeEvent;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1239830iMv {
    public final ViewStub LL;
    public final InterfaceC1239890iN1 LLILLJJLI;
    public C854410XfT LLILLL;
    public final WeakReference<C19GS> LLILZ;
    public JSONObject LLILZIL;
    public String LLILZLL;
    public String LLIZ = "";

    public View LIZJ() {
        throw null;
    }

    public final C19GS LIZ() {
        return this.LLILZ.get();
    }

    public final boolean LJII() {
        if (this.LLILLL == null || this.LLILZLL == null) {
            return false;
        }
        return C13LP.LJJJJ(this.LLILZLL, C13LQ.LJLIIL(new String[]{"/passport/auth/only_login/", "/passport/auth/login_only/", "/passport/user/login/", "/passport/mobile/sms_login_only/"}));
    }

    public final void LJFF() {
        if (LJII()) {
            C854410XfT c854410XfT = this.LLILLL;
            if (c854410XfT == null) {
                c854410XfT = null;
            }
            c854410XfT.LIZIZ();
        }
    }

    public final void LJ(boolean z) {
        if (LJII()) {
            C854410XfT c854410XfT = this.LLILLL;
            if (c854410XfT == null) {
                c854410XfT = null;
            }
            c854410XfT.LIZ(z);
        }
    }

    public final String LIZIZ(Integer num, String str) {
        String string;
        C19GS c19gs = this.LLILZ.get();
        if (c19gs == null || (string = c19gs.getString(2131834217)) == null) {
            string = "Sorry, error occurred";
        }
        if (str != null && num != null) {
            num.intValue();
            if (num.intValue() == 1066) {
                return string;
            }
            return str;
        }
        return string;
    }

    public C1239830iMv(C19GS c19gs, ViewStub viewStub, InterfaceC1239890iN1 interfaceC1239890iN1) {
        this.LL = viewStub;
        this.LLILLJJLI = interfaceC1239890iN1;
        this.LLILZ = new WeakReference<>(c19gs);
    }

    public static void LIZLLL(int i, String str, boolean z) {
        int i2;
        EmailCodeVerificationResultEvent emailCodeVerificationResultEvent = new EmailCodeVerificationResultEvent();
        emailCodeVerificationResultEvent.LJI("signup_panel", "enter_from");
        emailCodeVerificationResultEvent.LJI("idv_auto_trigger", "enter_method");
        emailCodeVerificationResultEvent.LJI("signup_idv", "page");
        emailCodeVerificationResultEvent.LJI("code_and_link", "send_type");
        emailCodeVerificationResultEvent.LJI(String.valueOf(i), "error_code");
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        emailCodeVerificationResultEvent.LJI(Integer.valueOf(i2), "is_success");
        if (str == null) {
            str = "code";
        }
        emailCodeVerificationResultEvent.LJI(str, "verify_method");
        emailCodeVerificationResultEvent.LJIIIIZZ();
    }

    public static void LJI(int i, String str, boolean z) {
        String str2;
        SendEmailCodeEvent sendEmailCodeEvent = new SendEmailCodeEvent();
        sendEmailCodeEvent.LJI("signup_panel", "enter_from");
        sendEmailCodeEvent.LJI("idv_auto_trigger", "enter_method");
        sendEmailCodeEvent.LJI(str, "send_method");
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        sendEmailCodeEvent.LJI(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        sendEmailCodeEvent.LJI("signup_idv", "page");
        sendEmailCodeEvent.LJI(String.valueOf(i), "error_code");
        sendEmailCodeEvent.LJI("code_and_link", "send_type");
        sendEmailCodeEvent.LJIIIIZZ();
    }
}
