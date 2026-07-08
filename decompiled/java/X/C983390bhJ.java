package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0bhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983390bhJ {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ() {
        return (int) (C497740JfY.LJIIZILJ() * 0.046153847f);
    }

    public static void LIZIZ(View view) {
        if (view == null) {
            return;
        }
        int iLIZ = C439101nJ.LIZ(51) + LIZ();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (iLIZ > 0 && iLIZ != layoutParams.height) {
            layoutParams.height = iLIZ;
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
