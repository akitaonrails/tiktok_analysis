package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.0ukF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715570ukF {
    public static final void LIZ(C19EG c19eg) {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.G2(c19eg.getApplication(), "input_method");
        View currentFocus = c19eg.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            currentFocus.clearFocus();
        }
    }
}
