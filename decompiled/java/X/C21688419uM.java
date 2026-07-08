package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19uM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21688419uM extends GestureDetector.SimpleOnGestureListener {
    public boolean LL = true;
    public final /* synthetic */ C21688219uK LLILLJJLI;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C21688419uM(C21688219uK c21688219uK) {
        this.LLILLJJLI = c21688219uK;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewLJIIIZ;
        RecyclerView.ViewHolder childViewHolder;
        int i;
        if (this.LL && (viewLJIIIZ = this.LLILLJJLI.LJIIIZ(motionEvent)) != null && (childViewHolder = this.LLILLJJLI.LLJJIJI.getChildViewHolder(viewLJIIIZ)) != null) {
            C21688219uK c21688219uK = this.LLILLJJLI;
            AbstractC21688119uJ abstractC21688119uJ = c21688219uK.LLJILJILJ;
            RecyclerView recyclerView = c21688219uK.LLJJIJI;
            int iLJFF = abstractC21688119uJ.LJFF(recyclerView, childViewHolder);
            int layoutDirection = recyclerView.getLayoutDirection();
            int i2 = iLJFF & 3158064;
            if (i2 != 0) {
                int i3 = iLJFF & (~i2);
                if (layoutDirection == 0) {
                    i = i2 >> 2;
                } else {
                    int i4 = i2 >> 1;
                    i3 |= (-3158065) & i4;
                    i = (i4 & 3158064) >> 2;
                }
                iLJFF = i3 | i;
            }
            if ((16711680 & iLJFF) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i5 = this.LLILLJJLI.LLJILJIL;
                if (pointerId == i5) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i5);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    C21688219uK c21688219uK2 = this.LLILLJJLI;
                    c21688219uK2.LLILZ = x;
                    c21688219uK2.LLILZIL = y;
                    c21688219uK2.LLJ = 0.0f;
                    c21688219uK2.LLIZLLLIL = 0.0f;
                    if (c21688219uK2.LLJILJILJ.LJIIIIZZ()) {
                        this.LLILLJJLI.LJIILL(childViewHolder, 2);
                    }
                }
            }
        }
    }
}
