package X;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import bck.u;
import com.ss.android.vesdk.VETouchPointer;

/* JADX INFO: renamed from: X.0uHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697880uHi extends AbstractC21664519qV {
    public final InterfaceC2177841ALe LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public float LLIZLLLIL;
    public boolean LLJ;
    public Pair<Float, Float> LLJILJIL;
    public float LLILZLL = 1.0f;
    public float LLIZ = 1.0f;
    public final PointF LLJI = new PointF(-2.0f, -2.0f);
    public final PointF LLJIJIL = new PointF();

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean E2(C21645419nQ c21645419nQ) {
        return true;
    }

    @Override // X.AbstractC21664519qV
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean LIZIZ(MotionEvent motionEvent) {
        LJIIZILJ(motionEvent.getX(), motionEvent.getY());
        PointF pointF = this.LLJIJIL;
        PointF pointFLJIILLIIL = LJIILLIIL(pointF.x, pointF.y);
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        if (interfaceC2177841ALe != null) {
            float f = pointFLJIILLIIL.x;
            float f2 = pointFLJIILLIIL.y;
            InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
            if (interfaceC1645720sva != null) {
                interfaceC1645720sva.co(f, f2);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean LJIIIZ(float f) {
        float f2 = -f;
        InterfaceC1645720sva interfaceC1645720sva = ((u) this.LL).LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.Ao(f2, 6.0f);
            return true;
        }
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean LJJLIIIJLJLI(float f) {
        float f2 = -f;
        InterfaceC1645720sva interfaceC1645720sva = ((u) this.LL).LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.Ao(f2, 6.0f);
            return true;
        }
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean LLLLJI(float f) {
        this.LLILZLL = 1.0f;
        this.LLIZ = 1.0f;
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onDown(MotionEvent motionEvent) {
        LJIIZILJ(motionEvent.getX(), motionEvent.getY());
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLJIJIL;
        ((u) interfaceC2177841ALe).LJIIIIZZ(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 0, 0);
        this.LLJ = true;
        return false;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.LLIZ * scaleGestureDetector.getScaleFactor();
        this.LLIZ = scaleFactor;
        float f = scaleFactor / this.LLILZLL;
        InterfaceC1645720sva interfaceC1645720sva = ((u) this.LL).LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.mo59do(f, 3.0f);
        }
        this.LLILZLL = this.LLIZ;
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        LJIIZILJ(motionEvent.getX(), motionEvent.getY());
        PointF pointF = this.LLJIJIL;
        PointF pointFLJIILLIIL = LJIILLIIL(pointF.x, pointF.y);
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        float f = pointFLJIILLIIL.x;
        float f2 = pointFLJIILLIIL.y;
        InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.Do(f, f2);
            return true;
        }
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onUp(MotionEvent motionEvent) {
        LJIIZILJ(motionEvent.getX(), motionEvent.getY());
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLJIJIL;
        ((u) interfaceC2177841ALe).LJIIIIZZ(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 2, 0);
        this.LLJ = false;
        return false;
    }

    public C1697880uHi(InterfaceC2177841ALe interfaceC2177841ALe, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.LL = interfaceC2177841ALe;
        this.LLILLJJLI = marginLayoutParams.width;
        this.LLILLL = marginLayoutParams.height;
        this.LLILZ = marginLayoutParams.getMarginStart();
        this.LLILZIL = marginLayoutParams.topMargin;
    }

    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
    public final void LIZJ(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJIIZILJ(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        PointF pointF = this.LLJIJIL;
        PointF pointFLJIILLIIL = LJIILLIIL(pointF.x, pointF.y);
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        float f = pointFLJIILLIIL.x;
        float f2 = pointFLJIILLIIL.y;
        InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.Do(f, f2);
        }
    }

    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
    public final void LJI(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJIIZILJ(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLJIJIL;
        ((u) interfaceC2177841ALe).LJIIIIZZ(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 0, 0);
        this.LLJ = true;
        this.LLJILJIL = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
    }

    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
    public final void LJIIIIZZ(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJIIZILJ(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLJIJIL;
        ((u) interfaceC2177841ALe).LJIIIIZZ(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 2, 0);
        this.LLJ = false;
    }

    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
    public final void LJIIJ(MotionEvent motionEvent, int[] iArr) {
        Pair<Float, Float> pair;
        LJIILIIL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        if (this.LLJ && (pair = this.LLJILJIL) != null) {
            this.LLJI.x = ((Float) pair.first).floatValue() + iArr[0];
            this.LLJI.y = ((Float) this.LLJILJIL.second).floatValue() + iArr[1];
            this.LLJ = false;
        }
        float x = (motionEvent.getX(1) + iArr[0]) - this.LLJI.x;
        float y = (motionEvent.getY(1) + iArr[1]) - this.LLJI.y;
        LJIIZILJ(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLJIJIL;
        float f = pointF.x;
        int i = this.LLILLJJLI;
        float f2 = pointF.y;
        int i2 = this.LLILLL;
        ((u) interfaceC2177841ALe).LJII(f / i, f2 / i2, x / i, y / i2, 1.0f);
        this.LLJI.x = motionEvent.getX(1) + iArr[0];
        this.LLJI.y = motionEvent.getY(1) + iArr[1];
        Pair<Float, Float> pair2 = this.LLJILJIL;
        if (pair2 != null && ((Float) pair2.first).floatValue() + iArr[0] != this.LLIZLLLIL) {
            this.LLIZLLLIL = ((Float) this.LLJILJIL.first).floatValue() + iArr[0];
        }
    }

    @Override // X.AbstractC21664519qV
    public final void LJIILL(VETouchPointer vETouchPointer, int i) {
        LJIIZILJ(vETouchPointer.getX(), vETouchPointer.getY());
        vETouchPointer.setX(this.LLJIJIL.x / this.LLILLJJLI);
        vETouchPointer.setY(this.LLJIJIL.y / this.LLILLL);
        InterfaceC1645720sva interfaceC1645720sva = ((u) this.LL).LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.Ch(vETouchPointer, i);
        }
    }

    public final PointF LJIILLIIL(float f, float f2) {
        PointF pointF = new PointF();
        pointF.x = f / this.LLILLJJLI;
        pointF.y = f2 / this.LLILLL;
        return pointF;
    }

    public final void LJIIZILJ(float f, float f2) {
        this.LLJIJIL.set(f, f2);
        this.LLJIJIL.offset(-this.LLILZ, -this.LLILZIL);
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LLJ) {
            this.LLJI.x = motionEvent.getX();
            this.LLJI.y = motionEvent.getY();
            this.LLJ = false;
        }
        float x = motionEvent2.getX() - this.LLJI.x;
        float y = motionEvent2.getY() - this.LLJI.y;
        LJIIZILJ(motionEvent2.getX(), motionEvent2.getY());
        InterfaceC2177841ALe interfaceC2177841ALe = this.LL;
        PointF pointF = this.LLJIJIL;
        float f3 = pointF.x;
        float f4 = this.LLILLJJLI;
        float f5 = pointF.y;
        float f6 = this.LLILLL;
        ((u) interfaceC2177841ALe).LJII(f3 / f4, f5 / f6, x / f4, y / f6, 1.0f);
        this.LLJI.x = motionEvent2.getX();
        this.LLJI.y = motionEvent2.getY();
        if (motionEvent != null && motionEvent.getX() != this.LLIZLLLIL) {
            this.LLIZLLLIL = motionEvent.getX();
            return true;
        }
        return true;
    }
}
