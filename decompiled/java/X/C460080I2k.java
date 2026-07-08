package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0I2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460080I2k {
    public static TuxIconView LIZIZ(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 0) {
            View childAt = frameLayout.getChildAt(0);
            if (childAt instanceof TuxIconView) {
                return (TuxIconView) childAt;
            }
            return null;
        }
        return null;
    }

    public static int LIZ(float f, int i) {
        return C2441009hQ.LJIIL(i, C814420VxA.LIZIZ(((i >> 24) & 255) * f));
    }
}
