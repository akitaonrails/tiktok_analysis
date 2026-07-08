package X;

import Y.AUListenerS263S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Z9A, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z9A {
    public static void LIZIZ(final C0Z9B c0z9b, final InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        ViewGroup wrapper;
        ViewGroup wrapper2;
        C0HZQ c0hzqB;
        C0HZQ c0hzqB2;
        float fLIZIZ;
        boolean zIsInMultiSelectMode = interfaceC887660Ys0.isInMultiSelectMode();
        if (zIsInMultiSelectMode && (c0hzqB2 = c0z9b.b()) != null) {
            if (C426750GoL.LIZLLL(C1383370m6R.LIZ)) {
                fLIZIZ = C418440Gaw.LIZIZ(40);
            } else {
                fLIZIZ = -C418440Gaw.LIZIZ(40);
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hzqB2);
            c0hzqB2.setTranslationX(fLIZIZ);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (interfaceC887660Ys0.getEnableSelect() && (c0hzqB = c0z9b.b()) != null) {
            animatorSet.playTogether(C0H61.CHECKBOX_TRANSLATION.createAnimator$awemenotice_api_release(c0hzqB, interfaceC887660Ys0.isInMultiSelectMode(), null));
        }
        boolean zIsInMultiSelectMode2 = interfaceC887660Ys0.isInMultiSelectMode();
        List<View> listLLLLJI = c0z9b.LLLLJI();
        if (listLLLLJI != null) {
            Iterator<View> it2 = listLLLLJI.iterator();
            while (it2.hasNext()) {
                ObjectAnimator objectAnimatorCreateAnimator$awemenotice_api_release = C0H61.NORMAL_TRANSLATION.createAnimator$awemenotice_api_release(it2.next(), zIsInMultiSelectMode2, null);
                objectAnimatorCreateAnimator$awemenotice_api_release.addUpdateListener(new AUListenerS263S0100000_14(c0z9b, 19));
                animatorSet.playTogether(objectAnimatorCreateAnimator$awemenotice_api_release);
            }
        }
        List<Animator> listD5 = c0z9b.D5(zIsInMultiSelectMode2);
        if (listD5 != null) {
            Iterator<Animator> it3 = listD5.iterator();
            while (it3.hasNext()) {
                animatorSet.playTogether(it3.next());
            }
        }
        List<View> listM = c0z9b.M();
        if (listM != null) {
            for (View view : listM) {
                animatorSet.playTogether(C0H61.NORMAL_TRANSLATION.createAnimator$awemenotice_api_release(view, interfaceC887660Ys0.isInMultiSelectMode(), null));
                animatorSet.playTogether(C0H61.HIDE.createAnimator$awemenotice_api_release(view, interfaceC887660Ys0.isInMultiSelectMode(), null));
            }
        }
        if (!interfaceC887660Ys0.getEnableSelect()) {
            Animator[] animatorArr = new Animator[1];
            C0Z9D c0z9dG3 = c0z9b.g3();
            if (c0z9dG3 != null) {
                wrapper2 = c0z9dG3.getWrapper();
            } else {
                wrapper2 = null;
            }
            animatorArr[0] = C0H61.GRADIENT.createAnimator$awemenotice_api_release(wrapper2, interfaceC887660Ys0.isInMultiSelectMode(), null);
            animatorSet.playTogether(animatorArr);
        } else {
            C0Z9D c0z9dG32 = c0z9b.g3();
            if (c0z9dG32 != null && (wrapper = c0z9dG32.getWrapper()) != null) {
                C786410Ut5.R4(1.0f, wrapper);
            }
        }
        final boolean zIsInMultiSelectMode3 = interfaceC887660Ys0.isInMultiSelectMode();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0Z9C
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (zIsInMultiSelectMode3) {
                    c0z9b.LLIIII(null);
                } else {
                    c0z9b.LLILII(null);
                }
                c0z9b.LJLL(interfaceC887660Ys0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (zIsInMultiSelectMode3) {
                    c0z9b.LLIIII(null);
                } else {
                    C0HZQ c0hzqB3 = c0z9b.b();
                    if (c0hzqB3 != null) {
                        C786410Ut5.LLLLLZ(c0hzqB3, 8);
                    }
                    c0z9b.LLILII(null);
                }
                c0z9b.LJLL(interfaceC887660Ys0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C0HZQ c0hzqB3;
                if (zIsInMultiSelectMode3 && (c0hzqB3 = c0z9b.b()) != null) {
                    C786410Ut5.LLLLLZ(c0hzqB3, 0);
                }
                c0z9b.C1(interfaceC887660Ys0);
            }
        });
        if (zIsInMultiSelectMode) {
            c0z9b.LLIIII(animatorSet);
        } else {
            c0z9b.LLILII(animatorSet);
        }
        animatorSet.start();
    }

    public static void LIZJ(C0Z9B c0z9b, InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Function1<InterfaceC887660Ys0<?>, Unit> onSelect;
        boolean z;
        boolean z2;
        boolean z3;
        Boolean boolValueOf5;
        boolean z4;
        ViewGroup wrapper;
        ViewGroup wrapper2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateViewByRuleData, vh: ");
        sbLIZ.append(c0z9b.getClass().getSimpleName());
        sbLIZ.append('/');
        sbLIZ.append(System.identityHashCode(c0z9b));
        sbLIZ.append(", data: isInMultiSelectMode=");
        if (interfaceC887660Ys0 != null) {
            boolValueOf = Boolean.valueOf(interfaceC887660Ys0.isInMultiSelectMode());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", isSwitchingMode=");
        if (interfaceC887660Ys0 != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC887660Ys0.isSwitchingMode());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(", enableSelect=");
        if (interfaceC887660Ys0 != null) {
            boolValueOf3 = Boolean.valueOf(interfaceC887660Ys0.getEnableSelect());
        } else {
            boolValueOf3 = null;
        }
        sbLIZ.append(boolValueOf3);
        sbLIZ.append(", isSelected=");
        if (interfaceC887660Ys0 != null) {
            boolValueOf4 = Boolean.valueOf(interfaceC887660Ys0.isSelected());
        } else {
            boolValueOf4 = null;
        }
        sbLIZ.append(boolValueOf4);
        sbLIZ.append(", has onSelect=");
        if (interfaceC887660Ys0 != null) {
            onSelect = interfaceC887660Ys0.getOnSelect();
        } else {
            onSelect = null;
        }
        if (onSelect != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append("; UI: isPlayingAnimationForEnter=");
        if (c0z9b.l0() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", isPlayingAnimationForExit:=");
        if (c0z9b.v3() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        sbLIZ.append(", isMultiSelectMode=");
        C0Z9D c0z9dG3 = c0z9b.g3();
        if (c0z9dG3 != null) {
            boolValueOf5 = Boolean.valueOf(c0z9dG3.LLLIIL());
        } else {
            boolValueOf5 = null;
        }
        sbLIZ.append(boolValueOf5);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC887660Ys0 != null && interfaceC887660Ys0.isInMultiSelectMode()) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f = 1.0f;
        if (z4) {
            AnimatorSet animatorSetV3 = c0z9b.v3();
            if (animatorSetV3 != null) {
                animatorSetV3.cancel();
            }
            c0z9b.LLILII(null);
            if (c0z9b.l0() == null) {
                if (interfaceC887660Ys0.isSwitchingMode() && interfaceC887660Ys0.getDisplayInMultiSelectMode()) {
                    LIZIZ(c0z9b, interfaceC887660Ys0);
                } else {
                    C0HZQ c0hzqB = c0z9b.b();
                    if (c0hzqB != null) {
                        C786410Ut5.LLLLLZ(c0hzqB, 0);
                    }
                    C0HZQ c0hzqB2 = c0z9b.b();
                    if (c0hzqB2 != null) {
                        float fLIZIZ = C418440Gaw.LIZIZ(0);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hzqB2);
                        c0hzqB2.setTranslationX(fLIZIZ);
                    }
                    C0Z9D c0z9dG32 = c0z9b.g3();
                    if (c0z9dG32 != null && (wrapper2 = c0z9dG32.getWrapper()) != null) {
                        if (!interfaceC887660Ys0.getEnableSelect()) {
                            f = 0.5f;
                        }
                        C786410Ut5.R4(f, wrapper2);
                    }
                    List<View> listLLLLJI = c0z9b.LLLLJI();
                    if (listLLLLJI != null) {
                        LIZ(c0z9b, listLLLLJI, C418440Gaw.LIZIZ(40));
                    }
                    List<View> listM = c0z9b.M();
                    if (listM != null) {
                        LIZ(c0z9b, listM, C418440Gaw.LIZIZ(40));
                    }
                    List<View> listM2 = c0z9b.M();
                    if (listM2 != null) {
                        for (View view : listM2) {
                            if (view != null) {
                                C786410Ut5.T4(view, 0.0f);
                            }
                        }
                    }
                }
            }
            C0HZQ c0hzqB3 = c0z9b.b();
            if (c0hzqB3 != null) {
                c0hzqB3.setChecked(interfaceC887660Ys0.isSelected());
            }
            C0Z9D c0z9dG33 = c0z9b.g3();
            if (c0z9dG33 != null) {
                c0z9dG33.setMultiSelectMode(true);
                return;
            }
            return;
        }
        AnimatorSet animatorSetL0 = c0z9b.l0();
        if (animatorSetL0 != null) {
            animatorSetL0.cancel();
        }
        c0z9b.LLIIII(null);
        C0Z9D c0z9dG34 = c0z9b.g3();
        if (c0z9dG34 != null && !c0z9dG34.LLLIIL() && (interfaceC887660Ys0 == null || !interfaceC887660Ys0.isSwitchingMode())) {
            return;
        }
        if (c0z9b.v3() == null) {
            if (interfaceC887660Ys0 != null && interfaceC887660Ys0.isSwitchingMode()) {
                LIZIZ(c0z9b, interfaceC887660Ys0);
            } else {
                C0Z9D c0z9dG35 = c0z9b.g3();
                if (c0z9dG35 == null || c0z9dG35.LLLIIL()) {
                    C0HZQ c0hzqB4 = c0z9b.b();
                    if (c0hzqB4 != null) {
                        C786410Ut5.LLLLLZ(c0hzqB4, 8);
                    }
                    C0Z9D c0z9dG36 = c0z9b.g3();
                    if (c0z9dG36 != null && (wrapper = c0z9dG36.getWrapper()) != null) {
                        C786410Ut5.R4(1.0f, wrapper);
                    }
                    List<View> listLLLLJI2 = c0z9b.LLLLJI();
                    if (listLLLLJI2 != null) {
                        LIZ(c0z9b, listLLLLJI2, 0.0f);
                    }
                    List<View> listM3 = c0z9b.M();
                    if (listM3 != null) {
                        for (View view2 : listM3) {
                            if (view2 != null) {
                                C786410Ut5.T4(view2, 1.0f);
                            }
                        }
                    }
                    List<View> listM4 = c0z9b.M();
                    if (listM4 != null) {
                        LIZ(c0z9b, listM4, 0.0f);
                    }
                }
            }
        }
        C0HZQ c0hzqB5 = c0z9b.b();
        if (c0hzqB5 != null) {
            c0hzqB5.setChecked(false);
        }
        C0Z9D c0z9dG37 = c0z9b.g3();
        if (c0z9dG37 == null) {
            return;
        }
        c0z9dG37.setMultiSelectMode(false);
    }

    public static void LIZ(C0Z9B c0z9b, List<? extends View> list, float f) {
        float translationX;
        for (View view : list) {
            if (C426750GoL.LIZLLL(C1383370m6R.LIZ)) {
                if (view != null) {
                    C786410Ut5.Jc(view, -f);
                    translationX = view.getTranslationX();
                }
                translationX = 0.0f;
            } else {
                if (view != null) {
                    C786410Ut5.Jc(view, f);
                    translationX = view.getTranslationX();
                }
                translationX = 0.0f;
            }
            c0z9b.LLLLZI(translationX);
        }
    }
}
