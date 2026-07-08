package X;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.0GlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424870GlJ {
    public static final boolean LIZ(C19EG c19eg, View view) {
        Window window;
        if (view == null) {
            return false;
        }
        if (c19eg != null && (window = c19eg.getWindow()) != null && view == window.getDecorView()) {
            return true;
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        Object parent = view.getParent();
        if (!(parent instanceof View)) {
            return true;
        }
        return LIZ(c19eg, (View) parent);
    }
}
