package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.06WN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06WN {
    public static final void LIZ(View view, Number number) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(number));
            marginLayoutParams.leftMargin = iLIZIZ;
            marginLayoutParams.rightMargin = iLIZIZ;
            marginLayoutParams.topMargin = iLIZIZ;
            marginLayoutParams.bottomMargin = iLIZIZ;
            C786410Ut5.W5(view, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
