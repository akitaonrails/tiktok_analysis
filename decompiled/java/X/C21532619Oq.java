package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexItem;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19Oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21532619Oq extends ViewGroup implements InterfaceC21533119Ov {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public Drawable LLIZ;
    public Drawable LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int[] LLJILJILJ;
    public SparseIntArray LLJILLL;
    public final C21533019Ou LLJJ;
    public List<C21532719Or> LLJJI;
    public final C21532919Ot LLJJIII;

    public C21532619Oq() {
        throw null;
    }

    @Override // X.InterfaceC21533119Ov
    public final int LJFF(View view) {
        return 0;
    }

    @Override // X.InterfaceC21533119Ov
    public final void LJIIJ(int i, View view) {
    }

    @Override // X.InterfaceC21533119Ov
    public final boolean LJIIJJI() {
        int i = this.LL;
        return i == 0 || i == 1;
    }

    public List<C21532719Or> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.LLJJI.size());
        for (C21532719Or c21532719Or : this.LLJJI) {
            if (c21532719Or.LJII - c21532719Or.LJIIIIZZ != 0) {
                arrayList.add(c21532719Or);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC21533119Ov
    public int getLargestMainSize() {
        Iterator<C21532719Or> it2 = this.LLJJI.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it2.hasNext()) {
            iMax = Math.max(iMax, it2.next().LJ);
        }
        return iMax;
    }

    @Override // X.InterfaceC21533119Ov
    public int getSumOfCrossSize() {
        int size = this.LLJJI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C21532719Or c21532719Or = (C21532719Or) ListProtector.get(this.LLJJI, i2);
            if (LJIJ(i2)) {
                i += LJIIJJI() ? this.LLJIJIL : this.LLJILJIL;
            }
            if (LJIJI(i2)) {
                i += LJIIJJI() ? this.LLJIJIL : this.LLJILJIL;
            }
            i += c21532719Or.LJI;
        }
        return i;
    }

    @Override // X.InterfaceC21533119Ov
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // X.InterfaceC21533119Ov
    public int getAlignContent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC21533119Ov
    public int getAlignItems() {
        return this.LLILZ;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.LLIZ;
    }

    public Drawable getDividerDrawableVertical() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC21533119Ov
    public int getFlexDirection() {
        return this.LL;
    }

    @Override // X.InterfaceC21533119Ov
    public List<C21532719Or> getFlexLinesInternal() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC21533119Ov
    public int getFlexWrap() {
        return this.LLILLJJLI;
    }

    public int getJustifyContent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC21533119Ov
    public int getMaxLine() {
        return this.LLILZLL;
    }

    public int getShowDividerHorizontal() {
        return this.LLJ;
    }

    public int getShowDividerVertical() {
        return this.LLJI;
    }

    @Override // X.InterfaceC21533119Ov
    public final void LIZ(C21532719Or c21532719Or) {
        if (LJIIJJI()) {
            if ((this.LLJI & 4) > 0) {
                int i = c21532719Or.LJ;
                int i2 = this.LLJILJIL;
                c21532719Or.LJ = i + i2;
                c21532719Or.LJFF += i2;
                return;
            }
            return;
        }
        if ((this.LLJ & 4) <= 0) {
            return;
        }
        int i3 = c21532719Or.LJ;
        int i4 = this.LLJIJIL;
        c21532719Or.LJ = i3 + i4;
        c21532719Or.LJFF += i4;
    }

    @Override // X.InterfaceC21533119Ov
    public final View LIZJ(int i) {
        return getChildAt(i);
    }

    @Override // X.InterfaceC21533119Ov
    public final View LJIIIIZZ(int i) {
        return LJIILLIIL(i);
    }

    public final View LJIILLIIL(int i) {
        if (i >= 0) {
            int[] iArr = this.LLJILJILJ;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
            return null;
        }
        return null;
    }

    public final boolean LJIJ(int i) {
        if (i >= 0 && i < this.LLJJI.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                C21532719Or c21532719Or = (C21532719Or) ListProtector.get(this.LLJJI, i2);
                if (c21532719Or.LJII - c21532719Or.LJIIIIZZ > 0) {
                    if (LJIIJJI()) {
                        if ((this.LLJ & 2) == 0) {
                            return false;
                        }
                        return true;
                    }
                    if ((this.LLJI & 2) != 0) {
                        return true;
                    }
                }
            }
            if (LJIIJJI()) {
                if ((this.LLJ & 1) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.LLJI & 1) == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean LJIJI(int i) {
        if (i < 0 || i >= this.LLJJI.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.LLJJI.size(); i2++) {
            C21532719Or c21532719Or = (C21532719Or) ListProtector.get(this.LLJJI, i2);
            if (c21532719Or.LJII - c21532719Or.LJIIIIZZ > 0) {
                return false;
            }
        }
        if (LJIIJJI()) {
            if ((this.LLJ & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.LLJI & 4) == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof FlexboxLayout$LayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof FlexboxLayout$LayoutParams) {
            return new FlexboxLayout$LayoutParams((FlexboxLayout$LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new FlexboxLayout$LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new FlexboxLayout$LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.LLIZLLLIL == null && this.LLIZ == null) {
            return;
        }
        if (this.LLJ == 0 && this.LLJI == 0) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i = this.LL;
        boolean z3 = false;
        boolean z4 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (layoutDirection == 1) {
                            z3 = true;
                        }
                        if (this.LLILLJJLI == 2) {
                            z3 = !z3;
                        }
                        LJIILIIL(canvas, z3, true);
                        return;
                    }
                    return;
                }
                if (layoutDirection != 1) {
                    z4 = false;
                }
                if (this.LLILLJJLI == 2) {
                    z4 = !z4;
                }
                LJIILIIL(canvas, z4, false);
                return;
            }
            if (layoutDirection != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LLILLJJLI == 2) {
                z3 = true;
            }
            LJIIL(canvas, z2, z3);
            return;
        }
        if (layoutDirection == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLJJLI == 2) {
            z3 = true;
        }
        LJIIL(canvas, z, z3);
    }

    public void setAlignContent(int i) {
        if (this.LLILZIL != i) {
            this.LLILZIL = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.LLILZ != i) {
            this.LLILZ = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.LLIZ) {
            return;
        }
        this.LLIZ = drawable;
        if (drawable != null) {
            this.LLJIJIL = drawable.getIntrinsicHeight();
        } else {
            this.LLJIJIL = 0;
        }
        if (this.LLIZ == null && this.LLIZLLLIL == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = drawable;
        if (drawable != null) {
            this.LLJILJIL = drawable.getIntrinsicWidth();
        } else {
            this.LLJILJIL = 0;
        }
        if (this.LLIZ == null && this.LLIZLLLIL == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.LL != i) {
            this.LL = i;
            requestLayout();
        }
    }

    @Override // X.InterfaceC21533119Ov
    public void setFlexLines(List<C21532719Or> list) {
        this.LLJJI = list;
    }

    public void setFlexWrap(int i) {
        if (this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.LLILLL != i) {
            this.LLILLL = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.LLILZLL != i) {
            this.LLILZLL = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.LLJ) {
            this.LLJ = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.LLJI) {
            this.LLJI = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FlexboxLayout$LayoutParams(getContext(), attributeSet);
    }

    public C21532619Oq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean LJIIZILJ(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewLJIILLIIL = LJIILLIIL(i - i3);
            if (viewLJIILLIIL != null && viewLJIILLIIL.getVisibility() != 8) {
                if (LJIIJJI()) {
                    if ((this.LLJI & 2) != 0) {
                        return true;
                    }
                    return false;
                }
                if ((this.LLJ & 2) != 0) {
                    return true;
                }
                return false;
            }
        }
        if (LJIIJJI()) {
            if ((this.LLJI & 1) != 0) {
                return true;
            }
            return false;
        }
        if ((this.LLJ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.LLJILLL == null) {
            this.LLJILLL = new SparseIntArray(getChildCount());
        }
        C21533019Ou c21533019Ou = this.LLJJ;
        SparseIntArray sparseIntArray = this.LLJILLL;
        int flexItemCount = c21533019Ou.LIZ.getFlexItemCount();
        if (sparseIntArray.size() == flexItemCount) {
            for (int i3 = 0; i3 < flexItemCount; i3++) {
                View viewLIZJ = c21533019Ou.LIZ.LIZJ(i3);
                if (viewLIZJ != null && ((FlexItem) viewLIZJ.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                    C21533019Ou c21533019Ou2 = this.LLJJ;
                    SparseIntArray sparseIntArray2 = this.LLJILLL;
                    int flexItemCount2 = c21533019Ou2.LIZ.getFlexItemCount();
                    this.LLJILJILJ = C21533019Ou.LJIIZILJ(flexItemCount2, c21533019Ou2.LJFF(flexItemCount2), sparseIntArray2);
                    break;
                }
            }
        } else {
            C21533019Ou c21533019Ou22 = this.LLJJ;
            SparseIntArray sparseIntArray22 = this.LLJILLL;
            int flexItemCount22 = c21533019Ou22.LIZ.getFlexItemCount();
            this.LLJILJILJ = C21533019Ou.LJIIZILJ(flexItemCount22, c21533019Ou22.LJFF(flexItemCount22), sparseIntArray22);
            break;
        }
        int i4 = this.LL;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid value for the flex direction is set: ");
                sbLIZ.append(this.LL);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLJJI.clear();
            C21532919Ot c21532919Ot = this.LLJJIII;
            c21532919Ot.LIZ = null;
            c21532919Ot.LIZIZ = 0;
            this.LLJJ.LIZIZ(c21532919Ot, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.LLJJI = this.LLJJIII.LIZ;
            this.LLJJ.LJII(i, i2, 0);
            this.LLJJ.LJI(i, i2, getPaddingLeft() + getPaddingRight());
            this.LLJJ.LJIJJ(0);
            LJIL(this.LL, i, i2, this.LLJJIII.LIZIZ);
            return;
        }
        this.LLJJI.clear();
        C21532919Ot c21532919Ot2 = this.LLJJIII;
        c21532919Ot2.LIZ = null;
        c21532919Ot2.LIZIZ = 0;
        this.LLJJ.LIZIZ(c21532919Ot2, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.LLJJI = this.LLJJIII.LIZ;
        this.LLJJ.LJII(i, i2, 0);
        if (this.LLILZ == 3) {
            for (C21532719Or c21532719Or : this.LLJJI) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < c21532719Or.LJII; i5++) {
                    View viewLJIILLIIL = LJIILLIIL(c21532719Or.LJIILJJIL + i5);
                    if (viewLJIILLIIL != null && viewLJIILLIIL.getVisibility() != 8) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLJIILLIIL.getLayoutParams();
                        if (this.LLILLJJLI != 2) {
                            iMax = Math.max(iMax, viewLJIILLIIL.getMeasuredHeight() + Math.max(c21532719Or.LJIIJJI - viewLJIILLIIL.getBaseline(), marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin);
                        } else {
                            iMax = Math.max(iMax, viewLJIILLIIL.getMeasuredHeight() + marginLayoutParams.topMargin + Math.max((c21532719Or.LJIIJJI - viewLJIILLIIL.getMeasuredHeight()) + viewLJIILLIIL.getBaseline(), marginLayoutParams.bottomMargin));
                        }
                    }
                }
                c21532719Or.LJI = iMax;
            }
        }
        this.LLJJ.LJI(i, i2, getPaddingTop() + getPaddingBottom());
        this.LLJJ.LJIJJ(0);
        LJIL(this.LL, i, i2, this.LLJJIII.LIZIZ);
    }

    public C21532619Oq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = -1;
        this.LLJJ = new C21533019Ou(this);
        this.LLJJI = new ArrayList();
        this.LLJJIII = new C21532919Ot();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout, i, 0);
        this.LL = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexDirection, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexWrap, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_justifyContent, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignItems, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignContent, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.LLJI = i2;
            this.LLJ = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.LLJI = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.LLJ = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // X.InterfaceC21533119Ov
    public final int LIZLLL(int i, int i2, View view) {
        int i3;
        int i4 = 0;
        if (LJIIJJI()) {
            if (LJIIZILJ(i, i2)) {
                i4 = 0 + this.LLJILJIL;
            }
            if ((this.LLJI & 4) > 0) {
                i3 = this.LLJILJIL;
            } else {
                return i4;
            }
        } else {
            if (LJIIZILJ(i, i2)) {
                i4 = 0 + this.LLJIJIL;
            }
            if ((this.LLJ & 4) <= 0) {
                return i4;
            }
            i3 = this.LLJIJIL;
        }
        return i4 + i3;
    }

    @Override // X.InterfaceC21533119Ov
    public final int LJII(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // X.InterfaceC21533119Ov
    public final int LJIIIZ(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    public final void LJIIL(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.LLJJI.size();
        for (int i3 = 0; i3 < size; i3++) {
            C21532719Or c21532719Or = (C21532719Or) ListProtector.get(this.LLJJI, i3);
            for (int i4 = 0; i4 < c21532719Or.LJII; i4++) {
                int i5 = c21532719Or.LJIILJJIL + i4;
                View viewLJIILLIIL = LJIILLIIL(i5);
                if (viewLJIILLIIL != null && viewLJIILLIIL.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLJIILLIIL.getLayoutParams();
                    if (LJIIZILJ(i5, i4)) {
                        if (z) {
                            left = viewLJIILLIIL.getRight() + marginLayoutParams.rightMargin;
                        } else {
                            left = (viewLJIILLIIL.getLeft() - marginLayoutParams.leftMargin) - this.LLJILJIL;
                        }
                        LJIILL(canvas, left, c21532719Or.LIZIZ, c21532719Or.LJI);
                    }
                    if (i4 == c21532719Or.LJII - 1 && (this.LLJI & 4) > 0) {
                        if (z) {
                            right = (viewLJIILLIIL.getLeft() - marginLayoutParams.leftMargin) - this.LLJILJIL;
                        } else {
                            right = viewLJIILLIIL.getRight() + marginLayoutParams.rightMargin;
                        }
                        LJIILL(canvas, right, c21532719Or.LIZIZ, c21532719Or.LJI);
                    }
                }
            }
            if (LJIJ(i3)) {
                if (z2) {
                    i2 = c21532719Or.LIZLLL;
                } else {
                    i2 = c21532719Or.LIZIZ - this.LLJIJIL;
                }
                LJIILJJIL(canvas, paddingLeft, i2, iMax);
            }
            if (LJIJI(i3) && (this.LLJ & 4) > 0) {
                if (z2) {
                    i = c21532719Or.LIZIZ - this.LLJIJIL;
                } else {
                    i = c21532719Or.LIZLLL;
                }
                LJIILJJIL(canvas, paddingLeft, i, iMax);
            }
        }
    }

    public final void LJIILIIL(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.LLJJI.size();
        for (int i3 = 0; i3 < size; i3++) {
            C21532719Or c21532719Or = (C21532719Or) ListProtector.get(this.LLJJI, i3);
            for (int i4 = 0; i4 < c21532719Or.LJII; i4++) {
                int i5 = c21532719Or.LJIILJJIL + i4;
                View viewLJIILLIIL = LJIILLIIL(i5);
                if (viewLJIILLIIL != null && viewLJIILLIIL.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLJIILLIIL.getLayoutParams();
                    if (LJIIZILJ(i5, i4)) {
                        if (z2) {
                            top = viewLJIILLIIL.getBottom() + marginLayoutParams.bottomMargin;
                        } else {
                            top = (viewLJIILLIIL.getTop() - marginLayoutParams.topMargin) - this.LLJIJIL;
                        }
                        LJIILJJIL(canvas, c21532719Or.LIZ, top, c21532719Or.LJI);
                    }
                    if (i4 == c21532719Or.LJII - 1 && (this.LLJ & 4) > 0) {
                        if (z2) {
                            bottom = (viewLJIILLIIL.getTop() - marginLayoutParams.topMargin) - this.LLJIJIL;
                        } else {
                            bottom = viewLJIILLIIL.getBottom() + marginLayoutParams.bottomMargin;
                        }
                        LJIILJJIL(canvas, c21532719Or.LIZ, bottom, c21532719Or.LJI);
                    }
                }
            }
            if (LJIJ(i3)) {
                if (z) {
                    i2 = c21532719Or.LIZJ;
                } else {
                    i2 = c21532719Or.LIZ - this.LLJILJIL;
                }
                LJIILL(canvas, i2, paddingTop, iMax);
            }
            if (LJIJI(i3) && (this.LLJI & 4) > 0) {
                if (z) {
                    i = c21532719Or.LIZ - this.LLJILJIL;
                } else {
                    i = c21532719Or.LIZJ;
                }
                LJIILL(canvas, i, paddingTop, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LLJILLL == null) {
            this.LLJILLL = new SparseIntArray(getChildCount());
        }
        C21533019Ou c21533019Ou = this.LLJJ;
        SparseIntArray sparseIntArray = this.LLJILLL;
        int flexItemCount = c21533019Ou.LIZ.getFlexItemCount();
        List<C21532819Os> listLJFF = c21533019Ou.LJFF(flexItemCount);
        C21532819Os c21532819Os = new C21532819Os();
        if (view != null && (layoutParams instanceof FlexItem)) {
            c21532819Os.LLILLJJLI = ((FlexItem) layoutParams).getOrder();
        } else {
            c21532819Os.LLILLJJLI = 1;
        }
        if (i != -1 && i != flexItemCount && i < c21533019Ou.LIZ.getFlexItemCount()) {
            c21532819Os.LL = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((C21532819Os) ListProtector.get(listLJFF, i2)).LL++;
            }
        } else {
            c21532819Os.LL = flexItemCount;
        }
        ((ArrayList) listLJFF).add(c21532819Os);
        this.LLJILJILJ = C21533019Ou.LJIIZILJ(flexItemCount + 1, listLJFF, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // X.InterfaceC21533119Ov
    public final void LJI(View view, int i, int i2, C21532719Or c21532719Or) {
        if (LJIIZILJ(i, i2)) {
            if (LJIIJJI()) {
                int i3 = c21532719Or.LJ;
                int i4 = this.LLJILJIL;
                c21532719Or.LJ = i3 + i4;
                c21532719Or.LJFF += i4;
                return;
            }
            int i5 = c21532719Or.LJ;
            int i6 = this.LLJIJIL;
            c21532719Or.LJ = i5 + i6;
            c21532719Or.LJFF += i6;
        }
    }

    public final void LJIILJJIL(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.LLIZ;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.LLJIJIL + i2);
        this.LLIZ.draw(canvas);
    }

    public final void LJIILL(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.LLIZLLLIL;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.LLJILJIL + i, i3 + i2);
        this.LLIZLLLIL.draw(canvas);
    }

    public final void LJIL(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid flex direction: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i4 = View.combineMeasuredStates(i4, 16777216);
                    }
                    iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Unknown width mode is set: ");
                    sbLIZ2.append(mode);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
            }
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i4 = View.combineMeasuredStates(i4, 256);
                    }
                    iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Unknown height mode is set: ");
                    sbLIZ3.append(mode2);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            } else {
                iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(int r30, int r31, int r32, int r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21532619Oq.LJIJJ(int, int, int, int, boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int layoutDirection = getLayoutDirection();
        int i5 = this.LL;
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (layoutDirection == 1) {
                            z4 = true;
                        }
                        if (this.LLILLJJLI == 2) {
                            z4 = !z4;
                        }
                        LJIJJLI(i, i2, i3, i4, z4, true);
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid flex direction is set: ");
                    sbLIZ.append(this.LL);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (layoutDirection == 1) {
                    z4 = true;
                }
                if (this.LLILLJJLI == 2) {
                    z4 = !z4;
                }
                LJIJJLI(i, i2, i3, i4, z4, false);
                return;
            }
            if (layoutDirection != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJIJJ(i, i2, i3, i4, z3);
            return;
        }
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJIJJ(i, i2, i3, i4, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(int r31, int r32, int r33, int r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21532619Oq.LJIJJLI(int, int, int, int, boolean, boolean):void");
    }
}
