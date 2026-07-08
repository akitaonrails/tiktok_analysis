package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0Ifh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472350Ifh extends FrameLayout {
    public final C01GW LL;
    public float LLILLJJLI;
    public float LLILLL;
    public boolean LLILZ;
    public C469560IbC LLILZIL;
    public Function0<Boolean> LLILZLL;
    public final int LLIZ;
    public VelocityTracker LLIZLLLIL;

    public final void LIZIZ() {
        this.LLILZ = false;
        VelocityTracker velocityTracker = getVelocityTracker();
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    private final int getTouchSlop() {
        return ((Number) this.LL.getValue()).intValue();
    }

    private final VelocityTracker getVelocityTracker() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = VelocityTracker.obtain();
        }
        return this.LLIZLLLIL;
    }

    public final void LIZ() {
        if (getChildCount() <= 1) {
            return;
        }
        getChildAt(getChildCount() - 1).animate().translationX(0.0f).setDuration(200L).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = getVelocityTracker();
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LLIZLLLIL = null;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r7.LLILZLL
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            boolean r0 = super.onInterceptTouchEvent(r8)
            return r0
        L13:
            int r1 = r8.getAction()
            r2 = 0
            if (r1 == 0) goto L7e
            r3 = 1
            if (r1 == r3) goto L7a
            r0 = 2
            if (r1 == r0) goto L28
            r0 = 3
            if (r1 == r0) goto L7a
        L23:
            boolean r0 = super.onInterceptTouchEvent(r8)
            return r0
        L28:
            boolean r0 = r7.LLILZ
            if (r0 != 0) goto L23
            android.view.VelocityTracker r0 = r7.getVelocityTracker()
            if (r0 == 0) goto L35
            r0.addMovement(r8)
        L35:
            float r6 = r8.getX()
            float r0 = r7.LLILLJJLI
            float r6 = r6 - r0
            float r1 = r8.getY()
            float r0 = r7.LLILLL
            float r1 = r1 - r0
            float r5 = java.lang.Math.abs(r6)
            float r4 = java.lang.Math.abs(r1)
            int r0 = r7.getTouchSlop()
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L5d
            int r0 = r7.getTouchSlop()
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L23
        L5d:
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r4 * r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L74
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L74
            r7.LLILZ = r3
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            return r3
        L74:
            float r5 = r5 * r1
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L23
            return r2
        L7a:
            r7.LIZIZ()
            goto L23
        L7e:
            float r0 = r8.getX()
            r7.LLILLJJLI = r0
            float r0 = r8.getY()
            r7.LLILLL = r0
            r7.LLILZ = r2
            android.view.VelocityTracker r0 = r7.getVelocityTracker()
            if (r0 == 0) goto L95
            r0.clear()
        L95:
            android.view.VelocityTracker r0 = r7.getVelocityTracker()
            if (r0 == 0) goto L23
            r0.addMovement(r8)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472350Ifh.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float x;
        int action = motionEvent.getAction();
        if (action == 0) {
            return true;
        }
        float xVelocity = 0.0f;
        if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.LLILZ) {
                    LIZ();
                    LIZIZ();
                    return true;
                }
            } else {
                if (!this.LLILZ) {
                    float x2 = motionEvent.getX() - this.LLILLJJLI;
                    float y = motionEvent.getY() - this.LLILLL;
                    float fAbs = Math.abs(x2);
                    float fAbs2 = Math.abs(y);
                    if (fAbs > getTouchSlop() && fAbs > fAbs2 && x2 > 0.0f) {
                        this.LLILZ = true;
                    } else if (fAbs2 > getTouchSlop() && fAbs2 > fAbs) {
                        LIZIZ();
                        return false;
                    }
                }
                if (this.LLILZ) {
                    VelocityTracker velocityTracker = getVelocityTracker();
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                    }
                    if (C497740JfY.LJJ()) {
                        x = this.LLILLJJLI - motionEvent.getX();
                    } else {
                        x = motionEvent.getX() - this.LLILLJJLI;
                    }
                    float fLIZLLL = C13LZ.LIZLLL(x / getWidth(), 0.0f, 1.0f);
                    if (getChildCount() > 1) {
                        C786410Ut5.Jc(getChildAt(getChildCount() - 1), fLIZLLL * getWidth());
                    }
                    return true;
                }
            }
        } else if (this.LLILZ) {
            VelocityTracker velocityTracker2 = getVelocityTracker();
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            VelocityTracker velocityTracker3 = getVelocityTracker();
            if (velocityTracker3 != null) {
                xVelocity = velocityTracker3.getXVelocity();
            }
            float x3 = motionEvent.getX() - this.LLILLJJLI;
            if (xVelocity > this.LLIZ) {
                z = true;
            } else {
                z = false;
            }
            if (x3 <= ((double) getWidth()) * 0.3d && !z) {
                LIZ();
            } else {
                C469560IbC c469560IbC = this.LLILZIL;
                if (c469560IbC != null) {
                    c469560IbC.LIZ();
                }
                if (getChildCount() > 1) {
                    super.performClick();
                    getChildAt(getChildCount() - 1).animate().translationX(getWidth()).setDuration(200L).start();
                }
            }
            LIZIZ();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCanSlideClose(Function0<Boolean> function0) {
        this.LLILZLL = function0;
    }

    public final void setOnSwipeListener(C469560IbC c469560IbC) {
        this.LLILZIL = c469560IbC;
    }

    public C472350Ifh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C452501pT.LIZIZ(new AwS551S0100000_7(context, 79));
        this.LLILZLL = AFwS193S0000000_7.get$arr$(78);
        this.LLIZ = 500;
    }
}
