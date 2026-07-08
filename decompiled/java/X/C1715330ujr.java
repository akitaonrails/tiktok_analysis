package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0ujr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715330ujr {
    public static final void LIZ(View view) {
        if (view != null && view.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void LIZJ(View view) {
        if (view != null && view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void LIZIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }
}
