package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0Qln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C679970Qln extends C0HJ6 {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked != 5) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                this.LL = motionEvent.getPointerId(actionIndex);
                this.LLILLJJLI = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.LLILLL = (int) (motionEvent.getY(actionIndex) + 0.5f);
                return super.onInterceptTouchEvent(motionEvent);
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(this.LL);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (getScrollState() != 1) {
                int i = x - this.LLILLJJLI;
                int i2 = y - this.LLILLL;
                boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
                boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
                if (zCanScrollHorizontally && Math.abs(i) > this.LLILZ) {
                    if (Math.abs(i) < Math.abs(i2) && !zCanScrollVertically) {
                        return false;
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (((!zCanScrollVertically || Math.abs(i2) <= this.LLILZ || (Math.abs(i2) < Math.abs(i) && !zCanScrollHorizontally)) && !z) || !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.LL = motionEvent.getPointerId(0);
        this.LLILLJJLI = (int) (motionEvent.getX() + 0.5f);
        this.LLILLL = (int) (motionEvent.getY() + 0.5f);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.LLILZ = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            return;
        }
        this.LLILZ = viewConfiguration.getScaledTouchSlop();
    }

    public C679970Qln(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C679970Qln(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = -1;
        this.LLILZ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
