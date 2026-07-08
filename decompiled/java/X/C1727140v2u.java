package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.0v2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727140v2u {
    public static final void LIZ(View view) {
        InputMethodManager inputMethodManager;
        Object objH2 = C786410Ut5.H2(view.getContext(), "input_method");
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        view.clearFocus();
    }
}
