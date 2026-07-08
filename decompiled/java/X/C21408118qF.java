package X;

import Y.AUListenerS279S0100000_32;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VERecordData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.18qF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21408118qF extends FrameLayout {
    public static final int LLL = (int) C12ES.LIZJ(3.0f, C786410Ut5.M3(C0CHQ.LIZ));
    public List<TimeSpeedModelExtension> LL;
    public TimeSpeedModelExtension LLILLJJLI;
    public long LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public final Paint LLIZ;
    public final Paint LLIZLLLIL;
    public final Paint LLJ;
    public final Paint LLJI;
    public final Paint LLJIJIL;
    public final Paint LLJILJIL;
    public final Paint LLJILJILJ;
    public final C444890HcV LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public CopyOnWriteArrayList<VERecordData.VERecordSegmentData> LLJLIL;
    public int LLJLILLLLZIIL;
    public ValueAnimator LLJLL;
    public ValueAnimator LLJLLIL;
    public long LLJLLL;
    public List<TimeSpeedModelExtension> LLJZ;
    public final boolean LLJZIJLIL;

    private long getLongVideoAnchorPosition() {
        return LIZLLL(this.LLJJIJI);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LLJLL.removeAllUpdateListeners();
            this.LLJLL = null;
        }
        ValueAnimator valueAnimator2 = this.LLJLLIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.LLJLLIL.removeAllUpdateListeners();
            this.LLJLLIL = null;
        }
    }

    public long getMaxDuration() {
        return this.LLJJIJIIJIL;
    }

    public void LIZIZ(Canvas canvas) {
        float f;
        CopyOnWriteArrayList<VERecordData.VERecordSegmentData> copyOnWriteArrayList = this.LLJLIL;
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            j2 += ((VERecordData.VERecordSegmentData) ListProtector.get(copyOnWriteArrayList, i)).mVideoLength;
        }
        float f2 = this.LLJJ / j2;
        int i2 = 0;
        float f3 = 0.0f;
        while (i2 < this.LLJLIL.size()) {
            int i3 = (int) (this.LLJLIL.get(i2).mVideoLength * f2);
            Canvas canvas2 = canvas;
            if (i2 == this.LLJLILLLLZIIL) {
                this.LLILZ.setStrokeCap(Paint.Cap.BUTT);
                float f4 = this.LLJJIII;
                float f5 = f3 + i3;
                canvas2.drawLine(f3, f4, f5, f4, this.LLILZ);
                if (this.LLJZ != null) {
                    long j3 = this.LLJLLL;
                    if (j3 >= j) {
                        float f6 = f2 * 1000.0f;
                        if (j3 > j) {
                            float f7 = (j3 * f6) + f3;
                            float fMin = Math.min(f7, f5);
                            int i4 = this.LLJLILLLLZIIL;
                            if (i4 == 0) {
                                canvas2.save();
                                canvas2.clipRect(0.0f, 0.0f, this.LLJJIII, this.LLJJI);
                                float f8 = this.LLJJIII;
                                canvas2.drawCircle(f8, f8, f8, this.LLILZIL);
                                canvas2.restore();
                                f = this.LLJJIII + f3;
                            } else {
                                if (f7 >= f5 && i4 == this.LLJLIL.size() - 1) {
                                    canvas2.save();
                                    canvas2.clipRect(f5 - this.LLJJIII, 0.0f, f5, this.LLJJI);
                                    float f9 = this.LLJJIII;
                                    canvas2.drawCircle(f5 - f9, f9, f9, this.LLILZIL);
                                    canvas2.restore();
                                    fMin = f5 - this.LLJJIII;
                                }
                                f = f3;
                            }
                            canvas2.drawRect(f, 0.0f, fMin, this.LLJJI, this.LLILZIL);
                        }
                        if (this.LLJZ != null) {
                            float fCalculateRealTime = f3;
                            for (int i5 = 0; i5 < this.LLJZ.size(); i5++) {
                                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) ListProtector.get(this.LLJZ, i5);
                                fCalculateRealTime += TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()) * f6;
                                if (this.LLJLILLLLZIIL != this.LLJLIL.size() - 1 || fCalculateRealTime < f5) {
                                    float fMin2 = Math.min(fCalculateRealTime, f5);
                                    canvas2.drawRect(fMin2 - LLL, 0.0f, fMin2, this.LLJJI, this.LLIZLLLIL);
                                }
                            }
                        }
                    }
                }
                if (this.LLJJL) {
                    this.LLJILJILJ.setAlpha((int) (this.LLJJJJLIIL * 255.0f));
                    canvas2.drawRect(f3, 0.0f, f5, this.LLJJI, this.LLJILJILJ);
                }
                f3 = f5;
            } else {
                if (i2 == 0) {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, this.LLJJIII, this.LLJJI);
                    float f10 = this.LLJJIII;
                    canvas2.drawCircle(f10, f10, f10, this.LLIZ);
                    canvas2.restore();
                    canvas2.drawRect(this.LLJJIII, 0.0f, Math.min(i3, this.LLJJ - r4), this.LLJJI, LJ(this.LLJLIL.get(i2)));
                } else if (i2 == this.LLJLIL.size() - 1) {
                    canvas2.save();
                    canvas2.clipRect(r4 - this.LLJJIII, 0.0f, this.LLJJ, this.LLJJI);
                    long j4 = this.LLJJ;
                    long j5 = this.LLJJIII;
                    float f11 = j4 - j5;
                    float f12 = j5;
                    canvas2.drawCircle(f11, f12, f12, this.LLIZ);
                    canvas2.restore();
                    canvas2 = canvas2;
                    f3 = f3;
                    canvas2.drawRect(f3, 0.0f, this.LLJJ - this.LLJJIII, this.LLJJI, LJ(this.LLJLIL.get(i2)));
                } else {
                    canvas2 = canvas2;
                    f3 = f3;
                    canvas2.drawRect(f3, 0.0f, f3 + i3, this.LLJJI, LJ(this.LLJLIL.get(i2)));
                }
                f3 += i3;
                if (i2 == this.LLJLILLLLZIIL - 1) {
                    this.LLJILJIL.setAlpha((int) (this.LLJJJJJIL * 255.0f));
                    f3 = f3;
                    canvas2.drawRect(f3 - LLL, 0.0f, f3, this.LLJJI, this.LLJILJIL);
                } else if (i2 != this.LLJLIL.size() - 1) {
                    f3 = f3;
                    canvas2.drawRect(f3 - LLL, 0.0f, f3, this.LLJJI, this.LLIZLLLIL);
                }
            }
            i2++;
            j = 0;
        }
    }

    public final long LIZLLL(long j) {
        return (long) (((j * 1.0d) * this.LLJJ) / this.LLJJIJIIJIL);
    }

    public final Paint LJ(VERecordData.VERecordSegmentData vERecordSegmentData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PGRPAINT: mVideo =");
        sbLIZ.append(vERecordSegmentData.mVideo);
        C2188811AlT.LIZIZ(sbLIZ);
        if (vERecordSegmentData.mVideo.startsWith(C1449640npK.LIZ) && vERecordSegmentData.mVideo.contains("concat")) {
            return this.LLJI;
        }
        return this.LLIZ;
    }

    public final void LJI(boolean z) {
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator == null) {
            return;
        }
        if (z) {
            valueAnimator.start();
        } else {
            valueAnimator.end();
            this.LLJJJJJIL = 1.0f;
        }
    }

    public final void LJII(RetakeVideoContext retakeVideoContext) {
        if (retakeVideoContext.recordData == null) {
            return;
        }
        CopyOnWriteArrayList<VERecordData.VERecordSegmentData> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LLJLIL = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(retakeVideoContext.recordData.getSegmentData());
        this.LLJLILLLLZIIL = retakeVideoContext.retakeIndex;
        this.LLJJLIIIJLLLLLLLZ = 2;
        if (this.LLJZ != null) {
            this.LLJZ = null;
        }
        this.LLJLLL = 0L;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        Paint paint2;
        Paint paint3;
        float f2;
        long jCalculateRealTime;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        float f3;
        float f4;
        long j = 0;
        Canvas canvas2 = canvas;
        if (this.LLJJLIIIJLLLLLLLZ == 2) {
            if (this.LLJZIJLIL) {
                CopyOnWriteArrayList<VERecordData.VERecordSegmentData> copyOnWriteArrayList = this.LLJLIL;
                long j2 = 0;
                for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                    j2 += ((VERecordData.VERecordSegmentData) ListProtector.get(copyOnWriteArrayList, i)).mVideoLength;
                }
                float f5 = this.LLJJ / j2;
                float f6 = 0.0f;
                int i2 = 0;
                while (i2 < this.LLJLIL.size()) {
                    int i3 = (int) (this.LLJLIL.get(i2).mVideoLength * f5);
                    if (i2 == this.LLJLILLLLZIIL) {
                        this.LLILZ.setStrokeCap(Paint.Cap.BUTT);
                        float f7 = this.LLJJ - f6;
                        float f8 = i3;
                        float f9 = this.LLJJIII;
                        canvas2.drawLine(f7 - f8, f9, f7, f9, this.LLILZ);
                        if (this.LLJZ != null) {
                            long j3 = this.LLJLLL;
                            if (j3 >= j) {
                                float f10 = f6 + f8;
                                float f11 = f5 * 1000.0f;
                                if (j3 > j) {
                                    float f12 = (j3 * f11) + f6;
                                    float fMin = Math.min(f12, f10);
                                    int i4 = this.LLJLILLLLZIIL;
                                    if (i4 == 0) {
                                        canvas2.save();
                                        canvas2.clipRect(r6 - this.LLJJIII, 0.0f, this.LLJJ, this.LLJJI);
                                        long j4 = this.LLJJ;
                                        long j5 = this.LLJJIII;
                                        float f13 = j4 - j5;
                                        float f14 = j5;
                                        canvas2.drawCircle(f13, f14, f14, this.LLILZIL);
                                        canvas2.restore();
                                        f4 = this.LLJJIII + f6;
                                    } else {
                                        if (f12 >= f10 && i4 == this.LLJLIL.size() - 1) {
                                            canvas2.save();
                                            canvas2.clipRect(0.0f, 0.0f, this.LLJJIII, this.LLJJI);
                                            float f15 = this.LLJJIII;
                                            canvas2.drawCircle(f15, f15, f15, this.LLILZIL);
                                            canvas2.restore();
                                            fMin = f10 - this.LLJJIII;
                                        }
                                        f4 = f6;
                                    }
                                    float f16 = this.LLJJ;
                                    canvas2.drawRect(f16 - f4, 0.0f, f16 - fMin, this.LLJJI, this.LLILZIL);
                                }
                                if (this.LLJZ != null) {
                                    float fCalculateRealTime = f6;
                                    for (int i5 = 0; i5 < this.LLJZ.size(); i5++) {
                                        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) ListProtector.get(this.LLJZ, i5);
                                        fCalculateRealTime += TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()) * f11;
                                        if (this.LLJLILLLLZIIL != this.LLJLIL.size() - 1 || fCalculateRealTime < f10) {
                                            float fMin2 = Math.min(fCalculateRealTime, f10);
                                            float f18 = this.LLJJ;
                                            canvas2.drawRect(f18 - (fMin2 - LLL), 0.0f, f18 - fMin2, this.LLJJI, this.LLIZLLLIL);
                                        }
                                    }
                                }
                            }
                        }
                        if (this.LLJJL) {
                            this.LLJILJILJ.setAlpha((int) (this.LLJJJJLIIL * 255.0f));
                            float f19 = this.LLJJ - f6;
                            canvas2.drawRect(f19 - f8, 0.0f, f19, this.LLJJI, this.LLJILJILJ);
                        }
                        f6 += f8;
                    } else {
                        if (i2 == 0) {
                            canvas2.save();
                            canvas2.clipRect(r6 - this.LLJJIII, 0.0f, this.LLJJ, this.LLJJI);
                            long j6 = this.LLJJ;
                            long j7 = this.LLJJIII;
                            float f20 = j6 - j7;
                            float f21 = j7;
                            canvas2.drawCircle(f20, f21, f21, this.LLIZ);
                            canvas2.restore();
                            long j8 = this.LLJJ;
                            long j9 = this.LLJJIII;
                            canvas2.drawRect(j8 - j9, 0.0f, Math.max(j9, j8 - ((long) i3)), this.LLJJI, this.LLIZ);
                        } else if (i2 == this.LLJLIL.size() - 1) {
                            canvas2.save();
                            canvas2.clipRect(0.0f, 0.0f, this.LLJJIII, this.LLJJI);
                            float f22 = this.LLJJIII;
                            canvas2.drawCircle(f22, f22, f22, this.LLIZ);
                            canvas2.restore();
                            canvas2.drawRect(this.LLJJ - f6, 0.0f, this.LLJJIII, this.LLJJI, this.LLIZ);
                        } else {
                            float f23 = this.LLJJ - f6;
                            canvas2.drawRect(f23, 0.0f, f23 - i3, this.LLJJI, this.LLIZ);
                        }
                        f6 += i3;
                        if (i2 == this.LLJLILLLLZIIL - 1) {
                            this.LLJILJIL.setAlpha((int) (this.LLJJJJJIL * 255.0f));
                            float f24 = this.LLJJ;
                            canvas2.drawRect(f24 - (f6 - LLL), 0.0f, f24 - f6, this.LLJJI, this.LLJILJIL);
                        } else if (i2 != this.LLJLIL.size() - 1) {
                            float f25 = this.LLJJ;
                            canvas2.drawRect(f25 - (f6 - LLL), 0.0f, f25 - f6, this.LLJJI, this.LLIZLLLIL);
                        }
                    }
                    i2++;
                    j = 0;
                }
                return;
            }
            LIZIZ(canvas2);
            return;
        }
        long jLIZLLL = LIZLLL(this.LLILLL);
        if (this.LLILLL <= this.LLJJIJIIJIL) {
            if (this.LLJZIJLIL) {
                float f26 = this.LLJJ - jLIZLLL;
                float f27 = this.LLJJIII;
                canvas2.drawLine(f26, f27, 0.0f, f27, this.LLILZ);
            } else {
                float f28 = this.LLJJIII;
                canvas2.drawLine(jLIZLLL, f28, this.LLJJ, f28, this.LLILZ);
            }
        }
        if (this.LLJZIJLIL) {
            if (this.LLILLJJLI == null) {
                float f29 = this.LLJJ - this.LLJJIII;
                if (jLIZLLL > 0) {
                    canvas2.save();
                    canvas2.clipRect(r8 - this.LLJJIII, 0.0f, this.LLJJ, this.LLJJI);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PGRPAINT: drawProgressbarForNormalModeRTL() -> draw a left half-round, radius = ");
                    sbLIZ.append(this.LLJJIII);
                    C2188811AlT.LIZIZ(sbLIZ);
                    long j10 = this.LLJJ;
                    long j11 = this.LLJJIII;
                    float f30 = j10 - j11;
                    float f31 = j11;
                    if (C580130Mp9.LIZ(this.LL)) {
                        paint4 = this.LLILZIL;
                    } else {
                        ListProtector.get(this.LL, 0);
                        paint4 = this.LLILZIL;
                    }
                    canvas2.drawCircle(f30, f31, f31, paint4);
                    canvas2.restore();
                    if (this.LL != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("PGRPAINT: drawProgressbarForNormalModeRTL() -> start to draw progress bar with video segments of = ");
                        sbLIZ2.append(this.LL.size());
                        sbLIZ2.append(" recordedLength =");
                        sbLIZ2.append(jLIZLLL);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        long j12 = 0;
                        int i6 = 0;
                        while (i6 < this.LL.size()) {
                            TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) ListProtector.get(this.LL, i6);
                            long jCalculateRealTime2 = TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed());
                            j12 += jCalculateRealTime2;
                            int iLIZLLL = (int) LIZLLL(jCalculateRealTime2);
                            if (i6 == 0) {
                                f3 = (this.LLJJIII + f29) - iLIZLLL;
                            } else {
                                f3 = f29 - iLIZLLL;
                            }
                            float fMax = Math.max(f3, this.LLJJIII);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("PGRPAINT: drawProgressbarForNormalModeRTL() -> index =");
                            sbLIZ3.append(i6);
                            sbLIZ3.append(" duration =");
                            sbLIZ3.append(timeSpeedModelExtension2.getDuration());
                            sbLIZ3.append(" realTime =");
                            sbLIZ3.append(jCalculateRealTime2);
                            sbLIZ3.append(" curLength =");
                            sbLIZ3.append(iLIZLLL);
                            sbLIZ3.append(" time =");
                            sbLIZ3.append(j12);
                            sbLIZ3.append(" length =");
                            sbLIZ3.append((int) LIZLLL(j12));
                            C2188811AlT.LIZIZ(sbLIZ3);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("PGRPAINT: drawProgressbarForNormalModeRTL() -> startPos =");
                            sbLIZ4.append(f29);
                            sbLIZ4.append(" endPos =");
                            sbLIZ4.append(fMax);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            canvas2.drawRect(f29, 0.0f, fMax, this.LLJJI, this.LLILZIL);
                            i6++;
                            f29 = fMax - 0.1f;
                        }
                        if (this.LLJJ - jLIZLLL < f29) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("PGRPAINT: drawProgressbarForNormalModeRTL -> draw the new recorded video segment startPos =");
                            sbLIZ5.append(f29);
                            sbLIZ5.append(" recordedLength =");
                            sbLIZ5.append(jLIZLLL);
                            sbLIZ5.append(" mWidth =");
                            sbLIZ5.append(this.LLJJ);
                            C2188811AlT.LIZIZ(sbLIZ5);
                            f29 = f29;
                            canvas2.drawRect(f29, 0.0f, Math.max(this.LLJJ - jLIZLLL, this.LLJJIII), this.LLJJI, this.LLILZIL);
                        }
                    }
                    float f32 = this.LLJJ - jLIZLLL;
                    if (f32 < f29 && Math.abs(f29 - f32) < 2.0f) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("PGRPAINT: drawProgressbarForNormalModeRTL -> fill up the gap, startPos =");
                        sbLIZ6.append(f29);
                        sbLIZ6.append(" endPos =");
                        sbLIZ6.append(Math.min(jLIZLLL, this.LLJJ) - this.LLJJIII);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        long j13 = this.LLJJ - jLIZLLL;
                        long j14 = this.LLJJIII;
                        float fMax2 = Math.max(j13 - j14, j14);
                        float f33 = this.LLJJI;
                        if (C580130Mp9.LIZ(this.LL)) {
                            paint6 = this.LLILZIL;
                        } else {
                            ListProtector.get(this.LL, r2.size() - 1);
                            paint6 = this.LLILZIL;
                        }
                        canvas2.drawRect(f29, 0.0f, fMax2, f33, paint6);
                    }
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("PGRPAINT: drawProgressbarForNormalModeRTL -> mTotalRecordingTime =");
                    sbLIZ7.append(this.LLILLL);
                    sbLIZ7.append(" mMaxDuration =");
                    sbLIZ7.append(this.LLJJIJIIJIL);
                    C2188811AlT.LIZIZ(sbLIZ7);
                    if (this.LLILLL >= this.LLJJIJIIJIL) {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, this.LLJJIII, this.LLJJI);
                        float f34 = this.LLJJIII;
                        if (C580130Mp9.LIZ(this.LL)) {
                            paint5 = this.LLILZIL;
                        } else {
                            ListProtector.get(this.LL, r2.size() - 1);
                            paint5 = this.LLILZIL;
                        }
                        canvas2.drawCircle(f34, f34, f34, paint5);
                        canvas2.restore();
                    }
                }
            } else {
                long jLIZLLL2 = LIZLLL(r4.getDuration());
                canvas2.save();
                canvas2.clipRect(r4 - this.LLJJIII, 0.0f, this.LLJJ, this.LLJJI);
                long j15 = this.LLJJ;
                float f35 = this.LLJJIII;
                canvas2.drawCircle(j15 - r7, f35, f35, this.LLJ);
                canvas2.restore();
                long j16 = this.LLJJ;
                canvas2.drawRect(j16 - this.LLJJIII, 0.0f, j16 - jLIZLLL2, this.LLJJI, this.LLJ);
                if (jLIZLLL > jLIZLLL2) {
                    long j17 = this.LLJJ;
                    canvas2 = canvas2;
                    canvas2.drawRect(j17 - jLIZLLL2, 0.0f, Math.max(this.LLJJIII, j17 - jLIZLLL), this.LLJJI, this.LLJIJIL);
                }
                if (this.LLILLL > this.LLJJIJIIJIL) {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, this.LLJJIII, this.LLJJI);
                    float f36 = this.LLJJIII;
                    canvas2.drawCircle(f36, f36, f36, this.LLJIJIL);
                    canvas2.restore();
                }
            }
            TimeSpeedModelExtension timeSpeedModelExtension3 = this.LLILLJJLI;
            if (timeSpeedModelExtension3 != null) {
                jCalculateRealTime = ((long) timeSpeedModelExtension3.getDuration()) + 0;
                long jLIZLLL3 = (int) LIZLLL(jCalculateRealTime);
                if (jLIZLLL3 < this.LLJJ) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("PGRPAINT: drawAnchors() -> draw anchor for stitch at =");
                    sbLIZ8.append((this.LLJJ - jLIZLLL3) - LLL);
                    C2188811AlT.LIZIZ(sbLIZ8);
                    canvas2.drawRect(this.LLJJ - jLIZLLL3, 0.0f, r6 - r4, this.LLJJI, this.LLIZLLLIL);
                }
            } else {
                jCalculateRealTime = 0;
            }
            if (this.LL != null) {
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("PGRPAINT: drawAnchors() -> start to draw anchors for other segments =");
                sbLIZ9.append(this.LL.size());
                C2188811AlT.LIZIZ(sbLIZ9);
                for (int i7 = 0; i7 < this.LL.size(); i7++) {
                    TimeSpeedModelExtension timeSpeedModelExtension4 = (TimeSpeedModelExtension) ListProtector.get(this.LL, i7);
                    jCalculateRealTime += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension4.getDuration(), timeSpeedModelExtension4.getSpeed());
                    long jLIZLLL4 = (int) LIZLLL(jCalculateRealTime);
                    if (jLIZLLL4 < this.LLJJ) {
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("PGRPAINT: drawAnchors() -> draw anchor for segment at =");
                        sbLIZ10.append((this.LLJJ - jLIZLLL4) - LLL);
                        C2188811AlT.LIZIZ(sbLIZ10);
                        canvas2.drawRect(this.LLJJ - jLIZLLL4, 0.0f, r6 - r4, this.LLJJI, this.LLIZLLLIL);
                    }
                }
                if (this.LLJJJIL && this.LLJJIJIIJIL > 30000 && this.LLILLL < this.LLJJIJI) {
                    long longVideoAnchorPosition = this.LLJJ - getLongVideoAnchorPosition();
                    canvas2.drawRect(longVideoAnchorPosition - 2, 0.0f, longVideoAnchorPosition + 2, this.LLJJI, this.LLIZLLLIL);
                    canvas2.drawText(this.LLJJJJ, ((this.LLJJ - r10) - 2) - (this.LLJJJ / 2), (getY() + (this.LLJJI * 2)) - ScreenUtils.getStatusBarHeight(getContext()), this.LLJILLL);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLILLJJLI == null) {
            float f37 = this.LLJJIII;
            if (jLIZLLL > 0) {
                canvas2.save();
                canvas2.clipRect(0.0f, 0.0f, this.LLJJIII, this.LLJJI);
                float f38 = this.LLJJIII;
                if (C580130Mp9.LIZ(this.LL)) {
                    paint = this.LLILZIL;
                } else {
                    ListProtector.get(this.LL, 0);
                    paint = this.LLILZIL;
                }
                canvas2.drawCircle(f38, f38, f38, paint);
                canvas2.restore();
                if (this.LL != null) {
                    long j18 = 0;
                    for (int i8 = 0; i8 < this.LL.size(); i8++) {
                        TimeSpeedModelExtension timeSpeedModelExtension5 = (TimeSpeedModelExtension) ListProtector.get(this.LL, i8);
                        long jCalculateRealTime3 = TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension5.getDuration(), timeSpeedModelExtension5.getSpeed());
                        j18 += jCalculateRealTime3;
                        int iLIZLLL2 = (int) LIZLLL(jCalculateRealTime3);
                        if (i8 == 0) {
                            f2 = (iLIZLLL2 + f37) - this.LLJJIII;
                        } else {
                            f2 = iLIZLLL2 + f37;
                        }
                        float fMin3 = Math.min(f2, this.LLJJ - this.LLJJIII);
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("PGRPAINT: drawProgressbarForNormalMode() -> index =");
                        sbLIZ11.append(i8);
                        sbLIZ11.append(" duration =");
                        sbLIZ11.append(timeSpeedModelExtension5.getDuration());
                        sbLIZ11.append(" realTime =");
                        sbLIZ11.append(jCalculateRealTime3);
                        sbLIZ11.append(" curLength =");
                        sbLIZ11.append(iLIZLLL2);
                        sbLIZ11.append(" time =");
                        sbLIZ11.append(j18);
                        sbLIZ11.append(" length =");
                        sbLIZ11.append((int) LIZLLL(j18));
                        C2188811AlT.LIZIZ(sbLIZ11);
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append("PGRPAINT: drawProgressbarForNormalMode() -> startPos =");
                        sbLIZ12.append(f37);
                        sbLIZ12.append(" endPos =");
                        sbLIZ12.append(fMin3);
                        C2188811AlT.LIZIZ(sbLIZ12);
                        canvas2.drawRect(f37, 0.0f, fMin3, this.LLJJI, this.LLILZIL);
                        f37 = fMin3 + 0.1f;
                    }
                    if (f37 < jLIZLLL) {
                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                        sbLIZ13.append("PGRPAINT: drawProgressbarForNormalMode -> draw the new recorded video segment startPos =");
                        sbLIZ13.append(f37);
                        sbLIZ13.append(" recordedLength =");
                        sbLIZ13.append(jLIZLLL);
                        sbLIZ13.append(" mWidth =");
                        sbLIZ13.append(this.LLJJ);
                        C2188811AlT.LIZIZ(sbLIZ13);
                        f = f37;
                        canvas2.drawRect(f37, 0.0f, Math.min(jLIZLLL, this.LLJJ - this.LLJJIII), this.LLJJI, this.LLILZIL);
                    } else {
                        f = f37;
                    }
                } else {
                    f = f37;
                }
                float f39 = jLIZLLL;
                if (f < f39 && Math.abs(f39 - f) < 2.0f) {
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("PGRPAINT: drawProgressbarForNormalMode -> fill up the gap, startPos =");
                    sbLIZ14.append(f);
                    sbLIZ14.append(" endPos =");
                    sbLIZ14.append(Math.min(jLIZLLL, this.LLJJ) - this.LLJJIII);
                    C2188811AlT.LIZIZ(sbLIZ14);
                    float fMin4 = Math.min(jLIZLLL, this.LLJJ) - this.LLJJIII;
                    float f40 = this.LLJJI;
                    if (C580130Mp9.LIZ(this.LL)) {
                        paint3 = this.LLILZIL;
                    } else {
                        ListProtector.get(this.LL, r5.size() - 1);
                        paint3 = this.LLILZIL;
                    }
                    canvas2.drawRect(f, 0.0f, fMin4, f40, paint3);
                }
                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                sbLIZ15.append("PGRPAINT: drawProgressbarForNormalMode -> mTotalRecordingTime =");
                sbLIZ15.append(this.LLILLL);
                sbLIZ15.append(" mMaxDuration =");
                sbLIZ15.append(this.LLJJIJIIJIL);
                C2188811AlT.LIZIZ(sbLIZ15);
                if (this.LLILLL >= this.LLJJIJIIJIL) {
                    canvas2.save();
                    canvas2.clipRect(r4 - this.LLJJIII, 0.0f, this.LLJJ, this.LLJJI);
                    long j19 = this.LLJJ;
                    long j20 = this.LLJJIII;
                    float f41 = j19 - j20;
                    float f42 = j20;
                    if (C580130Mp9.LIZ(this.LL)) {
                        paint2 = this.LLILZIL;
                    } else {
                        ListProtector.get(this.LL, r5.size() - 1);
                        paint2 = this.LLILZIL;
                    }
                    canvas2.drawCircle(f41, f42, f42, paint2);
                    canvas2.restore();
                }
            }
        } else {
            long jLIZLLL5 = LIZLLL(r4.getDuration());
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, this.LLJJIII, this.LLJJI);
            float f43 = this.LLJJIII;
            canvas2.drawCircle(f43, f43, f43, this.LLJ);
            canvas2.restore();
            float f44 = jLIZLLL5;
            canvas2.drawRect(this.LLJJIII, 0.0f, f44, this.LLJJI, this.LLJ);
            if (jLIZLLL > jLIZLLL5) {
                canvas2.drawRect(f44, 0.0f, Math.min(jLIZLLL, this.LLJJ - this.LLJJIII), this.LLJJI, this.LLJIJIL);
            }
            if (this.LLILLL > this.LLJJIJIIJIL) {
                canvas2.save();
                canvas2.clipRect(r4 - this.LLJJIII, 0.0f, this.LLJJ, this.LLJJI);
                long j21 = this.LLJJ;
                float f45 = this.LLJJIII;
                canvas2.drawCircle(j21 - r7, f45, f45, this.LLJIJIL);
                canvas2.restore();
            }
        }
        LIZ(jLIZLLL, canvas2);
    }

    public void setAnchorDuration(long j) {
        this.LLJJIJI = j;
    }

    public void setAnchorString(String str) {
        this.LLJJJJ = str;
        this.LLJJJ = (long) this.LLJILLL.measureText(str);
    }

    public void setCombineTakePhoto(boolean z) {
        this.LLJL = z;
    }

    public void setMaxDuration(long j) {
        this.LLJJIJIIJIL = j;
        postInvalidate();
    }

    public void setNeedDrawAnchor(boolean z) {
        this.LLJJJIL = z;
    }

    public void setProgressCapDuration(long j) {
        if (this.LLJJIJIL == j) {
            return;
        }
        this.LLJJIJIL = j;
        postInvalidate();
    }

    public C21408118qF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int LIZJ(int i, C1361400lX0 c1361400lX0) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, c1361400lX0);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -65536;
    }

    public void LIZ(float f, Canvas canvas) {
        TimeSpeedModelExtension timeSpeedModelExtension = this.LLILLJJLI;
        long jCalculateRealTime = 0;
        if (timeSpeedModelExtension != null) {
            jCalculateRealTime = 0 + ((long) timeSpeedModelExtension.getDuration());
            int iLIZLLL = (int) LIZLLL(jCalculateRealTime);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PGRPAINT: drawAnchors() -> draw anchor for stitch at =");
            int i = iLIZLLL - LLL;
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            float f2 = iLIZLLL;
            canvas.drawRect(this.LLJJIII, 0.0f, f2, this.LLJJI, this.LLJ);
            if (iLIZLLL < this.LLJJ) {
                canvas.drawRect(i, 0.0f, f2, this.LLJJI, this.LLIZLLLIL);
            }
        }
        if (this.LL != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PGRPAINT: drawAnchors() -> start to draw anchors for other video segments =");
            sbLIZ2.append(this.LL.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            for (int i2 = 0; i2 < this.LL.size(); i2++) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) ListProtector.get(this.LL, i2);
                jCalculateRealTime += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed());
                int iLIZLLL2 = (int) LIZLLL(jCalculateRealTime);
                if (iLIZLLL2 < this.LLJJ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("PGRPAINT: drawAnchors() -> draw anchor for segment at =");
                    int i3 = iLIZLLL2 - LLL;
                    sbLIZ3.append(i3);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    canvas.drawRect(i3, 0.0f, iLIZLLL2, this.LLJJI, this.LLIZLLLIL);
                }
            }
            if (this.LLJJJIL && this.LLJJIJIIJIL > 30000 && this.LLILLL < this.LLJJIJI) {
                canvas.drawRect(getLongVideoAnchorPosition() - 2, 0.0f, r0 + 2, this.LLJJI, this.LLIZLLLIL);
                canvas.drawText(this.LLJJJJ, r2 - (this.LLJJJ / 2), (getY() + (this.LLJJI * 2)) - ScreenUtils.getStatusBarHeight(getContext()), this.LLJILLL);
            }
        }
    }

    public final void LJFF(long j, List list) {
        this.LL = list;
        TimeSpeedModelExtension timeSpeedModelExtension = this.LLILLJJLI;
        if (timeSpeedModelExtension != null) {
            this.LLILLL = j + ((long) timeSpeedModelExtension.getDuration());
        } else {
            this.LLILLL = j;
        }
        this.LLJJLIIIJLLLLLLLZ = 1;
        postInvalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJJ = getMeasuredWidth();
        long measuredHeight = getMeasuredHeight() / 3;
        this.LLJJI = measuredHeight;
        this.LLJJIII = measuredHeight >> 1;
    }

    public C21408118qF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJIJI = 15000L;
        this.LLJJIJIIJIL = 15000L;
        this.LLJJJIL = true;
        this.LLJJJJ = "15s";
        this.LLJJLIIIJLLLLLLLZ = 1;
        setWillNotDraw(false);
        if (C1388580mEq.LIZIZ(context)) {
            this.LLJZIJLIL = true;
        }
        C1361400lX0 c1361400lX0LJ = C1388190mED.LJ(R.style.y3, getContext());
        Paint paint = new Paint(1);
        this.LLILZ = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(C12ES.LIZJ(6.0f, context));
        paint.setColor(C446980Hfs.LIZ(getContext(), R.color.tp));
        Paint paint2 = new Paint(1);
        this.LLIZ = paint2;
        paint2.setColor(LIZJ(R.attr.a09, c1361400lX0LJ));
        paint2.setAlpha(86);
        Paint paint3 = new Paint(1);
        this.LLILZIL = paint3;
        paint3.setColor(LIZJ(R.attr.a09, c1361400lX0LJ));
        Paint paint4 = new Paint(1);
        this.LLILZLL = paint4;
        paint4.setColor(LIZJ(R.attr.e8, c1361400lX0LJ));
        Paint paint5 = new Paint(1);
        this.LLJ = paint5;
        paint5.setColor(LIZJ(R.attr.a04, c1361400lX0LJ));
        Paint paint6 = new Paint(1);
        this.LLJIJIL = paint6;
        paint6.setColor(LIZJ(R.attr.a09, c1361400lX0LJ));
        Paint paint7 = new Paint(1);
        this.LLJI = paint7;
        paint7.setColor(LIZJ(R.attr.a04, c1361400lX0LJ));
        paint7.setAlpha(86);
        Paint paint8 = new Paint(1);
        this.LLIZLLLIL = paint8;
        paint8.setStyle(Paint.Style.FILL);
        paint8.setColor(LIZJ(R.attr.ee, c1361400lX0LJ));
        Paint paint9 = new Paint(1);
        this.LLJILJIL = paint9;
        paint9.setStyle(Paint.Style.FILL);
        paint9.setColor(LIZJ(R.attr.ee, c1361400lX0LJ));
        Paint paint10 = new Paint(1);
        this.LLJILJILJ = paint10;
        paint10.setStyle(Paint.Style.FILL);
        paint10.setColor(LIZJ(R.attr.ee, c1361400lX0LJ));
        C444890HcV c444890HcV = new C444890HcV();
        this.LLJILLL = c444890HcV;
        c444890HcV.setStyle(Paint.Style.FILL);
        c444890HcV.setColor(LIZJ(R.attr.ee, c1361400lX0LJ));
        c444890HcV.LIZ(72);
        c444890HcV.setShadowLayer(4.0f, 0.0f, 2.0f, C446980Hfs.LIZ(getContext(), R.color.cx));
        this.LLJJJ = (long) c444890HcV.measureText(this.LLJJJJ);
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(350L);
        this.LLJLL = duration;
        duration.setRepeatCount(-1);
        this.LLJLL.setRepeatMode(2);
        this.LLJLL.addUpdateListener(new AUListenerS279S0100000_32(this, 2));
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f).setDuration(700L);
        this.LLJLLIL = duration2;
        duration2.addUpdateListener(new AUListenerS279S0100000_32(this, 3));
    }
}
