package X;

import Y.ARunnableS107S0100000_7;
import Y.ARunnableS21S0400000_12;
import Y.AfS0S1400100_7;
import Y.AfS107S0300000_12;
import Y.AfS176S0100000_7;
import Y.AfS181S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostFixAbnormalExitEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostLocateLiveCenterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNoPermissionDisplaySwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTabCacheOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTabLoadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.SupportLopLogSetting;
import com.bytedance.android.livesdk.livesetting.performance.GoLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.api.ILivePermissionApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.AnchorLevelPermission;
import webcast.api.room.EntranceConditionsPopup;
import webcast.api.room.GoLiveEventTracing;
import webcast.api.room.LivePermissionApply;
import webcast.api.room.LivePodcastResponse;
import webcast.api.room.LiveScenario;
import webcast.api.room.TryMode;

/* JADX INFO: renamed from: X.0Uot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783810Uot implements InterfaceC1654980tAW {
    public static C783850Uox LJIIIIZZ;
    public C443120HZe<Boolean, Boolean, Boolean> LIZ;
    public boolean LIZIZ = true;
    public C443120HZe<Boolean, DetailLivePermission, ApplyLivePermission> LIZJ;
    public static final C783810Uot LIZLLL = new C783810Uot();
    public static boolean LJ = false;
    public static boolean LJFF = false;
    public static boolean LJI = false;
    public static boolean LJII = false;
    public static boolean LJIIIZ = false;

    @Override // X.InterfaceC1654980tAW
    public final void LJFF() {
        LJ = true;
    }

    @Override // X.InterfaceC1654980tAW
    public final void LJIIIIZZ() {
        LJI = false;
        LJFF = false;
        if (GoLiveMemoryLeakOptSetting.INSTANCE.enable()) {
            C0J3Y.LIZ.getClass();
            C0J3Y.LJIJ();
            if (C771600UOo.LIZ) {
                ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Yg();
                C771600UOo.LIZ = false;
            }
        } else if (((Boolean) C274610ApX.LIZ.getValue()).booleanValue()) {
            C0J3Y.LIZ.getClass();
            C0J3Y.LJIJ();
            if (!C771600UOo.LIZ) {
                ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Yg();
                C771600UOo.LIZ = false;
            }
        } else if (!C771600UOo.LIZ) {
            C0J3Y.LIZ.getClass();
            C0J3Y.LJIJ();
            ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Yg();
            C771600UOo.LIZ = false;
        }
        if (LJIIIIZZ != null) {
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(LJIIIIZZ);
            LJIIIIZZ = null;
            LJIIIZ = false;
        }
        LJII = false;
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).releasePreRequestCache();
    }

    @Override // X.InterfaceC1654980tAW
    public final boolean LIZLLL() {
        return LiveTabLoadOptSetting.INSTANCE.enable();
    }

    @Override // X.InterfaceC1654980tAW
    public final boolean LJI() {
        Boolean boolLIZ = InterfaceC772190UQv.X2.LIZ();
        Boolean bool = Boolean.TRUE;
        return Intrinsics.LJFF(boolLIZ, bool) && LiveHostLocateLiveCenterSetting.getEnable() && bool.equals(InterfaceC772190UQv.Z2.LIZIZ());
    }

    @Override // X.InterfaceC1654980tAW
    public final void LJIIJ() {
        C783820Uou.LJII("pre_request");
    }

    @Override // X.InterfaceC1654980tAW
    public final Map<String, String> getLopLogParams() {
        C783820Uou.LIZ.getClass();
        return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLopLogParams();
    }

    public C783810Uot() {
        if (C19489211Ms.LIZ == null) {
            C19489211Ms.LIZ = new C09JN() { // from class: X.0QrB
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Throwable illegalStateException = (Throwable) obj;
                    C1C7U.LIZ("LiveServiceAdapter@4348.<init>$1L");
                    if (illegalStateException == null) {
                        illegalStateException = new IllegalStateException("unknown error");
                    }
                    C2344809Gs.LJFF("Live", Log.getStackTraceString(illegalStateException));
                    C1C7U.LIZIZ("LiveServiceAdapter@4348.<init>$1L");
                }
            };
        }
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.LJIILL(new InterfaceC586170Myt() { // from class: X.0Up8
                @Override // X.InterfaceC586170Myt
                public final void onAccountResult(int i, boolean z, int i2, User user) {
                    C783810Uot.LJ = false;
                }
            });
        }
    }

    @Override // X.InterfaceC1654980tAW
    public final void LJIIL() {
        boolean zLJI = MethodIDManager.LJI(138039);
        if (this.LIZIZ) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).requestLiveBanCapability(null);
            this.LIZIZ = false;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1654980tAW
    public final boolean hasLivePermission() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return iUserService != null && iUserService.isLogin() && LJ;
    }

    @Override // X.InterfaceC1654980tAW
    public final boolean LIZ() {
        return LJFF;
    }

    @Override // X.InterfaceC1654980tAW
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1654980tAW
    public final boolean LJIIIZ() {
        return LJI;
    }

    public static Boolean LJIILJJIL(LivePodcastResponse.ResponseData responseData) {
        boolean z;
        if (responseData.canBeLivePodcast || (LiveNoPermissionDisplaySwitch.INSTANCE.enable() && LiveTabLoadOptSetting.INSTANCE.isV2() && responseData.showMockLiveTab)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC1654980tAW
    public final void LIZJ(boolean z) {
        InterfaceC772190UQv.Z2.LJFF(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1654980tAW
    public final String LJ(String str) {
        return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getSchemaSyncFromCache(str);
    }

    @Override // X.InterfaceC1654980tAW
    public final void LJII(boolean z) {
        C1440005kM.LIZ(new C783950Up7(z));
    }

    @Override // X.InterfaceC1654980tAW
    public final <T> T getService(Class<T> cls) {
        return (T) ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).getService(cls);
    }

    @Override // X.InterfaceC1654980tAW
    public final void preloadLiveTabLegacy(Context context) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).preloadLiveTabLegacy(context);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).preRequestPreSchedule(true);
    }

    @Override // X.InterfaceC1654980tAW
    public final void updateLiveSourceParams(String str) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).updateLiveSourceParams(str);
    }

    @Override // X.InterfaceC1654980tAW
    public final void LJIIJJI(String str, boolean z, C783970Up9 c783970Up9) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).requestCreateInfoFromTools(str, z, c783970Up9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0Uow] */
    @Override // X.InterfaceC1654980tAW
    public final void LJIILIIL(final InterfaceC472150IfN interfaceC472150IfN, final String str, final String str2, final Map<String, String> map) {
        boolean zLJI = MethodIDManager.LJI(201066);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).recordButtonClickTime(Long.valueOf(System.currentTimeMillis()));
        this.LIZJ = null;
        LJIIZILJ(interfaceC472150IfN, str, str2, new Runnable() { // from class: X.0Uow
            /* JADX WARN: Type inference failed for: r3v0, types: [X.0Uox] */
            @Override // java.lang.Runnable
            public final void run() {
                final C783810Uot c783810Uot = this.LL;
                final InterfaceC472150IfN interfaceC472150IfN2 = interfaceC472150IfN;
                final String str3 = str;
                final String str4 = str2;
                final Map map2 = map;
                c783810Uot.getClass();
                C1C7U.LIZ("LiveServiceAdapter@4348.requestLivePermission$1L");
                if (C783810Uot.LJIIIIZZ == null) {
                    C783810Uot.LJIIIIZZ = new InterfaceC784190UpV() { // from class: X.0Uox
                        @Override // X.InterfaceC784190UpV
                        public final void LIZ(EnumC784160UpS enumC784160UpS) {
                            final C783810Uot c783810Uot2 = c783810Uot;
                            final InterfaceC472150IfN interfaceC472150IfN3 = interfaceC472150IfN2;
                            final String str5 = str3;
                            final String str6 = str4;
                            final Map map3 = map2;
                            c783810Uot2.getClass();
                            if (enumC784160UpS == EnumC784160UpS.STRONG && !C783810Uot.LJII) {
                                C11IR.LL.LJJI(100L, TimeUnit.MILLISECONDS).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0Up4
                                    @Override // X.InterfaceC781210Ukh
                                    public final void run() {
                                        c783810Uot2.LJIIZILJ(interfaceC472150IfN3, str5, str6, null, Boolean.TRUE, map3);
                                    }
                                }).LJJLJ();
                            }
                        }
                    };
                }
                if (!C783810Uot.LJIIIZ) {
                    ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).observerNetworkChange(C783810Uot.LJIIIIZZ);
                    C783810Uot.LJIIIZ = true;
                }
                C1C7U.LIZIZ("LiveServiceAdapter@4348.requestLivePermission$1L");
            }
        }, Boolean.FALSE, map);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIILLIIL(InterfaceC472150IfN interfaceC472150IfN, LivePodcastResponse.ResponseData responseData, Boolean bool, Boolean bool2) {
        boolean z;
        DetailLivePermission detailLivePermission;
        C783980UpA c783980UpA;
        ApplyLivePermission applyLivePermission;
        C754060Ti0 c754060Ti0;
        String str;
        int size;
        GoLiveEventTracing goLiveEventTracing;
        if (LiveTabCacheOptSetting.INSTANCE.isExp()) {
            if (responseData.canBeLivePodcast || (LiveNoPermissionDisplaySwitch.INSTANCE.enable() && LiveTabLoadOptSetting.INSTANCE.isV2() && responseData.showMockLiveTab)) {
                Long lValueOf = Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
                C783820Uou.LIZ.getClass();
                C783820Uou.LIZIZ.put(lValueOf, responseData);
            }
            if (responseData.isProAnchor) {
                InterfaceC772190UQv.X2.LIZJ(Boolean.TRUE);
            }
            C443120HZe<Boolean, Boolean, Boolean> c443120HZe = this.LIZ;
            if (c443120HZe == null) {
                this.LIZ = new C443120HZe<>(bool2, Boolean.valueOf(responseData.canBeLivePodcast), Boolean.valueOf(responseData.showMockLiveTab));
            } else if ((!c443120HZe.getFirst().booleanValue() || this.LIZ.getSecond().booleanValue() == responseData.canBeLivePodcast) && (!LiveNoPermissionDisplaySwitch.INSTANCE.enable() || this.LIZ.getThird().booleanValue() == responseData.showMockLiveTab)) {
                return;
            }
        }
        C464601rQ.LIZ(responseData);
        System.currentTimeMillis();
        LJ = responseData.canBeLivePodcast;
        LiveScenario liveScenario = responseData.liveScenario;
        TryMode tryMode = responseData.tryMode;
        if (tryMode != null && tryMode.hasCreatedRoom == 1) {
            z = true;
        } else {
            z = false;
        }
        LJI = z;
        LivePermissionApply livePermissionApply = responseData.livePermissionApply;
        AnchorLevelPermission anchorLevelPermission = responseData.anchorLevelPermission;
        boolean z2 = responseData.showLiveStudio;
        if (liveScenario != null) {
            detailLivePermission = new DetailLivePermission(liveScenario.enableLiveVideo, liveScenario.enableLiveScreenshot, liveScenario.enableLiveThirdParty, liveScenario.enableLiveStudio, z2, liveScenario.enableLiveVoice);
        } else {
            detailLivePermission = null;
        }
        if (tryMode == null) {
            c783980UpA = new C783980UpA(1);
        } else {
            c783980UpA = new C783980UpA(tryMode.hasCreatedRoom);
        }
        if (livePermissionApply != null) {
            applyLivePermission = new ApplyLivePermission(livePermissionApply.enableLiveVideo, livePermissionApply.enableScreenshot, livePermissionApply.enableThirdParty);
        } else {
            applyLivePermission = null;
        }
        if (anchorLevelPermission != null) {
            c754060Ti0 = new C754060Ti0(anchorLevelPermission.effects, anchorLevelPermission.liveIntro, anchorLevelPermission.liveGoal, anchorLevelPermission.promote, anchorLevelPermission.poll, anchorLevelPermission.playTogether);
        } else {
            c754060Ti0 = null;
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setDetailLivePermission(detailLivePermission);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setTryModeExperiment(c783980UpA);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setApplyLivePermission(applyLivePermission);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setAnchorLevelPermissionInPreview(c754060Ti0);
        C783820Uou.LIZ.getClass();
        if (SupportLopLogSetting.INSTANCE.getValue() && (goLiveEventTracing = responseData.goLiveEventTracing) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z3 = responseData.canBeLivePodcast;
            linkedHashMap.put("is_new_anchor", String.valueOf(goLiveEventTracing.isNewAnchor));
            linkedHashMap.put("days_since_get_perm", String.valueOf(goLiveEventTracing.daysSinceGetPerm));
            linkedHashMap.put("lop_level", String.valueOf(goLiveEventTracing.lopLevel));
            linkedHashMap.put("lop_level_stay_days", String.valueOf(goLiveEventTracing.lopLevelStayDays));
            linkedHashMap.put("has_permission", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0));
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setLopLogParams(linkedHashMap);
        }
        if (LiveNoPermissionDisplaySwitch.INSTANCE.enable()) {
            boolean z4 = responseData.showMockLiveTab;
            LJFF = z4;
            EntranceConditionsPopup entranceConditionsPopup = responseData.conditionsPopup;
            if (entranceConditionsPopup != null) {
                size = entranceConditionsPopup.conditions.size();
            } else {
                size = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_mock: ");
            sbLIZ.append(z4);
            sbLIZ.append(",Data: ");
            sbLIZ.append(size);
            C20441214yg.LIZIZ("DisplayLiveTab", C2188811AlT.LIZIZ(sbLIZ));
            if (z4 && !LJ) {
                LJ = true;
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setNoPermissionDisplayData(true, entranceConditionsPopup);
            } else {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setNoPermissionDisplayData(false, null);
            }
        }
        if (this.LIZJ == null && detailLivePermission != null && applyLivePermission != null) {
            this.LIZJ = new C443120HZe<>(Boolean.valueOf(LJ), detailLivePermission, applyLivePermission);
        }
        Map<String, String> lopLogParams = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLopLogParams();
        if (responseData.showMockLiveTab) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        lopLogParams.put("is_mock", str);
        interfaceC472150IfN.LIZ(Boolean.valueOf(LJ), detailLivePermission, applyLivePermission, bool, c783980UpA, lopLogParams);
    }

    public final void LJIIZILJ(InterfaceC472150IfN interfaceC472150IfN, final String str, final String str2, RunnableC783840Uow runnableC783840Uow, final Boolean bool, final Map map) {
        LivePodcastResponse livePodcastResponse;
        InterfaceC472150IfN interfaceC472150IfN2 = interfaceC472150IfN;
        C783810Uot c783810Uot = this;
        if (LiveTabCacheOptSetting.INSTANCE.isExp()) {
            Activity activityLIZIZ = null;
            c783810Uot.LIZ = null;
            if (LiveHostFixAbnormalExitEvent.enable()) {
                AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                if (abstractC1387200mCcLJFF != null) {
                    activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ();
                }
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportAbnormalLive(activityLIZIZ);
            }
            Long lValueOf = Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
            C783820Uou.LIZ.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) C783820Uou.LIZIZ;
            LivePodcastResponse.ResponseData responseData = (LivePodcastResponse.ResponseData) linkedHashMap.get(lValueOf);
            if (responseData != null) {
                c783810Uot = c783810Uot;
                interfaceC472150IfN2 = interfaceC472150IfN2;
                C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS21S0400000_12(c783810Uot, interfaceC472150IfN2, responseData, bool, 8));
            } else {
                linkedHashMap.clear();
                LivePodcastResponse.ResponseData responseData2 = (LivePodcastResponse.ResponseData) C2355009Kq.LJIILIIL(-1, LivePodcastResponse.ResponseData.class, "live_podcast_response");
                if ((responseData2 != null && LJIILJJIL(responseData2).booleanValue()) || ((livePodcastResponse = (LivePodcastResponse) C2355009Kq.LJIILIIL(-1, LivePodcastResponse.class, "live_podcast_response")) != null && (responseData2 = livePodcastResponse.data) != null && LJIILJJIL(responseData2).booleanValue())) {
                    C11NZ.LJIJJLI(new C346510DiD(responseData2, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS107S0300000_12(bool, interfaceC472150IfN2, c783810Uot, 6), new AfS176S0100000_7(interfaceC472150IfN2, 293));
                }
            }
        }
        int i = 1;
        LJII = true;
        if (map == null || !map.containsKey("fromPage") || map.get("fromPage") != "LiveCenter" || !LiveHostLocateLiveCenterSetting.getEnable()) {
            i = 0;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C480460Ism.LIZ().getClass();
        final C783810Uot c783810Uot2 = c783810Uot;
        final InterfaceC472150IfN interfaceC472150IfN3 = interfaceC472150IfN2;
        ((ILivePermissionApi) C480460Ism.LIZLLL(ILivePermissionApi.class)).getLivePodCast(i).LJJIJIIJIL(new AfS181S0100000_12(c783810Uot, 304)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN(interfaceC472150IfN3, str, str2, jElapsedRealtime, bool, map) { // from class: X.0Uov
            public final /* synthetic */ InterfaceC472150IfN LLILLJJLI;
            public final /* synthetic */ String LLILLL;
            public final /* synthetic */ long LLILZ;
            public final /* synthetic */ Boolean LLILZIL;
            public final /* synthetic */ Map LLILZLL;

            {
                this.LLILZ = jElapsedRealtime;
                this.LLILZIL = bool;
                this.LLILZLL = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C09JN
            public final void accept(Object obj) {
                T t;
                boolean z;
                C783810Uot c783810Uot3 = this.LL;
                InterfaceC472150IfN interfaceC472150IfN4 = this.LLILLJJLI;
                String str3 = this.LLILLL;
                long j = this.LLILZ;
                Boolean bool2 = this.LLILZIL;
                Map map2 = this.LLILZLL;
                BaseResponse baseResponse = (BaseResponse) obj;
                c783810Uot3.getClass();
                C1C7U.LIZ("LiveServiceAdapter@4348.requestLivePermissionFromServer$2L");
                C783810Uot.LJII = false;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (baseResponse != null && (t = baseResponse.data) != 0) {
                    c783810Uot3.LJIILLIIL(interfaceC472150IfN4, (LivePodcastResponse.ResponseData) t, bool2, Boolean.FALSE);
                    c783810Uot3.LJIIL();
                    if (str3.equals("smooth") && C783810Uot.LJ) {
                        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                        String str4 = (String) map2.get("mt_co_host_offlive_inviter_id");
                        if (map2.get("show_playbook_banner") == "1") {
                            z = true;
                        } else {
                            z = false;
                        }
                        iBroadcastService.requestCreateInfoFromTools(str4, z, null);
                    }
                    C783810Uot.LJIILL(1, C783810Uot.LJ ? 1 : 0, str3, "", jElapsedRealtime2 - j, bool2.booleanValue(), null);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Data is null");
                    interfaceC472150IfN4.onFailed(illegalStateException);
                    if ("shoot".equals(str3)) {
                        C486790J7d.LIZ(new ARunnableS107S0100000_7(illegalStateException, 272));
                    }
                    C783810Uot.LJIILL(0, 0, str3, "Data is null", jElapsedRealtime2 - j, bool2.booleanValue(), null);
                }
                if (C783810Uot.LJIIIIZZ != null) {
                    ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(C783810Uot.LJIIIIZZ);
                    C783810Uot.LJIIIIZZ = null;
                    C783810Uot.LJIIIZ = false;
                }
                C783810Uot.LJII = false;
                C1C7U.LIZIZ("LiveServiceAdapter@4348.requestLivePermissionFromServer$2L");
            }
        }, new AfS0S1400100_7(c783810Uot, interfaceC472150IfN2, str, str2, jElapsedRealtime, bool, runnableC783840Uow, 1));
    }

    public static void LJIILL(int i, int i2, String str, String str2, float f, boolean z, Integer num) {
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_broadcast_path_get_live_podcast_response", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJIL();
        String str3 = "normal";
        c474500IjALIZIZ.LJJII("normal", "enter_from");
        c474500IjALIZIZ.LJJII(str, "source");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_success");
        if ("smooth".equals(str)) {
            str3 = "smooth";
        }
        c474500IjALIZIZ.LJJII(str3, "is_smooth");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "can_live");
        c474500IjALIZIZ.LJJIFFI(Float.valueOf(f), "duration");
        c474500IjALIZIZ.LJJII(Boolean.valueOf(z), "from_retry");
        c474500IjALIZIZ.LJJII(str2, "error");
        if (num != null) {
            c474500IjALIZIZ.LJJII(num, "error_code");
        }
        c474500IjALIZIZ.LIZ();
    }
}
