package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import nv7.c0;

/* JADX INFO: renamed from: X.0oAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462920oAk {
    public static boolean LIZIZ;
    public static boolean LIZ = true;
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));

    public static final boolean LIZLLL() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_optimize_camera_canvas_layout", true, false) || C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        return (LIZ && LIZIZ) ? false : true;
    }

    public static boolean LJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_optimize_camera_canvas_layout", true, false) && !C0CHQ.LIZ().getAccountService().LIZ();
    }

    public static final int LIZ(int i, View view) {
        int paddingBottom;
        View view2;
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        if (c1660590tJZ == null) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParamsLJ = c1660590tJZ.LJ(view.getContext());
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            paddingBottom = view2.getPaddingBottom();
        } else {
            paddingBottom = 0;
        }
        return (layoutParamsLJ.bottomMargin + i) - paddingBottom;
    }

    public static boolean LIZIZ(View[] viewArr, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (viewArr.length != 0 && LIZLLL() && !C0CHQ.LIZ().getAccountService().LIZ()) {
            int iLIZ = (LIZ(i, viewArr[0]) - LIZJ) - c0.LIZ.o2();
            for (View view : viewArr) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.bottomMargin = iLIZ;
                    C786410Ut5.W5(view, marginLayoutParams);
                }
            }
            return true;
        }
        return false;
    }

    public static void LJFF(Context context, boolean z) {
        if (LJ() && context != null) {
            LIZ = z;
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null) {
                c1660590tJZ.LJ(context);
                if (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)) + c1660590tJZ.LIZIZ() >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78))) {
                    LIZIZ = true;
                }
            }
        }
    }

    public static boolean LIZJ(View view, int i, int i2) {
        int paddingTop;
        int statusBarHeight;
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!LIZLLL() || C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        if (c1660590tJZ == null) {
            statusBarHeight = 0;
        } else {
            FrameLayout.LayoutParams layoutParamsLJ = c1660590tJZ.LJ(view.getContext());
            Object parent = view.getParent();
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                paddingTop = view2.getPaddingTop();
            } else {
                paddingTop = 0;
            }
            statusBarHeight = ((layoutParamsLJ.topMargin + i) - i2) - paddingTop;
            if (c1660590tJZ.LJI()) {
                statusBarHeight += ScreenUtils.getStatusBarHeight(view.getContext());
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return false;
        }
        marginLayoutParams.topMargin = statusBarHeight;
        marginLayoutParams.bottomMargin = 0;
        C786410Ut5.W5(view, marginLayoutParams);
        return true;
    }
}
