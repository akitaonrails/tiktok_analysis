package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GZ8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ8 extends ReplacementSpan {
    public final Context LL;
    public final C0GZ7 LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1610));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1616));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1611));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1612));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1613));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1614));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1615));
    public String LLJIJIL = "";
    public Bitmap LLJILJIL;
    public Integer LLJILJILJ;

    public final float LIZ() {
        return ((Number) this.LLJ.getValue()).floatValue();
    }

    public C0GZ8(Context context, C0GZ7 c0gz7) {
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
        paint.setTextSize(((Number) this.LLIZ.getValue()).floatValue());
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        paint.setTypeface(c444890HcV.getTypeface());
        this.LLILLL = (int) (paint.measureText(charSequence, i3, i2) + ((Number) this.LLILZ.getValue()).floatValue());
        this.LLJIJIL = charSequence.subSequence(i3, i2).toString();
        this.LLILLJJLI.LIZ();
        if (this.LLILLL >= this.LLILLJJLI.getMaxWidth()) {
            int maxWidth = this.LLILLJJLI.getMaxWidth();
            float fFloatValue = ((Number) this.LLILZ.getValue()).floatValue();
            String string = charSequence.subSequence(i3, i2).toString();
            int iMeasureText = (int) (paint.measureText(string) + fFloatValue);
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
                    if (((int) (paint.measureText(C2188811AlT.LIZIZ(sbLIZ)) + fFloatValue)) <= maxWidth && !Character.isHighSurrogate(string.charAt(string.length() - 1))) {
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
            this.LLJIJIL = strLIZIZ;
            this.LLILLL = (int) (paint.measureText(strLIZIZ) + ((Number) this.LLILZ.getValue()).floatValue());
        }
        return this.LLILLL;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (i + 1 >= i2) {
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
        paint.setTextSize(((Number) this.LLILZLL.getValue()).floatValue());
        paint.setColor(ColorProtector.parseColor("#0B222435"));
        paint.setPathEffect(new CornerPathEffect(((Number) this.LLILZIL.getValue()).floatValue() * 4));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = fontMetrics.top;
        float f3 = fontMetrics.bottom;
        float f4 = i4;
        float f5 = f4 + f2;
        canvas.drawRect(new RectF(f, f5, this.LLILLL + f, f4 + f3), paint);
        paint.setColor(color);
        float fLIZ = ((f3 - f2) - LIZ()) / 2;
        Bitmap bitmap = this.LLJILJIL;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, ((Number) this.LLJI.getValue()).floatValue() + f, f5 + fLIZ, paint);
        } else {
            canvas.save();
            canvas.translate(((Number) this.LLJI.getValue()).floatValue() + f, f5 + fLIZ);
            Integer num = this.LLJILJILJ;
            if (num != null) {
                int iIntValue = num.intValue();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = iIntValue;
                c419910GdJ.LIZIZ = (int) LIZ();
                c419910GdJ.LIZJ = (int) LIZ();
                c419910GdJ.LIZLLL = Integer.valueOf(color);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LL);
                tuxIconDrawableLIZ.setBounds(0, 0, (int) LIZ(), (int) LIZ());
                tuxIconDrawableLIZ.draw(canvas);
            }
            canvas.restore();
        }
        paint.setPathEffect(pathEffect);
        paint.setTextSize(((Number) this.LLIZ.getValue()).floatValue());
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        paint.setTypeface(c444890HcV.getTypeface());
        canvas.drawText(this.LLJIJIL, f + ((Number) this.LLIZLLLIL.getValue()).floatValue(), f4 - ((Number) this.LLILZIL.getValue()).floatValue(), paint);
    }
}
