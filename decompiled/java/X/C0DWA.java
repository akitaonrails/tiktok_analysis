package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DWA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWA extends RecyclerView {
    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (C444960Hcc.LIZIZ()) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (C444960Hcc.LIZIZ()) {
            return 0.0f;
        }
        return super.getRightFadingEdgeStrength();
    }

    public C0DWA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DWA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
