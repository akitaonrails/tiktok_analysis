package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EZW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, boolean z, boolean z2) {
        int i;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, view.getContext());
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = numLIZJ;
        if (z) {
            float f = iLIZIZ;
            c384050F3z.LJIIIIZZ = Float.valueOf(f);
            c384050F3z.LJIIIZ = Float.valueOf(f);
        }
        if (z2) {
            float f2 = iLIZIZ;
            c384050F3z.LJIIJ = Float.valueOf(f2);
            c384050F3z.LJIIJJI = Float.valueOf(f2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(view.getContext())});
        layerDrawable.setLayerInset(0, iLIZIZ2, 0, iLIZIZ2, 0);
        view.setBackground(layerDrawable);
        if (iLIZIZ2 > 0 && iLIZIZ3 > 0) {
            if (z) {
                i = iLIZIZ3;
            } else {
                i = 0;
            }
            if (!z2) {
                iLIZIZ3 = 0;
            }
            C426750GoL.LJIIL(view, Integer.valueOf(iLIZIZ2), Integer.valueOf(i), Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ3), 16);
        }
    }
}
