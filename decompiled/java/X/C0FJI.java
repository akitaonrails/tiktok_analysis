package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FJI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJI extends TuxTextView {
    public final Paint LLJJJJ;
    public final Paint LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public final RectF LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public final Paint LLJL;
    public float LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;

    public C0FJI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float height = (float) ((((double) getHeight()) / 2.0d) - (((double) this.LLJLILLLLZIIL) / 2.0d));
        RectF rectF = this.LLJJL;
        float f = this.LLJLL;
        canvas.drawRoundRect(rectF, f, f, this.LLJJJJ);
        RectF rectF2 = this.LLJJL;
        float f2 = this.LLJLL;
        canvas.drawRoundRect(rectF2, f2, f2, this.LLJJJJJIL);
        float f3 = 0;
        float f4 = this.LLJLIL;
        float f5 = 2;
        float f6 = this.LLJJLIIIJLLLLLLLZ;
        canvas.drawOval((f3 - (f4 / f5)) + f6, height + f6, ((f4 / f5) + f3) - f6, (this.LLJLILLLLZIIL + height) - f6, this.LLJL);
        float f7 = this.LLJLIL;
        float f8 = this.LLJJLIIIJLLLLLLLZ;
        canvas.drawArc((f3 - (f7 / f5)) + (f8 / f5), (f8 / f5) + height, (f3 + (f7 / f5)) - (f8 / f5), (this.LLJLILLLLZIIL + height) - (f8 / f5), -90.0f, 180.0f, false, this.LLJJJJJIL);
        float width = getWidth() - (this.LLJLIL / f5);
        float f9 = this.LLJJLIIIJLLLLLLLZ;
        float f10 = width + f9;
        float f11 = height + f9;
        float width2 = getWidth() + (this.LLJLIL / f5);
        float f12 = this.LLJJLIIIJLLLLLLLZ;
        canvas.drawOval(f10, f11, width2 - f12, (this.LLJLILLLLZIIL + height) - f12, this.LLJL);
        float width3 = getWidth() - (this.LLJLIL / f5);
        float f13 = this.LLJJLIIIJLLLLLLLZ;
        float width4 = getWidth() + (this.LLJLIL / f5);
        float f14 = this.LLJJLIIIJLLLLLLLZ;
        canvas.drawArc((f13 / f5) + width3, height + (f13 / f5), width4 - (f14 / f5), (height + this.LLJLILLLLZIIL) - (f14 / f5), 270.0f, -180.0f, false, this.LLJJJJJIL);
        super.onDraw(canvas);
    }

    public C0FJI(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJJJJ = new Paint(1);
        this.LLJJJJJIL = new Paint(1);
        this.LLJJJJLIIL = new RectF();
        this.LLJJL = new RectF();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LLJL = paint;
    }

    public final void LJJJJJ(float f, float f2, float f3, float f4) {
        int iIntValue;
        Paint paint = this.LLJJJJ;
        paint.setDither(true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.hg, getContext());
        int iIntValue2 = 0;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.LLJJJJJIL;
        paint2.setDither(true);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.fv, getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        paint2.setColor(iIntValue2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f4);
        this.LLJJLIIIJLLLLLLLZ = f4;
        setLayerType(2, null);
        this.LLJLIL = f;
        this.LLJLILLLLZIIL = f2;
        this.LLJLL = f3;
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.LLJJJJLIIL;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        float f = i3 - i;
        rectF.right = f;
        float f2 = i4 - i2;
        rectF.bottom = f2;
        RectF rectF2 = this.LLJJL;
        rectF2.left = 0.0f;
        rectF2.top = 0.0f;
        rectF2.right = f;
        rectF2.bottom = f2;
    }
}
