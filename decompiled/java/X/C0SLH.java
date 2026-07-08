package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0SLH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SLH {
    public static final void LIZ(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        if (i3 >= i4) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i);
            } else if (childAt instanceof TuxIconView) {
                ((TuxIconView) childAt).setTintColor(i2);
            } else if (childAt instanceof ViewGroup) {
                LIZ((ViewGroup) childAt, i, i2, i3 + 1, i4);
            }
        }
    }
}
