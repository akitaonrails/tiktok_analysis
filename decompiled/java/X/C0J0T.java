package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0J0T, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0T {
    public static Rect LIZ(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        return rect;
    }

    public static boolean LIZIZ(View view) {
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(View view) {
        Rect rect = new Rect();
        if (view != null && view.isAttachedToWindow()) {
            View view2 = view;
            while (view2.getVisibility() == 0 && view2.getAlpha() >= 1.0E-6f) {
                if (view2.getId() != 16908290) {
                    Object parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                }
                if (view.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
