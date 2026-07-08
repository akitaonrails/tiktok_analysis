package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DSH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0DSH extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        View viewFindViewById = findViewById(R.id.u1a);
        if (viewFindViewById != null) {
            if (viewFindViewById.getParent() == this) {
                windowInsets = viewFindViewById.dispatchApplyWindowInsets(windowInsets);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("StatusBarView parent must be ");
                sbLIZ.append(getClass().getSimpleName());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        View viewFindViewById2 = findViewById(R.id.u19);
        if (viewFindViewById2 != null) {
            if (viewFindViewById2.getParent() == this) {
                windowInsets = viewFindViewById2.dispatchApplyWindowInsets(windowInsets);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("NavigationBarView parent must be ");
                sbLIZ2.append(getClass().getSimpleName());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != viewFindViewById && childAt != viewFindViewById2) {
                windowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                if (windowInsets.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsets;
    }

    public C0DSH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
