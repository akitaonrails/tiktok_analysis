package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0QAW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAW {
    public static final void LIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginEnd(i);
        }
        view.requestLayout();
    }

    public static final void LIZIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
            }
            view.requestLayout();
        }
    }
}
