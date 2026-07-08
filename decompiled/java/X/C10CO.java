package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10CO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CO {
    public static final void LIZ(View view, boolean z, boolean z2) {
        C10CP c10cp;
        int i;
        int i2;
        Object tag = view.getTag(R.id.l18);
        if (!(tag instanceof C10CP) || (c10cp = (C10CP) tag) == null) {
            c10cp = new C10CP(view);
            view.setTag(R.id.l18, c10cp);
        }
        if (Intrinsics.LJFF(c10cp.LIZIZ, Boolean.valueOf(z)) && Intrinsics.LJFF(c10cp.LIZJ, Boolean.valueOf(z2))) {
            return;
        }
        c10cp.LIZIZ = Boolean.valueOf(z);
        c10cp.LIZJ = Boolean.valueOf(z2);
        int i3 = 0;
        if (c10cp.LIZLLL >= 0) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(c10cp.LJ);
            if (z) {
                c384050F3z.LJIIIIZZ = Float.valueOf(c10cp.LIZLLL);
                c384050F3z.LJIIIZ = Float.valueOf(c10cp.LIZLLL);
            }
            if (z2) {
                c384050F3z.LJIIJ = Float.valueOf(c10cp.LIZLLL);
                c384050F3z.LJIIJJI = Float.valueOf(c10cp.LIZLLL);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(c10cp.LIZ.getContext())});
            int i4 = c10cp.LJI;
            layerDrawable.setLayerInset(0, i4, 0, i4, 0);
            c10cp.LIZ.setBackground(layerDrawable);
        }
        int i5 = c10cp.LJI;
        if (i5 <= 0 || (i = c10cp.LJFF) <= 0) {
            return;
        }
        if (z) {
            i2 = i;
        } else {
            i2 = 0;
        }
        if (z2) {
            i3 = i;
        }
        C426750GoL.LJIIL(c10cp.LIZ, Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(c10cp.LJI), Integer.valueOf(i3), 16);
    }
}
