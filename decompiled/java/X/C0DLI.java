package X;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.0DLI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DLI {
    public static void LIZIZ(View view) {
        if (view != null) {
            view.getLayoutParams().height = C497820Jfg.LIZJ(view.getContext());
        }
    }

    public static void LIZ(Activity activity, View view) {
        if (activity == null) {
            return;
        }
        ((InputMethodManager) C786410Ut5.F2(activity, "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
