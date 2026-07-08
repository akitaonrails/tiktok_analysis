package X;

import Y.ACListenerS167S0100000_33;
import Y.ALAdapterS10S0100000_14;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS39S0300000_6;
import Y.ATListenerS465S0100000_33;
import Y.AUListenerS235S0200000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS54S0310000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21646519nb {
    public final View LIZ;
    public final Function0<View> LIZIZ;
    public final Function0<Float> LIZJ;
    public final Function0<View> LIZLLL;
    public final Function0<ThoughtInfo> LJ;
    public final Function0<CharSequence> LJFF;
    public final Function0<C21646719nd> LJI;
    public final Function1<ThoughtInfo, Unit> LJII;
    public final Function1<ThoughtInfo, Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;
    public final Function1<ThoughtInfo, Unit> LJIIJ;
    public final Function0<Boolean> LJIIJJI;
    public View LJIIL;
    public View LJIILIIL;
    public FrameLayout LJIILJJIL;
    public View LJIILL;
    public C21647019ng LJIILLIIL;
    public C21647019ng LJIIZILJ;
    public boolean LJIJ;
    public C06IF LJIJJ;
    public float LJIJJLI;
    public float LJIL;
    public Pair<Float, Float> LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public ValueAnimator LJJII;
    public ValueAnimator LJJIII;
    public int LJJIIJ;
    public C06IF LJIJI = C06IF.NONE;
    public final List<Pair<Integer, Integer>> LJJIIJZLJL = C1697810uHb.LJIIJJI(new Pair(16, 16), new Pair(14, 16), new Pair(12, 14));

    public final void LJI() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        this.LJJIFFI = true;
        this.LJJ = null;
        this.LJIL = 0.0f;
        View view = this.LJIILIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LJIIL;
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
            if (viewPropertyAnimatorAnimate2 != null) {
                viewPropertyAnimatorAnimate2.cancel();
            }
            C786410Ut5.LJLLLLLL(8, view2);
            LJIIIZ(view2);
        }
        FrameLayout frameLayout = this.LJIILJJIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        View viewInvoke = this.LIZLLL.invoke();
        if (viewInvoke != null) {
            C21646719nd c21646719ndInvoke = this.LJI.invoke();
            if (c21646719ndInvoke != null) {
                c21646719ndInvoke.LJ = EnumC21646819ne.LLILLL;
                View view3 = c21646719ndInvoke.LIZLLL;
                if (view3 == null) {
                    view3 = c21646719ndInvoke.LIZ;
                }
                C786410Ut5.LJLLLLLL(0, viewInvoke);
                c21646719ndInvoke.LIZJ.setDisplayedChild(1);
                C786410Ut5.LJLLLLLL(0, c21646719ndInvoke.LIZJ);
                if (view3 != null && (viewPropertyAnimatorAnimate = view3.animate()) != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate.translationY(0.0f)) != null && (duration = viewPropertyAnimatorTranslationY.setDuration(150L)) != null && (interpolator = duration.setInterpolator((Interpolator) c21646719ndInvoke.LJI.getValue())) != null) {
                    interpolator.start();
                }
            }
            LJIIJ(viewInvoke);
            C786410Ut5.T4(viewInvoke, 1.0f);
            C786410Ut5.Ob(viewInvoke, 1.0f);
            C786410Ut5.pc(viewInvoke, 1.0f);
        }
        LJIIL(0);
    }

    public final void LJII() {
        this.LJIL = 0.0f;
        this.LJJ = null;
        View viewInvoke = this.LIZLLL.invoke();
        if (viewInvoke != null) {
            C21646719nd c21646719ndInvoke = this.LJI.invoke();
            if (c21646719ndInvoke != null) {
                c21646719ndInvoke.LJI();
                c21646719ndInvoke.LJFF(viewInvoke);
            }
            LJIIJ(viewInvoke);
            C786410Ut5.T4(viewInvoke, 0.0f);
        }
        View view = this.LJIIL;
        if (view != null) {
            LJIIIZ(view);
            C786410Ut5.LJLLLLLL(0, view);
        }
        int i = this.LJJIIJ;
        if (i > 0) {
            LJIIL(i);
        }
    }

    public final void LJIIIIZZ() {
        C06IF c06if = this.LJIJJ;
        if (c06if == null) {
            return;
        }
        this.LJIJJ = null;
        if (c06if == this.LJIJI) {
            return;
        }
        LIZJ(c06if);
    }

    public final void LIZJ(C06IF c06if) {
        C21646719nd c21646719ndInvoke;
        this.LJIJI = c06if;
        int i = C06IG.LIZ[c06if.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LJIJ = true;
                    View viewInvoke = this.LIZLLL.invoke();
                    if (viewInvoke != null && (c21646719ndInvoke = this.LJI.invoke()) != null) {
                        c21646719ndInvoke.LJ = EnumC21646819ne.LLILZ;
                        View view = c21646719ndInvoke.LIZLLL;
                        if (view == null) {
                            view = c21646719ndInvoke.LIZ;
                        }
                        C786410Ut5.LJLLLLLL(0, viewInvoke);
                        c21646719ndInvoke.LIZJ.setDisplayedChild(1);
                        C786410Ut5.LJLLLLLL(0, c21646719ndInvoke.LIZJ);
                        if (view == null) {
                            C786410Ut5.LJLLLLLL(8, viewInvoke);
                            C786410Ut5.LJLLLLLL(8, c21646719ndInvoke.LIZJ);
                        } else {
                            view.animate().cancel();
                            C786410Ut5.ed(view, 0.0f);
                            view.animate().translationY(c21646719ndInvoke.LIZIZ(viewInvoke)).setDuration(300L).setInterpolator((Interpolator) c21646719ndInvoke.LJI.getValue()).withEndAction(new ARunnableS39S0300000_6(viewInvoke, c21646719ndInvoke, view, 13)).start();
                        }
                    }
                    AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 3875);
                    View viewInvoke2 = this.LIZLLL.invoke();
                    if (viewInvoke2 == null) {
                        awS577S0100000_33.invoke();
                    } else {
                        Pair<Float, Float> pairLJFF = LJFF(viewInvoke2);
                        float fFloatValue = pairLJFF.getFirst().floatValue();
                        float fFloatValue2 = pairLJFF.getSecond().floatValue();
                        viewInvoke2.setPivotX(fFloatValue);
                        viewInvoke2.setPivotY(fFloatValue2);
                        C21647019ng c21647019ng = this.LJIILLIIL;
                        if (c21647019ng != null) {
                            c21647019ng.LIZ();
                        }
                        this.LJIILLIIL = null;
                        viewInvoke2.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).withEndAction(new ARunnableS119S0100000_19((Object) awS577S0100000_33, 156)).start();
                    }
                    LJIILIIL(false);
                    return;
                }
                throw new C1954807lC();
            }
            this.LJIJ = true;
            View view2 = this.LJIILIIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            final View view3 = this.LJIIL;
            if (view3 != null) {
                if (view3.getVisibility() != 0) {
                    FrameLayout frameLayout = this.LJIILJJIL;
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(8, frameLayout);
                    }
                    LIZIZ(0, 250L);
                } else {
                    final AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(view3, this, 89);
                    Pair<Float, Float> pairLJ = LJ(view3);
                    float fFloatValue3 = pairLJ.getFirst().floatValue();
                    float fFloatValue4 = pairLJ.getSecond().floatValue();
                    view3.setPivotX(fFloatValue3);
                    view3.setPivotY(fFloatValue4);
                    C21647019ng c21647019ng2 = this.LJIIZILJ;
                    if (c21647019ng2 != null) {
                        c21647019ng2.LIZ();
                    }
                    final C21647019ng c21647019ng3 = new C21647019ng(view3.getContext(), view3, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(631.65f), new C1342130l1v(50.22f)), C1697810uHb.LJIIJJI(new C19746412Nq("big_bubble_shrink_scale_x", new C0HIW(1.0f, 0.1f)), new C19746412Nq("big_bubble_shrink_scale_y", new C0HIX(1.0f, 0.1f)), new C19746412Nq("big_bubble_shrink_alpha", new C0HUY(1.0f, 0.0f)))), false);
                    this.LJIIZILJ = c21647019ng3;
                    c21647019ng3.LIZJ("big_bubble_shrink_alpha", new InterfaceC21641019mi() { // from class: X.0y9I
                        @Override // X.InterfaceC21641019mi
                        public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                        }

                        @Override // X.InterfaceC21641019mi
                        public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                            if (!Intrinsics.LJFF(interfaceC1844880y6o.W5(), Boolean.TRUE) && Intrinsics.LJFF(this.LIZ.LJIIZILJ, c21647019ng3)) {
                                this.LIZ.LJIIZILJ = null;
                                C786410Ut5.Ob(view3, 0.1f);
                                C786410Ut5.pc(view3, 0.1f);
                                C786410Ut5.T4(view3, 0.0f);
                                awS415S0200000_14.invoke();
                            }
                        }
                    });
                    c21647019ng3.LJI(true);
                    LIZIZ(0, 250L);
                }
            }
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(this, 3874);
            View viewInvoke3 = this.LIZLLL.invoke();
            if (viewInvoke3 == null) {
                awS577S0100000_332.invoke();
                return;
            }
            viewInvoke3.animate().cancel();
            C786410Ut5.Ob(viewInvoke3, 0.2f);
            C786410Ut5.pc(viewInvoke3, 0.2f);
            C786410Ut5.ed(viewInvoke3, 0.0f);
            C786410Ut5.T4(viewInvoke3, 0.0f);
            C21646719nd c21646719ndInvoke2 = this.LJI.invoke();
            if (c21646719ndInvoke2 != null) {
                c21646719ndInvoke2.LJIIIIZZ(viewInvoke3, false);
            }
            viewInvoke3.addOnLayoutChangeListener(new C0P4G(viewInvoke3, new C19746612Ns(this, viewInvoke3, awS577S0100000_332), 2));
            viewInvoke3.requestLayout();
            return;
        }
        View view4 = this.LJIILIIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        View view5 = this.LJIIL;
        if (view5 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view5.animate();
            if (viewPropertyAnimatorAnimate != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            C786410Ut5.LJLLLLLL(8, view5);
            LJIIIZ(view5);
        }
        FrameLayout frameLayout2 = this.LJIILJJIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        View viewInvoke4 = this.LIZLLL.invoke();
        if (viewInvoke4 != null) {
            LJIIJ(viewInvoke4);
            C786410Ut5.T4(viewInvoke4, 0.0f);
            C21646719nd c21646719ndInvoke3 = this.LJI.invoke();
            if (c21646719ndInvoke3 != null) {
                c21646719ndInvoke3.LJ(viewInvoke4, this.LJFF.invoke());
            }
        }
        LJIIL(0);
        LJIIIIZZ();
    }

    public final void LIZLLL(float f) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        View view = this.LJIIL;
        if (view == null) {
            return;
        }
        View viewInvoke = this.LIZLLL.invoke();
        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view.animate();
        if (viewPropertyAnimatorAnimate3 != null) {
            viewPropertyAnimatorAnimate3.cancel();
        }
        if (viewInvoke != null && (viewPropertyAnimatorAnimate2 = viewInvoke.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        float f2 = 1.0f - (0.9f * f);
        Pair<Float, Float> pairLJ = this.LJJ;
        if (pairLJ == null) {
            pairLJ = LJ(view);
        }
        float fFloatValue = pairLJ.getFirst().floatValue();
        float fFloatValue2 = pairLJ.getSecond().floatValue();
        view.setPivotX(fFloatValue);
        view.setPivotY(fFloatValue2);
        C786410Ut5.Ob(view, f2);
        C786410Ut5.pc(view, f2);
        float f3 = 1.0f - f;
        C786410Ut5.T4(view, f3);
        int i = 0;
        if (viewInvoke != null) {
            C21646719nd c21646719ndInvoke = this.LJI.invoke();
            if (c21646719ndInvoke != null) {
                float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
                c21646719ndInvoke.LJ = EnumC21646819ne.LLILLL;
                View view2 = c21646719ndInvoke.LIZLLL;
                if ((view2 != null || (view2 = c21646719ndInvoke.LIZ) != null) && (viewPropertyAnimatorAnimate = view2.animate()) != null) {
                    viewPropertyAnimatorAnimate.cancel();
                }
                C786410Ut5.LJLLLLLL(0, viewInvoke);
                c21646719ndInvoke.LIZJ.setDisplayedChild(1);
                C786410Ut5.LJLLLLLL(0, c21646719ndInvoke.LIZJ);
                if (view2 != null) {
                    C786410Ut5.ed(view2, c21646719ndInvoke.LIZIZ(viewInvoke) * (1.0f - fLIZLLL));
                }
            }
            if (viewInvoke.isLaidOut() && viewInvoke.getWidth() > 0) {
                Pair<Float, Float> pairLJFF = LJFF(viewInvoke);
                float fFloatValue3 = pairLJFF.getFirst().floatValue();
                float fFloatValue4 = pairLJFF.getSecond().floatValue();
                viewInvoke.setPivotX(fFloatValue3);
                viewInvoke.setPivotY(fFloatValue4);
                float f4 = (0.8f * f) + 0.2f;
                C786410Ut5.Ob(viewInvoke, f4);
                C786410Ut5.pc(viewInvoke, f4);
                C786410Ut5.T4(viewInvoke, f);
            } else {
                C786410Ut5.T4(viewInvoke, 0.0f);
            }
        }
        View view3 = this.LJIILL;
        if (view3 != null) {
            int i2 = (int) (this.LJJIIJ * f3);
            if (i2 >= 0) {
                i = i2;
            }
            LJIIJJI(i, view3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Float, java.lang.Float> LJ(android.view.View r9) {
        /*
            r8 = this;
            r2 = 2
            int[] r3 = new int[r2]
            r9.getLocationInWindow(r3)
            kotlin.jvm.functions.Function0<android.view.View> r0 = r8.LIZIZ
            java.lang.Object r5 = r0.invoke()
            android.view.View r5 = (android.view.View) r5
            r4 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            if (r5 == 0) goto L64
            int[] r0 = new int[r2]
            r5.getLocationInWindow(r0)
            r0 = r0[r7]
            float r1 = (float) r0
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r4
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L64
            float r6 = r0.floatValue()
        L2c:
            android.view.View r0 = r8.LIZ
            android.view.View r1 = r0.getRootView()
            r0 = 2131367049(0x7f0a1489, float:1.8354009E38)
            android.view.View r1 = r1.findViewById(r0)
            r5 = 1
            if (r1 == 0) goto L60
            int[] r0 = new int[r2]
            r1.getLocationInWindow(r0)
            r0 = r0[r5]
            float r4 = (float) r0
            int r0 = r1.getHeight()
            float r0 = (float) r0
            float r4 = r4 + r0
        L4a:
            kotlin.Pair r2 = new kotlin.Pair
            r0 = r3[r7]
            float r0 = (float) r0
            float r6 = r6 - r0
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            r0 = r3[r5]
            float r0 = (float) r0
            float r4 = r4 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r2.<init>(r1, r0)
            return r2
        L60:
            r0 = r3[r5]
            float r4 = (float) r0
            goto L4a
        L64:
            r0 = r3[r7]
            float r1 = (float) r0
            int r0 = r9.getWidth()
            float r6 = (float) r0
            float r6 = r6 / r4
            float r6 = r6 + r1
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21646519nb.LJ(android.view.View):kotlin.Pair");
    }

    public final Pair<Float, Float> LJFF(View view) {
        boolean z;
        int measuredWidth;
        int measuredHeight;
        float fFloatValue;
        view.getLocationInWindow(new int[2]);
        Integer numValueOf = Integer.valueOf(view.getWidth());
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredWidth = numValueOf.intValue();
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        Integer numValueOf2 = Integer.valueOf(view.getHeight());
        if (numValueOf2.intValue() > 0) {
            measuredHeight = numValueOf2.intValue();
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        float pivotX = r5[0] - ((view.getPivotX() * (1.0f - view.getScaleX())) + view.getTranslationX());
        Float fInvoke = this.LIZJ.invoke();
        if (fInvoke != null) {
            fFloatValue = fInvoke.floatValue();
        } else {
            fFloatValue = (measuredWidth / 2.0f) + pivotX;
        }
        return new Pair<>(Float.valueOf(fFloatValue - pivotX), Float.valueOf((r5[1] + (measuredHeight / 2.0f)) - r5[1]));
    }

    public final void LJIIIZ(View view) {
        C21647019ng c21647019ng = this.LJIIZILJ;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        this.LJIIZILJ = null;
        view.animate().cancel();
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.T4(view, 1.0f);
    }

    public final void LJIIJ(View view) {
        C21647019ng c21647019ng = this.LJIILLIIL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        this.LJIILLIIL = null;
        view.animate().cancel();
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.ed(view, 0.0f);
    }

    public final void LJIIL(int i) {
        ValueAnimator valueAnimator = this.LJJIII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJJIII = null;
        View view = this.LJIILL;
        if (view != null) {
            LJIIJJI(i, view);
        }
    }

    public final void LJIILIIL(boolean z) {
        FrameLayout.LayoutParams layoutParams;
        String strLJFF;
        float f;
        SocialThoughtBaseBubbleBackgroundView socialThoughtBaseBubbleBackgroundView;
        int iIntValue;
        FrameLayout frameLayout = this.LJIILJJIL;
        int i = 8;
        if (frameLayout == null) {
            ViewGroup viewGroup = (ViewGroup) this.LIZ.getRootView().findViewById(R.id.dpp);
            if (viewGroup == null) {
                return;
            }
            if (this.LJIILIIL == null) {
                View view = new View(viewGroup.getContext());
                C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1));
                C786410Ut5.LJLLLLLL(8, view);
                view.setOnTouchListener(new ATListenerS465S0100000_33(this, 6));
                this.LJIILIIL = view;
                viewGroup.addView(view);
            }
            frameLayout = new FrameLayout(viewGroup.getContext());
            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            C786410Ut5.LJZ(8, frameLayout);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            View view2 = new View(viewGroup.getContext());
            C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-1, 0, 8388659));
            view2.setBackgroundColor(C1383370m6R.LJFF(R.attr.zm));
            frameLayout.addView(view2);
            this.LJIILL = view2;
            viewGroup.addView(frameLayout);
            this.LJIILJJIL = frameLayout;
        }
        ThoughtInfo thoughtInfoInvoke = this.LJ.invoke();
        if (thoughtInfoInvoke == null) {
            return;
        }
        if (this.LJIIL == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ.getContext()), R.layout.cq6, frameLayout, false);
            this.LJIIL = viewTd;
            frameLayout.addView(viewTd, new FrameLayout.LayoutParams(-1, -2));
            View view3 = this.LJIIL;
            if (view3 != null && (socialThoughtBaseBubbleBackgroundView = (SocialThoughtBaseBubbleBackgroundView) view3.findViewById(R.id.xty)) != null) {
                socialThoughtBaseBubbleBackgroundView.setBubbleShape(EnumC21568119ax.TOP_LARGE);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zo, socialThoughtBaseBubbleBackgroundView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -1;
                }
                socialThoughtBaseBubbleBackgroundView.setFillColor(iIntValue);
                socialThoughtBaseBubbleBackgroundView.setBubbleAnchor(EnumC19358310oP.NONE);
                socialThoughtBaseBubbleBackgroundView.setReserveShadowOutset(true);
            }
            View view4 = this.LJIIL;
            if (view4 != null) {
                if (C426750GoL.LIZLLL(view4.getContext())) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                View viewFindViewById = view4.findViewById(R.id.xty);
                if (viewFindViewById != null) {
                    C786410Ut5.Ob(viewFindViewById, f);
                }
                View viewFindViewById2 = view4.findViewById(R.id.xtz);
                if (viewFindViewById2 != null) {
                    C786410Ut5.Ob(viewFindViewById2, f);
                }
            }
            View view5 = this.LJIIL;
            if (view5 != null) {
                View viewFindViewById3 = view5.findViewById(R.id.xty);
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setOnTouchListener(new ATListenerS465S0100000_33(this, 7));
                }
                View viewFindViewById4 = view5.findViewById(R.id.xug);
                if (viewFindViewById4 != null) {
                    C786410Ut5.I7(new ACListenerS167S0100000_33(this, 78), viewFindViewById4);
                }
            }
        }
        View view6 = this.LJIIL;
        if (view6 != null) {
            TextView textView = (TextView) view6.findViewById(R.id.xu4);
            C1826440xd4 c1826440xd4 = (C1826440xd4) view6.findViewById(R.id.xtx);
            View viewFindViewById5 = view6.findViewById(R.id.xug);
            if (viewFindViewById5 != null) {
                if (this.LJIIJJI.invoke().booleanValue()) {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, viewFindViewById5);
            }
            String str = "";
            if (textView != null) {
                String string = view6.getContext().getString(2131850195);
                Long l = thoughtInfoInvoke.createTimeMs;
                if (l == null || l.longValue() <= 0 || (strLJFF = C2215101Bmm.LJFF(l.longValue())) == null) {
                    strLJFF = "";
                }
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append((CharSequence) string);
                if (strLJFF.length() > 0) {
                    c1360520lVa.LIZIZ(" · ");
                    c1360520lVa.LIZLLL(strLJFF);
                }
                textView.setText(c1360520lVa.LIZ);
            }
            if (c1826440xd4 != null) {
                c1826440xd4.setGravity(8388627);
                c1826440xd4.setTextAlignment(5);
                c1826440xd4.setFontStepOnOverflow(true);
                c1826440xd4.setAutoSizeSteps(this.LJJIIJZLJL);
                String str2 = thoughtInfoInvoke.textContent;
                if (str2 != null) {
                    str = str2;
                }
                c1826440xd4.setText(str);
            }
            ViewGroup.LayoutParams layoutParams2 = view6.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                C786410Ut5.W5(view6, layoutParams);
            }
            view6.requestLayout();
        }
        View view7 = this.LJIILIIL;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(0, view7);
        }
        C786410Ut5.LJLZ(0, frameLayout);
        View view8 = this.LJIIL;
        if (view8 != null) {
            C786410Ut5.LJLLLLLL(4, view8);
        }
        View view9 = this.LJIIL;
        if (view9 == null) {
            return;
        }
        view9.addOnLayoutChangeListener(new C0P4G(view9, new AwS54S0310000_14(this, view9, frameLayout, z, 2), 2));
        view9.requestLayout();
    }

    public static void LJIIJJI(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (layoutParams.height == i) {
            return;
        }
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public final void LIZ(float f, final Function0<Unit> function0) {
        float f2 = this.LJIL;
        float fAbs = Math.abs(f - f2);
        if (fAbs >= 0.0f && fAbs > 0.0f) {
            this.LJIJ = true;
            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
            long j = (long) (260 * fAbs);
            if (j < 120) {
                j = 120;
            }
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 44));
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.19nc
                public boolean LL;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (this.LL) {
                        return;
                    }
                    C21646519nb c21646519nb = this.LLILLJJLI;
                    if (c21646519nb.LJJII != valueAnimatorOfFloat) {
                        return;
                    }
                    c21646519nb.LJJII = null;
                    function0.invoke();
                }
            });
            this.LJJII = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
            return;
        }
        function0.invoke();
    }

    public final void LIZIZ(int i, long j) {
        int i2;
        View view = this.LJIILL;
        if (view == null) {
            return;
        }
        ValueAnimator valueAnimator = this.LJJIII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.height;
        } else {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 == i) {
            this.LJJIII = null;
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS235S0200000_33(this, view, 5));
        valueAnimatorOfInt.addListener(new ALAdapterS10S0100000_14(this, 1));
        this.LJJIII = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    public C21646519nb(View view, AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142, AwS558S0100000_14 awS558S0100000_143, AwS546S0100000_2 awS546S0100000_2, AwS558S0100000_14 awS558S0100000_144, AwS558S0100000_14 awS558S0100000_145, C1496805tW c1496805tW, C0ZQV c0zqv, AwS546S0100000_2 awS546S0100000_22, C0ZQX c0zqx, AwS546S0100000_2 awS546S0100000_23) {
        this.LIZ = view;
        this.LIZIZ = awS558S0100000_14;
        this.LIZJ = awS558S0100000_142;
        this.LIZLLL = awS558S0100000_143;
        this.LJ = awS546S0100000_2;
        this.LJFF = awS558S0100000_144;
        this.LJI = awS558S0100000_145;
        this.LJII = c1496805tW;
        this.LJIIIIZZ = c0zqv;
        this.LJIIIZ = awS546S0100000_22;
        this.LJIIJ = c0zqx;
        this.LJIIJJI = awS546S0100000_23;
    }
}
