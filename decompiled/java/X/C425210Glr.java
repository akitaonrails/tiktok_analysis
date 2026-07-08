package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Glr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425210Glr extends RecyclerView {
    public float LL;
    public float LLILLJJLI;

    public final float getFlingXRatio() {
        return this.LL;
    }

    public final float getFlingYRatio() {
        return this.LLILLJJLI;
    }

    public final void setFlingXRatio(float f) {
        this.LL = f;
    }

    public final void setFlingYRatio(float f) {
        this.LLILLJJLI = f;
    }

    public C425210Glr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        return super.fling((int) (i * this.LL), (int) (i2 * this.LLILLJJLI));
    }

    public C425210Glr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = 1.0f;
        this.LLILLJJLI = 1.0f;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
