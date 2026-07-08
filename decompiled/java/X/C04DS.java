package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.04DS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04DS extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public C04DS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C04DS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
