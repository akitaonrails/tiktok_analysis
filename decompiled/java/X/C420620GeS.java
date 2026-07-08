package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0GeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420620GeS extends View {
    public final Paint LL;
    public final RectF LLILLJJLI;
    public final Paint LLILLL;
    public final int LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final float[] LLJ;
    public final float LLJI;
    public final long LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;
    public long LLJJI;
    public EnumC429070Gs5 LLJJIII;

    public final void LIZIZ() {
        this.LLJJ = false;
        this.LLJJI = 0L;
        this.LLJILJIL = 0.0f;
        this.LLJILJILJ = this.LLIZLLLIL;
        int i = this.LLILZ;
        for (int i2 = 0; i2 < i; i2++) {
            this.LLJ[i2] = 0.0f;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJ = false;
    }

    public final void LIZJ(int i) {
        Pair pair;
        int i2 = C420630GeT.LIZ[this.LLJJIII.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                pair = new Pair(Integer.valueOf(R.attr.d1), Integer.valueOf(R.attr.cl));
            } else {
                throw new C1954807lC();
            }
        } else {
            pair = new Pair(Integer.valueOf(R.attr.zs), Integer.valueOf(R.attr.a1m));
        }
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, i, 0.0f, LIZ(((Number) pair.getFirst()).intValue(), getContext()), LIZ(((Number) pair.getSecond()).intValue(), getContext()), Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width > 0.0f && height > 0.0f) {
            if (this.LLJJ) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.LLJJI == 0) {
                    this.LLJJI = jCurrentTimeMillis;
                    float f = height * 0.82f;
                    float f2 = this.LLIZLLLIL;
                    if (f < f2) {
                        f = f2;
                    }
                    this.LLJILJILJ = C13LZ.LIZLLL(((f - f2) * this.LLJILLL) + f2, f2, f);
                }
                long j = jCurrentTimeMillis - this.LLJJI;
                if (j > 64) {
                    j = 64;
                }
                this.LLJJI = jCurrentTimeMillis;
                this.LLJILJIL += (this.LLJI / this.LLJIJIL) * j;
                while (true) {
                    float f3 = this.LLJILJIL;
                    float f4 = this.LLJI;
                    if (f3 < f4) {
                        break;
                    }
                    this.LLJILJIL = f3 - f4;
                    int i = this.LLILZ - 1;
                    while (i > 0) {
                        float[] fArr = this.LLJ;
                        int i2 = i - 1;
                        fArr[i] = fArr[i2];
                        i = i2;
                    }
                    this.LLJ[0] = this.LLJILJILJ;
                    float f5 = height * 0.82f;
                    float f6 = this.LLIZLLLIL;
                    if (f5 < f6) {
                        f5 = f6;
                    }
                    this.LLJILJILJ = C13LZ.LIZLLL(((f5 - f6) * this.LLJILLL) + f6, f6, f5);
                }
                postInvalidateOnAnimation();
            }
            float f7 = (this.LLILZ * this.LLILZLL) + ((r1 - 1) * this.LLIZ);
            float f8 = height / 2.0f;
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null);
            float f9 = (((width - f7) / 2.0f) + f7) - this.LLILZLL;
            float f10 = f9 - this.LLJILJIL;
            int i3 = this.LLILZ;
            for (int i4 = 0; i4 < i3; i4++) {
                float fMax = Math.max(this.LLIZLLLIL, this.LLJ[i4]) / 2.0f;
                this.LLILLJJLI.set(f10, f8 - fMax, this.LLILZLL + f10, fMax + f8);
                RectF rectF = this.LLILLJJLI;
                float f11 = this.LLILZIL;
                canvas.drawRoundRect(rectF, f11, f11, this.LL);
                f10 -= this.LLJI;
            }
            if (this.LLJJ) {
                float f12 = f9 + (this.LLJI - this.LLJILJIL);
                float fMax2 = Math.max(this.LLIZLLLIL, this.LLJILJILJ) / 2.0f;
                this.LLILLJJLI.set(f12, f8 - fMax2, this.LLILZLL + f12, f8 + fMax2);
                RectF rectF2 = this.LLILLJJLI;
                float f13 = this.LLILZIL;
                canvas.drawRoundRect(rectF2, f13, f13, this.LL);
            }
            canvas.drawRect(0.0f, 0.0f, width, height, this.LLILLL);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public final void setMode(EnumC429070Gs5 enumC429070Gs5) {
        if (this.LLJJIII == enumC429070Gs5) {
            return;
        }
        this.LLJJIII = enumC429070Gs5;
        LIZJ(getWidth());
        invalidate();
    }

    public final void setVolume(float f) {
        this.LLJILLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C420620GeS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        this.LLILLJJLI = new RectF();
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.LLILLL = paint2;
        this.LLILZ = 42;
        this.LLILZIL = 9999.0f;
        this.LLILZLL = C418440Gaw.LIZIZ(Float.valueOf(2.5f));
        this.LLIZ = C418440Gaw.LIZIZ(3);
        this.LLIZLLLIL = C418440Gaw.LIZIZ(Float.valueOf(4.0f));
        float[] fArr = new float[42];
        do {
            fArr[i] = 0.0f;
            i++;
        } while (i < 42);
        this.LLJ = fArr;
        this.LLJI = this.LLILZLL + this.LLIZ;
        this.LLJIJIL = 120L;
        this.LLJILJILJ = this.LLIZLLLIL;
        this.LLJJIII = EnumC429070Gs5.INPUT;
        setLayerType(1, null);
    }

    public static int LIZ(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        int color = 0;
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return 0;
        }
        if (typedValue.resourceId != 0) {
            try {
                color = context.getResources().getColor(typedValue.resourceId, context.getTheme());
                return color;
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return color;
            }
        }
        return typedValue.data;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZJ(i);
        if (i > 0) {
            this.LLILLL.setShader(new LinearGradient(0.0f, 0.0f, i, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.1f, 0.9f, 1.0f}, Shader.TileMode.CLAMP));
        }
    }
}
