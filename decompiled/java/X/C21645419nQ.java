package X;

import android.content.Context;
import android.view.MotionEvent;
import zoo.d;

/* JADX INFO: renamed from: X.19nQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21645419nQ extends d {
    public final InterfaceC21645519nR LJIIL;
    public boolean LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public boolean LJIILLIIL;

    public final float LJI() {
        return (float) (Math.atan2(this.LJIIIIZZ, this.LJII) - Math.atan2(this.LJIIJ, this.LJIIIZ));
    }

    @Override // zoo.a
    public final void LIZLLL() {
        super.LIZLLL();
        this.LJIILIIL = false;
    }

    @Override // zoo.d, zoo.a
    public final void LJ(MotionEvent motionEvent) {
        int actionIndex;
        super.LJ(motionEvent);
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getAction() & 255) == 6) {
            actionIndex = motionEvent.getActionIndex();
        } else {
            actionIndex = -1;
        }
        float x = 0.0f;
        float y = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            if (actionIndex != i) {
                x += motionEvent.getX(i);
                y += motionEvent.getY(i);
            }
        }
        float f = pointerCount;
        this.LJIILJJIL = x / f;
        this.LJIILL = y / f;
    }

    public C21645419nQ(Context context, InterfaceC21645519nR interfaceC21645519nR) {
        super(context);
        this.LJIIL = interfaceC21645519nR;
        this.LJIILLIIL = true;
    }

    @Override // zoo.a
    public final void LIZ(MotionEvent motionEvent, int i) {
        if (i != 2) {
            if (i != 3) {
                if (i == 6) {
                    LJ(motionEvent);
                    if (!this.LJIILIIL) {
                        this.LJIIL.LIZ(this);
                    }
                    LIZLLL();
                    return;
                }
                return;
            }
            if (!this.LJIILIIL) {
                this.LJIIL.LIZ(this);
            }
            LIZLLL();
            return;
        }
        LJ(motionEvent);
        if (this.LIZLLL / this.LJ <= 0.67f || !this.LJIIL.LIZIZ(this)) {
            return;
        }
        this.LIZIZ.recycle();
        this.LIZIZ = MotionEvent.obtain(motionEvent);
    }

    @Override // zoo.a
    public final void LIZIZ(MotionEvent motionEvent, int i) {
        if (i != 2) {
            if (i == 5) {
                LIZLLL();
                this.LIZIZ = MotionEvent.obtain(motionEvent);
                LJ(motionEvent);
                if (this.LJIILLIIL) {
                    this.LJIILIIL = LJFF(motionEvent);
                }
                if (!this.LJIILIIL) {
                    this.LJIIL.LIZJ(this);
                    this.LJFF = true;
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LJIILIIL) {
            return;
        }
        if (this.LJIILLIIL) {
            this.LJIILIIL = LJFF(motionEvent);
        }
        if (this.LJIILIIL) {
            return;
        }
        this.LJIIL.LIZJ(this);
        this.LJFF = true;
    }
}
