package X;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14K4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14K4 {
    public static C20246014Ju LIZ(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C20246014Ju c20246014JuLJIIJJI = C20246014Ju.LJIIJJI(null, rootWindowInsets);
        c20246014JuLJIIJJI.LIZ.LJIJI(c20246014JuLJIIJJI);
        c20246014JuLJIIJJI.LIZ.LIZLLL(view.getRootView());
        return c20246014JuLJIIJJI;
    }

    public static int LIZIZ(View view) {
        return view.getScrollIndicators();
    }

    public static void LIZJ(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void LIZLLL(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
