package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GXD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXD extends RelativeLayout {
    public final float LL;

    public C0GXD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SurveyMaxWidthView);
        this.LL = typedArrayObtainStyledAttributes.getDimension(R$styleable.SurveyMaxWidthView_maxWidth, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.LL;
        if (f != 0.0f && size > f) {
            size = (int) f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2)));
    }
}
