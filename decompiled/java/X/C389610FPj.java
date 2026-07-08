package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0FPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C389610FPj extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    public C389610FPj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public C389610FPj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
