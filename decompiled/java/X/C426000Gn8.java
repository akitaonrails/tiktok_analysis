package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C426000Gn8 extends ViewGroup {
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;

    public boolean LIZ() {
        return this.LLILLL;
    }

    public int getItemSpacing() {
        return this.LLILLJJLI;
    }

    public int getLineSpacing() {
        return this.LL;
    }

    public int getRowCount() {
        return this.LLILZ;
    }

    public void setItemSpacing(int i) {
        this.LLILLJJLI = i;
    }

    public void setLineSpacing(int i) {
        this.LL = i;
    }

    public void setSingleLine(boolean z) {
        this.LLILLL = z;
    }

    public C426000Gn8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                if (paddingLeft + i6 + childAt.getMeasuredWidth() > paddingRight && !LIZ()) {
                    paddingLeft = getPaddingLeft();
                    i7 = this.LL + paddingTop;
                }
                int measuredWidth = paddingLeft + i6 + childAt.getMeasuredWidth();
                paddingTop = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft += i6 + i5 + childAt.getMeasuredWidth() + this.LLILLJJLI;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
            }
        }
        int paddingRight2 = i8 + getPaddingRight();
        int paddingBottom = paddingTop + getPaddingBottom();
        if (mode != Integer.MIN_VALUE) {
            i4 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i4 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != i4) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public C426000Gn8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FlowLayout, 0, 0);
        this.LL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_lineSpacing, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.LLILZ = 0;
            return;
        }
        this.LLILZ = 1;
        if (getLayoutDirection() == 1) {
            z2 = true;
            paddingLeft = getPaddingRight();
            paddingRight = getPaddingLeft();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingRight;
        int measuredWidth = paddingLeft;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.tt6, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                if (!this.LLILLL && measuredWidth2 > i5) {
                    i6 = this.LL + paddingTop;
                    this.LLILZ++;
                    measuredWidth = paddingLeft;
                }
                childAt.setTag(R.id.tt6, Integer.valueOf(this.LLILZ - 1));
                int i8 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                paddingTop = childAt.getMeasuredHeight() + i6;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, i6, (i5 - measuredWidth) - marginStart, paddingTop);
                } else {
                    childAt.layout(i8, i6, measuredWidth3, paddingTop);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.LLILLJJLI;
            }
        }
    }
}
