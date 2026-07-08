package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0yNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class ChoreographerFrameCallbackC1855380yNk extends View implements Choreographer.FrameCallback {
    public static final float LLJILLL = C418440Gaw.LIZIZ(Double.valueOf(6.5d));
    public static final float LLJJ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
    public static final float LLJJI = C418440Gaw.LIZIZ(12);
    public C1855420yNo LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final List<Float> LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public long LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;

    public final void LIZ() {
        this.LLILZLL = false;
        getChoreographer().removeFrameCallback(this);
        Function0<Unit> function0 = this.LL.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LIZJ() {
        this.LLILZLL = false;
        getChoreographer().removeFrameCallback(this);
        Function0<Unit> function0 = this.LL.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final Choreographer getChoreographerDelegate() {
        return (Choreographer) this.LLIZ.getValue();
    }

    public final void LIZIZ() {
        C449180HjQ c449180HjQ = C449180HjQ.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        c449180HjQ.getClass();
        if (!C449180HjQ.LIZJ(activityLIZ)) {
            Activity activityLIZ2 = C1388190mED.LIZ(getContext());
            c449180HjQ.getClass();
            C449180HjQ.LJ(activityLIZ2, null);
            Function1<? super EnumC1855390yNl, Unit> function1 = this.LL.LIZIZ;
            if (function1 != null) {
                function1.invoke(null);
                return;
            }
            return;
        }
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                ((ArrayList) this.LLILZIL).clear();
                this.LLJILJIL = -1L;
                int iLIZIZ = (int) (C497820Jfg.LIZIZ(getContext()) / LLJILLL);
                for (int i = 0; i < iLIZIZ; i++) {
                    ((ArrayList) this.LLILZIL).add(Float.valueOf(-1.0f));
                }
                this.LLILZLL = true;
                this.LLJI = System.nanoTime();
                getChoreographer().removeFrameCallback(this);
                getChoreographer().postFrameCallback(this);
                Function0<Unit> function0 = this.LL.LIZ;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Function1<? super EnumC1855390yNl, Unit> function12 = this.LL.LIZIZ;
        if (function12 != null) {
            function12.invoke(EnumC1855390yNl.COMMON_ERROR);
        }
    }

    private final Choreographer getChoreographer() {
        return (C298800BnS.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) ? getChoreographerDelegate() : C786410Ut5.v2();
    }

    public final C1855420yNo getVoiceWaveListener() {
        return this.LL;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.LLILZLL) {
            this.LLJIJIL = j;
            invalidate();
            getChoreographer().postFrameCallback(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float fMax;
        List listLLIIII;
        int iIntValue;
        Paint paint;
        super.onDraw(canvas);
        if (this.LLILZLL) {
            long j = this.LLJI;
            if (j != 0) {
                long j2 = (this.LLJIJIL - j) / 150000000;
                float f = (r10 % 150000000) / 150000000;
                synchronized (this) {
                    try {
                        long j3 = this.LLJILJIL;
                        i = 0;
                        if (j2 > j3 || j3 < 0) {
                            int i2 = this.LLIZLLLIL;
                            if (i2 > 0) {
                                fMax = Math.max(this.LLJ / i2, 0.1f);
                            } else {
                                fMax = 0.1f;
                            }
                            this.LLIZLLLIL = 0;
                            this.LLJ = 0.0f;
                            ((ArrayList) this.LLILZIL).add(0, Float.valueOf(fMax * (getHeight() - LLJJ)));
                            if (((ArrayList) this.LLILZIL).size() > (getWidth() / LLJILLL) + 2) {
                                ((ArrayList) this.LLILZIL).remove(((ArrayList) r3).size() - 1);
                            }
                            this.LLJILJIL = j2;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                synchronized (this) {
                    try {
                        listLLIIII = C13LP.LLIIII(this.LLILZIL);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                for (Object obj : listLLIIII) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        float fFloatValue = ((Number) obj).floatValue();
                        float f2 = LLJILLL;
                        float f3 = (i + f) * f2;
                        if (f3 >= (-f2) && f3 <= getWidth() + f2) {
                            if (fFloatValue >= 0.0f) {
                                paint = this.LLILLJJLI;
                            } else {
                                fFloatValue = (getHeight() - LLJJ) * 0.1f;
                                paint = this.LLILLL;
                            }
                            float f4 = LLJJ;
                            float height = (f4 / 2) + (((canvas.getHeight() - f4) - fFloatValue) / 2.0f);
                            canvas.drawLine(f3, height, f3, height + fFloatValue, paint);
                        }
                        i = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                float height2 = getHeight();
                float width = getWidth();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -16777216;
                }
                int i4 = iIntValue & 16777215;
                Paint paint2 = this.LLILZ;
                float f5 = LLJJI;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, f5, 0.0f, iIntValue, i4, Shader.TileMode.CLAMP));
                canvas.drawRect(0.0f, 0.0f, f5, height2, this.LLILZ);
                float f6 = width - f5;
                this.LLILZ.setShader(new LinearGradient(f6, 0.0f, width, 0.0f, i4, iIntValue, Shader.TileMode.CLAMP));
                canvas.drawRect(f6, 0.0f, width, height2, this.LLILZ);
            }
        }
    }

    public final void setVoiceInputStateListener(Function1<? super C1855420yNo, Unit> function1) {
        function1.invoke(this.LL);
    }

    public final void setVoiceWaveListener(C1855420yNo c1855420yNo) {
        this.LL = c1855420yNo;
    }

    public ChoreographerFrameCallbackC1855380yNk(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        this.LL = new C1855420yNo(0);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        paint.setColor(iIntValue);
        float f = LLJJ;
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.LLILLJJLI = paint;
        Paint paint2 = new Paint();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
        paint2.setColor(numLIZJ2 != null ? numLIZJ2.intValue() : -16777216);
        paint2.setStrokeWidth(f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.LLILLL = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        this.LLILZ = paint3;
        this.LLILZIL = new ArrayList();
        this.LLIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(233));
        this.LLJILJIL = -1L;
    }
}
