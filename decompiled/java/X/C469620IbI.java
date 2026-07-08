package X;

import Y.ARunnableS14S0201000_7;
import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import Y.AfS62S0201000_7;
import android.content.Context;
import android.util.Log;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.GuideHostOpenGpsSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolbarTipsExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.IncreaseStrategySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveAvoidFriendPostPushExpV2;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEasyExitCardSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePreviewCardRepostGuideEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostNewAwarenessStoreSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAddServerFeatureSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnableTtmStrategy;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFollowGuideNewStyleSetting;
import com.bytedance.android.livesdk.signal.LiveEpiExpandLifecycleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.strategy.CacheEntry;
import com.bytedance.android.strategy.StrategyApi;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.PackageInfo;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyContainer;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyInfo;
import webcast.api.room.StrategyV2Request;

/* JADX INFO: renamed from: X.0IbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469620IbI {
    public static boolean LIZIZ;
    public static final HashMap<Integer, C469610IbH> LIZLLL;
    public static final HashMap<Integer, CacheEntry> LJ;
    public static final String LJFF;
    public static final C469620IbI LIZ = new C469620IbI();
    public static final Keva LIZJ = Keva.getRepo("repo_live_strategy");

    static {
        HashMap<Integer, C469610IbH> map = new HashMap<>();
        LIZLLL = map;
        LJ = new HashMap<>();
        LJIIJ(2, 86400000L);
        LJIIJ(3, 86400000L);
        LJIIJ(23, 2592000000L);
        LJIIJ(24, 86400000L);
        IHostSetting iHostSetting = (IHostSetting) C1161920gLG.LIZJ(IHostSetting.class);
        if (iHostSetting.LO2()) {
            LJIIJ(13, 86400000L);
        }
        if (iHostSetting.CI0()) {
            LJIIJ(5, 86400000L);
        }
        LiveEasyExitCardSetting liveEasyExitCardSetting = LiveEasyExitCardSetting.INSTANCE;
        if (liveEasyExitCardSetting.getConfig().enable && liveEasyExitCardSetting.getConfig().strategyControlSwipeCount > 0) {
            LJIIJ(12, 86400000L);
        }
        if (LiveAvoidFriendPostPushExpV2.INSTANCE.getValue() > 0) {
            LJIIJ(14, 86400000L);
        }
        if (LiveAddServerFeatureSetting.INSTANCE.enable()) {
            LJIIJ(15, 86400000L);
        }
        if (LiveEnableTtmStrategy.INSTANCE.combineRequest()) {
            LJIIJ(21, 86400000L);
        }
        LJIIJ(17, 86400000L);
        LJIIJ(18, 0L);
        if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
            LJIIJ(10, 86400000L);
        } else if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
            LJIIIZ(10);
        }
        LJIIIZ(4);
        if (IncreaseStrategySetting.INSTANCE.getValue()) {
            LiveFollowGuideNewStyleSetting liveFollowGuideNewStyleSetting = LiveFollowGuideNewStyleSetting.INSTANCE;
            if (!liveFollowGuideNewStyleSetting.enableNewStrategy() || LiveFollowGuideNewStyleSetting.applyFollowGuideNewStyle()) {
                if (liveFollowGuideNewStyleSetting.enableNewStrategy()) {
                    LJIIIZ(8);
                } else {
                    LJIIIZ(1);
                }
            }
        }
        map.put(6, new C469610IbH(EnumC1983507pp.INNER, 21600000L));
        if (ToolbarTipsExperiment.INSTANCE.hasTips()) {
            LJIIIZ(9);
        }
        if (LiveRepostNewAwarenessStoreSetting.INSTANCE.hitExperiment()) {
            LJIIIZ(20);
        }
        if (LivePreviewCardRepostGuideEnableSetting.INSTANCE.getValue()) {
            LJIIJ(19, 86400000L);
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (LiveNearbyTabSetting.INSTANCE.enable() && iHostAppContext.isLocationPermissionGranted(iHostAppContext.context())) {
            LJIIJ(22, 86400000L);
        }
        LJFF = "server_feature";
    }

    public static boolean LIZLLL(int i) {
        CacheEntry cacheEntry;
        long j;
        if (i == 21 || (cacheEntry = LJ.get(Integer.valueOf(i))) == null) {
            return false;
        }
        C469610IbH c469610IbH = LIZLLL.get(Integer.valueOf(i));
        if (c469610IbH != null) {
            j = c469610IbH.LIZIZ;
        } else {
            j = 86400000;
        }
        if (System.currentTimeMillis() - cacheEntry.timestamp >= j) {
            return false;
        }
        return true;
    }

    public static void LJ(boolean z) {
        if (LiveEnableTtmStrategy.INSTANCE.singleRequest() && !LIZIZ) {
            LIZIZ = true;
            C823050WQl.LIZJ().submit(new Runnable() { // from class: X.0IPU
                public static void LIZ() {
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(21);
                    StrategyV2Request strategyV2Request = new StrategyV2Request();
                    C469620IbI c469620IbI = C469620IbI.LIZ;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).p22(arrayList, arrayList2);
                    Pair pair = new Pair(arrayList, arrayList2);
                    List<StrategyInfo> list = (List) pair.getFirst();
                    List<PackageInfo> list2 = (List) pair.getSecond();
                    strategyV2Request.scenes = C13LP.LJJLIIIJ(listLJIILJJIL, ",", null, null, 0, null, null, 62);
                    strategyV2Request.strategyInfos = list;
                    strategyV2Request.packageInfos = list2;
                    C480460Ism.LIZ().getClass();
                    ((StrategyApi) C480460Ism.LIZLLL(StrategyApi.class)).postStrategyV2(strategyV2Request).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJZ(new C09JN() { // from class: X.0IPT
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            Map<Integer, StrategyData> map;
                            StrategyData strategyData;
                            C1C7U.LIZ("StrategySDKManager@738d.loadOuterScenes$1$1");
                            StrategyContainer strategyContainer = (StrategyContainer) ((BaseResponse) obj).data;
                            if (strategyContainer != null && (map = strategyContainer.sceneDataMap) != null && (strategyData = map.get(21)) != null) {
                                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Jn0(strategyData);
                            }
                            C1C7U.LIZIZ("StrategySDKManager@738d.loadOuterScenes$1$1");
                        }
                    }, new AfS176S0100000_7(listLJIILJJIL, 215), new InterfaceC781210Ukh() { // from class: X.0IPV
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                            C20441214yg.LIZIZ("StrategySDKManagerV2", "loadOuterScenes: onComplete");
                            ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Ww0();
                        }
                    });
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StrategySDKManager@738d.loadOuterScenes$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StrategySDKManager@738d.loadOuterScenes$1");
                }
            });
        }
        HashMap<Integer, C469610IbH> map = LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, C469610IbH> entry : map.entrySet()) {
            if (entry.getValue().LIZ == EnumC1983507pp.OUTER) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadOuterScenes: forceUpdate=");
        sbLIZ.append(z);
        sbLIZ.append(" list=");
        sbLIZ.append(arrayList);
        C20441214yg.LIZIZ("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!LIZLLL(((Number) obj).intValue())) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2);
        }
        if (arrayList.isEmpty()) {
            C20441214yg.LJIIL("StrategySDKManagerV2", "loadOuterScenes: empty return");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("loadOuterScenes: final list=");
        sbLIZ2.append(arrayList);
        C20441214yg.LIZIZ("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
        LJIIIIZZ(2, null, arrayList);
    }

    public static void LJIIIZ(int i) {
        LIZLLL.put(Integer.valueOf(i), new C469610IbH(EnumC1983507pp.INNER, 86400000L));
    }

    public static Object LIZ(String str, C469710IbR c469710IbR) {
        C480460Ism.LIZ().getClass();
        StrategyApi strategyApi = (StrategyApi) C480460Ism.LIZIZ(StrategyApi.class);
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c469710IbR));
        c2252611DEt.LJIJJ();
        strategyApi.strategyCheck(17, "live_toplive_golive_button_tooltip", str).LJJLL(new C516201zk(c2252611DEt, 197), new C516201zk(c2252611DEt, 198));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c469710IbR);
        }
        return objLJIJ;
    }

    public static void LJFF(List list, Map map) {
        EncourageGoLiveCard encourageGoLiveCard;
        StrategyData strategyData;
        ShowMode showMode;
        if (!list.contains(6)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_special_card_monitor");
        c474500IjALIZ.LJJII(1, "stage");
        if (map != null && (strategyData = (StrategyData) map.get(6)) != null && (showMode = strategyData.showMode) != null) {
            encourageGoLiveCard = showMode.encourageGoLiveCard;
        } else {
            encourageGoLiveCard = null;
        }
        if (encourageGoLiveCard != null) {
            c474500IjALIZ.LJJII(1, "stage_result");
            c474500IjALIZ.LJJII("success", "description");
            c474500IjALIZ.LJJII(encourageGoLiveCard.cardId, "card_id");
            c474500IjALIZ.LJJII(Integer.valueOf(encourageGoLiveCard.style), "card_type");
        } else {
            c474500IjALIZ.LJJII(0, "stage_result");
            c474500IjALIZ.LJJII("failed", "description");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(int i, long j) {
        LIZLLL.put(Integer.valueOf(i), new C469610IbH(EnumC1983507pp.OUTER, j));
    }

    public static void LJIIL(int i, StrategyData strategyData) {
        CacheEntry cacheEntry = new CacheEntry(strategyData, System.currentTimeMillis());
        LJ.put(Integer.valueOf(i), cacheEntry);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new_scene_");
        sbLIZ.append(i);
        LIZJ.storeString(C2188811AlT.LIZIZ(sbLIZ), C1516000pYM.LIZJ(cacheEntry));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(C470570Icp c470570Icp, List list, InterfaceC469640IbK interfaceC469640IbK) {
        Map<Integer, StrategyData> map;
        StrategyData strategyData;
        String str;
        Map<Integer, StrategyData> map2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queryScenes: success resp=");
        sbLIZ.append(c470570Icp);
        C20441214yg.LIZIZ("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        StrategyContainer strategyContainer = (StrategyContainer) c470570Icp.data;
        if (strategyContainer != null) {
            map = strategyContainer.sceneDataMap;
        } else {
            map = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            StrategyContainer strategyContainer2 = (StrategyContainer) c470570Icp.data;
            if (strategyContainer2 != null && (map2 = strategyContainer2.sceneDataMap) != null) {
                strategyData = map2.get(Integer.valueOf(iIntValue));
            } else {
                strategyData = null;
            }
            if (list.size() == 1 && interfaceC469640IbK != null) {
                interfaceC469640IbK.LIZ(strategyData);
            }
            if (iIntValue == 15) {
                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).OY(LJFF, strategyData);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateCache: scene=");
                sbLIZ2.append(iIntValue);
                sbLIZ2.append(" cacheEntry=");
                if (strategyData != null) {
                    str = strategyData.strategyId;
                } else {
                    str = null;
                }
                sbLIZ2.append(str);
                C20441214yg.LIZIZ("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
                LJ.put(Integer.valueOf(iIntValue), new CacheEntry(strategyData, System.currentTimeMillis()));
            } else if (iIntValue == 21) {
                if (strategyData != null) {
                    ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Jn0(strategyData);
                }
            }
            LJIIL(iIntValue, strategyData);
        }
        LJFF(list, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.ArrayList] */
    public static void LJIIIIZZ(final int i, final InterfaceC469640IbK interfaceC469640IbK, final List list) {
        Context context;
        T arrayList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queryScenes: start scenes=");
        sbLIZ.append(list);
        sbLIZ.append(" retryCount=");
        sbLIZ.append(i);
        sbLIZ.append(" callBack=");
        sbLIZ.append(interfaceC469640IbK);
        C20441214yg.LJ("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = true;
        if (!UserService.getInstance().user().isLogin()) {
            C20441214yg.LJIIL("StrategySDKManagerV2", "queryScenes: not login return");
            if (list.size() == 1 && interfaceC469640IbK != null) {
                interfaceC469640IbK.LIZ(null);
                return;
            }
            return;
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ArrayList();
        LiveAddServerFeatureSetting liveAddServerFeatureSetting = LiveAddServerFeatureSetting.INSTANCE;
        if (liveAddServerFeatureSetting.enable() && list.contains(15)) {
            List<Integer> listBY1 = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).BY1(LJFF);
            List<Integer> featureIds = liveAddServerFeatureSetting.getFeatureIds();
            Iterator<Integer> it2 = listBY1.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                featureIds.remove(Integer.valueOf(iIntValue));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("queryServerFeature: no need update feature_id :");
                sbLIZ2.append(iIntValue);
                C20441214yg.LJIIIZ("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (featureIds.isEmpty()) {
                C20441214yg.LJIIIZ("StrategySDKManagerV2", "queryServerFeature: no featureIds need update");
                arrayList = new ArrayList();
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("return featureIds: ");
                sbLIZ3.append(featureIds);
                C20441214yg.LJIIIZ("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ3));
                arrayList = featureIds;
            }
            c259800zU.element = arrayList;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("featureIDs: ");
            sbLIZ4.append(c259800zU.element);
            C20441214yg.LJIIL("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (!GuideHostOpenGpsSetting.INSTANCE.enable() || !list.contains(6) || (context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context()) == null || !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocationServiceEnabled(context) || !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocationPermissionGranted(context)) {
            z = false;
        }
        if (LiveEnableTtmStrategy.INSTANCE.combineRequest() && list.contains(21)) {
            final boolean z2 = z;
            C823050WQl.LIZJ().submit(new Runnable() { // from class: X.0IPX
                public final void LIZ() {
                    StrategyV2Request strategyV2Request = new StrategyV2Request();
                    strategyV2Request.scenes = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
                    strategyV2Request.featureIds = C13LP.LJJLIIIJ(c259800zU.element, ",", null, null, 0, null, null, 62);
                    C469620IbI c469620IbI = C469620IbI.LIZ;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).p22(arrayList2, arrayList3);
                    Pair pair = new Pair(arrayList2, arrayList3);
                    List<StrategyInfo> list2 = (List) pair.getFirst();
                    List<PackageInfo> list3 = (List) pair.getSecond();
                    strategyV2Request.strategyInfos = list2;
                    strategyV2Request.packageInfos = list3;
                    strategyV2Request.gpsEnabled = z2;
                    C480460Ism.LIZ().getClass();
                    C11O8 c11o8LJJJLZIJ = ((StrategyApi) C480460Ism.LIZLLL(StrategyApi.class)).postStrategyV2(strategyV2Request).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ());
                    List<Integer> list4 = list;
                    InterfaceC469640IbK interfaceC469640IbK2 = interfaceC469640IbK;
                    c11o8LJJJLZIJ.LJJZ(new AfS143S0200000_7((Object) list4, (EmoteModel) interfaceC469640IbK2, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 26), new AfS62S0201000_7(i, interfaceC469640IbK2, list4, 4), new InterfaceC781210Ukh() { // from class: X.0IPW
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                            C20441214yg.LIZIZ("StrategySDKManagerV2", "loadOuterScenes: onComplete");
                            ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Ww0();
                        }
                    });
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StrategySDKManager@738d.queryScenes$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StrategySDKManager@738d.queryScenes$1");
                }
            });
        } else {
            C480460Ism.LIZ().getClass();
            ((StrategyApi) C480460Ism.LIZLLL(StrategyApi.class)).getStrategyV2(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62), C13LP.LJJLIIIJ((Iterable) c259800zU.element, ",", null, null, 0, null, null, 62), z).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0IPY
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("StrategySDKManager@738d.queryScenes$2");
                    C469620IbI c469620IbI = C469620IbI.LIZ;
                    C469620IbI.LJII((C470570Icp) obj, list, interfaceC469640IbK);
                    C1C7U.LIZIZ("StrategySDKManager@738d.queryScenes$2");
                }
            }, new AfS62S0201000_7(i, interfaceC469640IbK, list, 5));
        }
    }

    public static void LJI(Throwable th, int i, List list, InterfaceC469640IbK interfaceC469640IbK) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queryScenes: failed ");
        sbLIZ.append(Log.getStackTraceString(th));
        C20441214yg.LJ("StrategySDKManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (i > 0) {
            C823050WQl.LJ().schedule(new ARunnableS14S0201000_7(i, list, interfaceC469640IbK, 2), 5L, TimeUnit.SECONDS);
        }
        LJFF(list, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static webcast.api.room.StrategyData LIZIZ(int r7, X.InterfaceC469640IbK r8, boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469620IbI.LIZIZ(int, X.0IbK, boolean, boolean, boolean):webcast.api.room.StrategyData");
    }
}
