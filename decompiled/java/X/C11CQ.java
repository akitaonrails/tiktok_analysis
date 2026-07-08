package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.11CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11CQ extends C21689319uV {
    public double LLJIJIL;
    public double LLJILJIL;

    public C11CQ(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                double dAbs = Math.abs(((double) motionEvent.getX()) - this.LLJIJIL);
                double dAbs2 = Math.abs(((double) motionEvent.getY()) - this.LLJILJIL);
                if (dAbs > ViewConfiguration.get(getContext()).getScaledTouchSlop() && dAbs > dAbs2) {
                    return false;
                }
            }
        } else {
            this.LLJIJIL = motionEvent.getX();
            this.LLJILJIL = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C11CQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
