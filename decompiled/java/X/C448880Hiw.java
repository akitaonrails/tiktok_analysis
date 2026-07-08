package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Hiw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C448880Hiw extends ReplacementSpan {
    public final C448860Hiu LL;
    public final C448890Hix LLILLJJLI;
    public final int LLILLL = 2;
    public final boolean LLILZ = false;

    public void LIZ(float f) {
    }

    public void LIZIZ(int i) {
    }

    public C448880Hiw(C448860Hiu c448860Hiu, C448890Hix c448890Hix) {
        this.LL = c448860Hiu;
        this.LLILLJJLI = c448890Hix;
        if (TextUtils.isEmpty(c448890Hix.LIZ) && c448860Hiu.LJIJI) {
            c448890Hix.LJIIJJI = true;
        }
        if (!c448890Hix.LIZ()) {
            c448890Hix.LIZIZ.LIZJ();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.LLILLJJLI.LIZ()) {
            Rect bounds = this.LLILLJJLI.getBounds();
            if (fontMetricsInt != null) {
                int i3 = -bounds.bottom;
                fontMetricsInt.ascent = i3;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i3;
                fontMetricsInt.bottom = 0;
            }
            return bounds.width();
        }
        if (this.LLILZ) {
            C448860Hiu c448860Hiu = this.LL;
            paint.setUnderlineText(c448860Hiu.LIZIZ);
            int i4 = c448860Hiu.LIZ;
            if (i4 != 0) {
                paint.setColor(i4);
            } else if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C448890Hix c448890Hix = this.LLILLJJLI;
        int iLIZ = AbstractC448960Hj4.LIZ(canvas, charSequence);
        float textSize = paint.getTextSize();
        c448890Hix.LJI = iLIZ;
        c448890Hix.LJII = textSize;
        if (c448890Hix.LJIIIIZZ) {
            c448890Hix.LIZIZ();
        }
        C448890Hix c448890Hix2 = this.LLILLJJLI;
        if (c448890Hix2.LIZ()) {
            int iHeight = i5 - c448890Hix2.getBounds().bottom;
            LIZ(Math.max(c448890Hix2.LJI - f, 0.0f));
            int iSave = canvas.save();
            try {
                int i6 = this.LLILLL;
                if (2 == i6) {
                    iHeight -= ((i5 - i3) - c448890Hix2.getBounds().height()) / 2;
                } else if (1 == i6) {
                    iHeight -= paint.getFontMetricsInt().descent;
                }
                canvas.translate(f, iHeight);
                c448890Hix2.draw(canvas);
                canvas.restoreToCount(iSave);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        float fDescent = (int) ((((i5 - i3) / 2) + i3) - (((paint.descent() + paint.ascent()) / 2.0f) + 0.5f));
        if (this.LLILZ) {
            C448860Hiu c448860Hiu = this.LL;
            paint.setUnderlineText(c448860Hiu.LIZIZ);
            int i7 = c448860Hiu.LIZ;
            if (i7 != 0) {
                paint.setColor(i7);
            } else if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        canvas.drawText(charSequence, i, i2, f, fDescent, paint);
    }
}
