package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: renamed from: X.0DSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339360DSc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        ((InputMethodManager) C786410Ut5.H2(view.getContext(), "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void LIZIZ(EditText editText) {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(editText.getContext(), "input_method");
        editText.requestFocus();
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        inputMethodManager.showSoftInput(editText, 2);
    }
}
