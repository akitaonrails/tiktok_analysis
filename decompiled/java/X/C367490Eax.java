package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Eax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367490Eax extends View {
    public final void LIZ() {
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getVisibility();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            LIZ();
        }
    }

    public C367490Eax(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Paint();
        new LinkedHashMap();
    }
}
