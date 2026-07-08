package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.0v1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726140v1I {
    public static boolean LIZ(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) C786410Ut5.H2(view.getContext(), "input_method")) == null) {
            return false;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        return true;
    }
}
