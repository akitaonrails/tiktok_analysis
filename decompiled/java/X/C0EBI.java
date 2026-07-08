package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0EBI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBI {
    public static final void LIZ(View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C0FU0.LIZ(f);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }
}
