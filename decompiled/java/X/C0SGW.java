package X;

import android.view.View;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;

/* JADX INFO: renamed from: X.0SGW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SGW {
    public static View LIZ(View view) {
        ViewParent parent;
        if (!(view instanceof FeedBottomBannerView)) {
            View view2 = null;
            if (view != null) {
                parent = view.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof View) {
                view2 = (View) parent;
            }
            return LIZ(view2);
        }
        return view;
    }
}
