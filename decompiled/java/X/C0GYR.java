package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYR extends View {
    public final int LL;
    public final int LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final RectF LLIZ;
    public final Path LLIZLLLIL;
    public final RectF LLJ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.LLIZ.set(0.0f, 0.0f, getWidth(), getHeight());
        this.LLIZLLLIL.reset();
        float f = height;
        this.LLIZLLLIL.addRoundRect(this.LLIZ, f, f, Path.Direction.CW);
        canvas.clipPath(this.LLIZLLLIL);
        canvas.drawRoundRect(this.LLIZ, f, f, this.LLILLL);
        float width = getWidth() * this.LLILZLL;
        if (C497740JfY.LJJ()) {
            this.LLJ.set(getWidth() - width, 0.0f, getWidth(), getHeight());
        } else {
            this.LLJ.set(0.0f, 0.0f, width, getHeight());
        }
        float f2 = 255;
        int iLJIIL = C2441009hQ.LJIIL(this.LL, (int) (this.LLILZIL * f2));
        int iLJIIL2 = C2441009hQ.LJIIL(this.LLILLJJLI, (int) (f2 * this.LLILZIL));
        if (C497740JfY.LJJ()) {
            RectF rectF = this.LLJ;
            linearGradient = new LinearGradient(rectF.right, rectF.top, rectF.left, rectF.bottom, iLJIIL, iLJIIL2, Shader.TileMode.CLAMP);
        } else {
            RectF rectF2 = this.LLJ;
            linearGradient = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, iLJIIL, iLJIIL2, Shader.TileMode.CLAMP);
        }
        this.LLILZ.setShader(linearGradient);
        canvas.drawRect(this.LLJ, this.LLILZ);
    }

    public final void setProgressAlpha(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setProgressAlpha, progressAlpha: ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("CDCoinProgressBar", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL = f;
        invalidate();
    }

    public C0GYR(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, 0);
        Context context2 = getContext();
        if (C917900Zzg.LIZ()) {
            i = R.attr.exn;
        } else {
            i = R.attr.c98;
        }
        int iLIZIZ = C20736316Cj.LIZIZ(i, context2);
        this.LL = C20736316Cj.LIZIZ(R.attr.etm, getContext());
        this.LLILLJJLI = C20736316Cj.LIZIZ(R.attr.etl, getContext());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(iLIZIZ);
        this.LLILLL = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.LLILZ = paint2;
        this.LLILZIL = 1.0f;
        this.LLIZ = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LLIZLLLIL = new Path();
        this.LLJ = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
