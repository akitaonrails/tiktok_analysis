package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Efn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370490Efn extends FrameLayout {
    public float LL;
    public float LLILLJJLI;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float x = motionEvent.getX() - this.LL;
                float y = motionEvent.getY() - this.LLILLJJLI;
                if ((!canScrollVertically(1) || !canScrollVertically(-1)) && Math.abs(x) < Math.abs(y)) {
                    requestDisallowInterceptTouchEvent(true);
                }
            }
        } else {
            this.LL = motionEvent.getX();
            this.LLILLJJLI = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C370490Efn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
