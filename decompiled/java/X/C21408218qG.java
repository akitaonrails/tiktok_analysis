package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VERecordData;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18qG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21408218qG extends C21408118qF {
    public final float LLLF;
    public final float LLLFF;
    public final float LLLFFI;
    public long LLLFZ;
    public final C01GW LLLI;
    public final float LLLII;
    public int[] LLLIIII;
    public float[] LLLIIIIL;
    public float LLLIIIL;

    private final RectF getMArcRectF() {
        return (RectF) this.LLLI.getValue();
    }

    @Override // X.C21408118qF
    public final void LIZIZ(Canvas canvas) {
        this.LLILZ.setStrokeCap(Paint.Cap.BUTT);
        Iterator<VERecordData.VERecordSegmentData> it2 = this.LLJLIL.iterator();
        long j = 0;
        long j2 = 0;
        while (it2.hasNext()) {
            j2 += it2.next().mVideoLength;
        }
        float f = 360.0f / j2;
        Iterator<VERecordData.VERecordSegmentData> it3 = this.LLJLIL.iterator();
        float f2 = -90.0f;
        float f3 = -90.0f;
        int i = 0;
        while (it3.hasNext()) {
            int i2 = i + 1;
            float f4 = it3.next().mVideoLength * f;
            if (i == this.LLJLILLLLZIIL) {
                float f5 = f * LSPassThroughRecordSizeConfig.DEFAULT;
                long j3 = this.LLLFZ;
                if (j3 > 0) {
                    float f6 = j3 * f5;
                    if (canvas != null) {
                        canvas.drawArc(getMArcRectF(), f3, f6, false, this.LLILZLL);
                        canvas.drawArc(getMArcRectF(), ((f6 + f3) - this.LLLFFI) + this.LLLFF, this.LLLF, false, this.LLIZLLLIL);
                    }
                }
                if (this.LLJZ != null && this.LLJLLL >= 0) {
                    this.LLILZIL.setStrokeCap(Paint.Cap.BUTT);
                    float fMin = Math.min(this.LLJLLL * f5, f4);
                    if (canvas != null) {
                        canvas.drawArc(getMArcRectF(), f3, fMin, false, this.LLILZIL);
                    }
                    List<TimeSpeedModelExtension> list = this.LLJZ;
                    if (list != null) {
                        float fCalculateRealTime = f3;
                        for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
                            fCalculateRealTime += TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()) * f5;
                            if (fCalculateRealTime < f4 + f3 && canvas != null) {
                                canvas.drawArc(getMArcRectF(), this.LLLFF + (fCalculateRealTime - this.LLLFFI), this.LLLF, false, this.LLIZLLLIL);
                            }
                        }
                    }
                }
                if (this.LLJJL) {
                    this.LLJILJILJ.setAlpha((int) (this.LLJJJJLIIL * 255));
                    if (canvas != null) {
                        f3 = f3;
                        canvas.drawArc(getMArcRectF(), f3, f4, false, this.LLJILJILJ);
                    }
                }
            } else if (canvas != null) {
                f3 = f3;
                canvas.drawArc(getMArcRectF(), f3, f4, false, this.LLIZ);
            }
            f3 += f4;
            i = i2;
        }
        Iterator<VERecordData.VERecordSegmentData> it4 = this.LLJLIL.iterator();
        while (it4.hasNext()) {
            j += it4.next().mVideoLength;
        }
        float f7 = 360.0f / j;
        Iterator<VERecordData.VERecordSegmentData> it5 = this.LLJLIL.iterator();
        int i3 = 0;
        while (it5.hasNext()) {
            int i4 = i3 + 1;
            float f8 = it5.next().mVideoLength * f7;
            if (i3 == this.LLJLILLLLZIIL) {
                this.LLJILJIL.setAlpha((int) (this.LLJJJJJIL * 255));
                if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), f2 - this.LLLFFI, this.LLLF, false, this.LLJILJIL);
                }
            } else if (canvas != null) {
                canvas.drawArc(getMArcRectF(), f2 - this.LLLFFI, this.LLLF, false, this.LLIZLLLIL);
            }
            f2 += f8;
            i3 = i4;
        }
    }

    public final float LJIIIIZZ(long j) {
        long j2 = this.LLJJIJIL;
        if (j2 > 0) {
            j = Math.min(j, j2);
        }
        if (this.LLILLJJLI == null) {
            return Math.min((j / this.LLJJIJIIJIL) * 360, 360.0f);
        }
        return Math.min((j / (this.LLJJIJIIJIL + ((long) r0.getDuration()))) * 360, 360.0f);
    }

    @Override // X.C21408118qF, android.view.View
    public final void onDraw(Canvas canvas) {
        float fMin;
        if (this.LLJJLIIIJLLLLLLLZ == 2) {
            LIZIZ(canvas);
            return;
        }
        this.LLILZ.setStrokeCap(Paint.Cap.ROUND);
        this.LLILZIL.setStrokeCap(Paint.Cap.ROUND);
        float fLJIIIIZZ = LJIIIIZZ(this.LLILLL);
        long j = this.LLLFZ;
        if (j > 0) {
            if (this.LLILLJJLI == null) {
                fMin = Math.min((j / this.LLJJIJIIJIL) * 360, 360.0f);
            } else {
                fMin = Math.min(((j + r4.getDuration()) / (this.LLJJIJIIJIL + ((long) this.LLILLJJLI.getDuration()))) * 360, 360.0f);
            }
            if (canvas != null) {
                canvas.drawArc(getMArcRectF(), -90.0f, fMin + this.LLLFF, false, this.LLILZLL);
                if (fMin < 360.0f) {
                    canvas.drawArc(getMArcRectF(), (fMin - 90.0f) + this.LLLFF, this.LLLF, false, this.LLIZLLLIL);
                } else {
                    canvas.drawArc(getMArcRectF(), (fMin - 90.0f) - this.LLLFFI, this.LLLF, false, this.LLIZLLLIL);
                }
            }
        }
        if (this.LLILLJJLI == null) {
            if (canvas != null) {
                canvas.drawArc(getMArcRectF(), -90.0f, fLJIIIIZZ, false, this.LLILZIL);
            }
        } else {
            float fLJIIIIZZ2 = LJIIIIZZ(r2.getDuration());
            if (canvas != null) {
                if (fLJIIIIZZ > fLJIIIIZZ2) {
                    if (fLJIIIIZZ >= 359.0f) {
                        this.LLJIJIL.setStrokeCap(Paint.Cap.BUTT);
                        this.LLJ.setStrokeCap(Paint.Cap.BUTT);
                    } else {
                        this.LLJIJIL.setStrokeCap(Paint.Cap.ROUND);
                        this.LLJ.setStrokeCap(Paint.Cap.ROUND);
                    }
                    canvas.drawArc(getMArcRectF(), fLJIIIIZZ2 - 90.0f, fLJIIIIZZ - fLJIIIIZZ2, false, this.LLJIJIL);
                } else {
                    this.LLJIJIL.setStrokeCap(Paint.Cap.ROUND);
                    this.LLJ.setStrokeCap(Paint.Cap.ROUND);
                }
                canvas.drawArc(getMArcRectF(), -90.0f, fLJIIIIZZ2, false, this.LLJ);
            }
        }
        if (!this.LLJL) {
            LIZ(fLJIIIIZZ, canvas);
        }
    }

    public final void setCircleRadius(float f) {
        if (this.LLLIIIL == f) {
            return;
        }
        this.LLLIIIL = f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        getMArcRectF().left = (measuredWidth - f) + this.LLLII;
        getMArcRectF().top = (measuredHeight - f) + this.LLLII;
        getMArcRectF().right = (measuredWidth + f) - this.LLLII;
        getMArcRectF().bottom = (measuredHeight + f) - this.LLLII;
        invalidate();
    }

    public final void setCountDownStopTime(long j) {
        this.LLLFZ = j;
    }

    public final void setProgressColor(int i) {
        Paint paint = this.LLILZIL;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public C21408218qG(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        super(context, attributeSet, 0);
        this.LLLF = 3.0f;
        this.LLLFF = 2.0f;
        float f = 2;
        this.LLLFFI = 3.0f / f;
        this.LLLFZ = -1L;
        this.LLLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 21));
        float fLIZJ = C12ES.LIZJ(6.0f, context);
        this.LLLII = fLIZJ / f;
        C1361400lX0 c1361400lX0LJ = C1388190mED.LJ(R.style.y3, getContext());
        Paint paint = this.LLILZIL;
        if (paint != null) {
            paint.setStrokeWidth(fLIZJ);
            paint.setStyle(Paint.Style.STROKE);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, c1361400lX0LJ);
            if (numLIZJ != null) {
                iIntValue5 = numLIZJ.intValue();
            } else {
                iIntValue5 = -65536;
            }
            paint.setColor(iIntValue5);
        }
        Paint paint2 = this.LLILZLL;
        if (paint2 != null) {
            paint2.setStrokeWidth(fLIZJ);
            paint2.setStyle(Paint.Style.STROKE);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e8, c1361400lX0LJ);
            if (numLIZJ2 != null) {
                iIntValue4 = numLIZJ2.intValue();
            } else {
                iIntValue4 = -1;
            }
            paint2.setColor(iIntValue4);
        }
        Paint paint3 = this.LLIZLLLIL;
        if (paint3 != null) {
            paint3.setStrokeWidth(fLIZJ);
            paint3.setStyle(Paint.Style.STROKE);
        }
        Paint paint4 = this.LLILZ;
        if (paint4 != null) {
            paint4.setStrokeWidth(fLIZJ);
            paint4.setStyle(Paint.Style.STROKE);
        }
        Paint paint5 = this.LLIZ;
        if (paint5 != null) {
            paint5.setStrokeWidth(fLIZJ);
            paint5.setStyle(Paint.Style.STROKE);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a04, c1361400lX0LJ);
            if (numLIZJ3 != null) {
                iIntValue3 = numLIZJ3.intValue();
            } else {
                iIntValue3 = -65536;
            }
            paint5.setColor(iIntValue3);
            paint5.setAlpha(86);
        }
        Paint paint6 = this.LLJILJIL;
        if (paint6 != null) {
            paint6.setStrokeWidth(fLIZJ);
            paint6.setStyle(Paint.Style.STROKE);
        }
        Paint paint7 = this.LLJILJILJ;
        if (paint7 != null) {
            paint7.setStrokeWidth(fLIZJ);
            paint7.setStyle(Paint.Style.STROKE);
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a04, c1361400lX0LJ);
            if (numLIZJ4 != null) {
                iIntValue2 = numLIZJ4.intValue();
            } else {
                iIntValue2 = -65536;
            }
            paint7.setColor(iIntValue2);
        }
        Paint paint8 = this.LLJ;
        if (paint8 != null) {
            paint8.setStrokeWidth(fLIZJ);
            paint8.setStyle(Paint.Style.STROKE);
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a04, c1361400lX0LJ);
            paint8.setColor(numLIZJ5 != null ? numLIZJ5.intValue() : -65536);
        }
        Paint paint9 = this.LLJIJIL;
        if (paint9 != null) {
            paint9.setStrokeWidth(fLIZJ);
            paint9.setStyle(Paint.Style.STROKE);
            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a09, c1361400lX0LJ);
            if (numLIZJ6 != null) {
                iIntValue = numLIZJ6.intValue();
            } else {
                iIntValue = -16776961;
            }
            paint9.setColor(iIntValue);
        }
        this.LLLIIIL = -1.0f;
    }

    @Override // X.C21408118qF
    public final void LIZ(float f, Canvas canvas) {
        TimeSpeedModelExtension timeSpeedModelExtension = this.LLILLJJLI;
        long jCalculateRealTime = 0;
        Canvas canvas2 = canvas;
        if (timeSpeedModelExtension != null) {
            long duration = ((long) timeSpeedModelExtension.getDuration()) + 0;
            float fLJIIIIZZ = LJIIIIZZ(duration);
            if (fLJIIIIZZ < 360.0f) {
                if (f >= 359.0f) {
                    if (canvas2 != null) {
                        canvas2.drawArc(getMArcRectF(), fLJIIIIZZ - 90.0f, this.LLLF, false, this.LLIZLLLIL);
                    }
                } else if (canvas2 != null) {
                    canvas2 = canvas2;
                    canvas2.drawArc(getMArcRectF(), this.LLLFF + (fLJIIIIZZ - 90.0f), this.LLLF, false, this.LLIZLLLIL);
                }
            } else if (canvas2 != null) {
                canvas2.drawArc(getMArcRectF(), (fLJIIIIZZ - 90.0f) - this.LLLFFI, this.LLLF, false, this.LLIZLLLIL);
            }
            jCalculateRealTime = duration;
        }
        List<TimeSpeedModelExtension> list = this.LL;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) ListProtector.get(this.LL, i);
                jCalculateRealTime += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed());
                float fLJIIIIZZ2 = LJIIIIZZ(jCalculateRealTime);
                if (fLJIIIIZZ2 < 360.0f) {
                    if (canvas2 != null) {
                        canvas2.drawArc(getMArcRectF(), this.LLLFF + (fLJIIIIZZ2 - 90.0f), this.LLLF, false, this.LLIZLLLIL);
                    }
                } else if (canvas2 != null) {
                    canvas2.drawArc(getMArcRectF(), (fLJIIIIZZ2 - 90.0f) - this.LLLFFI, this.LLLF, false, this.LLIZLLLIL);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int[] iArr = this.LLLIIII;
        float[] fArr = this.LLLIIIIL;
        if (i > 0 && i2 > 0 && iArr != null && fArr != null) {
            Paint paint = this.LLILZIL;
            if (paint != null) {
                paint.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), iArr, fArr, Shader.TileMode.CLAMP));
                return;
            }
            return;
        }
        Paint paint2 = this.LLILZIL;
        if (paint2 == null) {
            return;
        }
        paint2.getShader();
    }
}
