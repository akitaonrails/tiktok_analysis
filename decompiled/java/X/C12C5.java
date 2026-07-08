package X;

import Y.ALAdapterS9S0100000_12;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12C5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12C5 {
    public static final void LIZ(View view, boolean z) {
        if (z) {
            LIZIZ(view, 0L, 0.4f, null, 5);
        } else {
            LIZJ(view, 0L, null, new AwS573S0100000_29(view, 531), 7);
        }
    }

    public static ViewPropertyAnimator LIZIZ(View view, long j, float f, Interpolator interpolator, int i) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            interpolator = C1619980sG4.LIZLLL();
        }
        view.animate().cancel();
        C337180DJs.LIZJ(view);
        return view.animate().alpha(f).setInterpolator(interpolator).setDuration(j).setListener(null);
    }

    public static ViewPropertyAnimator LIZJ(View view, long j, Interpolator interpolator, Function0 function0, int i) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            interpolator = C1619980sG4.LIZLLL();
        }
        if ((i & 8) != 0) {
            function0 = new AwS573S0100000_29(view, 532);
        }
        view.animate().cancel();
        return view.animate().alpha(0.0f).setDuration(j).setInterpolator(interpolator).setListener(new ALAdapterS9S0100000_12(function0, 19));
    }

    public static void LJ(View view, long j, float f, Interpolator interpolator, Function0 function0, int i) {
        float translationY;
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            translationY = view.getTranslationY();
        } else {
            translationY = 0.0f;
        }
        if ((i & 16) != 0) {
            interpolator = C1619980sG4.LJIIIZ();
        }
        if ((i & 32) != 0) {
            function0 = new AwS573S0100000_29(view, 533);
        }
        view.animate().cancel();
        C786410Ut5.ed(view, translationY);
        view.animate().translationY(f).alpha(0.0f).setDuration(j).setInterpolator(interpolator).setListener(new ALAdapterS9S0100000_12(function0, 21));
    }

    public static void LIZLLL(View view, long j, float f, float f2, Interpolator interpolator, Function0 function0, int i) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            f = view.getTranslationY();
        }
        float f3 = 0.0f;
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i & 8) != 0) {
            f3 = 1.0f;
        }
        if ((i & 16) != 0) {
            interpolator = C1619980sG4.LJIIIZ();
        }
        if ((i & 32) != 0) {
            function0 = AFwS218S0000000_29.get$arr$(247);
        }
        view.animate().cancel();
        C786410Ut5.ed(view, f);
        C337180DJs.LIZJ(view);
        view.animate().translationY(f2).alpha(f3).setInterpolator(interpolator).setDuration(j).setListener(new ALAdapterS9S0100000_12(function0, 20));
    }
}
