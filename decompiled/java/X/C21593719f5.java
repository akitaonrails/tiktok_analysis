package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19f5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21593719f5 extends View {
    public static Path LLJJJJLIIL;
    public final int LL;
    public final int LLILLJJLI;
    public final double LLILLL;
    public final double LLILZ;
    public final double LLILZIL;
    public final double LLILZLL;
    public final double LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final int[] LLJILJIL;
    public float LLJILJILJ;
    public final float[] LLJILLL;
    public final long LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    private final ValueAnimator getAnimator() {
        return (ValueAnimator) this.LLJJJJJIL.getValue();
    }

    private final Matrix getColorMatrix() {
        return (Matrix) this.LLJIJIL.getValue();
    }

    private final Matrix getIconMatrix() {
        return (Matrix) this.LLJI.getValue();
    }

    private final float getIconScaleBackHeight() {
        return ((Number) this.LLJJJJ.getValue()).floatValue();
    }

    private final float getIconScaleBackWidth() {
        return ((Number) this.LLJJJIL.getValue()).floatValue();
    }

    private final Paint getPaint() {
        return (Paint) this.LLIZLLLIL.getValue();
    }

    private final Path getPath() {
        return (Path) this.LLJ.getValue();
    }

    public final float getAnimateRatio() {
        return ((Number) this.LLJJIJI.getValue()).floatValue();
    }

    public final long getAnimateTotalDuration() {
        return ((Number) this.LLJJIII.getValue()).longValue();
    }

    public final float getEndValue() {
        return ((Number) this.LLJJIJIIJIL.getValue()).floatValue();
    }

    public final float getIconScaleHeight() {
        return ((Number) this.LLJJJ.getValue()).floatValue();
    }

    public final float getIconScaleWidth() {
        return ((Number) this.LLJJIJIL.getValue()).floatValue();
    }

    public final long getPauseDuration() {
        return ((Number) this.LLJJI.getValue()).longValue();
    }

    public final void LIZ() {
        if (getAnimator().isRunning()) {
            getAnimator().cancel();
            this.LLJILJILJ = -1.0f;
        }
    }

    public final void LIZIZ() {
        if (getVisibility() != 0 || getAnimator().isRunning()) {
            return;
        }
        getAnimator().start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    public final void LIZJ(float f) {
        if (this.LLJILJILJ == f) {
            return;
        }
        this.LLJILJILJ = f;
        float f2 = (float) (this.LLILZIL * ((double) f));
        Matrix matrix = new Matrix();
        matrix.setRotate(-((float) this.LLILLL), 0.0f, 0.0f);
        matrix.postTranslate(-f2, 0.0f);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) this.LLILZ, 0.0f, this.LLJILJIL, this.LLJILLL, Shader.TileMode.CLAMP);
        linearGradient.setLocalMatrix(matrix);
        getPaint().setShader(linearGradient);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.concat(getIconMatrix());
        canvas.scale(getIconScaleWidth(), getIconScaleHeight());
        canvas.clipPath(getPath());
        canvas.scale(getIconScaleBackWidth(), getIconScaleBackHeight());
        canvas.concat(getColorMatrix());
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), getPaint());
    }

    public C21593719f5(Context context, AttributeSet attributeSet, int i, int i2, int i3, double d, double d2, double d3) {
        super(context, attributeSet, i);
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = d;
        this.LLILZ = d2;
        this.LLILZIL = d3;
        this.LLILZLL = d2;
        this.LLIZ = d3;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(631));
        this.LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(632));
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4212));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(668));
        this.LLJILJIL = new int[]{Color.argb(26, 255, 255, 255), Color.argb(102, 255, 255, 255), Color.argb(26, 255, 255, 255)};
        this.LLJILJILJ = -1.0f;
        this.LLJILLL = new float[]{0.0f, 0.5f, 1.0f};
        this.LLJJ = 1960L;
        this.LLJJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6296));
        this.LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3412));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3411));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4211));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4216));
        this.LLJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4215));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4214));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4213));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3413));
    }
}
