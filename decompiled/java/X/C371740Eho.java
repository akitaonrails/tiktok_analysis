package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Eho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371740Eho extends FrameLayout {
    public final int LL;

    public final int getMaxHeightPx() {
        return this.LL;
    }

    public C371740Eho(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxHeight});
        this.LL = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.LL
            if (r0 > 0) goto L8
            super.onMeasure(r5, r6)
            return
        L8:
            int r3 = android.view.View.MeasureSpec.getMode(r6)
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r1) goto L25
            if (r3 == 0) goto L1e
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 == r0) goto L25
        L1a:
            super.onMeasure(r5, r6)
            return
        L1e:
            int r0 = r4.LL
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            goto L1a
        L25:
            int r0 = r4.LL
            int r0 = java.lang.Math.min(r2, r0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C371740Eho.onMeasure(int, int):void");
    }
}
