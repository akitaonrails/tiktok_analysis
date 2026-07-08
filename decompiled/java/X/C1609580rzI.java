package X;

import Y.AfS185S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0rzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609580rzI extends FrameLayout {
    public float LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public AwS603S0100000_24 LLILZIL;
    public C11JF LLILZLL;
    public C421600Gg2 LLIZ;
    public int[] LLIZLLLIL;
    public float[] LLJ;
    public Integer LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public final Paint LLJILJILJ;
    public EnumC1609590rzJ LLJILLL;
    public ValueAnimator LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public EnumC1609560rzG LLJJIJI;
    public final RectF LLJJIJIIJIL;
    public final RectF LLJJIJIL;
    public float LLJJJ;
    public LinearGradient LLJJJIL;
    public LinearGradient LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;

    private final int getGray() {
        return this.LLJILLL == EnumC1609590rzJ.CONST ? this.LLJJJJLIIL : this.LLJJJJJIL;
    }

    private final float[] getGuideShaderPositions() {
        float[] fArr = this.LLJ;
        if (fArr == null) {
            fArr = new float[3];
            int i = 0;
            do {
                float f = 0.0f;
                if (i != 0) {
                    if (i == 1) {
                        f = 0.53f;
                    } else if (i == 2) {
                        f = 1.0f;
                    }
                }
                fArr[i] = f;
                i++;
            } while (i < 3);
        }
        return fArr;
    }

    private final int[] getShaderColors() {
        int[] iArr = this.LLIZLLLIL;
        if (iArr == null) {
            iArr = new int[3];
            int i = 0;
            loop0: while (true) {
                int i2 = this.LLILLJJLI;
                while (true) {
                    iArr[i] = i2;
                    i++;
                    if (i >= 3) {
                        break loop0;
                    }
                    if (i != 0) {
                        i2 = i != 1 ? i != 2 ? 0 : this.LLILZ : this.LLILLL;
                    }
                }
            }
        }
        return iArr;
    }

    private final float[] getShaderPositions() {
        float[] fArr = this.LLJ;
        if (fArr == null) {
            fArr = new float[3];
            int i = 0;
            do {
                float f = 0.0f;
                if (i != 0) {
                    if (i == 1) {
                        f = 0.5f;
                    } else if (i == 2) {
                        f = 1.0f;
                    }
                }
                fArr[i] = f;
                i++;
            } while (i < 3);
        }
        return fArr;
    }

    public final void LIZIZ() {
        this.LLJJJIL = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), getShaderColors(), getShaderPositions(), Shader.TileMode.CLAMP);
        this.LLJJJJ = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), getShaderColors(), getGuideShaderPositions(), Shader.TileMode.CLAMP);
    }

    public final float getBackgroundAlpha() {
        return this.LLJIJIL;
    }

    public final int[] getColors() {
        return this.LLIZLLLIL;
    }

    public final EnumC1609560rzG getMode() {
        return this.LLJJIJI;
    }

    public final Paint getPaint() {
        return this.LLJILJILJ;
    }

    public final float getProgress() {
        return this.LLJJI;
    }

    public final float getRadius() {
        return this.LLJJJ;
    }

    public final float getRingWidth() {
        return this.LL;
    }

    public final float[] getShaderPosition() {
        return this.LLJ;
    }

    public final Integer getSingleColor() {
        return this.LLJI;
    }

    public final EnumC1609590rzJ getThemeType() {
        return this.LLJILLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int height;
        int iIntValue = -16777216;
        switch (C1609570rzH.LIZ[this.LLJJIJI.ordinal()]) {
            case 1:
                super.dispatchDraw(canvas);
                return;
            case 2:
                this.LLJILJILJ.setStyle(Paint.Style.STROKE);
                this.LLJILJILJ.setShader(null);
                this.LLJILJILJ.setColor(getGray());
                canvas.drawArc(this.LLJJIJIIJIL, 0.0f, 360.0f, false, this.LLJILJILJ);
                this.LLJILJILJ.setShader(this.LLJJJIL);
                this.LLJILJILJ.setColor(-16777216);
                canvas.drawArc(this.LLJJIJIIJIL, -90.0f, this.LLJJIII * 360.0f, false, this.LLJILJILJ);
                break;
            case 3:
                this.LLJILJILJ.setShader(this.LLJJJIL);
                this.LLJILJILJ.setStyle(Paint.Style.STROKE);
                this.LLJILJILJ.setColor(-16777216);
                canvas.drawArc(this.LLJJIJIIJIL, -90.0f, 360.0f, false, this.LLJILJILJ);
                break;
            case 4:
                this.LLJILJILJ.setShader(this.LLJJJIL);
                this.LLJILJILJ.setStyle(Paint.Style.FILL);
                this.LLJILJILJ.setColor(-16777216);
                if (getWidth() < getHeight()) {
                    height = getWidth();
                } else {
                    height = getHeight();
                }
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, height / 2.0f, this.LLJILJILJ);
                break;
            case 5:
                this.LLJILJILJ.setStyle(Paint.Style.STROKE);
                this.LLJILJILJ.setShader(null);
                this.LLJILJILJ.setColor(getGray());
                canvas.drawArc(this.LLJJIJIIJIL, -90.0f, 360.0f, false, this.LLJILJILJ);
                break;
            case 6:
                this.LLJILJILJ.setStyle(Paint.Style.STROKE);
                this.LLJILJILJ.setShader(null);
                this.LLJILJILJ.setColor(this.LLJJL);
                canvas.drawArc(this.LLJJIJIIJIL, -90.0f, 360.0f, false, this.LLJILJILJ);
                break;
            case 7:
                this.LLJILJILJ.setShader(this.LLJJJIL);
                this.LLJILJILJ.setStyle(Paint.Style.FILL);
                this.LLJILJILJ.setColor(-16777216);
                this.LLJILJILJ.setAlpha(this.LLJILJIL);
                RectF rectF = this.LLJJIJIL;
                float f = this.LLJJJ;
                canvas.drawRoundRect(rectF, f, f, this.LLJILJILJ);
                break;
            case 8:
                this.LLJILJILJ.setShader(this.LLJJJJ);
                this.LLJILJILJ.setStyle(Paint.Style.FILL);
                this.LLJILJILJ.setColor(-16777216);
                RectF rectF2 = this.LLJJIJIL;
                float f2 = this.LLJJJ;
                canvas.drawRoundRect(rectF2, f2, f2, this.LLJILJILJ);
                this.LLJILJILJ.setShader(null);
                this.LLJILJILJ.setColor(ColorProtector.parseColor("#33000000"));
                RectF rectF3 = this.LLJJIJIL;
                float f3 = this.LLJJJ;
                canvas.drawRoundRect(rectF3, f3, f3, this.LLJILJILJ);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                this.LLJILJILJ.setShader(null);
                this.LLJILJILJ.setStyle(Paint.Style.FILL);
                this.LLJILJILJ.setColor(ColorProtector.parseColor("#80009CB0"));
                RectF rectF4 = this.LLJJIJIL;
                float f4 = this.LLJJJ;
                canvas.drawRoundRect(rectF4, f4, f4, this.LLJILJILJ);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                this.LLJILJILJ.setShader(null);
                this.LLJILJILJ.setStyle(Paint.Style.FILL);
                Paint paint = this.LLJILJILJ;
                Integer num = this.LLJI;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                paint.setColor(iIntValue);
                RectF rectF5 = this.LLJJIJIL;
                float f5 = this.LLJJJ;
                canvas.drawRoundRect(rectF5, f5, f5, this.LLJILJILJ);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZIZ();
                this.LLJILJILJ.setShader(this.LLJJJIL);
                this.LLJILJILJ.setStyle(Paint.Style.FILL);
                RectF rectF6 = this.LLJJIJIL;
                float f6 = this.LLJJJ;
                canvas.drawRoundRect(rectF6, f6, f6, this.LLJILJILJ);
                break;
        }
        super.dispatchDraw(canvas);
    }

    public final void setBackgroundAlpha(float f) {
        int iLIZIZ;
        this.LLJIJIL = f;
        if (f < 0.0f) {
            iLIZIZ = 0;
        } else if (f > 1.0f) {
            iLIZIZ = 255;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(f * 255);
        }
        this.LLJILJIL = iLIZIZ;
        invalidate();
    }

    public final void setColors(int[] iArr) {
        this.LLIZLLLIL = iArr;
    }

    public final void setMode(EnumC1609560rzG enumC1609560rzG) {
        if (this.LLJJIJI == enumC1609560rzG) {
            return;
        }
        this.LLJJIJI = enumC1609560rzG;
        C11JF c11jf = this.LLILZLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZLL = null;
        this.LLILZIL = null;
        if (this.LLJJIJI == EnumC1609560rzG.PRORGRESS) {
            setProgress(0.0f);
            this.LLILZLL = (C11JF) C11NZ.LJIJJLI(new C1620950sHd(this, 0)).LJIL(300L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 12), new C09JN() { // from class: X.0c0K
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("StoryBrandView@9ac4.mode$2");
                    C1C7U.LIZIZ("StoryBrandView@9ac4.mode$2");
                }
            });
        }
        EnumC1609560rzG enumC1609560rzG2 = EnumC1609560rzG.BREATH;
        if (enumC1609560rzG == enumC1609560rzG2) {
            if (this.LLIZ == null) {
                C421600Gg2 c421600Gg2 = new C421600Gg2(getContext(), null, 0);
                c421600Gg2.setTag(enumC1609560rzG2);
                this.LLIZ = c421600Gg2;
            }
            addView(this.LLIZ, new FrameLayout.LayoutParams(-1, -1));
        } else if (indexOfChild(this.LLIZ) >= 0) {
            C421600Gg2 c421600Gg22 = this.LLIZ;
            if (c421600Gg22 != null && c421600Gg22.LLILLJJLI) {
                c421600Gg22.pause();
            }
            C421600Gg2 c421600Gg23 = this.LLIZ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c421600Gg23);
            removeView(c421600Gg23);
        }
        invalidate();
    }

    public final void setProgress(float f) {
        this.LLJJI = f;
        if (this.LLJJIJI != EnumC1609560rzG.PRORGRESS) {
            return;
        }
        if (f < this.LLJJIII) {
            ValueAnimator valueAnimator = this.LLJJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.LLJJ;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = this.LLJJ;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
            }
            float f2 = this.LLJJI;
            if (f2 == 0.0f) {
                this.LLJJIII = f2;
                invalidate();
                return;
            }
            return;
        }
        AwS603S0100000_24 awS603S0100000_24 = this.LLILZIL;
        if (awS603S0100000_24 != null) {
            awS603S0100000_24.invoke(Float.valueOf(f));
        }
    }

    public final void setRadius(float f) {
        this.LLJJJ = f;
        invalidate();
    }

    public final void setRingWidth(float f) {
        this.LL = f;
        this.LLJILJILJ.setStrokeWidth(f);
        LIZ(getWidth(), getHeight());
        invalidate();
    }

    public final void setShaderPosition(float[] fArr) {
        this.LLJ = fArr;
    }

    public final void setSingleColor(Integer num) {
        this.LLJI = num;
    }

    public final void setThemeType(EnumC1609590rzJ enumC1609590rzJ) {
        this.LLJILLL = enumC1609590rzJ;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C421600Gg2 c421600Gg2;
        super.setVisibility(i);
        if (i != 0 && (c421600Gg2 = this.LLIZ) != null && c421600Gg2.LLILLJJLI) {
            c421600Gg2.pause();
        }
    }

    public C1609580rzI(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Double dValueOf = Double.valueOf(1.5d);
        this.LL = C418440Gaw.LIZIZ(dValueOf);
        this.LLILLJJLI = -15681537;
        this.LLILLL = -14625300;
        this.LLILZ = -15210058;
        this.LLJIJIL = 1.0f;
        this.LLJILJIL = 255;
        Paint paint = new Paint();
        paint.setStrokeWidth(this.LL);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.LLJILJILJ = paint;
        EnumC1609590rzJ enumC1609590rzJ = EnumC1609590rzJ.LIGHT;
        this.LLJILLL = enumC1609590rzJ;
        EnumC1609560rzG enumC1609560rzG = EnumC1609560rzG.BRAND_RING;
        this.LLJJIJI = enumC1609560rzG;
        this.LLJJIJIIJIL = new RectF();
        this.LLJJIJIL = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StoryBrandView, 0, 0);
            setRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.StoryBrandView_radius, 0));
            switch (typedArrayObtainStyledAttributes.getInt(R$styleable.StoryBrandView_brand_mode, 1)) {
                case 0:
                    enumC1609560rzG = EnumC1609560rzG.PRORGRESS;
                    break;
                case 1:
                    break;
                case 2:
                    enumC1609560rzG = EnumC1609560rzG.GRAY_RING;
                    break;
                case 3:
                    enumC1609560rzG = EnumC1609560rzG.RED_RING;
                    break;
                case 4:
                    enumC1609560rzG = EnumC1609560rzG.BRAND_FILL_CIRCLE;
                    break;
                case 5:
                    enumC1609560rzG = EnumC1609560rzG.BRAND_BACKGROUND;
                    break;
                case 6:
                    enumC1609560rzG = EnumC1609560rzG.GUIDE_BACKGROUND;
                    break;
                case 7:
                    enumC1609560rzG = EnumC1609560rzG.BREATH;
                    break;
                case 8:
                    enumC1609560rzG = EnumC1609560rzG.VERSION2_BACKGROUND;
                    break;
                default:
                    enumC1609560rzG = EnumC1609560rzG.NONE;
                    break;
            }
            setMode(enumC1609560rzG);
            int i = typedArrayObtainStyledAttributes.getInt(R$styleable.StoryBrandView_theme_type, 0);
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        enumC1609590rzJ = EnumC1609590rzJ.CONST;
                    }
                } else {
                    enumC1609590rzJ = EnumC1609590rzJ.DARK;
                }
            }
            this.LLJILLL = enumC1609590rzJ;
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.StoryBrandView_ring_width, 0);
            setRingWidth(dimensionPixelSize <= 0.0f ? C418440Gaw.LIZIZ(dValueOf) : dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a01, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJJJJJIL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zk, context);
        this.LLJJJJLIIL = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        this.LLJJL = ColorProtector.parseColor("#FF4C3A");
    }

    public final void LIZ(int i, int i2) {
        if (i > 0 && i2 > 0) {
            RectF rectF = this.LLJJIJIIJIL;
            float f = this.LL;
            rectF.left = f / 2.0f;
            rectF.top = (f / 2.0f) + 0.0f;
            float f2 = i;
            rectF.right = f2 - (f / 2.0f);
            float f3 = i2;
            rectF.bottom = f3 - (f / 2.0f);
            RectF rectF2 = this.LLJJIJIL;
            rectF2.left = 0.0f;
            rectF2.top = 0.0f;
            rectF2.right = f2;
            rectF2.bottom = f3;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ(i, i2);
        if (i > 0 && i2 > 0) {
            LIZIZ();
        }
    }
}
