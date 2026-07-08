package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0UlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781560UlG extends C781550UlF {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public C781560UlG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C781560UlG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
