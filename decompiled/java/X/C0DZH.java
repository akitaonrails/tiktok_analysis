package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DZH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZH extends FrameLayout {
    public boolean LL;

    public final boolean getCanScrollUp() {
        return this.LL;
    }

    public C0DZH(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getActionMasked() == 0 && this.LL && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setCanScrollUp(boolean z) {
        this.LL = z;
    }
}
