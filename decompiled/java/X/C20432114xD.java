package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IPasskeyPopUpHelper;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.LoginFailureEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.LoginNotifyEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.LoginSubmitEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.RespondCreatePasskeyPromptEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowCreatePasskeyFailToastEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowCreatePasskeyPromptEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.TryShowPasskeyLoginEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.TryShowPasskeySetupEvent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20432114xD {
    public static void LJFF(Context context) {
        String strLIZ = C0WI6.LIZ(context.getPackageManager(), context.getPackageName());
        String packageName = context.getPackageName();
        boolean zContains = C1868940yjc.LIZ.contains(strLIZ);
        String strLIZLLL = C0XQ5.LIZLLL();
        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("package_name", packageName);
        c2344009Gk.LJ(Boolean.valueOf(zContains), "is_signature_match");
        c2344009Gk.LJIIIIZZ("uid", strLIZLLL);
        c2344009Gk.LJIIIIZZ("region", storeRegionUpperCase);
        C20684815ws.LJIILLIIL("passkey_signature_check", c2344009Gk.LIZ);
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZLLL(Activity activity, String str) {
        String strLIZ = LIZ(activity.getIntent(), "enter_from");
        if (strLIZ == null) {
            strLIZ = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strLIZ);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        C20684815ws.LJIILLIIL("passkey_prompt_show", c2344009Gk.LIZ);
    }

    public static void LJ(Intent intent, String str) {
        String strLIZ = LIZ(intent, "enter_from");
        if (strLIZ == null) {
            strLIZ = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strLIZ);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        C20684815ws.LJIILLIIL("passkey_prompt_submit", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", strLIZ);
        c2344009Gk2.LJIIIIZZ("enter_method", str);
        C20684815ws.LJIILLIIL("passkey_prompt_success", c2344009Gk2.LIZ);
    }

    public static void LJIIIIZZ(Intent intent, String str) throws JSONException {
        if (Intrinsics.LJFF(str, "google")) {
            return;
        }
        LoginNotifyEvent loginNotifyEvent = new LoginNotifyEvent();
        String strLIZ = LIZ(intent, "enter_from");
        String str2 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        loginNotifyEvent.LJI(strLIZ, "enter_from");
        String strLIZ2 = LIZ(intent, "enter_method");
        if (strLIZ2 == null) {
            strLIZ2 = "";
        }
        loginNotifyEvent.LJI(strLIZ2, "enter_method");
        String strLIZ3 = LIZ(intent, "enter_type");
        if (strLIZ3 == null) {
            strLIZ3 = "";
        }
        loginNotifyEvent.LJI(strLIZ3, "enter_type");
        loginNotifyEvent.LJI(str, "platform");
        String strLIZ4 = LIZ(intent, "login_panel_type");
        if (strLIZ4 != null) {
            str2 = strLIZ4;
        }
        loginNotifyEvent.LJI(str2, "login_panel_type");
        loginNotifyEvent.LJIIIIZZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", str);
        C793770VBv.LJII("login_notify", jSONObject, null, null);
    }

    public static void LJIIIZ(Intent intent, String str) throws JSONException {
        if (Intrinsics.LJFF(str, "google")) {
            return;
        }
        LoginSubmitEvent loginSubmitEvent = new LoginSubmitEvent();
        String strLIZ = LIZ(intent, "enter_from");
        String str2 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        loginSubmitEvent.LJI(strLIZ, "enter_from");
        String strLIZ2 = LIZ(intent, "enter_method");
        if (strLIZ2 == null) {
            strLIZ2 = "";
        }
        loginSubmitEvent.LJI(strLIZ2, "enter_method");
        String strLIZ3 = LIZ(intent, "enter_type");
        if (strLIZ3 == null) {
            strLIZ3 = "";
        }
        loginSubmitEvent.LJI(strLIZ3, "enter_type");
        loginSubmitEvent.LJI(str, "platform");
        String strLIZ4 = LIZ(intent, "login_panel_type");
        if (strLIZ4 != null) {
            str2 = strLIZ4;
        }
        loginSubmitEvent.LJI(str2, "login_panel_type");
        loginSubmitEvent.LJIIIIZZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", str);
        C793770VBv.LJII("login_submit", jSONObject, null, null);
    }

    public static void LJIILIIL(int i, boolean z) {
        int i2;
        boolean zLIZ = C20642615q4.LIZ();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        TryShowPasskeyLoginEvent tryShowPasskeyLoginEvent = new TryShowPasskeyLoginEvent();
        tryShowPasskeyLoginEvent.LJI("login_page", "enter_method");
        tryShowPasskeyLoginEvent.LJI(Integer.valueOf(i), "error_code");
        tryShowPasskeyLoginEvent.LJI(Integer.valueOf(zLIZ ? 1 : 0), "has_screen_lock");
        tryShowPasskeyLoginEvent.LJI(Integer.valueOf(i2), "has_google_account");
        tryShowPasskeyLoginEvent.LJIIIIZZ();
    }

    public static void LIZJ(Intent intent, String str, String str2) {
        String strLIZ = LIZ(intent, "enter_from");
        if (strLIZ == null) {
            strLIZ = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strLIZ);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        C20684815ws.LJIILLIIL("passkey_prompt_submit", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", strLIZ);
        c2344009Gk2.LJIIIIZZ("enter_method", str);
        c2344009Gk2.LJIIIIZZ("error_code", str2);
        C20684815ws.LJIILLIIL("passkey_prompt_failure", c2344009Gk2.LIZ);
    }

    public static void LJIIL(Activity activity, boolean z, Boolean bool) {
        String str;
        String strLIZ = LIZ(activity.getIntent(), "enter_from");
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "first_passkey";
        } else {
            str = "replace_passkey";
        }
        ShowCreatePasskeyPromptEvent showCreatePasskeyPromptEvent = new ShowCreatePasskeyPromptEvent();
        showCreatePasskeyPromptEvent.LJI(strLIZ, "enter_from");
        showCreatePasskeyPromptEvent.LJI(str, "enter_method");
        if (z) {
            showCreatePasskeyPromptEvent.LJI(Integer.valueOf(((IPasskeyPopUpHelper) ServiceManager.get().getService(IPasskeyPopUpHelper.class)).LJ()), "show_num");
        }
        showCreatePasskeyPromptEvent.LJIIIIZZ();
    }

    public static void LIZIZ(long j, String str, Throwable th, boolean z) {
        String simpleName;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJ(Boolean.valueOf(z), "is_success");
        c2344009Gk.LJIIIIZZ("platform", str);
        if (th != null) {
            simpleName = th.getClass().getSimpleName();
        } else {
            simpleName = "";
        }
        c2344009Gk.LJIIIIZZ("error_type", simpleName);
        C20684815ws.LJIILLIIL("passkey_get_credential_response", c2344009Gk.LIZ);
    }

    public static void LJII(Intent intent, String str, String str2, String str3) throws JSONException {
        LoginFailureEvent loginFailureEvent = new LoginFailureEvent();
        String strLIZ = LIZ(intent, "enter_from");
        String str4 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        loginFailureEvent.LJI(strLIZ, "enter_from");
        String strLIZ2 = LIZ(intent, "enter_method");
        if (strLIZ2 == null) {
            strLIZ2 = "";
        }
        loginFailureEvent.LJI(strLIZ2, "enter_method");
        String strLIZ3 = LIZ(intent, "enter_type");
        if (strLIZ3 == null) {
            strLIZ3 = "";
        }
        loginFailureEvent.LJI(strLIZ3, "enter_type");
        loginFailureEvent.LJI(str, "platform");
        String strLIZ4 = LIZ(intent, "login_panel_type");
        if (strLIZ4 != null) {
            str4 = strLIZ4;
        }
        loginFailureEvent.LJI(str4, "login_panel_type");
        loginFailureEvent.LJI(str2, "error_code");
        loginFailureEvent.LJI(str3, "error_desc");
        loginFailureEvent.LJIIIIZZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", str);
        jSONObject.put("error_code", str2);
        C793770VBv.LJII("login_failure", jSONObject, null, null);
    }

    public static void LJIIJ(Activity activity, boolean z, boolean z2, int i) {
        String str;
        RespondCreatePasskeyPromptEvent respondCreatePasskeyPromptEvent = new RespondCreatePasskeyPromptEvent();
        String strLIZ = LIZ(activity.getIntent(), "enter_from");
        if (strLIZ == null) {
            strLIZ = "";
        }
        respondCreatePasskeyPromptEvent.LJI(strLIZ, "enter_from");
        if (z2) {
            str = "first_passkey";
        } else {
            str = "replace_passkey";
        }
        respondCreatePasskeyPromptEvent.LJI(str, "enter_method");
        respondCreatePasskeyPromptEvent.LJI(Integer.valueOf(i), "result");
        if (z) {
            respondCreatePasskeyPromptEvent.LJI(Integer.valueOf(((IPasskeyPopUpHelper) ServiceManager.get().getService(IPasskeyPopUpHelper.class)).LJ()), "show_num");
        }
        respondCreatePasskeyPromptEvent.LJIIIIZZ();
    }

    public static void LJIIJJI(Activity activity, boolean z, Boolean bool, int i) {
        String str;
        String strLIZ = LIZ(activity.getIntent(), "enter_from");
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "first_passkey";
        } else {
            str = "replace_passkey";
        }
        boolean zLIZ = C20642615q4.LIZ();
        ShowCreatePasskeyFailToastEvent showCreatePasskeyFailToastEvent = new ShowCreatePasskeyFailToastEvent();
        showCreatePasskeyFailToastEvent.LJI(strLIZ, "enter_from");
        showCreatePasskeyFailToastEvent.LJI(str, "enter_method");
        showCreatePasskeyFailToastEvent.LJI(Integer.valueOf(i), "error_code");
        showCreatePasskeyFailToastEvent.LJI(Integer.valueOf(zLIZ ? 1 : 0), "has_screen_lock");
        showCreatePasskeyFailToastEvent.LJI(Integer.valueOf(z ? 1 : 0), "has_google_account");
        showCreatePasskeyFailToastEvent.LJIIIIZZ();
    }

    public static void LJIILJJIL(Activity activity, boolean z, Boolean bool, int i) {
        int i2;
        String strLIZ = LIZ(activity.getIntent(), "enter_from");
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            i2 = 0;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        boolean zLIZ = C20642615q4.LIZ();
        TryShowPasskeySetupEvent tryShowPasskeySetupEvent = new TryShowPasskeySetupEvent();
        tryShowPasskeySetupEvent.LJI(strLIZ, "enter_from");
        tryShowPasskeySetupEvent.LJI(Integer.valueOf(i2), "result");
        tryShowPasskeySetupEvent.LJI(Integer.valueOf(i), "error_code");
        tryShowPasskeySetupEvent.LJI(Integer.valueOf(zLIZ ? 1 : 0), "has_screen_lock");
        tryShowPasskeySetupEvent.LJI(Integer.valueOf(z ? 1 : 0), "has_google_account");
        tryShowPasskeySetupEvent.LJIIIIZZ();
    }

    public static void LJI(int i, String str, String str2, String str3, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(z), "is_valid");
        c2344009Gk.LIZJ(i, "error_code");
        c2344009Gk.LJIIIIZZ("error_desc", str);
        c2344009Gk.LJIIIIZZ("currentNonce", str2);
        c2344009Gk.LJIIIIZZ("nonce", str3);
        C20684815ws.LJIILLIIL("got_validate_nonce", c2344009Gk.LIZ);
    }
}
