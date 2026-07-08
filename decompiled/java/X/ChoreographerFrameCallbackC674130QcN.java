package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ChoreographerFrameCallbackC674130QcN extends View implements Choreographer.FrameCallback {
    public static final float LLJILJIL = C418440Gaw.LIZIZ(Double.valueOf(4.5d));
    public static final float LLJILJILJ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
    public static final float LLJILLL = C418440Gaw.LIZIZ(6);
    public static final float LLJJ = C418440Gaw.LIZIZ(12);
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public final List<Float> LLILZ;
    public final List<Float> LLILZIL;
    public boolean LLILZLL;
    public final Choreographer LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public float LLJIJIL;

    private final float getCeiling() {
        return C672250QYl.LIZJ().voiceInputVoiceCeiling;
    }

    private final float getFloor() {
        return C672250QYl.LIZJ().voiceInputNoiseFloor;
    }

    private final float getSmoothFactor() {
        return C672250QYl.LIZJ().voiceInputVoiceSmoothFactor;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZLL = false;
        this.LLIZ.removeFrameCallback(this);
    }

    public final float LIZ(float f) {
        float ceiling = getCeiling() - getFloor();
        if (ceiling > 0.0f && f >= getFloor()) {
            float smoothFactor = (this.LLJIJIL * getSmoothFactor()) + (C13LZ.LIZLLL((f - getFloor()) / ceiling, 0.0f, 1.0f) * (1 - getSmoothFactor()));
            this.LLJIJIL = smoothFactor;
            return smoothFactor;
        }
        return f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.LLILZLL) {
            this.LLJ = j;
            invalidate();
            this.LLIZ.postFrameCallback(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Float f;
        float fLIZ;
        List listLLIIII;
        int iIntValue;
        float width;
        Paint paint;
        super.onDraw(canvas);
        if (this.LLILZLL) {
            long j = this.LLIZLLLIL;
            if (j != 0) {
                long j2 = (this.LLJ - j) / 66000000;
                float f2 = (r10 % 66000000) / 66000000;
                synchronized (this) {
                    try {
                        long j3 = this.LLJI;
                        if (j2 > j3 || j3 < 0) {
                            if (((ArrayList) this.LLILZ).size() > 1) {
                                f = (Float) C19719612Di.LJJIIZI(this.LLILZ);
                            } else {
                                f = (Float) C13LP.LJJJLL(this.LLILZ);
                            }
                            if (f != null) {
                                fLIZ = f.floatValue();
                            } else {
                                fLIZ = LIZ(0.0f);
                            }
                            ((ArrayList) this.LLILZIL).add(0, Float.valueOf(Math.max(fLIZ * getHeight(), LLJILLL)));
                            if (((ArrayList) this.LLILZIL).size() > (getWidth() / LLJILJIL) + 2) {
                                List<Float> list = this.LLILZIL;
                                ((ArrayList) list).remove(((ArrayList) list).size() - 1);
                            }
                            this.LLJI = j2;
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
                int i = 0;
                for (Object obj : listLLIIII) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        float fFloatValue = ((Number) obj).floatValue();
                        if (getLayoutDirection() == 1) {
                            width = (i + f2) * LLJILJIL;
                        } else {
                            width = getWidth() - ((i + f2) * LLJILJIL);
                        }
                        float f3 = LLJILJIL;
                        if (width >= (-f3) && width <= getWidth() + f3) {
                            if (fFloatValue >= 0.0f) {
                                paint = this.LL;
                            } else {
                                fFloatValue = LLJILLL;
                                paint = this.LLILLJJLI;
                            }
                            float f4 = LLJILJILJ / 2;
                            float height = (canvas.getHeight() - fFloatValue) / 2.0f;
                            float f5 = width;
                            canvas.drawLine(f5, height + f4, width, (fFloatValue + height) - f4, paint);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                float height2 = getHeight();
                float width2 = getWidth();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -1;
                }
                int i3 = iIntValue & 16777215;
                Paint paint2 = this.LLILLL;
                float f6 = LLJJ;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, f6, 0.0f, iIntValue, i3, Shader.TileMode.CLAMP));
                canvas.drawRect(0.0f, 0.0f, f6, height2, this.LLILLL);
                float f7 = width2 - f6;
                this.LLILLL.setShader(new LinearGradient(f7, 0.0f, width2, 0.0f, i3, iIntValue, Shader.TileMode.CLAMP));
                canvas.drawRect(f7, 0.0f, width2, height2, this.LLILLL);
            }
        }
    }

    public ChoreographerFrameCallbackC674130QcN(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.gs, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16729420;
        }
        paint.setColor(iIntValue);
        float f = LLJILJILJ;
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.LL = paint;
        Paint paint2 = new Paint();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 520093696;
        }
        paint2.setColor(iIntValue2);
        paint2.setStrokeWidth(f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.LLILLJJLI = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        this.LLILLL = paint3;
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
        this.LLIZ = C786410Ut5.v2();
        this.LLJI = -1L;
    }
}
