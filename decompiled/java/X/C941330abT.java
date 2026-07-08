package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0abT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941330abT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, float f) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = (int) C497740JfY.LIZIZ(f);
            layoutParams.width = (int) C497740JfY.LIZIZ(f);
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static void LIZIZ(C1324720kZq c1324720kZq, C1324720kZq c1324720kZq2) {
        int iLIZ;
        ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
        if (layoutParams != null) {
            iLIZ = layoutParams.width;
        } else {
            iLIZ = C439101nJ.LIZ(60);
        }
        LIZ(c1324720kZq2, (iLIZ * 1.6f) / C497740JfY.LIZIZ.density);
    }
}
