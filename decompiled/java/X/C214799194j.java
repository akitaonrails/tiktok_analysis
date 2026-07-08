package X;

import Y.ACListenerS165S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS576S0100000_32;
import u4.q0;

/* JADX INFO: renamed from: X.194j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214799194j extends C19A3 implements InterfaceC523020KfE {
    public static final /* synthetic */ int LLLLIIL = 0;
    public Scene LLJJI;
    public Function0<? extends Scene> LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJJ;
    public boolean LLJJJJJIL;
    public int LLJL;
    public C214800194k LLJLIL;
    public CreativeBottomSheetBehavior<?> LLJLILLLLZIIL;
    public C1391280mJC LLJLL;
    public Function0<Unit> LLJLLIL;
    public Function0<Unit> LLJLLL;
    public Function0<Unit> LLJZ;
    public Function0<Unit> LLJZIJLIL;
    public Integer LLLF;
    public Integer LLLFF;
    public boolean LLLI;
    public boolean LLLII;
    public Integer LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public NavigationScene LLLILZJ;
    public Boolean LLLILZLLLI;
    public Float LLLIZZ;
    public AbstractC343940De4 LLLJ;
    public AbstractC343940De4 LLLJIL;
    public final C214802194m LLLJL;
    public final C21524919Lr LLLL;
    public int LLLLII;
    public long LLLLIIIILLL;
    public int LLJILLL = -1;
    public String LLJJ = "";
    public EnumC214804194o LLJJIJIIJIL = EnumC214804194o.AUTO_SIZE;
    public int LLJJIJIL = -1;
    public int LLJJJIL = -1;
    public int LLJJJJ = -1;
    public boolean LLJJJJLIIL = true;
    public final boolean LLJJL = true;
    public boolean LLJJLIIIJLLLLLLLZ = true;
    public int LLL = -1;
    public C0ETP LLLFFI = new C0ETP() { // from class: X.194l
        @Override // X.C0ETP
        public final void LIZ(C214800194k c214800194k, final AwS576S0100000_32 awS576S0100000_32) throws Throwable {
            C214799194j c214799194j = this.LIZ;
            Activity activity = c214799194j.mActivity;
            if (activity == null) {
                return;
            }
            Integer num = c214799194j.LLLFF;
            if (num != null && c214799194j.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, num.intValue());
                final C214799194j c214799194j2 = this.LIZ;
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.194r
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        C214800194k c214800194k2 = c214799194j2.LLJLIL;
                        if (c214800194k2 != null) {
                            int visibility = c214800194k2.getVisibility();
                            c214800194k2.setVisibility(4);
                            C1602160rnK.LIZIZ(visibility, 4, c214800194k2);
                        }
                        awS576S0100000_32.invoke();
                    }
                });
                c214800194k.startAnimation(animationLoadAnimation);
                return;
            }
            awS576S0100000_32.invoke();
        }

        @Override // X.C0ETP
        public final void LIZIZ(C214800194k c214800194k, final AwS549S0100000_5 awS549S0100000_5) {
            int iLLLLIILL;
            C214799194j c214799194j = this.LIZ;
            Activity activity = c214799194j.mActivity;
            if (activity == null) {
                return;
            }
            Integer num = c214799194j.LLLF;
            if (num != null) {
                iLLLLIILL = num.intValue();
            } else {
                int i = C214805194p.LIZ[c214799194j.LLJJIJIIJIL.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                iLLLLIILL = c214799194j.LLLLIILL(c214799194j.LLJJJIL);
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            iLLLLIILL = R.anim.ht;
                        }
                    } else {
                        iLLLLIILL = c214799194j.LLLLIILL(c214799194j.LLJJIJIL);
                    }
                } else {
                    iLLLLIILL = R.anim.hx;
                }
            }
            final Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, iLLLLIILL);
            final C214799194j c214799194j2 = this.LIZ;
            animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.194s
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    C214799194j c214799194j3 = c214799194j2;
                    c214799194j3.LLLLII--;
                    System.nanoTime();
                    c214799194j2.getClass();
                    awS549S0100000_5.invoke();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    C214799194j c214799194j3 = c214799194j2;
                    c214799194j3.LLLLII = 0;
                    animationLoadAnimation.getDuration();
                    c214799194j3.getClass();
                }
            });
            final Interpolator interpolator = animationLoadAnimation.getInterpolator();
            final C214799194j c214799194j3 = this.LIZ;
            animationLoadAnimation.setInterpolator(new Interpolator() { // from class: X.194t
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    C214799194j c214799194j4 = c214799194j3;
                    if (c214799194j4.LLLLII == 0) {
                        c214799194j4.LLLLIIIILLL = System.nanoTime();
                    }
                    c214799194j3.LLLLII++;
                    return interpolator.getInterpolation(f);
                }
            });
            c214800194k.startAnimation(animationLoadAnimation);
        }
    };
    public boolean LLLFZ = true;
    public final C01GW LLLIIII = C452501pT.LIZ(EnumC452301pR.NONE, AFwS223S0000000_32.get$arr$(235));

    public final void LLLLJ() {
        AbstractC343940De4 abstractC343940De4LJJIL;
        C19A3 c19a3;
        InterfaceC19721912Ef interfaceC19721912Ef;
        this.LLLIILIL = false;
        C128Y c128y = this.LLJJI;
        if (!(c128y instanceof InterfaceC19721912Ef) || (interfaceC19721912Ef = (InterfaceC19721912Ef) c128y) == null || (abstractC343940De4LJJIL = interfaceC19721912Ef.LJJIL()) == null) {
            abstractC343940De4LJJIL = this.LLLJ;
        }
        this.LLLJIL = abstractC343940De4LJJIL;
        this.LLLJ = C343970De7.LIZ;
        if (this.LLJJIJI) {
            Scene scene = this.mParentScene;
            if ((scene instanceof C19A3) && (c19a3 = (C19A3) scene) != null) {
                c19a3.hide(this);
            }
        } else {
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
            if (navigationSceneLIZ != null) {
                navigationSceneLIZ.remove(this);
            }
        }
        this.LLLIIL = false;
        Function0<Unit> function0 = this.LLJLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LLLLIL() {
        this.LLLJ = C343970De7.LIZ;
        LLLLILI(true);
    }

    public final void LLLLJI() {
        if (this.LLLILZ || this.mParentScene == null || !isVisible()) {
            return;
        }
        this.LLLIL = false;
        this.LLLILZ = true;
        C214800194k c214800194k = this.LLJLIL;
        if (c214800194k != null) {
            c214800194k.clearAnimation();
            CreativeBottomSheetBehavior<?> behavior = c214800194k.getBehavior();
            if (behavior != null) {
                behavior.setState(5);
            }
        }
        LLLLJ();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.194m] */
    public C214799194j() {
        C343970De7 c343970De7 = C343970De7.LIZ;
        this.LLLJ = c343970De7;
        this.LLLJIL = c343970De7;
        this.LLLJL = new AbstractC1177930gl5() { // from class: X.194m
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
                InterfaceC214812194w interfaceC214812194w;
                this.LIZ.LLLIL = true;
                if (Float.isNaN(f)) {
                    f = 0.0f;
                }
                ((ColorDrawable) this.LIZ.LLLIIII.getValue()).setColor(C214810194u.LIZ((1 + f) * 0.5f, ((ColorDrawable) this.LIZ.LLLIIII.getValue()).getColor()));
                C128Y c128y = this.LIZ.LLJJI;
                if ((c128y instanceof InterfaceC214812194w) && (interfaceC214812194w = (InterfaceC214812194w) c128y) != null) {
                    interfaceC214812194w.LIZIZ();
                }
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                boolean z;
                Function0<Unit> function0;
                InterfaceC214812194w interfaceC214812194w;
                C128Y c128y = this.LIZ.LLJJI;
                if ((c128y instanceof InterfaceC214812194w) && (interfaceC214812194w = (InterfaceC214812194w) c128y) != null) {
                    interfaceC214812194w.LIZ();
                }
                if (i == 5) {
                    C214799194j c214799194j = this.LIZ;
                    if (!c214799194j.LLLILZ && c214799194j.LLLIL && (function0 = c214799194j.LLJLLIL) != null) {
                        function0.invoke();
                    }
                }
                C214799194j c214799194j2 = this.LIZ;
                if (c214799194j2.LLJJIJIIJIL == EnumC214804194o.FULLSCREEN) {
                    if (i != 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c214799194j2.LLLLLIL(z);
                }
            }
        };
        this.LLLL = new C21524919Lr(this, 3);
        this.LLLLIIIILLL = -1L;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLLLLLZIL(this.LLLL);
        }
        Scene sceneFindSceneByTag = findSceneByTag("sheet_content_scene");
        if (sceneFindSceneByTag != null) {
            remove(sceneFindSceneByTag);
        }
        Function0<Unit> function0 = this.LLJZIJLIL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJJI = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        CreativeBottomSheetBehavior<?> behavior;
        C19EG c19eg;
        super.onStart();
        if (this.LLLI && (c19eg = (C19EG) this.mActivity) != null) {
            Context sceneContext = getSceneContext();
            Integer numValueOf = sceneContext != null ? Integer.valueOf(LLLLIIIILLL(sceneContext)) : null;
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIL();
            if (numValueOf != null) {
                tuxImmersionBar.LJFF(numValueOf.intValue());
            }
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
        }
        C214800194k c214800194k = this.LLJLIL;
        if (c214800194k == null || (behavior = c214800194k.getBehavior()) == null) {
            return;
        }
        C214800194k c214800194k2 = this.LLJLIL;
        if (((c214800194k2 != null ? c214800194k2.getVariant() : null) == EnumC214804194o.DYNAMIC && behavior.LJJI == 3) || behavior.LJJI == 5) {
            return;
        }
        behavior.setState(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLLIIIILLL(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.Integer r1 = r9.LLLIIIIL
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L5f
            int r0 = r1.intValue()
            if (r0 == 0) goto L5f
            android.view.ContextThemeWrapper r7 = new android.view.ContextThemeWrapper
            int r8 = r1.intValue()
            r1 = 1083179008(0x40900000, float:4.5)
            r6 = -1
            int r0 = X.C2441009hQ.LJIIIZ(r1, r6, r8)
            r5 = 1077936128(0x40400000, float:3.0)
            int r2 = X.C2441009hQ.LJIIIZ(r5, r6, r8)
            if (r0 == r6) goto L4a
            if (r2 == r6) goto L4a
        L23:
            r0 = 2131108791(0x7f0623b7, float:1.78302E38)
        L26:
            java.lang.Integer r0 = X.C1308910kAL.LIZ(r0, r10)
            if (r0 == 0) goto L48
            int r0 = r0.intValue()
        L30:
            r7.<init>(r10, r0)
            r10 = r7
        L34:
            int[] r2 = com.ss.android.ugc.aweme.app.R$styleable.TuxSheet
            r1 = 2131100520(0x7f060368, float:1.7813424E38)
            r0 = 0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r0, r2, r1, r4)
            int r0 = com.ss.android.ugc.aweme.app.R$styleable.TuxSheet__tux_sheetBackgroundColor
            int r0 = r1.getColor(r0, r3)
            r1.recycle()
            return r0
        L48:
            r0 = 0
            goto L30
        L4a:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = X.C2441009hQ.LJIIIZ(r1, r0, r8)
            int r0 = X.C2441009hQ.LJIIIZ(r5, r0, r8)
            if (r1 == r6) goto L5c
            if (r0 == r6) goto L5c
        L58:
            r0 = 2131108794(0x7f0623ba, float:1.7830205E38)
            goto L26
        L5c:
            if (r2 == r6) goto L58
            goto L23
        L5f:
            int r0 = r9.LLJL
            if (r0 == 0) goto L34
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            int r0 = r9.LLJL
            r1.<init>(r10, r0)
            r10 = r1
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214799194j.LLLLIIIILLL(android.content.Context):int");
    }

    public final int LLLLIILL(int i) {
        int iLIZ;
        Context sceneContext = getSceneContext();
        if (sceneContext == null) {
            iLIZ = 0;
        } else if (this.LLJJJ) {
            iLIZ = C497820Jfg.LIZJ(sceneContext) + C497820Jfg.LIZ(sceneContext);
        } else {
            iLIZ = C497820Jfg.LIZ(sceneContext);
        }
        float f = i / iLIZ;
        if (f < 0.33333334f) {
            return R.anim.hv;
        }
        if (f < 0.6666667f) {
            return R.anim.hx;
        }
        return R.anim.ht;
    }

    public final void LLLLILI(boolean z) {
        CreativeBottomSheetBehavior<?> behavior;
        Function0<Unit> function0;
        C214800194k c214800194k = this.LLJLIL;
        if (c214800194k != null && (behavior = c214800194k.getBehavior()) != null) {
            int i = behavior.LJJI;
            if (!this.LLLILZ && i != 5 && i <= 4) {
                this.LLLIL = false;
                this.LLLILZ = true;
                C214800194k c214800194k2 = this.LLJLIL;
                if (c214800194k2 != null) {
                    c214800194k2.clearAnimation();
                    AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c214800194k2, 738);
                    C0ETP c0etp = this.LLLFFI;
                    if (c0etp != null) {
                        c0etp.LIZ(c214800194k2, awS576S0100000_32);
                    }
                }
                if (!z && (function0 = this.LLJLLIL) != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final void LLLLL(Scene scene) {
        Activity activity;
        C19A3 c19a3;
        CreativeBottomSheetBehavior<?> behavior;
        C0ETP c0etp;
        C19A3 c19a32;
        if (scene.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || (activity = scene.mActivity) == null || activity.isFinishing() || activity.isDestroyed() || this.LLLIIL) {
            return;
        }
        this.LLLILZ = false;
        this.LLLIILIL = true;
        if (this.LLJJIJI) {
            if (this.mParentScene != null) {
                if ((scene instanceof C19A3) && (c19a32 = (C19A3) scene) != null) {
                    c19a32.show(this);
                }
                C214800194k c214800194k = this.LLJLIL;
                if (c214800194k != null && (c0etp = this.LLLFFI) != null) {
                    c0etp.LIZIZ(c214800194k, new AwS549S0100000_5(this, 1312));
                }
                C214800194k c214800194k2 = this.LLJLIL;
                if (c214800194k2 != null && (behavior = c214800194k2.getBehavior()) != null) {
                    behavior.setState(4);
                }
            } else if ((scene instanceof C19A3) && (c19a3 = (C19A3) scene) != null) {
                c19a3.add(this.LLJILLL, this, this.LLJJ);
            }
        } else {
            if (this.mParentScene != null) {
                return;
            }
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZJ = new C214798194i();
            C19AL c19alLIZ = c569760MWg.LIZ();
            if (scene instanceof NavigationScene) {
                ((NavigationScene) scene).LLLLLLLLLL(this, c19alLIZ);
            } else {
                NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(scene);
                if (navigationSceneLIZ != null) {
                    navigationSceneLIZ.LLLLLLLLLL(this, c19alLIZ);
                }
            }
        }
        this.LLLIIL = true;
    }

    public final void LLLLLIL(boolean z) {
        if (z) {
            if (!this.LLLIIIL) {
                C214800194k c214800194k = this.LLJLIL;
                if (c214800194k != null) {
                    c214800194k.LIZIZ(true);
                }
                this.LLLIIIL = true;
                return;
            }
            return;
        }
        if (!this.LLLIIIL) {
            return;
        }
        C214800194k c214800194k2 = this.LLJLIL;
        if (c214800194k2 != null) {
            c214800194k2.LIZIZ(false);
        }
        this.LLLIIIL = false;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        NavigationScene navigationScene = this.LLLILZJ;
        if (navigationScene != null) {
            navigationScene.LLLIILIL(this, this.LLLL);
        } else {
            C1447800nmM.LIZIZ(this).LLLIILIL(this, this.LLLL);
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iLIZ;
        Scene sceneInvoke;
        C19A3 c19a3;
        C0OM1 c0om1Sn;
        ViewGroup.LayoutParams layoutParams;
        InterfaceC344240DeY interfaceC344240DeY;
        C19A3 c19a32;
        Context context = viewGroup.getContext();
        int i = this.LLJL;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.bcz, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = R.style.sq;
            }
        }
        setTheme(i);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.fvh, viewGroup, false);
        if (this.LLJJJ || !this.LLLFZ) {
            viewGroup2.setFitsSystemWindows(false);
        }
        C214800194k c214800194k = (C214800194k) viewGroup2.findViewById(R.id.v48);
        c214800194k.setFixedHeightPx(this.LLJJIJIL);
        Context sceneContext = getSceneContext();
        if (sceneContext == null) {
            iLIZ = 0;
        } else if (this.LLJJJ) {
            iLIZ = C497820Jfg.LIZ(sceneContext) + C497820Jfg.LIZJ(sceneContext);
        } else {
            iLIZ = C497820Jfg.LIZ(sceneContext);
        }
        c214800194k.setForceScreenHeight(iLIZ);
        c214800194k.setDynamicPeekHeightPx(this.LLJJJIL);
        c214800194k.setDynamicMaxHeightPx(this.LLJJJJ);
        c214800194k.setVariant(this.LLJJIJIIJIL);
        c214800194k.setForceSheetHandleShow(this.LLLILZLLLI);
        c214800194k.setBottomSheetAnimDuration(this.LLL);
        c214800194k.setBehavior(this.LLJLILLLLZIIL);
        c214800194k.setHideable(this.LLJJL);
        c214800194k.setDismissFunc(new AwS576S0100000_32(this, 739));
        c214800194k.setBottomSheetCallback(this.LLLJL);
        Float f = this.LLLIZZ;
        if (f != null) {
            c214800194k.setRadius(f.floatValue());
        }
        Integer num = this.LLLIIIIL;
        if (num != null) {
            c214800194k.setBottomSheetBackgroundColor$tools_creative_sheet_scene_release(num);
        } else {
            c214800194k.setBottomSheetBackgroundColor$tools_creative_sheet_scene_release(Integer.valueOf(LLLLIIIILLL(viewGroup.getContext())));
        }
        q0.LJIJ(c214800194k, new C20750916Hz(this, 1));
        C0ETP c0etp = this.LLLFFI;
        if (c0etp != null) {
            c0etp.LIZIZ(c214800194k, new AwS549S0100000_5(this, 1312));
        }
        this.LLJLIL = c214800194k;
        this.LLLIIIL = false;
        LLLLLIL(true);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.v4a);
        if (this.LLJJJJJIL) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
            layoutParams2.height = -1;
            C786410Ut5.X5(layoutParams2, viewGroup3);
        }
        C1066370dr9 handleView = null;
        if (this.LLJJIJI) {
            Scene scene = this.LLJJI;
            if (scene != null) {
                Scene scene2 = scene.mParentScene;
                if ((scene2 instanceof C19A3) && (c19a32 = (C19A3) scene2) != null) {
                    c19a32.remove(scene);
                }
                add(R.id.v4a, scene, "sheet_content_scene");
            }
        } else {
            Function0<? extends Scene> function0 = this.LLJJIII;
            if (function0 != null && (sceneInvoke = function0.invoke()) != null) {
                Scene scene3 = sceneInvoke.mParentScene;
                if ((scene3 instanceof C19A3) && (c19a3 = (C19A3) scene3) != null) {
                    c19a3.remove(sceneInvoke);
                }
                add(R.id.v4a, sceneInvoke, "sheet_content_scene");
            } else {
                sceneInvoke = null;
            }
            this.LLJJI = sceneInvoke;
        }
        this.LLJLL = (C1391280mJC) viewGroup2.findViewById(R.id.v4n);
        C128Y c128y = this.LLJJI;
        if (!(c128y instanceof InterfaceC344240DeY) || (interfaceC344240DeY = (InterfaceC344240DeY) c128y) == null || (c0om1Sn = interfaceC344240DeY.Sn()) == null) {
            c0om1Sn = null;
        }
        C1391280mJC c1391280mJC = this.LLJLL;
        if (c1391280mJC != null) {
            c1391280mJC.setNavActions(c0om1Sn);
        }
        C1391280mJC c1391280mJC2 = this.LLJLL;
        if (c1391280mJC2 != null) {
            c1391280mJC2.setNavBarBackgroundColor(0);
        }
        if (this.LLJJIJIIJIL == EnumC214804194o.DYNAMIC && c0om1Sn != null) {
            C1391280mJC c1391280mJC3 = this.LLJLL;
            if (c1391280mJC3 != null) {
                layoutParams = c1391280mJC3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            C1391280mJC c1391280mJC4 = this.LLJLL;
            if (c1391280mJC4 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1391280mJC4);
                c1391280mJC4.setLayoutParams(layoutParams3);
            }
            C214800194k c214800194k2 = this.LLJLIL;
            if (c214800194k2 != null) {
                handleView = c214800194k2.getHandleView();
            }
            C1391280mJC c1391280mJC5 = this.LLJLL;
            if (c1391280mJC5 != null) {
                c1391280mJC5.LL.LLJ.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                c1391280mJC5.LLILLJJLI.LLJ.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            }
            C1391280mJC c1391280mJC6 = this.LLJLL;
            if (c1391280mJC6 != null) {
                int currentNavBarBackgroundColor = c1391280mJC6.getCurrentNavBarBackgroundColor();
                if (handleView != null) {
                    handleView.setBackgroundColor(currentNavBarBackgroundColor);
                }
            }
            C1391280mJC c1391280mJC7 = this.LLJLL;
            if (c1391280mJC7 != null) {
                c1391280mJC7.getCurrentNavBarBackgroundColor();
            }
        }
        if (this.LLLII) {
            ColorDrawable colorDrawable = (ColorDrawable) this.LLLIIII.getValue();
            colorDrawable.setColor(C214810194u.LIZ(0.5f, colorDrawable.getColor()));
            viewGroup2.setBackground(colorDrawable);
        }
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 193), viewGroup2.findViewById(R.id.yg_));
        viewGroup2.setOnTouchListener(new View.OnTouchListener() { // from class: X.16Co
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return viewGroup2;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
