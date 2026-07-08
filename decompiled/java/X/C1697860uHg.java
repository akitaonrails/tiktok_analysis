package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import bck.u;
import nv7.c0;

/* JADX INFO: renamed from: X.0uHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697860uHg extends AbstractC21664519qV {
    public final InterfaceC2177841ALe LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public final PointF LLILZIL = new PointF(-2.0f, -2.0f);
    public final PointF LLILZLL = new PointF();

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onDown(MotionEvent motionEvent) {
        LJIILLIIL(motionEvent.getX(), motionEvent.getY());
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLILZLL;
        ((u) interfaceC2177841ALe).LJIIIIZZ(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 0, 1);
        this.LLILZ = true;
        return false;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        LJIILLIIL(motionEvent.getX(), motionEvent.getY());
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLILZLL;
        float f = pointF.x / this.LLILLJJLI;
        float f2 = pointF.y / this.LLILLL;
        InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.processTouchEvent(f, f2);
            return true;
        }
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onUp(MotionEvent motionEvent) {
        LJIILLIIL(motionEvent.getX(), motionEvent.getY());
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLILZLL;
        ((u) interfaceC2177841ALe).LJIIIIZZ(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 2, 1);
        this.LLILZ = false;
        return false;
    }

    public C1697860uHg(Context context, InterfaceC2177841ALe interfaceC2177841ALe) {
        this.LLILLJJLI = C14KQ.LJIIIIZZ(context);
        this.LL = interfaceC2177841ALe;
    }

    public final void LJIILLIIL(float f, float f2) {
        c0 c0Var = c0.LIZ;
        this.LLILLL = c0Var.LIZJ();
        int iN2 = c0Var.n2();
        this.LLILZLL.set(f, f2);
        this.LLILZLL.offset(0.0f, -iN2);
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LLILZ) {
            this.LLILZIL.x = motionEvent.getX();
            this.LLILZIL.y = motionEvent.getY();
            this.LLILZ = false;
        }
        float x = motionEvent2.getX() - this.LLILZIL.x;
        float y = motionEvent2.getY() - this.LLILZIL.y;
        LJIILLIIL(motionEvent2.getX(), motionEvent2.getY());
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLILZLL;
        float f3 = pointF.x;
        float f4 = this.LLILLJJLI;
        float f5 = pointF.y;
        float f6 = this.LLILLL;
        ((u) interfaceC2177841ALe).LJII(f3 / f4, f5 / f6, x / f4, y / f6, 1.0f);
        this.LLILZIL.x = motionEvent2.getX();
        this.LLILZIL.y = motionEvent2.getY();
        return true;
    }
}
