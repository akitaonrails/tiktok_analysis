package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0c0F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995130c0F {
    public static final void LIZ(View view) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        int height = (view.getHeight() / 2) + iLIZIZ;
        int i = height - iLIZIZ;
        view.setSystemGestureExclusionRects(C1697810uHb.LJIIJJI(new Rect(0, i, view.getLeft() + iLIZIZ2, height), new Rect(view.getRight() - iLIZIZ2, i, view.getRight(), height)));
    }

    public static final void LIZIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public static final void LIZJ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static void LIZLLL(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }
}
