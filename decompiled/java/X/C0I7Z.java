package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0I7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I7Z {
    public static final float LIZ(int i) {
        C844470XAv.LIZ.getClass();
        return (C844470XAv.LIZ().getResources().getDisplayMetrics().density * i) + 0.5f;
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
