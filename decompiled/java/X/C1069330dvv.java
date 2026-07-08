package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069330dvv {
    public static final void LIZ(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        try {
            ((InputMethodManager) C786410Ut5.H2(context, "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        view.clearFocus();
    }

    public static final void LIZJ(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        try {
            view.requestFocus();
            ((InputMethodManager) C786410Ut5.H2(context, "input_method")).showSoftInput(view, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
