package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425640GmY extends FrameLayout {
    public final int LL;
    public final int LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    public C425640GmY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(0, R$styleable.ProfileNaviEditorLayout);
        this.LL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ProfileNaviEditorLayout_renderViewId, R.id.s3q);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ProfileNaviEditorLayout_panelViewId, R.id.p2u);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Exception {
        super.onMeasure(i, i2);
        View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            int iMax = Math.max(size2 / 2, size);
            this.LLILZIL = iMax;
            this.LLILZLL = (size2 - iMax) - C341940Daq.LIZ(18.0d);
            View view = this.LLILZ;
            if (view != null) {
                measureChild(view, View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLILZLL, 1073741824));
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new Exception("Need to define exact or at most values for width and height");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view != null) {
            if (view.getId() == this.LL) {
                this.LLILLL = view;
            } else {
                if (view.getId() != this.LLILLJJLI) {
                    return;
                }
                this.LLILZ = view;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.LLILLL;
        if (view != null) {
            int measuredHeight = (view.getMeasuredHeight() - this.LLILZIL) / 2;
            view.layout(0, -measuredHeight, view.getMeasuredWidth(), view.getMeasuredHeight() - measuredHeight);
        }
    }
}
