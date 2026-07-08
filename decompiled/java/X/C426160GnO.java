package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426160GnO extends ViewGroup {
    public final List<List<View>> LL;
    public final List<Integer> LLILLJJLI;
    public final List<Integer> LLILLL;
    public List<View> LLILZ;
    public final List<View> LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public View LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public Function0<Unit> LLJILJILJ;

    public C426160GnO(Context context) {
        this(context, null, 6);
    }

    public C426160GnO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final int getMaxTagCount() {
        return this.LLIZ;
    }

    private final void setUpLineInfo(boolean z) {
        int size;
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLL).clear();
        this.LLILZ.clear();
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        this.LLJIJIL = z;
        int i = 0;
        int measuredWidth2 = 0;
        int iMax = 0;
        int i2 = 1;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && childAt != this.LLJI) {
                int i3 = this.LLIZ;
                if (1 <= i3 && i3 <= i) {
                    break;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth3 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth3 + measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (measuredWidth - getPaddingLeft()) - getPaddingRight()) {
                    i2++;
                    int i4 = this.LLIZLLLIL;
                    if (1 <= i4 && i4 < i2) {
                        View view = this.LLJI;
                        if (z && view != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                            measuredWidth2 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                            iMax = Math.max(iMax, view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
                            this.LLILZ.add(view);
                            if (measuredWidth2 > (measuredWidth - getPaddingLeft()) - getPaddingRight() && (size = this.LLILZ.size()) > 1) {
                                int i5 = size - 2;
                                View view2 = (View) ListProtector.get(this.LLILZ, i5);
                                if (view2 != null) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                    measuredWidth2 -= (view2.getMeasuredWidth() + marginLayoutParams3.leftMargin) + marginLayoutParams3.rightMargin;
                                }
                                ListProtector.remove(this.LLILZ, i5);
                            }
                        } else {
                            this.LLJIJIL = true;
                        }
                    } else {
                        ((ArrayList) this.LLILLJJLI).add(Integer.valueOf(iMax));
                        ((ArrayList) this.LL).add(this.LLILZ);
                        ((ArrayList) this.LLILLL).add(Integer.valueOf(measuredWidth2));
                        iMax = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + measuredHeight;
                        this.LLILZ = new ArrayList();
                        if (z && i2 == this.LLIZLLLIL && this.LLJI != null) {
                            measuredWidth = getWidth() - this.LLJI.getMeasuredWidth();
                        }
                        measuredWidth2 = 0;
                    }
                }
                measuredWidth2 += measuredWidth3 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = Math.max(iMax, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.LLILZ.add(childAt);
            }
            i++;
        }
        ((ArrayList) this.LLILLJJLI).add(Integer.valueOf(iMax));
        ((ArrayList) this.LLILLL).add(Integer.valueOf(measuredWidth2));
        ((ArrayList) this.LL).add(this.LLILZ);
        if (!z && this.LLJ && this.LLJIJIL && this.LLJI != null) {
            setUpLineInfo(true);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setChildHiddenCallback(Function0<Unit> function0) {
        this.LLJILJILJ = function0;
    }

    public final void setGravity(int i) {
        this.LLILZLL = i;
        invalidate();
    }

    public final void setMaxTagCount(int i) {
        this.LLIZ = i;
        requestLayout();
    }

    public final void setMaxTagLines(int i) {
        this.LLIZLLLIL = i;
        requestLayout();
    }

    public final void setShowMore(boolean z) {
        if (this.LLJ == z) {
            return;
        }
        this.LLJ = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        this.LLJILJIL = false;
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        int i5 = 0;
        int iMax2 = 0;
        int i6 = 1;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && childAt != this.LLJI) {
                int i7 = this.LLIZ;
                if (1 <= i7 && i7 <= i3) {
                    iMax = Math.max(i5, iMax);
                    i4 += iMax2;
                    this.LLJILJIL = true;
                    break;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, View.MeasureSpec.getMode(i)), i2);
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i8 = i5 + measuredWidth;
                if (i8 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i6++;
                    int i9 = this.LLIZLLLIL;
                    if (1 <= i9 && i9 < i6) {
                        iMax = Math.max(i5, iMax);
                        i4 += iMax2;
                        this.LLJILJIL = true;
                        break;
                    } else {
                        iMax = Math.max(iMax, i5);
                        i4 += iMax2;
                        i5 = measuredWidth;
                        iMax2 = measuredHeight;
                    }
                } else {
                    iMax2 = Math.max(iMax2, measuredHeight);
                    i5 = i8;
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
        View view = this.LLJI;
        if (view != null) {
            measureChild(view, i, i2);
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + iMax + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i4 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C426160GnO(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlowLayout);
        this.LLILZLL = typedArrayObtainStyledAttributes.getInt(R$styleable.FlowLayout_flowGravity, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.FlowLayout_flowMaxCount, -1);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getInt(R$styleable.FlowLayout_flowMaxLines, -1);
        typedArrayObtainStyledAttributes.recycle();
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
            int i6 = this.LLIZLLLIL;
            int i7 = 1;
            if (1 <= i6 && i6 <= i5) {
                break;
            }
            this.LLILZ = (List) ListProtector.get(this.LL, i5);
            int iIntValue = ((Number) ListProtector.get(this.LLILLJJLI, i5)).intValue();
            int iIntValue2 = ((Number) ListProtector.get(this.LLILLL, i5)).intValue();
            int i8 = this.LLILZLL;
            if (getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i8 = -this.LLILZLL;
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
                    int i12 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth2 = view.getMeasuredWidth() + i11;
                    if (measuredWidth2 > (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin) {
                        measuredWidth2 = (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin;
                    }
                    view.layout(i11, i12, measuredWidth2, view.getMeasuredHeight() + i12);
                    ((ArrayList) this.LLILZIL).add(view);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                i10++;
                i7 = 1;
            }
            paddingTop += iIntValue;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!((ArrayList) this.LLILZIL).contains(childAt)) {
                childAt.layout(0, 0, 0, 0);
            }
        }
        if (this.LLJILJIL) {
            HandlerHook.viewPost(this, new ARunnableS106S0100000_6((Object) this, 33));
        }
    }
}
