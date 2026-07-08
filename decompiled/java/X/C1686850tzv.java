package X;

import Y.ARunnableS108S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.network.NetworkConnectivityUtil$createLifeCycleObserver$1;
import com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686850tzv extends C19A3 {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public InterfaceC525060KiW LLJJ;
    public boolean LLJJIJI;
    public final C0JEX LLJILLL = C0JEY.LIZ(this, C13LE.LIZ(AIPortraitCustomizeViewModel.class), new AwS552S0100000_8(new AwS569S0100000_25((Scene) this, 1091), (Function0<Unit>) 1079), null);
    public boolean LLJJI = true;
    public final C1698360uIU LLJJIII = new C1698360uIU(this, 6);

    public final AIPortraitCustomizeViewModel LLLLIL() {
        return (AIPortraitCustomizeViewModel) this.LLJILLL.getValue();
    }

    public final void LLLLJI() {
        Context sceneContext;
        Activity activityLIZ;
        if (this.LLJJIJI || (sceneContext = getSceneContext()) == null || (activityLIZ = C06MM.LIZ(sceneContext)) == null) {
            return;
        }
        this.LLJJIJI = true;
        activityLIZ.runOnUiThread(new ARunnableS108S0100000_8(activityLIZ, 144));
    }

    public final void LLLLILI() {
        int iCurrentTimeMillis;
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModelLLLLIL = LLLLIL();
        aIPortraitCustomizeViewModelLLLLIL.getClass();
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        int i = 0;
        if (aIPortraitCustomizeViewModelLLLLIL.LLJJIJIL > 0 && (iCurrentTimeMillis = (int) ((System.currentTimeMillis() - aIPortraitCustomizeViewModelLLLLIL.LLJJIJIL) / 1000)) >= 0) {
            i = iCurrentTimeMillis;
        }
        C1687160u0Q c1687160u0QVQ2 = AIPortraitCustomizeViewModel.vQ2(aIPortraitCustomizeViewModelLLLLIL, null, null, Integer.valueOf(i), 3);
        c1687150u0P.getClass();
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C2275151E3l c2275151E3l = new AbstractC2275061E3c() { // from class: X.1E3l
            {
                C323580CmK c323580CmK = new C323580CmK(2);
                c323580CmK.LIZIZ(AbstractC2275061E3c.LIZJ);
                c323580CmK.LIZIZ(AbstractC2275061E3c.LJFF);
            }
        };
        AIGCEntranceInfo aIGCEntranceInfo = c1687160u0QVQ2.LIZ;
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(c1687160u0QVQ2, 540);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c2275151E3l, aIGCEntranceInfo, awS604S0100000_25);
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLLLLLZIL(this.LLJJIII);
        }
        NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ2 != null) {
            navigationSceneLIZ2.LLLLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLJ() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel r0 = r8.LLLLIL()
            X.0tdi r1 = r0.zQ2()
            r6 = 0
            if (r1 == 0) goto L22
            java.lang.String r0 = r0.LLJJIJI
            int r0 = r0.length()
            r5 = 1
            if (r0 > 0) goto L66
            X.0tzw r0 = r1.LIZ
            X.0tRU<com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem> r1 = r0.LIZ
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L26
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L26
        L22:
            r8.LLLLILI()
            return
        L26:
            java.util.Iterator r7 = r1.iterator()
        L2a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r4 = r7.next()
            com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem r4 = (com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem) r4
            java.lang.Boolean r0 = r4.isUploadEntry
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 != 0) goto L52
            java.lang.String r2 = r4.currentPromptText
            java.lang.String r1 = ""
            if (r2 != 0) goto L47
            r2 = r1
        L47:
            java.lang.String r0 = r4.actualPrompt
            if (r0 == 0) goto L4c
            r1 = r0
        L4c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r0 == 0) goto L66
        L52:
            java.lang.Boolean r0 = r4.isUploadEntry
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L2a
            java.lang.String r0 = r4.coverUrl
            if (r0 == 0) goto L2a
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 != r5) goto L2a
        L66:
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r8.requireSceneContext()
            boolean r0 = r8.LLJJI
            if (r0 == 0) goto Lab
            r0 = 2131886953(0x7f120369, float:1.94085E38)
        L73:
            r4.<init>(r1, r0)
            X.0mTF r3 = new X.0mTF
            X.0mTM r2 = new X.0mTM
            r2.<init>(r4)
            r0 = 2131825784(0x7f111478, float:1.9284434E38)
            r2.LJFF(r0)
            r0 = 2131825781(0x7f111475, float:1.9284428E38)
            r2.LIZ(r0)
            r2.LJII = r6
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 834(0x342, float:1.169E-42)
            r1.<init>(r8, r0)
            X.C985403tE.LIZ(r2, r1)
            r3.<init>(r2)
            android.app.Dialog r0 = r3.LJ()
            X.C1389610mGV.LIZIZ(r0)
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto Laa
            r0 = 51
            r1.setSoftInputMode(r0)
        Laa:
            return
        Lab:
            r0 = 2131886956(0x7f12036c, float:1.9408505E38)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686850tzv.LLLLJ():void");
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLLLLLZIL(this.LLJJIII);
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        Activity activityLIZ;
        Window window;
        super.onPause();
        Context sceneContext = getSceneContext();
        if (sceneContext == null || (activityLIZ = C06MM.LIZ(sceneContext)) == null || (window = activityLIZ.getWindow()) == null) {
            return;
        }
        C0DRA.LIZ(window, true);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        Context sceneContext = getSceneContext();
        Activity activityLIZ = sceneContext != null ? C06MM.LIZ(sceneContext) : null;
        C19EG c19eg = activityLIZ instanceof C19EG ? (C19EG) activityLIZ : null;
        if (c19eg != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
            tuxImmersionBar.LJII();
            tuxImmersionBar.LJIIIZ(0);
            tuxImmersionBar.LJFF(0);
            immersionBarLJIILJJIL.LJIIJ(!this.LLJJI);
            immersionBarLJIILJJIL.LJII(!this.LLJJI);
            tuxImmersionBar.LIZLLL();
            C0DRA.LIZ(c19eg.getWindow(), false);
        }
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModelLLLLIL = LLLLIL();
        if (aIPortraitCustomizeViewModelLLLLIL.LLIZ) {
            aIPortraitCustomizeViewModelLLLLIL.LLILZLL = EnumC550780Liu.RESUME;
            aIPortraitCustomizeViewModelLLLLIL.LLJJIJIL = System.currentTimeMillis();
            aIPortraitCustomizeViewModelLLLLIL.LLIZ = false;
            aIPortraitCustomizeViewModelLLLLIL.LLJJJ.clear();
            aIPortraitCustomizeViewModelLLLLIL.CQ2(aIPortraitCustomizeViewModelLLLLIL.LLJJJIL);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(367));
        C1664590tQ1.LIZLLL(this, "AIPortraitCustomizeScene", false, new AwS587S0100000_8(this, 737), 2);
        C1664600tQ2.LIZ(this, "AIPortraitCustomizeScene", new AwS587S0100000_8(this, 738));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        InterfaceC525060KiW interfaceC525060KiW = null;
        if (c1drg != null) {
            interfaceC525060KiW = (InterfaceC525060KiW) c1drg.LJII(InterfaceC525060KiW.class, null);
        }
        this.LLJJ = interfaceC525060KiW;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        PortraitStyleItem portraitStyleItem;
        super.onCreate(bundle);
        Bundle bundleLIZIZ = this.mArguments;
        if (bundleLIZIZ == null && (bundleLIZIZ = C565520MFy.LIZIZ(this)) == null) {
            bundleLIZIZ = new Bundle();
        }
        AIPortraitEnterParams.Companion.getClass();
        AIPortraitEnterParams aIPortraitEnterParamsLIZ = C557120Lt8.LIZ(bundleLIZIZ);
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModelLLLLIL = LLLLIL();
        String str = aIPortraitEnterParamsLIZ.cameoId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        aIPortraitCustomizeViewModelLLLLIL.LLILLJJLI = str;
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModelLLLLIL2 = LLLLIL();
        String str3 = aIPortraitEnterParamsLIZ.cameoImage;
        if (str3 == null) {
            str3 = "";
        }
        aIPortraitCustomizeViewModelLLLLIL2.LLILLL = str3;
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModelLLLLIL3 = LLLLIL();
        String str4 = aIPortraitEnterParamsLIZ.creationId;
        if (str4 != null) {
            str2 = str4;
        }
        aIPortraitCustomizeViewModelLLLLIL3.LLILZ = str2;
        LLLLIL().LLILZLL = EnumC550780Liu.ENTER;
        LLLLIL().LLIZLLLIL = aIPortraitEnterParamsLIZ.entranceInfo;
        LLLLIL().LLJ = aIPortraitEnterParamsLIZ.consumptionModel;
        LLLLIL().LLJIJIL = aIPortraitEnterParamsLIZ.isFreeCreate;
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModelLLLLIL4 = LLLLIL();
        Parcelable parcelable = aIPortraitEnterParamsLIZ.styleItem;
        if (parcelable instanceof PortraitStyleItem) {
            portraitStyleItem = (PortraitStyleItem) parcelable;
        } else {
            portraitStyleItem = null;
        }
        aIPortraitCustomizeViewModelLLLLIL4.LLJI = portraitStyleItem;
        this.LLJJI = !Intrinsics.LJFF(aIPortraitEnterParamsLIZ.themeMode, "light");
        LLLLIL().LLILZIL = this.LLJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIIIILLL(X.InterfaceC1680500tpg r35, int r36) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686850tzv.LLLLIIIILLL(X.0tpg, int):void");
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        ConnectivityManager connectivityManager;
        super.onViewCreated(view, bundle);
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this, this.LLJJIII);
        }
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModelLLLLIL = LLLLIL();
        if (!aIPortraitCustomizeViewModelLLLLIL.LLJJIJIIJIL) {
            aIPortraitCustomizeViewModelLLLLIL.LLJJIJIIJIL = true;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aIPortraitCustomizeViewModelLLLLIL), null, null, new C1686880tzy(aIPortraitCustomizeViewModelLLLLIL, null), 3);
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            Object objH2 = C786410Ut5.H2(sceneContext, "connectivity");
            if ((objH2 instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) objH2) != null) {
                getLifecycle().addObserver(new NetworkConnectivityUtil$createLifeCycleObserver$1(connectivityManager, new InterfaceC565580MGe() { // from class: X.0MGd
                    @Override // X.InterfaceC565580MGe
                    public final void LIZ(EnumC565560MGc enumC565560MGc) {
                        int i = C565550MGb.LIZ[enumC565560MGc.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                C201955140j.LIZIZ("AIPortraitCustomizeScene", "Network unavailable");
                                this.LIZ.LLLLJI();
                                return;
                            }
                            throw new C1954807lC();
                        }
                        C201955140j.LIZIZ("AIPortraitCustomizeScene", "Network available");
                        this.LIZ.LLJJIJI = false;
                    }
                }));
            }
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                LLLLJI();
            }
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC1427810nG7 enumC1427810nG7;
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        ComposeView composeView = new ComposeView(frameLayout.getContext(), null, 6);
        C786410Ut5.k6(composeView, new FrameLayout.LayoutParams(-1, -1));
        if (this.LLJJI) {
            enumC1427810nG7 = EnumC1427810nG7.Dark;
        } else {
            enumC1427810nG7 = EnumC1427810nG7.Light;
        }
        C1669670tYD.LJ(composeView, enumC1427810nG7, new C19719212De(-311960276, new AwS616S0100000_2(this, 146), true));
        frameLayout.addView(composeView);
        return frameLayout;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIILL(X.InterfaceC1686920u02 r24, X.C1686860tzw r25, X.InterfaceC1680500tpg r26, int r27) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686850tzv.LLLLIILL(X.0u02, X.0tzw, X.0tpg, int):void");
    }
}
