package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0TPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746440TPu extends RelativeLayout {
    public C0TQ1 LL;

    public final C0TQ1 getTouchListener() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0TQ1 c0tq1;
        if (motionEvent != null && motionEvent.getAction() == 1 && (c0tq1 = this.LL) != null) {
            c0tq1.LIZ();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setTouchListener(C0TQ1 c0tq1) {
        this.LL = c0tq1;
    }

    public C746440TPu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
