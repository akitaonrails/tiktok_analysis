package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0lL7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354030lL7 extends ViewOnAttachStateChangeListenerC20604515jv {
    public float LLILZ;
    public float LLILZIL;

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getMaxFlingVelocity() {
        return (int) (this.LLILZIL * super.getMaxFlingVelocity());
    }

    public final void setMaxFlingVelocityFactor(float f) {
        this.LLILZIL = f;
    }

    public final void setTotalFlingVelocityFactor(float f) {
        this.LLILZ = f;
    }

    public C1354030lL7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        return super.fling(i, (int) (this.LLILZ * i2));
    }

    public C1354030lL7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = 1.0f;
        this.LLILZIL = 1.0f;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
