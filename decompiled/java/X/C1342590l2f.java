package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0l2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342590l2f {
    public static final ViewGroup.LayoutParams LIZ(ViewGroup.LayoutParams layoutParams, EnumC1342610l2h enumC1342610l2h, View view) {
        int i = C1342580l2e.LIZ[enumC1342610l2h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                layoutParams.height = enumC1342610l2h.pxValue(view);
                return layoutParams;
            }
            return new ViewGroup.LayoutParams(-1, -2);
        }
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
