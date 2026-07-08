package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0FJF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJF extends TuxTextView {
    public final Paint LLJJJJ;
    public final PorterDuffXfermode LLJJJJJIL;
    public final RectF LLJJJJLIIL;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.LLJJJJLIIL;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        rectF.bottom = getHeight();
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawRoundRect(this.LLJJJJLIIL, C418440Gaw.LIZIZ(2), C418440Gaw.LIZIZ(2), this.LLJJJJ);
        getPaint().setXfermode(this.LLJJJJJIL);
        super.onDraw(canvas);
        canvas.restore();
    }

    public C0FJF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.LLJJJJ = paint;
        this.LLJJJJLIIL = new RectF();
        paint.setColor(-1);
        this.LLJJJJJIL = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }
}
