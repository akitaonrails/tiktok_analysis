package X;

import android.text.TextUtils;
import com.ss.android.ugc.airemix.api.ICreationAIRemixCardService;
import com.ss.android.ugc.aweme.api.creationeoy.ICreationEoyService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService;
import com.ss.android.ugc.aweme.creation.fyp.service.CreationCameraPublishCardService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcFypProductSelectCardService;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService;
import com.ss.android.ugc.aweme.feed.ab.StrategyInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService;
import com.ss.android.ugc.aweme.lemon.ILemonService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService;
import com.ss.android.ugc.aweme.services.ExternalService;
import com.ss.android.ugc.aweme.services.IEffectCardService;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardSceneInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.0sAP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616470sAP {
    public static final C1616470sAP LIZ = new C1616470sAP();
    public static final C20551015bI LIZIZ;
    public static final Map<String, InterfaceC1587720rQ2> LIZJ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.15bI, java.lang.Object] */
    static {
        ?? r1 = new AbstractC20550515bD() { // from class: X.15bI
            {
                C0TRR c0trr;
                InterfaceC713890RzP interfaceC713890RzPLJJIII;
                C1007110cJZ c1007110cJZLIZIZ;
                C0TRR c0trrLIZ;
                List<C0TRR> lSCardInsertExecutor;
                C0TRR c0trrLIZIZ;
                InterfaceC712730RxX interfaceC712730RxXA4;
                C0TRR c0trrLIZ2;
                C20549215b0 c20549215b0LIZIZ;
                C0TRR c0trr2;
                C0TRR c0trr3;
                C0TRR c0trr4;
                C0TRR c0trrV2;
                CopyOnWriteArrayList<C0TRR> copyOnWriteArrayList = C20551215bK.LIZ;
                C20551215bK.LIZ(new C0TRR() { // from class: X.0TQj
                    @Override // X.C0TRR
                    public final int LIZIZ() {
                        return 1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:37:0x0071 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x0064 A[SYNTHETIC] */
                    @Override // X.C0TRR
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest> LIZJ(X.C0TRR r11, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData r12, java.util.List<com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo> r13) {
                        /*
                            r10 = this;
                            java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo> r0 = r12.showInfoList
                            r9 = 0
                            if (r0 != 0) goto L6
                            return r9
                        L6:
                            java.util.ArrayList r3 = new java.util.ArrayList
                            r3.<init>()
                            int r4 = r12.LIZ
                            java.util.Iterator r8 = r0.iterator()
                        L11:
                            boolean r0 = r8.hasNext()
                            if (r0 == 0) goto L8d
                            java.lang.Object r6 = r8.next()
                            com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo r6 = (com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo) r6
                            r7 = 1
                            if (r6 == 0) goto L11
                            int r0 = r6.ruleType
                            if (r7 != r0) goto L11
                            int r5 = r6.cardType
                            if (r13 == 0) goto L8b
                            boolean r0 = r13.isEmpty()
                            if (r0 != 0) goto L8b
                            java.util.Iterator r2 = r13.iterator()
                        L32:
                            boolean r0 = r2.hasNext()
                            if (r0 == 0) goto L8b
                            java.lang.Object r1 = r2.next()
                            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo r1 = (com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo) r1
                            int r0 = r1.cardType
                            if (r0 != r5) goto L32
                        L42:
                            int r0 = X.C288390BSb.LIZ
                            if (r0 == r7) goto L53
                            int r2 = r6.contentType
                            r0 = 2
                            if (r2 == r0) goto L53
                            X.15b9 r0 = X.C20550115b9.LIZ
                            r0.getClass()
                            X.C20550115b9.LJIIZILJ(r5, r4, r6, r1)
                        L53:
                            X.15b9 r2 = X.C20550115b9.LIZ
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                            r2.getClass()
                            X.15b8 r2 = X.C20550115b9.LJIIL(r11, r5, r0, r6, r1)
                            X.15b8 r0 = X.EnumC20550015b8.STATE_FREQ_SUCCESS
                            if (r0 != r2) goto L71
                            com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest r2 = new com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest
                            java.lang.String r1 = ""
                            java.lang.String r0 = ""
                            r2.<init>(r5, r1, r0)
                            r3.add(r2)
                            goto L11
                        L71:
                            X.01GW r0 = X.C265870AbR.LIZ
                            java.lang.Object r0 = r0.getValue()
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 == 0) goto L11
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                            int r0 = r2.getState()
                            X.C20552315bV.LJFF(r0, r4, r1)
                            goto L11
                        L8b:
                            r1 = r9
                            goto L42
                        L8d:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C746590TQj.LIZJ(X.0TRR, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData, java.util.List):java.util.List");
                    }
                });
                C0TRR c0trrLJJIII = ((IStoryService) ServiceManager.get().getService(IStoryService.class)).LJJIII();
                if (c0trrLJJIII != null) {
                    C20551215bK.LIZ(c0trrLJJIII);
                }
                C0TRR c0trrLJ = ((ILemonService) ServiceManager.get().getService(ILemonService.class)).LJ();
                if (c0trrLJ != null) {
                    C20551215bK.LIZ(c0trrLJ);
                }
                IFriendsFeedService iFriendsFeedService = (IFriendsFeedService) PluggableExtentionKt.pluggableSpi$default(IFriendsFeedService.class, false, false, false, 14, null);
                if (iFriendsFeedService != null && (c0trrV2 = iFriendsFeedService.v2()) != null) {
                    C20551215bK.LIZ(c0trrV2);
                }
                Object objLJJ = ComplianceServiceProvider.LJIILIIL().LJJ();
                if ((objLJJ instanceof C0TRR) && (c0trr4 = (C0TRR) objLJJ) != null) {
                    C20551215bK.LIZ(c0trr4);
                }
                Object objLJIILLIIL = ComplianceServiceProvider.LJIILIIL().LJIILLIIL();
                if ((objLJIILLIIL instanceof C0TRR) && (c0trr3 = (C0TRR) objLJIILLIIL) != null) {
                    C20551215bK.LIZ(c0trr3);
                }
                Object objLJ = ((IAmberAlertService) ComplianceServiceProvider.LJJII.getValue()).LJ();
                if ((objLJ instanceof C0TRR) && (c0trr2 = (C0TRR) objLJ) != null) {
                    C20551215bK.LIZ(c0trr2);
                }
                Iterator<C0TRR> it2 = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).b().iterator();
                while (it2.hasNext()) {
                    C20551215bK.LIZ(it2.next());
                }
                ICreationEoyService iCreationEoyService = (ICreationEoyService) PluggableExtentionKt.pluggableSpi$default(ICreationEoyService.class, false, false, false, 14, null);
                if (iCreationEoyService != null && (c20549215b0LIZIZ = iCreationEoyService.LIZIZ()) != null) {
                    C20551215bK.LIZ(c20549215b0LIZIZ);
                }
                ICreationAIRemixCardService.LIZ.getClass();
                C0TRR c0trrLIZ3 = C20551315bL.LIZ().LIZ();
                if (c0trrLIZ3 != null) {
                    C20551215bK.LIZ(c0trrLIZ3);
                }
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (interfaceC712730RxXA4 = iLiveOuterService.A4()) != null && (c0trrLIZ2 = interfaceC712730RxXA4.LIZ()) != null) {
                    C20551215bK.LIZ(c0trrLIZ2);
                }
                CreationCameraPublishCardService creationCameraPublishCardService = (CreationCameraPublishCardService) PluggableExtentionKt.pluggableSpi$default(CreationCameraPublishCardService.class, false, false, false, 14, null);
                if (creationCameraPublishCardService != null && (c0trrLIZIZ = creationCameraPublishCardService.LIZIZ()) != null) {
                    C20551215bK.LIZ(c0trrLIZIZ);
                }
                ILSFeedCardService iLSFeedCardService = (ILSFeedCardService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
                if (iLSFeedCardService != null && (lSCardInsertExecutor = iLSFeedCardService.getLSCardInsertExecutor()) != null) {
                    Iterator<C0TRR> it3 = lSCardInsertExecutor.iterator();
                    while (it3.hasNext()) {
                        C20551215bK.LIZ(it3.next());
                    }
                }
                IMiniDramaCardService iMiniDramaCardService = (IMiniDramaCardService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaCardService.class, false, false, false, 14, null);
                if (iMiniDramaCardService != null && (c0trrLIZ = iMiniDramaCardService.LIZ()) != null) {
                    C20551215bK.LIZ(c0trrLIZ);
                }
                IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                if (iMinisApiService != null && (interfaceC713890RzPLJJIII = iMinisApiService.LJJIII()) != null && (c1007110cJZLIZIZ = interfaceC713890RzPLJJIII.LIZIZ()) != null) {
                    C20551215bK.LIZ(c1007110cJZLIZIZ);
                }
                Object objLJJIJL = C1EE1.LIZIZ.LJJIJL();
                if (!(objLJJIJL instanceof C0TRR) || (c0trr = (C0TRR) objLJJIJL) == null) {
                    return;
                }
                C20551215bK.LIZ(c0trr);
            }

            @Override // X.AbstractC20550515bD
            public final FeedCardType LJ(FeedCardSceneInfo feedCardSceneInfo) {
                if (feedCardSceneInfo != null) {
                    return feedCardSceneInfo.fypCardScene;
                }
                return null;
            }

            @Override // X.AbstractC20550515bD
            public final void LJI(InterfaceC20550615bE interfaceC20550615bE) {
                List<CardInsertResultInfo> insertResults;
                Integer numValueOf;
                List<CardTypeRequest> listLIZ;
                CardInsertResultInfo cardInsertResultInfo;
                C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                if (c2213981Bky.isRegressionTest()) {
                    c2213981Bky.isRegressionTest();
                }
                List<CardInsertResultInfo> insertResults2 = null;
                if (interfaceC20550615bE != null) {
                    insertResults = interfaceC20550615bE.getInsertResults();
                } else {
                    insertResults = null;
                }
                FeedCardInsertData feedCardInsertDataLJFF = LJFF();
                if (C1784290wX5.LIZLLL()) {
                    C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0wYV
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FeedCardInsertExecutor@3d0b.notifyConfigChanged$1");
                            try {
                                C20548215aq c20548215aq = C20548215aq.LIZ;
                                StrategyInfo strategyInfoLIZIZ = C1784290wX5.LIZIZ();
                                Map<String, String> map = strategyInfoLIZIZ != null ? strategyInfoLIZIZ.config : null;
                                c20548215aq.getClass();
                                C20548215aq.LIZIZ(map);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FeedCardInsertExecutor@3d0b.notifyConfigChanged$1");
                        }
                    });
                }
                IEffectCardService iEffectCardServiceEffectCardService = ExternalService.INSTANCE.effectCardService();
                if (insertResults != null && (cardInsertResultInfo = (CardInsertResultInfo) C13LP.LJJJLL(insertResults)) != null) {
                    numValueOf = Integer.valueOf(cardInsertResultInfo.cardInsertStatus);
                } else {
                    numValueOf = null;
                }
                if (iEffectCardServiceEffectCardService.shouldInsertEffectRecommendCard(feedCardInsertDataLJFF, numValueOf)) {
                    LIZIZ(new CardTypeRequest(2, "", ""), null);
                }
                IFeedEcCardService iFeedEcCardService = (IFeedEcCardService) PluggableExtentionKt.pluggableSpi$default(IFeedEcCardService.class, false, false, false, 14, null);
                if (iFeedEcCardService != null && (listLIZ = iFeedEcCardService.LIZ(feedCardInsertDataLJFF, insertResults, interfaceC20550615bE)) != null) {
                    Iterator<CardTypeRequest> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        LIZIZ(it2.next(), null);
                    }
                }
                Iterator it3 = ((IEcFypProductSelectCardService) ServiceManager.get().getService(IEcFypProductSelectCardService.class)).LIZIZ().iterator();
                while (it3.hasNext()) {
                    LIZIZ((CardTypeRequest) it3.next(), null);
                }
                C0S78.LIZJ(new C20551115bJ(feedCardInsertDataLJFF, insertResults, interfaceC20550615bE, this), true);
                if (interfaceC20550615bE != null) {
                    insertResults2 = interfaceC20550615bE.getInsertResults();
                }
                for (C0TRR c0trr : C20551215bK.LIZ) {
                    c0trr.LIZ = true;
                    c0trr.LIZIZ.clear();
                    List<CardTypeRequest> listLIZJ = c0trr.LIZJ(c0trr, feedCardInsertDataLJFF, insertResults2);
                    if (listLIZJ != null) {
                        Iterator<CardTypeRequest> it4 = listLIZJ.iterator();
                        while (it4.hasNext()) {
                            LIZIZ(it4.next(), c0trr);
                        }
                    }
                }
                int i = this.LIZJ;
                IFeedEcCardService iFeedEcCardService2 = (IFeedEcCardService) PluggableExtentionKt.pluggableSpi$default(IFeedEcCardService.class, false, false, false, 14, null);
                if (iFeedEcCardService2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.LIZIZ);
                    iFeedEcCardService2.LIZJ(i, arrayList);
                }
                ILSFeedCardService iLSFeedCardService = (ILSFeedCardService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
                if (iLSFeedCardService != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.LIZIZ);
                    iLSFeedCardService.requestInsertCardTrack(arrayList2, i);
                }
            }
        };
        LIZIZ = r1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("FYP", r1);
        linkedHashMap.put("Nearby", new AbstractC20550515bD() { // from class: X.15bH
            @Override // X.AbstractC20550515bD
            public final FeedCardType LJ(FeedCardSceneInfo feedCardSceneInfo) {
                if (feedCardSceneInfo != null) {
                    return feedCardSceneInfo.nearbyCardScene;
                }
                return null;
            }

            @Override // X.AbstractC20550515bD
            public final void LJI(InterfaceC20550615bE interfaceC20550615bE) {
                List<CardInsertResultInfo> insertResults;
                if (interfaceC20550615bE != null && (insertResults = interfaceC20550615bE.getInsertResults()) != null) {
                    for (CardInsertResultInfo cardInsertResultInfo : insertResults) {
                        if (cardInsertResultInfo.cardInsertStatus == 20000) {
                            C19719612Di.LJJIIJ(this.LIZIZ, new AwS610S0100000_31(cardInsertResultInfo, 398), true);
                        }
                    }
                }
            }

            @Override // X.AbstractC20550515bD, X.InterfaceC1587720rQ2
            public final void LIZIZ(CardTypeRequest cardTypeRequest, C0TRR c0trr) {
                if (cardTypeRequest != null) {
                    C19719612Di.LJJIIJ(this.LIZIZ, new AwS610S0100000_31(cardTypeRequest, 397), true);
                    this.LIZIZ.add(cardTypeRequest);
                }
            }
        });
        linkedHashMap.put("Follow", new AbstractC20550515bD() { // from class: X.15bF
            @Override // X.AbstractC20550515bD
            public final FeedCardType LJ(FeedCardSceneInfo feedCardSceneInfo) {
                if (feedCardSceneInfo != null) {
                    return feedCardSceneInfo.followCardScene;
                }
                return null;
            }

            @Override // X.AbstractC20550515bD
            public final void LJI(InterfaceC20550615bE interfaceC20550615bE) {
                List<CardInsertResultInfo> insertResults;
                FeedCardInsertData feedCardInsertDataLJFF = LJFF();
                if (FollowFeedServiceImpl.LJIL().T1() && feedCardInsertDataLJFF.LIZ == 2) {
                    LIZIZ(new CardTypeRequest(8, "", ""), null);
                }
                if (interfaceC20550615bE != null && (insertResults = interfaceC20550615bE.getInsertResults()) != null) {
                    for (CardInsertResultInfo cardInsertResultInfo : insertResults) {
                        if (cardInsertResultInfo.cardInsertStatus == 20000) {
                            C19719612Di.LJJIIJ(this.LIZIZ, new AwS610S0100000_31(cardInsertResultInfo, 394), true);
                        }
                    }
                }
            }

            @Override // X.AbstractC20550515bD, X.InterfaceC1587720rQ2
            public final void LIZIZ(CardTypeRequest cardTypeRequest, C0TRR c0trr) {
                if (cardTypeRequest != null) {
                    C19719612Di.LJJIIJ(this.LIZIZ, new AwS610S0100000_31(cardTypeRequest, 393), true);
                    this.LIZIZ.add(cardTypeRequest);
                }
            }
        });
        linkedHashMap.put("Friends", new AbstractC20550515bD() { // from class: X.15bG
            @Override // X.AbstractC20550515bD
            public final FeedCardType LJ(FeedCardSceneInfo feedCardSceneInfo) {
                if (feedCardSceneInfo != null) {
                    return feedCardSceneInfo.friendsCardScene;
                }
                return null;
            }

            @Override // X.AbstractC20550515bD
            public final void LJI(InterfaceC20550615bE interfaceC20550615bE) {
                List<CardInsertResultInfo> insertResults;
                FeedCardInsertData feedCardInsertDataLJFF = LJFF();
                if (((IFriendsFeedService) ServiceManager.get().getService(IFriendsFeedService.class)).T1() && feedCardInsertDataLJFF.LIZ == 2) {
                    LIZIZ(new CardTypeRequest(8, "", ""), null);
                }
                if (interfaceC20550615bE != null && (insertResults = interfaceC20550615bE.getInsertResults()) != null) {
                    for (CardInsertResultInfo cardInsertResultInfo : insertResults) {
                        if (cardInsertResultInfo.cardInsertStatus == 20000) {
                            C19719612Di.LJJIIJ(this.LIZIZ, new AwS610S0100000_31(cardInsertResultInfo, 396), true);
                        }
                    }
                }
            }

            @Override // X.AbstractC20550515bD, X.InterfaceC1587720rQ2
            public final void LIZIZ(CardTypeRequest cardTypeRequest, C0TRR c0trr) {
                if (cardTypeRequest != null) {
                    C19719612Di.LJJIIJ(this.LIZIZ, new AwS610S0100000_31(cardTypeRequest, 395), true);
                    this.LIZIZ.add(cardTypeRequest);
                }
            }
        });
        LIZJ = linkedHashMap;
    }

    public static InterfaceC1587720rQ2 LIZ(String str) {
        InterfaceC1587720rQ2 interfaceC1587720rQ2 = (InterfaceC1587720rQ2) ((LinkedHashMap) LIZJ).get(str);
        if (interfaceC1587720rQ2 == null) {
            return LIZIZ;
        }
        return interfaceC1587720rQ2;
    }

    public static final Integer LIZIZ(String str) {
        C20551015bI c20551015bI = LIZIZ;
        c20551015bI.getClass();
        if (str != null && !TextUtils.isEmpty(str) && c20551015bI.LIZLLL.contains(str)) {
            return c20551015bI.LIZLLL.get(str);
        }
        return null;
    }
}
