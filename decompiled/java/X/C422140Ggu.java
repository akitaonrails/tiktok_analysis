package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Ggu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422140Ggu extends LinearLayout {
    public final int LL;

    public C422140Ggu(Context context) {
        super(context);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount;
        int childCount2;
        super.onMeasure(i, i2);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        Iterator<View> it2 = new C09RD(this).iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            if ((it2.next() instanceof InterfaceC422160Ggw) && (i3 = i3 + 1) < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        int i4 = 1;
        int paddingStart = getPaddingStart() + getPaddingEnd() + ((i3 - 1) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        int i5 = i - paddingStart;
        int iMax = 0;
        for (View view : new C09RD(this)) {
            if (view instanceof InterfaceC422160Ggw) {
                view.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824));
                iMax += Math.max(this.LL, view.getMeasuredWidth());
            }
        }
        if (getChildCount() == 0) {
            return;
        }
        if (i5 > iMax) {
            childCount = (i5 - iMax) / getChildCount();
        } else {
            childCount = 0;
        }
        if (getLayoutDirection() == 1) {
            childCount2 = getChildCount() - 1;
            i4 = -1;
        } else {
            childCount2 = 0;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            View childAt = getChildAt((i4 * i6) + childCount2);
            if (childAt instanceof InterfaceC422160Ggw) {
                int iMax2 = Math.max(this.LL, childAt.getMeasuredWidth()) + childCount;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.width = iMax2;
                C786410Ut5.W5(childAt, layoutParams);
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824));
            }
        }
        if (i5 < iMax) {
            i5 = iMax;
        }
        setMeasuredDimension(i5 + paddingStart, iLIZIZ);
    }
}
