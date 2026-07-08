package X;

import Y.ARunnableS107S0100000_7;
import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: X.19nJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21644719nJ extends C21644819nK {
    public final View LIZ;

    public void LIZ() {
        View view = this.LIZ;
        if (view != null) {
            ((InputMethodManager) C786410Ut5.H2(view.getContext(), "input_method")).hideSoftInputFromWindow(this.LIZ.getWindowToken(), 0);
        }
    }

    public void LIZIZ() {
        View viewFindFocus = this.LIZ;
        if (viewFindFocus == null) {
            return;
        }
        if (viewFindFocus.isInEditMode() || viewFindFocus.onCheckIsTextEditor()) {
            viewFindFocus.requestFocus();
        } else {
            viewFindFocus = viewFindFocus.getRootView().findFocus();
            if (viewFindFocus == null && (viewFindFocus = this.LIZ.getRootView().findViewById(R.id.content)) == null) {
                return;
            }
        }
        if (viewFindFocus.hasWindowFocus()) {
            viewFindFocus.post(new ARunnableS107S0100000_7(viewFindFocus, 263));
        }
    }

    public C21644719nJ(View view) {
        this.LIZ = view;
    }
}
