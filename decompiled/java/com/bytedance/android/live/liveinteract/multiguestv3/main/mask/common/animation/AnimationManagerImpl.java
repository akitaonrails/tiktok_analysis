package com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation;

import X.C01GW;
import X.C0VSJ;
import X.C12ES;
import X.C1322110kVd;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1819620xS4;
import X.C20441214yg;
import X.C2188811AlT;
import X.C439101nJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C921180a4y;
import X.C938810aXP;
import X.C941520abm;
import X.C941550abp;
import X.EnumC918990a1R;
import X.InterfaceC937820aVo;
import X.InterfaceC937900aVw;
import X.InterfaceC941540abo;
import X.InterfaceC941570abr;
import X.InterfaceC958970b3v;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class AnimationManagerImpl implements LifecycleObserver, InterfaceC941570abr, GenericLifecycleObserver {
    public final ViewGroup LL;
    public final LifecycleOwner LLILLJJLI;
    public final IThemeAbility LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public final C941520abm LLIZLLLIL;
    public final C01GW LLJ;
    public boolean LLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final View LIZLLL() {
        Context context;
        View viewFindViewById;
        ViewGroup viewGroup = this.LL;
        C1324720kZq c1324720kZq = null;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            ViewGroup viewGroup2 = this.LL;
            if (viewGroup2 != null && (viewFindViewById = viewGroup2.findViewById(R.id.b4c)) != null) {
                return viewFindViewById;
            }
            if (this.LL instanceof FrameLayout) {
                c1324720kZq = new C1324720kZq(context);
                c1324720kZq.setId(R.id.b4c);
                C786410Ut5.u6(c1324720kZq, new FrameLayout.LayoutParams(-1, -1, 3));
                C786410Ut5.LLJJIII(c1324720kZq, 8);
                ViewGroup viewGroup3 = this.LL;
                if (viewGroup3 != null) {
                    viewGroup3.addView(c1324720kZq);
                }
            }
        }
        return c1324720kZq;
    }

    public final void LIZJ() {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        String layoutBusinessType = (interfaceC937900aVwLJIIIIZZ == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) == null) ? null : interfaceC937820aVoLJJJJZ.getLayoutBusinessType();
        if (Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.NORMAL.getBusinessType())) {
            return;
        }
        this.LLILZIL = !(Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT.getBusinessType()) || Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.GRID_FLOAT.getBusinessType())) || C921180a4y.LJIIZILJ(C915980Zwa.LJIIIIZZ()) > 0;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C915980Zwa.LJIIIIZZ().VE2(this.LLIZLLLIL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C915980Zwa.LJIIIIZZ().vq0(this.LLIZLLLIL);
        if (this.LLILZIL) {
            LJ("submit animation onDestroy");
            LJFF(this, new InterfaceC941570abr() { // from class: X.0abn
                @Override // X.InterfaceC941570abr
                public final void LIZ(C941550abp c941550abp) {
                    this.LL.LIZ(c941550abp);
                    View viewLIZLLL = this.LL.LIZLLL();
                    if (viewLIZLLL != null) {
                        C930540aK4.LJJIJL(viewLIZLLL);
                    }
                    ((InterfaceC941540abo) this.LL.LLJ.getValue()).release();
                }

                @Override // X.InterfaceC941570abr
                public final void LIZIZ(C941550abp c941550abp, int i) {
                    this.LL.LIZIZ(c941550abp, i);
                    View viewLIZLLL = this.LL.LIZLLL();
                    if (viewLIZLLL != null) {
                        C930540aK4.LJJIJL(viewLIZLLL);
                    }
                    ((InterfaceC941540abo) this.LL.LLJ.getValue()).release();
                }
            });
        }
        this.LLILLJJLI.getLifecycle().removeObserver(this);
    }

    @Override // X.InterfaceC941570abr
    public final void LIZ(C941550abp c941550abp) {
        View viewLIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after ");
        sbLIZ.append(c941550abp.LIZIZ);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.equals(c941550abp.LIZIZ, "AnimationManager_FadeOut") && (viewLIZLLL = LIZLLL()) != null) {
            C439101nJ.LJI(viewLIZLLL);
        }
    }

    public final void LJ(String str) {
        Integer numValueOf;
        View viewFindViewById;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationManager");
        sbLIZ.append(hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(' ');
        ViewGroup viewGroup = this.LL;
        Integer numValueOf2 = null;
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.b4_)) != null) {
            numValueOf = Integer.valueOf(viewFindViewById.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(' ');
        View viewLIZLLL = LIZLLL();
        if (viewLIZLLL != null) {
            numValueOf2 = Integer.valueOf(viewLIZLLL.hashCode());
        }
        sbLIZ2.append(numValueOf2);
        sbLIZ2.append(' ');
        sbLIZ2.append(this.LLJI);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC941570abr
    public final void LIZIZ(C941550abp c941550abp, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reject ");
        sbLIZ.append(c941550abp.LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF(InterfaceC941570abr interfaceC941570abr, InterfaceC941570abr interfaceC941570abr2) {
        ObjectAnimator objectAnimatorOfFloat;
        ViewGroup viewGroup;
        View viewFindViewById;
        C1322110kVd c1322110kVd;
        C1324720kZq c1324720kZq;
        FrameLayout.LayoutParams layoutParams;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        C938810aXP state;
        String str = null;
        if (LIZLLL() != null && (objectAnimatorOfFloat = ObjectAnimator.ofFloat(LIZLLL(), (Property<View, Float>) View.ALPHA, 1.0f, 0.01f)) != null && (viewGroup = this.LL) != null && viewGroup.findViewById(R.id.b4_) != null) {
            ViewGroup viewGroup2 = this.LL;
            if (viewGroup2 != null) {
                viewFindViewById = viewGroup2.findViewById(R.id.b4_);
            } else {
                viewFindViewById = null;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.ALPHA, 0.01f, 1.0f);
            if (objectAnimatorOfFloat2 != null) {
                View viewLIZLLL = LIZLLL();
                if (viewLIZLLL != null) {
                    C12ES.LJIILL(0, viewLIZLLL);
                }
                IThemeAbility iThemeAbility = this.LLILLL;
                if (iThemeAbility != null && (multiGuestThemeViewModelMG0 = iThemeAbility.MG0()) != null && (state = multiGuestThemeViewModelMG0.getState()) != null) {
                    str = state.LLILLL;
                }
                View viewLIZLLL2 = LIZLLL();
                if (str != null && str.length() != 0) {
                    if ((viewLIZLLL2 instanceof C1324720kZq) && (c1324720kZq = (C1324720kZq) viewLIZLLL2) != null) {
                        c1324720kZq.setBackgroundResource(0);
                        C915980Zwa.LJIIIIZZ();
                        Rect rectLJFF = C921180a4y.LJFF();
                        if (rectLJFF != null) {
                            int iHeight = rectLJFF.height();
                            int iWidth = rectLJFF.width();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("submitAnimation shareWidth:");
                            sbLIZ.append(iWidth);
                            sbLIZ.append(" shareHeight:");
                            sbLIZ.append(iHeight);
                            sbLIZ.append(" shareBgRect:");
                            sbLIZ.append(rectLJFF);
                            LJ(C2188811AlT.LIZIZ(sbLIZ));
                            ViewGroup.LayoutParams layoutParams2 = c1324720kZq.getLayoutParams();
                            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                                layoutParams.topMargin = rectLJFF.top;
                                layoutParams.leftMargin = rectLJFF.left;
                                layoutParams.width = iWidth;
                                layoutParams.height = iHeight;
                                C786410Ut5.u6(c1324720kZq, layoutParams);
                                C1324610kZf c1324610kZfLJIIJ = C1819620xS4.LIZ().LJIIJ(new C0VSJ(str));
                                c1324610kZfLJIIJ.LJ = iWidth;
                                c1324610kZfLJIIJ.LJFF = iHeight;
                                c1324610kZfLJIIJ.LJJI(c1324720kZq);
                            }
                        }
                    }
                } else {
                    if ((viewLIZLLL2 instanceof C1324720kZq) && (c1322110kVd = (C1322110kVd) viewLIZLLL2) != null) {
                        c1322110kVd.setActualImageResource(0);
                    }
                    if (viewLIZLLL2 != null) {
                        viewLIZLLL2.setBackgroundResource(R.drawable.dv_);
                    }
                }
                if (this.LLJI) {
                    objectAnimatorOfFloat.setDuration(800L);
                    objectAnimatorOfFloat2.setDuration(600L);
                } else {
                    objectAnimatorOfFloat.setDuration(400L);
                    objectAnimatorOfFloat2.setDuration(300L);
                }
                C941550abp c941550abp = new C941550abp(objectAnimatorOfFloat, "AnimationManager_FadeOut", 0L);
                C941550abp c941550abp2 = new C941550abp(objectAnimatorOfFloat2, "AnimationManager_FadeIn", 100L);
                ((InterfaceC941540abo) this.LLJ.getValue()).LJI(c941550abp, interfaceC941570abr);
                ((InterfaceC941540abo) this.LLJ.getValue()).LJI(c941550abp2, interfaceC941570abr2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0abm] */
    public AnimationManagerImpl(ViewGroup viewGroup, LifecycleOwner lifecycleOwner, IThemeAbility iThemeAbility) {
        this.LL = viewGroup;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = iThemeAbility;
        new Rect();
        this.LLIZLLLIL = new InterfaceC958970b3v() { // from class: X.0abm
            @Override // X.InterfaceC958970b3v
            public final void LIZJ(int i, List list) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJIJL(C2180891AWx c2180891AWx) {
            }

            @Override // X.InterfaceC958970b3v
            public final boolean LJJJIL() {
                return true;
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIIIL(Map map) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJJJ() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLLL(List list, boolean z) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJJI() {
                this.LL.LIZJ();
            }

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
            @Override // X.InterfaceC958970b3v
            public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
                if (!interfaceC937820aVo.LJZI()) {
                    String layoutId = interfaceC937820aVo.getLayoutId();
                    String str = this.LL.LLILZ;
                    if (str != null && layoutId != null && !Intrinsics.LJFF(str, layoutId)) {
                        this.LL.LJ("submit animation onLayoutSwitch");
                        AnimationManagerImpl animationManagerImpl = this.LL;
                        animationManagerImpl.LJ("showAnimation");
                        animationManagerImpl.LJFF(animationManagerImpl, animationManagerImpl);
                    }
                    this.LL.LLILZ = layoutId;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
            
                r8.LL.LJ("submit animation on window cnt change");
                r0 = r8.LL;
                r0.LJ("showAnimation");
                r0.LJFF(r0, r0);
             */
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
            @Override // X.InterfaceC958970b3v
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LLIILII(X.InterfaceC937820aVo r9, int r10) {
                /*
                    r8 = this;
                    boolean r0 = r9.LJZI()
                    if (r0 == 0) goto La6
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r0 = r8.LL
                    r0.LIZJ()
                    java.lang.String r4 = r9.getRealDrawLayoutId()
                    java.util.List r0 = r9.getAllLayoutWindows()
                    int r3 = r0.size()
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r0 = r8.LL
                    java.lang.String r7 = r0.LLILZ
                    com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
                    X.0aVw r0 = X.C921180a4y.LJIIIIZZ(r0)
                    if (r0 == 0) goto La4
                    com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r0 = r0.LJJLIIIJLLLLLLLZ()
                    if (r0 == 0) goto La4
                    boolean r0 = r0.isFixedType()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                L33:
                    boolean r2 = X.C500260Jjc.LJJJI(r0)
                    X.01GW<X.0aFK> r0 = X.C927600aFK.LIZIZ
                    X.0aFK r0 = X.C307001Gy.LIZ()
                    r0.getClass()
                    X.0a1R r1 = X.C927600aFK.LJFF()
                    X.0a1R r0 = X.EnumC918990a1R.GRID_FLOAT
                    r6 = 1
                    if (r1 != r0) goto La2
                    r0 = 1
                L4a:
                    java.lang.String r5 = "showAnimation"
                    if (r0 == 0) goto L7e
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r4)
                    if (r0 == 0) goto L7e
                    r1 = 2
                    if (r3 != r1) goto L66
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r0 = r8.LL
                    int r0 = r0.LLILZLL
                    if (r0 == r6) goto L6e
                L5d:
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r0 = r8.LL
                    r0.LLILZ = r4
                    r0.LLILZLL = r3
                    r0.LLIZ = r2
                    return
                L66:
                    if (r3 != r6) goto L5d
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r0 = r8.LL
                    int r0 = r0.LLILZLL
                    if (r0 != r1) goto L5d
                L6e:
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r1 = r8.LL
                    java.lang.String r0 = "submit animation on window cnt change"
                    r1.LJ(r0)
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r0 = r8.LL
                    r0.LJ(r5)
                    r0.LJFF(r0, r0)
                    goto L5d
                L7e:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r4)
                    if (r0 != 0) goto L5d
                    if (r7 == 0) goto L5d
                    if (r4 == 0) goto L5d
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r1 = r8.LL
                    boolean r0 = r1.LLIZ
                    if (r0 != 0) goto L94
                    if (r2 != 0) goto L94
                    int r0 = r1.LLILZLL
                    if (r3 == r0) goto L5d
                L94:
                    java.lang.String r0 = "submit animation onLayoutSwitch"
                    r1.LJ(r0)
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r0 = r8.LL
                    r0.LJ(r5)
                    r0.LJFF(r0, r0)
                    goto L5d
                La2:
                    r0 = 0
                    goto L4a
                La4:
                    r0 = 0
                    goto L33
                La6:
                    com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl r0 = r8.LL
                    r0.LIZJ()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C941520abm.LLIILII(X.0aVo, int):void");
            }

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
            @Override // X.InterfaceC958970b3v
            public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                if (C927600aFK.LJFF() == EnumC918990a1R.GRID_FLOAT) {
                    int size = c2180891AWx.getAllLayoutWindows().size();
                    if (size == 2) {
                        if (i != 1) {
                            return;
                        }
                    } else if (size != 1 || i != 2) {
                        return;
                    }
                    this.LL.LJ("submit animation onLayoutSwitch");
                    AnimationManagerImpl animationManagerImpl = this.LL;
                    animationManagerImpl.LJ("showAnimation");
                    animationManagerImpl.LJFF(animationManagerImpl, animationManagerImpl);
                }
            }
        };
        this.LLJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(99));
        this.LLJI = true;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
