package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0R94, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R94 {
    public static final int LIZ(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getHeight();
    }
}
