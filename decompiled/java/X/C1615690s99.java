package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0s99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615690s99 {
    public static TuxIconView LIZ(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 0) {
            View childAt = frameLayout.getChildAt(0);
            if (childAt instanceof TuxIconView) {
                return (TuxIconView) childAt;
            }
            return null;
        }
        return null;
    }
}
