package com.bytedance.android.live.walletclean.presentation.assem.body.view;

import X.AbstractC1806050x6B;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0W0P;
import X.C0W0Q;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1803820x2a;
import X.C1805530x5L;
import X.C1806330x6d;
import X.C1806440x6o;
import X.C1806800x7O;
import X.C1806980x7g;
import X.C1807670x8n;
import X.C1864510ycT;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1146704e9;
import X.InterfaceC1804890x4J;
import X.InterfaceC1806410x6l;
import X.InterfaceC1806590x73;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS401S0100000_27;
import Y.AsS19S0300000_27;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.walletclean.presentation.assem.WalletRechargePanelScope;
import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tracking.TrackingEventV3Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class WalletPanelBodyAssem extends UIContentAssem implements RechargePanelBodyAssemAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final WalletPanelBodyAssem LLIZLLLIL = this;
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1805530x5L.class, "wallet_recharge_panel_body_params"), checkSupervisorPrepared());
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public C1806980x7g LLJILJIL;
    public volatile RechargePanelBodyDialogAbility LLJILJILJ;
    public volatile C0W0P LLJILLL;
    public volatile C1806800x7O LLJJ;
    public volatile C1803820x2a LLJJI;
    public volatile IWalletService LLJJIII;
    public C127G LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WalletPanelBodyAssem.class, "bodyAbility", "getBodyAbility()Lcom/bytedance/android/live/walletclean/presentation/assem/body/view/RechargePanelBodyDialogAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(WalletPanelBodyAssem.class, "walletLynxRouter", "getWalletLynxRouter()Lcom/bytedance/android/live/walletclean/presentation/router/IWalletRouter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(WalletPanelBodyAssem.class, "recyclerViewDelegate", "getRecyclerViewDelegate()Lcom/bytedance/android/live/walletclean/presentation/assem/body/view/utils/IWalletPanelRecyclerViewDelegate;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(WalletPanelBodyAssem.class, "tracking", "getTracking()Lcom/bytedance/android/live/walletclean/presentation/tracking/IWalletRechargePanelTracking;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(WalletPanelBodyAssem.class, "walletService", "getWalletService()Lcom/bytedance/android/live/wallet/IWalletService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(WalletPanelBodyAssem.class, "assemVM", "getAssemVM()Lcom/bytedance/android/live/walletclean/presentation/assem/body/viewmodel/RechargePanelBodyViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public WalletPanelBodyAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RechargePanelBodyViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 42), AFwS269S0000000_27.get$arr$(24), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 128));
    }

    public final IWalletService Oo() {
        IWalletService iWalletService = this.LLJJIII;
        if (iWalletService == null) {
            synchronized (this) {
                iWalletService = this.LLJJIII;
                if (iWalletService == null) {
                    IWalletService iWalletServiceLJJI = C1807670x8n.LJJI();
                    this.LLJJIII = iWalletServiceLJJI;
                    return iWalletServiceLJJI;
                }
            }
        }
        return iWalletService;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{WalletRechargePanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WalletRechargePanelScope.class);
        return arrayList;
    }

    public final RechargePanelBodyViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (RechargePanelBodyViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility Ho() {
        /*
            r4 = this;
            com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility r0 = r4.LLJILJILJ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility r0 = r4.LLJILJILJ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIIJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.bytedance.android.live.walletclean.presentation.assem.WalletRechargePanelScope> r1 = com.bytedance.android.live.walletclean.presentation.assem.WalletRechargePanelScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility> r0 = com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility r0 = (com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJILJILJ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletclean.presentation.assem.body.view.WalletPanelBodyAssem.Ho():com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility");
    }

    public final C1805530x5L Jo() {
        return (C1805530x5L) this.LLJ.getValue();
    }

    public final InterfaceC1804890x4J Lo() {
        C1803820x2a c1803820x2a = this.LLJJI;
        if (c1803820x2a == null) {
            synchronized (this) {
                c1803820x2a = this.LLJJI;
                if (c1803820x2a == null) {
                    C1803820x2a c1803820x2a2 = new C1803820x2a();
                    this.LLJJI = c1803820x2a2;
                    return c1803820x2a2;
                }
            }
        }
        return c1803820x2a;
    }

    public final C0W0Q No() {
        C0W0P c0w0p = this.LLJILLL;
        if (c0w0p == null) {
            synchronized (this) {
                c0w0p = this.LLJILLL;
                if (c0w0p == null) {
                    C0W0P c0w0p2 = new C0W0P();
                    this.LLJILLL = c0w0p2;
                    return c0w0p2;
                }
            }
        }
        return c0w0p;
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyAssemAbility
    public final void C30() {
        Go().zQ2(new C1806330x6d(true, false, 2));
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyAssemAbility
    public final void de2() {
        Go().zQ2(C1806440x6o.LIZ);
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyAssemAbility
    public final void fB1() {
        RechargePanelBodyDialogAbility rechargePanelBodyDialogAbilityHo = Ho();
        if (rechargePanelBodyDialogAbilityHo != null) {
            rechargePanelBodyDialogAbilityHo.LJ();
        }
        Go().zQ2(new C1806330x6d(false, true, 1));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{RechargePanelBodyViewModel.class, new AObjectS401S0100000_27(this, 4)}, defaultViewModelProviderFactory);
                    this.LLJJIJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{WalletRechargePanelScope.class}).unbindAbility(this.LLIZLLLIL, RechargePanelBodyAssemAbility.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0x7O] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0x54, java.lang.Object] */
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
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final InterfaceC1806590x73 interfaceC1806590x73;
        final Context context;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0x6i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1805470x5F) obj).LLILZ;
            }
        }, null, new AwS641S0100000_27(this, 119), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0x6j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1805470x5F) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 120), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0x6k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1805470x5F) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 121), 4);
        C1805530x5L c1805530x5LJo = Jo();
        if (c1805530x5LJo != null) {
            C1805530x5L c1805530x5LJo2 = Jo();
            if (c1805530x5LJo2 != null) {
                interfaceC1806590x73 = c1805530x5LJo2.LL;
            } else {
                interfaceC1806590x73 = null;
            }
            final RechargePanelBodyDialogAbility rechargePanelBodyDialogAbilityHo = Ho();
            ?? r7 = new AbstractC1806050x6B(interfaceC1806590x73, rechargePanelBodyDialogAbilityHo) { // from class: X.0x54
                @Override // X.InterfaceC1807240x86
                public final void LIZLLL() {
                    this.LIZJ.Go().zQ2(C1806430x6n.LIZ);
                }

                @Override // X.InterfaceC1807240x86
                public final void LJFF() {
                    C1805530x5L c1805530x5LJo3 = this.LIZJ.Jo();
                    if (c1805530x5LJo3 != null) {
                        C1803830x2b c1803830x2b = c1805530x5LJo3.LLILLL;
                        LJIIIIZZ(c1803830x2b.LJIIZILJ, c1803830x2b.LJIJ);
                    }
                }

                @Override // X.InterfaceC1807160x7y
                public final void LIZIZ(C1805380x56 c1805380x56) {
                    this.LIZJ.Go().zQ2(new C1806190x6P(c1805380x56));
                }

                @Override // X.InterfaceC1806420x6m
                public final void LJ(InterfaceC1806820x7Q interfaceC1806820x7Q) {
                    this.LIZJ.Go().zQ2(new C1806180x6O(interfaceC1806820x7Q));
                }

                @Override // X.InterfaceC1807220x84
                public final void LJIIIZ(int i) {
                    this.LIZJ.Go().zQ2(new C1806270x6X(i));
                }

                @Override // X.InterfaceC1807220x84
                public final void LJIILJJIL(int i) {
                    this.LIZJ.Go().zQ2(new C1806260x6W(i));
                }

                @Override // X.InterfaceC1806420x6m
                public final void LJIILL(InterfaceC1806820x7Q interfaceC1806820x7Q) {
                    this.LIZJ.Go().zQ2(new C1806170x6N(interfaceC1806820x7Q));
                }

                @Override // X.InterfaceC1807160x7y
                public final void LIZ(InterfaceC1806790x7N interfaceC1806790x7N, int i) {
                    this.LIZJ.Go().zQ2(new C1806130x6J(interfaceC1806790x7N, i));
                }

                @Override // X.InterfaceC1807160x7y
                public final void LJII(long j, int i, int i2, boolean z) {
                    Map<String, String> mapLIZ;
                    C1805530x5L c1805530x5LJo3 = this.LIZJ.Jo();
                    if (c1805530x5LJo3 == null) {
                        return;
                    }
                    InterfaceC1804890x4J interfaceC1804890x4JLo = this.LIZJ.Lo();
                    C1805370x55 c1805370x55 = this.LIZJ.Go().getState().LLILLJJLI.LJIIL;
                    C1805370x55 c1805370x552 = this.LIZJ.Go().getState().LLILLJJLI.LJIILIIL;
                    boolean zLIZIZ = this.LIZJ.Go().getState().LLILLJJLI.LIZIZ();
                    TrackingEventV3Data trackingEventV3DataXQ2 = this.LIZJ.Go().xQ2(false);
                    if (trackingEventV3DataXQ2 != null) {
                        mapLIZ = trackingEventV3DataXQ2.LIZ();
                    } else {
                        mapLIZ = null;
                    }
                    ((C1803820x2a) interfaceC1804890x4JLo).LIZJ(c1805530x5LJo3, i, c1805370x55, c1805370x552, zLIZIZ, mapLIZ, z, i2, j, this.LIZJ.Go().vQ2());
                }
            };
            this.LLJILJIL = new C1806980x7g(c1805530x5LJo.LLILZIL.LIZ, r7, Oo());
            C1806800x7O c1806800x7O = this.LLJJ;
            Object obj = c1806800x7O;
            if (c1806800x7O == null) {
                synchronized (this) {
                    C1806800x7O c1806800x7O2 = this.LLJJ;
                    obj = c1806800x7O2;
                    if (c1806800x7O2 == null) {
                        ?? r2 = new Object() { // from class: X.0x7O
                        };
                        this.LLJJ = r2;
                        obj = r2;
                    }
                }
            }
            RecyclerView recyclerView = (RecyclerView) this.LLJIJIL.getValue();
            C1806980x7g c1806980x7g = this.LLJILJIL;
            InterfaceC1806410x6l interfaceC1806410x6l = c1805530x5LJo.LLILLJJLI;
            if (recyclerView != null) {
                recyclerView.setOverScrollMode(2);
                recyclerView.addOnScrollListener(new AsS19S0300000_27(c1806980x7g, obj, r7, 0));
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context) { // from class: com.bytedance.android.live.walletclean.presentation.assem.body.view.utils.WalletPanelRecyclerViewDelegate$recyclerViewConfig$layoutManager$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollHorizontally() {
                    return false;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    return true;
                }
            };
            if (recyclerView != null) {
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.setItemAnimator(null);
            }
            gridLayoutManager.LLIZ = new C1864510ycT(c1806980x7g, 0);
            if (recyclerView != null) {
                recyclerView.setAdapter(c1806980x7g);
                interfaceC1806410x6l.LIZ(recyclerView);
                interfaceC1806410x6l.LIZJ(recyclerView);
            }
            Go().zQ2(new C1806330x6d(false, false, 3));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{WalletRechargePanelScope.class}).bindAbility(this.LLIZLLLIL, RechargePanelBodyAssemAbility.class);
    }
}
