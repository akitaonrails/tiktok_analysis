package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SS1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SS1 {
    public final C16GX LIZ;
    public Function1<? super C721520SRy, Boolean> LIZIZ;
    public Function1<? super Integer, Unit> LIZJ;
    public Function1<? super Integer, Unit> LIZLLL;
    public float LJ;
    public boolean LJFF;
    public boolean LJI;
    public final int LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public boolean LJIIZILJ;
    public C0SS2 LJIIL = C0SS2.UNKNOWN;
    public final float LJIILJJIL = 30.0f;
    public final float LJIILL = 60.0f;
    public final boolean LJIILLIIL = true;
    public int LJIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250));
    public int LJIJI = Integer.MIN_VALUE;

    public final boolean LIZ() {
        if (!this.LJIIJJI) {
            return false;
        }
        C0SS2 c0ss2 = this.LJIIL;
        return c0ss2 == C0SS2.LEFT || c0ss2 == C0SS2.RIGHT;
    }

    public final void LIZIZ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        Function1<? super C721520SRy, Boolean> function1 = this.LIZIZ;
        if (function1 == null || !function1.invoke(new C721520SRy(LIZ(), this.LJIIIIZZ)).booleanValue()) {
            return;
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public final void LIZJ(boolean z) {
        this.LJIIJJI = false;
        this.LJIIL = C0SS2.UNKNOWN;
        this.LJIIZILJ = false;
        this.LJFF = false;
        this.LJI = false;
        this.LJIILIIL = false;
        if (!z) {
            this.LJIIIZ = 0.0f;
            this.LJIIJ = 0.0f;
        }
    }

    public final void LIZLLL(MotionEvent motionEvent) {
        C0SS2 c0ss2;
        C0SS2 c0ss22;
        if (!this.LJIIZILJ || this.LJIIJJI) {
            return;
        }
        float x = motionEvent.getX() - this.LJIIIZ;
        float y = motionEvent.getY() - this.LJIIJ;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        int i = this.LJII;
        if (fAbs < i && fAbs2 < i) {
            return;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(fAbs2, fAbs));
        if (degrees <= this.LJIILJJIL) {
            if (x >= 0.0f) {
                c0ss22 = C0SS2.RIGHT;
            } else {
                c0ss22 = C0SS2.LEFT;
            }
            if (c0ss22 == C0SS2.LEFT && !this.LJIILIIL) {
                return;
            }
            this.LJIIL = c0ss22;
            this.LJIIJJI = true;
            return;
        }
        if (degrees >= this.LJIILL) {
            if (y >= 0.0f) {
                c0ss2 = C0SS2.DOWN;
            } else {
                c0ss2 = C0SS2.UP;
            }
            this.LJIIL = c0ss2;
            this.LJIIJJI = true;
        }
    }

    public C0SS1(C0SSD c0ssd, C0SU0 c0su0, AwS590S0100000_11 awS590S0100000_11, AwS590S0100000_11 awS590S0100000_112, AwS590S0100000_11 awS590S0100000_113) {
        this.LIZ = c0ssd;
        this.LIZIZ = awS590S0100000_11;
        this.LIZJ = awS590S0100000_112;
        this.LIZLLL = awS590S0100000_113;
        this.LJII = ViewConfiguration.get(c0su0.getContext()).getScaledTouchSlop();
    }
}
