package X;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Jlf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501530Jlf {
    public static void LIZ(Context context, Throwable th, String str) {
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            if (c501470JlZ.getErrorCode() != 20006) {
                String prompt = c501470JlZ.getPrompt();
                String alert = c501470JlZ.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    String string = context.getResources().getString(2131851921);
                    C19GO c19go = new C19GO(context);
                    c19go.LIZLLL = context.getResources().getString(2131851937);
                    c19go.LJII = alert;
                    c19go.LJFF(null, string, false);
                    c19go.LJIIZILJ = new DialogInterfaceOnDismissListenerC521770KdD(5);
                    C786410Ut5.M4(c19go.LIZ());
                    return;
                }
                if (!TextUtils.isEmpty(prompt)) {
                    C766270U4b.LJIIIZ(context, prompt);
                    return;
                } else {
                    C766270U4b.LJIIIZ(context, str);
                    return;
                }
            }
        }
        C766270U4b.LJIIIZ(context, str);
    }
}
