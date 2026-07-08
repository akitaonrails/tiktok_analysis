package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0GZC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZC implements View.OnLayoutChangeListener {
    public static final C0GZC LL = new C0GZC();

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int width = view.getWidth();
        if (width > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams.height != width) {
                layoutParams.height = width;
                C786410Ut5.W5(view, layoutParams);
            }
        }
    }
}
