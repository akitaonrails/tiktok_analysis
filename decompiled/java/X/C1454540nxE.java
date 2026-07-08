package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS636S0100000_22;
import zoo.b;

/* JADX INFO: renamed from: X.0nxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454540nxE extends AbstractC21664419qU {
    public final InterfaceC1454550nxF LL;
    public final Function2<Boolean, Boolean, Unit> LLILLJJLI;
    public int LLILZ;
    public boolean LLILZLL;
    public Pair<Float, Float> LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLILLL = true;
    public final HashMap<Integer, PointF> LLILZIL = new HashMap<>();

    public final boolean LJJIJL() {
        return this.LLILZ >= this.LL.LJIILIIL().fingerCountForMove && this.LLILLL;
    }

    public final void LJJIL() {
        C567850MOx.LIZ("reset");
        if (this.LLILZLL) {
            this.LL.LJIIJJI();
            this.LLILLJJLI.invoke(Boolean.TRUE, Boolean.FALSE);
        }
        this.LLILZLL = false;
        this.LLILZIL.clear();
        this.LLJI = false;
    }

    public final void LJJIJLIJ() {
        if (C351230Dpp.LIZIZ() && this.LL.LJIIJ() && !this.LLILZLL) {
            this.LL.LJIIIZ();
        }
        this.LLILZLL = true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        if (LJJIJL() && this.LL.LJIILIIL().enableRotate) {
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
        this.LLJ = false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        if (LJJIJL() && this.LL.LJIILIIL().enableRotate) {
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        float degrees = (float) Math.toDegrees(f);
        if (!LJJIJL() || !this.LL.LJIILIIL().enableRotate) {
            return false;
        }
        if (Math.abs(degrees) < 10.0f && degrees != 0.0f) {
            LJJIJLIJ();
            if (!this.LL.LJIIJ()) {
                this.LL.LIZ(-degrees);
            }
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        if (LJJIJL() && this.LL.LJIILIIL().enableScale) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLZLZ(zoo.b r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L56
            android.graphics.PointF r4 = r6.LJIIJJI
            int r1 = r5.LLILZ
            X.0nxF r0 = r5.LL
            com.ss.android.ugc.aweme.canvas.CanvasGestureConfig r0 = r0.LJIILIIL()
            int r0 = r0.fingerCountForMove
            if (r1 < r0) goto L56
            boolean r0 = r5.LLILLL
            if (r0 == 0) goto L56
            X.0nxF r0 = r5.LL
            com.ss.android.ugc.aweme.canvas.CanvasGestureConfig r0 = r0.LJIILIIL()
            boolean r0 = r0.enableMove
            if (r0 == 0) goto L56
            boolean r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L56
            boolean r0 = r5.LLILZLL
            r3 = 1
            if (r0 != 0) goto L3d
            float r0 = r4.x
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3d
            float r0 = r4.y
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L53
        L3d:
            r5.LJJIJLIJ()
            X.0nxF r0 = r5.LL
            boolean r0 = r0.LJIIJ()
            r0 = r0 ^ 1
            if (r0 == 0) goto L53
            X.0nxF r2 = r5.LL
            float r1 = r4.x
            float r0 = r4.y
            r2.LJFF(r1, r0)
        L53:
            r5.LLJ = r3
            return r3
        L56:
            r3 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454540nxE.LLLZLZ(zoo.b):boolean");
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (scaleGestureDetector == null) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!LJJIJL() || !this.LL.LJIILIIL().enableScale) {
            return false;
        }
        if (scaleFactor != 1.0f) {
            LJJIJLIJ();
            if (!this.LL.LJIIJ()) {
                this.LL.onScale(scaleFactor);
            }
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (LJJIJL() && this.LL.LJIILIIL().enableScale) {
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        float fFloatValue;
        float fFloatValue2;
        if (this.LL.LJIILIIL().enableTap) {
            if (motionEvent != null) {
                fFloatValue = motionEvent.getX();
                fFloatValue2 = motionEvent.getY();
            } else {
                fFloatValue = this.LLIZ.getFirst().floatValue();
                fFloatValue2 = this.LLIZ.getSecond().floatValue();
            }
            boolean zLJIIIIZZ = this.LL.LJIIIIZZ(fFloatValue, fFloatValue2);
            C567850MOx.LIZ("onSingleTapConfirmed");
            if (zLJIIIIZZ) {
                this.LL.LJII();
                this.LL.LJIIL();
            }
            return zLJIIIIZZ;
        }
        return false;
    }

    @Override // X.AbstractC21664419qU, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.LLILZ--;
                                return;
                            }
                            return;
                        } else {
                            this.LLILZ++;
                            this.LLILZIL.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
                            return;
                        }
                    }
                } else {
                    if (!this.LLILZLL) {
                        return;
                    }
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i = 0; i < pointerCount; i++) {
                        PointF pointF = this.LLILZIL.get(Integer.valueOf(motionEvent.getPointerId(i)));
                        if (pointF != null) {
                            float f = pointF.x;
                            float f2 = pointF.y;
                            double d = 2;
                            if (Math.sqrt(Math.pow(f - motionEvent.getX(i), d) + Math.pow(f2 - motionEvent.getY(i), d)) > 5.0d) {
                                if (this.LLJI) {
                                    return;
                                }
                                this.LLILLJJLI.invoke(Boolean.FALSE, Boolean.TRUE);
                                this.LLJI = true;
                                C567850MOx.LIZ("hide panel");
                                return;
                            }
                        }
                    }
                    return;
                }
            }
            this.LLILZ = 0;
            LJJIL();
            return;
        }
        this.LLILZ = 1;
        this.LLILZIL.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
    }

    public C1454540nxE(C1453390nvN c1453390nvN, AwS636S0100000_22 awS636S0100000_22) {
        this.LL = c1453390nvN;
        this.LLILLJJLI = awS636S0100000_22;
        Float fValueOf = Float.valueOf(0.0f);
        this.LLIZ = new Pair<>(fValueOf, fValueOf);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        boolean z;
        this.LLIZ = new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        if (!this.LL.LJIILIIL().skipTouchInCanvasCheck && !this.LL.LJIIIIZZ(this.LLIZ.getFirst().floatValue(), this.LLIZ.getSecond().floatValue())) {
            z = false;
        } else {
            z = true;
        }
        this.LLIZLLLIL = z;
        if (!LJJIJL() || !this.LL.LJIILIIL().enableMove || !this.LL.LJI() || !this.LLIZLLLIL) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LLJ) {
            return true;
        }
        return this instanceof C1417630mzh;
    }
}
