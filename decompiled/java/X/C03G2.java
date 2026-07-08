package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.03G2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03G2 {
    public static final int LIZ(ViewGroup viewGroup) {
        int iGenerateViewId = View.generateViewId();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(iGenerateViewId);
        viewGroup.addView(frameLayout);
        return iGenerateViewId;
    }
}
