package X;

import android.view.View;

/* JADX INFO: renamed from: X.0guh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183890guh {
    public static final boolean LIZ(View view) {
        if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return false;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return LIZ((View) parent);
        }
        return true;
    }
}
