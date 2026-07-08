package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.Space;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Hz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458880Hz4 extends FrameLayout {
    public boolean LL;

    public final void LIZ() {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        Space space = new Space(getContext());
        C786410Ut5.f6(space, new FrameLayout.LayoutParams(-1, C1397510mTF.LLJJIJIIJIL != 0 ? this.LL ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
        addView(space);
    }

    public final boolean getShowCloseButton$tux_theme_release() {
        return this.LL;
    }

    public final void setShowCloseButton$tux_theme_release(boolean z) {
        this.LL = z;
    }

    public C458880Hz4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xt);
        LIZ();
        this.LL = true;
    }
}
