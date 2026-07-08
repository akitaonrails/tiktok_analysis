package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.assem.FriendsMainPageFragmentAssem;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.dot.request.RedDotPolling;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.assem.FriendsTabProtocolAssem;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi;
import com.ss.android.ugc.aweme.repostfeed.experiment.RepostFeedConfig;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.tab.FriendsTabProtocol;
import com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586480rO2 implements ISocial2TabDelegateService {
    public boolean LIZ;
    public boolean LIZIZ = true;
    public FriendsTabProtocolAssem LIZJ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void clearFriends2TabAssem() {
        this.LIZJ = null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final String getSocial2TabTabName() {
        return "FRIENDS_FEED";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final C13IQ<? extends AbstractC738140SxQ> initFriendsTabMainPageFragmentAssem() {
        return C13LE.LIZ(FriendsMainPageFragmentAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final Fragment getFriendsTabFragment() {
        return new FriendsTabContainerFragment();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final BottomTabProtocol getFriendsTabProtocol() {
        return new FriendsTabProtocol();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void registerRedDotBytesync() {
        if (((Boolean) C260150AHl.LIZ.getValue()).booleanValue()) {
            if (FriendsTabTopExperiment.LIZIZ() || C1586580rOC.LIZIZ(false)) {
                C1528020prk.LIZ().getClass();
                C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.SOCIAL_2_TAB_RED_DOT_ONLINE, new InterfaceC596980NbE() { // from class: X.0rOI
                    @Override // X.InterfaceC596980NbE
                    public final void LJ(C1525630pnt c1525630pnt) {
                        boolean zLJI = MethodIDManager.LJI(71993);
                        if (((Number) C296320BjS.LIZ.getValue()).intValue() >= 1) {
                            long millis = TimeUnit.SECONDS.toMillis(((Number) C260120AHi.LIZ.getValue()).longValue());
                            if (millis > 0) {
                                C1586680rOM.LIZ.getClass();
                                long j = C1586680rOM.LIZLLL;
                                if (j != 0 && SystemClock.elapsedRealtime() - j < millis) {
                                    if (zLJI) {
                                        MethodIDManager.LJ();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        C1586680rOM c1586680rOM = C1586680rOM.LIZ;
                        EnumC1586970rOp enumC1586970rOp = EnumC1586970rOp.WEB_SOCKET;
                        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(498);
                        c1586680rOM.getClass();
                        C1586680rOM.LIZJ(enumC1586970rOp, aFwS213S0000000_24);
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean shouldInitSocial2TabV1() {
        return C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab() && !C1589640rT8.LIZIZ.F2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean shouldInitSocial2TabV1ForEarlyInit() {
        if (!C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTabForEarlyInit()) {
            return false;
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
        EnumC308700C8e enumC308700C8e = EnumC308700C8e.FRIENDS_2TAB_ASSEM_INIT;
        c1585070rLl.getClass();
        return !C1585070rLl.LJFF(enumC1584360rKc, enumC308700C8e);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean shouldShowFriendsTabForEarlyInit() {
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
        EnumC308700C8e enumC308700C8e = EnumC308700C8e.FRIENDS_SERVICE_SHOULD_SHOW_FRIENDS_TAB;
        c1585070rLl.getClass();
        return C1585070rLl.LJIIIZ(enumC1584360rKc, enumC308700C8e) || C1585070rLl.LJIIIIZZ(enumC1584360rKc, enumC308700C8e);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void tryToShowForcePermissionDialog() {
        C19EG c19egLIZIZ;
        C1587220rPE.LIZ.getClass();
        if (C1587220rPE.LIZLLL() || (c19egLIZIZ = StateOwner.LL.LIZIZ()) == null) {
            return;
        }
        C1587270rPJ.LL.getClass();
        C1587270rPJ.LIZJ(c19egLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean checkSearchRestriction() {
        if (!ComplianceServiceProvider.LJIIJJI().LJIIIZ()) {
            return false;
        }
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
        c1389890mGx.LJIIIZ(2131834392);
        c1389890mGx.LJIIJJI();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean friendsTabStylePrivacyHint() {
        return shouldShowFriendsTab();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final String getDefaultLandingPage() {
        if (C1586750rOT.LIZ().LJIJI("REPOST_FEED") > 0 && C1586750rOT.LIZ().LJIJI("FRIENDS_FEED") == 0) {
            C1583300rIu.LIZ.getClass();
            RepostFeedConfig repostFeedConfigLIZ = C1583300rIu.LIZ();
            if (repostFeedConfigLIZ != null && repostFeedConfigLIZ.landingToRepostFeed == 1 && C1587150rP7.LIZIZ.LJJIII()) {
                return "REPOST_FEED";
            }
        }
        return "FRIENDS_FEED";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean shouldShowFriendsTab() {
        if (C343780Ddo.LIZIZ()) {
            C1585070rLl c1585070rLl = C1585070rLl.LIZ;
            EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
            c1585070rLl.getClass();
            return C1585070rLl.LJIIIZ(enumC1584360rKc, null) || C1585070rLl.LJIIIIZZ(enumC1584360rKc, null);
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null) {
            return false;
        }
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        if (iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
            return false;
        }
        return FriendsTabTopExperiment.LIZIZ() ? ((AbstractC848400XPy) iAccountUserServiceLJFF).isLogin() : C1586580rOC.LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void addTopTabChangeListener(InterfaceC1584770rLH interfaceC1584770rLH) {
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null && (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
            iFriendsTabLayoutAbilityLIZLLL.dT0(interfaceC1584770rLH);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final InterfaceC1571760r0I generateToolbarIconView(Context context) {
        return new C1585010rLf(context, null);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final int getSocial2TabFeedType(String str) {
        if (shouldShowFriendsTab()) {
            if (Intrinsics.LJFF(str, "REPOST_FEED")) {
                return EnumC1586610rOF.REPOST_FEED.getType();
            }
            return EnumC1586610rOF.FRIENDS_FEED.getType();
        }
        return EnumC1586610rOF.UNKNOWN.getType();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void onMultiTabLanding(String str) {
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if ((c19egLIZIZ instanceof Context) && c19egLIZIZ != null) {
            C1584830rLN.LIZ(c19egLIZIZ, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void preloadFriendsTabViews(Context context) {
        if (C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab()) {
            C20673215v0.LJI(R.layout.f9y, context);
            int i = 0;
            do {
                C20673215v0.LJI(R.layout.f_1, context);
                i++;
            } while (i < 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final C443120HZe<List<String>, List<String>, List<C0VNS>> readHistory(EnumC1360770lVz enumC1360770lVz) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C0VNS> listLIZJ = C1593830rZt.LIZIZ.LIZJ(null);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
        Iterator<C0VNS> it2 = listLIZJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        List<String> listLIZ = C0O0S.LIZ(arrayList);
        List<C0VNJ> listLIZJ2 = C797820VRk.LIZIZ.LIZJ();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ2, 10));
        Iterator<C0VNJ> it3 = listLIZJ2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().LIZ);
        }
        List<String> listLIZ2 = C0O0S.LIZ(arrayList2);
        List<C0VNS> listLIZIZ = C0O0S.LIZIZ(C1593830rZt.LIZIZ.LJI());
        Objects.toString(enumC1360770lVz);
        listLIZ.toString();
        listLIZ2.toString();
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator it4 = ((ArrayList) listLIZIZ).iterator();
        while (it4.hasNext()) {
            arrayList3.add(((C0VNS) it4.next()).LIZ);
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        final int value = enumC1360770lVz.getValue();
        c1587740rQ4.getClass();
        C15O7.LIZJ(new Callable() { // from class: X.05Wm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("FriendsTabTechMonitor@425.reportReadHistoryPerf$1");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("duration", String.valueOf(jCurrentTimeMillis2));
                linkedHashMap.put(Scene.SCENE_SERVICE, String.valueOf(value));
                C20684815ws.LJIILLIIL("friends_read_history_perf", linkedHashMap);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FriendsTabTechMonitor@425.reportReadHistoryPerf$1");
                return unit;
            }
        });
        return new C443120HZe<>(listLIZ, listLIZ2, listLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void social2TabPublishLanding(Context context) {
        C1584830rLN.LIZ(context, "FRIENDS_FEED");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final AbstractC738140SxQ initSocial2TabV1Assem(C19EG c19eg, ExecutorService executorService) {
        if (((Number) C293120BeI.LIZ("social_2tab_assem_opt", new C1583390rJ3())).intValue() == 1) {
            if (this.LIZJ == null) {
                synchronized (C13LE.LIZ(C1586480rO2.class)) {
                    try {
                        if (this.LIZJ == null) {
                            FriendsTabProtocolAssem friendsTabProtocolAssem = new FriendsTabProtocolAssem();
                            if (executorService != null) {
                                C08TN.LIZ().LJ("friend_tab_protocal_commit_preload", false);
                                friendsTabProtocolAssem.bo(c19eg, executorService);
                                C08TN.LIZ().LJI("friend_tab_protocal_commit_preload");
                            }
                            this.LIZJ = friendsTabProtocolAssem;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return this.LIZJ;
        }
        FriendsTabProtocolAssem friendsTabProtocolAssem2 = new FriendsTabProtocolAssem();
        if (executorService != null) {
            C08TN.LIZ().LJ("friend_tab_protocal_commit_preload", false);
            friendsTabProtocolAssem2.bo(c19eg, executorService);
            C08TN.LIZ().LJI("friend_tab_protocal_commit_preload");
        }
        return friendsTabProtocolAssem2;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void initialize(C19EG c19eg, boolean z) {
        boolean zLJI = MethodIDManager.LJI(72016);
        StateOwner stateOwner = StateOwner.LL;
        stateOwner.getClass();
        StateOwner.LLILLJJLI = new WeakReference<>(c19eg);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(stateOwner);
        C343710Ddh.LIZ(c19eg).wQ2(stateOwner);
        if (!StateOwner.LLJJJIL) {
            StateOwner.LLJJJIL = true;
            C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0CNb
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("StateOwner@b9a9.observeAppActivityLifecycle$1");
                    if (((Boolean) obj).booleanValue()) {
                        StateOwner.LL.getClass();
                        StateOwner.LLJ.postValue(Boolean.TRUE);
                        Iterator<Function1<Boolean, Unit>> it2 = StateOwner.LLJIJIL.iterator();
                        while (it2.hasNext()) {
                            it2.next().invoke(Boolean.TRUE);
                        }
                    } else if (StateOwner.LLILLL) {
                        StateOwner.LLILLL = false;
                    } else {
                        StateOwner.LL.getClass();
                        StateOwner.LLIZLLLIL.postValue(Boolean.TRUE);
                        Iterator<Function1<Boolean, Unit>> it3 = StateOwner.LLJI.iterator();
                        while (it3.hasNext()) {
                            it3.next().invoke(Boolean.TRUE);
                        }
                    }
                    C1C7U.LIZIZ("StateOwner@b9a9.observeAppActivityLifecycle$1");
                }
            });
        }
        if (this.LIZ || !C0BLH.LIZ()) {
            if (C1586520rO6.LIZ().enableDowngrade && C1586520rO6.LIZ().downgradeFriendsDialogInitialize) {
                C0S78.LIZJ(AFwS213S0000000_24.get$arr$(165), true);
            } else {
                C1587270rPJ c1587270rPJ = C1587270rPJ.LL;
                C1587270rPJ.LIZLLL();
            }
        }
        C08TN.LIZ().LJ("friend_tab_service_init_inner_1", false);
        if (((Number) C0BLH.LIZ.getValue()).intValue() != 2 || C1586580rOC.LIZIZ(false) || FriendsTabTopExperiment.LIZIZ()) {
            if (C1586520rO6.LIZ().enableDowngrade && C1586520rO6.LIZ().downgradeRedDotInitialize) {
                C0S78.LIZJ(new C1586530rO7(z), true);
            } else {
                C1586750rOT.LIZ().LJI(z);
            }
        }
        C08TN.LIZ().LJI("friend_tab_service_init_inner_1");
        C08TN.LIZ().LJ("friend_tab_service_init_inner_2", false);
        if (this.LIZ || !C0BLH.LIZ()) {
            if (C1586520rO6.LIZJ()) {
                C0S78.LIZJ(AFwS213S0000000_24.get$arr$(166), true);
            } else {
                C1589640rT8.LIZIZ.m3();
            }
        }
        C08TN.LIZ().LJI("friend_tab_service_init_inner_2");
        if (this.LIZ && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C15O7.LJIIIIZZ(3000L).LJ(new InterfaceC2385309Wh() { // from class: X.0rO3
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("FriendsTabDelegateServiceImpl@af9f.initialize$4");
                    if (C319860CgK.LIZ()) {
                        C1599640rjG.LIZIZ.Fu(EnumC1586970rOp.SWITCH_ACCOUNT);
                    } else {
                        this.LIZ.runColdStartTaskV2(false, EnumC1586970rOp.SWITCH_ACCOUNT);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FriendsTabDelegateServiceImpl@af9f.initialize$4");
                    return unit;
                }
            }, C15O7.LJI, null);
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 430);
            LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, c19eg, true);
            if (C1586520rO6.LIZJ()) {
                C0S78.LIZJ(new AwS425S0200000_24(lifecycleOwnerRequireMainSAFLifecycle, awS568S0100000_24, 21), true);
            } else {
                StateOwner.LLILZ.observe(lifecycleOwnerRequireMainSAFLifecycle, (Observer) awS568S0100000_24.invoke());
            }
        }
        this.LIZIZ = true;
        if (ComplianceServiceProvider.LJI().LJIIJ(false)) {
            AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(this, c19eg, 23);
            if (C1586520rO6.LIZJ()) {
                C0S78.LIZJ(new AwS425S0200000_24(c19eg, awS425S0200000_24, 22), true);
            } else {
                ComplianceServiceProvider.LJI().LJJIII().observe(c19eg, (Observer) awS425S0200000_24.invoke());
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void runColdStartTaskV2(boolean z, EnumC1586970rOp enumC1586970rOp) {
        boolean z2;
        String scene;
        String scene2;
        if (z && C0BLH.LIZ()) {
            C2487409ou.LIZJ(new Runnable() { // from class: X.0rLX
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FriendsTabDelegateServiceImpl@af9f.runColdStartTaskV2$1");
                    try {
                        C1587270rPJ c1587270rPJ = C1587270rPJ.LL;
                        C1587270rPJ.LIZLLL();
                        C1589640rT8.LIZIZ.m3();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FriendsTabDelegateServiceImpl@af9f.runColdStartTaskV2$1");
                }
            });
        }
        this.LIZ = true;
        if (C319860CgK.LIZ()) {
            C0W17.LIZJ("Social2TabService", "runColdStartTaskV2 returned since current is friends v3 tab");
            return;
        }
        C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
        if (!c1595430rcT.LIZJ().shouldShowFriendsTab()) {
            return;
        }
        ((ILauncherTaskApi) ServiceManager.get().getService(ILauncherTaskApi.class)).initPowerPreload();
        EnumC1586970rOp enumC1586970rOp2 = EnumC1586970rOp.LOGIN_SUCCESS;
        if (enumC1586970rOp == enumC1586970rOp2 || enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT) {
            C2487409ou.LIZJ(new Runnable() { // from class: X.0rLW
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
                    C1C7U.LIZ("FriendsTabDelegateServiceImpl@af9f.runColdStartTaskV2$2");
                    try {
                        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
                        if (c19egLIZIZ != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
                            iSocial2TabProtocolAbilityLJI.rO0();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FriendsTabDelegateServiceImpl@af9f.runColdStartTaskV2$2");
                }
            });
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryFixPreloadWhenNoRedDotRequestInFriendsV1(),enable:");
        sbLIZ.append(C296370BjX.LIZ());
        sbLIZ.append(",!Social2TabService.redDotService.redDotLogic().hasDotRequest():");
        sbLIZ.append(!c1595430rcT.LIZIZ().redDotLogic().LJIJJLI());
        sbLIZ.append(",!FriendsFeedService.isCurrentInFriendsFeedV1():");
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        sbLIZ.append(!c1589640rT8.l2());
        C2188811AlT.LIZIZ(sbLIZ);
        if (C296370BjX.LIZ() && !c1595430rcT.LIZIZ().redDotLogic().LJIJJLI() && !c1589640rT8.l2()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (enumC1586970rOp == enumC1586970rOp2 || enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT || enumC1586970rOp == EnumC1586970rOp.COLD_START)) {
            if (z) {
                scene2 = EnumC1587000rOs.COLD_START.getScene();
            } else {
                scene2 = EnumC1587000rOs.HOMEPAGE_RECREATE.getScene();
            }
            c1589640rT8.i3(scene2, "", C1586540rO8.LIZ(enumC1586970rOp));
        } else {
            boolean zLIZ = C296370BjX.LIZ();
            Pair<Boolean, Boolean> pairLIZJ = C1587080rP0.LIZJ(enumC1586970rOp);
            boolean zBooleanValue = pairLIZJ.getFirst().booleanValue();
            boolean zBooleanValue2 = pairLIZJ.getSecond().booleanValue();
            if ((!zBooleanValue || !zBooleanValue2) && !zLIZ && !c1589640rT8.l2()) {
                if (z) {
                    scene = EnumC1587000rOs.COLD_START.getScene();
                } else {
                    scene = EnumC1587000rOs.HOMEPAGE_RECREATE.getScene();
                }
                c1589640rT8.i3(scene, "", C1586540rO8.LIZ(enumC1586970rOp));
            }
        }
        c1589640rT8.d2();
        SystemClock.elapsedRealtime();
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null) {
            c1595430rcT.LIZJ().preloadFriendsTabViews(c19egLIZIZ);
            c1589640rT8.i2(c19egLIZIZ);
            c1589640rT8.k3(c19egLIZIZ);
        }
        if (c1589640rT8.C2()) {
            return;
        }
        C01GW c01gw = C296320BjS.LIZ;
        if (((Number) c01gw.getValue()).intValue() < 2) {
            C1586680rOM c1586680rOM = C1586680rOM.LIZ;
            boolean zLJI = MethodIDManager.LJI(137209);
            c1586680rOM.getClass();
            C1586680rOM.LIZJ(enumC1586970rOp, null);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        if (((Number) c01gw.getValue()).intValue() < 1) {
            if (!C296340BjU.LIZ() || enumC1586970rOp != EnumC1586970rOp.COLD_START) {
                C786410Ut5.LJJZZIII(C0CAU.LIZ, new Runnable() { // from class: X.0rO5
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ2;
                        C1C7U.LIZ("FriendsTabDelegateServiceImpl@af9f.runColdStartTaskV2$4");
                        try {
                            RedDotPolling.LL.LIZJ();
                        } finally {
                            if (!zLIZ2) {
                            }
                        }
                        C1C7U.LIZIZ("FriendsTabDelegateServiceImpl@af9f.runColdStartTaskV2$4");
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void runDeferredRedDotTask(EnumC1586970rOp enumC1586970rOp, boolean z) {
        if (C1589640rT8.LIZIZ.C2()) {
            return;
        }
        if (z) {
            C1586680rOM c1586680rOM = C1586680rOM.LIZ;
            boolean zLJI = MethodIDManager.LJI(137209);
            c1586680rOM.getClass();
            C1586680rOM.LIZJ(enumC1586970rOp, null);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        if (!C296340BjU.LIZ() || enumC1586970rOp != EnumC1586970rOp.COLD_START) {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new Runnable() { // from class: X.0rO4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FriendsTabDelegateServiceImpl@af9f.runDeferredRedDotTask$1");
                    try {
                        RedDotPolling.LL.LIZJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FriendsTabDelegateServiceImpl@af9f.runDeferredRedDotTask$1");
                }
            });
        }
    }
}
