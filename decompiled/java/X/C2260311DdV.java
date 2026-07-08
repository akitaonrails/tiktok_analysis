package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260311DdV extends FrameLayout {
    public InterfaceC2260341DdY LL;
    public InterfaceC2260351DdZ LLILLJJLI;
    public C2260321DdW LLILLL;
    public boolean LLILZ;

    public final InterfaceC2260341DdY getCurrVideoGestureListener() {
        return this.LL;
    }

    public final boolean getEnableTouchEvent() {
        return this.LLILZ;
    }

    public C2260311DdV(Context context) {
        super(context, null, 0);
        this.LLILZ = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC2260351DdZ interfaceC2260351DdZ = this.LLILLJJLI;
        if (interfaceC2260351DdZ != null) {
            interfaceC2260351DdZ.LIZ(canvas);
        }
        try {
            super.dispatchDraw(canvas);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2260321DdW c2260321DdW;
        boolean z;
        int actionIndex;
        int i;
        float degrees;
        float f;
        if (!this.LLILZ) {
            return true;
        }
        InterfaceC2260341DdY interfaceC2260341DdY = this.LL;
        if ((interfaceC2260341DdY == null || !interfaceC2260341DdY.LJJJJ(motionEvent)) && (c2260321DdW = this.LLILLL) != null) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            c2260321DdW.LIZIZ.LIZLLL();
                        }
                    } else {
                        c2260321DdW.LIZIZ.LJ();
                    }
                } else {
                    c2260321DdW.LIZIZ.LIZJ();
                }
                if (motionEvent.getPointerCount() <= 1) {
                }
                c2260321DdW.LJIIJ = pointerCount;
                if (actionMasked == 1 && actionMasked != 3) {
                    if (actionMasked == 0) {
                        if (0 != 0) {
                            return true;
                        }
                    } else if (0 != 0) {
                        return true;
                    }
                    if (actionMasked != 0 && actionMasked != 6 && actionMasked != 5) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (actionMasked == 6) {
                        actionIndex = motionEvent.getActionIndex();
                        i = pointerCount - 1;
                    } else {
                        actionIndex = -1;
                        i = pointerCount;
                    }
                    float x = 0.0f;
                    float y = 0.0f;
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        if (actionIndex != i2) {
                            x += motionEvent.getX(i2);
                            y += motionEvent.getY(i2);
                        }
                    }
                    float f2 = i;
                    float f3 = x / f2;
                    float f4 = y / f2;
                    float fAbs = 0.0f;
                    float fAbs2 = 0.0f;
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        if (actionIndex != i3) {
                            fAbs += Math.abs(motionEvent.getX(i3) - f3);
                            fAbs2 += Math.abs(motionEvent.getY(i3) - f4);
                        }
                    }
                    float f5 = 2;
                    float fHypot = (float) Math.hypot((fAbs / f2) * f5, (fAbs2 / f2) * f5);
                    int i4 = 0;
                    loop2: while (true) {
                        if (i4 < pointerCount) {
                            if (actionIndex != i4) {
                                for (int i5 = i4 + 1; i5 < pointerCount; i5++) {
                                    if (actionIndex != i5) {
                                        double d = 360;
                                        degrees = ((float) ((Math.toDegrees(Math.atan2(motionEvent.getY(i4) - motionEvent.getY(i5), motionEvent.getX(i4) - motionEvent.getX(i5))) + d) % d)) + 0.0f;
                                        break loop2;
                                    }
                                }
                            }
                            i4++;
                        } else {
                            degrees = 0.0f;
                            break;
                        }
                    }
                    if (z) {
                        c2260321DdW.LJI = fHypot;
                        c2260321DdW.LJII = fHypot;
                        c2260321DdW.LJIIIIZZ = degrees;
                        c2260321DdW.LJIIIZ = degrees;
                        c2260321DdW.LIZJ = f3;
                        c2260321DdW.LIZLLL = f4;
                        c2260321DdW.LJ = f3;
                        c2260321DdW.LJFF = f4;
                    }
                    if (actionMasked == 0) {
                        c2260321DdW.LIZJ = f3;
                        c2260321DdW.LJ = f3;
                        c2260321DdW.LIZLLL = f4;
                        c2260321DdW.LJFF = f4;
                        return true;
                    }
                    if (actionMasked != 2) {
                        return true;
                    }
                    c2260321DdW.LIZJ = f3;
                    c2260321DdW.LIZLLL = f4;
                    c2260321DdW.LJI = fHypot;
                    c2260321DdW.LJIIIIZZ = degrees;
                    float f6 = c2260321DdW.LJII;
                    if (f6 > 0.0f && fHypot / f6 != 1.0f) {
                        InterfaceC2260341DdY interfaceC2260341DdY2 = c2260321DdW.LIZIZ;
                        if (f6 > 0.0f) {
                            f = fHypot / f6;
                        } else {
                            f = 1.0f;
                        }
                        interfaceC2260341DdY2.onScale(f);
                        c2260321DdW.LJII = c2260321DdW.LJI;
                    }
                    if (Math.abs((int) (c2260321DdW.LJIIIIZZ - c2260321DdW.LJIIIZ)) >= 350.0f) {
                        c2260321DdW.LJIIIZ = c2260321DdW.LJIIIIZZ;
                    } else if (Math.abs((int) (c2260321DdW.LJIIIIZZ - c2260321DdW.LJIIIZ)) >= 1.0f) {
                        c2260321DdW.LIZIZ.LJJLIIIJLJLI((int) (c2260321DdW.LJIIIIZZ - c2260321DdW.LJIIIZ));
                        c2260321DdW.LJIIIZ = c2260321DdW.LJIIIIZZ;
                    }
                    if (c2260321DdW.LJIIJ < 1) {
                        return true;
                    }
                    float fAbs3 = Math.abs(c2260321DdW.LIZJ - c2260321DdW.LJ);
                    float f7 = C2260321DdW.LJIILJJIL;
                    if (fAbs3 < f7 && Math.abs(c2260321DdW.LIZLLL - c2260321DdW.LJFF) < f7) {
                        return true;
                    }
                    c2260321DdW.LIZIZ.LJFF(pointerCount, c2260321DdW.LIZJ - c2260321DdW.LJ, c2260321DdW.LIZLLL - c2260321DdW.LJFF);
                    c2260321DdW.LJ = c2260321DdW.LIZJ;
                    c2260321DdW.LJFF = c2260321DdW.LIZLLL;
                    return true;
                }
            }
            c2260321DdW.LIZIZ.LJI();
            c2260321DdW.LJIILIIL.LIZ(motionEvent);
            c2260321DdW.LJIIJ = pointerCount;
            return actionMasked == 1 ? true : true;
        }
        return true;
    }

    public final void setEnableTouchEvent(boolean z) {
        this.LLILZ = z;
    }

    public final void setOnGestureListener(InterfaceC2260341DdY interfaceC2260341DdY) {
        this.LL = interfaceC2260341DdY;
        this.LLILLL = new C2260321DdW(getContext(), interfaceC2260341DdY);
    }

    public final void setViewStateChange(InterfaceC2260351DdZ interfaceC2260351DdZ) {
        this.LLILLJJLI = interfaceC2260351DdZ;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC2260351DdZ interfaceC2260351DdZ = this.LLILLJJLI;
        if (interfaceC2260351DdZ != null) {
            interfaceC2260351DdZ.LIZIZ();
        }
    }
}
