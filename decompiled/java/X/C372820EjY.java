package X;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372820EjY {
    public static final float LIZ(float f) {
        if (f < 0.7f) {
            return 0.0f;
        }
        return (f - 0.7f) / 0.3f;
    }

    public static final float LIZIZ(float f, Pair pair) {
        return ((Number) pair.getFirst()).floatValue() + ((((Number) pair.getSecond()).floatValue() - ((Number) pair.getFirst()).floatValue()) * f);
    }

    public static final void LIZJ(C372830EjZ c372830EjZ, float f) {
        FrameLayout grabberView = c372830EjZ.getGrabberView();
        if (grabberView != null) {
            C786410Ut5.U4(grabberView, f);
        }
        View navBarLayout = c372830EjZ.getNavBarLayout();
        if (navBarLayout != null) {
            C786410Ut5.T4(navBarLayout, f);
        }
        C786410Ut5.T4(c372830EjZ.getControlLayout(), f);
    }
}
