package X;

import Y.ALAdapterS11S0300000_24;
import Y.AUListenerS154S0300000_24;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0rWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591700rWS {
    public final MainTabStrip LIZ;
    public final C705890RmV LIZIZ;
    public final Context LIZJ;
    public ViewOnLayoutChangeListenerC1591750rWX LJI;
    public AnimatorSet LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public float LJIILL;
    public boolean LJIILLIIL;
    public final C630740Ooa LIZLLL = C628500Oky.LIZ(new C1591720rWU(this));
    public final List<AnimatorListenerAdapter> LJ = new ArrayList();
    public final RunnableC1591710rWT LJFF = new Runnable() { // from class: X.0rWT
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v34, types: [X.0rWX, android.view.View$OnLayoutChangeListener] */
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
        public final void LIZ() {
            final C1591700rWS c1591700rWS = this.LL;
            if (c1591700rWS.LIZ.LLILLJJLI.isLaidOut()) {
                IMFToolBarAbility iMFToolBarAbility = (IMFToolBarAbility) c1591700rWS.LIZLLL.getValue();
                int iLIZ = C1591700rWS.LIZ(iMFToolBarAbility != null ? iMFToolBarAbility.pr() : null);
                IMFToolBarAbility iMFToolBarAbility2 = (IMFToolBarAbility) c1591700rWS.LIZLLL.getValue();
                int iLIZ2 = C1591700rWS.LIZ(iMFToolBarAbility2 != null ? iMFToolBarAbility2.Yp() : null);
                if (c1591700rWS.LJIIIIZZ == iLIZ && c1591700rWS.LJIIIZ == iLIZ2) {
                    return;
                }
                if (C426750GoL.LJ(c1591700rWS.LIZ.LLILLJJLI)) {
                    iLIZ2 = iLIZ;
                    iLIZ = iLIZ2;
                }
                final C705890RmV c705890RmV = c1591700rWS.LIZIZ;
                if (c705890RmV != null) {
                    if (!C1581510rG1.LIZJ() || (c1591700rWS.LJIIIIZZ == 0 && c1591700rWS.LJIIIZ == 0)) {
                        ViewGroup.LayoutParams layoutParams = c705890RmV.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = iLIZ;
                        marginLayoutParams.rightMargin = iLIZ2;
                        C786410Ut5.W5(c705890RmV, marginLayoutParams);
                        c1591700rWS.LJIIIIZZ = iLIZ;
                        c1591700rWS.LJIIIZ = iLIZ2;
                        c1591700rWS.LJIIJ = iLIZ;
                        c1591700rWS.LJIIJJI = iLIZ2;
                        final C1592450rXf c1592450rXf = c1591700rWS.LIZ.LLILLJJLI;
                        C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ().getClass();
                        if (!C1616660sAi.LIZJ()) {
                            c1592450rXf.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0rWW
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                    view.removeOnLayoutChangeListener(this);
                                    C1591700rWS c1591700rWS2 = c1591700rWS;
                                    c1591700rWS2.LJIILLIIL = c1591700rWS2.LIZIZ(c1592450rXf);
                                    c1591700rWS.LIZLLL(c1592450rXf, c705890RmV);
                                }
                            });
                            return;
                        } else {
                            c1591700rWS.LJIILLIIL = c1591700rWS.LIZIZ(c1592450rXf);
                            c1591700rWS.LIZLLL(c1592450rXf, c705890RmV);
                            return;
                        }
                    }
                    if (iLIZ == c1591700rWS.LJIIJ && iLIZ2 == c1591700rWS.LJIIJJI) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    final C1592450rXf c1592450rXf2 = c1591700rWS.LIZ.LLILLJJLI;
                    AnimatorSet animatorSet = c1591700rWS.LJII;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ViewOnLayoutChangeListenerC1591750rWX viewOnLayoutChangeListenerC1591750rWX = c1591700rWS.LJI;
                    if (viewOnLayoutChangeListenerC1591750rWX != null) {
                        c1592450rXf2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1591750rWX);
                    }
                    int i = c1591700rWS.LJIIIIZZ;
                    if (iLIZ != i) {
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iLIZ);
                        valueAnimatorOfInt.addUpdateListener(new AUListenerS154S0300000_24(c1592450rXf2, c1591700rWS, c705890RmV, 0));
                        arrayList.add(valueAnimatorOfInt);
                        c1591700rWS.LJIIJ = iLIZ;
                    }
                    int i2 = c1591700rWS.LJIIIZ;
                    if (iLIZ2 != i2) {
                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i2, iLIZ2);
                        valueAnimatorOfInt2.addUpdateListener(new AUListenerS154S0300000_24(c1592450rXf2, c1591700rWS, c705890RmV, 1));
                        arrayList.add(valueAnimatorOfInt2);
                        c1591700rWS.LJIIJJI = iLIZ2;
                    }
                    if (!arrayList.isEmpty()) {
                        c1591700rWS.LJII = new AnimatorSet();
                        ?? r0 = new View.OnLayoutChangeListener() { // from class: X.0rWX
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                AnimatorSet animatorSet2 = c1591700rWS.LJII;
                                if (animatorSet2 != null && animatorSet2.isRunning()) {
                                    c1591700rWS.LIZLLL(c1592450rXf2, c705890RmV);
                                }
                            }
                        };
                        c1591700rWS.LJI = r0;
                        c1592450rXf2.addOnLayoutChangeListener(r0);
                        AnimatorSet animatorSet2 = c1591700rWS.LJII;
                        if (animatorSet2 != null) {
                            animatorSet2.addListener(new ALAdapterS11S0300000_24(c1591700rWS, c1592450rXf2, c705890RmV, 0));
                        }
                        AnimatorSet animatorSet3 = c1591700rWS.LJII;
                        if (animatorSet3 != null) {
                            animatorSet3.setDuration(200L);
                        }
                        AnimatorSet animatorSet4 = c1591700rWS.LJII;
                        if (animatorSet4 != null) {
                            animatorSet4.setInterpolator(C1619980sG4.LIZLLL());
                        }
                        AnimatorSet animatorSet5 = c1591700rWS.LJII;
                        if (animatorSet5 != null) {
                            animatorSet5.playTogether(arrayList);
                        }
                        AnimatorSet animatorSet6 = c1591700rWS.LJII;
                        if (animatorSet6 != null) {
                            animatorSet6.start();
                        }
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("MainTabRelayoutHelper@8a81.triggerRelayoutCheckRunnable$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("MainTabRelayoutHelper@8a81.triggerRelayoutCheckRunnable$1");
        }
    };
    public int LJIILJJIL = -1;

    public static int LIZ(View view) {
        if (view == null) {
            C1591460rW4.LIZ.getClass();
            return C1591460rW4.LIZIZ;
        }
        if (view.getWidth() == 0) {
            if (view instanceof ViewGroup) {
                if (view.getLayoutParams().width != -2 && view.getLayoutParams().width != -1) {
                    return view.getLayoutParams().width;
                }
                if (C307020C1s.LIZ()) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    return view.getMeasuredWidth();
                }
                C1591460rW4.LIZ.getClass();
                return C1591460rW4.LIZIZ;
            }
            return view.getLayoutParams().width;
        }
        return view.getWidth();
    }

    public final boolean LIZIZ(C1592450rXf c1592450rXf) {
        int iLIZIZ = (C497820Jfg.LIZIZ(this.LIZJ) - this.LJIIJ) - this.LJIIJJI;
        int iLJI = c1592450rXf.LJI();
        if (iLJI > 0) {
            if (c1592450rXf.getRight() + iLJI <= iLIZIZ) {
                return true;
            }
            return false;
        }
        if (c1592450rXf.getLeft() + iLJI >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0rWT] */
    public C1591700rWS(MainTabStrip mainTabStrip, C705890RmV c705890RmV) {
        this.LIZ = mainTabStrip;
        this.LIZIZ = c705890RmV;
        this.LIZJ = mainTabStrip.LLILLJJLI.getContext();
        C1592450rXf c1592450rXf = mainTabStrip.LLILLJJLI;
        if ((c1592450rXf instanceof C1592450rXf) && c1592450rXf != null) {
            c1592450rXf.setRelayoutHelper(this);
        }
    }

    public final void LIZJ(boolean z, boolean z2) {
        Handler handler;
        if (z2) {
            this.LJIIIIZZ = 0;
            this.LJIIIZ = 0;
            this.LJIIJJI = 0;
            this.LJIIJ = 0;
        }
        if (!z && this.LJIIL) {
            this.LJIILIIL = true;
            return;
        }
        if (C1581510rG1.LIZJ()) {
            if (z) {
                C705890RmV c705890RmV = this.LIZIZ;
                if (c705890RmV != null && (handler = c705890RmV.getHandler()) != null) {
                    C786410Ut5.LJL(handler, this.LJFF);
                    return;
                }
                C705890RmV c705890RmV2 = this.LIZIZ;
                if (c705890RmV2 == null) {
                    return;
                }
                HandlerHook.viewPost(c705890RmV2, this.LJFF);
                return;
            }
            C705890RmV c705890RmV3 = this.LIZIZ;
            if (c705890RmV3 == null) {
                return;
            }
            HandlerHook.viewPost(c705890RmV3, this.LJFF);
        }
    }

    public final void LIZLLL(C1592450rXf c1592450rXf, C705890RmV c705890RmV) {
        Integer numValueOf;
        if (c1592450rXf.getWidth() >= c705890RmV.getWidth()) {
            int i = this.LJIILJJIL;
            if (i == -1) {
                c1592450rXf.scrollTo(c1592450rXf.LJII(c1592450rXf.getSelectedTabPosition(), this.LJIILL), 0);
                c1592450rXf.LLILLL.invalidate();
                c1592450rXf.LLILLL.requestLayout();
                return;
            }
            c1592450rXf.scrollTo(c1592450rXf.LJII(i, this.LJIILL), 0);
            c1592450rXf.LLILLL.invalidate();
            c1592450rXf.LLILLL.requestLayout();
            return;
        }
        if (this.LJIILLIIL) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592450rXf);
            c1592450rXf.setTranslationX(0.0f);
            int iLJI = c1592450rXf.LJI();
            if (this.LIZIZ != null) {
                if (iLJI > 0) {
                    if (c1592450rXf.getRight() + iLJI <= this.LIZIZ.getRight() - this.LIZIZ.getLeft()) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592450rXf);
                        c1592450rXf.setTranslationX(iLJI);
                    } else {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592450rXf);
                        c1592450rXf.setTranslationX(0.0f);
                    }
                } else if (c1592450rXf.getLeft() + iLJI >= 0) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592450rXf);
                    c1592450rXf.setTranslationX(iLJI);
                } else {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592450rXf);
                    c1592450rXf.setTranslationX(0.0f);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryCenterOnScreen, offsetX: ");
            sbLIZ.append(iLJI);
            sbLIZ.append(", tabLayoutContainer: [");
            C705890RmV c705890RmV2 = this.LIZIZ;
            Integer numValueOf2 = null;
            if (c705890RmV2 != null) {
                numValueOf = Integer.valueOf(c705890RmV2.getLeft());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", ");
            C705890RmV c705890RmV3 = this.LIZIZ;
            if (c705890RmV3 != null) {
                numValueOf2 = Integer.valueOf(c705890RmV3.getRight());
            }
            sbLIZ.append(numValueOf2);
            sbLIZ.append("], anim: [");
            sbLIZ.append(this.LJIIIIZZ);
            sbLIZ.append(", ");
            sbLIZ.append(this.LJIIIZ);
            sbLIZ.append("], borderTabLayout: [");
            sbLIZ.append(c1592450rXf.getLeft());
            sbLIZ.append(", ");
            sbLIZ.append(c1592450rXf.getRight());
            sbLIZ.append(']');
            C2188811AlT.LIZIZ(sbLIZ);
        }
        c1592450rXf.scrollTo(c1592450rXf.LJII(c1592450rXf.getSelectedTabPosition(), 0.0f), 0);
        c1592450rXf.LLILLL.invalidate();
        c1592450rXf.LLILLL.requestLayout();
    }
}
