package X;

import android.view.View;

/* JADX INFO: renamed from: X.0qxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570050qxX {
    public static void LIZ(final View.OnClickListener onClickListener, View view) {
        if (view != null) {
            if (onClickListener == null) {
                C786410Ut5.I7(null, view);
            } else {
                C786410Ut5.I7(new C01DW() { // from class: X.0qxW
                    @Override // X.C01DW
                    public final void LIZ(View view2) {
                        onClickListener.onClick(view2);
                    }
                }, view);
            }
        }
    }
}
