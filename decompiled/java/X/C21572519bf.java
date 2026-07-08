package X;

import Y.ALAdapterS27S0100000_33;
import Y.ALAdapterS27S0200000_33;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS1S0600001_33;
import Y.AUListenerS235S0200000_33;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21572519bf extends AbstractC21570219bI implements InterfaceC568550MRp {
    public Matrix LLJILJILJ;
    public RectF LLJILLL;
    public Rect LLJJ;
    public boolean LLJJI;
    public final OverScroller LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Animator LLJJIJIL;
    public Animator LLJJJ;
    public AnimatorSet LLJJJIL;
    public ARunnableS1S0600001_33 LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public final C12DM LLJL;
    public InterfaceC21573019bk LLJLIL;
    public final C19727612Gk LLJLILLLLZIIL;
    public final C21573119bl LLJLL;
    public int LLJLLIL;
    public int LLJLLL;

    public final void LJIIL() {
        this.LLJJJJJIL = 0.0f;
        this.LLJJJJLIIL = 0.0f;
        this.LLJJL = 1.0f;
        this.LLJJLIIIJLLLLLLLZ = 1.0f;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    private final RectF getCurrentDisplayRectF() {
        RectF rectF = new RectF(this.LLJILLL);
        this.LLJILJILJ.mapRect(rectF);
        return rectF;
    }

    public final void LJIILIIL() {
        Pair<Float, Float> pairLJFF;
        if (this.LLJJL < 1.0f) {
            Animator animator = this.LLJJJ;
            if (animator == null || !animator.isRunning()) {
                Animator animatorLJIIIZ = LJIIIZ(this.LLJILJILJ, new Matrix());
                animatorLJIIIZ.addListener(new ALAdapterS27S0100000_33(this, 10));
                animatorLJIIIZ.start();
                this.LLJJJ = animatorLJIIIZ;
                return;
            }
            return;
        }
        Animator animator2 = this.LLJJIJIL;
        if (animator2 == null || !animator2.isRunning()) {
            Animator animator3 = this.LLJJJ;
            if ((animator3 == null || !animator3.isRunning()) && this.LLJJIII.isFinished() && (pairLJFF = LJFF(getCurrentDisplayRectF())) != null) {
                Matrix matrix = new Matrix(this.LLJILJILJ);
                matrix.postTranslate(pairLJFF.getFirst().floatValue(), pairLJFF.getSecond().floatValue());
                Animator animatorLJIIIZ2 = LJIIIZ(new Matrix(this.LLJILJILJ), matrix);
                animatorLJIIIZ2.start();
                this.LLJJIJIL = animatorLJIIIZ2;
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLJJIII.computeScrollOffset()) {
            int i = this.LLJLLIL;
            int i2 = this.LLJLLL;
            int currX = this.LLJJIII.getCurrX();
            int currY = this.LLJJIII.getCurrY();
            this.LLJLLIL = currX;
            this.LLJLLL = currY;
            LJIILJJIL(currX - i, currY - i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // X.InterfaceC568550MRp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reset() {
        /*
            r4 = this;
            android.animation.AnimatorSet r0 = r4.LLJJJIL
            r3 = 0
            if (r0 == 0) goto L56
            boolean r0 = r0.isRunning()
            r2 = 1
            if (r0 != r2) goto L56
        Lc:
            android.animation.Animator r0 = r4.LLJJIJIL
            if (r0 == 0) goto L13
            r0.cancel()
        L13:
            r1 = 0
            r4.LLJJIJIL = r1
            android.animation.AnimatorSet r0 = r4.LLJJJIL
            if (r0 == 0) goto L1d
            r0.cancel()
        L1d:
            r4.LLJJJIL = r1
            android.animation.Animator r0 = r4.LLJJJ
            if (r0 == 0) goto L26
            r0.cancel()
        L26:
            r4.LLJJJ = r1
            r4.LLJJJJ = r1
            android.graphics.Matrix r0 = r4.LLJILJILJ
            r0.reset()
            r4.LLIZ = r1
            r4.LLIZLLLIL = r1
            r0 = 0
            r4.LLJ = r0
            r4.LLILZ = r3
            r4.LLILZIL = r3
            r4.LLILZLL = r3
            android.graphics.Path r0 = r4.LLILLJJLI
            r0.rewind()
            r4.invalidate()
            r4.LJIIL()
            if (r2 == 0) goto L52
            X.19bk r1 = r4.LLJLIL
            if (r1 == 0) goto L52
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.LIZJ(r0)
        L52:
            r4.invalidate()
            return
        L56:
            r2 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21572519bf.reset():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Float, java.lang.Float> LJFF(android.graphics.RectF r6) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21572519bf.LJFF(android.graphics.RectF):kotlin.Pair");
    }

    public final Animator LJIIIIZZ(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLJJLIIIJLLLLLLLZ, f);
        if (this.LLJJLIIIJLLLLLLLZ != f) {
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 24));
        }
        return valueAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21572519bf.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC568550MRp
    public void setGestureListener(InterfaceC21573019bk interfaceC21573019bk) {
        this.LLJLIL = interfaceC21573019bk;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.19bg] */
    public C21572519bf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILJILJ = new Matrix();
        this.LLJJIII = new OverScroller(context);
        this.LLJJL = 1.0f;
        this.LLJJLIIIJLLLLLLLZ = 1.0f;
        this.LLJL = new C12DM();
        this.LLJLILLLLZIIL = new C19727612Gk();
        HandlerHook.viewPost(this, new ARunnableS106S0100000_6((Object) this, 216));
        this.LLJLL = new C21573119bl(context, new InterfaceC21573319bn() { // from class: X.19bg
            @Override // X.InterfaceC21573319bn
            public final void LIZ() {
                InterfaceC21573019bk interfaceC21573019bk = this.LIZ.LLJLIL;
                if (interfaceC21573019bk != null) {
                    interfaceC21573019bk.LIZ();
                }
            }

            @Override // X.InterfaceC21573319bn
            public final void LIZIZ() {
                InterfaceC21573019bk interfaceC21573019bk = this.LIZ.LLJLIL;
                if (interfaceC21573019bk != null) {
                    interfaceC21573019bk.LIZIZ();
                }
            }

            @Override // X.InterfaceC21573319bn
            public final void LIZLLL() {
                C21572519bf c21572519bf = this.LIZ;
                if (c21572519bf.LLJJI) {
                    c21572519bf.LLJJI = false;
                    return;
                }
                if (c21572519bf.LLJJL <= 1.0f) {
                    float f = c21572519bf.LLJJJJLIIL;
                    if (f > 0.0f && Math.abs(f) > c21572519bf.getHeight() * 0.2f) {
                        InterfaceC21573019bk interfaceC21573019bk = c21572519bf.LLJLIL;
                        if (interfaceC21573019bk != null) {
                            interfaceC21573019bk.onExit();
                        }
                        c21572519bf.LJIIL();
                        return;
                    }
                    Animator animator = c21572519bf.LLJJJ;
                    if (animator == null || !animator.isRunning()) {
                        Animator animatorLJIIIZ = c21572519bf.LJIIIZ(new Matrix(c21572519bf.LLJILJILJ), new Matrix());
                        animatorLJIIIZ.addListener(new ALAdapterS27S0100000_33(c21572519bf, 22));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(animatorLJIIIZ, c21572519bf.LJIIIIZZ(1.0f));
                        animatorSet.start();
                        c21572519bf.LLJJJ = animatorSet;
                    }
                }
            }

            @Override // X.InterfaceC21573319bn
            public final boolean onScaleBegin() {
                boolean z = false;
                this.LIZ.getParent().requestDisallowInterceptTouchEvent(false);
                C21572519bf c21572519bf = this.LIZ;
                if (c21572519bf.LLJJL >= 1.0f) {
                    z = true;
                    InterfaceC21573019bk interfaceC21573019bk = c21572519bf.LLJLIL;
                    if (interfaceC21573019bk != null) {
                        interfaceC21573019bk.onScaleBegin();
                    }
                }
                return z;
            }

            @Override // X.InterfaceC21573319bn
            public final void onScaleEnd() {
                C21572519bf c21572519bf = this.LIZ;
                if (c21572519bf.LLJJJJLIIL > 0.0f) {
                    return;
                }
                c21572519bf.LLJJI = true;
                InterfaceC21573019bk interfaceC21573019bk = c21572519bf.LLJLIL;
                if (interfaceC21573019bk != null) {
                    interfaceC21573019bk.LLLLJI(c21572519bf.LLJJL);
                }
                this.LIZ.LJIILIIL();
            }

            @Override // X.InterfaceC21573319bn
            public final boolean LJFF(C21572719bh c21572719bh) {
                float fMin;
                if (this.LIZ.LLJJJJLIIL > 0.0f) {
                    return false;
                }
                if (c21572719bh.LJIIL == -1.0f) {
                    if (c21572719bh.LJIIJ == -1.0f) {
                        float f = c21572719bh.LJIIIIZZ;
                        float f2 = c21572719bh.LJIIIZ;
                        c21572719bh.LJIIJ = (float) Math.sqrt((f * f) + (f2 * f2));
                    }
                    float f3 = c21572719bh.LJIIJ;
                    if (c21572719bh.LJIIJJI == -1.0f) {
                        float f4 = c21572719bh.LJI;
                        float f5 = c21572719bh.LJII;
                        c21572719bh.LJIIJJI = (float) Math.sqrt((f4 * f4) + (f5 * f5));
                    }
                    c21572719bh.LJIIL = f3 / c21572719bh.LJIIJJI;
                }
                float f6 = c21572719bh.LJIIL;
                float f7 = c21572719bh.LJ;
                float f8 = c21572719bh.LJFF;
                if (Float.isNaN(f6) || Float.isInfinite(f6)) {
                    return false;
                }
                C21572519bf c21572519bf = this.LIZ;
                c21572519bf.getClass();
                if (f6 != 1.0f) {
                    float fLIZ = C21571519bV.LIZ(c21572519bf.LLJILJILJ);
                    if (f6 < 1.0f) {
                        fMin = Math.max(0.7f / fLIZ, f6);
                    } else {
                        fMin = Math.min(10.0f / fLIZ, f6);
                    }
                    Pair<Float, Float> pairLJII = c21572519bf.LJII(f7, f8);
                    c21572519bf.LLJILJILJ.postScale(fMin, fMin, pairLJII.getFirst().floatValue(), pairLJII.getSecond().floatValue());
                    c21572519bf.LLJJL = C21571519bV.LIZ(c21572519bf.LLJILJILJ);
                    c21572519bf.invalidate();
                }
                return true;
            }

            @Override // X.InterfaceC21573319bn
            public final void onDoubleTap(MotionEvent motionEvent) {
                Matrix matrix;
                Animator animator;
                C21572519bf c21572519bf = this.LIZ;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                AnimatorSet animatorSet = c21572519bf.LLJJJIL;
                if (animatorSet != null && animatorSet.isRunning()) {
                    return;
                }
                Animator animator2 = c21572519bf.LLJJIJIL;
                if (animator2 != null && animator2.isRunning()) {
                    return;
                }
                Animator animator3 = c21572519bf.LLJJJ;
                if (animator3 != null && animator3.isRunning() && (animator = c21572519bf.LLJJJ) != null) {
                    animator.cancel();
                }
                float f = 3.0f;
                if (C21572819bi.LIZJ(c21572519bf.LLJJL, 3.0f)) {
                    matrix = new Matrix();
                } else {
                    float f2 = c21572519bf.LLJJL;
                    if (f2 * 3.0f > 3.0f) {
                        f = 3.0f / f2;
                    }
                    matrix = new Matrix(c21572519bf.LLJILJILJ);
                    Pair<Float, Float> pairLJII = c21572519bf.LJII(x, y);
                    matrix.postScale(f, f, pairLJII.getFirst().floatValue(), pairLJII.getSecond().floatValue());
                    RectF rectF = new RectF(c21572519bf.LLJILLL);
                    matrix.mapRect(rectF);
                    Pair<Float, Float> pairLJFF = c21572519bf.LJFF(rectF);
                    if (pairLJFF != null) {
                        matrix.postTranslate(pairLJFF.getFirst().floatValue(), pairLJFF.getSecond().floatValue());
                    }
                }
                Animator animatorLJIIIZ = c21572519bf.LJIIIZ(new Matrix(c21572519bf.LLJILJILJ), matrix);
                animatorLJIIIZ.start();
                c21572519bf.LLJJJ = animatorLJIIIZ;
            }

            @Override // X.InterfaceC21573319bn
            public final boolean onDown(MotionEvent motionEvent) {
                ViewParent parent;
                if (motionEvent.getPointerCount() > 2) {
                    this.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
                }
                AnimatorSet animatorSet = this.LIZ.LLJJJIL;
                if (animatorSet != null && animatorSet.isRunning()) {
                    return false;
                }
                C21572519bf c21572519bf = this.LIZ;
                if (c21572519bf.LLJJL > 1.0f && (parent = c21572519bf.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.LIZ.LLJJIII.forceFinished(true);
                return true;
            }

            @Override // X.InterfaceC21573319bn
            public final void LIZJ(float f, float f2) {
                this.LIZ.LJIIJ(f, f2);
            }

            @Override // X.InterfaceC21573319bn
            public final boolean LJ(MotionEvent motionEvent, float f, float f2) {
                boolean z;
                if (this.LIZ.LLJJI || motionEvent.getPointerCount() >= 3) {
                    return false;
                }
                C21572519bf c21572519bf = this.LIZ;
                if (motionEvent.getPointerCount() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                c21572519bf.LLJJIJI = z;
                C21572519bf c21572519bf2 = this.LIZ;
                if (c21572519bf2.LLJJIJI) {
                    c21572519bf2.LJIILJJIL(-f, -f2);
                } else {
                    float f3 = c21572519bf2.LLJJL;
                    if (f3 > 1.0f) {
                        c21572519bf2.LJIIJJI(-f, -f2);
                        return true;
                    }
                    if (f3 == 1.0f) {
                        float f4 = -f;
                        float f5 = -f2;
                        float f6 = c21572519bf2.LLJJJJJIL + f4;
                        c21572519bf2.LLJJJJJIL = f6;
                        float f7 = c21572519bf2.LLJJJJLIIL + f5;
                        c21572519bf2.LLJJJJLIIL = f7;
                        if (!c21572519bf2.LLJJIJIIJIL && f7 > Math.abs(f6)) {
                            c21572519bf2.LLJJIJIIJIL = true;
                            c21572519bf2.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        if (c21572519bf2.LLJJIJIIJIL) {
                            RectF rectF = new RectF(0.0f, 0.0f, c21572519bf2.getWidth(), c21572519bf2.getHeight());
                            float fMin = 1.0f - Math.min(1.0f, Math.abs(c21572519bf2.LLJJJJLIIL) / (rectF.height() * 1.0f));
                            c21572519bf2.LLJJLIIIJLLLLLLLZ = fMin;
                            InterfaceC21573019bk interfaceC21573019bk = c21572519bf2.LLJLIL;
                            if (interfaceC21573019bk != null) {
                                interfaceC21573019bk.LIZJ(fMin);
                            }
                            RectF rectF2 = new RectF(0.0f, 0.0f, c21572519bf2.getWidth(), c21572519bf2.getHeight());
                            float fMin2 = ((Math.min(1.0f, Math.abs(c21572519bf2.LLJJJJLIIL) / (rectF2.height() * 1.0f)) * (-0.5f)) + 1.0f) / C21571519bV.LIZ(c21572519bf2.LLJILJILJ);
                            Matrix matrix = c21572519bf2.LLJILJILJ;
                            matrix.postTranslate(f4, f5);
                            matrix.postScale(fMin2, fMin2, motionEvent.getX(), motionEvent.getY());
                            c21572519bf2.invalidate();
                            return true;
                        }
                    }
                }
                return true;
            }
        });
    }

    public final void LJI(float f, float f2) {
        float f3;
        Rect rect = this.LLJJ;
        if (rect != null) {
            float fWidth = rect.width();
            Rect rect2 = this.LLJJ;
            if (rect2 != null) {
                float fHeight = rect2.height();
                float f4 = fWidth / fHeight;
                float f5 = f / f2;
                float f6 = 0.0f;
                if (f4 > f5) {
                    float f7 = (fHeight / fWidth) * f;
                    float f8 = (f2 - f7) / 2;
                    f3 = f8;
                    f2 = f8 + f7;
                } else if (f4 < f5) {
                    float f9 = f4 * f2;
                    float f10 = (f - f9) / 2;
                    f6 = f10;
                    f = f10 + f9;
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                }
                this.LLJILLL = new RectF(f6, f3, f, f2);
            }
        }
    }

    public final Pair<Float, Float> LJII(float f, float f2) {
        RectF currentDisplayRectF = getCurrentDisplayRectF();
        if (C21572819bi.LIZLLL(f, currentDisplayRectF.left)) {
            f = currentDisplayRectF.left;
        } else if (C21572819bi.LIZIZ(f, currentDisplayRectF.right)) {
            f = currentDisplayRectF.right;
        }
        if (C21572819bi.LIZLLL(f2, currentDisplayRectF.top)) {
            f2 = currentDisplayRectF.top;
        } else if (C21572819bi.LIZIZ(f2, currentDisplayRectF.bottom)) {
            f2 = currentDisplayRectF.bottom;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }

    public final Animator LJIIIZ(Matrix matrix, Matrix matrix2) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.LLJLILLLLZIIL, matrix, matrix2);
        valueAnimatorOfObject.addUpdateListener(new AUListenerS235S0200000_33(this, valueAnimatorOfObject, 1));
        return valueAnimatorOfObject;
    }

    public final void LJIIJ(float f, float f2) {
        boolean z;
        Animator animator = this.LLJJIJIL;
        boolean z2 = true;
        if (animator != null && animator.isRunning()) {
            return;
        }
        Animator animator2 = this.LLJJJ;
        if (animator2 != null && animator2.isRunning()) {
            return;
        }
        AnimatorSet animatorSet = this.LLJJJIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        RectF currentDisplayRectF = getCurrentDisplayRectF();
        if (currentDisplayRectF.width() < getWidth() && currentDisplayRectF.height() < getHeight()) {
            return;
        }
        float f3 = -Math.max(currentDisplayRectF.right - getWidth(), 0.0f);
        float f4 = 0;
        float fMax = Math.max(f4 - currentDisplayRectF.left, 0.0f);
        float f5 = -Math.max(currentDisplayRectF.bottom - getHeight(), 0.0f);
        float fMax2 = Math.max(f4 - currentDisplayRectF.top, 0.0f);
        if (C21572819bi.LIZ(f3, 0.0f) && C21572819bi.LIZ(fMax, 0.0f) && C21572819bi.LIZ(f5, 0.0f) && C21572819bi.LIZ(fMax2, 0.0f)) {
            return;
        }
        if ((f > 0.0f && fMax > 0.0f) || (f < 0.0f && f3 < 0.0f)) {
            z = true;
        } else {
            z = false;
        }
        if ((f2 <= 0.0f || fMax2 <= 0.0f) && (f2 >= 0.0f || f5 >= 0.0f)) {
            z2 = false;
        }
        if (!z && !z2) {
            return;
        }
        this.LLJLLIL = 0;
        this.LLJLLL = 0;
        this.LLJJIII.fling(0, 0, (int) f, (int) f2, (int) f3, (int) fMax, (int) f5, (int) fMax2);
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(float r8, float r9) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21572519bf.LJIIJJI(float, float):void");
    }

    public final void LJIILJJIL(float f, float f2) {
        if (C21572819bi.LIZ(f, 0.0f) && C21572819bi.LIZ(f2, 0.0f)) {
            return;
        }
        this.LLJILJILJ.postTranslate(f, f2);
        invalidate();
    }

    @Override // X.InterfaceC568550MRp
    public final void setVideoSize(int i, int i2) {
        ARunnableS1S0600001_33 aRunnableS1S0600001_33;
        this.LLJJ = new Rect(0, 0, i, i2);
        if (this.LLJILLL == null) {
            LJI(getWidth(), getHeight());
        }
        if (getWidth() > 0 && getHeight() > 0 && (aRunnableS1S0600001_33 = this.LLJJJJ) != null) {
            this.LLJJJJ = null;
            aRunnableS1S0600001_33.run();
        }
    }

    @Override // X.AbstractC21570219bI
    public final boolean LIZLLL(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.concat(this.LLJILJILJ);
        boolean zLIZLLL = super.LIZLLL(canvas, view, j);
        canvas.restore();
        return zLIZLLL;
    }

    @Override // X.InterfaceC568550MRp
    public final void LIZIZ(Rect rect, Rect rect2, C21567519ar c21567519ar, C21570819bO c21570819bO) {
        ARunnableS1S0600001_33 aRunnableS1S0600001_33;
        this.LLJJJJ = new ARunnableS1S0600001_33(this, rect, rect2, c21567519ar, c21570819bO, 1);
        if (this.LLJJ != null && getWidth() > 0 && getHeight() > 0 && (aRunnableS1S0600001_33 = this.LLJJJJ) != null) {
            this.LLJJJJ = null;
            aRunnableS1S0600001_33.run();
        }
    }

    @Override // X.AbstractC21570219bI, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ARunnableS1S0600001_33 aRunnableS1S0600001_33;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJJ != null && getWidth() > 0 && getHeight() > 0 && this.LLJILJILJ.isIdentity() && (aRunnableS1S0600001_33 = this.LLJJJJ) != null) {
            this.LLJJJJ = null;
            aRunnableS1S0600001_33.run();
        }
    }

    @Override // X.InterfaceC568550MRp
    public final void LIZ(Rect rect, Rect rect2, C21567519ar c21567519ar, C21570819bO c21570819bO, Function0 function0) {
        boolean zIsEmpty;
        boolean zIsEmpty2;
        boolean zIsEmpty3;
        if (!isAttachedToWindow()) {
            function0.invoke();
            return;
        }
        Rect rect3 = this.LLJJ;
        if (rect3 != null) {
            zIsEmpty = rect3.isEmpty();
        } else {
            zIsEmpty = true;
        }
        if (rect != null) {
            zIsEmpty2 = rect.isEmpty();
        } else {
            zIsEmpty2 = true;
        }
        if (rect2 != null) {
            zIsEmpty3 = rect2.isEmpty();
        } else {
            zIsEmpty3 = true;
        }
        if (!zIsEmpty && !zIsEmpty2 && !zIsEmpty3) {
            if (rect == null || rect2 == null) {
                return;
            }
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            rect.offset(-iArr[0], -iArr[1]);
            rect2.offset(-iArr[0], -iArr[1]);
            AnimatorSet animatorSetLIZIZ = C21570419bK.LIZIZ(new Matrix(this.LLJILJILJ), new Matrix(C21570419bK.LIZ(rect, getWidth(), getHeight(), this.LLJJ, c21567519ar)), this.LLJJ, c21570819bO, new AwS612S0100000_33(this, 152));
            Animator animatorLJ = LJ(new Rect(rect), rect2, 0.0f, true);
            animatorLJ.setDuration(c21570819bO.LJI);
            animatorLJ.setInterpolator(c21570819bO.LIZJ);
            Animator animatorLJIIIIZZ = LJIIIIZZ(0.0f);
            animatorLJIIIIZZ.setDuration(c21570819bO.LJI);
            animatorLJIIIIZZ.setInterpolator(c21570819bO.LIZJ);
            AnimatorSet animatorSet = new AnimatorSet();
            this.LLJJJIL = animatorSet;
            animatorSet.addListener(new ALAdapterS27S0200000_33(this, function0, 5));
            animatorSet.playTogether(animatorSetLIZIZ, animatorLJ, animatorLJIIIIZZ);
            animatorSet.setInterpolator(this.LLJL);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 100));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LLJJJIL = animatorSet2;
        animatorSet2.addListener(new ALAdapterS27S0200000_33(this, function0, 4));
        animatorSet2.playTogether(valueAnimatorOfFloat, LJIIIIZZ(0.0f));
        animatorSet2.setInterpolator(this.LLJL);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }
}
