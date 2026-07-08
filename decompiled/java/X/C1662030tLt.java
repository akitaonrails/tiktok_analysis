package X;

import Y.ARunnableS58S0300000_25;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS569S0100000_25;
import mf.a;
import oyl.d0;

/* JADX INFO: renamed from: X.0tLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1662030tLt {
    public final Function0<d0> LIZ;
    public final C01GW LIZIZ;
    public final HashMap<EnumC1651790t5N, C1662100tM0> LIZJ;

    public C1662030tLt() {
        this(null);
    }

    public final WeakHashMap<EnumC1651790t5N, Pair<ViewGroup, AbstractC1662050tLv>> LIZJ() {
        return (WeakHashMap) this.LIZIZ.getValue();
    }

    public C1662030tLt(Function0<d0> function0) {
        this.LIZ = function0;
        this.LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(481));
        this.LIZJ = new HashMap<>();
    }

    public final void LIZIZ(EnumC441770HTz enumC441770HTz) {
        C441730HTv c441730HTv;
        Pair<ViewGroup, AbstractC1662050tLv> pair = LIZJ().get(EnumC1651790t5N.TUX_TIP_AI_LIVE_PROGRESS);
        AbstractC1662050tLv second = null;
        if (pair != null) {
            second = pair.getSecond();
        }
        if ((second instanceof C441730HTv) && (c441730HTv = (C441730HTv) second) != null) {
            c441730HTv.LLIZLLLIL = enumC441770HTz;
        }
    }

    public final boolean LJI(EnumC1651790t5N enumC1651790t5N) {
        Pair<ViewGroup, AbstractC1662050tLv> pair = LIZJ().get(enumC1651790t5N);
        if (pair == null) {
            return false;
        }
        return pair.getSecond().isShowing();
    }

    public AbstractC1662050tLv LIZ(ViewGroup viewGroup, C1654400t9a c1654400t9a, C1662100tM0 c1662100tM0) {
        AbstractC1662050tLv second;
        int i = C1662080tLy.LIZ[c1662100tM0.LJIIIZ.ordinal()];
        final int i2 = 0;
        final AttributeSet attributeSet = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new C1663510tOH(c1654400t9a, viewGroup.getContext());
                    }
                    throw new C1954807lC();
                }
                return new AbstractC1662050tLv(viewGroup.getContext()) { // from class: X.0HU1
                    public final C01GW LL;
                    public final C01GW LLILLJJLI;

                    private final ContextThemeWrapper getDarkContext() {
                        return (ContextThemeWrapper) this.LLILLJJLI.getValue();
                    }

                    private final TuxTextView getTvPromote() {
                        return (TuxTextView) this.LL.getValue();
                    }

                    {
                        ViewGroup.LayoutParams layoutParams;
                        super(context, null, 0);
                        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1268));
                        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1267));
                        C786410Ut5.Sd(R.layout.wx, C786410Ut5.ne(context), this);
                        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = C1659140tHE.LLJJL;
                        }
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getDarkContext());
                        if (numLIZJ != null) {
                            getTvPromote().setTextColor(numLIZJ.intValue());
                        }
                        View viewFindViewById = findViewById(R.id.s_d);
                        if (viewFindViewById != null) {
                            C426750GoL.LJIIL(viewFindViewById, null, Integer.valueOf((C1659140tHE.LLJJL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) / 2), null, null, 29);
                        }
                        TuxTextView tvPromote = getTvPromote();
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                        tvPromote.setBackground(c384050F3z.LIZ(context));
                        TuxTextView tvPromote2 = getTvPromote();
                        if (tvPromote2 != null && (layoutParams = tvPromote2.getLayoutParams()) != null) {
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        }
                        TuxTextView tvPromote3 = getTvPromote();
                        if (tvPromote3 != null) {
                            tvPromote3.requestLayout();
                        }
                        int visibility = getVisibility();
                        setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, this);
                    }

                    @Override // X.AbstractC1662050tLv
                    public final void h0(Function0 function0, boolean z) {
                        int visibility = getVisibility();
                        setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, this);
                        ((AwS153S0400000_25) function0).invoke();
                    }

                    @Override // X.AbstractC1662050tLv
                    public final void i0(C1662100tM0 c1662100tM02, View view) {
                        int visibility = getVisibility();
                        setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, this);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setAlpha(0.0f);
                        getTvPromote().setText(c1662100tM02.LIZJ);
                        animate().alpha(1.0f).setDuration(300L).start();
                    }
                };
            }
            final Context context = viewGroup.getContext();
            return new AbstractC1662050tLv(context, attributeSet, i2) { // from class: X.0tM2
                public final C01GW LL;
                public final C01GW LLILLJJLI;
                public final C01GW LLILLL;
                public final C01GW LLILZ;
                public final C01GW LLILZIL;

                private final View getBgView() {
                    return (View) this.LLILLJJLI.getValue();
                }

                private final View getNewItemContainer() {
                    return (View) this.LL.getValue();
                }

                private final TuxTextView getTvHint() {
                    return (TuxTextView) this.LLILZ.getValue();
                }

                private final TuxTextView getTvItemName() {
                    return (TuxTextView) this.LLILZIL.getValue();
                }

                private final C1295960jpS getTwinkle() {
                    return (C1295960jpS) this.LLILLL.getValue();
                }

                @Override // X.AbstractC1662050tLv
                public final void h0(Function0 function0, boolean z) {
                    if (z && getVisibility() == 0) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.gh);
                        animationLoadAnimation.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 1.0f, 1.0f));
                        final AwS153S0400000_25 awS153S0400000_25 = (AwS153S0400000_25) function0;
                        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.0tM1
                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationStart(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                C1662120tM2 c1662120tM2 = this.LIZ;
                                int visibility = c1662120tM2.getVisibility();
                                c1662120tM2.setVisibility(4);
                                C1602160rnK.LIZIZ(visibility, 4, c1662120tM2);
                                awS153S0400000_25.invoke();
                            }
                        });
                        getNewItemContainer().startAnimation(animationLoadAnimation);
                        getBgView().startAnimation(animationLoadAnimation);
                        return;
                    }
                    int visibility = getVisibility();
                    setVisibility(4);
                    C1602160rnK.LIZIZ(visibility, 4, this);
                    ((AwS153S0400000_25) function0).invoke();
                }

                @Override // X.AbstractC1662050tLv
                public final void i0(C1662100tM0 c1662100tM02, View view) {
                    int i3;
                    getTvHint().setText(c1662100tM02.LIZIZ);
                    getTvItemName().setText(c1662100tM02.LIZJ);
                    TuxTextView tvHint = getTvHint();
                    int i4 = 8;
                    if (C123100dR.LIZ(c1662100tM02.LIZIZ)) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    C786410Ut5.LLLLZLL(tvHint, i3);
                    TuxTextView tvItemName = getTvItemName();
                    if (C123100dR.LIZ(c1662100tM02.LIZJ)) {
                        i4 = 0;
                    }
                    C786410Ut5.LLLLZLL(tvItemName, i4);
                    int visibility = getVisibility();
                    setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, this);
                    ViewGroup.LayoutParams layoutParams = getTwinkle().getLayoutParams();
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                    C786410Ut5.s6(getTwinkle(), layoutParams);
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.gg);
                    animationLoadAnimation.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 1.0f, 1.0f));
                    C786410Ut5.LJLLLLLL(0, getNewItemContainer());
                    C786410Ut5.LJLLLLLL(0, getBgView());
                    getNewItemContainer().startAnimation(animationLoadAnimation);
                    getBgView().startAnimation(animationLoadAnimation);
                    if (c1662100tM02.LIZLLL) {
                        getTwinkle().playAnimation();
                    }
                }

                {
                    super(context, attributeSet, i2);
                    this.LL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 897));
                    this.LLILLJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 896));
                    this.LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 900));
                    this.LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 898));
                    this.LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 899));
                    C786410Ut5.Sd(R.layout.ww, C786410Ut5.ne(context), this);
                    int visibility = getVisibility();
                    setVisibility(4);
                    C1602160rnK.LIZIZ(visibility, 4, this);
                }
            };
        }
        Pair<ViewGroup, AbstractC1662050tLv> pair = LIZJ().get(c1662100tM0.LIZ);
        if (pair != null && (second = pair.getSecond()) != null) {
            return second;
        }
        if (c1662100tM0.LIZ == EnumC1651790t5N.TUX_TIP_AI_LIVE_PROGRESS) {
            return new C441730HTv(c1654400t9a.LIZIZ, c1654400t9a.LJFF, viewGroup.getContext());
        }
        return new C441690HTr(viewGroup.getContext(), null, 0);
    }

    public final void LIZLLL(boolean z, boolean z2, boolean z3) {
        Iterator<Map.Entry<EnumC1651790t5N, Pair<ViewGroup, AbstractC1662050tLv>>> it2 = LIZJ().entrySet().iterator();
        while (it2.hasNext()) {
            LJFF(this, it2.next().getKey(), z, 16);
        }
    }

    public final void LJII(final ViewGroup viewGroup, final C1654400t9a c1654400t9a, final C1662100tM0 c1662100tM0) {
        final View view;
        if (c1662100tM0.LJIIIZ == EnumC1662090tLz.TUX_TIP) {
            view = c1654400t9a.LIZJ;
        } else {
            view = c1654400t9a.LIZ;
        }
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0tLu
            public final void LIZ() {
                d0 d0VarInvoke;
                if (view.getParent() == null) {
                    return;
                }
                final AbstractC1662050tLv abstractC1662050tLvLIZ = this.LIZ(viewGroup, c1654400t9a, c1662100tM0);
                if (abstractC1662050tLvLIZ.isShowing()) {
                    return;
                }
                Function0<Unit> function0 = c1662100tM0.LJIIJJI;
                if (function0 != null) {
                    function0.invoke();
                }
                if (c1662100tM0.LJIIIZ == EnumC1662090tLz.NORMAL) {
                    int visibility = abstractC1662050tLvLIZ.getVisibility();
                    abstractC1662050tLvLIZ.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, abstractC1662050tLvLIZ);
                    final View view2 = view;
                    final C1662030tLt c1662030tLt = this;
                    final C1662100tM0 c1662100tM02 = c1662100tM0;
                    View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0tLx
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            AbstractC1662050tLv abstractC1662050tLv = abstractC1662050tLvLIZ;
                            int visibility2 = abstractC1662050tLv.getVisibility();
                            abstractC1662050tLv.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility2, 8, abstractC1662050tLv);
                            View view4 = view2;
                            HandlerHook.viewPost(view4, new ARunnableS58S0300000_25(view4, c1662030tLt, c1662100tM02, 11));
                        }
                    };
                    if (C1848410yCV.LIZ) {
                        fVar = new f(fVar);
                    }
                    a aVar = new a(fVar);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(abstractC1662050tLvLIZ);
                    }
                    abstractC1662050tLvLIZ.setOnClickListener(aVar);
                    Function0<d0> function02 = this.LIZ;
                    if (function02 != null && (d0VarInvoke = function02.invoke()) != null) {
                        d0VarInvoke.LJIIZILJ();
                    }
                }
                abstractC1662050tLvLIZ.e0(viewGroup, c1662100tM0, view);
                abstractC1662050tLvLIZ.i0(c1662100tM0, view);
                this.LIZJ().put(c1662100tM0.LIZ, new Pair<>(viewGroup, abstractC1662050tLvLIZ));
                HashMap<EnumC1651790t5N, C1662100tM0> map = this.LIZJ;
                C1662100tM0 c1662100tM03 = c1662100tM0;
                map.put(c1662100tM03.LIZ, c1662100tM03);
                C1662100tM0 c1662100tM04 = c1662100tM0;
                if (c1662100tM04.LJ > 0) {
                    HandlerHook.viewPostDelay(view, new ARunnableS58S0300000_25(abstractC1662050tLvLIZ, this, c1662100tM04, 12), c1662100tM04.LJ);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ToolbarPromoteManager@af2b.showPromote$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ToolbarPromoteManager@af2b.showPromote$1");
            }
        });
    }

    public static void LJFF(C1662030tLt c1662030tLt, EnumC1651790t5N enumC1651790t5N, boolean z, int i) {
        d0 d0VarInvoke;
        Function0<d0> function0 = c1662030tLt.LIZ;
        if (function0 != null && (d0VarInvoke = function0.invoke()) != null) {
            d0VarInvoke.LJIJI();
        }
        Pair<ViewGroup, AbstractC1662050tLv> pair = c1662030tLt.LIZJ().get(enumC1651790t5N);
        C1662100tM0 c1662100tM0 = c1662030tLt.LIZJ.get(enumC1651790t5N);
        if (pair != null) {
            ViewGroup first = pair.getFirst();
            AbstractC1662050tLv second = pair.getSecond();
            second.h0(new AwS153S0400000_25(c1662100tM0, (C1662100tM0) null, (Function0<Unit>) second, (AbstractC1662050tLv) first, (ViewGroup) 11), z);
        }
    }
}
