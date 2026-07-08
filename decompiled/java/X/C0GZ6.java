package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GZ6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ6 extends ReplacementSpan {
    public final Context LL;
    public final C0GZ7 LLILLJJLI;
    public int LLILLL;
    public final float LLILZ = 22.0f;
    public final float LLILZIL = 15.0f;
    public final float LLILZLL = 17.0f;
    public final float LLIZ = 10.0f;
    public final float LLIZLLLIL = 5.0f;
    public String LLJ = "";

    public C0GZ6(Context context, C0GZ7 c0gz7) {
        this.LL = context;
        this.LLILLJJLI = c0gz7;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String strLIZIZ;
        int i3 = i + 1;
        if (i3 >= i2) {
            return 0;
        }
        paint.setTextSize(C12ES.LIZJ(this.LLILZIL - 2, this.LL));
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        paint.setTypeface(c444890HcV.getTypeface());
        this.LLILLL = (int) (paint.measureText(charSequence, i3, i2) + C12ES.LIZJ(this.LLILZ, this.LL));
        this.LLILLJJLI.LIZ();
        if (this.LLILLL >= this.LLILLJJLI.getMaxWidth()) {
            int maxWidth = this.LLILLJJLI.getMaxWidth();
            float fLIZJ = C12ES.LIZJ(this.LLILZ + 2.0f, this.LL);
            String string = charSequence.subSequence(i3, i2).toString();
            int iMeasureText = (int) (paint.measureText(string) + fLIZJ);
            if (maxWidth != 0 && iMeasureText > maxWidth) {
                while (true) {
                    strLIZIZ = "…";
                    if (string.length() == 1) {
                        break;
                    }
                    string = a0.LJJJJZI(string.length() - 1, string.length(), string).toString();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string);
                    sbLIZ.append("…");
                    if (((int) (paint.measureText(C2188811AlT.LIZIZ(sbLIZ)) + fLIZJ)) <= maxWidth && !Character.isHighSurrogate(string.charAt(string.length() - 1))) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(string);
                        sbLIZ2.append("…");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        break;
                    }
                }
            } else {
                strLIZIZ = "";
            }
            this.LLJ = strLIZIZ;
            this.LLILLL = (int) (paint.measureText(strLIZIZ) + C12ES.LIZJ(this.LLILZ, this.LL));
        }
        return this.LLILLL;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i + 1;
        if (i6 >= i2) {
            return;
        }
        if (this.LLILLL + f > this.LLILLJJLI.getMaxWidth()) {
            canvas.drawText("…", f, i4, paint);
            return;
        }
        if (charSequence.length() > i && charSequence.charAt(i) == 8230) {
            canvas.drawText("…", f, i4, paint);
            return;
        }
        paint.setAntiAlias(true);
        int color = paint.getColor();
        PathEffect pathEffect = paint.getPathEffect();
        paint.setTextSize(C12ES.LIZJ(this.LLILZIL, this.LL));
        paint.setColor(ColorProtector.parseColor("#0B161823"));
        paint.setPathEffect(new CornerPathEffect(C12ES.LIZJ(2.0f, this.LL)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = fontMetrics.top;
        float f3 = fontMetrics.bottom;
        float f4 = i4;
        float f5 = f4 + f2;
        canvas.drawRect(new RectF(f, f5, this.LLILLL + f, f4 + f3), paint);
        paint.setColor(color);
        float fLIZJ = C12ES.LIZJ(this.LLIZ, this.LL);
        float f6 = 2;
        float f7 = ((f3 - f2) - fLIZJ) / f6;
        float fLIZJ2 = C12ES.LIZJ(this.LLIZLLLIL, this.LL);
        Path path = new Path();
        float f8 = fLIZJ2 + f;
        float f9 = f5 + f7;
        path.moveTo(f8, f9);
        path.lineTo(f8, f9 + fLIZJ);
        path.lineTo(f8 + (0.86f * fLIZJ), f9 + (fLIZJ / f6));
        path.close();
        canvas.drawPath(path, paint);
        paint.setPathEffect(pathEffect);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        paint.setTypeface(c444890HcV.getTypeface());
        paint.setTextSize(C12ES.LIZJ(this.LLILZIL - f6, this.LL));
        if (TextUtils.isEmpty(this.LLJ)) {
            canvas.drawText(charSequence, i6, i2, f + C12ES.LIZJ(this.LLILZLL, this.LL), f4 - C12ES.LIZJ(1.0f, this.LL), paint);
        } else {
            canvas.drawText(this.LLJ, f + C12ES.LIZJ(this.LLILZLL, this.LL), f4 - C12ES.LIZJ(1.0f, this.LL), paint);
        }
    }
}
