package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0GoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426850GoV {
    public static final void LIZ(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            marginLayoutParams.rightMargin = i2;
            Context context = view.getContext();
            Integer numValueOf = Integer.valueOf(i4);
            Integer numValueOf2 = Integer.valueOf(i);
            Integer numValueOf3 = Integer.valueOf(i2);
            Integer numValueOf4 = Integer.valueOf(i3);
            if (view.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            C426750GoL.LJIIIIZZ(marginLayoutParams, context, numValueOf, numValueOf2, numValueOf3, numValueOf4, z);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }
}
