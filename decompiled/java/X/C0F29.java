package X;

import Y.ALAdapterS2S0100000_5;
import android.view.View;
import android.view.animation.Interpolator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F29, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F29 {
    public static final void LIZIZ(View view) {
        if (view != null && view.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static void LIZ(View view, Function0 function0, int i) {
        long j;
        Interpolator interpolatorLIZLLL;
        if ((i & 1) != 0) {
            j = 300;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            interpolatorLIZLLL = C1619980sG4.LIZLLL();
        } else {
            interpolatorLIZLLL = null;
        }
        if ((i & 8) != 0) {
            function0 = new AwS549S0100000_5(view, 1375);
        }
        view.animate().cancel();
        view.animate().alpha(0.0f).setDuration(j).setInterpolator(interpolatorLIZLLL).setListener(new ALAdapterS2S0100000_5(function0, 30));
    }
}
