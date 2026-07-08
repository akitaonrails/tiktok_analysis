package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TFT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TFT implements InterfaceC739160Sz4 {
    public static String LIZLLL;
    public static Integer LJ;
    public static C0TFW LJFF;
    public static Float LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static final C0TFT LIZ = new C0TFT();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();
    public static final Keva LIZJ = Keva.getRepo("insert_video_swipe_up_guide_manager");
    public static final C0TFX LJIIIZ = new C0TFX();

    public static boolean LJFF() {
        C0TFW c0tfw = LJFF;
        if (c0tfw != null && c0tfw.LJFF()) {
            return false;
        }
        LJII = true;
        C0TFW c0tfw2 = LJFF;
        if (c0tfw2 != null) {
            c0tfw2.LIZJ();
        }
        LJIIIIZZ = false;
        return true;
    }

    @Override // X.InterfaceC739160Sz4
    public final boolean LIZ() {
        if (!((Boolean) AnonymousClass0740.LIZ.getValue()).booleanValue()) {
            return true;
        }
        Integer num = LJ;
        return num != null && num.intValue() == 4;
    }

    @Override // X.InterfaceC739160Sz4
    public final int LIZIZ() {
        Integer num = LJ;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC739160Sz4
    public final boolean LIZJ() {
        Integer num = LJ;
        return num == null || num.intValue() == 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0TFU] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC739160Sz4
    public final void LIZLLL(C0T8F c0t8f) {
        Integer num;
        C0TFW c0tfw;
        Integer num2;
        final View viewLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        View viewLJI;
        LJFF = c0t8f;
        Integer num3 = LJ;
        boolean z = true;
        if (num3 != null && num3.intValue() == 1) {
            C0TFW c0tfw2 = LJFF;
            if (c0tfw2 != null) {
                c0tfw2.LJ(C20642515q3.LJI(2131847049));
            }
        } else {
            Integer num4 = LJ;
            if (((num4 != null && num4.intValue() == 2) || ((num = LJ) != null && num.intValue() == 3)) && (c0tfw = LJFF) != null) {
                c0tfw.LJ(C20642515q3.LJI(2131847047));
            }
        }
        final C0TFX c0tfx = LJIIIZ;
        c0tfx.LIZ = c0t8f;
        View viewLJII = c0t8f.LJII();
        if (viewLJII != null && (viewLJI = c0t8f.LJI()) != null) {
            ObjectAnimator objectAnimator = c0tfx.LIZLLL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = c0tfx.LJ;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            C786410Ut5.T4(viewLJII, 1.0f);
            C786410Ut5.T4(viewLJI, 0.5f);
            Interpolator interpolatorLJI = C1619980sG4.LJI();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLJII, (Property<View, Float>) View.ALPHA, 1.0f, 0.5f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(2);
            objectAnimatorOfFloat.setInterpolator(interpolatorLJI);
            C786410Ut5.Pd(objectAnimatorOfFloat);
            c0tfx.LIZLLL = objectAnimatorOfFloat;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewLJI, (Property<View, Float>) View.ALPHA, 0.5f, 1.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setRepeatMode(2);
            objectAnimatorOfFloat2.setInterpolator(interpolatorLJI);
            C786410Ut5.Pd(objectAnimatorOfFloat2);
            c0tfx.LJ = objectAnimatorOfFloat2;
        }
        final C0TFW c0tfw3 = c0tfx.LIZ;
        if (c0tfw3 != null && (viewLIZIZ = c0tfw3.LIZIZ()) != null) {
            ViewGroup.LayoutParams layoutParams = viewLIZIZ.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                ValueAnimator valueAnimator = c0tfx.LIZJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                viewLIZIZ.animate().cancel();
                viewLIZIZ.clearAnimation();
                if (c0tfx.LIZIZ <= 0) {
                    Integer numValueOf = Integer.valueOf(marginLayoutParams.height);
                    if (numValueOf.intValue() > 0) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c0tfx.LIZIZ = iIntValue;
                }
                int i = c0tfx.LIZIZ;
                if (i <= 0) {
                    C786410Ut5.ed(viewLIZIZ, 0.0f);
                    c0tfw3.LIZLLL(0.0f);
                    C786410Ut5.LJLLLLLL(0, viewLIZIZ);
                } else {
                    C786410Ut5.ed(viewLIZIZ, i);
                    c0tfw3.LIZLLL(0.0f);
                    C786410Ut5.LJLLLLLL(0, viewLIZIZ);
                    final float f = viewLIZIZ.getResources().getDisplayMetrics().density * 56.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0TFV
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            c0tfw3.LIZLLL((-f) * fFloatValue);
                            C786410Ut5.ed(viewLIZIZ, c0tfx.LIZIZ * (1.0f - fFloatValue));
                        }
                    });
                    valueAnimatorOfFloat.start();
                    c0tfx.LIZJ = valueAnimatorOfFloat;
                }
            }
        }
        Integer num5 = LJ;
        if ((num5 == null || num5.intValue() != 2) && ((num2 = LJ) == null || num2.intValue() != 3)) {
            z = false;
        }
        LJIIIIZZ = z;
        C0TFW c0tfw4 = LJFF;
        if (c0tfw4 != 0) {
            c0tfw4.LIZ(new InterfaceC469360Ias() { // from class: X.0TFU
                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i2) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i2, float f2, int i3) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i2) {
                    View viewLIZIZ2;
                    View viewLIZIZ3;
                    if (C0TFT.LJII) {
                        C0TFT.LJII = false;
                        return;
                    }
                    C0TFW c0tfw5 = C0TFT.LJFF;
                    if (c0tfw5 != null && (viewLIZIZ2 = c0tfw5.LIZIZ()) != null && viewLIZIZ2.getVisibility() == 0) {
                        C0TFT.LIZ.getClass();
                        C0TFX c0tfx2 = C0TFT.LJIIIZ;
                        ValueAnimator valueAnimator2 = c0tfx2.LIZJ;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        c0tfx2.LIZJ = null;
                        C0TFW c0tfw6 = c0tfx2.LIZ;
                        if (c0tfw6 != null) {
                            c0tfw6.LIZLLL(0.0f);
                        }
                        C0TFW c0tfw7 = c0tfx2.LIZ;
                        if (c0tfw7 != null && (viewLIZIZ3 = c0tfw7.LIZIZ()) != null) {
                            C786410Ut5.LJLLLLLL(8, viewLIZIZ3);
                            C786410Ut5.ed(viewLIZIZ3, 0.0f);
                        }
                        ObjectAnimator objectAnimator3 = c0tfx2.LIZLLL;
                        if (objectAnimator3 != null) {
                            objectAnimator3.cancel();
                        }
                        ObjectAnimator objectAnimator4 = c0tfx2.LJ;
                        if (objectAnimator4 != null) {
                            objectAnimator4.cancel();
                        }
                        c0tfx2.LIZLLL = null;
                        c0tfx2.LJ = null;
                        c0tfx2.LIZ = null;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("disappear_method", "swipe_up");
                        c2344009Gk.LJIIIIZZ("ui_type", "bottom");
                        C20684815ws.LJIILLIIL("swipe_up_guide_disappear", c2344009Gk.LIZ);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC739160Sz4
    public final void LJIIIIZZ(Aweme aweme) {
        String aid;
        C0TFW c0tfw;
        View viewLIZIZ;
        C0TFW c0tfw2 = LJFF;
        if ((c0tfw2 != null && (viewLIZIZ = c0tfw2.LIZIZ()) != null && viewLIZIZ.getVisibility() == 8) || !LJIIIIZZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle onPlayCompleted: currentABGroup=");
        sbLIZ.append(LJ);
        sbLIZ.append(", awemeId=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        Integer num = LJ;
        if (num == null || num.intValue() != 1) {
            Integer num2 = LJ;
            if (num2 != null && num2.intValue() == 2) {
                if (LJFF()) {
                    C0TFW c0tfw3 = LJFF;
                    if (c0tfw3 != null) {
                        c0tfw3.LJ(C20642515q3.LJI(2131847048));
                    }
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C591610NIh(null), 3);
                    return;
                }
                return;
            }
            Integer num3 = LJ;
            if (num3 == null || num3.intValue() != 3 || !LJFF() || (c0tfw = LJFF) == null) {
                return;
            }
            c0tfw.LJ(C20642515q3.LJI(2131847049));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0192, code lost:
    
        if ((r10 - r1) < 604800000) goto L87;
     */
    @Override // X.InterfaceC739160Sz4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(java.lang.String r20, float r21, com.ss.android.ugc.aweme.feed.model.Aweme r22, boolean r23, boolean r24, kotlin.jvm.internal.AwS161S1100000_12 r25) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TFT.LJ(java.lang.String, float, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean, kotlin.jvm.internal.AwS161S1100000_12):boolean");
    }
}
