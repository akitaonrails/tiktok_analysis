package X;

import X.C1313510kHl;
import Y.AUListenerS0S0200008_20;
import Y.AUListenerS269S0100000_20;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.util.SparseArray;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n86.a$g;

/* JADX INFO: renamed from: X.0kHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313510kHl {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public SparseArray<C1313710kI5> LJIIIZ = new SparseArray<>();
    public final SDUIBaseUI LJI = null;
    public final HashMap<Integer, Animator> LJII = new HashMap<>();
    public final HashMap<Integer, Animator> LJIIIIZZ = new HashMap<>();

    public final void LJ() {
        Iterator it2 = ((HashMap) this.LJII.clone()).values().iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).cancel();
        }
        this.LJII.clear();
        this.LJIIIIZZ.clear();
    }

    public final boolean LIZIZ(int i) {
        if (this.LJIIIZ.size() != 0 && this.LJIIIZ.get(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        if (this.LJIIIZ.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public final void LJFF(Integer num) {
        Animator animator = this.LJII.get(num);
        if (animator != null) {
            animator.cancel();
            this.LJII.remove(num);
        }
    }

    public final void LIZ(SDUIBaseUI sDUIBaseUI, final int i, Object obj) {
        AbstractC1313520kHm abstractC1313520kHm;
        int i2;
        if (this.LJIIIZ.size() != 0 && this.LJIIIZ.get(i) != null) {
            SDUIBaseUI sDUIBaseUI2 = this.LJI;
            if (sDUIBaseUI2 == null) {
                sDUIBaseUI2 = sDUIBaseUI;
            }
            C1313710kI5 c1313710kI5 = this.LJIIIZ.get(i);
            float f = 1.0f;
            if (i != 1) {
                if (i != 64) {
                    if (i != 128) {
                        if (i == 4096 && (sDUIBaseUI2 instanceof AbstractC1313520kHm)) {
                            final AbstractC1313520kHm abstractC1313520kHm2 = (AbstractC1313520kHm) sDUIBaseUI2;
                            Point point = abstractC1313520kHm2.LLLF;
                            final C1313580kHs c1313580kHsLJIIIIZZ = C1313580kHs.LJIIIIZZ((List) obj, point.x, point.y);
                            float fLJJJ = abstractC1313520kHm2.LJJJ();
                            float fLJJJI = abstractC1313520kHm2.LJJJI();
                            float translationZ = abstractC1313520kHm2.LLLLLILLIL.getTranslationZ();
                            float rotation = abstractC1313520kHm2.LLLLLILLIL.getRotation();
                            float rotationX = abstractC1313520kHm2.LLLLLILLIL.getRotationX();
                            float rotationY = abstractC1313520kHm2.LLLLLILLIL.getRotationY();
                            float scaleX = abstractC1313520kHm2.LLLLLILLIL.getScaleX();
                            float scaleY = abstractC1313520kHm2.LLLLLILLIL.getScaleY();
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0);
                            this.LJIIIIZZ.put(Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH), valueAnimatorOfInt);
                            valueAnimatorOfInt.setDuration(c1313710kI5.LLILLJJLI);
                            valueAnimatorOfInt.setInterpolator(C1313730kI7.LIZ(c1313710kI5));
                            valueAnimatorOfInt.setStartDelay(c1313710kI5.LLILLL);
                            valueAnimatorOfInt.addListener(new a$g(abstractC1313520kHm2, i) { // from class: X.0kHx
                                @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    super.onAnimationEnd(animator);
                                    C786410Ut5.Jc(abstractC1313520kHm2.LLLLLILLIL, c1313580kHsLJIIIIZZ.LJFF());
                                    C786410Ut5.ed(abstractC1313520kHm2.LLLLLILLIL, c1313580kHsLJIIIIZZ.LJI());
                                    abstractC1313520kHm2.LLLLLILLIL.setTranslationZ(c1313580kHsLJIIIIZZ.LJII());
                                    InterfaceC1298200jt4 interfaceC1298200jt4 = abstractC1313520kHm2.LLILZLL;
                                    if (interfaceC1298200jt4 instanceof C1313490kHj) {
                                        ((SDUIBaseUI) interfaceC1298200jt4).LJJJJZ();
                                    }
                                    C786410Ut5.Ab(abstractC1313520kHm2.LLLLLILLIL, c1313580kHsLJIIIIZZ.LIZ());
                                    C786410Ut5.Hb(abstractC1313520kHm2.LLLLLILLIL, c1313580kHsLJIIIIZZ.LIZIZ());
                                    C786410Ut5.Ib(abstractC1313520kHm2.LLLLLILLIL, c1313580kHsLJIIIIZZ.LIZJ());
                                    C786410Ut5.Ob(abstractC1313520kHm2.LLLLLILLIL, c1313580kHsLJIIIIZZ.LIZLLL());
                                    C786410Ut5.pc(abstractC1313520kHm2.LLLLLILLIL, c1313580kHsLJIIIIZZ.LJ());
                                    this.LLILZLL.LJII.remove(Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH));
                                }
                            });
                            valueAnimatorOfInt.addUpdateListener(new AUListenerS0S0200008_20(fLJJJ, c1313580kHsLJIIIIZZ, abstractC1313520kHm2, fLJJJI, translationZ, rotation, rotationX, rotationY, scaleX, scaleY, 1));
                            return;
                        }
                        return;
                    }
                    if (this.LJFF) {
                        return;
                    }
                    InterfaceC1298200jt4 interfaceC1298200jt4 = sDUIBaseUI2.LLILZLL;
                    if (interfaceC1298200jt4 instanceof C1313490kHj) {
                        abstractC1313520kHm = (AbstractC1313520kHm) interfaceC1298200jt4;
                    } else {
                        abstractC1313520kHm = (AbstractC1313520kHm) sDUIBaseUI2;
                    }
                    int iIntValue = ((Integer) obj).intValue();
                    int visibility = abstractC1313520kHm.LLLLLILLIL.getVisibility();
                    if (iIntValue == 1) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    if (visibility == i2) {
                        return;
                    }
                    this.LJ = true;
                    final float alpha = abstractC1313520kHm.LLLLLILLIL.getAlpha();
                    float f2 = 0.0f;
                    if (visibility == 0) {
                        f = 0.0f;
                    } else {
                        if ((visibility == 4 || visibility == 8) && i2 == 0) {
                            C786410Ut5.T4(abstractC1313520kHm.LLLLLILLIL, 0.0f);
                        }
                        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f2), Float.valueOf(f));
                        valueAnimatorOfObject.setDuration(c1313710kI5.LLILLJJLI);
                        valueAnimatorOfObject.setInterpolator(C1313730kI7.LIZ(c1313710kI5));
                        valueAnimatorOfObject.setStartDelay(c1313710kI5.LLILLL);
                        valueAnimatorOfObject.addUpdateListener(new AUListenerS269S0100000_20(abstractC1313520kHm, 19));
                        final SDUIBaseUI sDUIBaseUI3 = sDUIBaseUI2;
                        final AbstractC1313520kHm abstractC1313520kHm3 = abstractC1313520kHm;
                        final int i3 = i2;
                        valueAnimatorOfObject.addListener(new a$g(sDUIBaseUI3, i) { // from class: X.0kG3
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                super.onAnimationCancel(animator);
                                this.LLIZ.LJ = false;
                            }

                            @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                AbstractC1313520kHm abstractC1313520kHm4 = abstractC1313520kHm3;
                                int i4 = i3;
                                if (i4 == 0) {
                                    abstractC1313520kHm4.LLLLLJLJLL = true;
                                    C786410Ut5.LJLLLLLL(0, abstractC1313520kHm4.LLLLLILLIL);
                                } else if (i4 == 4) {
                                    abstractC1313520kHm4.LLLLLJLJLL = false;
                                    C786410Ut5.LJLLLLLL(4, abstractC1313520kHm4.LLLLLILLIL);
                                } else {
                                    abstractC1313520kHm4.getClass();
                                }
                                C786410Ut5.T4(abstractC1313520kHm3.LLLLLILLIL, alpha);
                                this.LLIZ.LJII.remove(128);
                            }

                            @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                super.onAnimationStart(animator);
                                C786410Ut5.LJLLLLLL(0, abstractC1313520kHm3.LLLLLILLIL);
                                this.LLIZ.LJ = false;
                            }
                        });
                        this.LJIIIIZZ.put(128, valueAnimatorOfObject);
                        return;
                    }
                    f2 = alpha;
                    ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f2), Float.valueOf(f));
                    valueAnimatorOfObject2.setDuration(c1313710kI5.LLILLJJLI);
                    valueAnimatorOfObject2.setInterpolator(C1313730kI7.LIZ(c1313710kI5));
                    valueAnimatorOfObject2.setStartDelay(c1313710kI5.LLILLL);
                    valueAnimatorOfObject2.addUpdateListener(new AUListenerS269S0100000_20(abstractC1313520kHm, 19));
                    final SDUIBaseUI sDUIBaseUI32 = sDUIBaseUI2;
                    final AbstractC1313520kHm abstractC1313520kHm32 = abstractC1313520kHm;
                    final int i32 = i2;
                    valueAnimatorOfObject2.addListener(new a$g(sDUIBaseUI32, i) { // from class: X.0kG3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            super.onAnimationCancel(animator);
                            this.LLIZ.LJ = false;
                        }

                        @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            AbstractC1313520kHm abstractC1313520kHm4 = abstractC1313520kHm32;
                            int i4 = i32;
                            if (i4 == 0) {
                                abstractC1313520kHm4.LLLLLJLJLL = true;
                                C786410Ut5.LJLLLLLL(0, abstractC1313520kHm4.LLLLLILLIL);
                            } else if (i4 == 4) {
                                abstractC1313520kHm4.LLLLLJLJLL = false;
                                C786410Ut5.LJLLLLLL(4, abstractC1313520kHm4.LLLLLILLIL);
                            } else {
                                abstractC1313520kHm4.getClass();
                            }
                            C786410Ut5.T4(abstractC1313520kHm32.LLLLLILLIL, alpha);
                            this.LLIZ.LJII.remove(128);
                        }

                        @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            C786410Ut5.LJLLLLLL(0, abstractC1313520kHm32.LLLLLILLIL);
                            this.LLIZ.LJ = false;
                        }
                    });
                    this.LJIIIIZZ.put(128, valueAnimatorOfObject2);
                    return;
                }
                final int iIntValue2 = ((Integer) obj).intValue();
                ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(sDUIBaseUI2.LLJ.LJ), Integer.valueOf(iIntValue2));
                this.LJIIIIZZ.put(64, valueAnimatorOfObject3);
                valueAnimatorOfObject3.setDuration(Math.round(c1313710kI5.LLILLJJLI));
                valueAnimatorOfObject3.setInterpolator(C1313730kI7.LIZ(c1313710kI5));
                valueAnimatorOfObject3.setStartDelay(c1313710kI5.LLILLL);
                final SDUIBaseUI sDUIBaseUI4 = sDUIBaseUI2;
                final SDUIBaseUI sDUIBaseUI5 = sDUIBaseUI2;
                valueAnimatorOfObject3.addListener(new a$g(sDUIBaseUI4, i) { // from class: X.0kIZ
                    @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        sDUIBaseUI5.LLJ.LIZJ(iIntValue2);
                        sDUIBaseUI5.LJJJJZ();
                        this.LLILZLL.LJII.remove(64);
                    }
                });
                valueAnimatorOfObject3.addUpdateListener(new AUListenerS269S0100000_20(sDUIBaseUI2, 17));
                return;
            }
            if (this.LJ) {
                return;
            }
            final float fMin = Math.min(((Float) obj).floatValue(), 1.0f);
            final AbstractC1313520kHm abstractC1313520kHm4 = (AbstractC1313520kHm) sDUIBaseUI2;
            ValueAnimator valueAnimatorOfObject4 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(abstractC1313520kHm4.LLLLLILLIL.getAlpha()), Float.valueOf(fMin));
            this.LJIIIIZZ.put(1, valueAnimatorOfObject4);
            valueAnimatorOfObject4.setDuration(c1313710kI5.LLILLJJLI);
            valueAnimatorOfObject4.setInterpolator(C1313730kI7.LIZ(c1313710kI5));
            valueAnimatorOfObject4.setStartDelay(c1313710kI5.LLILLL);
            valueAnimatorOfObject4.addListener(new a$g(abstractC1313520kHm4, i) { // from class: X.0kG2
                @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C786410Ut5.T4(abstractC1313520kHm4.LLLLLILLIL, fMin);
                    InterfaceC1298200jt4 interfaceC1298200jt42 = abstractC1313520kHm4.LLILZLL;
                    if (interfaceC1298200jt42 instanceof C1313490kHj) {
                        ((SDUIBaseUI) interfaceC1298200jt42).LJJJJZ();
                    }
                    this.LLILZLL.LJII.remove(1);
                }
            });
            valueAnimatorOfObject4.addUpdateListener(new AUListenerS269S0100000_20(abstractC1313520kHm4, 18));
            this.LJFF = true;
        }
    }

    public final ValueAnimator LIZLLL(final int i, final SDUIBaseUI sDUIBaseUI, int i2, int i3, C1313710kI5 c1313710kI5, final boolean z) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(c1313710kI5.LLILLJJLI);
        valueAnimatorOfInt.setInterpolator(C1313730kI7.LIZ(c1313710kI5));
        valueAnimatorOfInt.setStartDelay(c1313710kI5.LLILLL);
        valueAnimatorOfInt.addListener(new a$g(sDUIBaseUI, i, this, z) { // from class: n86.a$e
            public final WeakReference<C1313510kHl> LLILZ;
            public final boolean LLILZIL;

            /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
            @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onAnimationEnd(android.animation.Animator r33) {
                /*
                    r32 = this;
                    r3 = r32
                    boolean r0 = r3.LLILZIL
                    if (r0 == 0) goto Lb
                    r0 = r33
                    super.onAnimationEnd(r0)
                Lb:
                    java.lang.ref.WeakReference<X.0kHl> r0 = r3.LLILZ
                    java.lang.Object r2 = r0.get()
                    X.0kHl r2 = (X.C1313510kHl) r2
                    java.lang.ref.WeakReference<com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI> r0 = r3.LL
                    java.lang.Object r14 = r0.get()
                    com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI r14 = (com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI) r14
                    if (r14 == 0) goto L95
                    if (r2 == 0) goto L95
                    java.util.HashMap<java.lang.Integer, android.animation.Animator> r1 = r2.LJII
                    int r0 = r3.LLILLJJLI
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r1.remove(r0)
                    int r13 = r14.LJJIII()
                    int r12 = r14.LJJIIJ()
                    int r11 = r14.LJJJJI()
                    int r10 = r14.LJIIZILJ()
                    int r1 = r3.LLILLJJLI
                    r0 = 16
                    if (r1 == r0) goto L9f
                    r0 = 32
                    if (r1 == r0) goto L9c
                    r0 = 256(0x100, float:3.59E-43)
                    if (r1 == r0) goto L99
                    r0 = 512(0x200, float:7.17E-43)
                    if (r1 == r0) goto L96
                    r0 = 1024(0x400, float:1.435E-42)
                    if (r1 == r0) goto L99
                    r0 = 2048(0x800, float:2.87E-42)
                    if (r1 == r0) goto L96
                L54:
                    int r0 = r14.LLJJJJJIL
                    r16 = r0
                    int r15 = r14.LLJJL
                    int r9 = r14.LLJJJJLIIL
                    int r8 = r14.LLJJLIIIJLLLLLLLZ
                    int r7 = r14.LLJL
                    int r6 = r14.LLJLIL
                    int r5 = r14.LLJLILLLLZIIL
                    int r4 = r14.LLJLL
                    int r3 = r14.LLJLLL
                    int r2 = r14.LLJLLIL
                    int r1 = r14.LLJZ
                    int r0 = r14.LLJZIJLIL
                    android.graphics.Rect r31 = r14.LJIIL()
                    r27 = r3
                    r28 = r2
                    r29 = r1
                    r30 = r0
                    r26 = r4
                    r25 = r5
                    r24 = r6
                    r23 = r7
                    r22 = r8
                    r21 = r9
                    r20 = r15
                    r19 = r16
                    r18 = r10
                    r17 = r11
                    r16 = r12
                    r15 = r13
                    r14 = r14
                    r14.LJLIIL(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                L95:
                    return
                L96:
                    int r12 = r2.LIZIZ
                    goto L54
                L99:
                    int r13 = r2.LIZ
                    goto L54
                L9c:
                    int r10 = r2.LIZLLL
                    goto L54
                L9f:
                    int r11 = r2.LIZJ
                    goto L54
                */
                throw new UnsupportedOperationException("Method not decompiled: n86.a$e.onAnimationEnd(android.animation.Animator):void");
            }

            @Override // n86.a$g, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (this.LLILZIL) {
                    super.onAnimationStart(animator);
                }
            }

            {
                this.LLILZIL = true;
                this.LLILZ = new WeakReference<>(this);
                this.LLILZIL = z;
            }
        });
        if (i != 16) {
            if (i != 32) {
                if (i != 256) {
                    if (i != 512) {
                        if (i != 1024) {
                            if (i != 2048) {
                                return valueAnimatorOfInt;
                            }
                        }
                    }
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(sDUIBaseUI, 13));
                    return valueAnimatorOfInt;
                }
                valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(sDUIBaseUI, 16));
                return valueAnimatorOfInt;
            }
            valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(sDUIBaseUI, 15));
            return valueAnimatorOfInt;
        }
        valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(sDUIBaseUI, 14));
        return valueAnimatorOfInt;
    }
}
