package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0Ehm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371720Ehm extends FrameLayout {
    public float LL;

    public final void setMaxWidth(float f) {
        this.LL = f;
    }

    public C371720Ehm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SearchMaxWidthLayout);
        this.LL = typedArrayObtainStyledAttributes.getDimension(R$styleable.SearchMaxWidthLayout_maxWidth, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.LL;
        if (f != 0.0f && size > f) {
            size = (int) f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2)));
    }
}
