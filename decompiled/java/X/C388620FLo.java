package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0FLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388620FLo extends RecyclerView {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return this.LLILZ;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.LL;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return this.LLILLL;
    }

    public C388620FLo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZJ(float f, float f2) {
        this.LL = f;
        this.LLILLL = 0.0f;
        this.LLILLJJLI = f2;
        this.LLILZ = 0.0f;
        setHorizontalFadingEdgeEnabled(true);
        setVerticalFadingEdgeEnabled(true);
    }

    public C388620FLo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C418440Gaw.LIZIZ(10);
        this.LLILLJJLI = C418440Gaw.LIZIZ(10);
        this.LLILLL = C418440Gaw.LIZIZ(10);
        this.LLILZ = C418440Gaw.LIZIZ(10);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
