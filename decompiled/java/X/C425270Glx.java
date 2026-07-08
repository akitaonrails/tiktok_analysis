package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0Glx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425270Glx {
    public static final void LIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (numValueOf = Integer.valueOf(marginLayoutParams.bottomMargin)) != null && i != numValueOf.intValue()) {
            marginLayoutParams.bottomMargin = i;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public static final void LIZIZ(int i, View view) {
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (numValueOf = Integer.valueOf(layoutParams.height)) != null && i != numValueOf.intValue()) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = Math.max(0, i);
                C786410Ut5.W5(view, layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
