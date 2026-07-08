package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0fQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126630fQL {
    public static final int LIZ = (int) C497740JfY.LIZIZ(16.0f);
    public static final int LIZIZ = (int) C497740JfY.LIZIZ(42.0f);
    public static final int LIZJ = (int) C497740JfY.LIZIZ(13.0f);
    public static final int LIZLLL = (int) C497740JfY.LIZIZ(20.0f);
    public static final int LJ = (int) C497740JfY.LIZIZ(8.0f);
    public static final int LJFF = (int) C497740JfY.LIZIZ(5.0f);

    public static void LIZIZ(ImageView imageView, View view, boolean z) {
        if (view != null) {
            C786410Ut5.Jc(view, 0.0f);
            C786410Ut5.ed(view, 0.0f);
        }
        if (imageView != null) {
            C786410Ut5.Lc(imageView, 0.0f);
            C786410Ut5.gd(imageView, 0.0f);
        }
        if (z) {
            if (imageView != null) {
                C500260Jjc.LLFFF(imageView);
            }
            if (view != null) {
                C500260Jjc.LLFFF(view);
                int i = LIZ;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = i;
                C786410Ut5.W5(view, layoutParams);
                int i2 = LIZJ;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = i2;
                C786410Ut5.W5(view, layoutParams2);
                return;
            }
            return;
        }
        if (imageView != null) {
            C500260Jjc.LJIILIIL(imageView);
        }
        if (view == null) {
            return;
        }
        C500260Jjc.LJIILIIL(view);
    }

    public static void LIZ(ImageView imageView, ViewGroup viewGroup, View view, boolean z) {
        float f;
        if (z) {
            C500260Jjc.LLFFF(viewGroup);
            if (C497740JfY.LJJ()) {
                f = LJ;
            } else {
                f = -LJ;
            }
            if (view != null) {
                C500260Jjc.LLFFF(view);
                int i = LIZIZ;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = i;
                C786410Ut5.W5(view, layoutParams);
                int i2 = LIZLLL;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = i2;
                C786410Ut5.W5(view, layoutParams2);
                C786410Ut5.Jc(view, f);
                C786410Ut5.ed(view, -LJFF);
            }
            if (imageView != null) {
                C500260Jjc.LLFFF(imageView);
                C786410Ut5.Lc(imageView, f);
                C786410Ut5.gd(imageView, (-LJFF) / 3.5f);
                return;
            }
            return;
        }
        if (viewGroup == null) {
            return;
        }
        C500260Jjc.LJIILIIL(viewGroup);
    }
}
