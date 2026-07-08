package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0Ghi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422640Ghi extends LinearLayout {
    public Runnable LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Runnable runnable;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 0 && (runnable = this.LL) != null) {
            runnable.run();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDisallowInterceptTouchCallback(Runnable runnable) {
        this.LL = runnable;
    }

    public C422640Ghi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
