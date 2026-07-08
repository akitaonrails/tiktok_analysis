package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJJ extends TuxTextView {
    public final Paint LLJJJJ;
    public final Paint LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public final RectF LLJJL;
    public final Paint LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public float LLJLIL;
    public final float LLJLILLLLZIIL;
    public final float LLJLL;
    public final float LLJLLIL;
    public final float LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;

    public final int getBgColor() {
        return this.LLJZIJLIL;
    }

    public final int getBorderColor() {
        return this.LLJZ;
    }

    public final int getTxtColor() {
        return this.LLL;
    }

    public C0FJJ(Context context) {
        int iIntValue;
        int iIntValue2;
        super(context, null, 0);
        Paint paint = new Paint(1);
        this.LLJJJJ = paint;
        Paint paint2 = new Paint(1);
        this.LLJJJJJIL = paint2;
        this.LLJJJJLIIL = new RectF();
        this.LLJJL = new RectF();
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LLJJLIIIJLLLLLLLZ = paint3;
        this.LLJL = C418440Gaw.LIZIZ(4);
        this.LLJLIL = C418440Gaw.LIZIZ(5);
        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
        this.LLJLILLLLZIIL = fLIZIZ;
        this.LLJLL = C418440Gaw.LIZIZ(2);
        this.LLJLLIL = 0.33333334f;
        this.LLJLLL = 0.8f;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.wp, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJZ = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.wn, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LLJZIJLIL = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ws, context);
        this.LLL = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
        setTuxFont(92);
        setLayerType(2, null);
        setTextColor(this.LLL);
        setGravity(17);
        setEllipsize(TextUtils.TruncateAt.END);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        paint.setDither(true);
        paint.setColor(this.LLJZ);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fLIZIZ);
        paint2.setDither(true);
        paint2.setColor(this.LLJZIJLIL);
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float height = (float) ((((double) getHeight()) / 2.0d) - (((double) this.LLJLIL) / 2.0d));
        RectF rectF = this.LLJJJJLIIL;
        float f = this.LLJLL;
        canvas.drawRoundRect(rectF, f, f, this.LLJJJJJIL);
        RectF rectF2 = this.LLJJL;
        float f2 = this.LLJLL;
        canvas.drawRoundRect(rectF2, f2, f2, this.LLJJJJ);
        float f3 = 0;
        float f4 = this.LLJL;
        float f5 = 2;
        canvas.drawOval(f3 - (f4 / f5), height, f3 + (f4 / f5), height + this.LLJLIL, this.LLJJLIIIJLLLLLLLZ);
        canvas.drawOval(getWidth() - (this.LLJL / f5), height, getWidth() + (this.LLJL / f5), height + this.LLJLIL, this.LLJJLIIIJLLLLLLLZ);
        float f6 = this.LLJL;
        canvas.drawArc(f3 - (f6 / f5), height, f3 + (f6 / f5), height + this.LLJLIL, 0.0f, 360.0f, false, this.LLJJJJ);
        canvas.drawArc(getWidth() - (this.LLJL / f5), height, getWidth() + (this.LLJL / f5), height + this.LLJLIL, 0.0f, 360.0f, false, this.LLJJJJ);
        super.onDraw(canvas);
    }

    public final void setBgColor(int i) {
        this.LLJZIJLIL = i;
        this.LLJJJJJIL.setColor(i);
    }

    public final void setBorderColor(int i) {
        this.LLJZ = i;
        this.LLJJJJ.setColor(i);
    }

    public final void setTxtColor(int i) {
        this.LLL = i;
        setTextColor(i);
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
        float f3 = this.LLJLILLLLZIIL;
        float f4 = 2;
        rectF2.left = (f3 / f4) + 0.0f;
        rectF2.top = (f3 / f4) + 0.0f;
        rectF2.right = f - (f3 / f4);
        rectF2.bottom = f2 - (f3 / f4);
        float f5 = f2 * this.LLJLLIL;
        this.LLJLIL = f5;
        this.LLJL = f5 * this.LLJLLL;
    }
}
