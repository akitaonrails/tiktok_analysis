package X;

import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0OTX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTX {
    public static final void LIZ(C1537720q7O c1537720q7O) {
        if (c1537720q7O.LIZIZ()) {
            ViewGroup.LayoutParams layoutParams = c1537720q7O.getLayoutParams();
            if (layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = c1537720q7O.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -2;
                layoutParams2.height = -2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1537720q7O);
                c1537720q7O.setLayoutParams(layoutParams2);
            }
            c1537720q7O.requestLayout();
        }
    }
}
