package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0UlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781570UlH extends RunnableC781530UlD {
    public boolean LLJ;

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return canScrollVertically(-1) ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return (this.LLJ || !canScrollVertically(1)) ? 0.0f : 1.0f;
    }

    public final boolean getPendingScroll() {
        return this.LLJ;
    }

    public final void setPendingScroll(boolean z) {
        this.LLJ = z;
    }

    public C781570UlH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C781570UlH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
