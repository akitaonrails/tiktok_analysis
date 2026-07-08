package X;

import Y.ALAdapterS27S0100000_33;
import Y.ALAdapterS27S0200000_33;
import Y.ARunnableS106S0100000_6;
import Y.AUListenerS235S0200000_33;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
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
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19by, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21574419by extends AbstractC21574719c1 implements C16CX {
    public Matrix LLJI;
    public RectF LLJIJIL;
    public Rect LLJILJIL;
    public boolean LLJILJILJ;
    public final OverScroller LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public Animator LLJJIII;
    public Animator LLJJIJI;
    public AnimatorSet LLJJIJIIJIL;
    public RunnableC21574219bw LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public final C12DM LLJJJJLIIL;
    public InterfaceC21574319bx LLJJL;
    public final C19727412Gi LLJJLIIIJLLLLLLLZ;
    public final C21575019c4 LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;

    public final void LJIIIIZZ() {
        this.LLJJJ = 0.0f;
        this.LLJJJIL = 0.0f;
        this.LLJJJJ = 1.0f;
        this.LLJJJJJIL = 1.0f;
        this.LLJJ = false;
        this.LLJJI = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    private final RectF getCurrentDisplayRectF() {
        RectF rectF = new RectF(this.LLJIJIL);
        this.LLJI.mapRect(rectF);
        return rectF;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21574419by.LJIIIZ():void");
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLJILLL.computeScrollOffset()) {
            int i = this.LLJLIL;
            int i2 = this.LLJLILLLLZIIL;
            int currX = this.LLJILLL.getCurrX();
            int currY = this.LLJILLL.getCurrY();
            this.LLJLIL = currX;
            this.LLJLILLLLZIIL = currY;
            LJIIJJI(currX - i, currY - i2);
        }
    }

    @Override // X.C16CX
    public final void reset() {
        this.LLJI.reset();
        this.LLJJIII = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJI = null;
        LJIIIIZZ();
        invalidate();
    }

    public final Animator LJFF(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLJJJJJIL, f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 17));
        return valueAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21574419by.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C16CX
    public void setGestureListener(InterfaceC21574319bx interfaceC21574319bx) {
        this.LLJJL = interfaceC21574319bx;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.12Gi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.19bz] */
    public C21574419by(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJI = new Matrix();
        this.LLJILLL = new OverScroller(context);
        this.LLJJJJ = 1.0f;
        this.LLJJJJJIL = 1.0f;
        this.LLJJJJLIIL = new C12DM();
        this.LLJJLIIIJLLLLLLLZ = new TypeEvaluator<Matrix>() { // from class: X.12Gi
            public final float[] LIZ = new float[9];
            public final float[] LIZIZ = new float[9];
            public final Matrix LIZJ = new Matrix();

            @Override // android.animation.TypeEvaluator
            public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
                matrix.getValues(this.LIZ);
                matrix2.getValues(this.LIZIZ);
                int i = 0;
                do {
                    float[] fArr = this.LIZIZ;
                    float f2 = fArr[i];
                    float f3 = this.LIZ[i];
                    fArr[i] = f3 + ((f2 - f3) * f);
                    i++;
                } while (i < 9);
                this.LIZJ.setValues(this.LIZIZ);
                return this.LIZJ;
            }
        };
        HandlerHook.viewPost(this, new ARunnableS106S0100000_6((Object) this, 160));
        this.LLJL = new C21575019c4(context, new InterfaceC21575319c7() { // from class: X.19bz
            @Override // X.InterfaceC21575319c7
            public final void LIZJ() {
            }

            @Override // X.InterfaceC21575319c7
            public final void LIZLLL() {
                C21574419by c21574419by = this.LIZ;
                if (c21574419by.LLJILJILJ) {
                    c21574419by.LLJILJILJ = false;
                    return;
                }
                if (c21574419by.LLJJJJ <= 1.0f) {
                    float f = c21574419by.LLJJJIL;
                    if (f > 0.0f && Math.abs(f) > c21574419by.getHeight() * 0.2f) {
                        InterfaceC21574319bx interfaceC21574319bx = c21574419by.LLJJL;
                        if (interfaceC21574319bx != null) {
                            interfaceC21574319bx.onExit();
                        }
                        c21574419by.LJIIIIZZ();
                        return;
                    }
                    Animator animator = c21574419by.LLJJIJI;
                    if (animator == null || !animator.isRunning()) {
                        Animator animatorLJI = c21574419by.LJI(new Matrix(c21574419by.LLJI), new Matrix());
                        animatorLJI.addListener(new ALAdapterS27S0100000_33(c21574419by, 14));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(animatorLJI, c21574419by.LJFF(1.0f));
                        animatorSet.start();
                        c21574419by.LLJJIJI = animatorSet;
                    }
                }
            }

            @Override // X.InterfaceC21575319c7
            public final boolean onScaleBegin() {
                this.LIZ.getParent().requestDisallowInterceptTouchEvent(false);
                return this.LIZ.LLJJJJ >= 1.0f;
            }

            @Override // X.InterfaceC21575319c7
            public final void onScaleEnd() {
                C21574419by c21574419by = this.LIZ;
                if (c21574419by.LLJJJIL > 0.0f) {
                    return;
                }
                c21574419by.LLJILJILJ = true;
                c21574419by.LJIIIZ();
            }

            @Override // X.InterfaceC21575319c7
            public final boolean LJFF(C21574619c0 c21574619c0) {
                if (this.LIZ.LLJJJIL > 0.0f) {
                    return false;
                }
                if (c21574619c0.LJIIL == -1.0f) {
                    if (c21574619c0.LJIIJ == -1.0f) {
                        float f = c21574619c0.LJIIIIZZ;
                        float f2 = c21574619c0.LJIIIZ;
                        c21574619c0.LJIIJ = (float) Math.sqrt((f * f) + (f2 * f2));
                    }
                    float f3 = c21574619c0.LJIIJ;
                    if (c21574619c0.LJIIJJI == -1.0f) {
                        float f4 = c21574619c0.LJI;
                        float f5 = c21574619c0.LJII;
                        c21574619c0.LJIIJJI = (float) Math.sqrt((f4 * f4) + (f5 * f5));
                    }
                    c21574619c0.LJIIL = f3 / c21574619c0.LJIIJJI;
                }
                float f6 = c21574619c0.LJIIL;
                float f7 = c21574619c0.LJ;
                float f8 = c21574619c0.LJFF;
                if (Float.isNaN(f6) || Float.isInfinite(f6)) {
                    return false;
                }
                this.LIZ.LJIIJ(f6, f7, f8);
                return true;
            }

            @Override // X.InterfaceC21575319c7
            public final boolean onDown(MotionEvent motionEvent) {
                ViewParent parent;
                if (motionEvent.getPointerCount() > 2) {
                    this.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
                }
                AnimatorSet animatorSet = this.LIZ.LLJJIJIIJIL;
                if (animatorSet != null && animatorSet.isRunning()) {
                    return false;
                }
                C21574419by c21574419by = this.LIZ;
                if (c21574419by.LLJJJJ > 1.0f && (parent = c21574419by.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.LIZ.LLJILLL.forceFinished(true);
                return true;
            }

            @Override // X.InterfaceC21575319c7
            public final boolean LJ(MotionEvent motionEvent, float f, float f2) {
                boolean z;
                if (this.LIZ.LLJILJILJ || motionEvent.getPointerCount() >= 3) {
                    return false;
                }
                C21574419by c21574419by = this.LIZ;
                if (motionEvent.getPointerCount() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                c21574419by.LLJJ = z;
                C21574419by c21574419by2 = this.LIZ;
                if (c21574419by2.LLJJ) {
                    c21574419by2.LJIIJJI(-f, -f2);
                } else {
                    float f3 = c21574419by2.LLJJJJ;
                    if (f3 > 1.0f) {
                        c21574419by2.LJII(-f, -f2);
                        return true;
                    }
                    if (f3 == 1.0f) {
                        float f4 = -f;
                        float f5 = -f2;
                        float f6 = c21574419by2.LLJJJ + f4;
                        c21574419by2.LLJJJ = f6;
                        float f7 = c21574419by2.LLJJJIL + f5;
                        c21574419by2.LLJJJIL = f7;
                        if (!c21574419by2.LLJJI && f7 > Math.abs(f6)) {
                            c21574419by2.LLJJI = true;
                            c21574419by2.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        if (c21574419by2.LLJJI) {
                            RectF rectF = new RectF(0.0f, 0.0f, c21574419by2.getWidth(), c21574419by2.getHeight());
                            float fMin = 1.0f - Math.min(1.0f, Math.abs(c21574419by2.LLJJJIL) / (rectF.height() * 1.0f));
                            c21574419by2.LLJJJJJIL = fMin;
                            InterfaceC21574319bx interfaceC21574319bx = c21574419by2.LLJJL;
                            if (interfaceC21574319bx != null) {
                                interfaceC21574319bx.LIZJ(fMin);
                            }
                            RectF rectF2 = new RectF(0.0f, 0.0f, c21574419by2.getWidth(), c21574419by2.getHeight());
                            float fMin2 = (Math.min(1.0f, Math.abs(c21574419by2.LLJJJIL) / (rectF2.height() * 1.0f)) * (-0.5f)) + 1.0f;
                            float[] fArr = new float[9];
                            c21574419by2.LLJI.getValues(fArr);
                            float f8 = fMin2 / fArr[0];
                            Matrix matrix = c21574419by2.LLJI;
                            matrix.postTranslate(f4, f5);
                            matrix.postScale(f8, f8, motionEvent.getX(), motionEvent.getY());
                            c21574419by2.invalidate();
                            return true;
                        }
                    }
                }
                return true;
            }
        });
    }

    public final void LJ(float f, float f2) {
        float f3;
        Rect rect = this.LLJILJIL;
        if (rect != null) {
            float fWidth = rect.width();
            Rect rect2 = this.LLJILJIL;
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
                this.LLJIJIL = new RectF(f6, f3, f, f2);
            }
        }
    }

    public final Animator LJI(Matrix matrix, Matrix matrix2) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.LLJJLIIIJLLLLLLLZ, matrix, matrix2);
        valueAnimatorOfObject.addUpdateListener(new AUListenerS235S0200000_33(this, valueAnimatorOfObject, 0));
        return valueAnimatorOfObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(float r8, float r9) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21574419by.LJII(float, float):void");
    }

    public final void LJIIJJI(float f, float f2) {
        if (C21574819c2.LIZ(f, 0.0f) && C21574819c2.LIZ(f2, 0.0f)) {
            return;
        }
        this.LLJI.postTranslate(f, f2);
        invalidate();
    }

    @Override // X.C16CX
    public final void setVideoSize(int i, int i2) {
        this.LLJILJIL = new Rect(0, 0, i, i2);
        if (this.LLJIJIL == null) {
            LJ(getWidth(), getHeight());
        }
    }

    @Override // X.AbstractC21574719c1
    public final boolean LIZJ(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.concat(this.LLJI);
        boolean zLIZJ = super.LIZJ(canvas, view, j);
        canvas.restore();
        return zLIZJ;
    }

    public final void LJIIJ(float f, float f2, float f3) {
        float fMin;
        if (f == 1.0f) {
            return;
        }
        float[] fArr = new float[9];
        this.LLJI.getValues(fArr);
        float f4 = fArr[0];
        if (f < 1.0f) {
            fMin = Math.max(0.7f / f4, f);
        } else {
            fMin = Math.min(10.0f / f4, f);
        }
        RectF currentDisplayRectF = getCurrentDisplayRectF();
        if (C21574819c2.LIZLLL(f2, currentDisplayRectF.left)) {
            f2 = currentDisplayRectF.left;
        } else if (C21574819c2.LIZIZ(f2, currentDisplayRectF.right)) {
            f2 = currentDisplayRectF.right;
        }
        if (C21574819c2.LIZLLL(f3, currentDisplayRectF.top)) {
            f3 = currentDisplayRectF.top;
        } else if (C21574819c2.LIZIZ(f3, currentDisplayRectF.bottom)) {
            f3 = currentDisplayRectF.bottom;
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f3));
        this.LLJI.postScale(fMin, fMin, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        float[] fArr2 = new float[9];
        this.LLJI.getValues(fArr2);
        this.LLJJJJ = fArr2[0];
        invalidate();
    }

    @Override // X.C16CX
    public final void LIZ(Rect rect, Rect rect2, C417900Ga4 c417900Ga4, C16CY c16cy) {
        RunnableC21574219bw runnableC21574219bw;
        this.LLJJIJIL = new RunnableC21574219bw(this, rect, rect2, c417900Ga4, c16cy);
        if (this.LLJILJIL != null && getWidth() > 0 && getHeight() > 0 && (runnableC21574219bw = this.LLJJIJIL) != null) {
            runnableC21574219bw.run();
        }
    }

    @Override // X.AbstractC21574719c1, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        RunnableC21574219bw runnableC21574219bw;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJILJIL != null && getWidth() > 0 && getHeight() > 0 && this.LLJI.isIdentity() && (runnableC21574219bw = this.LLJJIJIL) != null) {
            runnableC21574219bw.run();
        }
    }

    @Override // X.C16CX
    public final void LIZIZ(Rect rect, Rect rect2, C417900Ga4 c417900Ga4, C16CY c16cy, AwS575S0100000_31 awS575S0100000_31) {
        boolean zIsEmpty;
        boolean zIsEmpty2;
        boolean zIsEmpty3;
        if (!isAttachedToWindow()) {
            awS575S0100000_31.invoke();
            return;
        }
        Rect rect3 = this.LLJILJIL;
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
            AnimatorSet animatorSetLIZIZ = C21572019ba.LIZIZ(new Matrix(this.LLJI), new Matrix(C21572019ba.LIZ(rect, getWidth(), getHeight(), this.LLJILJIL, c417900Ga4)), this.LLJILJIL, c16cy, new AwS612S0100000_33(this, 136));
            Animator animatorLIZLLL = LIZLLL(new Rect(rect), rect2, true);
            animatorLIZLLL.setDuration(c16cy.LIZLLL);
            animatorLIZLLL.setInterpolator(c16cy.LIZIZ);
            Animator animatorLJFF = LJFF(0.0f);
            animatorLJFF.setDuration(c16cy.LIZLLL);
            animatorLJFF.setInterpolator(c16cy.LIZIZ);
            AnimatorSet animatorSet = new AnimatorSet();
            this.LLJJIJIIJIL = animatorSet;
            animatorSet.addListener(new ALAdapterS27S0200000_33(this, awS575S0100000_31, 1));
            animatorSet.playTogether(animatorSetLIZIZ, animatorLIZLLL, animatorLJFF);
            animatorSet.setInterpolator(this.LLJJJJLIIL);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 66));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LLJJIJIIJIL = animatorSet2;
        animatorSet2.addListener(new ALAdapterS27S0200000_33(this, awS575S0100000_31, 2));
        animatorSet2.playTogether(valueAnimatorOfFloat, LJFF(0.0f));
        animatorSet2.setInterpolator(this.LLJJJJLIIL);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }
}
