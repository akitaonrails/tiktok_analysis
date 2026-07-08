package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0S0H, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S0H {
    public ValueAnimator LIZ;
    public boolean LIZIZ;

    public static void LIZ(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    LIZ(childAt);
                } else {
                    LIZIZ(childAt);
                }
            }
            return;
        }
        LIZIZ(view);
    }

    public static boolean LIZIZ(View view) {
        if (view.getVisibility() == 0 && (view instanceof C1322110kVd)) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null && !imageView.getDrawable().isVisible()) {
                imageView.getDrawable().setVisible(true, false);
                return true;
            }
        }
        return false;
    }
}
