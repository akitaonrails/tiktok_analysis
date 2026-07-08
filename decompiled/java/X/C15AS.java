package X;

import Y.ARunnableS64S0300000_31;
import android.animation.Animator;
import android.graphics.Bitmap;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS49S2100000_31;

/* JADX INFO: renamed from: X.15AS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15AS {
    public static void LIZJ(C15AU c15au, C1295960jpS c1295960jpS) {
        Function2<Boolean, String, Unit> actionSuccess = c15au.getActionSuccess();
        if (actionSuccess != null) {
            actionSuccess.invoke(Boolean.TRUE, null);
        }
        c1295960jpS.removeAllAnimatorListeners();
    }

    public static void LIZLLL(C1295960jpS c1295960jpS, C1294720jnS c1294720jnS, C15AO c15ao) {
        Collection<C1294320jmo> collectionValues;
        c1295960jpS.setComposition(c1294720jnS);
        Map<String, C1294320jmo> map = c1294720jnS.LIZLLL;
        if (map != null && (collectionValues = map.values()) != null) {
            for (C1294320jmo c1294320jmo : collectionValues) {
                if (c15ao.LJIIIZ.contains(c1294320jmo.LIZLLL)) {
                    c1294320jmo.LJFF = null;
                }
            }
        }
    }

    public static void LIZ(C15AU c15au, C1295960jpS c1295960jpS, C15AO c15ao, boolean z, Function2<? super Boolean, ? super String, Unit> function2) {
        C1294720jnS c1294720jnS;
        c15au.setActionSuccess(function2);
        if (!c15ao.LJII && !z) {
            C1835340xrQ.LIZ("not show show image");
            C20410914tn.LIZ(c1295960jpS, c15ao.LJIIIIZZ);
            Function2<Boolean, String, Unit> actionSuccess = c15au.getActionSuccess();
            if (actionSuccess != null) {
                actionSuccess.invoke(Boolean.TRUE, null);
            }
            c15au.setActionSuccess(null);
            return;
        }
        C1835340xrQ.LIZ("loadRes");
        if (c1295960jpS.getParent() == null) {
            Function2<Boolean, String, Unit> actionSuccess2 = c15au.getActionSuccess();
            if (actionSuccess2 != null) {
                actionSuccess2.invoke(Boolean.FALSE, "parent is null");
            }
            c15au.setActionSuccess(null);
            return;
        }
        Map<String, C1294720jnS> map = c15ao.LJIIJ;
        if (map != null && (c1294720jnS = map.get(c15ao.LIZIZ)) != null) {
            C1835340xrQ.LIZ("use lottie cache");
            C500260Jjc.LJLJLJ(c1295960jpS, true);
            c15au.LIZ(function2, c1295960jpS, c15ao, c1294720jnS);
        } else {
            C15AY c15ay = C15AX.LJJLIIIJLJLI;
            final String str = c15ao.LIZ;
            final String str2 = c15ao.LIZIZ;
            final AwS126S0400000_31 awS126S0400000_31 = new AwS126S0400000_31(c1295960jpS, c15au, c15ao, function2, 14);
            c15ay.getClass();
            C1143680frq.LJIIL(c1295960jpS, str, str2, "images", false, new InterfaceC1143790fs1() { // from class: X.15AV
                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z2) {
                    if (!z2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("loadGeckoLottie fail, fileName: ");
                        sbLIZ.append(str2);
                        sbLIZ.append(", channelName: ");
                        sbLIZ.append(str);
                        C20441214yg.LJ("ILottieGenius", C2188811AlT.LIZIZ(sbLIZ));
                        awS126S0400000_31.invoke(null);
                    }
                }
            }, Boolean.FALSE, new AwS49S2100000_31(str2, str, awS126S0400000_31, 1));
        }
    }

    public static void LIZIZ(final C15AU c15au, Function2<? super Boolean, ? super String, Unit> function2, final C1295960jpS c1295960jpS, final C15AO c15ao, C1294720jnS c1294720jnS) {
        c15au.setActionSuccess(function2);
        final Function2<String, Pair<Integer, Integer>, Bitmap> function22 = c15ao.LIZJ;
        final Map<String, String> map = c15ao.LIZLLL;
        if (function22 != null) {
            c1295960jpS.setImageAssetDelegate(new InterfaceC1294390jmv() { // from class: X.0jmn
                @Override // X.InterfaceC1294390jmv
                public final Bitmap LIZ(C1294320jmo c1294320jmo) {
                    Function2<String, Pair<Integer, Integer>, Bitmap> function23 = function22;
                    String str = c1294320jmo.LIZLLL;
                    if (str == null) {
                        str = "";
                    }
                    Bitmap bitmapInvoke = function23.invoke(str, new Pair<>(Integer.valueOf(c1294320jmo.LIZ), Integer.valueOf(c1294320jmo.LIZIZ)));
                    if (bitmapInvoke != null && !bitmapInvoke.isRecycled()) {
                        return bitmapInvoke;
                    }
                    return null;
                }
            });
        } else {
            c1295960jpS.setImageAssetDelegate(null);
        }
        if (map != null && (!map.isEmpty())) {
            C1835340xrQ.LIZ("setTextDelegate ");
            c1295960jpS.setTextDelegate(new C1295710jp3(c1295960jpS) { // from class: X.0y2i
                @Override // X.C1295710jp3
                public final String LIZ(String str) {
                    C01GW c01gw = C1835340xrQ.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getText text:");
                    sbLIZ.append(str);
                    C1835340xrQ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (map.containsKey(str) && map.get(str) != null) {
                        return map.get(str);
                    }
                    return null;
                }
            });
            c1295960jpS.setFontAssetDelegate((C1295870jpJ) C1835340xrQ.LIZ.getValue());
        } else {
            c1295960jpS.setTextDelegate(null);
            c1295960jpS.setFontAssetDelegate(null);
        }
        c1295960jpS.removeAllAnimatorListeners();
        C20345814jI c20345814jI = c15ao.LJ;
        int i = c20345814jI.LIZ;
        if (i == -1) {
            if (c20345814jI.LIZIZ.getFirst().floatValue() == c15ao.LJI) {
                c1295960jpS.setMinAndMaxProgress(c15ao.LJ.LIZIZ.getFirst().floatValue(), c15ao.LJ.LIZIZ.getSecond().floatValue());
                c1295960jpS.setRepeatCount(-1);
                c1295960jpS.addAnimatorListener(new C464420IJc() { // from class: X.15AR
                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        C15AS.LIZJ(c15au, c1295960jpS);
                    }

                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C15AS.LIZJ(c15au, c1295960jpS);
                    }
                });
            } else {
                c1295960jpS.setRepeatCount(0);
                c1295960jpS.setMinAndMaxProgress(c15ao.LJI, c15ao.LJ.LIZIZ.getFirst().floatValue());
                c1295960jpS.addAnimatorListener(new C464420IJc() { // from class: X.15AT
                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        C1835340xrQ.LIZ("handleAnimation update onAnimationCancel");
                        C15AS.LIZJ(c15au, c1295960jpS);
                    }

                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C01GW c01gw = C1835340xrQ.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("handleAnimation update onAnimationEnd repeatProgress:");
                        sbLIZ.append(c15ao.LJ.LIZIZ);
                        C1835340xrQ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        c1295960jpS.setMinAndMaxProgress(c15ao.LJ.LIZIZ.getFirst().floatValue(), c15ao.LJ.LIZIZ.getSecond().floatValue());
                        c1295960jpS.setRepeatCount(-1);
                        c1295960jpS.removeAllAnimatorListeners();
                        final C1295960jpS c1295960jpS2 = c1295960jpS;
                        final C15AU c15au2 = c15au;
                        c1295960jpS2.addAnimatorListener(new C464420IJc() { // from class: X.15AW
                            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator2) {
                                C15AS.LIZJ(c15au2, c1295960jpS2);
                            }

                            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator2) {
                                C15AS.LIZJ(c15au2, c1295960jpS2);
                            }
                        });
                        C15AY c15ay = C15AX.LJJLIIIJLJLI;
                        C1295960jpS c1295960jpS3 = c1295960jpS;
                        c15ay.getClass();
                        c1295960jpS3.getDrawable().setVisible(true, false);
                        c1295960jpS3.playAnimation();
                    }

                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C1835340xrQ.LIZ("handleAnimation update onAnimationStart");
                    }
                });
            }
        } else {
            c1295960jpS.setRepeatCount(i);
            c1295960jpS.addAnimatorListener(new C464420IJc() { // from class: X.15AQ
                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    C15AS.LIZJ(c15au, c1295960jpS);
                    C1835340xrQ.LIZ("onAnimationCancel");
                }

                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C15AS.LIZJ(c15au, c1295960jpS);
                    C1835340xrQ.LIZ("onAnimationEnd");
                }
            });
        }
        if (c15ao.LJFF <= 0) {
            C1835340xrQ.LIZ("update playAnimation right now");
            LIZLLL(c1295960jpS, c1294720jnS, c15ao);
            C15AX.LJJLIIIJLJLI.getClass();
            c1295960jpS.getDrawable().setVisible(true, false);
            c1295960jpS.playAnimation();
            return;
        }
        HandlerHook.viewPostDelay(c1295960jpS, new ARunnableS64S0300000_31(c1295960jpS, c15ao, c1294720jnS, 6), c15ao.LJFF);
    }
}
