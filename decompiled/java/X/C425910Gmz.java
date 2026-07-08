package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Gmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425910Gmz extends ViewGroup {
    public final List<List<View>> LL;
    public final List<Integer> LLILLJJLI;
    public final List<Integer> LLILLL;
    public List<View> LLILZ;
    public final List<View> LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    private final void setUpLineInfo(boolean z) {
        boolean z2;
        boolean z3;
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLL).clear();
        this.LLILZ.clear();
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        int iMax = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int i5 = this.LLIZLLLIL;
                if (1 <= i5 && i5 <= i4) {
                    break;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth2 + i2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (measuredWidth - getPaddingLeft()) - getPaddingRight()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i6 = this.LLJI;
                if (i6 > 0 && i3 >= i6) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 || z3) {
                    i++;
                    int i7 = this.LLJ;
                    if (1 <= i7 && i7 < i) {
                        break;
                    }
                    ((ArrayList) this.LLILLJJLI).add(Integer.valueOf(iMax));
                    ((ArrayList) this.LL).add(this.LLILZ);
                    ((ArrayList) this.LLILLL).add(Integer.valueOf(i2));
                    iMax = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    this.LLILZ = new ArrayList();
                    i2 = 0;
                    i3 = 0;
                }
                i2 += measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = Math.max(iMax, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.LLILZ.add(childAt);
                i3++;
            }
        }
        ((ArrayList) this.LLILLJJLI).add(Integer.valueOf(iMax));
        ((ArrayList) this.LLILLL).add(Integer.valueOf(i2));
        ((ArrayList) this.LL).add(this.LLILZ);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setCenterVertical(boolean z) {
        this.LLILZLL = z;
        invalidate();
    }

    public final void setGravity(int i) {
        this.LLIZ = i;
        invalidate();
    }

    public final void setMaxTagCount(int i) {
        this.LLIZLLLIL = i;
        requestLayout();
    }

    public final void setMaxTagLines(int i) {
        this.LLJ = i;
        requestLayout();
    }

    public final void setMaxTagPerLine(int i) {
        this.LLJI = i;
        requestLayout();
    }

    public final void setShowMore(boolean z) {
        if (this.LLJIJIL == z) {
            return;
        }
        this.LLJIJIL = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public C425910Gmz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
        this.LLJI = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlowLayout);
        this.LLIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.FlowLayout_flowGravity, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getInt(R$styleable.FlowLayout_flowMaxCount, -1);
        this.LLJ = typedArrayObtainStyledAttributes.getInt(R$styleable.FlowLayout_flowMaxLines, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        int i5 = 0;
        int iMax2 = 0;
        int i6 = 0;
        int i7 = 1;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int i8 = this.LLIZLLLIL;
                if (1 <= i8 && i8 <= i3) {
                    iMax = Math.max(i5, iMax);
                    i4 += iMax2;
                    break;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, View.MeasureSpec.getMode(i)), i2);
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i9 = i5 + measuredWidth;
                if (i9 > (size - getPaddingLeft()) - getPaddingRight()) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = this.LLJI;
                if (i10 > 0 && i6 >= i10) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    iMax2 = Math.max(iMax2, measuredHeight);
                    i6++;
                    i5 = i9;
                } else {
                    i7++;
                    int i11 = this.LLJ;
                    if (1 <= i11 && i11 < i7) {
                        iMax = Math.max(i5, iMax);
                        i4 += iMax2;
                        break;
                    } else {
                        iMax = Math.max(iMax, i5);
                        i4 += iMax2;
                        i5 = measuredWidth;
                        i6 = 1;
                        iMax2 = measuredHeight;
                    }
                }
                if (i3 == childCount - 1) {
                    iMax = Math.max(i5, iMax);
                    i4 += iMax2;
                }
            } else if (i3 == childCount - 1) {
                iMax = Math.max(i5, iMax);
                i4 += iMax2;
            }
            i3++;
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + iMax + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i4 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        View view;
        int paddingRight;
        setUpLineInfo(false);
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = ((ArrayList) this.LL).size();
        ((ArrayList) this.LLILZIL).clear();
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = this.LLJ;
            int i7 = 1;
            if (1 <= i6 && i6 <= i5) {
                break;
            }
            this.LLILZ = (List) ListProtector.get(this.LL, i5);
            int iIntValue = ((Number) ListProtector.get(this.LLILLJJLI, i5)).intValue();
            int iIntValue2 = ((Number) ListProtector.get(this.LLILLL, i5)).intValue();
            int i8 = this.LLIZ;
            if (getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i8 = -this.LLIZ;
            }
            if (i8 != -1) {
                if (i8 != 0) {
                    if (i8 == 1) {
                        int i9 = measuredWidth - iIntValue2;
                        if (getLayoutDirection() == 1) {
                            paddingRight = getPaddingLeft();
                        } else {
                            paddingRight = getPaddingRight();
                        }
                        paddingLeft = i9 - paddingRight;
                    }
                } else {
                    paddingLeft = ((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - iIntValue2) / 2) + getPaddingLeft();
                }
            } else {
                paddingLeft = getPaddingLeft();
            }
            int size2 = this.LLILZ.size();
            int i10 = 0;
            while (i10 < size2) {
                if (getLayoutDirection() == i7) {
                    List<View> list = this.LLILZ;
                    view = (View) ListProtector.get(list, (list.size() - i10) - i7);
                } else {
                    view = (View) ListProtector.get(this.LLILZ, i10);
                }
                if (view != null && view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i11 = marginLayoutParams.leftMargin + paddingLeft;
                    int measuredHeight = marginLayoutParams.topMargin + paddingTop;
                    if (this.LLILZLL) {
                        measuredHeight = ((((iIntValue - view.getMeasuredHeight()) / 2) + paddingTop) + marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
                    }
                    int measuredWidth2 = view.getMeasuredWidth() + i11;
                    if (measuredWidth2 > (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin) {
                        measuredWidth2 = (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin;
                    }
                    view.layout(i11, measuredHeight, measuredWidth2, view.getMeasuredHeight() + measuredHeight);
                    ((ArrayList) this.LLILZIL).add(view);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                i10++;
                i7 = 1;
            }
            paddingTop += iIntValue;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!((ArrayList) this.LLILZIL).contains(childAt)) {
                childAt.layout(0, 0, 0, 0);
            }
        }
    }
}
