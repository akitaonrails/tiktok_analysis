package X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0sG4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619980sG4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Interpolator LIZ() {
        return C0GY9.LIZIZ(0.32f, 0.0f, 0.67f, 0.0f);
    }

    public static Interpolator LIZLLL() {
        return C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
    }

    public static Interpolator LJII() {
        return C0GY9.LIZIZ(0.11f, 0.0f, 0.5f, 0.0f);
    }

    public static Interpolator LIZIZ() {
        return C0GY9.LIZIZ(0.33f, 1.0f, 0.68f, 1.0f);
    }

    public static Interpolator LIZJ() {
        return new AccelerateInterpolator(1.5f);
    }

    public static Interpolator LJIIIZ() {
        return new DecelerateInterpolator(1.5f);
    }

    public static Interpolator LJIIJ() {
        return new DecelerateInterpolator(3.0f);
    }

    public static Interpolator LJIIJJI() {
        return new DecelerateInterpolator(2.5f);
    }

    public static Interpolator LJIIL() {
        return C0GY9.LIZIZ(0.61f, 1.0f, 0.88f, 1.0f);
    }

    public static Interpolator LJ() {
        return C0GY9.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f);
    }

    public static Interpolator LJFF() {
        return C0GY9.LIZIZ(0.45f, 0.0f, 0.55f, 1.0f);
    }

    public static Interpolator LJI() {
        return C0GY9.LIZIZ(0.37f, 0.0f, 0.63f, 1.0f);
    }

    public static Interpolator LJIIIIZZ() {
        return C0GY9.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f);
    }

    public static Interpolator LJIILIIL() {
        return C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f);
    }

    public static Interpolator LJIILJJIL() {
        return C0GY9.LIZIZ(0.4f, 1.25f, 0.26f, 1.0f);
    }

    public static C21616519il LJIILL(Object obj, AbstractC21615419ia abstractC21615419ia, float f) {
        C21616519il c21616519il = new C21616519il(obj, abstractC21615419ia, f);
        c21616519il.LJJ.LIZIZ(640.0f);
        c21616519il.LJJ.LIZ(0.83f);
        c21616519il.LJI(0.0f);
        c21616519il.LIZ = 0.0f;
        return c21616519il;
    }

    public static C21616519il LJIILLIIL(Object obj, AbstractC21615419ia abstractC21615419ia, float f) {
        C21616519il c21616519il = new C21616519il(obj, abstractC21615419ia, f);
        c21616519il.LJJ.LIZIZ(850.0f);
        c21616519il.LJJ.LIZ(0.823f);
        c21616519il.LJI(0.0f);
        c21616519il.LIZ = 0.0f;
        return c21616519il;
    }
}
