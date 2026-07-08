package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0kQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1319210kQx extends RecyclerView {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public int LLILZ;

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (i != -1) {
            return super.canScrollVertically(i);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.canScrollVertically(i);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
        if (iFindFirstVisibleItemPosition == 1 && iFindFirstCompletelyVisibleItemPosition == 0 && (viewFindViewByPosition == null || viewFindViewByPosition.getHeight() == 0)) {
            return false;
        }
        return super.canScrollVertically(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int actionIndex = motionEvent.getActionIndex();
        if (action != 0) {
            if (action != 2) {
                if (action != 5) {
                    if (action == 6) {
                        onPointerUp(motionEvent);
                    }
                } else {
                    this.LLILZ = motionEvent.getPointerId(actionIndex);
                    this.LL = motionEvent.getX();
                    this.LLILLJJLI = motionEvent.getY();
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.LLILZ);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                float fAbs = Math.abs(x - this.LL);
                float fAbs2 = Math.abs(y - this.LLILLJJLI);
                if (fAbs > this.LLILLL && fAbs > fAbs2) {
                    return false;
                }
            }
        } else {
            this.LLILZ = motionEvent.getPointerId(0);
            this.LL = motionEvent.getX();
            this.LLILLJJLI = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLILZ) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLILZ = motionEvent.getPointerId(i);
            this.LL = motionEvent.getX(i);
            this.LLILLJJLI = motionEvent.getY(i);
        }
    }

    public C1319210kQx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = -1;
        this.LLILLL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
