package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.0DIN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DIN implements Runnable {
    public final /* synthetic */ View LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ViewUtils@55ad.requestFocusAndShowKeyboard$1");
        try {
            ((InputMethodManager) C786410Ut5.H2(this.LL.getContext(), "input_method")).showSoftInput(this.LL, 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewUtils@55ad.requestFocusAndShowKeyboard$1");
    }

    public C0DIN(View view) {
        this.LL = view;
    }
}
