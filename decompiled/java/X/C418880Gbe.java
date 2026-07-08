package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService;
import com.ss.android.ugc.aweme.experiment.DoubleColorBallAnimationViewExperimentServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418880Gbe extends View {
    public int LL;
    public int LLILLJJLI;
    public Paint LLILLL;
    public final PorterDuffXfermode LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public DoubleColorBallAnimationViewExperimentService LLJJI;

    public C418880Gbe() {
        throw null;
    }

    public final void LIZJ() {
        this.LLJ = false;
        this.LLIZ = false;
        this.LLILZIL = 0.0f;
    }

    public final void LIZ() {
        this.LLJI = -1L;
        if (this.LLJIJIL <= 0) {
            setProgressBarInfo(C418440Gaw.LIZ(36));
        }
        int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.LLJIJIL > iMin && iMin > 0) {
            setProgressBarInfo(iMin);
        }
        if (this.LLILLL == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setStyle(Paint.Style.FILL);
            this.LLILLL = paint;
        }
        this.LLIZ = true;
    }

    public final void LIZIZ() {
        LIZ();
        this.LLJ = true;
        this.LLILZLL = true;
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZJ();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        long j;
        super.onDraw(canvas);
        if ((this.LLJ || !this.LLILZLL) && this.LLIZ) {
            boolean z = false;
            if (this.LLILZLL) {
                long jNanoTime = System.nanoTime() / 1000000;
                if (this.LLJI < 0) {
                    this.LLJI = jNanoTime;
                }
                float f3 = (jNanoTime - this.LLJI) / 400.0f;
                this.LLILZIL = f3;
                int i3 = (int) f3;
                if (((this.LLIZLLLIL + i3) & 1) == 1) {
                    z = true;
                }
                this.LLILZIL = f3 - i3;
            }
            float f4 = this.LLILZIL;
            if (f4 < 0.5d) {
                f = f4 * 2.0f * f4;
            } else {
                f = ((f4 * 2.0f) * (2.0f - f4)) - 1.0f;
            }
            int i4 = this.LLJIJIL;
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.LLILLL, 31);
            float f5 = (this.LLJJ * f) + this.LLJILLL;
            if (f < 0.5d) {
                f2 = f * 2.0f;
            } else {
                f2 = 2.0f - (f * 2.0f);
            }
            float f6 = this.LLJILJILJ;
            float f7 = (0.25f * f2 * f6) + f6;
            Paint paint = this.LLILLL;
            if (z) {
                i = this.LLILLJJLI;
            } else {
                i = this.LL;
            }
            paint.setColor(i);
            canvas.drawCircle(f5, this.LLJILJIL, f7, this.LLILLL);
            float f8 = this.LLJIJIL - f5;
            float f9 = this.LLJILJILJ;
            float f10 = f9 - ((f2 * 0.375f) * f9);
            Paint paint2 = this.LLILLL;
            if (z) {
                i2 = this.LL;
            } else {
                i2 = this.LLILLJJLI;
            }
            paint2.setColor(i2);
            this.LLILLL.setXfermode(this.LLILZ);
            canvas.drawCircle(f8, this.LLJILJIL, f10, this.LLILLL);
            this.LLILLL.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
            DoubleColorBallAnimationViewExperimentService doubleColorBallAnimationViewExperimentService = this.LLJJI;
            if (doubleColorBallAnimationViewExperimentService != null && doubleColorBallAnimationViewExperimentService.LIZ()) {
                j = 32;
            } else {
                j = 17;
            }
            postInvalidateDelayed(j);
        }
    }

    public void setCycleBias(int i) {
        this.LLIZLLLIL = i;
    }

    public void setProgress(float f) {
        if (!this.LLIZ) {
            LIZ();
        }
        this.LLILZIL = f;
        this.LLJ = false;
        this.LLILZLL = false;
        postInvalidate();
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LLJIJIL = i;
            this.LLJILJIL = i / 2.0f;
            float f = (i >> 1) * 0.32f;
            this.LLJILJILJ = f;
            float f2 = (i * 0.16f) + f;
            this.LLJILLL = f2;
            this.LLJJ = i - (f2 * 2.0f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LIZIZ();
        } else {
            LIZJ();
        }
    }

    public C418880Gbe(Context context, AttributeSet attributeSet) {
        DoubleColorBallAnimationViewExperimentService doubleColorBallAnimationViewExperimentService;
        super(context, attributeSet, 0);
        this.LLILZ = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = 0;
        this.LLJ = false;
        this.LLJI = -1L;
        this.LLJIJIL = -1;
        this.LL = C960203pA.LIZ(R.attr.a04, context);
        this.LLILLJJLI = C960203pA.LIZ(R.attr.do_res_0x7f06005d, context);
        Object objLIZ = C04TD.LIZ(DoubleColorBallAnimationViewExperimentService.class, false);
        if (objLIZ != null) {
            doubleColorBallAnimationViewExperimentService = (DoubleColorBallAnimationViewExperimentService) objLIZ;
        } else {
            if (C04TD.f111k0 == null) {
                synchronized (DoubleColorBallAnimationViewExperimentService.class) {
                    if (C04TD.f111k0 == null) {
                        C04TD.f111k0 = new DoubleColorBallAnimationViewExperimentServiceImpl();
                    }
                }
            }
            doubleColorBallAnimationViewExperimentService = C04TD.f111k0;
        }
        this.LLJJI = doubleColorBallAnimationViewExperimentService;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.LLJIJIL > iMin && iMin > 0) {
            setProgressBarInfo(iMin);
        }
    }
}
