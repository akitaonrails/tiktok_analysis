package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.16Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20742216Eq extends View {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public C20742216Eq(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setGuidelineBegin(int i) {
        C19ME c19me = (C19ME) getLayoutParams();
        c19me.guideBegin = i;
        C786410Ut5.n6(this, c19me);
    }

    public void setGuidelineEnd(int i) {
        C19ME c19me = (C19ME) getLayoutParams();
        c19me.guideEnd = i;
        C786410Ut5.n6(this, c19me);
    }

    public void setGuidelinePercent(float f) {
        C19ME c19me = (C19ME) getLayoutParams();
        c19me.guidePercent = f;
        C786410Ut5.n6(this, c19me);
    }

    public C20742216Eq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
