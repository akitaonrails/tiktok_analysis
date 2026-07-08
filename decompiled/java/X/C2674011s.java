package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.011s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2674011s extends C16F5 {
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setStrokeWidth(C497740JfY.LIZIZ(0.5f));
        super.onDraw(canvas);
        getPaint().setStrokeWidth(0.0f);
        getPaint().setStyle(Paint.Style.FILL);
        super.onDraw(canvas);
    }

    public C2674011s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
