package X;

import Y.ACListenerS159S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0t0N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnTouchListenerC1648690t0N extends FrameLayout implements View.OnTouchListener {
    public static final int LLLLLZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
    public boolean LL;
    public long LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C1DRG LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public int LLJIJIL;
    public EnumC1648530t07 LLJILJIL;
    public boolean LLJILJILJ;
    public Paint LLJILLL;
    public Paint LLJJ;
    public Paint LLJJI;
    public Paint LLJJIII;
    public int[] LLJJIJI;
    public float[] LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public final int LLJLL;
    public final int LLJLLIL;
    public final int LLJLLL;
    public final int LLJZ;
    public final int LLJZIJLIL;
    public final int LLL;
    public final int LLLF;
    public final int LLLFF;
    public long LLLFFI;
    public long LLLFZ;
    public int LLLI;
    public final RectF LLLII;
    public long LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public final C01GW LLLIIL;
    public final float LLLIILIL;
    public long LLLIL;
    public long LLLILZ;
    public final int[] LLLILZJ;
    public boolean LLLILZLLLI;
    public C1624180sMq LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public int LLLLIIIILLL;
    public boolean LLLLIIL;
    public Function1<? super MotionEvent, Boolean> LLLLIILL;
    public final ARunnableS125S0100000_25 LLLLIILLL;
    public final ACListenerS159S0100000_25 LLLLIL;
    public Activity LLLLILI;
    public int LLLLJ;
    public int LLLLJI;
    public int LLLLL;
    public long LLLLLIL;
    public boolean LLLLLILLIL;
    public long LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLIL;
    public boolean LLLLLLJ;
    public boolean LLLLLLL;
    public ScaleGestureDetector LLLLLLLLL;
    public InterfaceC21645719nT LLLLLLLLLL;
    public C1648700t0O LLLLLLLZIL;
    public InterfaceC579890Mol LLLLLLZ;
    public InterfaceC1648720t0Q LLLLLLZZ;
    public boolean LLLLLZ;

    private final Interpolator getEaseOutCubic() {
        return (Interpolator) this.LLLIIL.getValue();
    }

    private final double getPhotoShrinkScale() {
        return this.LLJILJIL.compareTo(EnumC1648530t07.DEFAULT) > 0 ? 0.8d : 0.92d;
    }

    public final boolean LJI() {
        InterfaceC579890Mol interfaceC579890Mol = this.LLLLLLZ;
        return interfaceC579890Mol != null && interfaceC579890Mol.LIZIZ();
    }

    public final boolean LJIIIIZZ() {
        long j = this.LLLLLJIL;
        return j == 0 || this.LLILLJJLI > j;
    }

    public final void LJIIJ() {
        int i = this.LLLI;
        if (i != -1) {
            this.LLLLJI = i;
            this.LLLI = -1;
            invalidate();
        }
        int i2 = this.LLJI;
        if (i2 == 3 || i2 == 2 || i2 == 11 || i2 == 13 || i2 == 14) {
            if (this.LLILLJJLI <= 0 || i2 == 13 || i2 == 14) {
                LJFF(4);
            } else {
                LJFF(9);
            }
            invalidate();
            this.LLLLLL = false;
        }
    }

    public final void LJIIJJI() {
        int i = this.LLLI;
        if (i != -1) {
            this.LLLLJI = i;
            this.LLLI = -1;
            invalidate();
        }
        setHasBeenMoveScaled(false);
        C1648700t0O c1648700t0O = this.LLLLLLLZIL;
        if (c1648700t0O != null) {
            c1648700t0O.p2();
        }
        int i2 = this.LLJI;
        if (i2 == 3 || i2 == 2 || i2 == 11 || i2 == 13 || i2 == 14) {
            if (this.LLILLJJLI <= 0 || i2 == 13 || i2 == 14) {
                LJFF(4);
            } else {
                LJFF(9);
            }
        }
        C1648700t0O c1648700t0O2 = this.LLLLLLLZIL;
        if (c1648700t0O2 != null) {
            c1648700t0O2.V2(true);
        }
        this.LLLIL = System.currentTimeMillis();
        invalidate();
    }

    public final void LJIIL() {
        int i = this.LLJI;
        if (i == 10 || i == 9 || i == 3) {
            if (this.LLJILJIL.compareTo(EnumC1648530t07.DEFAULT) > 0) {
                LJFF(1);
                LJ(0);
            } else {
                LJFF(12);
            }
            this.LLLLLL = false;
            invalidate();
        }
    }

    public final void LJIILL() {
        if (!this.LLLJL || this.LLJJIJI == null) {
            Paint paint = this.LLJILLL;
            if (paint == null) {
                paint = null;
            }
            paint.setShader(null);
            Paint paint2 = this.LLJILLL;
            if (paint2 == null) {
                paint2 = null;
            }
            paint2.setColor(this.LLLLJ);
            Paint paint3 = this.LLJJ;
            (paint3 != null ? paint3 : null).setColor(this.LLJJIJIL);
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        int[] iArr = this.LLJJIJI;
        if (iArr == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, measuredWidth, measuredHeight, iArr, this.LLJJIJIIJIL, Shader.TileMode.CLAMP);
        Paint paint4 = this.LLJILLL;
        if (paint4 == null) {
            paint4 = null;
        }
        paint4.setShader(linearGradient);
        Paint paint5 = this.LLJJ;
        (paint5 != null ? paint5 : null).setColor(this.LLJJIJIL);
    }

    public final void LJIILLIIL() {
        Paint paint = this.LLJILLL;
        if (paint == null) {
            paint = null;
        }
        paint.setShader(null);
        Paint paint2 = this.LLJILLL;
        if (paint2 == null) {
            paint2 = null;
        }
        paint2.setColor(this.LLJJJ);
        Paint paint3 = this.LLJJIII;
        if (paint3 == null) {
            paint3 = null;
        }
        paint3.setColor(this.LLJJJJJIL);
        Paint paint4 = this.LLJJI;
        if (paint4 == null) {
            paint4 = null;
        }
        paint4.setColor(this.LLJJJJ);
        Paint paint5 = this.LLJJ;
        (paint5 != null ? paint5 : null).setColor(this.LLJJJIL);
    }

    private final float getRecordLayoutTop() {
        Object parent = getParent();
        return parent instanceof View ? ((View) parent).getY() + getY() : getY();
    }

    public final Activity getActivity() {
        return this.LLLLILI;
    }

    public final boolean getCanTouch() {
        return this.LLLLLILLIL;
    }

    public final int getCurrentScaleMode() {
        return this.LLLLL;
    }

    public final boolean getDisableCaptureOnForcedCancelLongPress() {
        return this.LLLLLZ;
    }

    public final int getMode() {
        return this.LLLLJI;
    }

    public final InterfaceC21645719nT getOnGestureListener() {
        return this.LLLLLLLLLL;
    }

    public final int getPhotoCenterColor() {
        return this.LLLLJ;
    }

    public final InterfaceC1648720t0Q getRecordLayoutUIChangedListener() {
        return this.LLLLLLZZ;
    }

    public final InterfaceC1648710t0P getRecordListener() {
        return this.LLLLLLLZIL;
    }

    public final long getRecordMinLimit() {
        return this.LLLLLJIL;
    }

    public final ScaleGestureDetector getScaleGestureDetector() {
        return this.LLLLLLLLL;
    }

    public final boolean getShouldDrawInnerCircleInIdle() {
        return this.LLLLLLJ;
    }

    public final boolean getShouldDrawRing() {
        return this.LLLLLLL;
    }

    public final InterfaceC579890Mol getVideoRecordingConflictHandler() {
        return this.LLLLLLZ;
    }

    private final void setHasBeenMoveScaled(boolean z) {
        this.LLLLIIL = z;
        this.LLLIIII = System.currentTimeMillis();
    }

    public final void LJ(int i) {
        this.LLJIJIL = i;
        this.LLLFZ = SystemClock.uptimeMillis();
    }

    public final void LJFF(int i) {
        this.LLJI = i;
        this.LLLFFI = -1L;
    }

    public final void LJIIIZ(int i) {
        super.setOnClickListener(this.LLLLIL);
        this.LLLI = this.LLLLJI;
        this.LLLLJI = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x061d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r28) {
        /*
            Method dump skipped, instruction units count: 2357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1648690t0N.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1648690t0N.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setActivity(Activity activity) {
        this.LLLLILI = activity;
    }

    public final void setCanTouch(boolean z) {
        this.LLLLLILLIL = z;
    }

    public final void setClipStyle(boolean z) {
        this.LLLLLLIL = z;
        invalidate();
    }

    public final void setCombineTakePhoto(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setCurrentScaleMode(int i) {
        this.LLLLL = i;
    }

    public final void setDisableCaptureOnForcedCancelLongPress(boolean z) {
        this.LLLLLZ = z;
    }

    public final void setDisableExpandAnimation(boolean z) {
        this.LLILZIL = z;
    }

    public final void setDisableTouchWhenLongPressRecording(boolean z) {
        this.LLLLII = z;
    }

    public final void setEnablePressRecording(boolean z) {
        this.LLLL = z;
    }

    public final void setExternalTouchEventHandler(Function1<? super MotionEvent, Boolean> function1) {
        this.LLLLIILL = function1;
    }

    public final void setMinDurationForLongPressConsideration(int i) {
        this.LLLLIIIILLL = i;
    }

    public final void setObjectContainer(C1DRG c1drg) {
        this.LLILZLL = c1drg;
        if (this.LLLIZZ == null && c1drg != null) {
            this.LLLIZZ = new C1624180sMq(c1drg);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public final void setOnGestureListener(InterfaceC21645719nT interfaceC21645719nT) {
        this.LLLLLLLLLL = interfaceC21645719nT;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    public final void setPhotoCenterColor(int i) {
        this.LLLLJ = i;
    }

    public final void setPhotoIdleStyle(EnumC1648530t07 enumC1648530t07) {
        EnumC1648530t07 enumC1648530t072 = this.LLJILJIL;
        if (enumC1648530t07 == enumC1648530t072) {
            return;
        }
        EnumC1648530t07 enumC1648530t073 = EnumC1648530t07.DEFAULT;
        if (enumC1648530t07 == enumC1648530t073) {
            if (enumC1648530t072.compareTo(enumC1648530t073) > 0) {
                LJIILLIIL();
            }
            this.LLJILJIL = enumC1648530t073;
            invalidate();
            return;
        }
        this.LLJILJIL = enumC1648530t07;
        invalidate();
    }

    public final void setPressingByGestureTouch(boolean z) {
        this.LLLLLJLJLL = z;
    }

    public final void setRecordLayoutUIChangedListener(InterfaceC1648720t0Q interfaceC1648720t0Q) {
        this.LLLLLLZZ = interfaceC1648720t0Q;
    }

    public final void setRecordListener(InterfaceC1648710t0P interfaceC1648710t0P) {
        C1648700t0O c1648700t0O;
        if (interfaceC1648710t0P != null) {
            c1648700t0O = new C1648700t0O(this, interfaceC1648710t0P);
        } else {
            c1648700t0O = null;
        }
        this.LLLLLLLZIL = c1648700t0O;
    }

    public final void setRecordMinLimit(long j) {
        this.LLLLLJIL = j;
    }

    public final void setRecording(boolean z) {
        this.LLLLLL = z;
    }

    public final void setRecordingTime(long j) {
        this.LLILLJJLI = j;
    }

    public final void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.LLLLLLLLL = scaleGestureDetector;
    }

    public final void setShouldDrawBorder(boolean z) {
        boolean z2 = this.LL;
        this.LL = z;
        if (z2 != z) {
            invalidate();
        }
    }

    public final void setShouldDrawInnerCircleInIdle(boolean z) {
        this.LLLLLLJ = z;
        invalidate();
    }

    public final void setShouldDrawRing(boolean z) {
        this.LLLLLLL = z;
        invalidate();
    }

    public final void setVideoRecordingConflictHandler(InterfaceC579890Mol interfaceC579890Mol) {
        this.LLLLLLZ = interfaceC579890Mol;
    }

    public ViewOnTouchListenerC1648690t0N(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int LIZ(int i, long j) {
        int iLIZJ;
        int i2;
        int i3;
        int i4;
        float fUptimeMillis = (SystemClock.uptimeMillis() - j) / 350.0f;
        if (i != 1 && i != 6 && i != 7 && i != 13 && i != 14) {
            if (i == 2) {
                if (this.LLILZIL) {
                    i4 = this.LLJLLIL;
                } else {
                    i4 = this.LLJLILLLLZIIL;
                }
                iLIZJ = LIZJ(fUptimeMillis, this.LLJLLIL, i4);
                InterfaceC1648720t0Q interfaceC1648720t0Q = this.LLLLLLZZ;
                if (interfaceC1648720t0Q != null) {
                    interfaceC1648720t0Q.LIZ(iLIZJ);
                }
            } else if (i == 3) {
                if (this.LLILZIL) {
                    iLIZJ = this.LLJLLIL;
                } else {
                    iLIZJ = this.LLJLILLLLZIIL;
                }
                InterfaceC1648720t0Q interfaceC1648720t0Q2 = this.LLLLLLZZ;
                if (interfaceC1648720t0Q2 != null) {
                    interfaceC1648720t0Q2.LIZ(iLIZJ);
                    return iLIZJ;
                }
            } else if (i == 9) {
                if (this.LLILZIL) {
                    i3 = this.LLJLLIL;
                } else {
                    i3 = this.LLJLILLLLZIIL;
                }
                iLIZJ = LIZJ(fUptimeMillis, i3, this.LLJLL);
                InterfaceC1648720t0Q interfaceC1648720t0Q3 = this.LLLLLLZZ;
                if (interfaceC1648720t0Q3 != null) {
                    interfaceC1648720t0Q3.LIZ(iLIZJ);
                    return iLIZJ;
                }
            } else if (i == 10) {
                iLIZJ = this.LLJLL;
                InterfaceC1648720t0Q interfaceC1648720t0Q4 = this.LLLLLLZZ;
                if (interfaceC1648720t0Q4 != null) {
                    interfaceC1648720t0Q4.LIZ(iLIZJ);
                    return iLIZJ;
                }
            } else if (i == 11) {
                iLIZJ = LIZJ(fUptimeMillis, this.LLJLL, this.LLJLILLLLZIIL);
                InterfaceC1648720t0Q interfaceC1648720t0Q5 = this.LLLLLLZZ;
                if (interfaceC1648720t0Q5 != null) {
                    interfaceC1648720t0Q5.LIZ(iLIZJ);
                    return iLIZJ;
                }
            } else if (i == 12) {
                iLIZJ = LIZJ(fUptimeMillis, this.LLJLL, this.LLJLLIL);
                InterfaceC1648720t0Q interfaceC1648720t0Q6 = this.LLLLLLZZ;
                if (interfaceC1648720t0Q6 != null) {
                    interfaceC1648720t0Q6.LIZ(iLIZJ);
                    return iLIZJ;
                }
            } else if (i == 4) {
                if (this.LLILZIL) {
                    i2 = this.LLJLLIL;
                } else {
                    i2 = this.LLJLILLLLZIIL;
                }
                iLIZJ = LIZJ(fUptimeMillis, i2, this.LLJLL);
                InterfaceC1648720t0Q interfaceC1648720t0Q7 = this.LLLLLLZZ;
                if (interfaceC1648720t0Q7 != null) {
                    interfaceC1648720t0Q7.LIZ(iLIZJ);
                    return iLIZJ;
                }
            } else {
                return 0;
            }
        } else {
            iLIZJ = this.LLJLLIL;
            InterfaceC1648720t0Q interfaceC1648720t0Q8 = this.LLLLLLZZ;
            if (interfaceC1648720t0Q8 != null) {
                interfaceC1648720t0Q8.LIZ(iLIZJ);
                return iLIZJ;
            }
        }
        return iLIZJ;
    }

    public final int LIZIZ(int i, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i2 = this.LLJLLIL - this.LLJLLL;
        float f = (jUptimeMillis - j) / 350.0f;
        if (i != 1 && i != 6 && i != 7 && i != 13 && i != 14) {
            if (i == 2) {
                return LIZJ(f, i2, 0);
            }
            if (i == 12) {
                return LIZJ(f, 0, i2);
            }
            if (i == 4) {
                return LIZJ(f, 0, i2);
            }
            return 0;
        }
        return i2;
    }

    public final int LIZLLL(int i, long j) {
        float fMin = Math.min(1.0f, (SystemClock.uptimeMillis() - j) / 50.0f);
        if (i != 1 && i != 6 && i != 7) {
            if (i == 13) {
                int i2 = this.LLL;
                return LIZJ(fMin, i2, (int) (((double) i2) * getPhotoShrinkScale()));
            }
            if (i == 14) {
                return LIZJ(fMin, (int) (((double) this.LLL) * getPhotoShrinkScale()), this.LLL);
            }
            return 0;
        }
        return this.LLL;
    }

    public final boolean LJII(int i, KeyEvent keyEvent) {
        if (this.LLLLLJLJLL) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(keyEvent.getDownTime(), keyEvent.getEventTime(), i, getX() + (getMeasuredWidth() / 2.0f), getY() + (getMeasuredHeight() / 2.0f), keyEvent.getMetaState());
        this.LLLJIL = true;
        return onTouchEvent(motionEventObtain);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            size = this.LLLFF;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            size2 = this.LLLFF;
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.LLLLLILLIL || this.LLLLLLLLLL == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                if (action == 6) {
                    InterfaceC21645719nT interfaceC21645719nT = this.LLLLLLLLLL;
                    if (interfaceC21645719nT != null) {
                        interfaceC21645719nT.LJIIIIZZ(motionEvent, this.LLLILZJ);
                    }
                    InterfaceC21645719nT interfaceC21645719nT2 = this.LLLLLLLLLL;
                    if (interfaceC21645719nT2 != null) {
                        interfaceC21645719nT2.LIZJ(motionEvent, this.LLLILZJ);
                    }
                }
            } else {
                InterfaceC21645719nT interfaceC21645719nT3 = this.LLLLLLLLLL;
                if (interfaceC21645719nT3 != null) {
                    interfaceC21645719nT3.LJI(motionEvent, this.LLLILZJ);
                }
                InterfaceC21645719nT interfaceC21645719nT4 = this.LLLLLLLLLL;
                if (interfaceC21645719nT4 != null) {
                    interfaceC21645719nT4.LJII(motionEvent, this.LLLILZJ);
                    return false;
                }
            }
        } else {
            InterfaceC21645719nT interfaceC21645719nT5 = this.LLLLLLLLLL;
            if (interfaceC21645719nT5 != null) {
                interfaceC21645719nT5.LJIIJ(motionEvent, this.LLLILZJ);
                return false;
            }
        }
        return false;
    }

    public ViewOnTouchListenerC1648690t0N(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        super(context, attributeSet, i);
        this.LL = true;
        this.LLJILJIL = EnumC1648530t07.DEFAULT;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJJJJLIIL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LLJJL = iIntValue2;
        this.LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        this.LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        this.LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJLILLLLZIIL = LLLLLZIL;
        this.LLJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        this.LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(43));
        this.LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        this.LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        this.LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37));
        this.LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        this.LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        this.LLLI = -1;
        this.LLLII = new RectF();
        this.LLLIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(178));
        this.LLLIILIL = C12ES.LIZJ(18.0f, context);
        this.LLLILZJ = new int[]{0, 0};
        this.LLLJ = true;
        this.LLLL = true;
        this.LLLLIIIILLL = 600;
        this.LLLLIILLL = new ARunnableS125S0100000_25(this, 46);
        this.LLLLIL = new ACListenerS159S0100000_25(this, 23);
        this.LLLLJI = 3;
        this.LLLLLILLIL = true;
        this.LLLLLLJ = true;
        this.LLLLLLL = true;
        this.LLJI = 1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.LLJILLL = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.LLJJ = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        this.LLJJI = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setAntiAlias(true);
        this.LLJJIII = paint4;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a04, getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        this.LLJJJ = iIntValue3;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        this.LLJJJIL = iIntValue4;
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ5 != null) {
            iIntValue5 = numLIZJ5.intValue();
        } else {
            iIntValue5 = 0;
        }
        this.LLLLJ = iIntValue5;
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ6 != null) {
            iIntValue6 = numLIZJ6.intValue();
        } else {
            iIntValue6 = 0;
        }
        this.LLJJIJIL = iIntValue6;
        Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ7 != null) {
            iIntValue7 = numLIZJ7.intValue();
        } else {
            iIntValue7 = 0;
        }
        this.LLJJJJJIL = iIntValue7;
        Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.zk, getContext());
        this.LLJJJJ = numLIZJ8 != null ? numLIZJ8.intValue() : 0;
        LJIILLIIL();
        setOnTouchListener(this);
    }

    public final int LIZJ(float f, int i, int i2) {
        return i + ((int) ((i2 - i) * getEaseOutCubic().getInterpolation(f)));
    }

    public final void LJIILJJIL(int i, boolean z, boolean z2, boolean z3) {
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLLILZLLLI = z;
        this.LLLJ = true;
        if (!this.LLLIIIIL) {
            this.LLLLJI = i;
            invalidate();
            super.setOnClickListener(this.LLLLIL);
            this.LLLIIIIL = !this.LLLIIIIL;
            return;
        }
        if (this.LLLLJI == i) {
            return;
        }
        this.LLLLJI = i;
        if (i == 1) {
            LJIILL();
            super.setOnClickListener(this.LLLLIL);
            LJFF(6);
        } else {
            LJIILLIIL();
            super.setOnClickListener(this.LLLLIL);
            LJFF(7);
        }
        invalidate();
    }
}
