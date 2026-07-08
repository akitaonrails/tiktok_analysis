package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Gmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C425890Gmx extends ViewGroup {
    public final List<List<View>> LL;
    public final List<Integer> LLILLJJLI;
    public final List<Integer> LLILLL;
    public final int LLILZ;
    public List<View> LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final int getMaxLine() {
        return this.LLIZLLLIL;
    }

    public final int getSpaceH() {
        return this.LLIZ;
    }

    public final int getSpaceV() {
        return this.LLILZLL;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setMaxLine(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setSpaceH(int i) {
        this.LLIZ = i;
    }

    public final void setSpaceV(int i) {
        this.LLILZLL = i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public C425890Gmx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int iMax = 0;
        int i7 = 0;
        int i8 = 1;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 8) {
                if (i4 == childCount - 1) {
                    iMax = Math.max(i5, iMax);
                    i7 += i6;
                }
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i5 + measuredWidth > paddingLeft) {
                    iMax = Math.max(iMax, i5);
                    i3 = measuredWidth + this.LLIZ;
                    i7 += i6;
                    i8++;
                    int i9 = this.LLIZLLLIL;
                    if (i9 > 0 && i8 > i9) {
                        i6 = measuredHeight;
                        break;
                    }
                } else {
                    i3 = measuredWidth + this.LLIZ + i5;
                    measuredHeight = Math.max(i6, measuredHeight);
                }
                if (i4 == childCount - 1) {
                    iMax = Math.max(i3, iMax);
                    i7 += measuredHeight;
                    i6 = measuredHeight;
                    i5 = i3;
                } else {
                    i5 = i3;
                    i6 = measuredHeight;
                }
            }
            i4++;
        }
        if (i6 > 0) {
            i7 += ((i7 / i6) - 1) * this.LLILZLL;
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + iMax + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i7 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    public C425890Gmx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        this.LLILZ = -1;
        this.LLILZIL = new ArrayList();
        this.LLILZLL = 5;
        this.LLIZ = 10;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            this.LLILZ = 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLL).clear();
        this.LLILZIL.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = 1;
        int i6 = 1;
        int i7 = 0;
        int iMax = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (measuredWidth + i7 > (width - getPaddingLeft()) - getPaddingRight()) {
                    i6++;
                    int i9 = this.LLIZLLLIL;
                    if (i9 > 0 && i6 > i9) {
                        break;
                    }
                    ((ArrayList) this.LLILLJJLI).add(Integer.valueOf(iMax));
                    ((ArrayList) this.LL).add(this.LLILZIL);
                    ((ArrayList) this.LLILLL).add(Integer.valueOf(i7));
                    this.LLILZIL = new ArrayList();
                    iMax = measuredHeight;
                    i7 = 0;
                }
                i7 += measuredWidth + this.LLIZ;
                iMax = Math.max(iMax, measuredHeight);
                this.LLILZIL.add(childAt);
            }
        }
        ((ArrayList) this.LLILLJJLI).add(Integer.valueOf(iMax));
        ((ArrayList) this.LLILLL).add(Integer.valueOf(i7));
        ((ArrayList) this.LL).add(this.LLILZIL);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = ((ArrayList) this.LL).size();
        int i10 = 0;
        while (i10 < size) {
            List<View> list = (List) ListProtector.get(this.LL, i10);
            this.LLILZIL = list;
            int size2 = list.size();
            int iIntValue = ((Number) ListProtector.get(this.LLILLJJLI, i10)).intValue() + this.LLILZLL;
            int iIntValue2 = ((Number) ListProtector.get(this.LLILLL, i10)).intValue();
            int i11 = this.LLILZ;
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 == i5) {
                        paddingLeft = (width - (iIntValue2 + getPaddingLeft())) - getPaddingRight();
                        Collections.reverse(this.LLILZIL);
                    }
                } else {
                    paddingLeft = ((width - iIntValue2) / 2) + getPaddingLeft();
                }
            } else {
                paddingLeft = getPaddingLeft();
            }
            for (int i12 = 0; i12 < size2; i12++) {
                View view = (View) ListProtector.get(this.LLILZIL, i12);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i13 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i14 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i13, i14, i13 + view.getMeasuredWidth(), view.getMeasuredHeight() + i14);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.LLIZ;
                }
            }
            paddingTop += iIntValue;
            i10++;
            i5 = 1;
        }
    }
}
