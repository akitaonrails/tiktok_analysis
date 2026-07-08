package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC845760XFu extends Activity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs/LSR9KSYvJjHELIOSo9PGsDJyoHKTUAJig6JgQvPSYlITE1";
    public boolean LLILLJJLI;
    public String LLILZ;
    public String LLILZIL;
    public long LLIZ;
    public boolean LL = true;
    public String LLILLL = "";
    public String LLILZLL = "";

    @Override // android.app.Activity
    public final void onResume() throws Throwable {
        super.onResume();
        if (this.LL) {
            this.LL = false;
            return;
        }
        C0XFN c0xfn = C0XFN.USER_CANCEL;
        LIZJ(this, "account_auth_failure", null, null, c0xfn, null, Long.valueOf(System.currentTimeMillis() - this.LLIZ), 22);
        Intent intent = new Intent();
        Map<String, String> map = C0XFW.LIZJ;
        String str = this.LLILZ;
        if (str == null) {
            str = null;
        }
        intent.putExtra("auth_app_id", map.get(str));
        List listLIZLLL = C0XFW.LIZLLL();
        String str2 = this.LLILZ;
        if (str2 == null) {
            str2 = null;
        }
        if (listLIZLLL.contains(str2)) {
            String str3 = this.LLILZ;
            intent.putExtra("auth_app_version", C0XFW.LJFF(this, str3 != null ? str3 : null));
        }
        LIZ(this, c0xfn, 0, null, intent, 6);
    }

    public final void LIZIZ() throws Throwable {
        C0XFN c0xfn = C0XFN.NO_BROWSER_ERROR;
        LIZJ(this, "account_auth_failure", null, null, c0xfn, "Please properly configure your web browser", Long.valueOf(System.currentTimeMillis() - this.LLIZ), 6);
        LIZ(this, c0xfn, 0, "Please properly configure your web browser", null, 10);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.0XFu, android.app.Activity, android.content.Context, android.content.ContextWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0XFv] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0WST] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ActivityC845760XFu.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) throws Throwable {
        String str;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        super.onNewIntent(intent);
        Intent intent2 = new Intent();
        intent2.putExtra("is_web_login", this.LLILLJJLI);
        Map<String, String> map = C0XFW.LIZJ;
        String str2 = this.LLILZ;
        if (str2 == null) {
            str2 = null;
        }
        intent2.putExtra("auth_app_id", map.get(str2));
        if (this.LLILLJJLI) {
            Uri data = intent.getData();
            String str3 = "";
            if (data == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "id_token")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            if (data == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "state")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            if (data != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "user_id")) != null) {
                str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0 && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() > 0 && this.LLILZLL.length() > 0 && str3.length() > 0) {
                intent2.putExtra("id_token", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                intent2.putExtra("state", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                intent2.putExtra("ticket", this.LLILZLL);
                intent2.putExtra("user_id", str3);
                C2204961BRm.LLLLIILLL(this, -1, intent2, new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVAyWIUdI6xHarkrQO3L3CpoPZVMpC9KQzNYIcO", null));
                LIZJ(this, "account_auth_success", null, 0, null, null, Long.valueOf(System.currentTimeMillis() - this.LLIZ), 26);
                finish();
                return;
            }
            C0XFN c0xfn = C0XFN.INTERNAL_ERROR;
            LIZJ(this, "account_auth_failure", null, null, c0xfn, null, Long.valueOf(System.currentTimeMillis() - this.LLIZ), 22);
            LIZ(this, c0xfn, 0, null, intent2, 6);
            return;
        }
        String str4 = this.LLILZ;
        if (str4 == null) {
            str4 = null;
        }
        intent2.putExtra("auth_app_version", C0XFW.LJFF(this, str4));
        boolean booleanExtra = intent.getBooleanExtra("is_success", false);
        boolean booleanExtra2 = intent.getBooleanExtra("has_tt_login", false);
        intent2.putExtra("has_tt_login", booleanExtra2);
        if (booleanExtra) {
            if (intent.getBooleanExtra("is_login", true)) {
                str = "login";
            } else {
                str = "signup";
            }
            LIZJ(this, "account_auth_success", str, Integer.valueOf(booleanExtra2 ? 1 : 0), null, null, Long.valueOf(System.currentTimeMillis() - this.LLIZ), 24);
            C2204961BRm.LLLLIILLL(this, -1, intent2, new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVAyWIUdI6xHarkrQO3L3CpoPZVMpC9KQzNYIcO", null));
            finish();
            return;
        }
        Integer numValueOf = Integer.valueOf(booleanExtra2 ? 1 : 0);
        C0XFN c0xfn2 = C0XFN.USER_CANCEL;
        LIZJ(this, "account_auth_failure", null, numValueOf, c0xfn2, null, Long.valueOf(System.currentTimeMillis() - this.LLIZ), 18);
        LIZ(this, c0xfn2, 0, null, intent2, 6);
    }

    public static void LIZ(ActivityC845760XFu activityC845760XFu, C0XFN c0xfn, int i, String str, Intent intent, int i2) throws Throwable {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            intent = null;
        }
        activityC845760XFu.getClass();
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("error_type", c0xfn);
        if (i == -1) {
            i = c0xfn.getErrorCode();
        }
        intent.putExtra("error_code", i);
        intent.putExtra("error_msg", str);
        C2204961BRm.LLLLIILLL(activityC845760XFu, 0, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVAyWIUdI6xHarkrQO3L3CpoPZVMpC9KQzNYIcO", null));
        activityC845760XFu.finish();
    }

    public static void LIZJ(ActivityC845760XFu activityC845760XFu, String str, String str2, Integer num, C0XFN c0xfn, String str3, Long l, int i) {
        int i2;
        String string;
        Object obj;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            c0xfn = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        activityC845760XFu.getClass();
        JSONObject jSONObject = new JSONObject();
        if (str2 != null) {
            try {
                jSONObject.put("login_panel_type", str2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        Map<String, String> map = C0XFW.LIZJ;
        String str4 = activityC845760XFu.LLILZ;
        if (str4 == null) {
            str4 = null;
        }
        jSONObject.put("auth_app_id", map.get(str4));
        jSONObject.put("version_id", activityC845760XFu.LLILZIL);
        if (activityC845760XFu.LLILZIL == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        jSONObject.put("has_install_tt", i2);
        if (num != null) {
            jSONObject.put("has_tt_login", num.intValue());
        }
        if (c0xfn != null) {
            jSONObject.put("error_code", c0xfn.getErrorCode());
            jSONObject.put("error_msg", str3);
        }
        if (l != null) {
            jSONObject.put("duration", l.longValue());
        }
        Bundle bundleG3 = C786410Ut5.g3(activityC845760XFu.getIntent(), "extra_et_params");
        if (bundleG3 != null) {
            for (String str5 : bundleG3.keySet()) {
                try {
                    try {
                        obj = bundleG3.get(str5);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                } catch (OutOfMemoryError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                if (obj == null) {
                    string = null;
                } else {
                    string = obj.toString();
                }
                jSONObject.put(str5, string);
            }
        }
        C0XG9.LJ(str, jSONObject);
    }
}
