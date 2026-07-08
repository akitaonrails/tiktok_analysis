package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0lXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362000lXy extends C0KFD {
    public final RecyclerView LL;
    public final GestureDetector LLILLJJLI;

    public C1362000lXy(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLJJLI = new GestureDetector(viewOnAttachStateChangeListenerC20604515jv.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.0lXz
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                if (this.LL.LL.findChildViewUnder(motionEvent.getX(), motionEvent.getY()) == null) {
                    this.LL.LL.performLongClick();
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (this.LL.LL.findChildViewUnder(motionEvent.getX(), motionEvent.getY()) == null) {
                    this.LL.LL.performClick();
                    return true;
                }
                return false;
            }
        });
    }

    @Override // X.InterfaceC21676019sM
    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
        return this.LLILLJJLI.onTouchEvent(motionEvent);
    }
}
