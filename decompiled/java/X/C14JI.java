package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.14JI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14JI extends C14JO {
    public static final Interpolator LJ = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final C14JQ LJFF = new C14JQ();
    public static final Interpolator LJI = new DecelerateInterpolator();

    public static C14JJ LJIIJ(View view) {
        Object tag = view.getTag(R.id.x2k);
        if (tag instanceof C14JH) {
            return ((C14JH) tag).LIZ;
        }
        return null;
    }

    public static void LJFF(View view, C14JM c14jm) {
        C14JJ c14jjLJIIJ = LJIIJ(view);
        if (c14jjLJIIJ != null) {
            c14jjLJIIJ.LIZ(c14jm);
            if (c14jjLJIIJ.LLILLJJLI == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJFF(viewGroup.getChildAt(i), c14jm);
            }
        }
    }

    public static WindowInsets LJIIIZ(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.x1y) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public C14JI(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    public static void LJII(View view, C20246014Ju c20246014Ju, List<C14JM> list) {
        C14JJ c14jjLJIIJ = LJIIJ(view);
        if (c14jjLJIIJ != null) {
            c20246014Ju = c14jjLJIIJ.LIZJ(c20246014Ju, list);
            if (c14jjLJIIJ.LLILLJJLI == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJII(viewGroup.getChildAt(i), c20246014Ju, list);
            }
        }
    }

    public static void LJIIIIZZ(View view, C14JM c14jm, C14JL c14jl) {
        C14JJ c14jjLJIIJ = LJIIJ(view);
        if (c14jjLJIIJ != null) {
            c14jjLJIIJ.LIZLLL(c14jm, c14jl);
            if (c14jjLJIIJ.LLILLJJLI == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJIIIIZZ(viewGroup.getChildAt(i), c14jm, c14jl);
            }
        }
    }

    public static void LJI(View view, C14JM c14jm, WindowInsets windowInsets, boolean z) {
        C14JJ c14jjLJIIJ = LJIIJ(view);
        if (c14jjLJIIJ != null) {
            c14jjLJIIJ.LL = windowInsets;
            if (!z) {
                c14jjLJIIJ.LIZIZ(c14jm);
                if (c14jjLJIIJ.LLILLJJLI == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJI(viewGroup.getChildAt(i), c14jm, windowInsets, z);
            }
        }
    }
}
