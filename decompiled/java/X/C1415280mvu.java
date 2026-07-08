package X;

import Y.ACListenerS156S0100000_22;
import Y.ATListenerS455S0100000_22;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectLayoutManager;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1415280mvu extends AbstractC1664490tPr<C1412020mqe, C1415240mvq> {
    public static final int LLLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
    public final VideoPublishEditModel LLJJJIL;
    public RecyclerView LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public ValueAnimator LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxTextView LLJLIL;
    public View LLJLILLLLZIIL;
    public int LLJLL;
    public ViewOnClickListenerC1419140n28 LLJLLIL;
    public boolean LLJLLL;
    public float LLJZIJLIL;
    public long LLLFFI;
    public String LLJZ = "";
    public final C01GW LLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 693));
    public final C0E99 LLLF = C0E99.EDIT_PAGE;
    public final Map<Integer, Float> LLLFF = new LinkedHashMap();
    public boolean LLLFZ = true;

    public void LLLLLJLJLL() {
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mqo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1412020mqe) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 468));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mqj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LJIIJ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 472));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mw3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LIZLLL;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 473));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mw0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 474));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mqk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C1412020mqe) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 463));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mvx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1412020mqe) obj).LJI);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 464));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mvz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 465));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0muI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LIZJ;
            }
        }, new AwS601S0100000_22(this, 466));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mqf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1412020mqe) obj).LJII);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 467));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0mqg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LJIIIIZZ;
            }
        }, new AwS601S0100000_22(this, 469));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0mqh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LJIIIZ;
            }
        }, new AwS601S0100000_22(this, 470));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mqi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LJIIJJI;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 471));
    }

    public C1415280mvu(VideoPublishEditModel videoPublishEditModel) {
        this.LLJJJIL = videoPublishEditModel;
    }

    public final void LLLLLJIL(final boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        final int i2;
        final ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        View view = this.LLJJJJLIIL;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = null;
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams = null;
        }
        int i3 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        float fLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
        C1415220mvo.LLLILZLLLI.getClass();
        int i4 = (int) (fLIZIZ - C1415220mvo.LLLJIL);
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            i3 = marginLayoutParams3.topMargin;
        }
        final int iLIZIZ = (i3 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
        if (z) {
            i2 = i4;
        } else {
            i2 = iLIZIZ;
            iLIZIZ = i4;
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.T4(view2, f);
        }
        if (!z) {
            View view3 = this.LLJJJJJIL;
            if (view3 != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
                if (c19me != null) {
                    c19me.topToTop = R.id.tqy;
                    c19me.bottomToTop = -1;
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = i4;
                }
            } else {
                c19me = null;
            }
            View view4 = this.LLJJJJJIL;
            if (view4 != null) {
                C786410Ut5.W5(view4, c19me);
            }
        }
        ValueAnimator valueAnimator = this.LLJJL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfFloat.setDuration(200L);
        View view5 = this.LLJJJJJIL;
        if (view5 != null) {
            layoutParams3 = view5.getLayoutParams();
        }
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0mvt
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float animatedFraction;
                    marginLayoutParams2.topMargin = (int) (((i2 - iLIZIZ) * valueAnimator2.getAnimatedFraction()) + iLIZIZ);
                    View view6 = this.LLJLILLLLZIIL;
                    if (view6 != null) {
                        if (z) {
                            animatedFraction = valueAnimator2.getAnimatedFraction();
                        } else {
                            animatedFraction = 1 - valueAnimator2.getAnimatedFraction();
                        }
                        C786410Ut5.T4(view6, animatedFraction);
                    }
                    View view7 = this.LLJJJJJIL;
                    if (view7 != null) {
                        C786410Ut5.W5(view7, marginLayoutParams2);
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0mvs
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    ViewGroup.LayoutParams layoutParams5;
                    C19ME c19me2;
                    int i5;
                    C1415280mvu c1415280mvu = this.LL;
                    boolean z2 = z;
                    View view6 = c1415280mvu.LLJJJJJIL;
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = null;
                    if (view6 != null) {
                        layoutParams5 = view6.getLayoutParams();
                    } else {
                        layoutParams5 = null;
                    }
                    if (layoutParams5 instanceof C19ME) {
                        c19me2 = (C19ME) layoutParams5;
                    } else {
                        c19me2 = null;
                    }
                    View view7 = c1415280mvu.LLJJJJLIIL;
                    if (view7 != null) {
                        ViewGroup.LayoutParams layoutParams6 = view7.getLayoutParams();
                        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams6;
                        }
                        if (marginLayoutParams4 != null) {
                            i5 = marginLayoutParams4.topMargin;
                        } else {
                            i5 = 0;
                        }
                        int iLIZIZ2 = (i5 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                        if (z2) {
                            if (c19me2 != null) {
                                c19me2.bottomToTop = R.id.sww;
                                c19me2.topToTop = -1;
                                ((ViewGroup.MarginLayoutParams) c19me2).topMargin = 0;
                            }
                            View view8 = c1415280mvu.LLJLILLLLZIIL;
                            if (view8 != null) {
                                C786410Ut5.LJLLLLLL(0, view8);
                            }
                        } else {
                            if (c19me2 != null) {
                                c19me2.topToTop = R.id.tqy;
                                c19me2.bottomToTop = -1;
                                ((ViewGroup.MarginLayoutParams) c19me2).topMargin = iLIZIZ2;
                            }
                            View view9 = c1415280mvu.LLJLILLLLZIIL;
                            if (view9 != null) {
                                C786410Ut5.LJLLLLLL(4, view9);
                            }
                        }
                        View view10 = c1415280mvu.LLJJJJJIL;
                        if (view10 != null) {
                            C786410Ut5.W5(view10, c19me2);
                        }
                    }
                }
            });
            this.LLJJL = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        }
    }

    public final void LLLLLLJ(boolean z) {
        if (z) {
            C1295960jpS c1295960jpS = (C1295960jpS) this.LLL.getValue();
            if (c1295960jpS != null) {
                C786410Ut5.LLD(0, c1295960jpS);
            }
            C1295960jpS c1295960jpS2 = (C1295960jpS) this.LLL.getValue();
            if (c1295960jpS2 != null) {
                c1295960jpS2.playAnimation();
                return;
            }
            return;
        }
        C1295960jpS c1295960jpS3 = (C1295960jpS) this.LLL.getValue();
        if (c1295960jpS3 != null) {
            C786410Ut5.LLD(8, c1295960jpS3);
        }
        C1295960jpS c1295960jpS4 = (C1295960jpS) this.LLL.getValue();
        if (c1295960jpS4 == null) {
            return;
        }
        c1295960jpS4.pauseAnimation();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLLJLJLL();
    }

    public static void LLLLLLIL(C1415280mvu c1415280mvu, boolean z) {
        c1415280mvu.LLLLIL().LJIILL.invoke(Boolean.valueOf(z), true);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView.LayoutManager layoutManager;
        RecommendEffectLayoutManager recommendEffectLayoutManager;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.LLJJJJ;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof RecommendEffectLayoutManager) {
            recommendEffectLayoutManager = (RecommendEffectLayoutManager) layoutManager;
        } else {
            recommendEffectLayoutManager = null;
        }
        if (recommendEffectLayoutManager != null) {
            int i = recommendEffectLayoutManager.LLILLJJLI;
            if (i != -1) {
                recommendEffectLayoutManager.LL = i;
            }
            recommendEffectLayoutManager.LL = Math.min(Math.max(0, recommendEffectLayoutManager.LL), recommendEffectLayoutManager.getItemCount() - 1);
            recommendEffectLayoutManager.LLILLJJLI = -1;
            View view2 = recommendEffectLayoutManager.LLILZIL;
            if (view2 != null) {
                view2.setSelected(false);
                recommendEffectLayoutManager.LLILZIL = null;
            }
            RecyclerView recyclerView2 = recommendEffectLayoutManager.LLILZLL;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(recommendEffectLayoutManager.LLILZ);
            }
            recommendEffectLayoutManager.LLILLL.LIZIZ(null);
        }
        RecyclerView recyclerView3 = this.LLJJJJ;
        if (recyclerView3 != null) {
            final float fFloatValue = LLLLIL().LJIIIZ.invoke().floatValue();
            recyclerView3.addItemDecoration(new C0DXR(fFloatValue) { // from class: X.0GhK
                public final float LL;

                {
                    this.LL = fFloatValue;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view3, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    float f = this.LL;
                    float f2 = 2;
                    int i2 = (int) (f / f2);
                    rect.left = i2;
                    rect.right = (int) (f / f2);
                    if (r0 + i2 < f) {
                        rect.left = i2 + 1;
                    }
                }
            });
        }
        RecyclerView recyclerView4 = this.LLJJJJ;
        if (recyclerView4 != null) {
            RecommendEffectLayoutManager recommendEffectLayoutManager2 = new RecommendEffectLayoutManager();
            recommendEffectLayoutManager2.LLJILJILJ = new AwS566S0100000_22(this, 695);
            RecyclerView recyclerView5 = this.LLJJJJ;
            if (recyclerView5 != null) {
                recommendEffectLayoutManager2.LLILZLL = recyclerView5;
                recommendEffectLayoutManager2.LL = Math.max(0, -1);
                recyclerView5.setLayoutManager(recommendEffectLayoutManager2);
                recommendEffectLayoutManager2.LLILLL.LIZIZ(recyclerView5);
                recyclerView5.addOnScrollListener(recommendEffectLayoutManager2.LLILZ);
                recommendEffectLayoutManager2.LLIZ = new C1415420mw8(this);
                recommendEffectLayoutManager2.LLIZLLLIL = new C1415390mw5(this);
                recyclerView4.setLayoutManager(recommendEffectLayoutManager2);
            } else {
                "The attach RecycleView must not null!!".toString();
                throw new IllegalArgumentException("The attach RecycleView must not null!!");
            }
        }
        RecyclerView recyclerView6 = this.LLJJJJ;
        if (recyclerView6 != null) {
            recyclerView6.setOnTouchListener(new ATListenerS455S0100000_22(this, 4));
        }
        LLLLLLIL(this, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0143 A[PHI: r3
      0x0143: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:43:0x0141, B:41:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLL(com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem r8, int r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1415280mvu.LLLLLL(com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem, int, java.lang.String):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.te, viewGroup, false);
        this.LLJJJJLIIL = viewGroup2.findViewById(R.id.exn);
        this.LLJJJJJIL = viewGroup2.findViewById(R.id.swz);
        TuxIconView tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.swx);
        C786410Ut5.a9(tuxIconView, new ACListenerS156S0100000_22(this, 30));
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
        View viewFindViewById = viewGroup2.findViewById(R.id.e2w);
        C786410Ut5.I7(new ACListenerS156S0100000_22(this, 31), viewFindViewById);
        this.LLJL = viewFindViewById;
        TuxTextView tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.sx3);
        this.LLJLIL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS156S0100000_22(this, 32));
        }
        this.LLJJJJ = (RecyclerView) viewGroup2.findViewById(R.id.twv);
        this.LLJLILLLLZIIL = viewGroup2.findViewById(R.id.sww);
        Integer numValueOf = Integer.valueOf(ScreenUtils.getFullScreenHeight(C0CHQ.LIZ));
        if (numValueOf.intValue() <= 667) {
            ViewGroup.LayoutParams layoutParams = null;
            if (1 != 0) {
                int iIntValue = numValueOf.intValue();
                View view = (View) this.LLL.getValue();
                if (view != null) {
                    layoutParams = view.getLayoutParams();
                }
                if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.topMargin = iIntValue / 4;
                }
            }
        }
        ViewOnClickListenerC1419140n28 viewOnClickListenerC1419140n28 = new ViewOnClickListenerC1419140n28(new AwS566S0100000_22(this, 701));
        viewOnClickListenerC1419140n28.LLILLL = new InterfaceC1415820mwm() { // from class: X.0mvv
            @Override // X.InterfaceC1415820mwm
            public final void LIZ(int i) {
                RecyclerView recyclerView = this.LIZ.LLJJJJ;
                if (recyclerView != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof RecommendEffectLayoutManager) && layoutManager != null) {
                        layoutManager.smoothScrollToPosition(recyclerView, null, i);
                    }
                }
                if (((RecommendEffectItem) ListProtector.get(this.LIZ.LLLLILI().LIZ.LIZLLL, i)).LIZIZ) {
                    this.LIZ.LLLLIL().LJII.invoke(Boolean.FALSE, 3000L);
                } else {
                    this.LIZ.LLLLIL().LJII.invoke(Boolean.TRUE, null);
                }
            }

            @Override // X.InterfaceC1415820mwm
            public final void LIZIZ(int i, String str) {
                if (this.LIZ.LLLLILI().LIZ.LIZ) {
                    this.LIZ.LLLLIL().LJIIL.invoke(Integer.valueOf(i), str);
                }
            }
        };
        this.LLJLLIL = viewOnClickListenerC1419140n28;
        new C1415440mwA(this);
        RecyclerView recyclerView = this.LLJJJJ;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LLJLLIL);
        }
        return viewGroup2;
    }
}
