package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0Jlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501540Jlg {
    public static void LIZJ(Context context, Throwable th) {
        if (th != null && context != null) {
            if (th instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                String alert = c501470JlZ.getAlert();
                String prompt = c501470JlZ.getPrompt();
                if (!TextUtils.isEmpty(alert)) {
                    LIZ(context, alert, context.getResources().getString(2131851921));
                    return;
                } else {
                    if (TextUtils.isEmpty(prompt)) {
                        return;
                    }
                    C766270U4b.LJIIIZ(context, prompt);
                    return;
                }
            }
            C766270U4b.LJFF(2131851936, context);
        }
    }

    public static void LJ(Context context, Throwable th) {
        if (th != null && context != null) {
            if (th instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                String alert = c501470JlZ.getAlert();
                String prompt = c501470JlZ.getPrompt();
                if (!TextUtils.isEmpty(alert)) {
                    LIZ(context, alert, context.getResources().getString(2131851921));
                    return;
                } else {
                    if (TextUtils.isEmpty(prompt)) {
                        return;
                    }
                    C766270U4b.LJIIIZ(context, prompt);
                    return;
                }
            }
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                C766270U4b.LJFF(2131851936, context);
            }
            if (!InterfaceC960800b6s.LLJL.LIZIZ().booleanValue() || !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            } else {
                throw th;
            }
        }
    }

    public static void LIZ(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        C19GO c19go = new C19GO(context);
        c19go.LIZLLL = context.getResources().getString(2131851937);
        c19go.LJII = str;
        c19go.LJFF(null, str2, false);
        C786410Ut5.M4(c19go.LIZ());
    }

    public static void LIZIZ(Context context, String str, Throwable th) {
        if (th == null && context == null) {
            return;
        }
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            String prompt = c501470JlZ.getPrompt();
            String alert = c501470JlZ.getAlert();
            if (!TextUtils.isEmpty(alert)) {
                LIZ(context, alert, context.getResources().getString(2131851921));
                return;
            } else if (!TextUtils.isEmpty(prompt)) {
                C766270U4b.LJIIIZ(context, prompt);
                return;
            } else {
                C766270U4b.LJIIIZ(context, str);
                return;
            }
        }
        C766270U4b.LJIIIZ(context, str);
    }

    public static void LIZLLL(Context context, Throwable th, int i) {
        if (th != null && context != null) {
            if (th instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                String prompt = c501470JlZ.getPrompt();
                String alert = c501470JlZ.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    LIZ(context, alert, context.getResources().getString(2131851921));
                    return;
                } else if (!TextUtils.isEmpty(prompt)) {
                    C766270U4b.LJIIIZ(context, prompt);
                    return;
                } else {
                    C766270U4b.LJFF(i, context);
                    return;
                }
            }
            C766270U4b.LJFF(i, context);
        }
    }
}
