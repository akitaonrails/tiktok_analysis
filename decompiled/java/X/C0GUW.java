package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GUW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUW extends View {
    public TextView LL;
    public TextView LLILLJJLI;
    public float LLILLL;
    public ValueAnimator LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public final RectF LLJ;
    public final RectF LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final float LLJJI;
    public boolean LLJJIII;
    public Path LLJJIJI;
    public Path LLJJIJIIJIL;
    public Path LLJJIJIL;

    private final Paint getPaint() {
        return (Paint) this.LLILZIL.getValue();
    }

    private final Paint getStrokePaint() {
        return (Paint) this.LLILZLL.getValue();
    }

    private final float getTrueLeftProgressPosition() {
        float f = this.LLILLL;
        float f2 = f / 0.1f;
        float fCeil = (float) (f > 0.5f ? Math.ceil(f2) : Math.floor(f2));
        if (fCeil < 1.0f) {
            fCeil = 1.0f;
        } else if (fCeil > 9.0f) {
            fCeil = 9.0f;
        }
        float width = fCeil * 0.1f * getWidth();
        float measuredWidth = (this.LL != null ? r0.getMeasuredWidth() : 0.0f) + this.LLJJI;
        if (width < measuredWidth) {
            width = measuredWidth;
        }
        float width2 = (getWidth() - (this.LLILLJJLI != null ? r0.getMeasuredWidth() : 0.0f)) - this.LLJJI;
        return width > width2 ? width2 : width;
    }

    private final void setProgress(float f) {
        ValueAnimator valueAnimator;
        float f2 = this.LLILLL;
        ValueAnimator valueAnimator2 = this.LLILZ;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LLILZ) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.LLILZ = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(300L);
        }
        ValueAnimator valueAnimator3 = this.LLILZ;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS256S0100000_6(this, 9));
        }
        ValueAnimator valueAnimator4 = this.LLILZ;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float trueLeftProgressPosition = getTrueLeftProgressPosition();
        this.LLJ.set(0.0f, 0.0f, trueLeftProgressPosition, getHeight());
        this.LLJI.set(trueLeftProgressPosition, 0.0f, getWidth(), getHeight());
        RectF rectF = this.LLJI;
        float f = rectF.left;
        float f2 = rectF.top;
        getPaint().setShader(new LinearGradient(f, f2, rectF.right, f2, this.LLJILLL, this.LLJILJILJ, Shader.TileMode.MIRROR));
        Path path = this.LLJJIJIIJIL;
        float height = this.LLJI.left - (getHeight() / 2);
        RectF rectF2 = this.LLJI;
        Path pathLIZ = C0GUS.LIZ(path, height, rectF2.top, rectF2.right, rectF2.bottom, false, true);
        this.LLJJIJIIJIL = pathLIZ;
        canvas.drawPath(pathLIZ, getPaint());
        RectF rectF3 = this.LLJ;
        float f3 = rectF3.left;
        float f4 = rectF3.top;
        getPaint().setShader(new LinearGradient(f3, f4, rectF3.right, f4, this.LLJIJIL, this.LLJILJIL, Shader.TileMode.MIRROR));
        Path path2 = this.LLJJIJI;
        RectF rectF4 = this.LLJ;
        Path pathLIZ2 = C0GUS.LIZ(path2, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, true, this.LLJJIII);
        this.LLJJIJI = pathLIZ2;
        canvas.drawPath(pathLIZ2, getPaint());
        if (this.LLJJIII) {
            float fLIZIZ = C497740JfY.LIZIZ(1.0f);
            RectF rectF5 = this.LLJ;
            float f5 = rectF5.right;
            float f6 = rectF5.top;
            getStrokePaint().setShader(new LinearGradient(0.8f * f5, f6, f5, f6, C2441009hQ.LJIIL(this.LLJJ, 0), C2441009hQ.LJIIL(this.LLJJ, 204), Shader.TileMode.CLAMP));
            Path path3 = this.LLJJIJIL;
            RectF rectF6 = this.LLJ;
            float f7 = fLIZIZ * 0.5f;
            Path pathLIZ3 = C0GUS.LIZ(path3, rectF6.left, rectF6.top + f7, rectF6.right - f7, rectF6.bottom - f7, true, true);
            this.LLJJIJIL = pathLIZ3;
            canvas.drawPath(pathLIZ3, getStrokePaint());
        }
        getPaint().setShader(null);
        getStrokePaint().setShader(null);
    }

    public final void setActive(boolean z) {
        this.LLJJIII = z;
    }

    public final void setLeftValue(long j) {
        this.LLIZ = j;
        if (this.LLIZLLLIL + j == 0) {
            setProgress(0.5f);
        } else {
            setProgress(j / (j + r3));
        }
    }

    public final void setRightValue(long j) {
        this.LLIZLLLIL = j;
        long j2 = this.LLIZ;
        if (j + j2 == 0) {
            setProgress(0.5f);
        } else {
            setProgress(j2 / (j2 + j));
        }
    }

    public C0GUW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = 0.5f;
        this.LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(462));
        this.LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(463));
        this.LLJ = new RectF();
        this.LLJI = new RectF();
        this.LLJIJIL = C497740JfY.LIZLLL(R.attr.esz, context);
        this.LLJILJIL = C497740JfY.LIZLLL(R.attr.esy, context);
        this.LLJILJILJ = C497740JfY.LIZLLL(R.attr.et4, context);
        this.LLJILLL = C497740JfY.LIZLLL(R.attr.et3, context);
        this.LLJJ = C497740JfY.LIZLLL(R.attr.fxc, context);
        this.LLJJI = C497740JfY.LIZIZ(10.0f);
    }
}
