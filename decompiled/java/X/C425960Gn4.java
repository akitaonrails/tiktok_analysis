package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425960Gn4 extends ViewGroup {
    public final List<List<View>> LL;
    public final List<Integer> LLILLJJLI;
    public final List<Integer> LLILLL;
    public List<View> LLILZ;
    public final List<View> LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public Function0<Unit> LLJIJIL;
    public Function1<? super Integer, Unit> LLJILJIL;
    public int LLJILJILJ;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final int getLineNumNeedShow() {
        return this.LLJILJILJ;
    }

    public final int getMaxTagCount() {
        return this.LLIZ;
    }

    private final void setUpLineInfo(boolean z) {
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLL).clear();
        this.LLILZ.clear();
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        int i = 0;
        int iMax = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int i4 = this.LLIZ;
                if (1 <= i4 && i4 <= i3) {
                    break;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth2 + i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (measuredWidth - getPaddingLeft()) - getPaddingRight()) {
                    i2++;
                    int i5 = this.LLIZLLLIL;
                    if (1 <= i5 && i5 < i2) {
                        break;
                    }
                    ((ArrayList) this.LLILLJJLI).add(Integer.valueOf(iMax));
                    ((ArrayList) this.LL).add(this.LLILZ);
                    ((ArrayList) this.LLILLL).add(Integer.valueOf(i));
                    iMax = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + measuredHeight;
                    this.LLILZ = new ArrayList();
                    i = 0;
                }
                i += measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = Math.max(iMax, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.LLILZ.add(childAt);
            }
        }
        ((ArrayList) this.LLILLJJLI).add(Integer.valueOf(iMax));
        ((ArrayList) this.LLILLL).add(Integer.valueOf(i));
        ((ArrayList) this.LL).add(this.LLILZ);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setChildHiddenCallback(Function0<Unit> function0) {
        this.LLJIJIL = function0;
    }

    public final void setGravity(int i) {
        this.LLILZLL = i;
        invalidate();
    }

    public final void setLineCurrentCallback(Function1<? super Integer, Unit> function1) {
        this.LLJILJIL = function1;
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

    public C425960Gn4(Context context, AttributeSet attributeSet) {
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

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        this.LLJI = false;
        ?? r2 = 1;
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
            if (childAt.getVisibility() != 8) {
                int i7 = this.LLIZ;
                if (r2 <= i7 && i7 <= i3) {
                    iMax = Math.max(i5, iMax);
                    i4 += iMax2;
                    this.LLJI = r2;
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
                        this.LLJI = true;
                        break;
                    } else {
                        iMax = Math.max(iMax, i5);
                        i4 += iMax2;
                        iMax2 = measuredHeight;
                        i5 = measuredWidth;
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
            r2 = 1;
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + iMax + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i4 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x013c, code lost:
    
        continue;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C425960Gn4.onLayout(boolean, int, int, int, int):void");
    }
}
