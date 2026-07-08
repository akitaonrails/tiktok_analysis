package X;

import Y.ARunnableS12S0201000_4;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0DLH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DLH {
    public static final void LIZIZ(View view) {
        InputMethodManager inputMethodManager;
        if (view == null) {
            return;
        }
        Object objH2 = C786410Ut5.H2(view.getContext(), "input_method");
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null && !inputMethodManager.showSoftInput(view, 0)) {
            HandlerHook.viewPostDelay(view, new ARunnableS12S0201000_4(inputMethodManager, view, 1), 100L);
        }
    }

    public static final void LIZ(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context != null && view != null) {
            Object objH2 = C786410Ut5.H2(context, "input_method");
            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }
}
