package X;

import android.view.View;

/* JADX INFO: renamed from: X.0dJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045580dJc {
    public static boolean LIZ(View view) {
        if (!view.isAttachedToWindow() || view.getVisibility() != 0 || view.getAlpha() == 0.0f) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(C1045610dJf c1045610dJf) {
        if (c1045610dJf.LIZLLL && !c1045610dJf.LJ) {
        } else {
            throw new IllegalStateException("Viewability session should be active");
        }
    }
}
