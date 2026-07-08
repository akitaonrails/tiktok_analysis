package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility;

/* JADX INFO: renamed from: X.0c5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnLayoutChangeListenerC998530c5j implements View.OnLayoutChangeListener {
    public int LL = -1;
    public final /* synthetic */ C999500c7I LLILLJJLI;

    public ViewOnLayoutChangeListenerC998530c5j(C999500c7I c999500c7I) {
        this.LLILLJJLI = c999500c7I;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null || this.LL == view.getHeight()) {
            return;
        }
        this.LL = view.getHeight();
        ICommerceTransAndCaptionAbility iCommerceTransAndCaptionAbility = (ICommerceTransAndCaptionAbility) this.LLILLJJLI.LLJILJILJ.getValue();
        if (iCommerceTransAndCaptionAbility != null) {
            int i10 = this.LL;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i9 = marginLayoutParams.bottomMargin;
            } else {
                i9 = 0;
            }
            iCommerceTransAndCaptionAbility.d52(i10 + i9, "FeedAdCardDelegate");
        }
    }
}
