package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Rok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707280Rok extends View {
    public static final C707290Rol LLJL = new C707290Rol(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    public static final LinearGradient LLJLIL = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, 0, 0, Shader.TileMode.CLAMP);
    public final C707270Roj LL;
    public final C707290Rol LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public final Paint LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final C01GW LLJILJILJ;
    public final int LLJILLL;
    public C707290Rol LLJJ;
    public RectF LLJJI;
    public float LLJJIII;
    public LinearGradient LLJJIJI;
    public LinearGradient LLJJIJIIJIL;
    public LinearGradient LLJJIJIL;
    public LinearGradient LLJJJ;
    public float LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    private final ValueAnimator getProgressUpdateAnimator() {
        return (ValueAnimator) this.LLJJJJLIIL.getValue();
    }

    private final C707270Roj getRealProgressItemConfig() {
        return (C707270Roj) this.LLJILJILJ.getValue();
    }

    private final ValueAnimator getTranslateToLeftAnimator() {
        return (ValueAnimator) this.LLJJL.getValue();
    }

    private final ValueAnimator getTranslateToRightAnimator() {
        return (ValueAnimator) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void LIZJ() {
        C707290Rol c707290Rol = this.LLILLJJLI;
        if (c707290Rol == null) {
            float fLIZIZ = C418440Gaw.LIZIZ(12);
            float fLIZIZ2 = C418440Gaw.LIZIZ(12);
            float fLIZIZ3 = C418440Gaw.LIZIZ(2);
            float f = this.LLJ - (2 * fLIZIZ2);
            int iLIZIZ = (int) ((f + fLIZIZ3) / (C418440Gaw.LIZIZ(20) + fLIZIZ3));
            c707290Rol = new C707290Rol(fLIZIZ3, C418440Gaw.LIZIZ(2), (f - ((iLIZIZ - 1) * fLIZIZ3)) / iLIZIZ, fLIZIZ, fLIZIZ2, 2, iLIZIZ, (iLIZIZ - this.LLJILLL) - 1);
        } else {
            int i = this.LLJ;
            if (i > 0) {
                float f2 = c707290Rol.LJ;
                float f3 = i - (2 * f2);
                float f4 = c707290Rol.LIZ;
                int i2 = (int) (((double) (f3 + f4)) / ((((double) i) * 0.05d) + ((double) f4)));
                if (i2 > 0) {
                    c707290Rol = new C707290Rol(f4, c707290Rol.LIZIZ, (f3 - ((i2 - 1) * f4)) / i2, c707290Rol.LIZLLL, f2, c707290Rol.LJFF, i2, (i2 - r13) - 1);
                }
            }
        }
        this.LLJJ = c707290Rol;
        C707290Rol c707290Rol2 = this.LLJJ;
        float f5 = c707290Rol2.LIZLLL;
        this.LLJJI = new RectF(0.0f, f5, 0.0f, c707290Rol2.LIZIZ + f5);
        C707290Rol c707290Rol3 = this.LLJJ;
        this.LLJJIII = (c707290Rol3.LIZJ * this.LLJILLL) + (c707290Rol3.LIZ * (r2 - 1));
        float f6 = this.LLJJ.LJ;
        RectF rectF = this.LLJJI;
        this.LLJJIJI = new LinearGradient(f6, rectF.top, f6 + this.LLJJIII, rectF.bottom, 0, getRealProgressItemConfig().LIZIZ, Shader.TileMode.CLAMP);
        int i3 = this.LLJ;
        float f7 = this.LLJJ.LJ;
        float f8 = (i3 - f7) - this.LLJJIII;
        RectF rectF2 = this.LLJJI;
        this.LLJJIJIIJIL = new LinearGradient(f8, rectF2.top, i3 - f7, rectF2.bottom, getRealProgressItemConfig().LIZIZ, 0, Shader.TileMode.CLAMP);
        int i4 = this.LLJ;
        float f9 = this.LLJJ.LJ;
        float f10 = (i4 - f9) - this.LLJJIII;
        RectF rectF3 = this.LLJJI;
        this.LLJJIJIL = new LinearGradient(f10, rectF3.top, i4 - f9, rectF3.bottom, getRealProgressItemConfig().LIZ, 0, Shader.TileMode.CLAMP);
        float f11 = this.LLJJ.LJ;
        RectF rectF4 = this.LLJJI;
        this.LLJJJ = new LinearGradient(f11, rectF4.top, f11 + this.LLJJIII, rectF4.bottom, 0, getRealProgressItemConfig().LIZ, Shader.TileMode.CLAMP);
    }

    public final float LIZ(int i) {
        float f = this.LLJ;
        C707290Rol c707290Rol = this.LLJJ;
        float f2 = f - (c707290Rol.LJ * 2);
        int i2 = c707290Rol.LJI;
        if (i > i2) {
            float f3 = c707290Rol.LIZ;
            return ((f2 + f3) / i2) - f3;
        }
        float f4 = c707290Rol.LIZ;
        return ((f2 + f4) / i) - f4;
    }

    public final void LIZIZ(Canvas canvas) {
        canvas.drawRoundRect(this.LLJJI, getRealProgressItemConfig().LIZJ, getRealProgressItemConfig().LIZJ, this.LLJI);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        if (i == this.LLJ) {
            return;
        }
        this.LLJ = i;
        if (this.LLILLL > 0) {
            if (getProgressUpdateAnimator().isRunning()) {
                getProgressUpdateAnimator().cancel();
            }
            if (getTranslateToLeftAnimator().isRunning()) {
                getTranslateToLeftAnimator().cancel();
            }
            if (getTranslateToRightAnimator().isRunning()) {
                getTranslateToRightAnimator().cancel();
            }
        }
        LIZJ();
        int i2 = this.LLILLL;
        if (i2 > 0) {
            this.LLILZ = LIZ(i2);
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[PHI: r4 r5 r6
      0x009d: PHI (r4v1 boolean) = (r4v3 boolean), (r4v4 boolean), (r4v4 boolean) binds: [B:21:0x0080, B:18:0x0079, B:19:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r5v1 int) = (r5v3 int), (r5v4 int), (r5v4 int) binds: [B:21:0x0080, B:18:0x0079, B:19:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r6v2 int) = (r6v4 int), (r6v5 int), (r6v5 int) binds: [B:21:0x0080, B:18:0x0079, B:19:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C707280Rok.onDraw(android.graphics.Canvas):void");
    }

    public final void setMaxProgressCount(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMaxProgressCount, count=");
        sbLIZ.append(i);
        sbLIZ.append(", currentCount=");
        sbLIZ.append(this.LLILLL);
        C1720106oR.LJI("OverLengthSlidingProgressBar", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL == i) {
            return;
        }
        this.LLILLL = i;
        this.LLILZ = LIZ(i);
        postInvalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        C707290Rol c707290Rol = this.LLJJ;
        setMeasuredDimension(size, (int) ((c707290Rol.LIZLLL * 2) + c707290Rol.LIZIZ));
    }

    public C707280Rok(Context context, C707270Roj c707270Roj, C707290Rol c707290Rol) {
        int iIntValue;
        int iIntValue2;
        super(context, null, 0);
        this.LL = c707270Roj;
        this.LLILLJJLI = c707290Rol;
        this.LLJ = context.getResources().getDisplayMetrics().widthPixels;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LLJI = paint;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e8, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -3355444;
        }
        this.LLJIJIL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ef, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -1;
        }
        this.LLJILJIL = iIntValue2;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1337));
        this.LLJILLL = 2;
        this.LLJJ = LLJL;
        this.LLJJI = new RectF();
        LinearGradient linearGradient = LLJLIL;
        this.LLJJIJI = linearGradient;
        this.LLJJIJIIJIL = linearGradient;
        this.LLJJIJIL = linearGradient;
        this.LLJJJ = linearGradient;
        LIZJ();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1336));
        this.LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1338));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1339));
    }

    public final void LIZLLL(float f, int i, long j) {
        int i2;
        C707290Rol c707290Rol;
        int i3;
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setProgress position=");
        sbLIZ.append(i);
        sbLIZ.append(", progress=");
        sbLIZ.append(f);
        sbLIZ.append(", animationInterval=");
        sbLIZ.append(j);
        C1720106oR.LJI("OverLengthSlidingProgressBar", C2188811AlT.LIZIZ(sbLIZ));
        if (i >= 0 && i < (i2 = this.LLILLL)) {
            if (f >= 0.0f && f <= 1.0f) {
                int i5 = this.LLILZIL;
                if (i5 < i) {
                    C707290Rol c707290Rol2 = this.LLJJ;
                    int i6 = c707290Rol2.LJII;
                    if (i > i6 && i5 < i2 - (c707290Rol2.LJI - i6)) {
                        if (getTranslateToRightAnimator().isRunning()) {
                            getTranslateToRightAnimator().cancel();
                        }
                        if (getTranslateToLeftAnimator().isRunning()) {
                            getTranslateToLeftAnimator().cancel();
                        }
                        ValueAnimator translateToLeftAnimator = getTranslateToLeftAnimator();
                        C707290Rol c707290Rol3 = this.LLJJ;
                        translateToLeftAnimator.setFloatValues(0.0f, -(c707290Rol3.LIZ + c707290Rol3.LIZJ));
                        getTranslateToLeftAnimator().start();
                    }
                } else if (i5 > i && i5 > (i3 = (c707290Rol = this.LLJJ).LJII) && i < i2 - (c707290Rol.LJI - i3)) {
                    if (getTranslateToRightAnimator().isRunning()) {
                        getTranslateToRightAnimator().cancel();
                    }
                    if (getTranslateToLeftAnimator().isRunning()) {
                        getTranslateToLeftAnimator().cancel();
                    }
                    ValueAnimator translateToRightAnimator = getTranslateToRightAnimator();
                    C707290Rol c707290Rol4 = this.LLJJ;
                    translateToRightAnimator.setFloatValues(-(c707290Rol4.LIZ + c707290Rol4.LIZJ), 0.0f);
                    getTranslateToRightAnimator().start();
                }
                ValueAnimator progressUpdateAnimator = getProgressUpdateAnimator();
                if (progressUpdateAnimator != null) {
                    progressUpdateAnimator.cancel();
                }
                if (this.LLILZIL == i && f > this.LLILZLL && j > 0) {
                    getProgressUpdateAnimator().setFloatValues(this.LLIZ, f);
                    getProgressUpdateAnimator().setDuration(j);
                    this.LLILZIL = i;
                    this.LLILZLL = f;
                    getProgressUpdateAnimator().start();
                    return;
                }
                this.LLILZIL = i;
                this.LLILZLL = f;
                this.LLIZ = f;
                postInvalidate();
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setProgress progress overflow, progress=");
            sbLIZ2.append(f);
            C1720106oR.LJI("OverLengthSlidingProgressBar", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("setProgress position overflow, position=");
        sbLIZ3.append(i);
        C1720106oR.LJI("OverLengthSlidingProgressBar", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
