package X;

import Y.AUListenerS0S0200008_20;
import Y.AUListenerS254S0100000_4;
import Y.AUListenerS269S0100000_20;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312040kFO {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final LynxBaseUI LJI;
    public SparseArray<C1313370kHX> LJIIIZ = new SparseArray<>();
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

    public C1312040kFO(LynxUI lynxUI) {
        this.LJI = lynxUI;
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

    public final void LIZ(LynxBaseUI lynxBaseUI, final int i, Object obj) {
        LynxUI lynxUI;
        int i2;
        if (this.LJIIIZ.size() != 0 && this.LJIIIZ.get(i) != null) {
            LynxBaseUI lynxBaseUI2 = this.LJI;
            if (lynxBaseUI2 == null) {
                lynxBaseUI2 = lynxBaseUI;
            }
            C1313370kHX c1313370kHX = this.LJIIIZ.get(i);
            float f = 1.0f;
            if (i != 1) {
                if (i != 64) {
                    if (i != 128) {
                        if (i == 4096 && (lynxBaseUI2 instanceof LynxUI)) {
                            final LynxUI lynxUI2 = (LynxUI) lynxBaseUI2;
                            lynxUI2.mContext.LLJILJILJ.getLatestWidth();
                            lynxUI2.mContext.LLJILJILJ.getLatestHeight();
                            final C1313230kHJ c1313230kHJLJIIL = C1313230kHJ.LJIIL((List) obj, lynxUI2.getLatestWidth(), lynxUI2.getLatestHeight());
                            if (c1313230kHJLJIIL != null) {
                                float translationX = lynxUI2.getTranslationX();
                                float translationY = lynxUI2.getTranslationY();
                                float translationZ = lynxUI2.mView.getTranslationZ();
                                float rotation = lynxUI2.mView.getRotation();
                                float rotationX = lynxUI2.mView.getRotationX();
                                float rotationY = lynxUI2.mView.getRotationY();
                                float scaleX = lynxUI2.mView.getScaleX();
                                float scaleY = lynxUI2.mView.getScaleY();
                                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0);
                                this.LJIIIIZZ.put(Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH), valueAnimatorOfInt);
                                valueAnimatorOfInt.setDuration(c1313370kHX.LLILLJJLI);
                                valueAnimatorOfInt.setInterpolator(C1313380kHY.LIZ(c1313370kHX));
                                valueAnimatorOfInt.setStartDelay(c1313370kHX.LLILLL);
                                valueAnimatorOfInt.addListener(new C1312110kFV(lynxUI2, i) { // from class: X.0kFK
                                    @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        super.onAnimationEnd(animator);
                                        C786410Ut5.Jc(lynxUI2.mView, c1313230kHJLJIIL.LJIIIZ());
                                        C786410Ut5.ed(lynxUI2.mView, c1313230kHJLJIIL.LJIIJ());
                                        lynxUI2.mView.setTranslationZ(c1313230kHJLJIIL.LJIIJJI());
                                        InterfaceC1313090kH5 interfaceC1313090kH5 = lynxUI2.mParent;
                                        if (interfaceC1313090kH5 instanceof UIShadowProxy) {
                                            ((UIShadowProxy) interfaceC1313090kH5).LJJIJ();
                                        }
                                        C786410Ut5.Ab(lynxUI2.mView, c1313230kHJLJIIL.LIZJ());
                                        C786410Ut5.Hb(lynxUI2.mView, c1313230kHJLJIIL.LIZLLL());
                                        C786410Ut5.Ib(lynxUI2.mView, c1313230kHJLJIIL.LJ());
                                        C786410Ut5.Ob(lynxUI2.mView, c1313230kHJLJIIL.LJFF());
                                        C786410Ut5.pc(lynxUI2.mView, c1313230kHJLJIIL.LJI());
                                        this.LLILZLL.LJII.remove(Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH));
                                    }
                                });
                                valueAnimatorOfInt.addUpdateListener(new AUListenerS0S0200008_20(translationX, c1313230kHJLJIIL, lynxUI2, translationY, translationZ, rotation, rotationX, rotationY, scaleX, scaleY, 0));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.LJFF) {
                        return;
                    }
                    InterfaceC1313090kH5 interfaceC1313090kH5 = lynxBaseUI2.mParent;
                    if (interfaceC1313090kH5 instanceof UIShadowProxy) {
                        lynxUI = (LynxUI) interfaceC1313090kH5;
                    } else {
                        lynxUI = (LynxUI) lynxBaseUI2;
                    }
                    int iIntValue = ((Integer) obj).intValue();
                    int visibility = lynxUI.mView.getVisibility();
                    if (iIntValue == 1) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    if (visibility == i2) {
                        return;
                    }
                    this.LJ = true;
                    final float alpha = lynxUI.mView.getAlpha();
                    float f2 = 0.0f;
                    if (visibility == 0) {
                        f = 0.0f;
                    } else {
                        if ((visibility == 4 || visibility == 8) && i2 == 0) {
                            C786410Ut5.T4(lynxUI.mView, 0.0f);
                        }
                        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f2), Float.valueOf(f));
                        valueAnimatorOfObject.setDuration(c1313370kHX.LLILLJJLI);
                        valueAnimatorOfObject.setInterpolator(C1313380kHY.LIZ(c1313370kHX));
                        valueAnimatorOfObject.setStartDelay(c1313370kHX.LLILLL);
                        valueAnimatorOfObject.addUpdateListener(new AUListenerS254S0100000_4(lynxUI, 8));
                        final LynxBaseUI lynxBaseUI3 = lynxBaseUI2;
                        final LynxUI lynxUI3 = lynxUI;
                        final int i3 = i2;
                        valueAnimatorOfObject.addListener(new C1312110kFV(lynxBaseUI3, i) { // from class: X.0kFP
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                super.onAnimationCancel(animator);
                                this.LLIZ.LJ = false;
                            }

                            @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                lynxUI3.setVisibilityForView(i3);
                                C786410Ut5.T4(lynxUI3.mView, alpha);
                                this.LLIZ.LJII.remove(128);
                            }

                            @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                super.onAnimationStart(animator);
                                C786410Ut5.LJLLLLLL(0, lynxUI3.mView);
                                this.LLIZ.LJ = false;
                            }
                        });
                        this.LJIIIIZZ.put(128, valueAnimatorOfObject);
                        return;
                    }
                    f2 = alpha;
                    ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f2), Float.valueOf(f));
                    valueAnimatorOfObject2.setDuration(c1313370kHX.LLILLJJLI);
                    valueAnimatorOfObject2.setInterpolator(C1313380kHY.LIZ(c1313370kHX));
                    valueAnimatorOfObject2.setStartDelay(c1313370kHX.LLILLL);
                    valueAnimatorOfObject2.addUpdateListener(new AUListenerS254S0100000_4(lynxUI, 8));
                    final LynxBaseUI lynxBaseUI32 = lynxBaseUI2;
                    final LynxUI lynxUI32 = lynxUI;
                    final int i32 = i2;
                    valueAnimatorOfObject2.addListener(new C1312110kFV(lynxBaseUI32, i) { // from class: X.0kFP
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            super.onAnimationCancel(animator);
                            this.LLIZ.LJ = false;
                        }

                        @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            lynxUI32.setVisibilityForView(i32);
                            C786410Ut5.T4(lynxUI32.mView, alpha);
                            this.LLIZ.LJII.remove(128);
                        }

                        @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            C786410Ut5.LJLLLLLL(0, lynxUI32.mView);
                            this.LLIZ.LJ = false;
                        }
                    });
                    this.LJIIIIZZ.put(128, valueAnimatorOfObject2);
                    return;
                }
                final int iIntValue2 = ((Integer) obj).intValue();
                ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(lynxBaseUI2.mLynxBackground.LJ), Integer.valueOf(iIntValue2));
                this.LJIIIIZZ.put(64, valueAnimatorOfObject3);
                valueAnimatorOfObject3.setDuration(Math.round(c1313370kHX.LLILLJJLI));
                valueAnimatorOfObject3.setInterpolator(C1313380kHY.LIZ(c1313370kHX));
                valueAnimatorOfObject3.setStartDelay(c1313370kHX.LLILLL);
                final LynxBaseUI lynxBaseUI4 = lynxBaseUI2;
                final LynxBaseUI lynxBaseUI5 = lynxBaseUI2;
                valueAnimatorOfObject3.addListener(new C1312110kFV(lynxBaseUI4, i) { // from class: X.0kFN
                    @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        lynxBaseUI5.mLynxBackground.LJIILIIL(iIntValue2);
                        lynxBaseUI5.invalidate();
                        this.LLILZLL.LJII.remove(64);
                    }
                });
                valueAnimatorOfObject3.addUpdateListener(new AUListenerS269S0100000_20(lynxBaseUI2, 10));
                return;
            }
            if (this.LJ) {
                return;
            }
            final float fMin = Math.min(((Float) obj).floatValue(), 1.0f);
            final LynxUI lynxUI4 = (LynxUI) lynxBaseUI2;
            ValueAnimator valueAnimatorOfObject4 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(lynxUI4.mView.getAlpha()), Float.valueOf(fMin));
            this.LJIIIIZZ.put(1, valueAnimatorOfObject4);
            valueAnimatorOfObject4.setDuration(c1313370kHX.LLILLJJLI);
            valueAnimatorOfObject4.setInterpolator(C1313380kHY.LIZ(c1313370kHX));
            valueAnimatorOfObject4.setStartDelay(c1313370kHX.LLILLL);
            valueAnimatorOfObject4.addListener(new C1312110kFV(lynxUI4, i) { // from class: X.0kFL
                @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C786410Ut5.T4(lynxUI4.mView, fMin);
                    InterfaceC1313090kH5 interfaceC1313090kH52 = lynxUI4.mParent;
                    if (interfaceC1313090kH52 instanceof UIShadowProxy) {
                        ((UIShadowProxy) interfaceC1313090kH52).LJJIJ();
                    }
                    this.LLILZLL.LJII.remove(1);
                }
            });
            valueAnimatorOfObject4.addUpdateListener(new AUListenerS269S0100000_20(lynxUI4, 11));
            this.LJFF = true;
        }
    }

    public final ValueAnimator LIZLLL(final int i, final LynxBaseUI lynxBaseUI, int i2, int i3, C1313370kHX c1313370kHX, final boolean z) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(c1313370kHX.LLILLJJLI);
        valueAnimatorOfInt.setInterpolator(C1313380kHY.LIZ(c1313370kHX));
        valueAnimatorOfInt.setStartDelay(c1313370kHX.LLILLL);
        valueAnimatorOfInt.addListener(new C1312110kFV(lynxBaseUI, i, this, z) { // from class: X.0kFM
            public final WeakReference<C1312040kFO> LLILZ;
            public final boolean LLILZIL;

            /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
            @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
                    java.lang.ref.WeakReference<X.0kFO> r0 = r3.LLILZ
                    java.lang.Object r2 = r0.get()
                    X.0kFO r2 = (X.C1312040kFO) r2
                    java.lang.ref.WeakReference<com.lynx.tasm.behavior.ui.LynxBaseUI> r0 = r3.LL
                    java.lang.Object r14 = r0.get()
                    com.lynx.tasm.behavior.ui.LynxBaseUI r14 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r14
                    if (r14 == 0) goto L95
                    if (r2 == 0) goto L95
                    java.util.HashMap<java.lang.Integer, android.animation.Animator> r1 = r2.LJII
                    int r0 = r3.LLILLJJLI
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r1.remove(r0)
                    int r13 = r14.getOriginLeft()
                    int r12 = r14.getOriginTop()
                    int r11 = r14.getWidth()
                    int r10 = r14.getHeight()
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
                    int r0 = r14.mPaddingLeft
                    r16 = r0
                    int r15 = r14.mPaddingTop
                    int r9 = r14.mPaddingRight
                    int r8 = r14.mPaddingBottom
                    int r7 = r14.mMarginLeft
                    int r6 = r14.mMarginTop
                    int r5 = r14.mMarginRight
                    int r4 = r14.mMarginBottom
                    int r3 = r14.mBorderLeftWidth
                    int r2 = r14.mBorderTopWidth
                    int r1 = r14.mBorderRightWidth
                    int r0 = r14.mBorderBottomWidth
                    android.graphics.Rect r31 = r14.getBound()
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
                    r14.updateLayout(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
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
                throw new UnsupportedOperationException("Method not decompiled: X.C1312020kFM.onAnimationEnd(android.animation.Animator):void");
            }

            @Override // X.C1312110kFV, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(lynxBaseUI, 6));
                    return valueAnimatorOfInt;
                }
                valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(lynxBaseUI, 9));
                return valueAnimatorOfInt;
            }
            valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(lynxBaseUI, 8));
            return valueAnimatorOfInt;
        }
        valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(lynxBaseUI, 7));
        return valueAnimatorOfInt;
    }
}
