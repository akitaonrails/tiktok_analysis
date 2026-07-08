package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725890Sdf {
    public static final void LIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
            }
            view.requestLayout();
        }
    }

    public static void LIZIZ(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public static final void LIZLLL(int i, View view) {
        if (view.getHeight() == i) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
        view.requestLayout();
    }

    public static void LIZJ(View view, boolean z, Function0 function0) {
        if (z) {
            function0.invoke();
            C786410Ut5.LJLLLLLL(0, view);
        } else {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }
}
