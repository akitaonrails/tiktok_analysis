package X;

import Y.ALAdapterS3S0100000_6;
import Y.AUListenerS256S0100000_6;
import Y.AsS33S0100000_6;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HGU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HGU {
    public static volatile String LJIILJJIL;
    public final RecyclerView LIZ;
    public final Function0<Unit> LIZIZ;
    public final C425060Glc LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public ValueAnimator LJI;
    public boolean LJII;
    public float LJIIIIZZ;
    public int LJIIIZ;
    public final Rect LJIIJ = new Rect();
    public final AsS33S0100000_6 LJIIJJI;
    public final C0HGV LJIIL;
    public final C0IDP LJIILIIL;

    public final void LIZLLL() {
        this.LIZLLL = 0.0f;
        this.LJFF = false;
        C786410Ut5.kd(this.LIZ, 0.0f);
        C425060Glc c425060Glc = this.LIZJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425060Glc);
        c425060Glc.setTranslationY(0.0f);
        C425060Glc c425060Glc2 = this.LIZJ;
        C786410Ut5.W4(c425060Glc2.LLILLL, 0.0f);
        C786410Ut5.x5(c425060Glc2.LL, 0.0f);
        C786410Ut5.B5(c425060Glc2.LLILLJJLI, 0.0f);
        C786410Ut5.Fb(c425060Glc2.LL, 0.0f);
        C786410Ut5.U4(c425060Glc2.LLILZ, 0.0f);
        C786410Ut5.Pb(c425060Glc2.LLILZ, 0.625f);
        C786410Ut5.qc(c425060Glc2.LLILZ, 0.625f);
        LIZJ();
        int iLIZ = C0GR6.LIZ();
        ViewGroup.LayoutParams layoutParams = this.LIZJ.getLayoutParams();
        if (layoutParams != null && layoutParams.height != iLIZ) {
            layoutParams.height = iLIZ;
            C425060Glc c425060Glc3 = this.LIZJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425060Glc3);
            c425060Glc3.setLayoutParams(layoutParams);
        }
        LJ(true);
    }

    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        if (this.LIZLLL >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) {
            this.LJ = true;
            LJIILJJIL = "swipe_up";
            this.LIZJ.LIZ();
            this.LIZIZ.invoke();
            return;
        }
        if (this.LIZLLL > 0.0f) {
            ValueAnimator valueAnimator = this.LJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LIZLLL, 0.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 65));
            valueAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(this, 32));
            valueAnimatorOfFloat.start();
            this.LJI = valueAnimatorOfFloat;
        }
    }

    public final void LIZJ() {
        int i;
        int height;
        Object parent = this.LIZJ.getParent();
        while (true) {
            i = 0;
            if (!(parent instanceof View)) {
                break;
            }
            if (!Intrinsics.LJFF(parent, this.LIZ)) {
                parent = ((View) parent).getParent();
            } else if (this.LIZJ.getHeight() > 0) {
                this.LJIIJ.set(0, 0, this.LIZJ.getWidth(), this.LIZJ.getHeight());
                this.LIZ.offsetDescendantRectToMyCoords(this.LIZJ, this.LJIIJ);
                int i2 = this.LJIIJ.top;
                if (i2 >= this.LIZ.getPaddingTop() && (height = ((this.LIZ.getHeight() - this.LIZ.getPaddingBottom()) - i2) - C0GR6.LIZ()) >= 0) {
                    i = height;
                }
            }
        }
        if (this.LJIIIZ == i) {
            return;
        }
        this.LJIIIZ = i;
        this.LIZJ.setContentTopOffset(i);
    }

    public final void LIZ(float f) {
        float f2;
        int iLIZ = C0GR6.LIZ() + ((int) f);
        ViewGroup.LayoutParams layoutParams = this.LIZJ.getLayoutParams();
        if (layoutParams != null && layoutParams.height != iLIZ) {
            layoutParams.height = iLIZ;
            C425060Glc c425060Glc = this.LIZJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425060Glc);
            c425060Glc.setLayoutParams(layoutParams);
        }
        C786410Ut5.kd(this.LIZ, -f);
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        C425060Glc c425060Glc2 = this.LIZJ;
        if (f > fLIZIZ) {
            f2 = f - fLIZIZ;
        } else {
            f2 = 0.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425060Glc2);
        c425060Glc2.setTranslationY(f2);
        this.LIZJ.LIZIZ(C418440Gaw.LJFF(f, this.LIZ.getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(boolean r5) {
        /*
            r4 = this;
            X.0Glc r0 = r4.LIZJ
            android.view.ViewParent r1 = r0.getParent()
        L6:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView r0 = r4.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L1f
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.setClipChildren(r5)
            r1.setClipToPadding(r5)
            android.view.ViewParent r1 = r1.getParent()
            goto L6
        L1f:
            androidx.recyclerview.widget.RecyclerView r0 = r4.LIZ
            android.view.ViewParent r3 = r0.getParent()
            boolean r0 = r3 instanceof android.view.ViewGroup
            r2 = 0
            if (r0 == 0) goto L4a
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L4b
            android.view.ViewParent r1 = r3.getParent()
        L32:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L39
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L39:
            if (r3 == 0) goto L41
            r3.setClipChildren(r5)
            r3.setClipToPadding(r5)
        L41:
            if (r2 == 0) goto L49
            r2.setClipChildren(r5)
            r2.setClipToPadding(r5)
        L49:
            return
        L4a:
            r3 = r2
        L4b:
            r1 = r2
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HGU.LJ(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0HGV, X.19sM] */
    public C0HGU(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AwS571S0100000_27 awS571S0100000_27) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZIZ = awS571S0100000_27;
        this.LIZJ = new C425060Glc(viewOnAttachStateChangeListenerC20604515jv.getContext());
        AsS33S0100000_6 asS33S0100000_6 = new AsS33S0100000_6(this, 4);
        this.LJIIJJI = asS33S0100000_6;
        ?? r2 = new InterfaceC21676019sM() { // from class: X.0HGV
            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                boolean z;
                float fLIZIZ;
                boolean z2;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return;
                        }
                    } else {
                        float rawY = this.LL.LJIIIIZZ - motionEvent.getRawY();
                        this.LL.LJIIIIZZ = motionEvent.getRawY();
                        C0HGU c0hgu = this.LL;
                        if (c0hgu.LJ) {
                            return;
                        }
                        ValueAnimator valueAnimator = c0hgu.LJI;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        c0hgu.LJI = null;
                        float f = c0hgu.LIZLLL;
                        if (f > 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (rawY <= 0.0f) {
                            fLIZIZ = f + rawY;
                            if (fLIZIZ < 0.0f) {
                                fLIZIZ = 0.0f;
                            }
                        } else {
                            float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                            float f2 = c0hgu.LIZLLL;
                            if (f2 >= fLIZIZ2) {
                                float fLIZIZ3 = f2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                                if (fLIZIZ3 < 0.0f) {
                                    fLIZIZ3 = 0.0f;
                                }
                                rawY *= 0.8f / ((fLIZIZ3 / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) + 1.0f);
                            } else {
                                float f3 = fLIZIZ2 - f2;
                                if (rawY > f3) {
                                    float f4 = rawY - f3;
                                    float fLIZIZ4 = fLIZIZ2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                                    if (fLIZIZ4 < 0.0f) {
                                        fLIZIZ4 = 0.0f;
                                    }
                                    fLIZIZ = fLIZIZ2 + (f4 * (0.8f / ((fLIZIZ4 / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) + 1.0f)));
                                }
                            }
                            fLIZIZ = f2 + rawY;
                        }
                        c0hgu.LIZLLL = fLIZIZ;
                        if (!z && fLIZIZ > 0.0f) {
                            c0hgu.LJ(false);
                            c0hgu.LIZJ();
                        }
                        if (c0hgu.LIZLLL >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) {
                            z2 = true;
                            if (!c0hgu.LJFF) {
                                new C0ZDN(c0hgu.LIZ.getContext()).LIZ(0);
                            }
                        } else {
                            z2 = false;
                        }
                        c0hgu.LJFF = z2;
                        c0hgu.LIZ(c0hgu.LIZLLL);
                        if (!z || c0hgu.LIZLLL != 0.0f) {
                            return;
                        }
                        c0hgu.LIZLLL();
                        return;
                    }
                }
                C0HGU c0hgu2 = this.LL;
                c0hgu2.LJII = false;
                c0hgu2.LIZIZ();
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
            @Override // X.InterfaceC21676019sM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJJIFFI(androidx.recyclerview.widget.RecyclerView r6, android.view.MotionEvent r7) {
                /*
                    r5 = this;
                    int r1 = r7.getActionMasked()
                    r3 = 0
                    if (r1 == 0) goto L49
                    r4 = 1
                    if (r1 == r4) goto L3d
                    r0 = 2
                    if (r1 == r0) goto L11
                    r0 = 3
                    if (r1 == r0) goto L3d
                L10:
                    return r3
                L11:
                    X.0HGU r0 = r5.LL
                    float r1 = r0.LJIIIIZZ
                    float r0 = r7.getRawY()
                    float r1 = r1 - r0
                    r2 = 0
                    int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L30
                    boolean r0 = r6.canScrollVertically(r4)
                    if (r0 != 0) goto L30
                    X.0HGU r1 = r5.LL
                    r1.LJII = r4
                    float r0 = r7.getRawY()
                    r1.LJIIIIZZ = r0
                    return r4
                L30:
                    X.0HGU r1 = r5.LL
                    boolean r0 = r1.LJII
                    if (r0 == 0) goto L10
                    float r0 = r1.LIZLLL
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L10
                    return r4
                L3d:
                    X.0HGU r1 = r5.LL
                    boolean r0 = r1.LJII
                    if (r0 == 0) goto L10
                    r1.LJII = r3
                    r1.LIZIZ()
                    return r4
                L49:
                    X.0HGU r1 = r5.LL
                    float r0 = r7.getRawY()
                    r1.LJIIIIZZ = r0
                    X.0HGU r0 = r5.LL
                    r0.LJII = r3
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0HGV.LJJIFFI(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
            }
        };
        this.LJIIL = r2;
        C0IDP c0idp = new C0IDP(this, 9);
        this.LJIILIIL = c0idp;
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(asS33S0100000_6);
        viewOnAttachStateChangeListenerC20604515jv.addOnItemTouchListener(r2);
        viewOnAttachStateChangeListenerC20604515jv.addOnLayoutChangeListener(c0idp);
    }
}
