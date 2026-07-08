package X;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0c5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998440c5a implements InterfaceC705900RmW {
    public static final void LIZ(View view, int i, int i2, boolean z) {
        if (view != null) {
            int i3 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            if (z) {
                if (i3 < 0) {
                    C421750GgH.LIZIZ(view, i3, i, i2).start();
                }
            } else {
                if (i3 < 0) {
                    return;
                }
                C421750GgH.LIZIZ(view, i3, i, i2).start();
            }
        }
    }
}
