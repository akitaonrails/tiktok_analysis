package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0R72, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R72 {
    public static C0R73 LIZ(View view, String str) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int visibility = view.getVisibility();
        int height = view.getHeight();
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        return new C0R73(str, visibility, height, width, i);
    }
}
