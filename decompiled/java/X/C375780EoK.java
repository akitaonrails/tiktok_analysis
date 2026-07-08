package X;

import android.view.View;

/* JADX INFO: renamed from: X.0EoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375780EoK {
    public static final boolean LIZ(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return LIZ((View) parent);
        }
        return true;
    }

    public static final void LIZIZ(View view, boolean z) {
        if (z) {
            if (view.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        } else {
            if (view.getVisibility() == 8) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void LIZJ(View view, boolean z) {
        if (z) {
            if (view.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        } else {
            if (view.getVisibility() == 4) {
                return;
            }
            C786410Ut5.LJLLLLLL(4, view);
        }
    }
}
