package X;

import Y.AAListenerS328S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ett, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106510ett extends View {
    public final Paint LL;
    public final Path LLILLJJLI;
    public final Path LLILLL;
    public final RectF LLILZ;
    public ValueAnimator LLILZIL;
    public Animator.AnimatorListener LLILZLL;
    public final int[] LLIZ;
    public float[] LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public float LLJILLL;
    public int LLJJ;
    public Interpolator LLJJI;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LLILZIL;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            }
            valueAnimator.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILZIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        this.LLILZIL = null;
    }

    public final boolean getAutoPlay() {
        return this.LLJ;
    }

    public final int getDuration() {
        return this.LLJILJIL;
    }

    public final Interpolator getInterpolator() {
        return this.LLJJI;
    }

    public final int getOffset() {
        return this.LLJJ;
    }

    public final float[] getPositionArray() {
        return this.LLIZLLLIL;
    }

    public final int getRadius() {
        return this.LLJILJILJ;
    }

    public final int getRepeatCount() {
        return this.LLJI;
    }

    public final float getSlope() {
        return this.LLJILLL;
    }

    public final int getSpeed() {
        return this.LLJIJIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ValueAnimator valueAnimator = this.LLILZIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLILLL.reset();
            this.LLILZ.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.LLILLL;
            RectF rectF = this.LLILZ;
            int i = this.LLJILJILJ;
            path.addRoundRect(rectF, i, i, Path.Direction.CW);
            canvas.clipPath(this.LLILLL);
            canvas.drawPath(this.LLILLJJLI, this.LL);
        }
    }

    public final void setAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.LLILZLL = animatorListener;
    }

    public final void setAutoPlay(boolean z) {
        this.LLJ = z;
    }

    public final void setDuration(int i) {
        this.LLJILJIL = i;
    }

    public final void setInterpolator(Interpolator interpolator) {
        this.LLJJI = interpolator;
    }

    public final void setOffset(int i) {
        this.LLJJ = i;
    }

    public final void setPositionArray(float[] fArr) {
        this.LLIZLLLIL = fArr;
    }

    public final void setRadius(int i) {
        this.LLJILJILJ = i;
    }

    public final void setRepeatCount(int i) {
        this.LLJI = i;
    }

    public final void setSlope(float f) {
        this.LLJILLL = f;
    }

    public final void setSpeed(int i) {
        this.LLJIJIL = i;
    }

    public C1106510ett(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint();
        this.LLILLJJLI = new Path();
        this.LLILLL = new Path();
        this.LLILZ = new RectF();
        this.LLIZ = new int[]{0, -1, 0};
        this.LLIZLLLIL = new float[]{0.0f, 0.5f, 1.0f};
        this.LLJIJIL = -1;
        this.LLJILJIL = LivePreCreateNextRoomPlayer.ENABLE;
        this.LLJILLL = 0.5f;
        this.LLJJI = new LinearInterpolator();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SweepLightView);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.SweepLightView_colors);
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.SweepLightView_positions);
        if (strXd != null && strXd2 != null) {
            List listLJJLIIIJ = a0.LJJLIIIJ(strXd, new char[]{','}, false, 0, 6);
            List listLJJLIIIJ2 = a0.LJJLIIIJ(strXd2, new char[]{','}, false, 0, 6);
            if (listLJJLIIIJ.size() == listLJJLIIIJ2.size()) {
                this.LLIZ = new int[listLJJLIIIJ.size()];
                this.LLIZLLLIL = new float[listLJJLIIIJ2.size()];
                Iterator it2 = listLJJLIIIJ.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    this.LLIZ[i] = ColorProtector.parseColor((String) it2.next());
                    i++;
                }
                Iterator it3 = listLJJLIIIJ2.iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    int i3 = i2 + 1;
                    try {
                        this.LLIZLLLIL[i2] = CastFloatProtector.parseFloat((String) it3.next());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLIZLLLIL[i2] = 0.0f;
                    }
                    i2 = i3;
                }
            }
        }
        String strXd3 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.SweepLightView_interpolator_curve);
        if (strXd3 != null) {
            List listLJJLIIIJ3 = a0.LJJLIIIJ(strXd3, new char[]{','}, false, 0, 6);
            if (listLJJLIIIJ3.size() == 4) {
                this.LLJJI = new C2268791DrB(CastFloatProtector.parseFloat((String) ListProtector.get(listLJJLIIIJ3, 0)), CastFloatProtector.parseFloat((String) ListProtector.get(listLJJLIIIJ3, 1)), CastFloatProtector.parseFloat((String) ListProtector.get(listLJJLIIIJ3, 2)), CastFloatProtector.parseFloat((String) ListProtector.get(listLJJLIIIJ3, 3)));
            }
        }
        this.LLJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SweepLightView_auto_play, false);
        this.LLJI = typedArrayObtainStyledAttributes.getInt(R$styleable.SweepLightView_repeat_count, 0);
        this.LLJIJIL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.SweepLightView_speed, -1.0f);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.SweepLightView_duration, LivePreCreateNextRoomPlayer.ENABLE);
        this.LLJILJILJ = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.SweepLightView_radius, 0.0f);
        this.LLJILLL = typedArrayObtainStyledAttributes.getFloat(R$styleable.SweepLightView_slope, 0.0f);
        this.LLJJ = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.SweepLightView_offset, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        long j;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.LLILLJJLI.moveTo(0.0f, 0.0f);
        float f = size;
        this.LLILLJJLI.lineTo(f, 0.0f);
        float f2 = size2;
        this.LLILLJJLI.lineTo(f, f2);
        this.LLILLJJLI.lineTo(0.0f, f2);
        this.LLILLJJLI.close();
        int i3 = this.LLJJ;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-i3, size + i3);
        valueAnimatorOfInt.setRepeatCount(this.LLJI);
        int i4 = this.LLJIJIL;
        if (i4 > 0) {
            j = (long) ((f / i4) * 1000);
        } else {
            j = this.LLJILJIL;
        }
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(valueAnimatorOfInt.getInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(this, 87));
        valueAnimatorOfInt.addListener(new AAListenerS328S0100000_17(this, 21));
        if (this.LLJ) {
            LIZ();
        }
        this.LLILZIL = valueAnimatorOfInt;
    }
}
