package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0mNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393820mNI extends RelativeLayout {
    public int LL;
    public int LLILLJJLI;

    public final void setMaxHeight(int i) {
        this.LLILLJJLI = i;
        requestLayout();
    }

    public final void setMaxWidth(int i) {
        this.LL = i;
        requestLayout();
    }

    public C1393820mNI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BoundedRelativeLayout);
        this.LL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BoundedRelativeLayout_bounded_width, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BoundedRelativeLayout_bounded_height, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.LL;
        if (1 <= i3 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.LL, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.LLILLJJLI;
        if (1 <= i4 && i4 < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.LLILLJJLI, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
