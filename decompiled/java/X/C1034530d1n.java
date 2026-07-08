package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0d1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1034530d1n {
    public static void LIZ(View view) {
        int iN3;
        RelativeLayout.LayoutParams layoutParams;
        Resources resources = view.getContext().getResources();
        if (resources != null && (iN3 = C786410Ut5.n3(resources, "config_showNavigationBar", "bool", "android")) != 0 && resources.getBoolean(iN3)) {
            int dimensionPixelSize = resources.getDimensionPixelSize(C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android"));
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.bottomMargin = C1216270hkv.LIZIZ(34) - dimensionPixelSize;
            }
            C786410Ut5.W5(view, view.getLayoutParams());
        }
    }
}
