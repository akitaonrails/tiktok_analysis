package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Glp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425190Glp extends RecyclerView {
    public C425190Glp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        int iMax;
        if (i > 0) {
            iMax = Math.min(i, 5000);
        } else {
            iMax = Math.max(i, -5000);
        }
        return super.fling(iMax, i2);
    }

    public C425190Glp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
