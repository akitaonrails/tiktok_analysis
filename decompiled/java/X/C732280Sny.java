package X;

import android.view.View;

/* JADX INFO: renamed from: X.0Sny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732280Sny {
    public static final C732280Sny LIZ = new C732280Sny();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C732290Snz());

    public static boolean LIZ(View view) {
        if (view.getAlpha() != 1.0f || view.getTranslationX() != 0.0f || view.getTranslationY() != 0.0f || view.getScaleX() != 1.0f || view.getScaleY() != 1.0f || view.getPaddingLeft() != 0 || view.getPaddingRight() != 0 || view.getPaddingTop() != 0 || view.getPaddingBottom() != 0 || view.getVisibility() != 0) {
            return true;
        }
        return false;
    }
}
