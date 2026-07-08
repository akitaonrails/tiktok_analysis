package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16Af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20730716Af extends FrameLayout {
    public int LL;
    public boolean LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final Scroller LLILZIL;
    public int LLILZLL;
    public Function0<Unit> LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public final VelocityTracker LLJJIII;
    public View LLJJIJI;
    public Function0<Unit> LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final CountDownTimerC20747916Gv LLJJJJ;
    public final C21616519il LLJJJJJIL;
    public final GestureDetector LLJJJJLIIL;

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.LLILZIL.computeScrollOffset()) {
            scrollTo(this.LLILZIL.getCurrX(), this.LLILZIL.getCurrY());
            invalidate();
        }
    }

    public final Function0<Unit> getDismissAction() {
        return this.LLIZ;
    }

    public final ViewGroup getInnerPushView() {
        return this.LLJJIJIL;
    }

    public final Function0<Unit> getOnRightAreaClick() {
        return this.LLJJIJIIJIL;
    }

    public final View getRightAreaView() {
        return this.LLJJIJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20730716Af.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        Boolean boolValueOf;
        float f;
        boolean z;
        int i = 0;
        if (motionEvent == null) {
            return false;
        }
        if (((Boolean) C20731216Ak.LIZLLL.getValue()).booleanValue()) {
            VelocityTracker velocityTracker = this.LLJJIII;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            int action = motionEvent.getAction();
            float f2 = 1.0f;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return true;
                    }
                } else {
                    float y = motionEvent.getY() - this.LLJILJIL;
                    C0PH3.LIZ.getClass();
                    float fAbs = Math.abs(y);
                    float f3 = 1;
                    float f4 = C0PH3.LIZIZ;
                    scrollTo(0, -((int) ((y / fAbs) * (f3 - (f3 / ((((0.3f * fAbs) * 1.0f) / f4) + f3))) * f4)));
                    return true;
                }
            }
            this.LLIZLLLIL = false;
            VelocityTracker velocityTracker2 = this.LLJJIII;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            VelocityTracker velocityTracker3 = this.LLJJIII;
            if (velocityTracker3 == null) {
                return false;
            }
            velocityTracker3.getYVelocity();
            VelocityTracker velocityTracker4 = this.LLJJIII;
            if (velocityTracker4 != null) {
                if (Math.abs(velocityTracker4.getYVelocity()) > 1000.0f) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            float x = this.LLJIJIL - motionEvent.getX();
            float y2 = this.LLJILJIL - motionEvent.getY();
            if (y2 > 0.0f) {
                if (x == 0.0f) {
                    f = 1.0f;
                } else {
                    f = x;
                }
                if (y2 / Math.abs(f) > 0.65f && this.LLJJJ && LIZ(motionEvent, true)) {
                    View view2 = this.LLJJIJI;
                    if (view2 != null) {
                        view2.callOnClick();
                    }
                    Function0<Unit> function0 = this.LLJJIJIIJIL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return true;
                }
                if (x != 0.0f) {
                    f2 = x;
                }
                if (y2 / Math.abs(f2) > 1.54f && (Math.abs(getScrollY()) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)) || Intrinsics.LJFF(boolValueOf, Boolean.TRUE))) {
                    Function0<Unit> function02 = this.LLIZ;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return true;
                }
            }
            if (this.LLJJJ) {
                View view3 = this.LLJJIJI;
                if (view3 != null) {
                    view3.callOnClick();
                }
                Function0<Unit> function03 = this.LLJJIJIIJIL;
                if (function03 != null) {
                    function03.invoke();
                }
                return true;
            }
            if (this.LLJ && this.LLJJJIL) {
                ViewGroup viewGroup = this.LLJJIJIL;
                if (viewGroup != null) {
                    viewGroup.callOnClick();
                }
                return true;
            }
            C21616519il c21616519il = this.LLJJJJJIL;
            if (c21616519il.LJFF) {
                c21616519il.LIZLLL();
            }
            this.LLJJJJJIL.LJI(getScrollY());
            this.LLJJJJJIL.LJIIIZ();
            this.LL = -1;
            return true;
        }
        if (!this.LLJJJJLIIL.onTouchEvent(motionEvent) && this.LLILZLL == 0) {
            int action2 = motionEvent.getAction();
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 != 3) {
                        if (action2 == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.LL) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.LL = motionEvent.getPointerId(i);
                            }
                        }
                    }
                } else {
                    int i2 = this.LL;
                    if (i2 == -1 || motionEvent.findPointerIndex(i2) < 0) {
                        return false;
                    }
                    if (Math.min(motionEvent.getRawY() - 0.0f, this.LLILLL) > this.LLILLL / 4 && !this.LLILLJJLI) {
                        int i3 = (int) this.LLILZ;
                        ViewGroup.LayoutParams layoutParams = getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-1, i3);
                        }
                        layoutParams.height = i3;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setLayoutParams(layoutParams);
                        scrollBy(0, -((int) this.LLILLL));
                        this.LLILLJJLI = true;
                        return true;
                    }
                }
            }
            if (this.LLJJJ && LIZ(motionEvent, true) && (view = this.LLJJIJI) != null) {
                view.callOnClick();
            }
            if (motionEvent.findPointerIndex(this.LL) < 0) {
                return false;
            }
            if (this.LLILLJJLI) {
                this.LLILLJJLI = false;
                int i4 = -getScrollY();
                this.LLILZIL.startScroll(0, i4, 0, -i4, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                invalidate();
                this.LL = -1;
                this.LLILZLL = 2;
            }
            this.LL = -1;
            return true;
        }
        return true;
    }

    public final void setDismissAction(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setInnerPushView(ViewGroup viewGroup) {
        this.LLJJIJIL = viewGroup;
    }

    public final void setOnRightAreaClick(Function0<Unit> function0) {
        this.LLJJIJIIJIL = function0;
    }

    public final void setRightAreaView(View view) {
        this.LLJJIJI = view;
    }

    public final void setTouched(boolean z) {
        this.LLIZLLLIL = z;
    }

    public C20730716Af(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        this.LLILLL = C12ES.LIZJ(25.0f, context);
        this.LLILZ = C12ES.LIZJ(160.0f, context);
        this.LLILZIL = new Scroller(context);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJI = scaledTouchSlop * scaledTouchSlop;
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLJJIII = VelocityTracker.obtain();
        this.LLJJJJ = new CountDownTimerC20747916Gv(this, longPressTimeout, longPressTimeout, 3);
        C21616519il c21616519il = new C21616519il(this, AbstractC21616419ik.LJIL);
        C21581419d6 c21581419d6 = new C21581419d6(0.0f);
        c21581419d6.LIZ(0.85f);
        c21581419d6.LIZIZ(522.0f);
        c21616519il.LJJ = c21581419d6;
        c21616519il.LIZJ(new InterfaceC20731416Am() { // from class: X.16Aj
            @Override // X.InterfaceC20731416Am
            public final void LIZ(float f, float f2) {
                this.LIZ.getClass();
            }
        });
        c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.16Ai
            @Override // X.InterfaceC1427630nFp
            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                this.LIZ.LLJILJIL = 0.0f;
            }
        });
        this.LLJJJJJIL = c21616519il;
        this.LLJJJJLIIL = new GestureDetector(context, new C20750816Hy(this, 1));
    }

    public final boolean LIZ(MotionEvent motionEvent, boolean z) {
        if (motionEvent == null) {
            return false;
        }
        Rect rect = new Rect();
        View view = this.LLJJIJI;
        if (view != null) {
            view.getHitRect(rect);
        }
        int i = rect.left;
        int i2 = this.LLJILLL;
        int i3 = rect.top;
        int i4 = this.LLJJ;
        rect.set(i + i2, i3 + i4, rect.right + i2, rect.bottom + i4);
        if (z) {
            int i5 = rect.left;
            int i6 = this.LLJJI;
            rect.set(i5 - i6, rect.top - i6, rect.right + i6, rect.bottom + i6);
        }
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }
}
