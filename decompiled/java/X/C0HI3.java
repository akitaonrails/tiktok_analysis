package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0HI3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HI3 extends RecyclerView {
    public C0HI3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0HI3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!canScrollVertically(-1)) {
            stopScroll();
        }
        if (!canScrollVertically(1)) {
            stopScroll();
        }
    }
}
