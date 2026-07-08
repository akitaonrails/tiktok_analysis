package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21592519et extends View {
    public final ShortVideoContext LL;
    public final C01GW LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public float LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;

    private final float getFlashHeight() {
        return this.LLILZLL - (this.LLIZ * 2);
    }

    private final RectF getFlashRectF() {
        float f = this.LLIZ;
        float f2 = this.LLILZ;
        float f3 = this.LLILLL;
        return new RectF(f + f2, f + f3, (this.LLIZLLLIL - f2) - f, f + f3 + getFlashHeight());
    }

    private final float getFlashWidth() {
        return this.LLILZIL - (this.LLIZ * 2);
    }

    private final FrameLayout.LayoutParams getSurfaceViewParams() {
        return (FrameLayout.LayoutParams) this.LLILLJJLI.getValue();
    }

    private final RectF getSurfaceViewRectF() {
        float f = this.LLILZ;
        float f2 = this.LLILLL;
        return new RectF(f, f2, this.LLIZLLLIL - f, this.LLILZLL + f2);
    }

    public final C21592619eu getCurConfig() {
        return new C21592619eu(this.LLILZIL, this.LLILZLL, this.LLILLL);
    }

    public final ShortVideoContext getShortVideoContext() {
        return this.LL;
    }

    public final void LIZ(C21592619eu c21592619eu) {
        this.LLIZLLLIL = C11VU.LJ(getContext());
        this.LLJ = ScreenUtils.getFullScreenHeight(getContext());
        this.LLILLL = c21592619eu.LIZJ;
        float f = c21592619eu.LIZ;
        this.LLILZIL = f;
        this.LLILZLL = c21592619eu.LIZIZ;
        this.LLILZ = (this.LLIZLLLIL - f) / 2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.LLIZ);
        paint.setColor(this.LLJIJIL);
        paint.setStyle(Paint.Style.STROKE);
        paint.setMaskFilter(new BlurMaskFilter(this.LLIZ, BlurMaskFilter.Blur.NORMAL));
        Path path = new Path();
        path.addRect(getSurfaceViewRectF(), Path.Direction.CW);
        RectF flashRectF = getFlashRectF();
        path.addRect(flashRectF, Path.Direction.CW);
        float f = this.LLJI;
        path.addRoundRect(flashRectF, f, f, Path.Direction.CW);
        if (canvas != null) {
            canvas.drawPath(path, paint);
        }
        paint.setMaskFilter(new BlurMaskFilter(40.0f, BlurMaskFilter.Blur.NORMAL));
        paint.setStyle(Paint.Style.STROKE);
        if (canvas != null) {
            canvas.drawRect(getSurfaceViewRectF(), paint);
        }
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        RectF rectF = new RectF(0.0f, 0.0f, this.LLIZLLLIL, this.LLILLL);
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        }
        RectF rectF2 = new RectF(0.0f, this.LLILLL + this.LLILZLL, this.LLIZLLLIL, this.LLJ);
        if (canvas != null) {
            canvas.drawRect(rectF2, paint);
        }
        float f2 = this.LLILLL;
        RectF rectF3 = new RectF(0.0f, f2, this.LLILZ, this.LLILZLL + f2);
        if (canvas != null) {
            canvas.drawRect(rectF3, paint);
        }
        float f3 = this.LLIZLLLIL;
        float f4 = f3 - this.LLILZ;
        float f5 = this.LLILLL;
        RectF rectF4 = new RectF(f4, f5, f3, this.LLILZLL + f5);
        if (canvas != null) {
            canvas.drawRect(rectF4, paint);
        }
        if (this.LLJILJIL) {
            paint.setMaskFilter(null);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            double dLIZIZ = ((((double) this.LLILZLL) - (((double) this.LLILZIL) * 1.125d)) / ((double) 2)) + ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            RectF rectF5 = new RectF(0.0f, 0.0f, this.LLIZLLLIL, (float) (((double) this.LLILLL) + dLIZIZ));
            if (canvas != null) {
                canvas.drawRect(rectF5, paint);
            }
            RectF rectF6 = new RectF(0.0f, (float) (((double) (this.LLILLL + this.LLILZLL)) - dLIZIZ), this.LLIZLLLIL, this.LLJ);
            if (canvas != null) {
                canvas.drawRect(rectF6, paint);
            }
        }
    }

    public final void setFlashColor(int i) {
        this.LLJIJIL = i;
        invalidate();
    }

    public C21592519et(Context context, ShortVideoContext shortVideoContext) {
        super(context);
        this.LL = shortVideoContext;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3));
        this.LLILLL = getSurfaceViewParams().topMargin;
        this.LLILZ = getSurfaceViewParams().leftMargin;
        this.LLILZIL = getSurfaceViewParams().width;
        this.LLILZLL = getSurfaceViewParams().height;
        this.LLIZ = C418440Gaw.LIZIZ(56);
        this.LLIZLLLIL = C11VU.LJ(context);
        this.LLJ = ScreenUtils.getFullScreenHeight(context);
        this.LLJI = C418440Gaw.LIZIZ(130);
        this.LLJIJIL = -1;
        if (Build.VERSION.SDK_INT >= 28) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }
}
