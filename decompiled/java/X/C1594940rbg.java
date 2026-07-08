package X;

import X.C0DMM;
import X.C0J5E;
import X.C0S4U;
import X.C1388190mED;
import X.C1594940rbg;
import X.C199Y;
import X.C19EG;
import X.C1C7U;
import X.C20629915o1;
import X.C426060GnE;
import X.InterfaceC1711206n0;
import X.InterfaceC20622815ms;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.experiment.LiveFYPSkylightUnfoldModel;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594940rbg implements InterfaceC1570900qyu {
    public C426060GnE LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final C01GW LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public final C1620910sHZ LLIZLLLIL;
    public final C1620910sHZ LLJ;

    public C1594940rbg() {
        this(false);
    }

    @Override // X.InterfaceC1570900qyu
    public final void LIZ() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void S1(boolean z) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void T1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void U1(View view) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void a2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean b2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final void d2(Integer num) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void e2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void g2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onCreate() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onPause() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onResume() {
    }

    public final void LIZIZ() {
        boolean zContains = false;
        if (!Intrinsics.LJFF(this.LLIZ, "HOME") || (!Intrinsics.LJFF(this.LLILZLL, "For You") && !Intrinsics.LJFF(this.LLILZLL, "Following"))) {
            C426060GnE c426060GnE = this.LL;
            if (c426060GnE != null) {
                c426060GnE.setLiveStyle(false);
                return;
            }
            return;
        }
        List<String> list = ((LiveFYPSkylightUnfoldModel) C278340AvY.LIZIZ.getValue()).goLiveMergeBtnScene;
        if (list == null || list.isEmpty()) {
            zContains = true;
        } else if (Intrinsics.LJFF(this.LLILZLL, "For You")) {
            zContains = list.contains("fyp");
        } else if (Intrinsics.LJFF(this.LLILZLL, "Following")) {
            zContains = list.contains("follow");
        }
        C426060GnE c426060GnE2 = this.LL;
        if (c426060GnE2 != null) {
            c426060GnE2.setLiveStyle(zContains);
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final void onDestroyView() {
        if (this.LL != null) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL((InterfaceC427710Gpt) this.LLILZIL.getValue());
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean enabled() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && C1601110rld.LIZ() && C1585060rLk.LIZIZ();
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean c2() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1570900qyu
    public final String getTag() {
        return this.LLILLJJLI;
    }

    public C1594940rbg(boolean z) {
        this.LLILLJJLI = EnumC1584350rKb.STORY_CAMERA.getTag();
        this.LLILLL = 8388627;
        this.LLILZ = true;
        this.LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1836));
        this.LLILZLL = "For You";
        this.LLIZ = "HOME";
        this.LLIZLLLIL = new C1620910sHZ(this, 26);
        this.LLJ = new C1620910sHZ(this, 25);
    }

    @Override // X.InterfaceC1570900qyu
    public final View f2(Context context) {
        final C426060GnE c426060GnE = new C426060GnE(new C1361400lX0(context, R.style.y0));
        c426060GnE.setId(R.id.w_d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), this.LLILLL);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426060GnE);
        c426060GnE.setLayoutParams(layoutParams);
        c426060GnE.setSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
        c426060GnE.LJIILJJIL(null);
        this.LL = c426060GnE;
        if (C278330AvX.LIZ(null)) {
            HandlerHook.viewPost(c426060GnE, new Runnable() { // from class: com.ss.android.ugc.aweme.story.homepage.StoryCameraIconGenerator$initTabChangeObserver$1
                /* JADX WARN: Multi-variable type inference failed */
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
                    LifecycleOwner lifecycleOwner;
                    final C19EG c19egLIZIZ = C1388190mED.LIZIZ(c426060GnE.getContext());
                    if (c19egLIZIZ != 0) {
                        final C1594940rbg c1594940rbg = this;
                        boolean zKQ2 = Hox.LLJILJIL.LIZ(c19egLIZIZ).KQ2("HOME");
                        C426060GnE c426060GnE2 = c1594940rbg.LL;
                        if (c426060GnE2 != null) {
                            c426060GnE2.setLiveStyle(zKQ2);
                        }
                        if ((c19egLIZIZ instanceof C199Y) && (c19egLIZIZ instanceof InterfaceC1711206n0)) {
                            Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) c19egLIZIZ);
                            if (objLIZ == null || !(objLIZ instanceof C0J5E)) {
                                return;
                            }
                            LifecycleOwner lifecycleOwner2 = (Fragment) objLIZ;
                            lifecycleOwner = lifecycleOwner2;
                            if (lifecycleOwner2 == null) {
                                return;
                            }
                        } else {
                            lifecycleOwner = c19egLIZIZ;
                        }
                        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                        if (lifecycle != null) {
                            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.story.homepage.StoryCameraIconGenerator$initTabChangeObserver$1$1$1
                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                                    if (event == Lifecycle.Event.ON_START) {
                                        onStart();
                                    } else if (event == Lifecycle.Event.ON_STOP) {
                                        onStop();
                                    }
                                }

                                @OnLifecycleEvent(Lifecycle.Event.ON_START)
                                public final void onStart() {
                                    HomeTabAbility homeTabAbilityLIZ;
                                    HomeTabAbility homeTabAbilityLIZ2;
                                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ);
                                    if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                        homeTabAbilityLIZ2.ao(c1594940rbg.LLIZLLLIL);
                                    }
                                    MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19egLIZIZ);
                                    if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                        return;
                                    }
                                    homeTabAbilityLIZ.UC1(c1594940rbg.LLJ);
                                }

                                @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                                public final void onStop() {
                                    HomeTabAbility homeTabAbilityLIZ;
                                    HomeTabAbility homeTabAbilityLIZ2;
                                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ);
                                    if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                        homeTabAbilityLIZ2.tx0(c1594940rbg.LLIZLLLIL);
                                    }
                                    MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19egLIZIZ);
                                    if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                        return;
                                    }
                                    homeTabAbilityLIZ.Ik0(c1594940rbg.LLJ);
                                }
                            });
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StoryCameraIconGenerator@4edf.initTabChangeObserver$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StoryCameraIconGenerator@4edf.initTabChangeObserver$1");
                }
            });
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI((InterfaceC427710Gpt) this.LLILZIL.getValue());
        return c426060GnE;
    }
}
