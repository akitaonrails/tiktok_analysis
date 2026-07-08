package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14K9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14K9 {
    public static ColorStateList LJI(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode LJII(View view) {
        return view.getBackgroundTintMode();
    }

    public static float LJIIIIZZ(View view) {
        return view.getElevation();
    }

    public static C20246014Ju LJIIIZ(View view) {
        if (C14K3.LIZLLL && view.isAttachedToWindow()) {
            try {
                Object obj = C14K3.LIZ.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) C14K3.LIZIZ.get(obj);
                    Rect rect2 = (Rect) C14K3.LIZJ.get(obj);
                    if (rect != null && rect2 != null) {
                        C20246414Jy c20246414Jy = new C20246414Jy();
                        c20246414Jy.LIZ.LJ(C20244914Jj.LIZIZ(rect.left, rect.top, rect.right, rect.bottom));
                        c20246414Jy.LIZ.LJI(C20244914Jj.LIZIZ(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        C20246014Ju c20246014JuLIZ = c20246414Jy.LIZ();
                        c20246014JuLIZ.LIZ.LJIJI(c20246014JuLIZ);
                        c20246014JuLIZ.LIZ.LIZLLL(view.getRootView());
                        return c20246014JuLIZ;
                    }
                    return null;
                }
                return null;
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static String LJIIJ(View view) {
        return view.getTransitionName();
    }

    public static float LJIIJJI(View view) {
        return view.getTranslationZ();
    }

    public static float LJIIL(View view) {
        return view.getZ();
    }

    public static boolean LJIILIIL(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean LJIILJJIL(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean LJIILL(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void LJJIFFI(View view) {
        view.stopNestedScroll();
    }

    public static void LIZ(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.x2k);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void LJIILLIIL(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void LJIIZILJ(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void LJIJ(View view, float f) {
        view.setElevation(f);
    }

    public static void LJIJI(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void LJIJJ(final View view, final C0TVI c0tvi) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.x1y, c0tvi);
        }
        if (c0tvi == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.x2k));
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.13kN
                public C20246014Ju LIZ;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C20246014Ju c20246014JuLJIIJJI = C20246014Ju.LJIIJJI(view2, windowInsets);
                    int i = Build.VERSION.SDK_INT;
                    if (i < 30) {
                        C14K9.LIZ(windowInsets, view);
                        if (c20246014JuLJIIJJI.equals(this.LIZ)) {
                            return c0tvi.onApplyWindowInsets(view2, c20246014JuLJIIJJI).LJIIJ();
                        }
                    }
                    this.LIZ = c20246014JuLJIIJJI;
                    C20246014Ju c20246014JuOnApplyWindowInsets = c0tvi.onApplyWindowInsets(view2, c20246014JuLJIIJJI);
                    if (i >= 30) {
                        return c20246014JuOnApplyWindowInsets.LJIIJ();
                    }
                    C20097313kJ.LIZJ(view2);
                    return c20246014JuOnApplyWindowInsets.LJIIJ();
                }
            });
        }
    }

    public static void LJIJJLI(View view, String str) {
        view.setTransitionName(str);
    }

    public static void LJIL(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void LJJ(View view, float f) {
        view.setZ(f);
    }

    public static boolean LJJI(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static C20246014Ju LIZIZ(View view, C20246014Ju c20246014Ju, Rect rect) {
        WindowInsets windowInsetsLJIIJ = c20246014Ju.LJIIJ();
        if (windowInsetsLJIIJ != null) {
            return C20246014Ju.LJIIJJI(view, view.computeSystemWindowInsets(windowInsetsLJIIJ, rect));
        }
        rect.setEmpty();
        return c20246014Ju;
    }

    public static boolean LIZLLL(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static boolean LIZJ(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean LJ(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static boolean LJFF(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }
}
