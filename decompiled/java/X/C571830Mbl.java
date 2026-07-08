package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Mbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571830Mbl {
    public static void LIZ(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Activity activityLIZ = C1388190mED.LIZ(((ContextWrapper) dialog.getContext()).getBaseContext());
            if (activityLIZ != null) {
                if (!activityLIZ.isFinishing() && !activityLIZ.isDestroyed()) {
                    try {
                        dialog.dismiss();
                        C785410UrT.LIZ(dialog);
                        return;
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return;
                    }
                }
                return;
            }
            try {
                dialog.dismiss();
                C785410UrT.LIZ(dialog);
            } catch (IllegalArgumentException e3) {
                TryCatchGuardChecker.doCheck(e3);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    public static void LIZIZ(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        Context context = dialog.getContext();
        if (((context instanceof Activity) && C1388190mED.LIZ(context).isFinishing()) || dialog.isShowing()) {
            return;
        }
        try {
            C786410Ut5.B4(dialog);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
