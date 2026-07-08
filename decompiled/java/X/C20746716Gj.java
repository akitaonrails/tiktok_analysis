package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16Gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20746716Gj extends LinearLayout {
    public int LL;

    public final int getHeaderHeight() {
        return this.LL;
    }

    public C20746716Gj(Context context) {
        super(context);
        setOrientation(1);
    }

    public final void setHeaderHeight(int i) {
        this.LL = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMinimumHeight(View.MeasureSpec.getSize(i2));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        this.LL = 0;
        int childCount = getChildCount() - 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt instanceof InterfaceC1338650kwJ) || childAt.getMeasuredHeight() != getMinimumHeight()) {
                this.LL += childAt.getMeasuredHeight();
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (Intrinsics.LJFF(view, getChildAt(getChildCount() - 1))) {
            super.measureChildWithMargins(view, i, i2, View.MeasureSpec.makeMeasureSpec(getMinimumHeight(), Integer.MIN_VALUE), 0);
        } else {
            super.measureChildWithMargins(view, i, i2, i3, i4);
        }
    }
}
