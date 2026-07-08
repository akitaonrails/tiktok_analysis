package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0HTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441580HTg {
    public static final void LIZ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
