package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.14JU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14JU extends C14JZ {
    public static C14JV LJIIIZ(View view) {
        Object tag = view.getTag(R.id.x2k);
        if (tag instanceof C14JW) {
            return ((C14JW) tag).LIZ;
        }
        return null;
    }

    public static void LJ(View view, C14JT c14jt) {
        C14JV c14jvLJIIIZ = LJIIIZ(view);
        if (c14jvLJIIIZ != null) {
            c14jvLJIIIZ.LIZIZ(c14jt);
            if (c14jvLJIIIZ.LIZIZ == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJ(viewGroup.getChildAt(i), c14jt);
            }
        }
    }

    public static WindowInsets LJIIIIZZ(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.x1y) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public C14JU(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    public static void LJI(View view, C20244614Jg c20244614Jg, List<C14JT> list) {
        C14JV c14jvLJIIIZ = LJIIIZ(view);
        if (c14jvLJIIIZ != null) {
            c14jvLJIIIZ.LIZLLL(c20244614Jg, list);
            if (c14jvLJIIIZ.LIZIZ == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJI(viewGroup.getChildAt(i), c20244614Jg, list);
            }
        }
    }

    public static void LJII(View view, C14JT c14jt, C14JR c14jr) {
        C14JV c14jvLJIIIZ = LJIIIZ(view);
        if (c14jvLJIIIZ != null) {
            c14jvLJIIIZ.LJ(c14jt, c14jr);
            if (c14jvLJIIIZ.LIZIZ == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJII(viewGroup.getChildAt(i), c14jt, c14jr);
            }
        }
    }

    public static void LJFF(View view, C14JT c14jt, WindowInsets windowInsets, boolean z) {
        C14JV c14jvLJIIIZ = LJIIIZ(view);
        if (c14jvLJIIIZ != null) {
            c14jvLJIIIZ.LIZ = windowInsets;
            if (!z) {
                c14jvLJIIIZ.LIZJ(c14jt);
                if (c14jvLJIIIZ.LIZIZ == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJFF(viewGroup.getChildAt(i), c14jt, windowInsets, z);
            }
        }
    }
}
