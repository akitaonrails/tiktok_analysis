package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19PT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PT extends AbstractC21576319cH implements InterfaceC21576819cM {
    public boolean LLILZ;
    public boolean LLILZIL;
    public final Paint LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final float LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public final TimeInterpolator LLJILJIL;

    public C19PT(Context context) {
        super(context);
        this.LLIZ = -1118482;
        this.LLIZLLLIL = -1615546;
        this.LLJILJIL = new AccelerateDecelerateInterpolator();
        setMinimumHeight(C19ZZ.LIZJ(60.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R$styleable.BallPulseFooter);
        Paint paint = new Paint();
        this.LLILZLL = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LLILLJJLI = C19PY.LIZJ;
        this.LLILLJJLI = C19PY.LJI[typedArrayObtainStyledAttributes.getInt(R$styleable.BallPulseFooter_srlClassicsSpinnerStyle, 0)];
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BallPulseFooter_srlNormalColor)) {
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BallPulseFooter_srlNormalColor, 0);
            this.LLIZ = color;
            this.LLILZ = true;
            if (!this.LLJIJIL) {
                paint.setColor(color);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BallPulseFooter_srlAnimatingColor)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BallPulseFooter_srlAnimatingColor, 0);
            this.LLIZLLLIL = color2;
            this.LLILZIL = true;
            if (this.LLJIJIL) {
                paint.setColor(color2);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.LLJ = C19ZZ.LIZJ(4.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float f;
        int width = getWidth();
        int height = getHeight();
        float fMin = Math.min(width, height);
        float f2 = this.LLJ;
        float f3 = (fMin - (f2 * 2.0f)) / 6.0f;
        float f4 = f3 * 2.0f;
        float f5 = (width / 2.0f) - (f2 + f4);
        float f6 = height / 2.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = 0;
        do {
            i = i2 + 1;
            if ((jCurrentTimeMillis - this.LLJI) - ((long) (i * 120)) > 0) {
                f = (r3 % 750) / 750.0f;
            } else {
                f = 0.0f;
            }
            float interpolation = ((AccelerateDecelerateInterpolator) this.LLJILJIL).getInterpolation(f);
            canvas.save();
            float f7 = i2;
            canvas.translate((f4 * f7) + f5 + (this.LLJ * f7), f6);
            if (interpolation < 0.5d) {
                float f8 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f8, f8);
            } else {
                float f9 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f9, f9);
            }
            canvas.drawCircle(0.0f, 0.0f, f3, this.LLILZLL);
            canvas.restore();
            i2 = i;
        } while (i < 3);
        super.dispatchDraw(canvas);
        if (this.LLJIJIL) {
            invalidate();
        }
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public void setPrimaryColors(int... iArr) {
        if (!this.LLILZIL && iArr.length > 1) {
            int i = iArr[0];
            this.LLIZLLLIL = i;
            this.LLILZIL = true;
            if (this.LLJIJIL) {
                this.LLILZLL.setColor(i);
            }
            this.LLILZIL = false;
        }
        if (!this.LLILZ) {
            if (iArr.length > 1) {
                int i2 = iArr[1];
                this.LLIZ = i2;
                this.LLILZ = true;
                if (!this.LLJIJIL) {
                    this.LLILZLL.setColor(i2);
                }
            } else if (iArr.length > 0) {
                int iLJIIJ = C2441009hQ.LJIIJ(-1711276033, iArr[0]);
                this.LLIZ = iLJIIJ;
                this.LLILZ = true;
                if (!this.LLJIJIL) {
                    this.LLILZLL.setColor(iLJIIJ);
                }
            }
            this.LLILZ = false;
        }
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public final int LJIILL(C21576919cN c21576919cN, boolean z) {
        this.LLJIJIL = false;
        this.LLJI = 0L;
        this.LLILZLL.setColor(this.LLIZ);
        return 0;
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public final void LIZ(C19PU c19pu, int i, int i2) {
        if (this.LLJIJIL) {
            return;
        }
        invalidate();
        this.LLJIJIL = true;
        this.LLJI = System.currentTimeMillis();
        this.LLILZLL.setColor(this.LLIZLLLIL);
    }
}
