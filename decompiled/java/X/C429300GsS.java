package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429300GsS extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getAction() == 0 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!zDispatchTouchEvent) {
            return true;
        }
        return zDispatchTouchEvent;
    }

    public C429300GsS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.S.getValue());
    }
}
