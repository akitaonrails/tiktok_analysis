package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0DWG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWG extends ViewOnAttachStateChangeListenerC20604515jv {
    public C0DWG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870910, Integer.MIN_VALUE));
    }

    public C0DWG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
