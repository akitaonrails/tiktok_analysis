package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0GnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426250GnX extends ViewGroup {
    public PerformanceUserCardViewModel LL;

    public C426250GnX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = (View.MeasureSpec.getSize(i) - (((int) C12ES.LIZJ(1.0f, getContext())) * 3)) / 4;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        Iterator<View> it2 = new C09RD(this).iterator();
        while (it2.hasNext()) {
            it2.next().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(size));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iLIZJ = (int) C12ES.LIZJ(1.0f, getContext());
        int i5 = i3 - i;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i9 = i6 + measuredWidth;
            if (i9 > i5) {
                break;
            }
            childAt.layout(i6, 0, i9, measuredHeight);
            i6 += measuredWidth + iLIZJ;
            i7++;
        }
        int childCount2 = getChildCount() - i7;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeViewsInLayout(i7, childCount2);
    }
}
