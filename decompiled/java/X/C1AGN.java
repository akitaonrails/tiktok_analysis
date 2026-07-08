package X;

import Y.ARunnableS119S0100000_19;
import Y.AfS119S0300000_33;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.NormalAnimationValue;
import com.bytedance.android.livesdk.livesetting.linkmic.PathAnimationValue;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS277S0300000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AGN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AGN {
    public ViewGroup LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final String LIZLLL;
    public final InterfaceC1631620sYq<String, Integer, String, Unit> LJ;
    public C1085630eMD<C1295960jpS> LJFF;
    public C1AGA LJI;
    public C1295960jpS LJII;
    public final Map<String, C1294720jnS> LJIIIIZZ = new LinkedHashMap();
    public InterfaceC420801kM LJIIIZ;

    public static Pair LJFF(String str) {
        int iIntValue;
        int iIntValue2 = 0;
        if (str == null) {
            return new Pair(0, 0);
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 2) {
            return new Pair(0, 0);
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
        if (numLJIIJJI2 != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        }
        return new Pair(numValueOf, Integer.valueOf(iIntValue2));
    }

    public final void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskPointExpressionHelper_");
        sbLIZ.append(this.LIZLLL);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public final void LJ(C1AGA c1aga) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnimationFinish, animationTask = ");
        sbLIZ.append(c1aga);
        LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL("clearShowingAnimationView");
        C1295960jpS c1295960jpS = this.LJII;
        if (c1295960jpS != null) {
            c1295960jpS.clearAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LJII;
        if (c1295960jpS2 != null) {
            C500260Jjc.LJJJLL(c1295960jpS2);
        }
        C1295960jpS c1295960jpS3 = this.LJII;
        if (c1295960jpS3 != null) {
            C500260Jjc.LJLJLJ(c1295960jpS3, false);
        }
        this.LJII = null;
        this.LJ.invoke(c1aga.LIZJ, c1aga.LIZIZ, c1aga.LIZLLL);
        C1AGA c1aga2 = this.LJI;
        if (c1aga2 != null && Intrinsics.LJFF(c1aga, c1aga2)) {
            LIZLLL("onAnimationFinish not extra animation");
            this.LJI = null;
        } else {
            C1AGA c1aga3 = this.LJI;
            if (c1aga3 != null) {
                LIZIZ(c1aga3, "onAnimationFinish");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.01kM] */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, X.01kM] */
    public final boolean LIZIZ(final C1AGA c1aga, String str) {
        Long lValueOf;
        Integer num;
        Integer num2;
        float fFloatValue;
        float fFloatValue2;
        final Pair pair;
        AbstractC19484711Kz abstractC19484711KzLJJIJIIJI;
        LinkMicTicketIconUrlSetting.AnimationValue animationInfo = LinkMicTicketIconUrlSetting.INSTANCE.getAnimationInfo(c1aga.LIZ);
        if (animationInfo == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleAnimation, animationTask = ");
        sbLIZ.append(c1aga);
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        String str2 = animationInfo.type;
        Long lValueOf2 = null;
        if (Intrinsics.LJFF(str2, "path")) {
            final PathAnimationValue pathAnimationValue = animationInfo.pathValue;
            if (pathAnimationValue == null) {
                return false;
            }
            Float f = pathAnimationValue.endFlyProgress;
            final float fFloatValue3 = 1.0f;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            Float f2 = pathAnimationValue.startFlyProgress;
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            if (fFloatValue < fFloatValue2) {
                abstractC19484711KzLJJIJIIJI = AbstractC19484711Kz.LJIJJLI(Boolean.TRUE);
            } else {
                Pair pair2 = new Pair(Integer.valueOf(this.LIZ.getWidth()), Integer.valueOf(this.LIZ.getHeight()));
                float f3 = pathAnimationValue.w / pathAnimationValue.h;
                if (f3 > this.LIZ.getWidth() / this.LIZ.getHeight()) {
                    pair = new Pair(pair2.getFirst(), Integer.valueOf((int) (((Number) pair2.getFirst()).floatValue() / f3)));
                } else {
                    pair = new Pair(Integer.valueOf((int) (((Number) pair2.getSecond()).floatValue() * f3)), pair2.getSecond());
                }
                C19484011Ks c19484011KsLJJIJIIJI = AbstractC19484711Kz.LJII(new C2189741Amy(this, pathAnimationValue, pair, 1)).LJJIJIIJI(C1701940uOG.LIZIZ());
                Float f4 = pathAnimationValue.endFlyProgress;
                if (f4 != null) {
                    fFloatValue3 = f4.floatValue();
                }
                abstractC19484711KzLJJIJIIJI = c19484011KsLJJIJIIJI.LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.1AGL
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        final C1295960jpS c1295960jpS = (C1295960jpS) obj;
                        this.LL.LIZLLL("handleAnimation step2 start");
                        final Pair<Integer, Integer> pair3 = pair;
                        final PathAnimationValue pathAnimationValue2 = pathAnimationValue;
                        final float f5 = fFloatValue3;
                        final C1AGN c1agn = this.LL;
                        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1AGG
                            @Override // X.InterfaceC300801Eo
                            public final void subscribe(InterfaceC2329309At<C1295960jpS> interfaceC2329309At) {
                                float fFloatValue4;
                                int iIntValue;
                                int width;
                                int height;
                                int width2;
                                int iIntValue2;
                                int iIntValue3;
                                if (pair3.getFirst().intValue() != 0 && pair3.getSecond().intValue() != 0) {
                                    C1295960jpS c1295960jpS2 = c1295960jpS;
                                    Float f6 = pathAnimationValue2.startFlyProgress;
                                    if (f6 != null) {
                                        fFloatValue4 = f6.floatValue();
                                    } else {
                                        fFloatValue4 = 0.0f;
                                    }
                                    c1295960jpS2.setMinAndMaxProgress(fFloatValue4, f5);
                                    float fIntValue = pair3.getFirst().intValue();
                                    Integer num3 = pathAnimationValue2.endSize;
                                    if (num3 != null) {
                                        iIntValue = num3.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    float f7 = (fIntValue * iIntValue) / pathAnimationValue2.w;
                                    int[] iArr = new int[2];
                                    c1295960jpS.getLocationOnScreen(iArr);
                                    int[] iArr2 = new int[2];
                                    View view = c1agn.LIZJ;
                                    if (view != null) {
                                        view.getLocationOnScreen(iArr2);
                                    }
                                    int i = iArr2[0];
                                    View view2 = c1agn.LIZJ;
                                    if (view2 != null) {
                                        width = view2.getWidth();
                                    } else {
                                        width = 0;
                                    }
                                    float f8 = i + (width / 2);
                                    float f9 = iArr[0];
                                    C1AGN c1agn2 = c1agn;
                                    String str3 = pathAnimationValue2.endPos;
                                    c1agn2.getClass();
                                    final float fIntValue2 = f8 - (f9 + ((((Number) C1AGN.LJFF(str3).getFirst()).intValue() * pair3.getFirst().floatValue()) / pathAnimationValue2.w));
                                    int i2 = iArr2[1];
                                    View view3 = c1agn.LIZJ;
                                    if (view3 != null) {
                                        height = view3.getHeight();
                                    } else {
                                        height = 0;
                                    }
                                    float f10 = i2 + (height / 2);
                                    float f11 = iArr[1];
                                    C1AGN c1agn3 = c1agn;
                                    String str4 = pathAnimationValue2.endPos;
                                    c1agn3.getClass();
                                    final float fIntValue3 = f10 - (f11 + ((((Number) C1AGN.LJFF(str4).getSecond()).intValue() * pair3.getSecond().floatValue()) / pathAnimationValue2.h));
                                    View view4 = c1agn.LIZJ;
                                    if (view4 != null) {
                                        width2 = view4.getWidth();
                                    } else {
                                        width2 = 1;
                                    }
                                    final float f12 = width2 / f7;
                                    C1295960jpS c1295960jpS3 = c1295960jpS;
                                    C1AGN c1agn4 = c1agn;
                                    String str5 = pathAnimationValue2.endPos;
                                    c1agn4.getClass();
                                    int iIntValue4 = ((Number) C1AGN.LJFF(str5).getFirst()).intValue();
                                    Integer num4 = pathAnimationValue2.endSize;
                                    if (num4 != null) {
                                        iIntValue2 = num4.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    c1295960jpS3.setPivotX(((iIntValue4 + (iIntValue2 / 2)) / pathAnimationValue2.w) * pair3.getFirst().floatValue());
                                    C1295960jpS c1295960jpS4 = c1295960jpS;
                                    C1AGN c1agn5 = c1agn;
                                    String str6 = pathAnimationValue2.endPos;
                                    c1agn5.getClass();
                                    int iIntValue5 = ((Number) C1AGN.LJFF(str6).getSecond()).intValue();
                                    Integer num5 = pathAnimationValue2.endSize;
                                    if (num5 != null) {
                                        iIntValue3 = num5.intValue();
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    c1295960jpS4.setPivotY(((iIntValue5 + (iIntValue3 / 2)) / pathAnimationValue2.h) * pair3.getSecond().floatValue());
                                    C1AGN c1agn6 = c1agn;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("handleAnimation step2 start lottieAnimationView.width:");
                                    sbLIZ2.append(pair3.getFirst().intValue());
                                    sbLIZ2.append(" lottieAnimationView.pivotX:");
                                    sbLIZ2.append(c1295960jpS.getPivotX());
                                    sbLIZ2.append("  translateX:");
                                    sbLIZ2.append(fIntValue2);
                                    sbLIZ2.append(" translateY:");
                                    sbLIZ2.append(fIntValue3);
                                    c1agn6.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                                    final C1295960jpS c1295960jpS5 = c1295960jpS;
                                    c1295960jpS5.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1AGH
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            float animatedFraction = 1.0f - ((1.0f - f12) * valueAnimator.getAnimatedFraction());
                                            if (!Float.isNaN(animatedFraction)) {
                                                C786410Ut5.Wb(c1295960jpS5, animatedFraction);
                                                C786410Ut5.vc(c1295960jpS5, animatedFraction);
                                            }
                                            C786410Ut5.Pc(c1295960jpS5, fIntValue2 * valueAnimator.getAnimatedFraction());
                                            C786410Ut5.ld(c1295960jpS5, fIntValue3 * valueAnimator.getAnimatedFraction());
                                        }
                                    });
                                    final C1295960jpS c1295960jpS6 = c1295960jpS;
                                    final C1AGN c1agn7 = c1agn;
                                    final C11KT c11kt = (C11KT) interfaceC2329309At;
                                    c1295960jpS6.addAnimatorListener(new C464420IJc() { // from class: X.1AGF
                                        @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                                        public final void onAnimationCancel(Animator animator) {
                                            c1agn7.LIZLLL("handleAnimation step2 onAnimationCancel");
                                            C1295960jpS c1295960jpS7 = c1295960jpS6;
                                            c11kt.onSuccess(c1295960jpS7);
                                            c1295960jpS7.removeAnimatorListener(this);
                                        }

                                        @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator animator) {
                                            c1agn7.LIZLLL("handleAnimation  step2 onAnimationEnd");
                                            C1295960jpS c1295960jpS7 = c1295960jpS6;
                                            c11kt.onSuccess(c1295960jpS7);
                                            c1295960jpS7.removeAnimatorListener(this);
                                        }
                                    });
                                    if (c1295960jpS.getComposition() == null) {
                                        interfaceC2329309At.onError(new Throwable("step 2 lottie res is null"));
                                        return;
                                    }
                                    C1295960jpS c1295960jpS7 = c1295960jpS;
                                    c1295960jpS7.getDrawable().setVisible(true, false);
                                    c1295960jpS7.playAnimation();
                                    return;
                                }
                                interfaceC2329309At.onError(new Throwable("lottieAnimationView.width is 0"));
                            }
                        }).LJJIJIIJI(C1701940uOG.LIZIZ());
                    }
                }).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.1AGM
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        final C1295960jpS c1295960jpS = (C1295960jpS) obj;
                        final C1AGN c1agn = this.LL;
                        final float f5 = fFloatValue3;
                        final PathAnimationValue pathAnimationValue2 = pathAnimationValue;
                        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1AGI
                            @Override // X.InterfaceC300801Eo
                            public final void subscribe(InterfaceC2329309At<Boolean> interfaceC2329309At) {
                                float fFloatValue4;
                                c1agn.LIZLLL("handleAnimation endStep create");
                                if (f5 == 1.0f) {
                                    C1AGN c1agn2 = c1agn;
                                    C1295960jpS c1295960jpS2 = c1295960jpS;
                                    c1agn2.getClass();
                                    C500260Jjc.LJJJLL(c1295960jpS2);
                                    C500260Jjc.LJLJLJ(c1295960jpS2, false);
                                    C1085630eMD<C1295960jpS> c1085630eMD = c1agn2.LJFF;
                                    if (c1085630eMD != null) {
                                        c1085630eMD.LIZ(c1295960jpS2);
                                    }
                                    interfaceC2329309At.onSuccess(Boolean.TRUE);
                                    return;
                                }
                                C1295960jpS c1295960jpS3 = c1295960jpS;
                                Float f6 = pathAnimationValue2.endFlyProgress;
                                if (f6 != null) {
                                    fFloatValue4 = f6.floatValue();
                                } else {
                                    fFloatValue4 = 1.0f;
                                }
                                c1295960jpS3.setMinAndMaxProgress(fFloatValue4, 1.0f);
                                final C1295960jpS c1295960jpS4 = c1295960jpS;
                                final C1AGN c1agn3 = c1agn;
                                final C11KT c11kt = (C11KT) interfaceC2329309At;
                                c1295960jpS4.addAnimatorListener(new C464420IJc() { // from class: X.1AGJ
                                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                                    public final void onAnimationCancel(Animator animator) {
                                        c1agn3.LIZLLL("handleAnimation endStep onAnimationCancel");
                                        c1295960jpS4.removeAnimatorListener(this);
                                        C1AGN c1agn4 = c1agn3;
                                        C1295960jpS c1295960jpS5 = c1295960jpS4;
                                        c1agn4.getClass();
                                        C500260Jjc.LJJJLL(c1295960jpS5);
                                        C500260Jjc.LJLJLJ(c1295960jpS5, false);
                                        C1085630eMD<C1295960jpS> c1085630eMD2 = c1agn4.LJFF;
                                        if (c1085630eMD2 != null) {
                                            c1085630eMD2.LIZ(c1295960jpS5);
                                        }
                                        c11kt.onSuccess(Boolean.TRUE);
                                    }

                                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        c1agn3.LIZLLL("handleAnimation endStep onAnimationEnd");
                                        c1295960jpS4.removeAnimatorListener(this);
                                        C1AGN c1agn4 = c1agn3;
                                        C1295960jpS c1295960jpS5 = c1295960jpS4;
                                        c1agn4.getClass();
                                        C500260Jjc.LJJJLL(c1295960jpS5);
                                        C500260Jjc.LJLJLJ(c1295960jpS5, false);
                                        C1085630eMD<C1295960jpS> c1085630eMD2 = c1agn4.LJFF;
                                        if (c1085630eMD2 != null) {
                                            c1085630eMD2.LIZ(c1295960jpS5);
                                        }
                                        c11kt.onSuccess(Boolean.TRUE);
                                    }
                                });
                                if (c1295960jpS.getComposition() == null) {
                                    interfaceC2329309At.onError(new Throwable("lottie res is null"));
                                    C1AGN c1agn4 = c1agn;
                                    C1295960jpS c1295960jpS5 = c1295960jpS;
                                    c1agn4.getClass();
                                    C500260Jjc.LJJJLL(c1295960jpS5);
                                    C500260Jjc.LJLJLJ(c1295960jpS5, false);
                                    C1085630eMD<C1295960jpS> c1085630eMD2 = c1agn4.LJFF;
                                    if (c1085630eMD2 != null) {
                                        c1085630eMD2.LIZ(c1295960jpS5);
                                        return;
                                    }
                                    return;
                                }
                                c1agn.LIZLLL("handleAnimation endStep safePlayAnimation");
                                C1295960jpS c1295960jpS6 = c1295960jpS;
                                c1295960jpS6.getDrawable().setVisible(true, false);
                                c1295960jpS6.playAnimation();
                            }
                        });
                    }
                }).LJJIJIIJI(C1701940uOG.LIZIZ());
            }
            C11NW c11nwLIZ = LIZ(c1aga, null, null);
            C259800zU c259800zU = new C259800zU();
            final AwS277S0300000_33 awS277S0300000_33 = new AwS277S0300000_33(c259800zU, (C259800zU<InterfaceC420801kM>) this, (C1AGN) c1aga, (C1AGA) 1);
            C11OP c11opLJIIJ = AbstractC19484711Kz.LJI(abstractC19484711KzLJJIJIIJI, new C11MI(c11nwLIZ)).LJIIJ(C1701940uOG.LIZIZ());
            AfS119S0300000_33 afS119S0300000_33 = new AfS119S0300000_33(this, awS277S0300000_33, c1aga, 0);
            AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
            C1239380iMC c1239380iMC = C19487811Me.LIZJ;
            c259800zU.element = c11opLJIIJ.LIZIZ(anonymousClass0988, afS119S0300000_33, c1239380iMC).LIZIZ(anonymousClass0988, anonymousClass0988, new InterfaceC781210Ukh() { // from class: X.1AGO
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    this.LIZ.LIZLLL("handleAnimation, PATH_ANIMATION_TYPE success");
                    HandlerHook.viewRemoveCallbacks(this.LIZ.LIZ, new ARunnableS119S0100000_19((Function0) awS277S0300000_33, 12));
                    this.LIZ.LJIIIZ = null;
                    this.LIZ.LJ(c1aga);
                }
            }).LJIILJJIL(anonymousClass0988, C19487811Me.LJFF, c1239380iMC, C11NU.INSTANCE);
            HandlerHook.viewPostDelay(this.LIZ, new ARunnableS119S0100000_19((Function0) awS277S0300000_33, 12), 10000L);
            this.LJIIIZ = (InterfaceC420801kM) c259800zU.element;
        } else {
            if (!Intrinsics.LJFF(str2, "normal")) {
                return false;
            }
            NormalAnimationValue normalAnimationValue = animationInfo.normalValue;
            if (normalAnimationValue != null && (num2 = normalAnimationValue.disappearDuration) != null) {
                lValueOf = Long.valueOf(num2.intValue());
            } else {
                lValueOf = null;
            }
            NormalAnimationValue normalAnimationValue2 = animationInfo.normalValue;
            if (normalAnimationValue2 != null && (num = normalAnimationValue2.appearDuration) != null) {
                lValueOf2 = Long.valueOf(num.intValue());
            }
            C11NW c11nwLIZ2 = LIZ(c1aga, lValueOf, lValueOf2);
            C259800zU c259800zU2 = new C259800zU();
            AwS277S0300000_33 awS277S0300000_332 = new AwS277S0300000_33(c259800zU2, (C259800zU<InterfaceC420801kM>) this, (C1AGN) c1aga, (C1AGA) 2);
            ?? LJJIIJ = new C11MI(c11nwLIZ2).LJJ(C1701940uOG.LIZIZ()).LJIIL(new AfS119S0300000_33(this, awS277S0300000_332, c1aga, 1)).LJIILL(new AfS119S0300000_33(this, awS277S0300000_332, c1aga, 2)).LJJIIJ();
            c259800zU2.element = LJJIIJ;
            this.LJIIIZ = LJJIIJ;
            HandlerHook.viewPostDelay(this.LIZ, new ARunnableS119S0100000_19((Function0) awS277S0300000_332, 12), 10000L);
        }
        return true;
    }

    public final C11NW LIZ(final C1AGA c1aga, final Long l, Long l2) {
        InterfaceC19473011Gm interfaceC19473011GmLJJIJIIJI;
        C19484011Ks c19484011KsLJJIJIIJI = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1AGC
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Unit> interfaceC2329309At) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                long jLongValue;
                View view = this.LL.LIZJ;
                if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null) {
                    Long l3 = l;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                    } else {
                        jLongValue = 200;
                    }
                    ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(jLongValue);
                    if (duration != null) {
                        final C1AGN c1agn = this.LL;
                        final C11KT c11kt = (C11KT) interfaceC2329309At;
                        ViewPropertyAnimator listener = duration.setListener(new C464420IJc() { // from class: X.1AGD
                            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                c1agn.LIZLLL("createIconChangeAnimation fade onAnimationCancel");
                                c11kt.onError(new Throwable("cancel"));
                            }

                            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                c1agn.LIZLLL("createIconChangeAnimation fade onAnimationEnd");
                                c11kt.onSuccess(Unit.LIZ);
                            }
                        });
                        if (listener != null) {
                            listener.start();
                        }
                    }
                }
            }
        }).LJJIJIIJI(C1701940uOG.LIZIZ());
        C19484011Ks c19484011KsLJJIJIIJI2 = AbstractC19484711Kz.LJII(new C2189741Amy(c1aga, this, l2, 0)).LJJIJIIJI(C1701940uOG.LIZIZ());
        if (c1aga.LIZIZ == null) {
            LIZLLL("createBgAnimation return as bgColor is null");
            interfaceC19473011GmLJJIJIIJI = AbstractC19484711Kz.LJIJJLI(Unit.LIZ);
        } else {
            final Long l3 = null;
            interfaceC19473011GmLJJIJIIJI = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1AG8
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<Unit> interfaceC2329309At) {
                    GradientDrawable gradientDrawable;
                    int[] colors;
                    long jLongValue;
                    View view = this.LIZIZ;
                    Drawable background = null;
                    if (view != null) {
                        background = view.getBackground();
                    }
                    if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null && (colors = gradientDrawable.getColors()) != null && colors.length != 0) {
                        this.LIZLLL("createBgAnimation initAnimation");
                        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                        final C118300cf c118300cf = new C118300cf();
                        final C118300cf c118300cf2 = new C118300cf();
                        if (colors.length == 1) {
                            int i = colors[0];
                            c118300cf.element = i;
                            c118300cf2.element = i;
                        } else {
                            c118300cf.element = colors[0];
                            c118300cf2.element = colors[1];
                        }
                        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        Long l4 = l3;
                        if (l4 != null) {
                            jLongValue = l4.longValue();
                        } else {
                            jLongValue = 300;
                        }
                        valueAnimatorOfFloat.setDuration(jLongValue);
                        final C11KT c11kt = (C11KT) interfaceC2329309At;
                        valueAnimatorOfFloat.addListener(new C464420IJc() { // from class: X.1AG9
                            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                c11kt.onSuccess(Unit.LIZ);
                                valueAnimatorOfFloat.removeAllUpdateListeners();
                            }

                            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                c11kt.onSuccess(Unit.LIZ);
                                valueAnimatorOfFloat.removeAllUpdateListeners();
                            }
                        });
                        final C1AGA c1aga2 = c1aga;
                        final C1AGN c1agn = this;
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1AG7
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Integer num;
                                Object objEvaluate = argbEvaluator.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(c118300cf.element), c1aga2.LIZIZ);
                                Integer num2 = null;
                                if (objEvaluate instanceof Integer) {
                                    num = (Integer) objEvaluate;
                                } else {
                                    num = null;
                                }
                                Object objEvaluate2 = argbEvaluator.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(c118300cf2.element), c1aga2.LIZIZ);
                                if (objEvaluate2 instanceof Integer) {
                                    num2 = (Integer) objEvaluate2;
                                }
                                if (num != null && num2 != null) {
                                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                                    C1AGN c1agn2 = c1agn;
                                    gradientDrawable2.setColors(new int[]{num.intValue(), num2.intValue()});
                                    gradientDrawable2.setShape(0);
                                    gradientDrawable2.setCornerRadius((int) C497740JfY.LIZIZ(57.0f));
                                    View view2 = c1agn2.LIZIZ;
                                    if (view2 != null) {
                                        view2.setBackground(gradientDrawable2);
                                    }
                                }
                            }
                        });
                        valueAnimatorOfFloat.start();
                        return;
                    }
                    interfaceC2329309At.onSuccess(Unit.LIZ);
                    this.LIZLLL("createBgAnimation not animation");
                }
            }).LJJIJIIJI(C1701940uOG.LIZIZ());
        }
        return AbstractC19484711Kz.LJI(c19484011KsLJJIJIIJI, C953290aul.LIZ(c19484011KsLJJIJIIJI2, interfaceC19473011GmLJJIJIIJI));
    }

    public final boolean LIZJ(Integer num, String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleFanTicketEvent() called with: iconUrl = ");
        sbLIZ.append(str);
        LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        C1AGA c1aga = new C1AGA(str2, num, str, str3);
        InterfaceC420801kM interfaceC420801kM = this.LJIIIZ;
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            LIZLLL("updateToBeExecutedAnimation");
            this.LJI = c1aga;
            return true;
        }
        return LIZIZ(c1aga, "handleFanTicketEvent");
    }

    public C1AGN(ViewGroup viewGroup, View view, C1126540fQC c1126540fQC, String str, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = c1126540fQC;
        this.LIZLLL = str;
        this.LJ = interfaceC1631620sYq;
    }
}
