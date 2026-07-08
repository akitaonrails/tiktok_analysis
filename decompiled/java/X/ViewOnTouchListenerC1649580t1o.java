package X;

import Y.ACListenerS159S0100000_25;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0t1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class ViewOnTouchListenerC1649580t1o extends FrameLayout implements View.OnTouchListener {
    public boolean LL;
    public float LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public Paint LLIZLLLIL;
    public Paint LLJ;
    public C1DRG LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public long LLJJJ;
    public long LLJJJIL;
    public int LLJJJJ;
    public final int LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public boolean LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public final int[] LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public C1624180sMq LLJZIJLIL;
    public Activity LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public final ArgbEvaluator LLLFFI;
    public DashPathEffect LLLFZ;
    public boolean LLLI;
    public ScaleGestureDetector LLLII;
    public InterfaceC21645719nT LLLIIII;
    public InterfaceC1649610t1r LLLIIIIL;
    public final ACListenerS159S0100000_25 LLLIIIL;
    public boolean LLLIIL;

    public static int LIZJ(float f, int i, int i2) {
        double d = f;
        double d2 = 1.0d - d;
        double d3 = d * d;
        double d4 = d2 * d2;
        return i + ((int) (((double) (i2 - i)) * ((d4 * d2 * 0.0d) + (d4 * 3.0d * d * 0.0d) + (d2 * 3.0d * d3 * 1.0d) + (d3 * d * 1.0d))));
    }

    public final void LJIIL() {
        Paint paint = this.LLIZLLLIL;
        if (paint == null || this.LLJ == null) {
            return;
        }
        paint.setColor(this.LLJIJIL);
        this.LLJ.setColor(this.LLJILJIL);
    }

    public final void LJIILJJIL() {
        Paint paint = this.LLIZLLLIL;
        if (paint == null || this.LLJ == null) {
            return;
        }
        paint.setColor(C960203pA.LIZ(R.attr.a04, getContext()));
        this.LLJ.setColor(C446980Hfs.LIZ(getContext(), R.color.ur));
    }

    public final void LJIILL() {
        Paint paint = this.LLIZLLLIL;
        if (paint == null || this.LLJ == null) {
            return;
        }
        paint.setColor(this.LLJILJILJ);
        this.LLJ.setColor(this.LLJILLL);
    }

    public long getActionDownTime() {
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupSceneLIZ = C577960Mle.LIZ(this.LLL);
        if (tikTokCameraBaseGroupSceneLIZ == null) {
            return this.LLJLL;
        }
        ShortVideoContext shortVideoContextLLLLLLZZ = tikTokCameraBaseGroupSceneLIZ.LLLLLLZZ();
        if (shortVideoContextLLLLLLZZ != null) {
            return shortVideoContextLLLLLLZZ.actionDownTime;
        }
        return 0L;
    }

    public DashPathEffect getDashPathEffect() {
        if (this.LLLFZ == null) {
            this.LLLFZ = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.LLLFZ;
    }

    public int getCurrentScaleMode() {
        return this.LLILZLL;
    }

    public int getMode() {
        return this.LLILZIL;
    }

    public final int LIZLLL(long j) {
        int i;
        int i2;
        if (this.LLJZ) {
            i = this.LLJILJILJ;
            i2 = this.LLJIJIL;
        } else {
            if (this.LLJLLL) {
                i = this.LLJIJIL;
            } else {
                i = this.LLJILJILJ;
            }
            i2 = this.LLJILJILJ;
        }
        if (SystemClock.uptimeMillis() - this.LLJJJ > 300) {
            return i2;
        }
        return ((Integer) this.LLLFFI.evaluate(((r4 - j) * 1.0f) / 300.0f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    public final int LJI(long j) {
        int i;
        int i2;
        if (this.LLJZ) {
            i = this.LLJILLL;
            i2 = this.LLJILJIL;
        } else {
            if (this.LLJLLL) {
                i = this.LLJILJIL;
            } else {
                i = this.LLJILLL;
            }
            i2 = this.LLJILLL;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        if (jUptimeMillis > 300) {
            return i2;
        }
        return ((Integer) this.LLLFFI.evaluate((jUptimeMillis * 1.0f) / 300.0f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    public final void LJII(int i) {
        this.LLIZ = i;
        this.LLJJJIL = SystemClock.uptimeMillis();
    }

    public final void LJIIIIZZ(int i) {
        this.LLILZ = i;
        this.LLJJJ = SystemClock.uptimeMillis();
    }

    public final void LJIIJ(int i) {
        super.setOnClickListener(this.LLLIIIL);
        this.LLJJJJ = this.LLILZIL;
        this.LLILZIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1649580t1o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C1624180sMq c1624180sMq;
        if (!this.LLLF) {
            return false;
        }
        if (!isEnabled()) {
            if (this.LLLIIIIL != null && motionEvent.getAction() == 0) {
                this.LLLIIIIL.Lk();
            }
            return true;
        }
        int action = motionEvent.getAction();
        InterfaceC1649610t1r interfaceC1649610t1r = this.LLLIIIIL;
        if (interfaceC1649610t1r != null) {
            if (action == 0) {
                if (interfaceC1649610t1r.O0()) {
                    return true;
                }
                c1624180sMq = this.LLJZIJLIL;
                if (c1624180sMq != null && c1624180sMq.LIZ()) {
                    return true;
                }
            }
        } else if (action == 0) {
            c1624180sMq = this.LLJZIJLIL;
            if (c1624180sMq != null) {
                return true;
            }
        }
        if (action != 261) {
            if (action == 517) {
                this.LLILZLL = 2;
            }
        } else {
            this.LLILZLL = 1;
        }
        if (this.LLILZIL == 3) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (action == 0) {
                this.LLJLL = SystemClock.uptimeMillis();
                motionEvent.getX();
                motionEvent.getY();
                this.LLILLJJLI = motionEvent.getRawX();
                this.LLILLL = motionEvent.getRawY();
                int i = this.LLILZ;
                if (i == 1) {
                    getLocationOnScreen(this.LLJLLIL);
                    this.LLLIIIIL.Q2();
                    LJIIIIZZ(2);
                    invalidate();
                } else if (i == 4) {
                    if (C577960Mle.LIZ(this.LLL) == null && !(this.LLL instanceof FTCVideoRecordNewActivity)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (this.LLL == null || !z || !((InterfaceC1650190t2n) this.LLJI.LJII(InterfaceC1650230t2r.class, null)).St2().I4()) {
                        this.LLLIIIIL.Q2();
                        LJIIIIZZ(2);
                        LJII(0);
                        this.LLJLIL = false;
                        this.LLJJIJIIJIL = 0.0f;
                        this.LLJJIJIL = 0.0f;
                        invalidate();
                    }
                } else if ((i == 3 || this.LLJJJ == 2) && this.LLIZ == 0) {
                    this.LLLIIIIL.oH();
                    LJIIIIZZ(4);
                    invalidate();
                }
            } else if (action == 2) {
                int i2 = this.LLILZ;
                if (i2 == 3 || i2 == 2) {
                    this.LLJJIJIIJIL = 0.0f;
                    this.LLJJIJIL = 0.0f;
                    if (this.LLIZ == 0) {
                        double rawX = motionEvent.getRawX() - this.LLILLJJLI;
                        double rawY = motionEvent.getRawY() - this.LLILLL;
                        if (Math.sqrt((rawX * rawX) + (rawY * rawY)) > this.LLJJJJJIL / 2 && !this.LLJLIL) {
                            LJII(2);
                        } else if (this.LLJLIL) {
                            this.LLJJIJIIJIL = 0.0f;
                            this.LLJJIJIL = 0.0f;
                            setHasBeenMoveScaled(false);
                            this.LLLIIIIL.p2();
                        }
                    } else {
                        int i3 = this.LLILZLL;
                        if (i3 == 0 || i3 == 1) {
                            this.LLLIIIIL.rO(-motionEvent.getY());
                        }
                    }
                }
                if (this.LLILZ != 3) {
                    invalidate();
                }
            } else if (action == 1 || action == 3) {
                if (this.LLIZ == 0) {
                    int i4 = this.LLILZ;
                    if ((i4 == 3 || i4 == 2) && jUptimeMillis - this.LLJLL < 350) {
                        setHasBeenMoveScaled(false);
                        this.LLLIIIIL.p2();
                        this.LLJLIL = true;
                        this.LLJJIJIIJIL = 0.0f;
                        this.LLJJIJIL = 0.0f;
                        LJII(0);
                        this.LLLIIIIL.y2(EnumC1448830no1.CLICK);
                    }
                } else {
                    int i5 = this.LLILZLL;
                    if ((i5 == 0 || i5 == 1) && this.LLJJL) {
                        setHasBeenMoveScaled(false);
                        this.LLLIIIIL.p2();
                    }
                    this.LLLIIIIL.oH();
                    LJIIIIZZ(4);
                }
                invalidate();
            }
            if (this.LLLII != null && System.currentTimeMillis() - this.LLJJLIIIJLLLLLLLZ >= 300) {
                this.LLLII.onTouchEvent(motionEvent);
            }
            return true;
        }
        if (action == 0) {
            if (System.currentTimeMillis() - this.LLJLILLLLZIIL < 300) {
                return true;
            }
            if (this.LL) {
                this.LLLIIIIL.y2(EnumC1448830no1.NONE);
            }
        }
        if (this.LLLII != null && System.currentTimeMillis() - this.LLJJLIIIJLLLLLLLZ >= 300) {
            this.LLLII.onTouchEvent(motionEvent);
        }
        requestFocus();
        return super.onTouchEvent(motionEvent);
    }

    public void setActionDownTime(long j) {
        this.LLJLL = j;
    }

    public void setActivity(Activity activity) {
        this.LLL = activity;
    }

    public void setCanTouch(Boolean bool) {
        this.LLLF = bool.booleanValue();
    }

    public void setCurrentScaleMode(int i) {
        this.LLILZLL = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setHasBeenMoveScaled(boolean z) {
        this.LLJJL = z;
        this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
    }

    public void setObjectContainer(C1DRG c1drg) {
        this.LLJI = c1drg;
        if (this.LLJZIJLIL == null && c1drg != null) {
            this.LLJZIJLIL = new C1624180sMq(c1drg);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnGestureListener(InterfaceC21645719nT interfaceC21645719nT) {
        this.LLLIIII = interfaceC21645719nT;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setRecordListener(final InterfaceC1649610t1r interfaceC1649610t1r) {
        this.LLLIIIIL = new InterfaceC1649610t1r(interfaceC1649610t1r) { // from class: X.0t1q
            public final InterfaceC1649610t1r LL;

            @Override // X.InterfaceC1649610t1r
            public final void Kf() {
                this.LL.Kf();
            }

            @Override // X.InterfaceC1649610t1r
            public final void Lk() {
                this.LL.Lk();
            }

            @Override // X.InterfaceC1649610t1r
            public final boolean O0() {
                return this.LL.O0();
            }

            @Override // X.InterfaceC1649610t1r
            public final void Q2() {
                C1638140sjM.LIZ(EnumC1647590syb.START_RECORD);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RecordLayout onRecordStart isRecording: ");
                sbLIZ.append(this.LLILLJJLI.LLLIIL);
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                if (this.LLILLJJLI.LLLIIL) {
                    return;
                }
                this.LL.Q2();
                this.LLILLJJLI.LLLIIL = true;
            }

            @Override // X.InterfaceC1649610t1r
            public final void bw() {
                this.LL.bw();
            }

            @Override // X.InterfaceC1649610t1r
            public final boolean ja() {
                return this.LL.ja();
            }

            @Override // X.InterfaceC1649610t1r
            public final void p2() {
                this.LL.p2();
            }

            @Override // X.InterfaceC1649610t1r
            public final void oH() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RecordLayout onRecordEnd isRecording: ");
                sbLIZ.append(this.LLILLJJLI.LLLIIL);
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                if (this.LLILLJJLI.LLLIIL) {
                    this.LL.oH();
                    this.LLILLJJLI.LLLIIL = false;
                }
            }

            @Override // X.InterfaceC1649610t1r
            public final void rO(float f) {
                this.LL.rO(f);
            }

            @Override // X.InterfaceC1649610t1r
            public final void y2(EnumC1448830no1 enumC1448830no1) {
                this.LL.y2(enumC1448830no1);
            }

            {
                this.LL = interfaceC1649610t1r;
            }
        };
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.LLLII = scaleGestureDetector;
    }

    public ViewOnTouchListenerC1649580t1o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = true;
        this.LLILZIL = 3;
        this.LLJJJJ = -1;
        this.LLJJJJJIL = (int) C12ES.LIZJ(100.0f, getContext());
        this.LLJJJJLIIL = new RectF();
        this.LLJJLIIIJLLLLLLLZ = 0L;
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJLLIL = new int[]{0, 0};
        this.LLLF = true;
        this.LLLFF = true;
        this.LLLFFI = new ArgbEvaluator();
        this.LLLIIIIL = new InterfaceC1649610t1r() { // from class: X.0t1s
            @Override // X.InterfaceC1649610t1r
            public final /* synthetic */ void Kf() {
            }

            @Override // X.InterfaceC1649610t1r
            public final void Lk() {
            }

            @Override // X.InterfaceC1649610t1r
            public final boolean O0() {
                return false;
            }

            @Override // X.InterfaceC1649610t1r
            public final void Q2() {
            }

            @Override // X.InterfaceC1649610t1r
            public final void bw() {
            }

            @Override // X.InterfaceC1649610t1r
            public final boolean ja() {
                return false;
            }

            @Override // X.InterfaceC1649610t1r
            public final void oH() {
            }

            @Override // X.InterfaceC1649610t1r
            public final void p2() {
            }

            @Override // X.InterfaceC1649610t1r
            public final void rO(float f) {
            }

            @Override // X.InterfaceC1649610t1r
            public final /* synthetic */ void y2(EnumC1448830no1 enumC1448830no1) {
            }
        };
        this.LLLIIIL = new ACListenerS159S0100000_25(this, 24);
        this.LLJJ = (int) C12ES.LIZJ(50.0f, context);
        this.LLJJI = (int) C12ES.LIZJ(40.0f, context);
        C12ES.LIZJ(45.0f, context);
        C12ES.LIZJ(2.5f, context);
        this.LLJJIII = (int) C12ES.LIZJ(40.0f, context);
        this.LLILZ = 1;
        Paint paint = new Paint();
        this.LLIZLLLIL = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.LLIZLLLIL.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LLJ = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.LLJ.setAntiAlias(true);
        this.LLJILJILJ = C960203pA.LIZ(R.attr.a04, getContext());
        this.LLJILLL = C446980Hfs.LIZ(getContext(), R.color.ur);
        this.LLJIJIL = C446980Hfs.LIZ(getContext(), R.color.ac4);
        this.LLJILJIL = C446980Hfs.LIZ(getContext(), R.color.ac4);
        LJIILL();
        setOnTouchListener(this);
    }

    public final int LIZ(int i, long j) {
        int i2;
        int i3;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            i2 = this.LLJJI;
            i3 = (int) ((((long) (this.LLJJ - i2)) * (jUptimeMillis - j)) / 300);
        } else if (i == 3) {
            i2 = this.LLJJI;
            i3 = this.LLJJ - i2;
        } else if (i == 4) {
            i2 = this.LLJJI;
            i3 = (int) ((this.LLJJ - i2) * (1.0f - (((jUptimeMillis - j) * 1.0f) / 300.0f)));
        } else {
            if (i == 1) {
                return this.LLJJI;
            }
            return 0;
        }
        return i2 + i3;
    }

    public final int LIZIZ(int i, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) ((((long) this.LLJJIII) * (jUptimeMillis - j)) / 300);
        }
        if (i == 3) {
            double dSin = Math.sin(((jUptimeMillis - j) * 3.141592653589793d) / ((double) OppoPermissionPopupMaskDelayExp.DEFAULT)) + 1.0d;
            int i2 = this.LLIZ;
            if (i2 != 2) {
                if (i2 != 1) {
                    return (int) (((double) this.LLJJIII) + (dSin * ((double) (this.LLJJ - this.LLJJI)) * 0.30000001192092896d));
                }
            } else if (this.LLJJIJI == 0) {
                this.LLJJIJI = (int) (((double) this.LLJJIII) + (dSin * ((double) (this.LLJJ - this.LLJJI)) * 0.30000001192092896d));
            }
            return this.LLJJIJI;
        }
        if (i == 4) {
            return (int) (this.LLJJIII * (1.0f - (((jUptimeMillis - j) * 1.0f) / 300.0f)));
        }
        return 0;
    }

    public final int LJ(int i, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            int i2 = this.LLJJIII;
            return (int) ((i2 * 0.1f) + (i2 * 0.7f * (1.0f - (((jUptimeMillis - j) * 1.0f) / 300.0f))));
        }
        if (i == 3) {
            return (int) (this.LLJJIII * 0.1f);
        }
        if (i == 4) {
            int i3 = this.LLJJIII;
            return (int) ((i3 * 0.1f) + (((i3 * 0.7f) * (jUptimeMillis - j)) / 300.0f));
        }
        if (i == 1) {
            return (int) (this.LLJJIII * 0.8f);
        }
        return 0;
    }

    public final int LJFF(int i, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            int i2 = this.LLJJIII;
            return (int) ((i2 * 0.4f) + (i2 * 0.4f * (1.0f - (((jUptimeMillis - j) * 1.0f) / 300.0f))));
        }
        if (i == 3) {
            return (int) (this.LLJJIII * 0.4f);
        }
        if (i == 4) {
            int i3 = this.LLJJIII;
            return (int) ((i3 * 0.4f) + (((i3 * 0.4f) * (jUptimeMillis - j)) / 300.0f));
        }
        if (i == 1) {
            return (int) (this.LLJJIII * 0.8f);
        }
        return 0;
    }

    public final void LJIIIZ(Canvas canvas, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.LLJJJ;
        float fMin = (int) (((this.LLJJIII * 0.85f) * Math.min(300L, SystemClock.uptimeMillis() - j)) / 300.0f);
        long j2 = this.LLJJJ;
        float f = this.LLJJI;
        float f2 = (0.8f * f) + ((1.0f - (((jUptimeMillis - j2) * 1.0f) / 300.0f)) * f * 0.2f);
        this.LLJ.setStrokeWidth(f - fMin);
        this.LLJ.setPathEffect(null);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (f + fMin) / 2.0f, this.LLJ);
        this.LLIZLLLIL.setStrokeWidth(f2);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f2 / 2.0f, this.LLIZLLLIL);
        if (jUptimeMillis - this.LLJJJ > 300) {
            LJIIIIZZ(1);
            if (z) {
                this.LLILZIL = 3;
            } else {
                this.LLILZIL = 1;
            }
        }
        invalidate();
    }

    public final void LJIIJJI(int i, boolean z) {
        this.LLJLLL = this.LLJZ;
        int i2 = this.LLILZIL;
        this.LLILZIL = i;
        this.LLJZ = z;
        this.LLLFF = true;
        if (!this.LLJL) {
            invalidate();
            super.setOnClickListener(this.LLLIIIL);
            this.LLJL = !this.LLJL;
        } else {
            if (i == i2) {
                return;
            }
            if (i == 1) {
                LJIIL();
                super.setOnClickListener(this.LLLIIIL);
                LJIIIIZZ(6);
            } else if (i == 3) {
                LJIILL();
                super.setOnClickListener(this.LLLIIIL);
                LJIIIIZZ(7);
            }
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            size = this.LLJJJJJIL;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            size2 = this.LLJJJJJIL;
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.LLLF || this.LLLIIII == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                if (action == 6) {
                    this.LLLIIII.LJIIIIZZ(motionEvent, this.LLJLLIL);
                    this.LLLIIII.LIZJ(motionEvent, this.LLJLLIL);
                }
                return false;
            }
            this.LLLIIII.LJI(motionEvent, this.LLJLLIL);
            this.LLLIIII.LJII(motionEvent, this.LLJLLIL);
            return false;
        }
        this.LLLIIII.LJIIJ(motionEvent, this.LLJLLIL);
        return false;
    }
}
