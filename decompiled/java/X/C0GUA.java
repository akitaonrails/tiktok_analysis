package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GUA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUA extends LinearLayout {
    public C0GUA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136))) {
            setMeasuredDimension(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154)), getMeasuredHeight());
        }
    }
}
