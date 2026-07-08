package androidx.appcompat.widget;

import X.C16GA;
import X.C21411918qr;
import X.C2188811AlT;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import u4.q0;

/* JADX INFO: loaded from: classes32.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public int[] LLJ;
    public int[] LLJI;
    public Drawable LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;

    public LinearLayoutCompat() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public C16GA generateDefaultLayoutParams() {
        int i = this.LLILZ;
        if (i == 0) {
            return new C16GA(-2, -2);
        }
        if (i == 1) {
            return new C16GA(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.LLILLJJLI < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.LLILLJJLI;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.LLILLJJLI == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.LLILLL;
        if (this.LLILZ == 1 && (i = this.LLILZIL & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.LLILZLL) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.LLILZLL;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public int getBaselineAlignedChildIndex() {
        return this.LLILLJJLI;
    }

    public Drawable getDividerDrawable() {
        return this.LLJIJIL;
    }

    public int getDividerPadding() {
        return this.LLJJ;
    }

    public int getDividerWidth() {
        return this.LLJILJIL;
    }

    public int getGravity() {
        return this.LLILZIL;
    }

    public int getOrientation() {
        return this.LLILZ;
    }

    public int getShowDividers() {
        return this.LLJILLL;
    }

    public float getWeightSum() {
        return this.LLIZ;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public C16GA generateLayoutParams(AttributeSet attributeSet) {
        return new C16GA(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public C16GA generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C16GA) {
            return new C16GA((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16GA((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16GA(layoutParams);
    }

    public final boolean LJII(int i) {
        if (i == 0) {
            if ((this.LLJILLL & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i == getChildCount()) {
            if ((this.LLJILLL & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.LLJILLL & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C16GA;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.LLJIJIL == null) {
            return;
        }
        int i2 = 0;
        if (this.LLILZ == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && LJII(i2)) {
                    LIZJ(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin) - this.LLJILJILJ);
                }
                i2++;
            }
            if (LJII(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.LLJILJILJ;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                }
                LIZJ(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && LJII(i2)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt3.getLayoutParams();
                if (z) {
                    left2 = childAt3.getRight() + layoutParams.rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - layoutParams.leftMargin) - this.LLJILJIL;
                }
                LIZLLL(canvas, left2);
            }
            i2++;
        }
        if (LJII(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (z) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.LLJILJIL;
                    right = left - i;
                }
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - layoutParams2.leftMargin;
                    i = this.LLJILJIL;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + layoutParams2.rightMargin;
                }
            }
            LIZLLL(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setBaselineAligned(boolean z) {
        this.LL = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.LLILLJJLI = i;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("base aligned child index out of range (0, ");
        sbLIZ.append(getChildCount());
        sbLIZ.append(")");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = drawable;
        boolean z = false;
        if (drawable != null) {
            this.LLJILJIL = drawable.getIntrinsicWidth();
            this.LLJILJILJ = drawable.getIntrinsicHeight();
        } else {
            this.LLJILJIL = 0;
            this.LLJILJILJ = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.LLJJ = i;
    }

    public void setGravity(int i) {
        if (this.LLILZIL != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.LLILZIL = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.LLILZIL;
        if ((8388615 & i3) != i2) {
            this.LLILZIL = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.LLIZLLLIL = z;
    }

    public void setOrientation(int i) {
        if (this.LLILZ != i) {
            this.LLILZ = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.LLJILLL) {
            requestLayout();
        }
        this.LLJILLL = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.LLILZIL;
        if ((i3 & 112) != i2) {
            this.LLILZIL = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.LLIZ = Math.max(0.0f, f);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZJ(Canvas canvas, int i) {
        this.LLJIJIL.setBounds(getPaddingLeft() + this.LLJJ, i, (getWidth() - getPaddingRight()) - this.LLJJ, this.LLJILJILJ + i);
        this.LLJIJIL.draw(canvas);
    }

    public final void LIZLLL(Canvas canvas, int i) {
        this.LLJIJIL.setBounds(i, getPaddingTop() + this.LLJJ, this.LLJILJIL + i, (getHeight() - getPaddingBottom()) - this.LLJJ);
        this.LLJIJIL.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = true;
        this.LLILLJJLI = -1;
        this.LLILZIL = 8388659;
        int[] iArr = R$styleable.LinearLayoutCompat;
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, iArr, i, 0);
        q0.LJIIZILJ(this, context, iArr, attributeSet, c21411918qrLJIILIIL.LIZIZ, i);
        int iLJII = c21411918qrLJIILIIL.LJII(R$styleable.LinearLayoutCompat_android_orientation, -1);
        if (iLJII >= 0) {
            setOrientation(iLJII);
        }
        int iLJII2 = c21411918qrLJIILIIL.LJII(R$styleable.LinearLayoutCompat_android_gravity, -1);
        if (iLJII2 >= 0) {
            setGravity(iLJII2);
        }
        boolean zLIZ = c21411918qrLJIILIIL.LIZ(R$styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!zLIZ) {
            setBaselineAligned(zLIZ);
        }
        this.LLIZ = c21411918qrLJIILIIL.LIZIZ.getFloat(R$styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.LLILLJJLI = c21411918qrLJIILIIL.LJII(R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.LLIZLLLIL = c21411918qrLJIILIIL.LIZ(R$styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(c21411918qrLJIILIIL.LJ(R$styleable.LinearLayoutCompat_divider));
        this.LLJILLL = c21411918qrLJIILIIL.LJII(R$styleable.LinearLayoutCompat_showDividers, 0);
        this.LLJJ = c21411918qrLJIILIIL.LIZLLL(R$styleable.LinearLayoutCompat_dividerPadding, 0);
        c21411918qrLJIILIIL.LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }
}
