package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650830Pft {
    public static void LIZ(ViewGroup viewGroup, View view, int[] iArr) {
        if (iArr.length >= 2) {
            iArr[0] = view.getLeft();
            iArr[1] = view.getTop();
            Object parent = view.getParent();
            while ((parent instanceof View) && !Intrinsics.LJFF(parent, viewGroup)) {
                View view2 = (View) parent;
                iArr[0] = iArr[0] - view2.getScrollX();
                iArr[1] = iArr[1] - view2.getScrollY();
                iArr[0] = iArr[0] + view2.getLeft();
                iArr[1] = iArr[1] + view2.getTop();
                parent = view2.getParent();
            }
            if (Intrinsics.LJFF(parent, view.getRootView())) {
                iArr[0] = Integer.MIN_VALUE;
                iArr[1] = Integer.MIN_VALUE;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("location must be an array of two integers");
    }
}
