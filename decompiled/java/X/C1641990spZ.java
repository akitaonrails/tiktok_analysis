package X;

import Y.AObjectS241S0100000_8;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.experiment.cq0;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.l;
import lnn.q;

/* JADX INFO: renamed from: X.0spZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641990spZ extends C19A3 implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final C1DRG LLJILLL;
    public final C385670FAf<Integer> LLJJ;
    public final C385670FAf<Integer> LLJJI;
    public final LiveEvent<Unit> LLJJIII;
    public final C385670FAf<Boolean> LLJJIJI;
    public final C577390Mkj LLJJIJIIJIL;
    public final Function1<Boolean, Unit> LLJJIJIL;
    public final Function1<Boolean, Unit> LLJJJ;
    public final C560530Lyd<Unit> LLJJJIL;
    public final C560530Lyd LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public final C1664740tQG LLJJL;
    public final C1664750tQH LLJJLIIIJLLLLLLLZ;
    public final C1664740tQG LLJL;
    public C1642050spf LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public final C1664740tQG LLJLL;
    public final C1638560sk2 LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public boolean LLL;
    public C1642110spl LLLF;
    public final int LLLFF;
    public C0P0T LLLFFI;
    public C0P0T LLLFZ;
    public C1626360sQM LLLI;
    public final C01GW LLLII;
    public final C1664740tQG LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1641990spZ.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1641990spZ.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1641990spZ.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1641990spZ.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1641990spZ.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1641990spZ.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1641990spZ.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final ShortVideoContext LLLLIIIILLL() {
        return (ShortVideoContext) this.LLJJJJJIL.getValue(this, LLLIIIIL[0]);
    }

    public final q LLLLIILL() {
        return (q) this.LLJJL.getValue(this, LLLIIIIL[2]);
    }

    public final void LLLLIL() {
        if (this.LLL) {
            return;
        }
        C1642110spl c1642110spl = this.LLLF;
        if (c1642110spl == null) {
            c1642110spl = null;
        }
        c1642110spl.setDefaultIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        this.LLL = true;
        ((FirstPhotoViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(FirstPhotoViewModel.class)).LL.observe(this, new AObserverS227S0100000_25(this, 53));
        C1642110spl c1642110spl2 = this.LLLF;
        C786410Ut5.wa(c1642110spl2 != null ? c1642110spl2 : null, new C1698060uI0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0sQM] */
    public final void LLLLILI() {
        q qVarLLLLIILL;
        InterfaceC1625410sOp interfaceC1625410sOpW4;
        InterfaceC1625410sOp interfaceC1625410sOpW42;
        if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() || !LLLLIIIILLL().LJJLL()) {
            C1626360sQM c1626360sQM = this.LLLI;
            if (c1626360sQM != null && (qVarLLLLIILL = LLLLIILL()) != null && (interfaceC1625410sOpW4 = qVarLLLLIILL.w4()) != null) {
                interfaceC1625410sOpW4.LIZ(c1626360sQM);
            }
            this.LLLI = null;
            return;
        }
        if (this.LLLI == null) {
            this.LLLI = new InterfaceC1625520sP0() { // from class: X.0sQM
                @Override // X.InterfaceC1625520sP0
                public final void LIZ(C1627360sRy c1627360sRy) {
                    View view = this.LL.LLJZIJLIL;
                    if (view == null) {
                        view = null;
                    }
                    C786410Ut5.LJLLLLLL(8, view);
                }

                @Override // X.InterfaceC1625520sP0
                public final void LIZIZ(C1627370sRz c1627370sRz) {
                    if (c1627370sRz.LIZJ == EnumC1448980noG.MANUAL_SET) {
                        View view = this.LL.LLJZIJLIL;
                        if (view == null) {
                            view = null;
                        }
                        C786410Ut5.LJLLLLLL(0, view);
                        this.LL.LLLLIIIILLL().duetEnterRecordPageWithProps = true;
                    }
                }
            };
        }
        q qVarLLLLIILL2 = LLLLIILL();
        if (qVarLLLLIILL2 == null || (interfaceC1625410sOpW42 = qVarLLLLIILL2.w4()) == null) {
            return;
        }
        interfaceC1625410sOpW42.LJFF(this.LLLI);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        boolean z2;
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        LiveEvent<C443120HZe<Integer, Integer, Intent>> liveEventLLZIL;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        super.onActivityCreated(bundle);
        this.LLJLIL = (C1642050spf) requireViewById(R.id.tp4);
        this.LLJLILLLLZIIL = (ViewGroup) requireViewById(R.id.gvn);
        this.LLJLLL = requireViewById(R.id.ly3);
        this.LLJZ = requireViewById(R.id.ly7);
        View view = this.LLJLLL;
        C1642110spl c1642110spl = null;
        if (view == null) {
            view = null;
        }
        LLLLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), view);
        View view2 = this.LLJZ;
        if (view2 == null) {
            view2 = null;
        }
        LLLLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), view2);
        this.LLJZIJLIL = requireViewById(R.id.ly5);
        this.LLLF = (C1642110spl) requireViewById(R.id.cwd);
        View view3 = this.LLJLLL;
        if (view3 == null) {
            view3 = null;
        }
        int i = C1638080sjG.LIZ;
        LLLLJ(i, i, view3);
        View view4 = this.LLJZ;
        if (view4 == null) {
            view4 = null;
        }
        LLLLJ(i, i, view4);
        C1642110spl c1642110spl2 = this.LLLF;
        if (c1642110spl2 == null) {
            c1642110spl2 = null;
        }
        LLLLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), c1642110spl2);
        C1642110spl c1642110spl3 = this.LLLF;
        if (c1642110spl3 == null) {
            c1642110spl3 = null;
        }
        C1428310nGv.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), c1642110spl3, false);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a02, (Context) this.LLLII.getValue());
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        Drawable drawableLIZ = c384050F3z.LIZ((Context) this.LLLII.getValue());
        C1642110spl c1642110spl4 = this.LLLF;
        if (c1642110spl4 == null) {
            c1642110spl4 = null;
        }
        c1642110spl4.setBgBorderDrawable(drawableLIZ);
        C1642110spl c1642110spl5 = this.LLLF;
        if (c1642110spl5 == null) {
            c1642110spl5 = null;
        }
        c1642110spl5.setRoundRectRadius(16);
        boolean zLIZ = C525780Kjg.LIZ(LLLLIIIILLL());
        C1642110spl c1642110spl6 = this.LLLF;
        if (c1642110spl6 == null) {
            c1642110spl6 = null;
        }
        c1642110spl6.LIZLLL("default", zLIZ);
        C1664740tQG c1664740tQG = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) c1664740tQG.getValue(this, interfaceC2217461BqaArr[5]);
        if (interfaceC1646220swO != null && (c385670FAfDk = interfaceC1646220swO.dk()) != null) {
            c385670FAfDk.LIZ(this, new AObjectS246S0100000_25(this, 435));
        }
        List<String> list = C579450Mo3.LIZ;
        if (C579450Mo3.LIZIZ(LLLLIIIILLL()) && C1627490sSB.LIZIZ()) {
            ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.oh6);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.removeRule(21);
            layoutParams.addRule(20);
            layoutParams.addRule(16, R.id.syo);
            C786410Ut5.X5(layoutParams, viewGroup);
            View view5 = this.LLJLLL;
            if (view5 == null) {
                view5 = null;
            }
            C786410Ut5.LJLLLLLL(8, view5);
            View view6 = this.LLJZ;
            if (view6 == null) {
                view6 = null;
            }
            C786410Ut5.LJLLLLLL(8, view6);
            C786410Ut5.LJLLLLLL(0, requireViewById(R.id.ly4));
        }
        C1642110spl c1642110spl7 = this.LLLF;
        if (c1642110spl7 == null) {
            c1642110spl7 = null;
        }
        HandlerHook.viewPost(c1642110spl7, new ARunnableS116S0100000_16(this, 82));
        cq0.LIZ.getClass();
        if (!((Boolean) cq0.LIZIZ.getValue()).booleanValue()) {
            C1642110spl c1642110spl8 = this.LLLF;
            if (c1642110spl8 == null) {
                c1642110spl8 = null;
            }
            AnonymousClass1250.LIZJ(c1642110spl8);
        }
        boolean zLJFF = Intrinsics.LJFF(C1642020spc.LIZ().getResourceType(), "effect");
        C1642020spc.LIZ().getClass();
        if (C1429780nJI.LIZ() && zLJFF && C1642020spc.LIZ().getQuickPromoCount() > 0 && Intrinsics.LJFF(LLLLIIIILLL().enterFrom, "super_entrance")) {
            z = true;
        } else {
            z = false;
        }
        C1638070sjF c1638070sjF = l.LLJJIII;
        C19GS c19gs = (C19GS) this.mActivity;
        View view7 = this.mView;
        q qVarLLLLIILL = LLLLIILL();
        C1DRG c1drg = this.LLJILLL;
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 356);
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 562);
        c1638070sjF.getClass();
        C1638070sjF.LIZ(c19gs, this, view7, z, qVarLLLLIILL, c1drg, awS604S0100000_25, awS569S0100000_25);
        ShortVideoContext shortVideoContextLLLLIIIILLL = LLLLIIIILLL();
        if (!shortVideoContextLLLLIIIILLL.LJJLL() && !shortVideoContextLLLLIIIILLL.LJJJJLL()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C1642110spl c1642110spl9 = this.LLLF;
            if (c1642110spl9 == null) {
                c1642110spl9 = null;
            }
            C786410Ut5.G0(c1642110spl9, 4);
        } else {
            LLLLIL();
        }
        this.LLJJIJI.LIZ(this, new AObjectS246S0100000_25(this, 436));
        this.LLJJ.LIZ(this, new AObjectS246S0100000_25(this, 437));
        if (TextUtils.equals(LLLLIIIILLL().shootWay, "upload_anchor") || Intrinsics.LJFF(LLLLIIIILLL().enterFrom, "homepage_explore")) {
            C524780Ki4.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
            this.LLJJJ.invoke(Boolean.FALSE);
            C1444870nhd c1444870nhd = C1444870nhd.LIZ;
            Activity activityRequireActivity = requireActivity();
            ShortVideoContext shortVideoContextLLLLIIIILLL2 = LLLLIIIILLL();
            C1DRG c1drg2 = this.LLJILLL;
            c1444870nhd.getClass();
            C1444870nhd.LIZIZ(activityRequireActivity, shortVideoContextLLLLIIIILLL2, c1drg2, null, null);
        }
        this.LLJJIJIIJIL.LIZ.LIZ(this, new AObjectS246S0100000_25(this, 438));
        this.LLJJIJIIJIL.LIZIZ.LIZ(this, new AObjectS246S0100000_25(this, 439));
        this.LLJJI.LIZ(this, new AObjectS246S0100000_25(this, 440));
        this.LLJJIII.LIZ(this, new AObjectS246S0100000_25(this, 441));
        LiveEvent<Effect> liveEvent = this.LLJJIJIIJIL.LIZJ;
        if (liveEvent != null) {
            liveEvent.LIZ(this, new AObjectS241S0100000_8(this, 64));
        }
        a aVar = (a) this.LLJILLL.LJIIL(null, a.class);
        if (aVar != null && (liveEventLLZIL = aVar.LLZIL()) != null) {
            liveEventLLZIL.LIZ(this, new AObjectS246S0100000_25(this, 433));
        }
        InterfaceC1647930sz9 interfaceC1647930sz9 = (InterfaceC1647930sz9) this.LLJL.getValue(this, interfaceC2217461BqaArr[4]);
        if (interfaceC1647930sz9 != null && (bottomTabIndexChangeEvent = interfaceC1647930sz9.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 434));
        }
        Bundle bundleLIZIZ = C565520MFy.LIZIZ(this);
        if (bundleLIZIZ != null) {
            String string = bundleLIZIZ.getString("extra_super_entrance_pop");
            if (!TextUtils.isEmpty(string)) {
                if (this.LLLFFI == null) {
                    C450720Hlu c450720Hlu = new C450720Hlu(requireSceneContext());
                    c450720Hlu.LLILZ = string;
                    C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                    c1391600mJi.LJII = -1001L;
                    c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                    View view8 = this.LLJLLL;
                    if (view8 == null) {
                        view8 = null;
                    }
                    c1391600mJi.LIZIZ = view8;
                    this.LLLFFI = c450720Hlu.LIZIZ();
                }
                View view9 = this.LLJLLL;
                if (view9 == null) {
                    view9 = null;
                }
                HandlerHook.viewPostDelay(view9, new ARunnableS116S0100000_16(this, 83), 1000L);
                C1440005kM.LIZ(new SuperEntranceEvent(1, false));
            }
        }
        C1642110spl c1642110spl10 = this.LLLF;
        if (c1642110spl10 == null) {
            c1642110spl10 = null;
        }
        if (c1642110spl10.getVisibility() == 0 && !this.LLJLLIL.LIZ.getBoolean("upload_tip_show", false) && !Intrinsics.LJFF(LLLLIIIILLL().shootWay, "duet") && !Intrinsics.LJFF(LLLLIIIILLL().shootWay, "split") && !Intrinsics.LJFF(LLLLIIIILLL().shootWay, "react") && (!((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() || C0CHQ.LIZ().getAccountService().LIZ())) {
            if (this.LLLFZ == null) {
                C0CHQ.LIZ().LJIJJ().LJFF(this.mActivity, new AwS569S0100000_25(this, 564));
            }
            C1642110spl c1642110spl11 = this.LLLF;
            if (c1642110spl11 != null) {
                c1642110spl = c1642110spl11;
            }
            HandlerHook.viewPostDelay(c1642110spl, new ARunnableS125S0100000_25(this, 57), 100L);
        }
        LLLLILI();
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public static void LLLLJ(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i2;
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).loadLayoutFiles("dockBar", getSceneContext(), layoutInflater, R.layout.i97, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public C1641990spZ(C1DRG c1drg, h0 h0Var, h0 h0Var2, C560530Lyd c560530Lyd, C385670FAf c385670FAf, C577390Mkj c577390Mkj, C577280MkY c577280MkY, C577320Mkc c577320Mkc) {
        int i;
        this.LLJILLL = c1drg;
        this.LLJJ = h0Var;
        this.LLJJI = h0Var2;
        this.LLJJIII = c560530Lyd;
        this.LLJJIJI = c385670FAf;
        this.LLJJIJIIJIL = c577390Mkj;
        this.LLJJIJIL = c577280MkY;
        this.LLJJJ = c577320Mkc;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLJJJIL = c560530Lyd2;
        this.LLJJJJ = c560530Lyd2;
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(c1drg, q.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLJLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646220swO.class, null);
        this.LLJLLIL = new C1638560sk2();
        if (C578130Mlv.LIZJ()) {
            i = 5;
        } else {
            i = 20;
        }
        this.LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        this.LLLII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 560));
        this.LLLIIII = C1664770tQJ.LIZIZ(c1drg, C1631190sY9.class, "lazyControlProgressConfig");
    }
}
