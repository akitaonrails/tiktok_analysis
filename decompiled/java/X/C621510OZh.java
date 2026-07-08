package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0OZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621510OZh extends ViewOnAttachStateChangeListenerC20604515jv {
    public int LLILZ;

    public C621510OZh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final int getMaxHeight() {
        return this.LLILZ;
    }

    public final void setMaxHeight(int i) {
        this.LLILZ = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLILZ;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public C621510OZh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public /* synthetic */ C621510OZh(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
