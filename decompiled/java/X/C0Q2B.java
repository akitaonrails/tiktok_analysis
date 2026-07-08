package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0Q2B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2B extends ViewGroup {
    public View LL;
    public View LLILLJJLI;

    public C0Q2B(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        View view = this.LL;
        if (view == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        View view2 = this.LLILLJJLI;
        measureChild(view, i, i2);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (view2 != null) {
            measureChild(view2, i, i2);
            int measuredWidth2 = view2.getMeasuredWidth() + measuredWidth;
            if (measuredWidth2 <= size) {
                C786410Ut5.LJLLLLLL(0, view2);
                measuredHeight = Math.max(measuredHeight, view2.getMeasuredHeight());
                measuredWidth = measuredWidth2;
            } else {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.LL;
        if (view == null) {
            return;
        }
        View view2 = this.LLILLJJLI;
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        if (view2 != null && view2.getVisibility() == 0) {
            int measuredHeight2 = view2.getMeasuredHeight();
            int measuredWidth2 = view2.getMeasuredWidth();
            int measuredHeight3 = (getMeasuredHeight() - measuredHeight) / 2;
            int measuredHeight4 = (getMeasuredHeight() - measuredHeight2) / 2;
            view.layout(0, measuredHeight3, measuredWidth, measuredHeight + measuredHeight3);
            view2.layout(measuredWidth, measuredHeight4, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight4);
            return;
        }
        int measuredHeight5 = getMeasuredHeight() - measuredHeight;
        view.layout(0, measuredHeight5, measuredWidth, measuredHeight + measuredHeight5);
    }
}
