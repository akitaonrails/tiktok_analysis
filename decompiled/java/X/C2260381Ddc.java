package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.1Ddc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260381Ddc {
    public static final float LJIILJJIL = C497740JfY.LIZIZ(2.0f);
    public final Context LIZ;
    public final InterfaceC2260401Dde LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public int LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public final C19290410dS LJIILIIL;

    public C2260381Ddc(Context context, InterfaceC2260401Dde interfaceC2260401Dde) {
        this.LIZ = context;
        this.LIZIZ = interfaceC2260401Dde;
        C19290410dS c19290410dS = new C19290410dS(context, new C2325411G0t(this, 2), null);
        c19290410dS.LIZIZ(new GestureDetector.OnDoubleTapListener() { // from class: X.1Ddd
            public final float LL;

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                return false;
            }

            {
                this.LL = ViewConfiguration.get(this.LLILLJJLI.LIZ).getScaledDoubleTapSlop() * ViewConfiguration.get(this.LLILLJJLI.LIZ).getScaledDoubleTapSlop();
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                if (motionEvent == null || motionEvent.getAction() != 1) {
                    return false;
                }
                float x = motionEvent.getX() - this.LLILLJJLI.LJIIJJI;
                float y = motionEvent.getY();
                C2260381Ddc c2260381Ddc = this.LLILLJJLI;
                float f = y - c2260381Ddc.LJIIL;
                if ((x * x) + (f * f) >= this.LL) {
                    return false;
                }
                return c2260381Ddc.LIZIZ.LIZIZ(motionEvent);
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (motionEvent != null) {
                    return this.LLILLJJLI.LIZIZ.onSingleTapConfirmed(motionEvent);
                }
                return false;
            }
        });
        this.LJIILIIL = c19290410dS;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledTouchSlop();
    }
}
