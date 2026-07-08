package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.11gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19563611gQ extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && getScrollState() == 2) {
            stopScroll();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C19563611gQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19563611gQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
