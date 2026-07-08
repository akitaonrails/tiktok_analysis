package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0Uy4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789500Uy4 extends ViewOnAttachStateChangeListenerC20604515jv {
    public boolean LLILZ;

    public final boolean getEnableIntercept() {
        return this.LLILZ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent) && this.LLILZ) {
            return true;
        }
        return false;
    }

    public final void setEnableIntercept(boolean z) {
        this.LLILZ = z;
    }

    public C789500Uy4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C789500Uy4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = true;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
