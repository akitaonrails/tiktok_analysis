package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FJH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJH extends TuxTextView {
    public final Paint LLJJJJ;
    public final Paint LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public final float LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fMin = (Math.min(getWidth(), getHeight()) / 2.0f) - (this.LLJJL / 2.0f);
        this.LLJJJJLIIL.set(width - fMin, height - fMin, width + fMin, height + fMin);
        canvas.drawArc(this.LLJJJJLIIL, -135.0f, 360.0f, false, this.LLJJJJ);
        int i2 = this.LLJJLIIIJLLLLLLLZ;
        if (i2 > 0 && (i = this.LLJL) > 0) {
            canvas.drawArc(this.LLJJJJLIIL, -135.0f, -((i / i2) * 360.0f), false, this.LLJJJJJIL);
        }
        super.onDraw(canvas);
    }

    public C0FJH(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.LLJJJJ = paint;
        Paint paint2 = new Paint(1);
        this.LLJJJJJIL = paint2;
        this.LLJJJJLIIL = new RectF();
        float fLIZJ = C12ES.LIZJ(2.0f, context);
        this.LLJJL = fLIZJ;
        this.LLJJLIIIJLLLLLLLZ = 1;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context);
        int iIntValue2 = numLIZJ != null ? numLIZJ.intValue() : 0;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, context);
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = -1;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fLIZJ);
        paint.setColor(iIntValue2);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fLIZJ);
        paint2.setColor(iIntValue);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }
}
