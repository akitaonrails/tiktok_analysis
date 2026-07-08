package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14K0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14K0 implements View.OnApplyWindowInsetsListener {
    public final boolean LIZ;

    public C14K0() {
        this(false);
    }

    public C14K0(boolean z) {
        this.LIZ = z;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = new WindowInsets(windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        if (this.LIZ) {
            int i = childCount - 1;
            while (true) {
                if (i < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                Boolean bool = (Boolean) childAt.getTag(R.id.p3s);
                if (bool != null && bool.booleanValue()) {
                    childAt.dispatchApplyWindowInsets(windowInsets2);
                } else if (childAt.getTag(R.id.d8o) != null) {
                    childAt.dispatchApplyWindowInsets(windowInsets2);
                    break;
                }
                i--;
            }
        } else {
            for (int i2 = 0; i2 < childCount; i2++) {
                viewGroup.getChildAt(i2).dispatchApplyWindowInsets(windowInsets2);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            return WindowInsets.CONSUMED;
        }
        if (i3 >= 28) {
            return windowInsets.consumeSystemWindowInsets().consumeDisplayCutout();
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
