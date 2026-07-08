package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0DWC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWC extends ViewOnAttachStateChangeListenerC20604515jv {
    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return getLayoutDirection() == 1 ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return getLayoutDirection() == 1 ? 0.0f : 1.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C0DWC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DWC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
