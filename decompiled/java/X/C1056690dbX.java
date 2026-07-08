package X;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0dbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056690dbX {
    public static void LIZ(FrameLayout frameLayout, int i, int i2) {
        View childAt;
        int width;
        int height;
        if (frameLayout.getChildCount() == 0 || i == 0 || i2 == 0 || (childAt = frameLayout.getChildAt(0)) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (frameLayout.getWidth() > 0) {
            width = frameLayout.getWidth();
        } else {
            C1056680dbW.LIZ.getClass();
            width = C1056680dbW.LJIIIZ;
        }
        if (frameLayout.getHeight() > 0) {
            height = frameLayout.getHeight();
        } else {
            C1056680dbW.LIZ.getClass();
            height = C1056680dbW.LJIIJ;
        }
        if (width != 0 && height != 0) {
            int i3 = layoutParams.width;
            if (i3 > 0 && layoutParams.height / i3 == i2 / i && i3 == width) {
                return;
            }
            layoutParams.height = (int) (width * (i2 / i));
            layoutParams.width = width;
            layoutParams.gravity = 17;
            C786410Ut5.W5(childAt, layoutParams);
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getRight() - frameLayout.getLeft(), 1073741824), View.MeasureSpec.makeMeasureSpec(frameLayout.getBottom() - frameLayout.getTop(), 1073741824));
            frameLayout.layout(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
            frameLayout.invalidate();
        }
    }
}
