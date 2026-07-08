package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.11Xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19517911Xt extends RecyclerView {
    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public C19517911Xt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19517911Xt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
