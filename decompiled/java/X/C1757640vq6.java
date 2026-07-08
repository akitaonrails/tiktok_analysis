package X;

import Y.ARunnableS95S0200000_26;
import Y.ATListenerS458S0100000_26;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757640vq6 {
    public final View LIZ;
    public int LIZJ;
    public int LIZLLL;
    public float LJ;
    public float LJFF;
    public final GestureDetector LJIIJ;
    public boolean LJIIJJI;
    public InterfaceC1757750vqH LJIIL;
    public boolean LIZIZ = true;
    public float LJI = C679280Qkg.LIZ(16);
    public float LJII = C679280Qkg.LIZ(16);
    public float LJIIIIZZ = C679280Qkg.LIZ(16);
    public float LJIIIZ = C679280Qkg.LIZ(16);

    public C1757640vq6(AbstractC1757620vq4 abstractC1757620vq4) {
        this.LIZ = abstractC1757620vq4;
        this.LJIIJ = new GestureDetector(abstractC1757620vq4.getContext(), new C21648719nx() { // from class: X.0vq9
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                this.LL.LJ = motionEvent.getRawX();
                this.LL.LJFF = motionEvent.getRawY();
                C1757640vq6 c1757640vq6 = this.LL;
                c1757640vq6.LIZJ = (int) c1757640vq6.LIZ.getX();
                C1757640vq6 c1757640vq62 = this.LL;
                c1757640vq62.LIZLLL = (int) c1757640vq62.LIZ.getY();
                this.LL.LJIIJJI = false;
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                InterfaceC1757750vqH interfaceC1757750vqH = this.LL.LJIIL;
                if (interfaceC1757750vqH != null) {
                    interfaceC1757750vqH.LIZIZ();
                }
                return !this.LL.LJIIJJI;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                this.LL.LJIIJJI = true;
                return true;
            }
        });
        abstractC1757620vq4.setOnTouchListener(new ATListenerS458S0100000_26(this, 2));
    }

    public final void LIZ(C1757600vq2 c1757600vq2) {
        View view;
        int measuredHeight;
        Pair pair;
        Object parent = this.LIZ.getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0 && this.LIZ.getMeasuredWidth() > 0 && this.LIZ.getMeasuredHeight() > 0) {
                float measuredWidth = view.getMeasuredWidth();
                Integer num = c1757600vq2.LIZLLL;
                if (num != null && num.intValue() > 0) {
                    measuredHeight = c1757600vq2.LIZLLL.intValue();
                } else {
                    measuredHeight = view.getMeasuredHeight();
                }
                float f = measuredHeight;
                float measuredWidth2 = this.LIZ.getMeasuredWidth();
                float measuredHeight2 = this.LIZ.getMeasuredHeight();
                int i = C1757700vqC.LIZ[c1757600vq2.LIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                pair = new Pair(Float.valueOf(this.LJI), Float.valueOf((f - this.LJIIIZ) - measuredHeight2));
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            pair = new Pair(Float.valueOf((measuredWidth - this.LJIIIIZZ) - measuredWidth2), Float.valueOf((f - this.LJIIIZ) - measuredHeight2));
                        }
                    } else {
                        pair = new Pair(Float.valueOf((measuredWidth - this.LJIIIIZZ) - measuredWidth2), Float.valueOf(this.LJII));
                    }
                } else {
                    pair = new Pair(Float.valueOf(this.LJI), Float.valueOf(this.LJII));
                }
                float fFloatValue = ((Number) pair.getFirst()).floatValue();
                float f2 = fFloatValue + c1757600vq2.LIZIZ;
                float fFloatValue2 = ((Number) pair.getSecond()).floatValue() + c1757600vq2.LIZJ;
                float f3 = this.LJI;
                float f4 = (measuredWidth - this.LJIIIIZZ) - measuredWidth2;
                float f5 = this.LJII;
                float f6 = (f - this.LJIIIZ) - measuredHeight2;
                if (f4 < f3) {
                    f4 = f3;
                }
                float fLIZLLL = C13LZ.LIZLLL(f2, f3, f4);
                if (f6 < f5) {
                    f6 = f5;
                }
                float fLIZLLL2 = C13LZ.LIZLLL(fFloatValue2, f5, f6);
                View view2 = this.LIZ;
                C786410Ut5.Fd(view2, fLIZLLL);
                C786410Ut5.Ld(view2, fLIZLLL2);
                return;
            }
            HandlerHook.viewPost(this.LIZ, new ARunnableS95S0200000_26(this, c1757600vq2, 21));
        }
    }
}
