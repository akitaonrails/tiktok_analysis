package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SU0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SU0 extends ViewOnAttachStateChangeListenerC20604515jv implements InterfaceC1086570eNj {
    public Function1<? super Boolean, Unit> LLILZ;
    public Float LLILZIL;
    public Float LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public ValueAnimator LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public final int LLJJI;
    public Function0<Unit> LLJJIII;
    public Function0<Unit> LLJJIJI;
    public GestureDetector LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public float LLJJJIL;
    public C560150Ly1 LLJJJJ;
    public Function1<? super MotionEvent, Unit> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public final int LLJLIL;
    public float LLJLILLLLZIIL;
    public Function0<? extends View> LLJLL;
    public C0SU1 LLJLLIL;
    public MotionEvent LLJLLL;
    public View LLJZ;
    public final int LLJZIJLIL;
    public final double LLL;
    public final double LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public int LLLFZ;
    public Function0<Boolean> LLLI;
    public Function1<? super Float, Boolean> LLLII;

    private final int getLowerThreshold() {
        if (this.LLLFZ == Integer.MAX_VALUE) {
            this.LLLFZ = this.LLJILJIL - ((int) this.LLL);
        }
        return this.LLLFZ;
    }

    public final void LJJI() {
        MotionEvent motionEvent = this.LLJLLL;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJLLIL = C0SU1.LL;
    }

    public final int getPatientTopMargin() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        return marginLayoutParams.topMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = new GestureDetector(getContext(), new C739050Syt(this, 2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJIJIIJIL = null;
    }

    public final boolean getEnableFlingCheckPosRaw() {
        return this.LLLFFI;
    }

    public final int getFlingSlideDeltaY() {
        return this.LLLFF;
    }

    public final Function0<View> getGetUnderlyingTouchView() {
        return this.LLJLL;
    }

    public final float getIgnoreTopArea() {
        return this.LLJLILLLLZIIL;
    }

    public C560150Ly1 getLoadPauseScrollListener() {
        return this.LLJJJJ;
    }

    public final Function1<Boolean, Unit> getOnDragOutOfBounds() {
        return this.LLILZ;
    }

    public final Function1<MotionEvent, Unit> getOnTouchEventListener() {
        return this.LLJJJJJIL;
    }

    public final double getUpperThreshold() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1086570eNj
    public final void LIZ(int i) {
        if (i > 0 && getLoadPauseScrollListener() == null && getScrollState() == 0) {
            C560150Ly1 c560150Ly1 = new C560150Ly1(i);
            addOnScrollListener(c560150Ly1);
            setLoadPauseScrollListener(c560150Ly1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIFFI(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SU0.LJJIFFI(android.view.MotionEvent):boolean");
    }

    public final View LJJIII(MotionEvent motionEvent) {
        View viewInvoke;
        Function0<? extends View> function0 = this.LLJLL;
        if (function0 == null || (viewInvoke = function0.invoke()) == null || viewInvoke.getVisibility() != 0 || !viewInvoke.isAttachedToWindow()) {
            return null;
        }
        int[] iArr = new int[2];
        viewInvoke.getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (rawX >= iArr[0] && rawX < r1 + viewInvoke.getWidth()) {
            if (rawY >= iArr[1] && rawY < r1 + viewInvoke.getHeight()) {
                return viewInvoke;
            }
        }
        return null;
    }

    public final void LJJIIJ(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int i = marginLayoutParams.topMargin + ((int) (f * this.LLJJI));
        if (i < 0) {
            return;
        }
        marginLayoutParams.topMargin = i;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SU0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.LLJJL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action == 2) {
                if (Math.abs(motionEvent.getY() - this.LLJL) > Math.abs(motionEvent.getX() - this.LLJJLIIIJLLLLLLLZ) + this.LLJLIL) {
                    z = true;
                }
            }
            if (super.onInterceptTouchEvent(motionEvent) && !z) {
                return false;
            }
        }
        this.LLJJLIIIJLLLLLLLZ = motionEvent.getX();
        this.LLJL = motionEvent.getY();
        z = false;
        return super.onInterceptTouchEvent(motionEvent) ? true : true;
    }

    public final void setEnableFlingCheckPosRaw(boolean z) {
        this.LLLFFI = z;
    }

    public final void setEnableTouchConflict(boolean z) {
        this.LLJJL = z;
    }

    public final void setFlingDownCallback(Function1<? super Float, Boolean> function1) {
        this.LLLII = function1;
    }

    public final void setFlingSlideDeltaY(int i) {
        this.LLLFF = i;
    }

    public final void setGetUnderlyingTouchView(Function0<? extends View> function0) {
        this.LLJLL = function0;
    }

    public final void setIgnoreTopArea(float f) {
        this.LLJLILLLLZIIL = f;
    }

    public final void setInTouch(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public void setLoadPauseScrollListener(C560150Ly1 c560150Ly1) {
        this.LLJJJJ = c560150Ly1;
    }

    public final void setOnActionUpLambda(Function0<Unit> function0) {
        this.LLJJIJI = function0;
    }

    public final void setOnDragOutOfBounds(Function1<? super Boolean, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setOnHorizontalSlopExceeded(Function0<Unit> function0) {
        this.LLJJIII = function0;
    }

    public final void setOnTouchEventListener(Function1<? super MotionEvent, Unit> function1) {
        this.LLJJJJJIL = function1;
    }

    public final void setUpperThresholdCallback(Function0<Boolean> function0) {
        this.LLLI = function0;
    }

    public C0SU0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLIZLLLIL = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLJIJIL = true;
        this.LLJILJIL = Integer.MAX_VALUE;
        this.LLJILLL = -2.1474836E9f;
        this.LLJJ = -2.1474836E9f;
        this.LLJJI = 1;
        this.LLJLIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLJLLIL = C0SU1.LL;
        this.LLJZIJLIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLLFF = 150;
        this.LLLFZ = Integer.MAX_VALUE;
        double dLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
        this.LLL = dLIZIZ;
        this.LLLF = dLIZIZ;
    }

    public final boolean LJJII(MotionEvent motionEvent, View view) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        float f = iArr[0] - iArr2[0];
        float f2 = iArr[1] - iArr2[1];
        motionEvent.offsetLocation(f, f2);
        boolean zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation(-f, -f2);
        return zDispatchTouchEvent;
    }
}
