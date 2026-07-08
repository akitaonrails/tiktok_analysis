package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0IiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474070IiT extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public InterfaceC474080IiU LLILZLL;

    public final InterfaceC474080IiU getOnViewDragListener() {
        return this.LLILZLL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    float rawX = motionEvent.getRawX() - this.LL;
                    float rawY = motionEvent.getRawY() - this.LLILLJJLI;
                    if (Math.abs(rawX) > 5.0f || Math.abs(rawY) > 5.0f) {
                        InterfaceC474080IiU interfaceC474080IiU = this.LLILZLL;
                        if (interfaceC474080IiU != null) {
                            interfaceC474080IiU.Ci();
                        }
                        this.LLILZIL = true;
                    }
                }
            } else {
                this.LL = motionEvent.getRawX();
                this.LLILLJJLI = motionEvent.getRawY();
                this.LLILLL = getTranslationX();
                this.LLILZ = getTranslationY();
                InterfaceC474080IiU interfaceC474080IiU2 = this.LLILZLL;
                if (interfaceC474080IiU2 != null) {
                    interfaceC474080IiU2.Bi();
                }
                this.LLILZIL = false;
            }
        }
        if (this.LLILZIL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            if (r4 == 0) goto Lf
            int r1 = r4.getAction()
            r2 = 1
            if (r1 == r2) goto L35
            r0 = 2
            if (r1 == r0) goto L14
            r0 = 3
            if (r1 == r0) goto L35
        Lf:
            boolean r0 = super.onTouchEvent(r4)
            return r0
        L14:
            float r1 = r3.LLILLL
            float r0 = r4.getRawX()
            float r1 = r1 + r0
            float r0 = r3.LL
            float r1 = r1 - r0
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r3)
            r3.setTranslationX(r1)
            float r1 = r3.LLILZ
            float r0 = r4.getRawY()
            float r1 = r1 + r0
            float r0 = r3.LLILLJJLI
            float r1 = r1 - r0
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r3)
            r3.setTranslationY(r1)
            return r2
        L35:
            r0 = 0
            r3.LL = r0
            r3.LLILLJJLI = r0
            r3.LLILLL = r0
            r3.LLILZ = r0
            X.0IiU r0 = r3.LLILZLL
            if (r0 == 0) goto L45
            r0.Bi()
        L45:
            r0 = 0
            r3.LLILZIL = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474070IiT.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnViewDragListener(InterfaceC474080IiU interfaceC474080IiU) {
        this.LLILZLL = interfaceC474080IiU;
    }

    public C474070IiT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
