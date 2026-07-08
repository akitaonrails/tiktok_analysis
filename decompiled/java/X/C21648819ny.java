package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.19ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21648819ny extends GestureDetector.SimpleOnGestureListener {
    public final C21648919nz LL;
    public GestureDetector.SimpleOnGestureListener LLILLJJLI;

    public C21648819ny(C21648919nz c21648919nz) {
        this.LL = c21648919nz;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onDoubleTap(motionEvent);
        }
        return this.LL.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onDoubleTapEvent(motionEvent);
        }
        this.LL.onDoubleTapEvent(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onDown(motionEvent);
        }
        return this.LL.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onLongPress(motionEvent);
        }
        this.LL.onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onShowPress(motionEvent);
        }
        this.LL.onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onSingleTapConfirmed(motionEvent);
        }
        return this.LL.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onSingleTapUp(motionEvent);
        }
        return this.LL.onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onFling(motionEvent, motionEvent2, f, f2);
        }
        return this.LL.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LLILLJJLI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onScroll(motionEvent, motionEvent2, f, f2);
        }
        return this.LL.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
