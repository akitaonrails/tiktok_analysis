package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0DMR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DMR {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(LinearLayout linearLayout) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i3;
        int i4;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int childCount = linearLayout.getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = linearLayout.getChildAt(i7);
            if (childAt instanceof FrameLayout) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getAlpha() > 0.0f) {
                    int childCount2 = viewGroup.getChildCount();
                    i3 = 0;
                    for (int i8 = 0; i8 < childCount2; i8++) {
                        View childAt2 = viewGroup.getChildAt(i8);
                        if (childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f) {
                            int measuredHeight = childAt2.getMeasuredHeight();
                            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                i4 = marginLayoutParams4.topMargin;
                            } else {
                                i4 = 0;
                            }
                            int i9 = measuredHeight + i4;
                            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                i5 = marginLayoutParams3.bottomMargin;
                            } else {
                                i5 = 0;
                            }
                            int i10 = i9 + i5;
                            if (i3 < i10) {
                                i3 = i10;
                            }
                        }
                    }
                } else {
                    i3 = 0;
                }
                i6 += i3;
            } else if (childAt != null && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                int height = childAt.getHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i = marginLayoutParams2.topMargin;
                } else {
                    i = 0;
                }
                int i11 = height + i;
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    i2 = marginLayoutParams.bottomMargin;
                } else {
                    i2 = 0;
                }
                i6 += i11 + i2;
            }
        }
        return i6;
    }
}
