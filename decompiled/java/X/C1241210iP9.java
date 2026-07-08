package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: renamed from: X.0iP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241210iP9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final EditText editText) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("HistorySearchGenericUtils", "showKeyboard");
        if (editText.getParent() == null) {
            return;
        }
        editText.requestFocus();
        final View rootView = editText.getRootView();
        if (rootView.hasWindowFocus()) {
            ((InputMethodManager) C786410Ut5.H2(editText.getContext(), "input_method")).showSoftInput(editText, 1);
        } else {
            rootView.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0iPA
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    if (z) {
                        rootView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                        EditText editText2 = editText;
                        ((InputMethodManager) C786410Ut5.H2(editText2.getContext(), "input_method")).showSoftInput(editText2, 1);
                    }
                }
            });
        }
    }
}
