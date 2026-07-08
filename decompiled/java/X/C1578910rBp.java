package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0rBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578910rBp extends C19RF {
    public float LLILZIL;
    public float LLILZLL;
    public long LLIZ;
    public InterfaceC1578920rBq LLIZLLLIL;
    public final C1317550kOH LLJ;

    public C1578910rBp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJ;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        EnumC1578110rAX enumC1578110rAX;
        EnumC1578110rAX enumC1578110rAX2;
        super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getPointerCount() >= 2) {
            EnumC1578110rAX enumC1578110rAX3 = EnumC1578110rAX.MULTI_FINDER;
            InterfaceC1578920rBq interfaceC1578920rBq = this.LLIZLLLIL;
            if (interfaceC1578920rBq != null && interfaceC1578920rBq.LIZ(enumC1578110rAX3)) {
                LIZ(enumC1578110rAX3, true);
                return true;
            }
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX() - this.LLILZIL;
                    float y = motionEvent.getY() - this.LLILZLL;
                    if (Math.abs(y) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) && Math.abs(y) > Math.abs(x)) {
                        if (y < 0.0f) {
                            enumC1578110rAX2 = EnumC1578110rAX.SWIPE_UP;
                        } else {
                            enumC1578110rAX2 = EnumC1578110rAX.SWIPE_DOWN;
                        }
                        InterfaceC1578920rBq interfaceC1578920rBq2 = this.LLIZLLLIL;
                        if (interfaceC1578920rBq2 != null && interfaceC1578920rBq2.LIZ(enumC1578110rAX2)) {
                            LIZ(enumC1578110rAX2, true);
                            return true;
                        }
                    } else if (Math.abs(x) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) && Math.abs(x) > Math.abs(y)) {
                        if (x < 0.0f) {
                            enumC1578110rAX = EnumC1578110rAX.SWIPE_LEFT;
                        } else {
                            enumC1578110rAX = EnumC1578110rAX.SWIPE_RIGHT;
                        }
                        InterfaceC1578920rBq interfaceC1578920rBq3 = this.LLIZLLLIL;
                        if (interfaceC1578920rBq3 != null && interfaceC1578920rBq3.LIZ(enumC1578110rAX)) {
                            LIZ(enumC1578110rAX, true);
                            return true;
                        }
                    } else if (System.currentTimeMillis() - this.LLIZ > ViewConfiguration.getDoubleTapTimeout() / 2) {
                        EnumC1578110rAX enumC1578110rAX4 = EnumC1578110rAX.LONG_CLICK;
                        InterfaceC1578920rBq interfaceC1578920rBq4 = this.LLIZLLLIL;
                        if (interfaceC1578920rBq4 != null && interfaceC1578920rBq4.LIZ(enumC1578110rAX4)) {
                            LIZ(enumC1578110rAX4, true);
                            return true;
                        }
                    }
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                EnumC1578110rAX enumC1578110rAX5 = EnumC1578110rAX.CLICK;
                InterfaceC1578920rBq interfaceC1578920rBq5 = this.LLIZLLLIL;
                if (interfaceC1578920rBq5 != null && interfaceC1578920rBq5.LIZ(enumC1578110rAX5)) {
                    float x2 = motionEvent.getX() - this.LLILZIL;
                    float y2 = motionEvent.getY() - this.LLILZLL;
                    if (Math.abs(x2) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) && Math.abs(y2) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) {
                        LIZ(enumC1578110rAX5, false);
                        return true;
                    }
                }
            }
        } else {
            this.LLILZIL = motionEvent.getX();
            this.LLILZLL = motionEvent.getY();
            this.LLIZ = System.currentTimeMillis();
        }
        return false;
    }

    public final void setListener(InterfaceC1578920rBq interfaceC1578920rBq) {
        this.LLIZLLLIL = interfaceC1578920rBq;
    }

    public final void LIZ(EnumC1578110rAX enumC1578110rAX, boolean z) {
        if (z) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        InterfaceC1578920rBq interfaceC1578920rBq = this.LLIZLLLIL;
        if (interfaceC1578920rBq != null) {
            interfaceC1578920rBq.LIZIZ(enumC1578110rAX);
        }
    }

    public C1578910rBp(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJ = new C1317550kOH();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        System.currentTimeMillis();
        System.currentTimeMillis();
        return false;
    }
}
