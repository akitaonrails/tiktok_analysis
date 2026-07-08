package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.0vQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741940vQm {
    public static void LIZ(Activity activity) {
        InputMethodManager inputMethodManager;
        if (activity != null && activity.getCurrentFocus() != null && (inputMethodManager = (InputMethodManager) C786410Ut5.F2(activity, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public static void LIZJ(Activity activity) {
        Window window = activity.getWindow();
        if (window.getStatusBarColor() == 0) {
            return;
        }
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public static void LIZIZ(C19518211Xw c19518211Xw, CharSequence charSequence) {
        if (c19518211Xw == null) {
            return;
        }
        if (TextUtils.isEmpty(c19518211Xw.getText())) {
            if (!TextUtils.isEmpty(charSequence)) {
                c19518211Xw.setText(charSequence);
            }
        } else {
            if (c19518211Xw.getText().equals(charSequence)) {
                return;
            }
            c19518211Xw.setText(charSequence);
        }
    }

    public static void LIZLLL(int i, C1322110kVd c1322110kVd) {
        if (c1322110kVd == null || c1322110kVd.getVisibility() == i) {
            return;
        }
        if (i == 0 && c1322110kVd.getAlpha() < Float.MIN_VALUE) {
            C786410Ut5.T4(c1322110kVd, 1.0f);
        }
        C786410Ut5.LJLLLLLL(i, c1322110kVd);
    }
}
