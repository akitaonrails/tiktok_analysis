package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* JADX INFO: renamed from: X.14MG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14MG {
    public static final PorterDuff.Mode LIZIZ = PorterDuff.Mode.SRC_IN;
    public static C14MG LIZJ;
    public C14MA LIZ;

    public static synchronized C14MG LIZ() {
        if (LIZJ == null) {
            LIZLLL();
        }
        return LIZJ;
    }

    public static synchronized void LIZLLL() {
        if (LIZJ == null) {
            C14MG c14mg = new C14MG();
            LIZJ = c14mg;
            c14mg.LIZ = C14MA.LIZLLL();
            LIZJ.LIZ.LJIIJJI(new C14ME());
        }
    }

    public static synchronized PorterDuffColorFilter LIZJ(int i, PorterDuff.Mode mode) {
        return C14MA.LJII(i, mode);
    }

    public final synchronized Drawable LIZIZ(Context context, int i) {
        return this.LIZ.LJFF(context, i);
    }

    public static void LJ(Drawable drawable, C14MH c14mh, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c14mh.LIZLLL;
            if (!z && !c14mh.LIZJ) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilterLJII = null;
                if (z) {
                    colorStateList = c14mh.LIZ;
                } else {
                    colorStateList = null;
                }
                if (c14mh.LIZJ) {
                    mode = c14mh.LIZIZ;
                } else {
                    mode = C14MA.LJI;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilterLJII = C14MA.LJII(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilterLJII);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }
}
