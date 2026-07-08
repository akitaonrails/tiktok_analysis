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
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GVE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GVE extends ReplacementSpan {
    public final TextView LL;
    public float LLILLJJLI;
    public float LLILLL;
    public final int[] LLILZ;
    public final float[] LLILZIL;

    public C0GVE(TuxTextView tuxTextView) {
        int iIntValue;
        this.LL = tuxTextView;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, tuxTextView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLILZ = new int[]{0, iIntValue, 0};
        this.LLILZIL = new float[]{0.0f, 0.5f, 1.0f};
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float fMeasureText = paint.measureText(charSequence, i, i2);
        this.LLILLL = fMeasureText;
        return (int) fMeasureText;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (charSequence == null) {
            return;
        }
        int color = paint.getColor();
        Shader shader = paint.getShader();
        Xfermode xfermode = paint.getXfermode();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        float f2 = this.LLILLL;
        float f3 = this.LLILLJJLI * f2;
        float f4 = iLIZIZ / 2;
        float f5 = f3 - f4;
        float f6 = f3 + f4;
        float f7 = i3;
        float f8 = i5;
        Canvas canvas2 = canvas;
        int iSaveLayer = canvas2.saveLayer(f, f7, f + f2, f8, null);
        paint.setColor(color);
        paint.setShader(null);
        paint.setXfermode(null);
        canvas2.drawText(charSequence, i, i2, f, i4, paint);
        paint.setAlpha(204);
        if (f6 > 0.0f && f5 < this.LLILLL) {
            float f9 = f + f5;
            float f10 = f + f6;
            paint.setShader(new LinearGradient(f9, 0.0f, f10, 0.0f, this.LLILZ, this.LLILZIL, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            if (f9 < f) {
                f9 = f;
            }
            float f11 = f + this.LLILLL;
            if (f10 <= f11) {
                f11 = f10;
            }
            canvas2 = canvas2;
            canvas2.drawRect(f9, f7, f11, f8, paint);
        }
        canvas2.restoreToCount(iSaveLayer);
        paint.setColor(color);
        paint.setShader(shader);
        paint.setXfermode(xfermode);
    }
}
