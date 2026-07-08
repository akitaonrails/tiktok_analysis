package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0Ibd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469830Ibd extends C21586319dt {
    public boolean LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;
    public VelocityTracker LLIZ;
    public Function0<Boolean> LLIZLLLIL;
    public Function0<Boolean> LLJ;

    private final int getTouchSlop() {
        return ((Number) this.LLILZLL.getValue()).intValue();
    }

    private final VelocityTracker getVelocityTracker() {
        if (this.LLIZ == null) {
            this.LLIZ = VelocityTracker.obtain();
        }
        return this.LLIZ;
    }

    private final View getDrawerView() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt.getLayoutParams() instanceof DrawerLayout$LayoutParams) && ((DrawerLayout$LayoutParams) childAt.getLayoutParams()).gravity == 8388613) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    @Override // X.C21586319dt, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L7
            boolean r0 = super.onInterceptTouchEvent(r6)
            return r0
        L7:
            int r0 = r6.getActionMasked()
            r3 = 0
            if (r0 != 0) goto L3e
            float r4 = r6.getX()
            float r2 = r6.getY()
            android.view.View r1 = r5.getDrawerView()
            if (r1 != 0) goto L21
            boolean r0 = super.onInterceptTouchEvent(r6)
            return r0
        L21:
            boolean r0 = LIZ(r4, r2, r1)
            r5.LL = r0
            boolean r0 = LIZIZ(r4, r2, r1)
            r5.LLILLJJLI = r0
            int r0 = X.C497740JfY.LIZ
            boolean r0 = X.C500260Jjc.LJJIII(r0)
            if (r0 == 0) goto L3a
            boolean r0 = super.onInterceptTouchEvent(r6)
            return r0
        L3a:
            super.onInterceptTouchEvent(r6)
            return r3
        L3e:
            r0 = 8388613(0x800005, float:1.175495E-38)
            boolean r0 = r5.isDrawerOpen(r0)
            r1 = 1
            if (r0 == 0) goto L62
            boolean r0 = r5.LLILLJJLI
            if (r0 == 0) goto L73
            boolean r2 = super.onInterceptTouchEvent(r6)
        L50:
            int r0 = r6.getActionMasked()
            if (r0 == r1) goto L5d
            int r1 = r6.getActionMasked()
            r0 = 3
            if (r1 != r0) goto L61
        L5d:
            r5.LL = r3
            r5.LLILLJJLI = r3
        L61:
            return r2
        L62:
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r5.LLJ
            if (r0 == 0) goto L96
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L96
            goto L83
        L73:
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L85
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L85
        L83:
            r2 = 0
            goto L50
        L85:
            boolean r0 = r5.LL
            if (r0 != 0) goto L91
            int r0 = X.C497740JfY.LIZ
            boolean r0 = X.C500260Jjc.LJJIII(r0)
            if (r0 == 0) goto L83
        L91:
            boolean r2 = super.onInterceptTouchEvent(r6)
            goto L50
        L96:
            boolean r2 = super.onInterceptTouchEvent(r6)
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469830Ibd.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    @Override // X.C21586319dt, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 0
            if (r8 != 0) goto L4
            return r1
        L4:
            boolean r6 = super.onTouchEvent(r8)
            r0 = 8388613(0x800005, float:1.175495E-38)
            boolean r0 = r7.isDrawerOpen(r0)
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = X.C497740JfY.LIZ
            boolean r0 = X.C500260Jjc.LJJIII(r0)
            if (r0 == 0) goto L1b
            return r6
        L1b:
            android.view.View r3 = r7.getDrawerView()
            if (r3 != 0) goto L22
            return r1
        L22:
            float r2 = r8.getX()
            float r0 = r8.getY()
            boolean r0 = LIZ(r2, r0, r3)
            if (r0 != 0) goto L3f
            float r2 = r8.getX()
            float r0 = r8.getY()
            boolean r0 = LIZIZ(r2, r0, r3)
            if (r0 != 0) goto L3f
            return r1
        L3f:
            int r2 = r8.getAction()
            if (r2 == 0) goto Lac
            r3 = 1
            if (r2 == r3) goto L9a
            r0 = 2
            if (r2 == r0) goto L4f
            r0 = 3
            if (r2 == r0) goto L9a
        L4e:
            return r1
        L4f:
            boolean r0 = r7.LLILZIL
            if (r0 != 0) goto Lab
            android.view.VelocityTracker r0 = r7.getVelocityTracker()
            if (r0 == 0) goto L5c
            r0.addMovement(r8)
        L5c:
            float r5 = r8.getX()
            float r0 = r7.LLILLL
            float r5 = r5 - r0
            float r2 = r8.getY()
            float r0 = r7.LLILZ
            float r2 = r2 - r0
            float r4 = java.lang.Math.abs(r5)
            float r2 = java.lang.Math.abs(r2)
            int r0 = r7.getTouchSlop()
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L84
            int r0 = r7.getTouchSlop()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4e
        L84:
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto Laa
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto Laa
            r7.LLILZIL = r3
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            return r6
        L9a:
            boolean r0 = r7.LLILZIL
            if (r0 == 0) goto L4e
            r7.LLILZIL = r1
            android.view.VelocityTracker r0 = r7.getVelocityTracker()
            if (r0 == 0) goto La9
            r0.clear()
        La9:
            return r6
        Laa:
            return r1
        Lab:
            return r6
        Lac:
            r7.LLILZIL = r1
            float r0 = r8.getX()
            r7.LLILLL = r0
            float r0 = r8.getY()
            r7.LLILZ = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469830Ibd.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCanSlideCloseDrawerLayout(Function0<Boolean> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setCanSlideOpenDrawerLayout(Function0<Boolean> function0) {
        this.LLJ = function0;
    }

    public C469830Ibd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C469830Ibd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(context, 78));
    }

    public static boolean LIZ(float f, float f2, View view) {
        if (f >= view.getLeft() && f <= view.getRight() && f2 >= view.getTop() && f2 <= view.getBottom()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(float f, float f2, View view) {
        if (C497740JfY.LJJ()) {
            if (f < view.getRight() - ((int) C497740JfY.LIZIZ(16.0f)) || f > view.getRight() + ((int) C497740JfY.LIZIZ(187.5f))) {
                return false;
            }
        } else if (f < view.getLeft() - ((int) C497740JfY.LIZIZ(187.5f)) || f > view.getLeft() + ((int) C497740JfY.LIZIZ(16.0f))) {
            return false;
        }
        if (f2 >= view.getTop() && f2 <= view.getBottom()) {
            return true;
        }
        return false;
    }
}
