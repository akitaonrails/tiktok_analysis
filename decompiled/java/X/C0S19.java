package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0S19, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S19 extends FrameLayout {
    public C0S37 LL;
    public boolean LLILLJJLI;

    public final C0S37 getDetector() {
        return this.LL;
    }

    public final boolean getEnableDetectChildTouch() {
        return this.LLILLJJLI;
    }

    public C0S19(Context context) {
        super(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0S37 c0s37;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (this.LLILLJJLI && (c0s37 = this.LL) != null) {
            c0s37.LIZIZ.onTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL == null) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setDetector(C0S37 c0s37) {
        this.LL = c0s37;
    }

    public final void setEnableDetectChildTouch(boolean z) {
        this.LLILLJJLI = z;
    }
}
