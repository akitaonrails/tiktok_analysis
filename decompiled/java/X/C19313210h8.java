package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;

/* JADX INFO: renamed from: X.10h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19313210h8 {
    public static View LIZ(View view) {
        while (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C16G1) && (((C16G1) layoutParams).LIZ instanceof ViewPagerBottomSheetBehavior)) {
                return view;
            }
            Object parent = view.getParent();
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }
}
