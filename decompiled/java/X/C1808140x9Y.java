package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0x9Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808140x9Y {
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
