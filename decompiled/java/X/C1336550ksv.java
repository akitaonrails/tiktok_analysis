package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ksv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336550ksv {
    public static void LIZ(Context context) {
        if (context == null) {
            return;
        }
        try {
            ((InputMethodManager) C786410Ut5.H2(context, "input_method")).hideSoftInputFromWindow(((Activity) context).getWindow().getDecorView().getWindowToken(), 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C1706630uVp.LJII("KeyBoardUtils", message);
        }
    }

    public static void LIZIZ(Context context, View view) {
        if (context == null) {
            return;
        }
        try {
            ((InputMethodManager) C786410Ut5.H2(context, "input_method")).showSoftInput(view, 1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C1706630uVp.LJII("KeyBoardUtils", message);
        }
    }
}
