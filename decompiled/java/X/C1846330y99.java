package X;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.0y99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846330y99 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1842270y2b c1842270y2b) {
        InputMethodManager inputMethodManager;
        if (c1842270y2b != null) {
            c1842270y2b.clearFocus();
            Object objH2 = C786410Ut5.H2(c1842270y2b.getContext(), "input_method");
            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                inputMethodManager.hideSoftInputFromWindow(c1842270y2b.getWindowToken(), 0);
            }
        }
    }
}
