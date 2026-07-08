package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.15nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20627315nb extends AbstractC20627515nd {
    public int LLJILLL;
    public int LLJJ;

    public C20627315nb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getSkeletonHeight() {
        return this.LLJJ;
    }

    public final int getSkeletonWidth() {
        return this.LLJILLL;
    }

    public final void setSkeletonHeight(int i) {
        this.LLJJ = i;
        requestLayout();
    }

    public final void setSkeletonWidth(int i) {
        this.LLJILLL = i;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = Integer.MIN_VALUE;
        if (mode == 1073741824) {
            mode = Integer.MIN_VALUE;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            i3 = mode2;
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i3));
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (LIZJ()) {
            int i4 = this.LLJILLL;
            if (i4 != -2) {
                if (i4 != -1) {
                    if (i4 != 0) {
                        measuredWidth = i4;
                    } else {
                        measuredWidth = measuredHeight;
                    }
                }
            } else {
                measuredWidth = measuredWidth2;
            }
            int i5 = this.LLJJ;
            if (i5 != -2) {
                if (i5 != -1) {
                    if (i5 != 0) {
                        measuredHeight = i5;
                    } else {
                        measuredHeight = getMeasuredWidth();
                    }
                }
            } else {
                measuredHeight = measuredHeight2;
            }
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        ((Drawable) ListProtector.get(getPlaceholders(), 0)).setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20627315nb(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LLJILLL = -2;
        this.LLJJ = -2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSkeletonView, 0, 0);
        setSkeletonWidth(typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.TuxSkeletonView_tux_skeletonWidth, -2));
        setSkeletonHeight(typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.TuxSkeletonView_tux_skeletonHeight, -2));
        typedArrayObtainStyledAttributes.recycle();
        LIZLLL(1);
    }
}
