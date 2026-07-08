package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0J9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487360J9i extends FrameLayout {
    public boolean LL;

    public C487360J9i() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setGroupClickable(boolean z) {
        this.LL = z;
    }

    public C487360J9i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
    }
}
