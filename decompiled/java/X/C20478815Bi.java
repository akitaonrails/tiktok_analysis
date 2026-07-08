package X;

import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15Bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20478815Bi extends View {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public TextView LL;
    public TextView LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public float LLJIJIL;
    public ValueAnimator LLJILJIL;
    public final C01GW LLJILJILJ;
    public final RectF LLJILLL;
    public final RectF LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public float LLJJJ;
    public Function1<? super Float, Unit> LLJJJIL;
    public Function0<Unit> LLJJJJ;
    public C0GW7 LLJJJJJIL;
    public final Path LLJJJJLIIL;
    public Path LLJJL;

    public final void setAnimationToRight(boolean z) {
    }

    private final Paint getPaint() {
        return (Paint) this.LLJILJILJ.getValue();
    }

    private final float getStartSpacing() {
        return ((Number) this.LLJJIJIIJIL.getValue()).floatValue();
    }

    private final float getTextPaddingSpacing() {
        return ((Number) this.LLJJIJIL.getValue()).floatValue();
    }

    private final float getTrueLeftProgressPosition() {
        return (this.LLIZLLLIL * (getWidth() - (getStartSpace$liveinteract_impl_release() * 2.0f))) + getStartSpace$liveinteract_impl_release();
    }

    public final float getStartSpace$liveinteract_impl_release() {
        float startSpacing;
        if (this.LLJ > this.LLJI) {
            startSpacing = getStartSpacing() + this.LLJJJ;
            float measuredWidth = (this.LLILLJJLI != null ? r0.getMeasuredWidth() : 0.0f) + getTextPaddingSpacing();
            if (startSpacing < measuredWidth) {
                return measuredWidth;
            }
        } else {
            startSpacing = getStartSpacing() + this.LLJJJ;
            float measuredWidth2 = (this.LL != null ? r0.getMeasuredWidth() : 0.0f) + getTextPaddingSpacing();
            if (startSpacing < measuredWidth2) {
                return measuredWidth2;
            }
        }
        return startSpacing;
    }

    private final Path getClipPath() {
        float leftPaddingOffset = getLeftPaddingOffset();
        float topPaddingOffset = getTopPaddingOffset();
        float rightPaddingOffset = getRightPaddingOffset();
        float width = (getWidth() - leftPaddingOffset) - rightPaddingOffset;
        float height = (getHeight() - topPaddingOffset) - getBottomPaddingOffset();
        this.LLJJJJLIIL.reset();
        this.LLJJJJLIIL.moveTo(leftPaddingOffset, topPaddingOffset);
        float f = width + leftPaddingOffset;
        this.LLJJJJLIIL.lineTo(f, topPaddingOffset);
        float f2 = height + topPaddingOffset;
        this.LLJJJJLIIL.lineTo(f, f2);
        this.LLJJJJLIIL.lineTo(leftPaddingOffset, f2);
        this.LLJJJJLIIL.lineTo(leftPaddingOffset, topPaddingOffset);
        this.LLJJJJLIIL.close();
        return this.LLJJJJLIIL;
    }

    public final float getCoverWidth() {
        return this.LLJIJIL;
    }

    public final float getExtraSpace() {
        return this.LLJJJ;
    }

    public final long getLeftValue() {
        return this.LLJ;
    }

    public final Path getPath() {
        return this.LLJJJJLIIL;
    }

    public final long getRightValue() {
        return this.LLJI;
    }

    private final void setProgress(float f) {
        ValueAnimator valueAnimator;
        Function1<? super Float, Unit> function1 = this.LLJJJIL;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
        float f2 = this.LLIZLLLIL;
        C974450bSt c974450bSt = C973890bRz.LIZ;
        C973890bRz.LIZ.getClass();
        ValueAnimator valueAnimator2 = this.LLJILJIL;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LLJILJIL) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.LLJILJIL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(300L);
        }
        ValueAnimator valueAnimator3 = this.LLJILJIL;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS278S0100000_31(this, 3));
        }
        ValueAnimator valueAnimator4 = this.LLJILJIL;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public final float LIZ(float f) {
        float f2 = 0.0f;
        if (f <= 0.0f) {
            f = getTrueLeftProgressPosition();
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(this.LLJIJIL);
        int[] iArr = new int[2];
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.getLocationInWindow(iArr);
        }
        float f3 = iLIZIZ;
        float f4 = f3 / 2.0f;
        float f5 = ((f - f4) + f3) - (iArr[0] - 15);
        float f6 = (f + f4) - 11;
        if (f5 >= 0.0f) {
            f2 = f5;
        }
        return f6 - f2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        LinearGradient linearGradient;
        LinearGradient linearGradient2;
        super.onDraw(canvas);
        float startSpace$liveinteract_impl_release = getStartSpace$liveinteract_impl_release();
        if (this.LLJJIII) {
            f = 0.5f;
        } else {
            f = this.LLIZLLLIL;
        }
        float width = (f * (getWidth() - (2.0f * startSpace$liveinteract_impl_release))) + startSpace$liveinteract_impl_release;
        this.LLJILLL.set(0.0f, 0.0f, width, getHeight());
        this.LLJJ.set(width, 0.0f, getWidth(), getHeight());
        canvas.drawPath(getClipPath(), getPaint());
        if (!this.LLJJIII) {
            RectF rectF = this.LLJJ;
            linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.LLILZIL, this.LLILZLL, Shader.TileMode.MIRROR);
        } else {
            RectF rectF2 = this.LLJJ;
            linearGradient = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.LLIZ, this.LLILZLL, Shader.TileMode.CLAMP);
        }
        getPaint().setShader(linearGradient);
        canvas.drawRect(this.LLJJ, getPaint());
        if (!this.LLJJIII) {
            RectF rectF3 = this.LLJILLL;
            linearGradient2 = new LinearGradient(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, this.LLILLL, this.LLILZ, Shader.TileMode.MIRROR);
        } else {
            RectF rectF4 = this.LLJILLL;
            linearGradient2 = new LinearGradient(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, this.LLILLL, this.LLIZ, Shader.TileMode.CLAMP);
        }
        if ((!this.LLJJI || this.LLJJIJI) && !this.LLJJIII) {
            getPaint().setShader(linearGradient2);
            Path pathLIZ = C0GW9.LIZ(this.LLJJL, LIZ(width), getHeight(), 24.0f, 24.0f);
            this.LLJJL = pathLIZ;
            canvas.drawPath(pathLIZ, getPaint());
        } else {
            getPaint().setShader(linearGradient2);
            canvas.drawRect(this.LLJILLL, getPaint());
        }
        getPaint().setShader(null);
    }

    public final void setCoverWidth(float f) {
        this.LLJIJIL = f;
    }

    public final void setCriticalBuff(boolean z) {
        this.LLJJIJI = z;
        invalidate();
    }

    public final void setExtraSpace(float f) {
        this.LLJJJ = f;
    }

    public final void setLeftValue(long j) {
        this.LLJJI = false;
        this.LLJ = j;
        if (this.LLJI + j == 0) {
            this.LLJJI = true;
            setProgress(0.5f);
        } else {
            setProgress(j / (j + r3));
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final void setRightValue(long j) {
        this.LLJJI = false;
        this.LLJI = j;
        long j2 = this.LLJ;
        if (j + j2 == 0) {
            this.LLJJI = true;
            setProgress(0.5f);
        } else {
            setProgress(j2 / (j2 + j));
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final void setSmokeDebuff(boolean z) {
        this.LLJJIII = z;
        invalidate();
    }

    public C20478815Bi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILJILJ = C1935407i4.LIZ(AFwS192S0000000_6.get$arr$(640));
        this.LLJILLL = new RectF();
        this.LLJJ = new RectF();
        this.LLJJI = true;
        this.LLJJIJIIJIL = C1935407i4.LIZ(AFwS199S0000000_12.get$arr$(559));
        this.LLJJIJIL = C1935407i4.LIZ(AFwS199S0000000_12.get$arr$(560));
        this.LLJJJJLIIL = new Path();
        this.LLJ = 0L;
        this.LLJI = 0L;
        this.LLIZLLLIL = 0.5f;
        this.LLILLL = C497740JfY.LJFF(R.color.a8h);
        this.LLILZ = C497740JfY.LJFF(R.color.a8f);
        this.LLILZIL = C497740JfY.LJFF(R.color.a8n);
        this.LLILZLL = C497740JfY.LJFF(R.color.a8l);
        this.LLIZ = C497740JfY.LJFF(R.color.a8j);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PKProgressBar);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.PKProgressBar_stripesBackgroundColor, -7829368);
        C0GW7 c0gw7 = new C0GW7(typedArrayObtainStyledAttributes.getDimension(R$styleable.PKProgressBar_stripesSkewWidth, 8.0f), typedArrayObtainStyledAttributes.getColor(R$styleable.PKProgressBar_stripesSkewColor, -1), typedArrayObtainStyledAttributes.getDimension(R$styleable.PKProgressBar_stripesSpaceWidth, 8.0f), color);
        this.LLJJJJJIL = c0gw7;
        c0gw7.LLJILJILJ = new AwS575S0100000_31(this, 1633);
        typedArrayObtainStyledAttributes.recycle();
        Map<String, Object> map = C1338270kvh.LIZ;
    }
}
