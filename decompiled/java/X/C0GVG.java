package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0GVG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GVG extends ReplacementSpan {
    public final int[] LL;
    public final float[] LLILLJJLI;
    public final TextView LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public float LLILZLL;
    public float LLIZ = -1.0f;

    public C0GVG(int[] iArr, float[] fArr, TuxTextView tuxTextView, int i, int i2) {
        this.LL = iArr;
        this.LLILLJJLI = fArr;
        this.LLILLL = tuxTextView;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float fMeasureText = paint.measureText(charSequence, i, i2);
        this.LLILZLL = fMeasureText;
        return (int) fMeasureText;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (charSequence == null) {
            return;
        }
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        if (this.LLIZ < 0.0f) {
            return;
        }
        int color = paint.getColor();
        Shader shader = paint.getShader();
        Xfermode xfermode = paint.getXfermode();
        float f3 = i3;
        float f4 = i5;
        int iSaveLayer = canvas.saveLayer(f, f3, f + this.LLILZLL, f4, null);
        float f5 = this.LLILZLL / 0.8f;
        float fLIZ = ((C0DSB.LIZ(this.LLILZIL) + f5 + this.LLILZLL + C0DSB.LIZ(this.LLILZIL)) * this.LLIZ) + ((f - f5) - C0DSB.LIZ(this.LLILZIL));
        float f6 = (i5 - i3) / 2;
        float f7 = fLIZ + f5;
        int i6 = this.LLILZ;
        paint.setShader(new LinearGradient(fLIZ, f6, f7, f6, new int[]{0, i6, i6, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(fLIZ, f3, f7, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setShader(new LinearGradient(f, f3, f + this.LLILZLL, f4, this.LL, this.LLILLJJLI, Shader.TileMode.CLAMP));
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        canvas.restoreToCount(iSaveLayer);
        paint.setColor(color);
        paint.setShader(shader);
        paint.setXfermode(xfermode);
    }
}
