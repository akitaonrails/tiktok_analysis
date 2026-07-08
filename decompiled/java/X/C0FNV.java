package X;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0FNV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNV {
    public static final void LIZ(Dialog dialog) {
        if (dialog.isShowing()) {
            Activity activityLIZ = C1388190mED.LIZ(dialog.getContext());
            if (activityLIZ != null) {
                boolean zIsDestroyed = activityLIZ.isDestroyed();
                if (!activityLIZ.isFinishing() && !zIsDestroyed) {
                    try {
                        dialog.dismiss();
                        C785410UrT.LIZ(dialog);
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                return;
            }
            try {
                dialog.dismiss();
                C785410UrT.LIZ(dialog);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static final void LIZIZ(DialogC19728412Gs dialogC19728412Gs) {
        if (dialogC19728412Gs.isShowing()) {
            Activity activityLIZ = C1388190mED.LIZ(dialogC19728412Gs.getContext());
            if (activityLIZ != null) {
                boolean zIsDestroyed = activityLIZ.isDestroyed();
                if (!activityLIZ.isFinishing() && !zIsDestroyed) {
                    try {
                        dialogC19728412Gs.hide();
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                return;
            }
            try {
                dialogC19728412Gs.hide();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static final void LIZJ(Dialog dialog) {
        Activity activityLIZ = C1388190mED.LIZ(dialog.getContext());
        if ((activityLIZ != null && activityLIZ.isFinishing()) || dialog.isShowing()) {
            return;
        }
        try {
            C786410Ut5.B4(dialog);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
