package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0cCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003010cCx {
    public static final void LIZ(C1003000cCw c1003000cCw, int i) {
        TuxIconView tuxIconView;
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        TuxTextView tuxTextView = c1003000cCw.LLJLL;
        if (tuxTextView == null || (tuxIconView = c1003000cCw.LLJLLIL) == null) {
            return;
        }
        int i2 = (int) (i * c1003000cCw.LLILZ.getResources().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams3) != null) {
            layoutParams2.topMargin = i2;
            C786410Ut5.R6(tuxTextView, layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams4 = tuxIconView.getLayoutParams();
        if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams4) != null) {
            layoutParams.topMargin = i2;
            C786410Ut5.M6(tuxIconView, layoutParams);
        }
    }
}
