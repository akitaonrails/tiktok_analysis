package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0sX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630550sX7 {
    public static final void LIZ(View view, View view2) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (view == null || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams2.bottomMargin;
        } else {
            i = 0;
        }
        int height = i + view2.getHeight();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.bottomMargin = height;
        }
    }
}
