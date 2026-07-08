package X;

import Y.AAListenerS170S0000000_11;
import Y.AUListenerS68S0101000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SSM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SSM extends ConstraintLayout {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public Float LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public C0SOM LLJ;
    public Float LLJI;
    public ValueAnimator LLJIJIL;
    public final int LLJILJIL;
    public final float LLJILJILJ;
    public C0SSN LLJILLL;
    public C0SSN LLJJ;
    public Float LLJJI;
    public Float LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final double LLJJJIL;
    public final double LLJJJJ;
    public Function1<? super Boolean, Unit> LLJJJJJIL;
    public Function1<? super Integer, Unit> LLJJJJLIIL;
    public Function1<? super Float, Unit> LLJJL;
    public Function0<Unit> LLJJLIIIJLLLLLLLZ;
    public Function0<Unit> LLJL;
    public final Object LLJLIL;

    public final void h0() {
        synchronized (this.LLJLIL) {
            try {
                Function1<? super Boolean, Unit> function1 = this.LLJJJJJIL;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(this.LLIZ));
                }
                this.LLJJJJJIL = null;
                ValueAnimator valueAnimator = this.LLJIJIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int getPatientLeftMargin() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        return marginLayoutParams.leftMargin;
    }

    public final boolean getAllowPullDownInteractiveExit() {
        return this.LLJJIJIL;
    }

    public final boolean getEnableLayoutChange() {
        return this.LLJJJ;
    }

    public C0SSM(C19EG c19eg) {
        super(c19eg);
        this.LLJILJIL = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLJILJILJ = 1.0f;
        C0SSN c0ssn = C0SSN.NONE;
        this.LLJILLL = c0ssn;
        this.LLJJ = c0ssn;
        this.LLJJJ = true;
        double dLJIIJ = ((double) C12ES.LJIIJ(getContext())) * 0.08d;
        this.LLJJJIL = dLJIIJ;
        this.LLJJJJ = dLJIIJ;
        this.LLJLIL = new Object();
    }

    public final boolean e0(boolean z) {
        int i;
        int i2;
        if (this.LLILZIL) {
            i = (int) this.LL;
        } else {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            i = iArr[0];
        }
        if (C426750GoL.LIZLLL(getContext())) {
            i = -i;
        }
        if (z) {
            i2 = ((int) this.LLJJJIL) * 2;
        } else {
            i2 = 0;
        }
        if (i <= this.LLJJJJ + ((double) i2)) {
            return false;
        }
        return true;
    }

    public final void i0(int i) {
        synchronized (this.LLJLIL) {
            try {
                Function1<? super Integer, Unit> function1 = this.LLJJJJLIIL;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Float f;
        Float f2;
        boolean z = false;
        if (this.LLILZIL) {
            return false;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 2) {
                    this.LLIZLLLIL = false;
                    this.LLILZLL = false;
                    this.LLIZ = false;
                    return super.onInterceptTouchEvent(motionEvent);
                }
                C0SSN c0ssn = this.LLJILLL;
                C0SSN c0ssn2 = C0SSN.HORIZONTAL;
                if (c0ssn == c0ssn2 || this.LLIZ) {
                    return true;
                }
                Float f3 = this.LLJJI;
                if (f3 != null) {
                    if (Math.abs(motionEvent.getRawX() - f3.floatValue()) > this.LLJILJIL && this.LLJJ == C0SSN.NONE) {
                        this.LLJJ = c0ssn2;
                    }
                }
                Float f4 = this.LLJJIII;
                if (f4 != null) {
                    if (Math.abs(motionEvent.getRawY() - f4.floatValue()) > this.LLJILJIL && this.LLJJ == C0SSN.NONE) {
                        this.LLJJ = C0SSN.VERTICAL;
                    }
                }
                if (this.LLJJ == c0ssn2 && (f2 = this.LLJJI) != null) {
                    float fAbs = Math.abs(motionEvent.getRawX() - f2.floatValue());
                    C0SOM c0som = this.LLJ;
                    if (c0som != null) {
                        boolean z2 = c0som.LLLLZIL;
                        if (fAbs > this.LLJILJIL && (c0som.getCurrentItem() == 0 || !z2)) {
                            this.LLJILLL = c0ssn2;
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                    } else if (fAbs > this.LLJILJIL) {
                        this.LLJILLL = c0ssn2;
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                }
                C0SSN c0ssn3 = this.LLJJ;
                C0SSN c0ssn4 = C0SSN.VERTICAL;
                if (c0ssn3 == c0ssn4 && (f = this.LLJJIII) != null) {
                    float fFloatValue = f.floatValue();
                    float fAbs2 = Math.abs(motionEvent.getRawY() - fFloatValue);
                    float rawY = motionEvent.getRawY() - fFloatValue;
                    if (this.LLJJIJIL && ((Boolean) C0B1R.LIZ.getValue()).booleanValue() && !this.LLIZLLLIL && fAbs2 >= this.LLJILJIL) {
                        this.LLIZLLLIL = true;
                        if (this.LLILZLL && rawY > 0.0f) {
                            this.LLIZ = true;
                            this.LLJILLL = c0ssn4;
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }
            } else {
                C0SSN c0ssn5 = C0SSN.NONE;
                this.LLJILLL = c0ssn5;
                this.LLJJ = c0ssn5;
                this.LLJJI = Float.valueOf(motionEvent.getRawX());
                this.LLJJIII = Float.valueOf(motionEvent.getRawY());
                this.LLIZ = false;
                this.LLIZLLLIL = false;
                this.LLILZLL = false;
                this.LLJ = (C0SOM) findViewById(R.id.qex);
                C0SOM c0som2 = (C0SOM) findViewById(R.id.qex);
                if (c0som2 != null) {
                    c0som2.setWithinExclusionArea(false);
                }
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.t0h);
                if (recyclerView != null && (numValueOf = Integer.valueOf(recyclerView.computeVerticalScrollOffset())) != null && numValueOf.intValue() < 1) {
                    z = true;
                }
                this.LLILZLL = z;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float rawX;
        float fFloatValue;
        double width;
        float fFloatValue2;
        float fFloatValue3;
        float f;
        if (motionEvent != null) {
            C0SOM c0som = (C0SOM) findViewById(R.id.qex);
            if (c0som != null && c0som.LLLLZLLLI) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    if (this.LLJJIJI) {
                        Float f2 = this.LLJJI;
                        if (f2 != null) {
                            fFloatValue2 = f2.floatValue();
                        } else {
                            fFloatValue2 = 0.0f;
                        }
                        Float f3 = this.LLJJIII;
                        if (f3 != null) {
                            fFloatValue3 = f3.floatValue();
                        } else {
                            fFloatValue3 = 0.0f;
                        }
                        this.LL = motionEvent.getRawX() - fFloatValue2;
                        this.LLILLJJLI = motionEvent.getRawY() - fFloatValue3;
                        if (C426750GoL.LIZLLL(getContext())) {
                            f = -this.LL;
                        } else {
                            f = this.LL;
                        }
                        if (f >= 0.0f || this.LLJI != null || this.LLIZ) {
                            this.LLJI = Float.valueOf(motionEvent.getRawX());
                            motionEvent.getRawY();
                            float f4 = this.LL;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                            setTranslationX(f4);
                            float f5 = this.LLILLJJLI;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                            setTranslationY(f5);
                            float fMin = Math.min(1.0f, Math.max(0.0f, 1 - (Math.max(this.LL / getWidth(), this.LLILLJJLI / getHeight()) * 0.5f)));
                            if (!this.LLJJIJIIJIL) {
                                this.LLJJIJIIJIL = true;
                                Function0<Unit> function0 = this.LLJJLIIIJLLLLLLLZ;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            }
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                            setScaleY(fMin);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                            setScaleX(fMin);
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.LLJILLL == C0SSN.HORIZONTAL) {
                        if (this.LLILZ == null) {
                            this.LLILZ = Float.valueOf(motionEvent.getRawX());
                        }
                        Float f6 = this.LLJI;
                        if (f6 != null) {
                            float fFloatValue4 = f6.floatValue();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("PrevX:");
                            sbLIZ.append((int) fFloatValue4);
                            sbLIZ.append(" | CurrX:");
                            sbLIZ.append((int) motionEvent.getRawX());
                            sbLIZ.append(" | Diff:");
                            sbLIZ.append((int) (motionEvent.getRawX() - fFloatValue4));
                            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                            if (this.LLILLL <= 0.0f) {
                                this.LLILLL = motionEvent.getRawX();
                            }
                            float rawX2 = motionEvent.getRawX() - fFloatValue4;
                            this.LLJI = Float.valueOf(motionEvent.getRawX());
                            this.LL = motionEvent.getRawX() - this.LLILLL;
                            if (this.LLJJJJLIIL != null) {
                                i0((int) rawX2);
                            } else if (this.LLJJJ) {
                                j0(rawX2, true);
                            }
                        } else {
                            this.LLJI = Float.valueOf(motionEvent.getRawX());
                        }
                    }
                }
            } else {
                if (this.LLJJIJI) {
                    double d = 0.2d;
                    if (C426750GoL.LIZLLL(getContext())) {
                        width = ((double) getWidth()) * 0.2d;
                        d = -1;
                    } else {
                        width = getWidth();
                    }
                    double d2 = width * d;
                    float height = getHeight() * 0.15f;
                    if (this.LLJJIJIL && this.LLILLJJLI > height) {
                        h0();
                    } else if ((C426750GoL.LIZLLL(getContext()) && this.LL > d2) || (!C426750GoL.LIZLLL(getContext()) && this.LL < d2)) {
                        if (this.LLJJJ) {
                            animate().translationX(0.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).start();
                        }
                        synchronized (this.LLJLIL) {
                            try {
                                Function0<Unit> function02 = this.LLJL;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } else {
                        h0();
                    }
                    this.LLJI = null;
                    this.LLILLL = 0.0f;
                    this.LL = 0.0f;
                    this.LLJJIJIIJIL = false;
                    return super.onTouchEvent(motionEvent);
                }
                this.LLJJIJIIJIL = false;
                this.LLJI = null;
                if (this.LLJJL != null) {
                    if (C426750GoL.LIZLLL(getContext())) {
                        Float f7 = this.LLILZ;
                        if (f7 != null) {
                            rawX = f7.floatValue();
                        } else {
                            rawX = 0.0f;
                        }
                        fFloatValue = motionEvent.getRawX();
                    } else {
                        rawX = motionEvent.getRawX();
                        Float f8 = this.LLILZ;
                        if (f8 != null) {
                            fFloatValue = f8.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                    }
                    float f9 = rawX - fFloatValue;
                    Function1<? super Float, Unit> function1 = this.LLJJL;
                    if (function1 != null) {
                        function1.invoke(Float.valueOf(f9));
                    }
                } else if (e0(false)) {
                    h0();
                } else if (this.LLJJJ && !this.LLILZIL) {
                    ValueAnimator valueAnimator = this.LLJIJIL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    this.LLJIJIL = ValueAnimator.ofFloat(0.0f, 1.0f);
                    int patientLeftMargin = getPatientLeftMargin();
                    ValueAnimator valueAnimator2 = this.LLJIJIL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setDuration(200);
                    }
                    ValueAnimator valueAnimator3 = this.LLJIJIL;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setInterpolator(new DecelerateInterpolator());
                    }
                    ValueAnimator valueAnimator4 = this.LLJIJIL;
                    if (valueAnimator4 != null) {
                        valueAnimator4.addUpdateListener(new AUListenerS68S0101000_11(this, patientLeftMargin, 3));
                    }
                    ValueAnimator valueAnimator5 = this.LLJIJIL;
                    if (valueAnimator5 != null) {
                        valueAnimator5.addListener(new AAListenerS170S0000000_11(1));
                    }
                    ValueAnimator valueAnimator6 = this.LLJIJIL;
                    if (valueAnimator6 != null) {
                        valueAnimator6.start();
                    }
                }
                this.LLILZ = null;
                this.LLILLL = 0.0f;
                this.LL = 0.0f;
                this.LLILLJJLI = 0.0f;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAllowPullDownInteractiveExit(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setDisableGestures(boolean z) {
        this.LLILZIL = z;
    }

    public final void setEnableLayoutChange(boolean z) {
        this.LLJJJ = z;
    }

    public final void setIsDraggablePageEnabled(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setLeftCallback(Function1<? super Boolean, Unit> function1) {
        this.LLJJJJJIL = function1;
    }

    public final void setOnActionUpCallback(Function1<? super Float, Unit> function1) {
        this.LLJJL = function1;
    }

    public final void setOnDragReset(Function0<Unit> function0) {
        this.LLJL = function0;
    }

    public final void setOnDragStart(Function0<Unit> function0) {
        this.LLJJLIIIJLLLLLLLZ = function0;
    }

    public final void setSwipeRightCallback(Function1<? super Integer, Unit> function1) {
        this.LLJJJJLIIL = function1;
    }

    public C0SSM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJILJIL = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLJILJILJ = 1.0f;
        C0SSN c0ssn = C0SSN.NONE;
        this.LLJILLL = c0ssn;
        this.LLJJ = c0ssn;
        this.LLJJJ = true;
        double dLJIIJ = ((double) C12ES.LJIIJ(getContext())) * 0.08d;
        this.LLJJJIL = dLJIIJ;
        this.LLJJJJ = dLJIIJ;
        this.LLJLIL = new Object();
    }

    public final void j0(float f, boolean z) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2 = (int) (f * this.LLJILJILJ);
        if (C426750GoL.LIZLLL(getContext())) {
            i = -i2;
        } else {
            i = i2;
        }
        if ((!z || i >= 0) && !e0(true) && !this.LLILZIL) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int i3 = marginLayoutParams.leftMargin + i2;
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = -i3;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(marginLayoutParams);
            }
        }
    }
}
