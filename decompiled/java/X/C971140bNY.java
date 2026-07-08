package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0bNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971140bNY {
    public static final int LIZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    public static final int LIZIZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            return layoutParams.width;
        }
        return 0;
    }

    public static final void LIZJ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
