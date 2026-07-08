package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.011r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2673011r extends C16F5 {
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void setMaskBlurColor(int i) {
        setShadowLayer(10.0f, 0.0f, 0.0f, i);
    }

    public C2673011r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
