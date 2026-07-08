package Y;

import X.C786410Ut5;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;

/* JADX INFO: loaded from: classes29.dex */
public class ATListenerS347S0200000_28 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS347S0200000_28(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS347S0200000_28 aTListenerS347S0200000_28, View view, MotionEvent motionEvent) {
        View view2;
        ((BaseSwipeUpComponent) aTListenerS347S0200000_28.l0).dS();
        BaseSwipeUpComponent baseSwipeUpComponent = (BaseSwipeUpComponent) aTListenerS347S0200000_28.l0;
        baseSwipeUpComponent.getClass();
        if (!(baseSwipeUpComponent instanceof SwipeUpVideoComponent) || (view2 = ((BaseSwipeUpComponent) aTListenerS347S0200000_28.l0).LLJI) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    BaseSwipeUpComponent baseSwipeUpComponent2 = (BaseSwipeUpComponent) aTListenerS347S0200000_28.l0;
                    float rawY = (int) motionEvent.getRawY();
                    BaseSwipeUpComponent baseSwipeUpComponent3 = (BaseSwipeUpComponent) aTListenerS347S0200000_28.l0;
                    baseSwipeUpComponent2.LLJJ = rawY - baseSwipeUpComponent3.LLJILLL;
                    float f = baseSwipeUpComponent3.LLJJ;
                    if (f < 0.0f) {
                        C786410Ut5.ed(view2, f);
                    }
                }
            } else {
                float fAbs = Math.abs(view2.getTranslationY());
                int measuredHeight = view2.getMeasuredHeight();
                ((BaseSwipeUpComponent) aTListenerS347S0200000_28.l0).getClass();
                if (fAbs >= measuredHeight / 10) {
                    ((BaseSwipeUpComponent) aTListenerS347S0200000_28.l0).hS((View) aTListenerS347S0200000_28.l1, "slide_up", "c5319", "d1940");
                } else {
                    BaseSwipeUpComponent baseSwipeUpComponent4 = (BaseSwipeUpComponent) aTListenerS347S0200000_28.l0;
                    View view3 = baseSwipeUpComponent4.LLJI;
                    if (view3 != null) {
                        view3.clearAnimation();
                    }
                    View view4 = baseSwipeUpComponent4.LLJI;
                    if (view4 != null) {
                        C786410Ut5.Pd(ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
                    }
                }
            }
        } else {
            ((BaseSwipeUpComponent) aTListenerS347S0200000_28.l0).LLJILLL = motionEvent.getRawY();
        }
        GestureDetector gestureDetector = ((BaseSwipeUpComponent) aTListenerS347S0200000_28.l0).LLJILJILJ;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$1(Y.ATListenerS347S0200000_28 r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            java.lang.Object r0 = r7.l0
            X.0zvB r0 = (X.C1914550zvB) r0
            r0.getClass()
            X.C1914550zvB.LJFF(r9, r8)
            float r0 = r9.getX()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1
            r4 = 0
            if (r0 < 0) goto L8f
            float r1 = r9.getX()
            int r0 = r8.getWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8f
            float r0 = r9.getY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L8f
            float r1 = r9.getY()
            int r0 = r8.getHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8f
            r3 = 1
        L38:
            int r1 = r9.getActionMasked()
            r2 = 2
            if (r1 == 0) goto L87
            if (r1 == r5) goto L7f
            if (r1 == r2) goto L77
            r0 = 3
            if (r1 == r0) goto L7f
        L46:
            java.lang.Object r0 = r7.l0
            X.0zvB r0 = (X.C1914550zvB) r0
            r0.getClass()
            X.0zuZ r0 = X.C1914170zuZ.LIZ
            r0.getClass()
            java.util.Map<java.lang.String, java.lang.String> r1 = X.C1914170zuZ.LIZJ
            java.lang.String r0 = "universal_popup_disable_ripple"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto Lb2
            int[] r6 = new int[r2]
            java.lang.Object r0 = r7.l1
            android.view.View r0 = (android.view.View) r0
            r0.getLocationOnScreen(r6)
            java.lang.Object r1 = r7.l0
            X.0zvB r1 = (X.C1914550zvB) r1
            java.lang.Object r0 = r7.l1
            android.view.View r0 = (android.view.View) r0
            r1.getClass()
            goto L91
        L77:
            java.lang.Object r0 = r7.l1
            android.view.View r0 = (android.view.View) r0
            r0.setPressed(r3)
            goto L46
        L7f:
            java.lang.Object r0 = r7.l1
            android.view.View r0 = (android.view.View) r0
            r0.setPressed(r4)
            goto L46
        L87:
            java.lang.Object r0 = r7.l1
            android.view.View r0 = (android.view.View) r0
            r0.setPressed(r5)
            goto L46
        L8f:
            r3 = 0
            goto L38
        L91:
            android.graphics.drawable.Drawable r3 = r0.getForeground()     // Catch: java.lang.NoSuchMethodError -> Lab
            if (r3 == 0) goto Lb2
            float r2 = r9.getRawX()
            r0 = r6[r4]
            float r0 = (float) r0
            float r2 = r2 - r0
            float r1 = r9.getRawY()
            r0 = r6[r5]
            float r0 = (float) r0
            float r1 = r1 - r0
            r3.setHotspot(r2, r1)
            return r4
        Lab:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.printStackTrace()
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS347S0200000_28.onTouch$1(Y.ATListenerS347S0200000_28, android.view.View, android.view.MotionEvent):boolean");
    }
}
