package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0RKH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKH {
    public static final void LIZ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void LIZIZ(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
