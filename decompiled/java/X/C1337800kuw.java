package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS564S0100000_20;
import u4.q0;

/* JADX INFO: renamed from: X.0kuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337800kuw extends C16G0 {
    public static final C1085640eME<Rect> LLLIZZ = new C1085640eME<>(12);
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public float LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public boolean LLL;
    public RecyclerView LLLF;
    public int LLLFF;
    public int LLLFFI;
    public Function1<? super Float, Unit> LLLFZ;
    public Function1<? super Float, Unit> LLLI;
    public int LLLII;
    public Function0<Unit> LLLIIII;
    public Function0<? extends View> LLLIIIIL;
    public GestureDetector LLLIIIL;
    public Function1<? super MotionEvent, Boolean> LLLIIL;
    public Function0<Unit> LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public RecyclerView LLLILZJ;
    public boolean LLLILZLLLI;

    private final float getSwipeRightSpeedLimit() {
        return 2000.0f;
    }

    private final float getMaximumVelocity() {
        return ((Number) this.LLJL.getValue()).floatValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue();
    }

    private final VelocityTracker getVelocityTracker() {
        return (VelocityTracker) this.LLJLIL.getValue();
    }

    public final ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) this.LLJJL.getValue();
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLLIIIL == null) {
            this.LLLIIIL = new GestureDetector(getContext(), new C21648719nx() { // from class: X.0kux
                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    Function1<Float, Unit> flingUpLambda;
                    if (motionEvent != null && motionEvent2 != null) {
                        float y = motionEvent2.getY() - motionEvent.getY();
                        if (Math.abs(motionEvent2.getX() - motionEvent.getX()) / y < 1.0f) {
                            if (y > this.LL.getFlingSlideDownDeltaY() && f2 >= this.LL.getFlingThreshold()) {
                                Function1<Float, Unit> flingDownLambda = this.LL.getFlingDownLambda();
                                if (flingDownLambda != null) {
                                    flingDownLambda.invoke(Float.valueOf(f2));
                                }
                            } else if ((-f2) >= this.LL.getFlingUpThreshold() && (flingUpLambda = this.LL.getFlingUpLambda()) != null) {
                                flingUpLambda.invoke(Float.valueOf(f2));
                                return false;
                            }
                        }
                    }
                    return false;
                }
            });
        }
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLIIIL = null;
    }

    public final Function1<Float, Unit> getFlingDownLambda() {
        return this.LLLI;
    }

    public final int getFlingSlideDownDeltaY() {
        return this.LLLII;
    }

    public final int getFlingThreshold() {
        return this.LLLFF;
    }

    public final Function1<Float, Unit> getFlingUpLambda() {
        return this.LLLFZ;
    }

    public final int getFlingUpThreshold() {
        return this.LLLFFI;
    }

    public final Function0<View> getObtainAnchorViewLambda() {
        return this.LLLIIIIL;
    }

    public final Function0<Unit> getOnNextDownListener() {
        return this.LLLIILIL;
    }

    public final Function1<MotionEvent, Boolean> getOnTouchEventListener() {
        return this.LLLIIL;
    }

    public final RecyclerView getScrollingChild() {
        return this.LLLF;
    }

    public final Function0<Unit> getSlideDownLambda() {
        return this.LLLIIII;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        RecyclerView recyclerView;
        int i;
        Function0<Unit> function0;
        float x;
        float x2;
        View viewInvoke;
        if (motionEvent.getActionMasked() == 5) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            GestureDetector gestureDetector2 = this.LLLIIIL;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
        } else if (motionEvent.getPointerCount() <= 1 && (gestureDetector = this.LLLIIIL) != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            this.LLL = false;
            this.LLJZIJLIL = 0.0f;
            this.LLLIL = false;
            this.LLLILZ = false;
            this.LLLILZLLLI = false;
            Function0<? extends View> function02 = this.LLLIIIIL;
            RecyclerView recyclerView2 = null;
            if (function02 != null && (viewInvoke = function02.invoke()) != null && LJIJJLI(motionEvent, viewInvoke) && (viewInvoke instanceof RecyclerView)) {
                recyclerView2 = (RecyclerView) viewInvoke;
            }
            this.LLLILZJ = recyclerView2;
            float x3 = motionEvent.getX();
            this.LLJLILLLLZIIL = x3;
            this.LLJLLIL = x3;
            float y = motionEvent.getY();
            this.LLJLL = y;
            this.LLJLLL = y;
            this.LLJZ = motionEvent.getRawY();
            motionEvent.getRawX();
            motionEvent.getRawX();
            motionEvent.getRawY();
            getVelocityTracker().clear();
            getVelocityTracker().addMovement(motionEvent);
            this.LLL = LJIJJLI(motionEvent, this.LLLF);
            Function0<Unit> function03 = this.LLLIILIL;
            if (function03 != null) {
                function03.invoke();
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.LLL = false;
                        this.LLJZIJLIL = 0.0f;
                    }
                } else {
                    float y2 = motionEvent.getY() - this.LLJLLL;
                    if (C426750GoL.LIZLLL(getContext())) {
                        x = this.LLJLLIL;
                        x2 = motionEvent.getX();
                    } else {
                        x = motionEvent.getX();
                        x2 = this.LLJLLIL;
                    }
                    float f = x - x2;
                    if (f > 0.0f && (((Number) C276120Ary.LIZ.getValue()).intValue() != 1 ? Math.abs(f) > Math.abs(y2) : ((double) Math.abs(f)) * 0.5d > Math.abs(y2))) {
                        Math.abs(f);
                        getTouchSlop();
                    }
                    if (this.LLL) {
                        getVelocityTracker().addMovement(motionEvent);
                        this.LLJZIJLIL = motionEvent.getRawY() - this.LLJZ;
                        this.LLJZ = motionEvent.getRawY();
                    }
                }
            } else {
                VelocityTracker velocityTracker = getVelocityTracker();
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, getMaximumVelocity());
                float yVelocity = velocityTracker.getYVelocity();
                velocityTracker.getXVelocity();
                if (this.LLL && Math.abs(yVelocity) > getSwipeRightSpeedLimit() && this.LLJZIJLIL > 0.0f && (function0 = this.LLLIIII) != null) {
                    function0.invoke();
                }
                this.LLL = false;
                this.LLJZIJLIL = 0.0f;
            }
        } else if (C426750GoL.LIZLLL(getContext())) {
            motionEvent.getX();
            getWidth();
        } else {
            motionEvent.getX();
            getWidth();
        }
        if (this.LLLILZ && motionEvent.getActionMasked() == 3) {
            this.LLLILZ = false;
            return true;
        }
        if (!this.LLLILZLLLI && motionEvent.getActionMasked() == 2 && (recyclerView = this.LLLILZJ) != null) {
            float x4 = motionEvent.getX() - this.LLJLILLLLZIIL;
            float y3 = motionEvent.getY() - this.LLJLL;
            float fAbs = Math.abs(x4);
            float fAbs2 = Math.abs(y3);
            if (fAbs > getTouchSlop() && fAbs > fAbs2) {
                if (x4 > 0.0f) {
                    i = -1;
                } else {
                    i = 1;
                }
                if (recyclerView.canScrollHorizontally(i)) {
                    this.LLLILZLLLI = true;
                }
            }
        }
        if (this.LLLILZLLLI) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Function1<? super MotionEvent, Boolean> function1 = this.LLLIIL;
        if (function1 != null && function1.invoke(motionEvent).booleanValue() && !this.LLLIL) {
            this.LLLIL = true;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            RecyclerView recyclerView3 = this.LLLF;
            if (recyclerView3 != null) {
                recyclerView3.stopScroll();
                q0.LJJIII(0, recyclerView3);
            }
            MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
            motionEventObtain2.setAction(3);
            this.LLLILZ = true;
            super.dispatchTouchEvent(motionEventObtain2);
            motionEventObtain2.recycle();
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        if (this.LLLIL) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                this.LLLIL = false;
                this.LLLILZ = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C16G0, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLLIL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C16G0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLLIL) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.LLLIL && !z) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setFlingDownLambda(Function1<? super Float, Unit> function1) {
        this.LLLI = function1;
    }

    public final void setFlingSlideDownDeltaY(int i) {
        this.LLLII = i;
    }

    public final void setFlingThreshold(int i) {
        this.LLLFF = i;
    }

    public final void setFlingUpLambda(Function1<? super Float, Unit> function1) {
        this.LLLFZ = function1;
    }

    public final void setFlingUpThreshold(int i) {
        this.LLLFFI = i;
    }

    public final void setObtainAnchorViewLambda(Function0<? extends View> function0) {
        this.LLLIIIIL = function0;
    }

    public final void setOnNextDownListener(Function0<Unit> function0) {
        this.LLLIILIL = function0;
    }

    public final void setOnTouchEventListener(Function1<? super MotionEvent, Boolean> function1) {
        this.LLLIIL = function1;
    }

    public final void setScrollingChild(RecyclerView recyclerView) {
        this.LLLF = recyclerView;
    }

    public final void setSlideDownLambda(Function0<Unit> function0) {
        this.LLLIIII = function0;
    }

    public C1337800kuw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJL = C452501pT.LIZIZ(new AwS564S0100000_20(context, 48));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS564S0100000_20(this, 47));
        this.LLJL = C452501pT.LIZIZ(new AwS564S0100000_20(this, 46));
        this.LLJLIL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(89));
        this.LLLFF = (int) (150 * context.getResources().getDisplayMetrics().density);
        this.LLLFFI = (int) (DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL * context.getResources().getDisplayMetrics().density);
        this.LLLII = 150;
    }

    public final boolean LJIJJLI(MotionEvent motionEvent, View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        C1085640eME<Rect> c1085640eME = LLLIZZ;
        Rect rectLIZIZ = c1085640eME.LIZIZ();
        if (rectLIZIZ == null) {
            rectLIZIZ = new Rect();
        }
        C1292450jjn.LIZ(rectLIZIZ, view, this);
        try {
            boolean zContains = rectLIZIZ.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            rectLIZIZ.setEmpty();
            c1085640eME.LIZ(rectLIZIZ);
            return zContains;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            rectLIZIZ.setEmpty();
            LLLIZZ.LIZ(rectLIZIZ);
            throw th;
        }
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Function0<Unit> function0;
        if (f2 < 0.0f && (function0 = this.LLLIIII) != null) {
            function0.invoke();
        }
        return super.onNestedPreFling(view, f, f2);
    }
}
