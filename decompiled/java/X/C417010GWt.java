package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0GWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417010GWt extends TextView {
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        TextPaint paint = getPaint();
        paint.setColor(-1);
        canvas.rotate(90.0f, 0.0f, 0.0f);
        canvas.translate(0.0f, -(getWidth() / 3));
        canvas.drawText(getText().toString(), 0, getText().length(), 0.0f, 0.0f, (Paint) paint);
        canvas.restore();
    }

    public C417010GWt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
