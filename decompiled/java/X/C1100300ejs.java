package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0ejs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1100300ejs extends View {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public C1100300ejs(Context context) {
        this(context, null);
    }

    public C1100300ejs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (getVisibility() == 0) {
            int visibility = getVisibility();
            setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, this);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                suggestedMinimumWidth = size;
            }
        } else {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                suggestedMinimumHeight = size2;
            }
        } else {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }
}
