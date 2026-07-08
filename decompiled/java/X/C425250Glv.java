package X;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Glv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425250Glv {
    public static final /* synthetic */ int LIZ = 0;

    public static FrameLayout.LayoutParams LIZ(View view, FrameLayout frameLayout, int i, int i2, boolean z) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        int i3 = width + i;
        int i4 = i + height;
        int i5 = iArr[0] + (width / 2);
        int i6 = (iArr[1] + (height / 2)) - (i4 / 2);
        int[] iArr2 = new int[2];
        frameLayout.getLocationInWindow(iArr2);
        int i7 = (i5 - (i3 / 2)) - iArr2[0];
        int i8 = i6 - iArr2[1];
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createLayoutParams, newWidth = ");
        sbLIZ.append(i3);
        sbLIZ.append(", newHeight = ");
        sbLIZ.append(i4);
        sbLIZ.append(", topMargin = ");
        sbLIZ.append(i8);
        C20441214yg.LIZIZ("OverlayUtils", C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        if (z && C497740JfY.LJJ()) {
            layoutParams.rightMargin = ((C497740JfY.LJIIZILJ() - i7) - i2) - i3;
        } else {
            layoutParams.leftMargin = i7 + i2;
        }
        layoutParams.topMargin = i8;
        return layoutParams;
    }

    public static FrameLayout.LayoutParams LIZJ(View view, FrameLayout frameLayout, int i, int i2, int i3, int i4, boolean z) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        int i5 = iArr[0] + (width / 2);
        int i6 = (iArr[1] + (height / 2)) - (i2 / 2);
        int[] iArr2 = new int[2];
        frameLayout.getLocationInWindow(iArr2);
        int i7 = (i5 - (i / 2)) - iArr2[0];
        int i8 = i6 - iArr2[1];
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        if (z && C497740JfY.LJJ()) {
            layoutParams.rightMargin = ((C497740JfY.LJIIZILJ() - i7) - i3) - i;
        } else {
            layoutParams.leftMargin = i7 + i3;
        }
        layoutParams.topMargin = i8 + i4;
        return layoutParams;
    }
}
