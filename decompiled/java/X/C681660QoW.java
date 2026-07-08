package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0QoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681660QoW extends FrameLayout {
    public boolean LL;

    public final boolean getDismissKeyboardWhenTouch() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL && motionEvent != null && motionEvent.getAction() == 0) {
            C1440005kM.LIZ(new C681910Qov());
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setDismissKeyboardWhenTouch(boolean z) {
        this.LL = z;
    }

    public C681660QoW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
