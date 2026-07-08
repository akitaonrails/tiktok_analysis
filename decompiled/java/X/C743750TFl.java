package X;

import Y.ARunnableS112S0100000_12;
import android.view.View;

/* JADX INFO: renamed from: X.0TFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743750TFl {
    public static final void LIZ(View view) {
        if (view.getVisibility() == 0) {
            view.animate().alpha(0.0f).setDuration(100L).withEndAction(new ARunnableS112S0100000_12(view, 333));
        }
    }
}
