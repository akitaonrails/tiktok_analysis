package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0FNU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNU {
    public static void LIZ(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                Activity activity = (Activity) baseContext;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
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
}
