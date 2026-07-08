package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1De4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260661De4 {
    public static final C2260671De5 LIZIZ(FrameLayout.LayoutParams layoutParams) {
        return new C2260671De5(layoutParams.width, layoutParams.height, layoutParams.topMargin, layoutParams.bottomMargin, layoutParams.leftMargin, layoutParams.rightMargin);
    }

    public static final FrameLayout.LayoutParams LIZJ(C2260671De5 c2260671De5) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2260671De5.LIZ, c2260671De5.LIZIZ);
        layoutParams.topMargin = c2260671De5.LIZJ;
        layoutParams.bottomMargin = c2260671De5.LIZLLL;
        layoutParams.leftMargin = c2260671De5.LJ;
        layoutParams.rightMargin = c2260671De5.LJFF;
        return layoutParams;
    }

    public static final FrameLayout.LayoutParams LIZLLL(C2260681De6 c2260681De6) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2260681De6.LIZ, c2260681De6.LIZIZ);
        layoutParams.topMargin = c2260681De6.LIZJ;
        layoutParams.bottomMargin = c2260681De6.LIZLLL;
        layoutParams.leftMargin = c2260681De6.LJ;
        layoutParams.rightMargin = c2260681De6.LJFF;
        return layoutParams;
    }

    public static final C2260681De6 LJ(FrameLayout.LayoutParams layoutParams) {
        return new C2260681De6(layoutParams.width, layoutParams.height, layoutParams.topMargin, layoutParams.bottomMargin, layoutParams.leftMargin, layoutParams.rightMargin);
    }

    public static final boolean LIZ(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        if (layoutParams == null || !Intrinsics.LJFF(layoutParams.getClass(), layoutParams2.getClass()) || layoutParams.width != layoutParams2.width || layoutParams.height != layoutParams2.height) {
            return false;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams.leftMargin != marginLayoutParams2.leftMargin || marginLayoutParams.topMargin != marginLayoutParams2.topMargin || marginLayoutParams.rightMargin != marginLayoutParams2.rightMargin || marginLayoutParams.bottomMargin != marginLayoutParams2.bottomMargin) {
                return false;
            }
            return true;
        }
        return true;
    }
}
