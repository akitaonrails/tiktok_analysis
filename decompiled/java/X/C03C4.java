package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.03C4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03C4 extends FrameLayout {
    public final int LL;

    public C03C4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.LL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LL, 1073741824));
    }

    public C03C4(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
    }
}
