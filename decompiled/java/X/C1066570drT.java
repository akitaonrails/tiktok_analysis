package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0drT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066570drT extends C16G0 {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C16G0, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C1066570drT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
