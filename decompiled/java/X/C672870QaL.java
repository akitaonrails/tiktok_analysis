package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.style.ReplacementSpan;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672870QaL extends ReplacementSpan {
    public final Context LL;
    public final C672860QaK LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    public C672870QaL(Context context, C672860QaK c672860QaK) {
        this.LL = context;
        this.LLILLJJLI = c672860QaK;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iMeasureText = (int) paint.measureText(charSequence.subSequence(i, i2).toString());
        C672860QaK c672860QaK = this.LLILLJJLI;
        return iMeasureText + c672860QaK.LIZLLL + c672860QaK.LJI;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iMeasureText = (int) paint.measureText(charSequence.subSequence(i, i2).toString());
        C672860QaK c672860QaK = this.LLILLJJLI;
        int i6 = iMeasureText + c672860QaK.LIZLLL + c672860QaK.LJI;
        canvas.save();
        int i7 = (int) f;
        this.LLILLL = i7;
        this.LLILZ = i7 + i6;
        C672860QaK c672860QaK2 = this.LLILLJJLI;
        int i8 = i5 - i3;
        int i9 = (i8 - c672860QaK2.LIZIZ) / 2;
        int i10 = i3 + i9;
        int i11 = i5 - i9;
        int i12 = c672860QaK2.LIZJ;
        if (i12 > 0) {
            int i13 = (i8 - i12) / 2;
            this.LLILZIL = i3 + i13;
            this.LLILZLL = i5 - i13;
        } else {
            this.LLILZIL = i10;
            this.LLILZLL = i11;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.LLILLJJLI.LJFF);
        gradientDrawable.setColor(this.LLILLJJLI.LJII);
        gradientDrawable.setBounds(new Rect(this.LLILLL, i10, this.LLILZ, i11));
        gradientDrawable.draw(canvas);
        float fLIZIZ = this.LLILLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        float f2 = i4;
        canvas.drawText(charSequence.toString(), i, i2, fLIZIZ, f2, paint);
        canvas.restore();
        canvas.save();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.translate(fLIZIZ + paint.measureText(charSequence, i, i2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), ((((fontMetrics.descent + f2) + f2) + fontMetrics.ascent) / 2) - (this.LLILLJJLI.LJ / 2));
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(this.LL, R.raw.icon_x_mark);
        C672860QaK c672860QaK3 = this.LLILLJJLI;
        tuxIconDrawable.setBounds(new Rect(0, 0, c672860QaK3.LIZLLL, c672860QaK3.LJ));
        Context context = this.LL;
        int iIntValue = R.attr.a1k;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxIconDrawable.LJFF(iIntValue);
        tuxIconDrawable.draw(canvas);
        canvas.restore();
    }
}
