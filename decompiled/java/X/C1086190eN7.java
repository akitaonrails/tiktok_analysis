package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0eN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086190eN7 {
    public static final /* synthetic */ int LIZIZ = 0;
    public ValueAnimator LIZ;

    public static void LIZ(View view, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (view.getLayoutParams() != layoutParams) {
            return;
        }
        layoutParams.height = -2;
        if (z) {
            view.requestLayout();
        }
    }
}
