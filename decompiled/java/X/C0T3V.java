package X;

import Y.ARunnableS81S0200000_12;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0T3V, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3V {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(View view, Function0 function0) {
        C0GWH c0gwh;
        C786410Ut5.LJLLLLLL(8, view);
        C786410Ut5.T4(view, 1.0f);
        if ((view instanceof C0GWH) && (c0gwh = (C0GWH) view) != null) {
            c0gwh.setLoading(false);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static void LIZJ(View view, View view2) {
        if (view != null) {
            view.animate().cancel();
            C786410Ut5.T4(view, 1.0f);
        }
        if (view2 != null) {
            view2.animate().cancel();
            C786410Ut5.T4(view2, 1.0f);
        }
    }

    public static void LIZ(View view, View view2, boolean z, AwS571S0100000_27 awS571S0100000_27, int i) {
        long j;
        if ((i & 2) != 0) {
            view2 = null;
        }
        boolean z2 = true;
        if ((i & 4) != 0) {
            if (view2 != null) {
                z = true;
            } else {
                z = false;
            }
        }
        if ((i & 8) == 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            j = 140;
        } else {
            j = 0;
        }
        if ((i & 32) != 0) {
            awS571S0100000_27 = null;
        }
        if (z && view2 != null) {
            view2.animate().cancel();
            if (view2.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C786410Ut5.T4(view2, 0.0f);
            view2.animate().alpha(1.0f).setDuration(j).start();
        }
        if (view != null) {
            view.animate().cancel();
            if (z2 && view.getVisibility() == 0) {
                view.animate().alpha(0.0f).setDuration(j).withEndAction(new ARunnableS81S0200000_12(awS571S0100000_27, view, 97)).start();
            } else {
                LIZIZ(view, awS571S0100000_27);
            }
        }
    }
}
