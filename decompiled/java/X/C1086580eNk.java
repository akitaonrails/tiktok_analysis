package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0eNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086580eNk extends C781550UlF {
    public int LLJILJIL;

    public final int getMaxHeight() {
        return this.LLJILJIL;
    }

    public final void setMaxHeight(int i) {
        this.LLJILJIL = i;
    }

    public C1086580eNk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLJILJIL;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public C1086580eNk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
