package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DSC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DSC extends ViewGroup {
    public final int LL;

    public final void setTagList(String[] strArr) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        for (String str : strArr) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-2, -2));
            frameLayout.setPadding(C341940Daq.LIZ(4.0d), C341940Daq.LIZ(2.0d), C341940Daq.LIZ(4.0d), C341940Daq.LIZ(2.0d));
            frameLayout.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.bs_));
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setLines(1);
            textView.setTextColor(C960203pA.LIZ(R.attr.eh, getContext()));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView);
            addView(frameLayout);
        }
    }

    public C0DSC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C341940Daq.LIZ(4.0d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int measuredWidth;
        measureChildren(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = 0;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0 && mode != 1073741824) {
                size = 0;
            } else {
                size = View.MeasureSpec.getSize(i);
            }
        } else {
            int size3 = View.MeasureSpec.getSize(i);
            int childCount = getChildCount();
            size = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (i3 == 0) {
                    if (childAt.getMeasuredWidth() >= size3) {
                        break;
                    }
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    measuredWidth = childAt.getMeasuredWidth();
                    size += measuredWidth;
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth() + size;
                    int i4 = this.LL;
                    if (measuredWidth2 + i4 >= size3) {
                        break;
                    }
                    childAt.layout(i4 + size, 0, childAt.getMeasuredWidth() + size + this.LL, childAt.getMeasuredHeight());
                    size += this.LL;
                    measuredWidth = childAt.getMeasuredWidth();
                    size += measuredWidth;
                }
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0 || mode2 == 1073741824) {
                size2 = View.MeasureSpec.getSize(i2);
            }
        } else {
            int childCount2 = getChildCount();
            int iMax = 0;
            for (int i5 = 0; i5 < childCount2; i5++) {
                iMax = Math.max(iMax, getChildAt(0).getMeasuredHeight());
            }
            size2 = iMax;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int childCount2 = 0;
        int measuredWidth = 0;
        while (true) {
            if (childCount2 < childCount) {
                View childAt = getChildAt(childCount2);
                if (childCount2 == 0) {
                    if (childAt.getMeasuredWidth() >= i3) {
                        break;
                    }
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    measuredWidth += childAt.getMeasuredWidth();
                    childCount2++;
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth;
                    int i5 = this.LL;
                    if (measuredWidth2 + i5 >= i3) {
                        break;
                    }
                    childAt.layout(i5 + measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth + this.LL, childAt.getMeasuredHeight());
                    measuredWidth += this.LL;
                    measuredWidth += childAt.getMeasuredWidth();
                    childCount2++;
                }
            } else {
                childCount2 = getChildCount() - 1;
                break;
            }
        }
        int childCount3 = (getChildCount() - childCount2) - 1;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeViewsInLayout(childCount2 + 1, childCount3);
    }
}
