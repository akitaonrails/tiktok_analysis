package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419460Gca extends SmartImageView {
    public Float LLIZLLLIL;
    public Path LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    private final double getStartAngleNew() {
        return ((Number) this.LLJILJIL.getValue()).doubleValue();
    }

    private final double getSweepAngleNew() {
        return ((Number) this.LLJILJILJ.getValue()).doubleValue();
    }

    public final void LJIIIIZZ() {
        Float f = this.LLIZLLLIL;
        if (f != null) {
            float fFloatValue = f.floatValue() * getWidth();
            this.LLJ.reset();
            float f2 = 2;
            float f3 = fFloatValue / f2;
            RectF rectF = new RectF();
            rectF.left = (getWidth() - fFloatValue) / f2;
            rectF.right = (getWidth() + fFloatValue) / f2;
            rectF.top = getHeight() - fFloatValue;
            rectF.bottom = getHeight();
            Float f4 = this.LLIZLLLIL;
            if (f4 == null || f4.floatValue() >= 1.0f) {
                this.LLJ.addOval(rectF, Path.Direction.CW);
            } else {
                double d = 1.65f;
                float fSqrt = ((float) Math.sqrt(d)) * ((float) Math.sin(getA() + getB())) * f3;
                getHeight();
                float fSqrt2 = ((float) Math.sqrt(d)) * ((float) Math.cos(getA() + getB())) * f3;
                this.LLJ.moveTo(getWidth(), 0.0f);
                this.LLJ.lineTo(getWidth() - fSqrt2, fSqrt);
                this.LLJ.arcTo(rectF, (float) getStartAngleNew(), (float) getSweepAngleNew());
                this.LLJ.lineTo(fSqrt2, fSqrt);
                this.LLJ.lineTo(0.0f, 0.0f);
            }
            this.LLJ.close();
        }
    }

    public final float getA() {
        return ((Number) this.LLJI.getValue()).floatValue();
    }

    public final float getB() {
        return ((Number) this.LLJIJIL.getValue()).floatValue();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final Path getPath() {
        return this.LLJ;
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            canvas.clipPath(this.LLJ);
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setAvatarWidthRatio(float f) {
        this.LLIZLLLIL = Float.valueOf(f);
        LJIIIIZZ();
        invalidate();
    }

    public final void setPath(Path path) {
        this.LLJ = path;
    }

    public C419460Gca(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C419460Gca(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = new Path();
        this.LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(25));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(26));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 28));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 29));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJIIIIZZ();
        invalidate();
    }
}
