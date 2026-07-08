package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0RH0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RH0 extends FrameLayout {
    public View.OnTouchListener LL;
    public View LLILLJJLI;
    public View LLILLL;
    public C20286814Zm LLILZ;
    public boolean LLILZIL;

    public C0RH0() {
        throw null;
    }

    public final boolean getCanTouch() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL && this.LL != null) {
            return true;
        }
        C0SUM.LIZ.getClass();
        C0SUM.LIZ("FeedInterceptMultiTouchLayout onInterceptTouchEvent super.onTouchEvent");
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        View view;
        C20286814Zm c20286814Zm;
        if (((Boolean) C269780Ahk.LIZ.getValue()).booleanValue() && (c20286814Zm = this.LLILZ) != null && c20286814Zm.LJIJJ) {
            View view2 = c20286814Zm.LJJJJ;
            if (view2 != null) {
                view2.dispatchTouchEvent(motionEvent);
            }
            return true;
        }
        if (this.LLILZIL && (onTouchListener = this.LL) != null) {
            if (onTouchListener.onTouch(this, motionEvent)) {
                View view3 = this.LLILLL;
                if (view3 != null && view3.getVisibility() == 0) {
                    View view4 = this.LLILLL;
                    if (view4 != null) {
                        view4.dispatchTouchEvent(motionEvent);
                    }
                    C0SUM.LIZ.getClass();
                    C0SUM.LIZ("gradualFullScreenView?.dispatchTouchEvent");
                } else {
                    View view5 = this.LLILLJJLI;
                    if (view5 != null) {
                        view5.onTouchEvent(motionEvent);
                    }
                    C20286814Zm c20286814Zm2 = this.LLILZ;
                    if (c20286814Zm2 != null && c20286814Zm2.LJIJJ && (view = c20286814Zm2.LJJJJ) != null) {
                        view.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
                return true;
            }
            C0SUM.LIZ.getClass();
            C0SUM.LIZ("multiTouchListener?.onTouch = false");
            return true;
        }
        C0SUM.LIZ.getClass();
        C0SUM.LIZ("FeedInterceptMultiTouchLayout super.onTouchEvent");
        return super.onTouchEvent(motionEvent);
    }

    public final void setCanTouch(boolean z) {
        if (!z) {
            C0SUM.LIZ.getClass();
            C0SUM.LIZ("set canTouch false");
        }
        this.LLILZIL = z;
    }

    public final void setGradualFullScreenView(View view) {
        this.LLILLL = view;
    }

    public C0RH0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
    }
}
