package X;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditActivity;

/* JADX INFO: renamed from: X.1AW9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AW9 {
    public final View LIZ;
    public int LIZIZ;
    public final FrameLayout.LayoutParams LIZJ;
    public int LIZLLL;
    public boolean LJ = true;
    public final int LJFF;

    public C1AW9(AddressEditActivity addressEditActivity) {
        this.LJFF = C497820Jfg.LIZJ(addressEditActivity);
        View childAt = ((ViewGroup) addressEditActivity.findViewById(R.id.content)).getChildAt(0);
        this.LIZ = childAt;
        C786410Ut5.x3(childAt.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC2189681Ams(this, 6));
        this.LIZJ = (FrameLayout.LayoutParams) childAt.getLayoutParams();
    }
}
