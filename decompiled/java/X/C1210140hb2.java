package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0hb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210140hb2 {
    public static final void LIZ(C12P2 c12p2, ViewGroup viewGroup, C12P4 c12p4, ImageView imageView, C1213920hh8 c1213920hh8, boolean z) {
        int iLIZJ;
        int i;
        int iLIZJ2 = (int) C12ES.LIZJ(28.0f, c12p2.getContext());
        Context context = c12p2.getContext();
        float f = C14LC.LJIILIIL;
        C1591860rWi.LJI(c12p2, iLIZJ2, -1, (int) (C12ES.LIZJ(f, context) - ((iLIZJ2 - c12p2.getProgressHeight()) / 2)), 8388691);
        int iLIZJ3 = (int) C12ES.LIZJ(f, c12p2.getContext());
        C1591860rWi.LJI(viewGroup, -2, -1, iLIZJ3, 8388691);
        C1591860rWi.LJI(c12p4, (int) C12ES.LIZJ(99.0f, c12p2.getContext()), -1, iLIZJ3, 80);
        int iLIZJ4 = ((int) (C12ES.LIZJ(f, c12p2.getContext()) + C12ES.LIZJ(60.0f, c12p2.getContext()))) + ((int) C12ES.LIZJ(44.0f, c12p2.getContext()));
        if (c1213920hh8 != null) {
            iLIZJ = (int) C12ES.LIZJ(11.0f, c12p2.getContext());
        } else {
            iLIZJ = 0;
        }
        int iLIZIZ = iLIZJ4 + iLIZJ;
        if (z) {
            if (c1213920hh8 != null) {
                i = 122;
            } else {
                i = 118;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))) + iLIZJ3;
        }
        if (imageView != null) {
            C1591860rWi.LJI(imageView, -2, -1, iLIZIZ, 81);
        }
        int iLIZJ5 = ((int) C12ES.LIZJ(f, c12p2.getContext())) + ((int) C12ES.LIZJ(60.0f, c12p2.getContext())) + ((int) C12ES.LIZJ(30.0f, c12p2.getContext()));
        if (z) {
            iLIZJ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)) + iLIZJ3;
        }
        if (c1213920hh8 != null) {
            C1591860rWi.LJI(c1213920hh8, -2, -1, iLIZJ5, 80);
        }
    }
}
