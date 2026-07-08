package X;

import android.view.View;

/* JADX INFO: renamed from: X.0s1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611190s1t {
    public static final boolean LIZ(View view) {
        if (view.isShown() && view.isAttachedToWindow()) {
            double alpha = view.getAlpha();
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                alpha *= (double) view2.getAlpha();
                parent = view2.getParent();
            }
            if (alpha > 0.99d) {
                return true;
            }
            return false;
        }
        return false;
    }
}
