package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419020Gbs extends C1338750kwT {
    public View LLILLJJLI;
    public C419030Gbt LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    public C419020Gbs(Context context) {
        super(context, null, 0);
        setOrientation(0);
    }

    public static int LJ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = 0;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        int i3 = measuredHeight + i;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.bottomMargin;
        }
        return i3 + i2;
    }

    public static int LJFF(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = 0;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int measuredWidth = view.getMeasuredWidth();
        if (marginLayoutParams != null) {
            i = marginLayoutParams.leftMargin;
        } else {
            i = 0;
        }
        int i3 = measuredWidth + i;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.rightMargin;
        }
        return i3 + i2;
    }

    public final boolean LIZIZ(View view) {
        if (view.getVisibility() != 8 && view.getParent() == this) {
            return true;
        }
        return false;
    }

    public final void setLeftTopAligned(boolean z) {
        if (this.LLILZLL == z) {
            return;
        }
        this.LLILZLL = z;
        requestLayout();
    }

    public final void setRightFollowMiddle(boolean z) {
        if (this.LLILZIL == z) {
            return;
        }
        this.LLILZIL = z;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        View view = this.LLILLJJLI;
        Integer num = null;
        if (view == null || !LIZIZ(view)) {
            view = null;
        }
        C419030Gbt c419030Gbt = this.LLILLL;
        if (c419030Gbt == null || !LIZIZ(c419030Gbt)) {
            c419030Gbt = null;
        }
        View view2 = this.LLILZ;
        if (view2 == null || !LIZIZ(view2)) {
            view2 = null;
        }
        LIZLLL(paddingLeft, i2, view);
        int iLJFF = paddingLeft - LJFF(view);
        if (iLJFF < 0) {
            iLJFF = 0;
        }
        LIZLLL(iLJFF, i2, view2);
        int iLJFF2 = iLJFF - LJFF(view2);
        if (iLJFF2 < 0) {
            iLJFF2 = 0;
        }
        if (c419030Gbt != null) {
            if (this.LLILZIL) {
                int paddingLeft2 = (iLJFF2 - c419030Gbt.getPaddingLeft()) - c419030Gbt.getPaddingRight();
                if (paddingLeft2 < 0) {
                    paddingLeft2 = 0;
                }
                Integer numValueOf = Integer.valueOf(paddingLeft2);
                if (numValueOf != null && numValueOf.intValue() > 0) {
                    num = numValueOf;
                }
            }
            if (!Intrinsics.LJFF(c419030Gbt.LL, num)) {
                c419030Gbt.LL = num;
            }
        }
        LIZLLL(iLJFF2, i2, c419030Gbt);
        int paddingLeft3 = getPaddingLeft() + getPaddingRight() + LJFF(view) + LJFF(c419030Gbt) + LJFF(view2);
        int paddingTop = getPaddingTop() + getPaddingBottom() + Math.max(LJ(view), Math.max(LJ(c419030Gbt), LJ(view2)));
        if (mode == Integer.MIN_VALUE ? paddingLeft3 <= size : mode != 1073741824) {
            size = paddingLeft3;
        }
        setMeasuredDimension(size, LinearLayout.resolveSize(paddingTop, i2));
    }

    public final void LIZLLL(int i, int i2, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4;
        int i5;
        int i6;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int i7 = 0;
        if (marginLayoutParams != null) {
            i3 = marginLayoutParams.leftMargin;
            i4 = marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i8 = i3 + i4;
        int i9 = -2;
        if (marginLayoutParams != null) {
            i5 = marginLayoutParams.width;
        } else {
            i5 = -2;
        }
        int childMeasureSpec = LinearLayout.getChildMeasureSpec(iMakeMeasureSpec, i8, i5);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (marginLayoutParams != null) {
            i6 = marginLayoutParams.topMargin;
        } else {
            i6 = 0;
        }
        int i10 = paddingTop + i6;
        if (marginLayoutParams != null) {
            i7 = marginLayoutParams.bottomMargin;
        }
        int i11 = i10 + i7;
        if (marginLayoutParams != null) {
            i9 = marginLayoutParams.height;
        }
        view.measure(childMeasureSpec, LinearLayout.getChildMeasureSpec(i2, i11, i9));
    }

    public final void LJI(SmartImageView smartImageView, C419030Gbt c419030Gbt, C419040Gbu c419040Gbu) {
        if (smartImageView == null || smartImageView.getParent() != this) {
            smartImageView = null;
        }
        if (c419030Gbt == null || c419030Gbt.getParent() != this) {
            c419030Gbt = null;
        }
        if (c419040Gbu == null || c419040Gbu.getParent() != this) {
            c419040Gbu = null;
        }
        if (this.LLILLJJLI == smartImageView && this.LLILLL == c419030Gbt && this.LLILZ == c419040Gbu) {
            return;
        }
        this.LLILLJJLI = smartImageView;
        this.LLILLL = c419030Gbt;
        this.LLILZ = c419040Gbu;
        requestLayout();
    }

    public final int LIZJ(View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5;
        int i6;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i7 = 0;
        if (marginLayoutParams != null) {
            i4 = marginLayoutParams.leftMargin;
        } else {
            i4 = 0;
        }
        int i8 = i + i4;
        if (marginLayoutParams != null) {
            i5 = marginLayoutParams.topMargin;
        } else {
            i5 = 0;
        }
        int measuredHeight = i2 + i5;
        if (marginLayoutParams != null) {
            i6 = marginLayoutParams.bottomMargin;
        } else {
            i6 = 0;
        }
        int i9 = i3 - i6;
        if (view != this.LLILLJJLI || !this.LLILZLL) {
            measuredHeight += ((i9 - measuredHeight) - view.getMeasuredHeight()) / 2;
        }
        view.layout(i8, measuredHeight, view.getMeasuredWidth() + i8, view.getMeasuredHeight() + measuredHeight);
        int measuredWidth = i8 + view.getMeasuredWidth();
        if (marginLayoutParams != null) {
            i7 = marginLayoutParams.rightMargin;
        }
        return measuredWidth + i7;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view = this.LLILLJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null || !LIZIZ(view)) {
            view = null;
        }
        C419030Gbt c419030Gbt = this.LLILLL;
        if (c419030Gbt == null || !LIZIZ(c419030Gbt)) {
            c419030Gbt = null;
        }
        View view2 = this.LLILZ;
        if (view2 == null || !LIZIZ(view2)) {
            view2 = null;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        if (view != null) {
            paddingLeft = LIZJ(view, paddingLeft, paddingTop, paddingBottom);
        }
        if (c419030Gbt != null) {
            paddingLeft = LIZJ(c419030Gbt, paddingLeft, paddingTop, paddingBottom);
        }
        if (view2 != null) {
            if (!this.LLILZIL) {
                int measuredWidth = paddingRight - view2.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                }
                int i6 = 0;
                if (marginLayoutParams != null) {
                    i5 = marginLayoutParams.leftMargin;
                    i6 = marginLayoutParams.rightMargin;
                } else {
                    i5 = 0;
                }
                paddingLeft = Math.max(paddingLeft, measuredWidth - (i5 + i6));
            }
            LIZJ(view2, paddingLeft, paddingTop, paddingBottom);
        }
    }
}
