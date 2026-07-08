package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338800DPy extends ViewGroup {
    public final int LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public final List<List<View>> LLILZ;
    public final List<Integer> LLILZIL;

    public final int getMaxLines() {
        return this.LLILLL;
    }

    public final void setMaxLines(int i) {
        this.LLILLL = i;
    }

    public C338800DPy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLILLL = 3;
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        ((ArrayList) this.LLILZ).clear();
        ((ArrayList) this.LLILZIL).clear();
        List arrayList = new ArrayList();
        int childCount = getChildCount();
        int i5 = 0;
        int iMax = 0;
        int i6 = 1;
        int iMax2 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                if (mode == 1073741824) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i3 = mode;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, i3);
                int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
                if (mode2 == 1073741824) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i4 = mode2;
                }
                childAt.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(paddingTop, i4));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i5 + measuredWidth > (size - getPaddingLeft()) - getPaddingRight()) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(childAt);
                        i5 = measuredWidth + this.LL;
                        iMax = measuredHeight;
                    } else {
                        if (i6 >= this.LLILLL) {
                            break;
                        }
                        ((ArrayList) this.LLILZ).add(arrayList);
                        ((ArrayList) this.LLILZIL).add(Integer.valueOf(iMax));
                        iMax2 = Math.max(iMax2, i5 - this.LL);
                        i7 += iMax + this.LLILLJJLI;
                        i6++;
                        arrayList = C1697810uHb.LJIILJJIL(childAt);
                        i5 = measuredWidth + this.LL;
                        iMax = measuredHeight;
                    }
                } else {
                    arrayList.add(childAt);
                    i5 += measuredWidth + this.LL;
                    iMax = Math.max(iMax, measuredHeight);
                }
            }
        }
        if ((!arrayList.isEmpty()) && i6 <= this.LLILLL) {
            ((ArrayList) this.LLILZ).add(arrayList);
            ((ArrayList) this.LLILZIL).add(Integer.valueOf(iMax));
            iMax2 = Math.max(iMax2, i5 - this.LL);
            i7 += iMax;
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + iMax2 + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i7 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int paddingTop = getPaddingTop();
        getPaddingLeft();
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        int size = this.LLILZ.size();
        for (int i7 = 0; i7 < size; i7++) {
            List list = (List) ListProtector.get(this.LLILZ, i7);
            int iIntValue = ((Number) ListProtector.get(this.LLILZIL, i7)).intValue();
            if (z2) {
                paddingLeft = getWidth() - getPaddingRight();
            } else {
                paddingLeft = getPaddingLeft();
            }
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                View view = (View) ListProtector.get(list, i8);
                if (view.getVisibility() != 8) {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int i9 = ((iIntValue - measuredHeight) / 2) + paddingTop;
                    int i10 = measuredHeight + i9;
                    if (z2) {
                        int i11 = paddingLeft - measuredWidth;
                        i6 = paddingLeft - (measuredWidth + this.LL);
                        i5 = paddingLeft;
                        paddingLeft = i11;
                    } else {
                        i5 = paddingLeft + measuredWidth;
                        i6 = measuredWidth + this.LL + paddingLeft;
                    }
                    view.layout(paddingLeft, i9, i5, i10);
                    paddingLeft = i6;
                }
            }
            paddingTop += iIntValue + this.LLILLJJLI;
        }
    }
}
