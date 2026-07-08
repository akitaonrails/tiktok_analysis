package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416490GUt extends View {
    public final C01GW LL;
    public final float LLILLJJLI;
    public final List<PointF> LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public SweepGradient LLJ;
    public Matrix LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public RectF LLJILJILJ;

    private final ValueAnimator getAnimator() {
        return (ValueAnimator) this.LL.getValue();
    }

    private final Paint getArcPaint() {
        return (Paint) this.LLILZIL.getValue();
    }

    private final int[] getArchColorList() {
        return (int[]) this.LLILZLL.getValue();
    }

    private final TextPaint getMainTextPaint() {
        return (TextPaint) this.LLIZ.getValue();
    }

    private final Paint getPointPaint() {
        return (Paint) this.LLILZ.getValue();
    }

    private final TextPaint getSubTextPaint() {
        return (TextPaint) this.LLIZLLLIL.getValue();
    }

    public final void LIZ() {
        getAnimator().cancel();
    }

    public final void LIZIZ() {
        if (getAnimator().isRunning()) {
            return;
        }
        getAnimator().setRepeatCount(-1);
        getAnimator().addUpdateListener(new AUListenerS256S0100000_6(this, 42));
        getAnimator().start();
    }

    public final int getProgress() {
        return this.LLJILJIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (PointF pointF : this.LLILLL) {
            canvas.drawCircle(pointF.x, pointF.y, 4.0f, getPointPaint());
        }
        Matrix matrix = this.LLJI;
        if (matrix != null) {
            matrix.setRotate(this.LLJIJIL);
            SweepGradient sweepGradient = this.LLJ;
            if (sweepGradient != null) {
                sweepGradient.setLocalMatrix(matrix);
            }
        }
        canvas.drawArc(this.LLJILJILJ, -90.0f, (this.LLJILJIL / 100.0f) * 360.0f, false, getArcPaint());
        String strValueOf = String.valueOf(this.LLJILJIL);
        float fMeasureText = getMainTextPaint().measureText(strValueOf) + 2;
        float measuredWidth = ((getMeasuredWidth() - fMeasureText) - getSubTextPaint().measureText("%")) / 2.0f;
        float measuredHeight = ((getMeasuredHeight() + (getMainTextPaint().getFontMetrics().bottom - getMainTextPaint().getFontMetrics().top)) / 2.0f) - getMainTextPaint().getFontMetrics().bottom;
        canvas.drawText(strValueOf, measuredWidth, measuredHeight, getMainTextPaint());
        canvas.drawText("%", measuredWidth + fMeasureText, measuredHeight, getSubTextPaint());
    }

    public final void setProgress(int i) {
        int iLJ = C13LZ.LJ(i, 0, 99);
        if (this.LLJILJIL == iLJ) {
            return;
        }
        this.LLJILJIL = iLJ;
        invalidate();
    }

    public C416490GUt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(340));
        this.LLILLJJLI = C418440Gaw.LIZIZ(4);
        this.LLILLL = new ArrayList();
        this.LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 761));
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 759));
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 760));
        this.LLIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(341));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(342));
        this.LLJILJILJ = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ((ArrayList) this.LLILLL).clear();
        float fMin = (Math.min(getWidth(), getHeight()) / 2) - 4.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i5 = 0;
        do {
            double radians = Math.toRadians(((double) i5) * 22.5d);
            double d = fMin;
            ((ArrayList) this.LLILLL).add(new PointF((float) (((double) width) + (Math.cos(radians) * d)), (float) (((double) height) + (d * Math.sin(radians)))));
            i5++;
        } while (i5 < 16);
        float fMin2 = Math.min(getWidth(), getHeight()) / 2.0f;
        this.LLJ = new SweepGradient(fMin2, fMin2, getArchColorList(), (float[]) null);
        getArcPaint().setShader(this.LLJ);
        this.LLJI = new Matrix();
        LinearGradient linearGradient = new LinearGradient(C418440Gaw.LIZIZ(6), C418440Gaw.LIZIZ(10), C418440Gaw.LIZIZ(29), C418440Gaw.LIZIZ(24), C960203pA.LIZ(R.attr.ti, getContext()), C960203pA.LIZ(R.attr.tj, getContext()), Shader.TileMode.CLAMP);
        getMainTextPaint().setShader(linearGradient);
        getSubTextPaint().setShader(linearGradient);
        float fMin3 = (Math.min(i, i2) / 2) - (this.LLILLJJLI / 2);
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        this.LLJILJILJ = new RectF(f - fMin3, f2 - fMin3, f + fMin3, f2 + fMin3);
    }
}
