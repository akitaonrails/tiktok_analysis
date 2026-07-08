package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.14F3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14F3 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(322));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(323));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(324));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(325));

    public static void LIZ(View view) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 8388693;
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
