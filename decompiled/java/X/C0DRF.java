package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.0DRF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DRF {
    public static final void LIZ(View view) {
        InputMethodManager inputMethodManager;
        Context context = view.getContext();
        Object objH2 = null;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "input_method");
        }
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
