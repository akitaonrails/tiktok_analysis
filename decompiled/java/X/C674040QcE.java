package X;

import Y.AAListenerS135S0300000_10;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674040QcE {
    public final C674050QcF LIZ;
    public EnumC674020QcC LIZIZ;
    public final NextLiveData<Boolean> LIZJ;
    public final Map<EnumC674020QcC, Set<EnumC674020QcC>> LIZLLL;

    public final boolean LIZIZ() {
        return this.LIZIZ.isAIMode();
    }

    public final void LIZJ() {
        if (this.LIZIZ.isVoiceFlow()) {
            LIZ(this.LIZIZ, EnumC674020QcC.AI_SEARCH);
        }
    }

    public C674040QcE(C674050QcF c674050QcF) {
        this.LIZ = c674050QcF;
        EnumC674020QcC enumC674020QcC = EnumC674020QcC.NORMAL_SEARCH;
        this.LIZIZ = enumC674020QcC;
        this.LIZJ = new NextLiveData<>();
        EnumC674020QcC enumC674020QcC2 = EnumC674020QcC.AI_SEARCH;
        EnumC674020QcC enumC674020QcC3 = EnumC674020QcC.AI_SEARCH_RECORDING;
        EnumC674020QcC enumC674020QcC4 = EnumC674020QcC.AI_SEARCH_TRANSCRIBING;
        this.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(enumC674020QcC, Collections.singleton(enumC674020QcC2)), new Pair(enumC674020QcC2, C13LQ.LJLIIL(new EnumC674020QcC[]{enumC674020QcC, enumC674020QcC3})), new Pair(enumC674020QcC3, C13LQ.LJLIIL(new EnumC674020QcC[]{enumC674020QcC, enumC674020QcC2, enumC674020QcC4})), new Pair(enumC674020QcC4, C13LQ.LJLIIL(new EnumC674020QcC[]{enumC674020QcC, enumC674020QcC2})));
    }

    public final void LIZLLL(EnumC671670QWf enumC671670QWf) {
        int i = C671730QWl.LIZ[enumC671670QWf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZ(this.LIZIZ, EnumC674020QcC.AI_SEARCH);
                return;
            }
            throw new C1954807lC();
        }
        LIZ(this.LIZIZ, EnumC674020QcC.NORMAL_SEARCH);
    }

    public final void LJ(List<Float> list) {
        C674050QcF c674050QcF = this.LIZ;
        c674050QcF.getClass();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            ChoreographerFrameCallbackC674130QcN choreographerFrameCallbackC674130QcN = c674050QcF.LJI;
            if (choreographerFrameCallbackC674130QcN != null) {
                synchronized (choreographerFrameCallbackC674130QcN) {
                    try {
                        ((ArrayList) choreographerFrameCallbackC674130QcN.LLILZ).add(Float.valueOf(choreographerFrameCallbackC674130QcN.LIZ(fFloatValue)));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    public final boolean LIZ(final EnumC674020QcC enumC674020QcC, final EnumC674020QcC enumC674020QcC2) {
        C00XR c00xr;
        C674100QcK c674100QcK;
        boolean z;
        Editable editableLLJILLL;
        String string;
        boolean zLJFF = false;
        if (enumC674020QcC != enumC674020QcC2) {
            Set<EnumC674020QcC> set = this.LIZLLL.get(enumC674020QcC);
            if (set == null) {
                set = C08CX.INSTANCE;
            }
            if (set.contains(enumC674020QcC2)) {
                this.LIZIZ = enumC674020QcC2;
                this.LIZJ.setValue(Boolean.valueOf(enumC674020QcC2.isAIMode()));
                final C674050QcF c674050QcF = this.LIZ;
                c674050QcF.getClass();
                if (enumC674020QcC2 == EnumC674020QcC.AI_SEARCH_RECORDING) {
                    EditText editText = c674050QcF.LIZJ;
                    if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijKIZNm5mQOvQEGTUYuvURDZc/E+8YtXxi99Hb6rE/ts0", null))) != null && (string = editableLLJILLL.toString()) != null && string.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c00xr = new C00XR(Boolean.valueOf(z));
                } else {
                    c00xr = null;
                }
                c674050QcF.LJII.getClass();
                final C674070QcH c674070QcHLIZLLL = C674060QcG.LIZLLL(enumC674020QcC, c00xr);
                c674050QcF.LJII.getClass();
                int i = C674030QcD.LIZ[enumC674020QcC2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                Boolean bool = Boolean.FALSE;
                                Boolean bool2 = Boolean.TRUE;
                                c674100QcK = new C674100QcK(new C674090QcJ((Boolean) null, bool, bool2, (Boolean) null, bool2, (Boolean) null, 89), C674060QcG.LJ().LJ);
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            if (c00xr != null) {
                                zLJFF = Intrinsics.LJFF(c00xr.LIZ, Boolean.TRUE);
                            }
                            c674100QcK = new C674100QcK(new C674090QcJ((Boolean) null, Boolean.valueOf(!zLJFF), Boolean.valueOf(zLJFF), (Boolean) null, (Boolean) null, Boolean.TRUE, 57), C674060QcG.LIZJ(null).LJ);
                        }
                    } else {
                        Boolean bool3 = Boolean.TRUE;
                        c674100QcK = new C674100QcK(new C674090QcJ((Boolean) null, bool3, (Boolean) null, bool3, bool3, (Boolean) null, 85), C674060QcG.LIZ().LJ);
                    }
                } else {
                    Boolean bool4 = Boolean.TRUE;
                    Boolean bool5 = Boolean.FALSE;
                    c674100QcK = new C674100QcK(new C674090QcJ(bool4, (Boolean) null, (Boolean) null, bool5, (Boolean) null, bool5, 54), C674060QcG.LIZIZ().LJ);
                }
                c674050QcF.LJII.getClass();
                final C674070QcH c674070QcHLIZLLL2 = C674060QcG.LIZLLL(enumC674020QcC2, c00xr);
                ValueAnimator valueAnimator = c674050QcF.LJIIJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(300L);
                final C674100QcK c674100QcK2 = c674100QcK;
                valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0QcM
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C418060GaK c418060GaK;
                        c674050QcF.LJIIIIZZ.LIZJ(c674070QcHLIZLLL);
                        C674110QcL c674110QcL = c674050QcF.LJIIIIZZ;
                        C674100QcK c674100QcK3 = c674100QcK2;
                        c674110QcL.getClass();
                        c674110QcL.LJ(c674100QcK3.LIZ);
                        c674110QcL.LIZLLL(c674100QcK3.LIZIZ);
                        C674150QcP c674150QcP = c674050QcF.LJIIIZ;
                        EnumC674020QcC enumC674020QcC3 = enumC674020QcC;
                        EnumC674020QcC enumC674020QcC4 = enumC674020QcC2;
                        c674150QcP.getClass();
                        int[] iArr = C674190QcT.LIZ;
                        int i2 = iArr[enumC674020QcC4.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 == 4) {
                                        C427110Gov c427110Gov = c674150QcP.LJFF;
                                        if (c427110Gov != null) {
                                            c427110Gov.setMode(EnumC429000Gry.TEXT);
                                        }
                                        C418060GaK c418060GaK2 = c674150QcP.LIZ;
                                        if (c418060GaK2 != null) {
                                            ValueAnimator valueAnimator2 = c418060GaK2.LL;
                                            if (valueAnimator2 != null) {
                                                valueAnimator2.cancel();
                                            }
                                            c418060GaK2.LL = null;
                                        }
                                        ChoreographerFrameCallbackC674130QcN choreographerFrameCallbackC674130QcN = c674150QcP.LJ;
                                        if (choreographerFrameCallbackC674130QcN != null) {
                                            choreographerFrameCallbackC674130QcN.LLILZLL = false;
                                            choreographerFrameCallbackC674130QcN.LLIZ.removeFrameCallback(choreographerFrameCallbackC674130QcN);
                                        }
                                        ObjectAnimator objectAnimator = (ObjectAnimator) c674150QcP.LJI.getValue();
                                        if (objectAnimator != null) {
                                            C786410Ut5.Pd(objectAnimator);
                                        }
                                        EditText editText2 = c674150QcP.LIZLLL;
                                        if (editText2 != null) {
                                            editText2.clearFocus();
                                            editText2.setCursorVisible(false);
                                            KeyboardUtils.LIZIZ(editText2);
                                            return;
                                        }
                                        return;
                                    }
                                    throw new C1954807lC();
                                }
                                C427110Gov c427110Gov2 = c674150QcP.LJFF;
                                if (c427110Gov2 != null) {
                                    c427110Gov2.setMode(EnumC429000Gry.TEXT);
                                }
                                ChoreographerFrameCallbackC674130QcN choreographerFrameCallbackC674130QcN2 = c674150QcP.LJ;
                                if (choreographerFrameCallbackC674130QcN2 != null) {
                                    choreographerFrameCallbackC674130QcN2.LLILZLL = false;
                                    choreographerFrameCallbackC674130QcN2.LLIZ.removeFrameCallback(choreographerFrameCallbackC674130QcN2);
                                }
                                ValueAnimator valueAnimator3 = (ValueAnimator) c674150QcP.LJI.getValue();
                                if (valueAnimator3 != null) {
                                    valueAnimator3.cancel();
                                }
                                int i3 = iArr[enumC674020QcC3.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2 || (c418060GaK = c674150QcP.LIZ) == null) {
                                        return;
                                    }
                                    ValueAnimator valueAnimator4 = c418060GaK.LL;
                                    if (valueAnimator4 != null) {
                                        valueAnimator4.cancel();
                                    }
                                    c418060GaK.LL = null;
                                    return;
                                }
                                C418060GaK c418060GaK3 = c674150QcP.LIZ;
                                if (c418060GaK3 == null) {
                                    return;
                                }
                                c418060GaK3.LIZ(EnumC429380Gsa.ONCE);
                                return;
                            }
                            C427110Gov c427110Gov3 = c674150QcP.LJFF;
                            if (c427110Gov3 != null) {
                                c427110Gov3.setMode(EnumC429000Gry.STOP);
                            }
                            C418060GaK c418060GaK4 = c674150QcP.LIZ;
                            if (c418060GaK4 != null) {
                                c418060GaK4.LIZ(EnumC429380Gsa.LOOP);
                            }
                            ChoreographerFrameCallbackC674130QcN choreographerFrameCallbackC674130QcN3 = c674150QcP.LJ;
                            if (choreographerFrameCallbackC674130QcN3 != null) {
                                synchronized (choreographerFrameCallbackC674130QcN3) {
                                    try {
                                        choreographerFrameCallbackC674130QcN3.LLJI = -1L;
                                        choreographerFrameCallbackC674130QcN3.LLJIJIL = 0.0f;
                                        ((ArrayList) choreographerFrameCallbackC674130QcN3.LLILZ).clear();
                                        ((ArrayList) choreographerFrameCallbackC674130QcN3.LLILZIL).clear();
                                        int iLIZIZ = (int) (C497820Jfg.LIZIZ(choreographerFrameCallbackC674130QcN3.getContext()) / ChoreographerFrameCallbackC674130QcN.LLJILJIL);
                                        for (int i4 = 0; i4 < iLIZIZ; i4++) {
                                            ((ArrayList) choreographerFrameCallbackC674130QcN3.LLILZIL).add(Float.valueOf(-1.0f));
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                choreographerFrameCallbackC674130QcN3.LLILZLL = true;
                                choreographerFrameCallbackC674130QcN3.LLIZLLLIL = System.nanoTime();
                                choreographerFrameCallbackC674130QcN3.LLIZ.removeFrameCallback(choreographerFrameCallbackC674130QcN3);
                                choreographerFrameCallbackC674130QcN3.LLIZ.postFrameCallback(choreographerFrameCallbackC674130QcN3);
                            }
                            ValueAnimator valueAnimator5 = (ValueAnimator) c674150QcP.LJI.getValue();
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                            }
                            EditText editText3 = c674150QcP.LIZLLL;
                            if (editText3 == null) {
                                return;
                            }
                            editText3.clearFocus();
                            editText3.setCursorVisible(false);
                            KeyboardUtils.LIZIZ(editText3);
                            return;
                        }
                        C427110Gov c427110Gov4 = c674150QcP.LJFF;
                        if (c427110Gov4 != null) {
                            c427110Gov4.setMode(EnumC429000Gry.TEXT);
                        }
                        C418060GaK c418060GaK5 = c674150QcP.LIZ;
                        if (c418060GaK5 != null) {
                            ValueAnimator valueAnimator6 = c418060GaK5.LL;
                            if (valueAnimator6 != null) {
                                valueAnimator6.cancel();
                            }
                            c418060GaK5.LL = null;
                        }
                        ChoreographerFrameCallbackC674130QcN choreographerFrameCallbackC674130QcN4 = c674150QcP.LJ;
                        if (choreographerFrameCallbackC674130QcN4 != null) {
                            choreographerFrameCallbackC674130QcN4.LLILZLL = false;
                            choreographerFrameCallbackC674130QcN4.LLIZ.removeFrameCallback(choreographerFrameCallbackC674130QcN4);
                        }
                        ValueAnimator valueAnimator7 = (ValueAnimator) c674150QcP.LJI.getValue();
                        if (valueAnimator7 == null) {
                            return;
                        }
                        valueAnimator7.cancel();
                    }
                });
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0QcO
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Float f;
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                            C674050QcF c674050QcF2 = c674050QcF;
                            C674070QcH c674070QcH = c674070QcHLIZLLL;
                            C674070QcH c674070QcH2 = c674070QcHLIZLLL2;
                            float fFloatValue = f.floatValue();
                            C674110QcL c674110QcL = c674050QcF2.LJIIIIZZ;
                            c674110QcL.getClass();
                            int iLIZIZ = C814420VxA.LIZIZ(c674070QcH.LIZ.LIZ + ((c674070QcH2.LIZ.LIZ - r4) * fFloatValue));
                            C674180QcS c674180QcS = c674070QcH.LIZ;
                            float f2 = c674180QcS.LIZIZ;
                            C674180QcS c674180QcS2 = c674070QcH2.LIZ;
                            float f3 = f2 + ((c674180QcS2.LIZIZ - f2) * fFloatValue);
                            float f4 = c674180QcS.LIZJ;
                            float f5 = f4 + ((c674180QcS2.LIZJ - f4) * fFloatValue);
                            float f6 = c674180QcS.LIZLLL;
                            c674110QcL.LIZIZ(new C674180QcS(f3, f5, f6 + ((c674180QcS2.LIZLLL - f6) * fFloatValue), iLIZIZ, C814420VxA.LIZIZ(c674180QcS.LJ + ((c674180QcS2.LJ - r4) * fFloatValue)), C814420VxA.LIZIZ(c674070QcH.LIZ.LJFF + ((c674070QcH2.LIZ.LJFF - r4) * fFloatValue))));
                            C674160QcQ c674160QcQ = c674070QcH.LIZIZ;
                            float f7 = c674160QcQ.LIZ;
                            C674160QcQ c674160QcQ2 = c674070QcH2.LIZIZ;
                            float f8 = f7 + ((c674160QcQ2.LIZ - f7) * fFloatValue);
                            float f9 = c674160QcQ.LIZIZ;
                            float f10 = f9 + ((c674160QcQ2.LIZIZ - f9) * fFloatValue);
                            float f11 = c674160QcQ.LIZJ;
                            float f12 = f11 + ((c674160QcQ2.LIZJ - f11) * fFloatValue);
                            float f13 = c674160QcQ.LIZLLL;
                            float f14 = f13 + ((c674160QcQ2.LIZLLL - f13) * fFloatValue);
                            float f15 = c674160QcQ.LJ;
                            float f16 = f15 + ((c674160QcQ2.LJ - f15) * fFloatValue);
                            float f18 = c674160QcQ.LJFF;
                            float f19 = f18 + ((c674160QcQ2.LJFF - f18) * fFloatValue);
                            float f20 = c674160QcQ.LJI;
                            float f21 = f20 + ((c674160QcQ2.LJI - f20) * fFloatValue);
                            float f22 = c674160QcQ.LJII;
                            float f23 = f22 + ((c674160QcQ2.LJII - f22) * fFloatValue);
                            float f24 = c674160QcQ.LJIIIIZZ;
                            float f25 = f24 + ((c674160QcQ2.LJIIIIZZ - f24) * fFloatValue);
                            float f26 = c674160QcQ.LJIIIZ;
                            c674110QcL.LIZ(new C674160QcQ(f8, f10, f12, f14, f16, f19, f21, f23, f25, f26 + ((c674160QcQ2.LJIIIZ - f26) * fFloatValue)));
                        }
                    }
                });
                valueAnimatorOfFloat.addListener(new AAListenerS135S0300000_10(c674050QcF, c674070QcHLIZLLL2, enumC674020QcC2, 1));
                valueAnimatorOfFloat.addListener(new AAListenerS135S0300000_10(c674050QcF, c674070QcHLIZLLL2, enumC674020QcC2, 0));
                valueAnimatorOfFloat.start();
                c674050QcF.LJIIJ = valueAnimatorOfFloat;
                return true;
            }
        }
        return false;
    }
}
