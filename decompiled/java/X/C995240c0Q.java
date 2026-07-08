package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0c0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995240c0Q {
    public static final int LIZ;
    public static final int LIZIZ;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        LIZ = iLIZIZ;
        LIZIZ = iLIZIZ;
    }

    public static final int LIZ(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return LIZIZ(view);
    }

    public static final int LIZIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i2 = view.getLayoutParams().height;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i3 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        int i4 = i2 + i;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i3 = marginLayoutParams2.bottomMargin;
        }
        return i4 + i3;
    }

    public static final void LIZJ(TextView textView) {
        textView.setText("");
        textView.getLayoutParams().width = LIZ;
        C426750GoL.LJIIL(textView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 26);
    }
}
