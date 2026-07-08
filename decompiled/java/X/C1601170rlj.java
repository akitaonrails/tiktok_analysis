package X;

import Y.ARunnableS2S2000000_9;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.TopGifterColdStartConfig;
import com.ss.android.ugc.aweme.ad.feed.midad.IPostRollAdService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContext;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.explore.service.IExploreFeedService;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.feed.ab.FeedResponseFilterRoutingConfig;
import com.ss.android.ugc.aweme.feed.api.recommend.RecommendFeedProcessorRegistry;
import com.ss.android.ugc.aweme.feed.api.recommend.processors.DramaCardResponseProcessor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.HttpDnsResult;
import com.ss.android.ugc.aweme.feed.model.MediaBasicInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxTemplate;
import com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.InterventionInfoStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.OperatorInfoStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.model.DramaFeedCardInsertScene;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardResponse;
import com.ss.android.ugc.aweme.poi.LocalServiceConfig;
import com.ss.android.ugc.aweme.poi.LocalServiceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import com.ss.android.ugc.aweme.services.ExternalService;
import com.ss.android.ugc.aweme.services.IEffectCardService;
import com.ss.android.ugc.aweme.state.ability.IState;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0rlj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601170rlj extends C09AY implements Function0<List<? extends InterfaceC1333005Jo<FeedItemList>>> {
    public final /* synthetic */ C1604930rrn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601170rlj(C1604930rrn c1604930rrn) {
        super(0);
        this.LL = c1604930rrn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC1333005Jo<FeedItemList>> invoke() {
        getClass();
        List<? extends InterfaceC1333005Jo<FeedItemList>> listLJIILJJIL = C1697810uHb.LJIILJJIL(new InterfaceC1333005Jo<FeedItemList>() { // from class: X.0rmB
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "common_response";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<FeedItemList> c1440305kP) {
                int iLJIJ;
                boolean zBooleanValue;
                InterfaceC713890RzP interfaceC713890RzPLJJIII;
                List<Aweme> items;
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                FeedItemList feedItemList = c1440305kP.LIZJ;
                boolean zBooleanValue2 = false;
                if (Intrinsics.LJFF(c1601460rmC.LJIIJJI, Boolean.TRUE)) {
                    iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_cache_request_count", true);
                } else {
                    iLJIJ = 0;
                }
                int i = c1601460rmC.LJIJ;
                String str = c1601460rmC.LJIJJ;
                Boolean bool = c1601460rmC.LJIJJLI;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean bool2 = c1601460rmC.LJIL;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                }
                String str2 = c1601460rmC.LJJJJI;
                if (str2 == null) {
                    str2 = "";
                }
                FeedInsertRelationManager.INSTANCE.appendMobParam(feedItemList, str);
                List<Aweme> items2 = feedItemList.getItems();
                if (items2 != null) {
                    for (Aweme aweme : items2) {
                        if (i != 0) {
                            AwemeBizExtKt.setFeedSource(aweme, i);
                        }
                        AwemeBizExtKt.setDidZero(aweme, zBooleanValue);
                        AwemeBizExtKt.setUidZero(aweme, zBooleanValue2);
                        if (!TextUtils.isEmpty(str2)) {
                            AwemeBizExtKt.setNuTriggerScene(aweme, str2);
                        }
                        if (C298410Bmp.LIZ() && aweme.getAid() != null) {
                            ((IState) ServiceManager.get().getService(IAwemeCollectionState.class)).syncState(aweme.getAid(), Boolean.valueOf(AwemeExtKt.isCollected(aweme)), true);
                        }
                    }
                }
                if (iLJIJ > 0 && (items = feedItemList.getItems()) != null && items.size() > 1) {
                    FeedItemList feedItemList2 = new FeedItemList();
                    feedItemList2.setRequestId(feedItemList.getRequestId());
                    ArrayList arrayList = new ArrayList();
                    for (int size = items.size() - 1; size >= 0; size--) {
                        Aweme aweme2 = (Aweme) ListProtector.get(items, size);
                        if (aweme2 != null && !TextUtils.isEmpty(aweme2.getAid()) && aweme2.isClientCache()) {
                            arrayList.add(aweme2);
                            ListProtector.remove(items, size);
                        }
                    }
                    if (arrayList.size() > 0) {
                        feedItemList2.setItems(arrayList);
                        C0NET.LIZ.getClass();
                        C0NET.LJFF = feedItemList2;
                    }
                }
                C1030680cva.LJI = null;
                C1030680cva.LJII = null;
                IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                if (iMinisApiService != null && (interfaceC713890RzPLJJIII = iMinisApiService.LJJIII()) != null) {
                    interfaceC713890RzPLJJIII.LIZJ(c1601460rmC.LIZIZ, feedItemList.getAwemeList());
                }
            }
        }, new InterfaceC1333005Jo<FeedItemList>() { // from class: X.0pYp
            public final String LIZ = "ResponseVideoDNSProcessor";
            public final int LIZIZ = 1;

            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<FeedItemList> c1440305kP) {
                MediaBasicInfo mediaBasicInfo;
                List<HttpDnsResult> list;
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                FeedItemList feedItemList = c1440305kP.LIZJ;
                if (Intrinsics.LJFF(c1601460rmC.LJIIJJI, Boolean.TRUE) && (mediaBasicInfo = feedItemList.getMediaBasicInfo()) != null && (list = mediaBasicInfo.videoHttpDnsResultList) != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (HttpDnsResult httpDnsResult : list) {
                        if (!TextUtils.isEmpty(httpDnsResult.domain) && !TextUtils.isEmpty(httpDnsResult.ipList)) {
                            C582130MsN.LIZ().LJ().getClass();
                            C1014030cUj.LIZ.LJJZ().LJJLIIIJJIZ(httpDnsResult.domain, httpDnsResult.ipList, jCurrentTimeMillis);
                        }
                    }
                }
            }
        }, new InterfaceC1333005Jo<FeedItemList>() { // from class: X.0rla
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "response_log";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<FeedItemList> c1440305kP) {
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                FeedItemList feedItemList = c1440305kP.LIZJ;
                feedItemList.setLocalExtra("request_pull_type", String.valueOf(c1601460rmC.LIZIZ));
                c1440305kP.LIZLLL.LJIIJJI(new C597030NbJ(c1601460rmC, feedItemList));
                if (C1220604q4.LIZ() && c1601460rmC.LIZIZ == 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("feed_request_error_code_server", Integer.valueOf(feedItemList.error_code));
                    C798410VTr.LJFF(linkedHashMap);
                }
            }
        }, new InterfaceC1333005Jo<FeedItemList>() { // from class: X.0pYq
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "nu_response";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<FeedItemList> c1440305kP) {
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                List<Aweme> items = c1440305kP.LIZJ.getItems();
                if (Intrinsics.LJFF(c1601460rmC.LJJJJIZL, Boolean.TRUE)) {
                    Iterator<Aweme> it2 = items.iterator();
                    while (it2.hasNext()) {
                        AwemeExtKt.putCustomPayload(it2.next(), "nu_has_interest", Boolean.TRUE);
                    }
                }
            }
        }, new InterfaceC1333005Jo<FeedItemList>() { // from class: X.0pYr
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "ResponseECRegionProcessor";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<FeedItemList> c1440305kP) {
                try {
                    IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
                    Unit unit = null;
                    List<Aweme> items = null;
                    if (iEcommerceLiveService != null) {
                        FeedItemList feedItemList = c1440305kP.LIZJ;
                        if (feedItemList != null) {
                            items = feedItemList.getItems();
                        }
                        iEcommerceLiveService.LJJJ(items);
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }, new DramaCardResponseProcessor());
        if (((Boolean) C0AB4.LIZ.getValue()).booleanValue()) {
            listLJIILJJIL.add(new C1601650rmV() { // from class: X.0rwD
                @Override // X.C1601650rmV
                public final void LIZIZ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
                    List<Aweme> items;
                    CardInsertInfo cardInsertInfo;
                    CardInsertInfo cardInsertInfo2;
                    LynxTemplate lynxTemplate;
                    String bizData;
                    if (!C294800Bh0.LIZ() || (items = feedItemList.getItems()) == null) {
                        return;
                    }
                    C0SQM.LIZ.getClass();
                    IExploreFeedService iExploreFeedService = C0SQM.LIZIZ;
                    if (iExploreFeedService == null) {
                        return;
                    }
                    for (Aweme aweme : items) {
                        if (aweme.getAwemeType() == 105 && (((cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 118) || ((cardInsertInfo2 = aweme.getCardInsertInfo()) != null && cardInsertInfo2.getCardType() == 119))) {
                            CardInsertInfo cardInsertInfo3 = aweme.getCardInsertInfo();
                            if (cardInsertInfo3 != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null && (bizData = lynxTemplate.getBizData()) != null && !a0.LJJJIL(bizData)) {
                                iExploreFeedService.LJIIIIZZ(bizData);
                            }
                        }
                    }
                }
            });
        }
        if (C306700C0m.LIZ()) {
            listLJIILJJIL.add(new InterfaceC1333005Jo<FeedItemList>() { // from class: X.0rlk
                @Override // X.InterfaceC1333005Jo
                public final String getTag() {
                    return "ResponseLsConfigProcessor";
                }

                @Override // X.InterfaceC1333005Jo
                public final int getType() {
                    return 1;
                }

                @Override // X.InterfaceC1333005Jo
                public final void LIZ(C1440305kP<FeedItemList> c1440305kP) {
                    List<Aweme> items;
                    List<LocalServiceConfig> list;
                    FeedItemList feedItemList = c1440305kP.LIZJ;
                    if (feedItemList != null && (items = feedItemList.getItems()) != null) {
                        Iterator<Aweme> it2 = items.iterator();
                        while (it2.hasNext()) {
                            LocalServiceInfo localServiceInfo = it2.next().getLocalServiceInfo();
                            if (localServiceInfo != null && (list = localServiceInfo.extra) != null && (!list.isEmpty())) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (LocalServiceConfig localServiceConfig : list) {
                                    linkedHashMap.put(localServiceConfig.key, localServiceConfig.value);
                                }
                                C1367960lha.LIZ.getClass();
                                C1367960lha.LIZ().LJLLI(linkedHashMap);
                                return;
                            }
                        }
                    }
                    C1367960lha.LIZ.getClass();
                    C1367960lha.LIZ().LJLLI(null);
                }
            });
        }
        listLJIILJJIL.add(new InterfaceC1333005Jo<FeedItemList>() { // from class: X.0rlX
            public final String LIZ = "response_item_filter";
            public final ArrayList<C0N6Y> LIZIZ = new ArrayList<>();

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            {
                LIZLLL(new C0N6Y() { // from class: X.0N6W
                    public final Boolean LIZ;

                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_duplicate_post_roll";
                    }

                    {
                        IPostRollAdService iPostRollAdService = (IPostRollAdService) PluggableExtentionKt.pluggableSpi$default(IPostRollAdService.class, false, false, false, 14, null);
                        this.LIZ = iPostRollAdService != null ? Boolean.valueOf(iPostRollAdService.LIZ()) : null;
                    }

                    public static boolean LIZJ(Aweme aweme, List list) {
                        if (list == null) {
                            return false;
                        }
                        for (int size = list.size() - 1; -1 < size; size--) {
                            Aweme aweme2 = (Aweme) ListProtector.get(list, size);
                            if (aweme2 != null && C2245741Cv6.LIZJ(aweme2) && aweme2.getAwemeRawAd() != null) {
                                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                                Long creativeId = null;
                                if (awemeRawAd != null && awemeRawAd.getCreativeId() != null) {
                                    HashMap<String, Aweme> map = C0N6Z.LIZ;
                                    AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                                    if (awemeRawAd2 != null) {
                                        creativeId = awemeRawAd2.getCreativeId();
                                    }
                                    Aweme awemeLIZ = C0N6Z.LIZ(String.valueOf(creativeId));
                                    if (awemeLIZ != null && aweme != null && TextUtils.equals(awemeLIZ.getAid(), aweme.getAid())) {
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        if (c0n6x.LIZ == 8 || !Intrinsics.LJFF(this.LIZ, Boolean.TRUE)) {
                            return;
                        }
                        List<Aweme> list = c0n6x.LIZIZ;
                        for (Aweme aweme : feedItemList.getItems()) {
                            if (C2245741Cv6.LIZIZ(aweme)) {
                                try {
                                    if (LIZJ(aweme, list)) {
                                        c1160560gJ4.LJ(aweme);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0rmG
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_illegal_amber_alert";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        List<CardInsertResultInfo> list;
                        if ((C1601630rmT.LIZ() || C1601660rmW.LIZ()) && feedItemList.getItems() != null && (list = feedItemList.cardInsertResults) != null && !list.isEmpty()) {
                            try {
                                for (CardInsertResultInfo cardInsertResultInfo : feedItemList.cardInsertResults) {
                                    if (cardInsertResultInfo.cardType == 12 && cardInsertResultInfo.cardInsertStatus == 20000) {
                                        for (Aweme aweme : feedItemList.getItems()) {
                                            if (((IAmberAlertService) ComplianceServiceProvider.LJJII.getValue()).LIZ(aweme)) {
                                                c1160560gJ4.LJ(aweme);
                                                C20684815ws.onEventV3("tt_amber_alert_data_invalid");
                                            }
                                        }
                                        return;
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0rmD
                    public static final /* synthetic */ int LIZ = 0;

                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_live_video";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        User user;
                        if (c0n6x.LIZ != 8 && !C086I.LIZIZ(feedItemList.getItems()) && feedItemList.getItems() != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            ArrayList arrayList = new ArrayList();
                            HashMap map = new HashMap();
                            HashMap map2 = new HashMap();
                            HashMap map3 = new HashMap();
                            for (Aweme aweme : feedItemList.getItems()) {
                                if (aweme != null) {
                                    if (AwemeBizExtKt.getClientAcceptanceTime(aweme) < 0) {
                                        AwemeBizExtKt.setClientAcceptanceTime(aweme, jCurrentTimeMillis);
                                    }
                                    if (AwemeBizExtKt.getPositionInRequest(aweme) < 0) {
                                        AwemeBizExtKt.setPositionInRequest(aweme, feedItemList.getItems().indexOf(aweme) + 1);
                                    }
                                    if (feedItemList.isFromCacheFiled && feedItemList.getNetworkInfoKey() == null) {
                                        AwemeBizExtKt.setSessionRequestPosition(aweme, 0);
                                    }
                                    C2407009bw.LIZ();
                                    if (AwemeSaaSExtKt.isLive(aweme)) {
                                        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                                        if (newLiveRoomDataExt != null && (user = newLiveRoomDataExt.owner) != null && !TextUtils.isEmpty(user.getUid()) && !TextUtils.isEmpty(newLiveRoomDataExt.owner.getSecUid())) {
                                            C1601430rm9.LIZ(feedItemList.getRequestId(), jCurrentTimeMillis, newLiveRoomDataExt, aweme, map, map2, map3);
                                        } else {
                                            c1160560gJ4.LJ(aweme);
                                            arrayList.add(aweme);
                                            String requestId = feedItemList.getRequestId();
                                            C0T5M c0t5m = C0T5M.LIZ;
                                            AwemeBizExtKt.setContentDiffType(aweme, "filter_live_video");
                                            C0T5M.LJFF(aweme, "filter_live_video", requestId);
                                        }
                                    }
                                }
                            }
                            C1601430rm9.LIZIZ(map, map2, map3);
                        }
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0rlu
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_effect";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        Activity activityLIZ;
                        Activity activityLIZIZ;
                        if (c0n6x.LIZ == 8) {
                            return;
                        }
                        feedItemList.setItems(new C1601250rlr(feedItemList.getItems(), c1160560gJ4));
                        IEffectCardService iEffectCardServiceEffectCardService = ExternalService.INSTANCE.effectCardService();
                        List<Aweme> items = feedItemList.getItems();
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                            activityLIZ = C085T.LIZ(activityLIZIZ);
                        } else {
                            activityLIZ = null;
                        }
                        iEffectCardServiceEffectCardService.filterEffectCardAweme(items, activityLIZ);
                    }
                });
                LIZLLL(new C1601060rlY());
                LIZLLL(new C0N6Y() { // from class: X.0NB8
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_story_card";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        if (c0n6x.LIZ != 8 && feedItemList.getItems() != null && C281310B0v.LIZ()) {
                            int iLJIILL = C1618440sDa.LIZIZ.LJJIIJ().LJIILL();
                            int i = 0;
                            for (Aweme aweme : feedItemList.getItems()) {
                                if (aweme != null && C729510SjV.LJJIFFI(aweme) && (i = i + 1) > iLJIILL) {
                                    c1160560gJ4.LJ(aweme);
                                }
                            }
                        }
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0rlc
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_illegal_story";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        int i = c0n6x.LIZ;
                        if (i != 8 && feedItemList.getItems() != null) {
                            C307420C3g.LIZ(i, "full_feed_handle_data_story_filter");
                            int i2 = C1601110rld.LIZ;
                            C1601110rld.LIZIZ = C0COD.LIZ();
                            ArrayList arrayList = new ArrayList(feedItemList.getItems());
                            List<Aweme> listLIZ = C1618440sDa.LIZIZ.LJJLIIIJJIZ().LIZ(arrayList);
                            if (arrayList.size() != listLIZ.size()) {
                                HashSet hashSet = new HashSet(listLIZ.size());
                                for (int i3 = 0; i3 < listLIZ.size(); i3++) {
                                    hashSet.add(((Aweme) ListProtector.get(listLIZ, i3)).getAid());
                                }
                                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                    Aweme aweme = (Aweme) ListProtector.get(arrayList, i4);
                                    if (!hashSet.contains(aweme.getAid())) {
                                        c1160560gJ4.LJ(aweme);
                                    }
                                }
                            }
                            C729510SjV.LJJJJ(feedItemList.getRequestId(), listLIZ);
                            C307420C3g.LIZIZ(i, "full_feed_handle_data_story_filter");
                        }
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0rlZ
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_auto_scroll";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        if (c0n6x.LIZ == 8) {
                            return;
                        }
                        feedItemList.setItems(new C1601250rlr(feedItemList.getItems(), c1160560gJ4));
                        C1386360mBG.LIZ(feedItemList);
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0Nyi
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_illegal_story";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        UserStory userStory;
                        List<Aweme> stories;
                        if (c0n6x.LIZ != 8 && feedItemList.getItems() != null) {
                            for (Aweme aweme : feedItemList.getItems()) {
                                try {
                                    if (C729510SjV.LJJIIZ(aweme) && aweme != null && aweme.getUserStory() != null && (userStory = aweme.getUserStory()) != null && ((stories = userStory.getStories()) == null || stories.isEmpty())) {
                                        c1160560gJ4.LJ(aweme);
                                    }
                                } catch (ConcurrentModificationException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return;
                                }
                            }
                        }
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0rSy
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_show_ad";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        if (c0n6x.LIZ == 8) {
                            return;
                        }
                        feedItemList.setItems(new C1601250rlr(feedItemList.getItems(), c1160560gJ4));
                        C1029590ctp.LJ().LIZLLL().LIZIZ(feedItemList);
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0rlW
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_installed_ad";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        if (c0n6x.LIZ == 8) {
                            return;
                        }
                        feedItemList.setItems(new C1601250rlr(feedItemList.getItems(), c1160560gJ4));
                        C1022030chd.LJ(feedItemList.getItems(), new InterfaceC1022050chf<Object>() { // from class: X.0rlV
                            @Override // X.InterfaceC1022050chf
                            public final void invoke(Object... objArr) {
                                try {
                                    InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
                                    C844470XAv.LIZ.getClass();
                                    interfaceC1035050d2dLIZLLL.LJIIIZ(C844470XAv.LIZ(), (AwemeRawAd) objArr[0], (String) objArr[1]);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        });
                    }
                });
                LIZLLL(new C0N6Y() { // from class: X.0rli
                    @Override // X.C0N6Y
                    public final String LIZ() {
                        return "filter_push";
                    }

                    @Override // X.C0N6Y
                    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                        Map<String, String> map;
                        if (c0n6x.LIZ != 8 && C828030We1.LIZ && (map = feedItemList.localExtra) != null) {
                            String str = map.get("aweme_id");
                            feedItemList.setItems(new C1601250rlr(feedItemList.getItems(), c1160560gJ4));
                            C1393460mMi.LJFF.LIZIZ().LIZJ(str, feedItemList.getItems());
                        }
                    }
                });
                LIZLLL(new C1589530rSx());
                if (C0BL5.LIZ()) {
                    LIZLLL(new C588430N6b());
                }
                if (C1514430pVp.LIZLLL().booleanValue()) {
                    LIZLLL(new C0N6Y() { // from class: X.0r9D
                        @Override // X.C0N6Y
                        public final String LIZ() {
                            return "drama_nuj_video_card";
                        }

                        @Override // X.C0N6Y
                        public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
                            ISeriesFeedService iSeriesFeedService;
                            InterfaceC1577280r9C interfaceC1577280r9CLIZ;
                            MiniDramaFeedCardResponse miniDramaFeedCardResponseLJII;
                            Aweme awemeLJIILLIIL;
                            if (c0n6x.LIZ == 8 || (iSeriesFeedService = (ISeriesFeedService) PluggableExtentionKt.pluggableSpi$default(ISeriesFeedService.class, false, false, false, 14, null)) == null || (interfaceC1577280r9CLIZ = iSeriesFeedService.LIZ()) == null || interfaceC1577280r9CLIZ.LJ() || (miniDramaFeedCardResponseLJII = interfaceC1577280r9CLIZ.LJII()) == null || (awemeLJIILLIIL = interfaceC1577280r9CLIZ.LJIILLIIL()) == null) {
                                return;
                            }
                            if (miniDramaFeedCardResponseLJII.getInsertScene() == DramaFeedCardInsertScene.DRAMA_FEED_CARD_INSERT_SCENE_FYP) {
                                c1160560gJ4.LIZLLL(1, awemeLJIILLIIL);
                                interfaceC1577280r9CLIZ.LJIIZILJ();
                            } else {
                                if (miniDramaFeedCardResponseLJII.getInsertScene() != DramaFeedCardInsertScene.DRAMA_FEED_CARD_INSERT_SCENE_INNER_FEED) {
                                    return;
                                }
                                c1160560gJ4.LIZLLL(0, awemeLJIILLIIL);
                                interfaceC1577280r9CLIZ.LJIIZILJ();
                                interfaceC1577280r9CLIZ.LJIIIZ();
                            }
                        }
                    });
                }
            }

            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return this.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
            @Override // X.InterfaceC1333005Jo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C1440305kP<com.ss.android.ugc.aweme.feed.model.FeedItemList> r13) {
                /*
                    Method dump skipped, instruction units count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1601050rlX.LIZ(X.05kP):void");
            }

            public final void LIZLLL(C0N6Y c0n6y) {
                if (!((FeedResponseFilterRoutingConfig) C162700jp.LIZIZ.getValue()).enable) {
                    return;
                }
                if (c0n6y.LIZ().length() == 0) {
                    throw new IllegalArgumentException("filter requires a valid diffType");
                }
                if (C162700jp.LIZ(c0n6y.LIZ()) == 0) {
                    this.LIZIZ.add(c0n6y);
                }
            }

            public static void LIZIZ(FeedItemList feedItemList, List list, String str) {
                List<ContentInfoStruct> originContentInfo;
                ContentInfoStruct next;
                String str2;
                ArrayList<Aweme> arrayList = (ArrayList) list;
                if (arrayList.isEmpty()) {
                    return;
                }
                if (C04VM.LIZ()) {
                    String requestId = feedItemList.getRequestId();
                    for (Aweme aweme : arrayList) {
                        String aid = aweme.getAid();
                        if (aid != null) {
                            C20684815ws.LJFF().submit(new C01YZ(aid, requestId, aweme));
                        }
                    }
                }
                C606470NqX.LIZ(arrayList.size(), str, feedItemList.getRequestId());
                InterventionInfoStruct interventionInfoStruct = feedItemList.interventionInfo;
                if (interventionInfoStruct != null && (originContentInfo = interventionInfoStruct.getOriginContentInfo()) != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (Aweme aweme2 : arrayList) {
                        Iterator<ContentInfoStruct> it2 = originContentInfo.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.awemeId, aweme2.getAid())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        ContentInfoStruct contentInfoStruct = next;
                        if (contentInfoStruct != null) {
                            OperatorInfoStruct operatorInfoStruct = new OperatorInfoStruct();
                            operatorInfoStruct.operator = 1;
                            if (str == null) {
                                str2 = "unknown";
                            } else {
                                str2 = str;
                            }
                            operatorInfoStruct.reason = str2;
                            operatorInfoStruct.stage = 4;
                            operatorInfoStruct.opTimestamp = jCurrentTimeMillis;
                            if (contentInfoStruct.operatorInfoList == null) {
                                contentInfoStruct.operatorInfoList = new ArrayList();
                            }
                            List<OperatorInfoStruct> list2 = contentInfoStruct.operatorInfoList;
                            if (list2 != null) {
                                list2.add(operatorInfoStruct);
                            }
                        }
                    }
                }
            }

            public static void LIZJ(FeedItemList feedItemList, List list, String str) {
                List<ContentInfoStruct> originContentInfo;
                C20684815ws.LJFF().execute(new ARunnableS2S2000000_9(str, feedItemList.getRequestId(), 1));
                InterventionInfoStruct interventionInfoStruct = feedItemList.interventionInfo;
                if (interventionInfoStruct != null && (originContentInfo = interventionInfoStruct.getOriginContentInfo()) != null) {
                    for (Aweme aweme : (ArrayList) list) {
                        ContentInfoStruct contentInfoStruct = new ContentInfoStruct();
                        contentInfoStruct.awemeId = aweme.getAid();
                        contentInfoStruct.marketSubType = aweme.getMarketSubType();
                        contentInfoStruct.logId = aweme.getRequestId();
                        OperatorInfoStruct operatorInfoStruct = new OperatorInfoStruct();
                        operatorInfoStruct.operator = 2;
                        operatorInfoStruct.reason = str;
                        operatorInfoStruct.stage = 4;
                        operatorInfoStruct.opTimestamp = System.currentTimeMillis();
                        if (contentInfoStruct.operatorInfoList == null) {
                            contentInfoStruct.operatorInfoList = new ArrayList();
                        }
                        List<OperatorInfoStruct> list2 = contentInfoStruct.operatorInfoList;
                        if (list2 != null) {
                            list2.add(operatorInfoStruct);
                        }
                        originContentInfo.add(contentInfoStruct);
                    }
                }
            }

            public static void LJ(int i, int i2, FeedItemList feedItemList) {
                IStrategyApi iStrategyApi;
                if (C798410VTr.LIZ()) {
                    HashMap map = new HashMap();
                    map.put("monitor_scene", "scene_feed_data");
                    map.put("vv_code", Integer.valueOf(i2));
                    map.put("data_query_type", Integer.valueOf(i));
                    if (feedItemList != null && feedItemList.getItems() != null && feedItemList.getItems().size() != 0) {
                        map.put("data_is_null_or_empty", 0);
                        if (i2 == 6210) {
                            map.put("data_process_size", Integer.valueOf(feedItemList.getItems().size()));
                        } else {
                            map.put("data_receive_size", Integer.valueOf(feedItemList.getItems().size()));
                        }
                        if (C1220604q4.LIZ() && (iStrategyApi = (IStrategyApi) PluggableExtentionKt.pluggableSpi$default(IStrategyApi.class, false, false, false, 14, null)) != null && !iStrategyApi.LJJII()) {
                            map.put("first_feed_type", Integer.valueOf(((Aweme) ListProtector.get(feedItemList.getItems(), 0)).getAwemeType()));
                        }
                    } else {
                        map.put("data_is_null_or_empty", 1);
                    }
                    C798410VTr.LJFF(map);
                }
            }
        });
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            iLiveOuterService.A3();
        }
        if (C300530BqF.LIZ()) {
            listLJIILJJIL.add(new C1601650rmV() { // from class: X.0rp9
                @Override // X.C1601650rmV
                public final void LIZIZ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
                    IProactiveTriggersService iProactiveTriggersService = (IProactiveTriggersService) PluggableExtentionKt.pluggableSpi(IProactiveTriggersService.class);
                    if (iProactiveTriggersService != null) {
                        iProactiveTriggersService.LJIILLIIL(feedItemList.proactiveLoginConfig);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (feedItemList.getItems() != null) {
                        arrayList.addAll(feedItemList.getItems());
                    }
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) PluggableExtentionKt.pluggableSpi(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService != null) {
                        iAdLandPagePreloadService.G0();
                        C1024380clQ.LJIILIIL(arrayList, C0T4A.LIZ(c1601460rmC.LIZ), null);
                    }
                    C1603330rpD.LIZIZ.LJ().LIZ(arrayList);
                    if (feedItemList.getItems() != null) {
                        C20553215be.LIZLLL(feedItemList.getRequestId(), arrayList);
                    }
                    if (C2547609yc.LIZ && feedItemList.getItems() != null) {
                        C161N.LIZIZ.LJJJIL(c1601460rmC.LIZIZ, arrayList);
                    }
                }

                @Override // X.C1601650rmV
                public final void LIZJ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
                    List<CardInsertResultInfo> list;
                    if (feedItemList != null) {
                        C584850Mwl.LIZ.LJI(feedItemList.getRequestId(), feedItemList.logPb);
                    }
                    C735270Ssn.LIZ.LIZ(feedItemList);
                    if (feedItemList != null && feedItemList.getItems() != null && (list = feedItemList.cardInsertResults) != null && !list.isEmpty()) {
                        for (CardInsertResultInfo cardInsertResultInfo : feedItemList.cardInsertResults) {
                            if (cardInsertResultInfo.cardType == 59 && cardInsertResultInfo.cardInsertStatus == 20000) {
                                for (Aweme aweme : feedItemList.getItems()) {
                                    if (aweme.getCardInsertInfo() != null && aweme.getCardInsertInfo().getCardType() == 59) {
                                        String cardInsertStatus = aweme.getCardInsertInfo().getCardInsertStatus();
                                        if (!TextUtils.isEmpty(cardInsertStatus)) {
                                            try {
                                                C1227904rF.LIZ.getClass();
                                                AwemeRawAd awemeRawAd = (AwemeRawAd) C1227904rF.LIZIZ(cardInsertStatus, AwemeRawAd.class);
                                                if (awemeRawAd != null) {
                                                    AwemeCommerceStruct awemeCommerceStruct = new AwemeCommerceStruct();
                                                    awemeCommerceStruct.setStyleInfo(awemeRawAd);
                                                    aweme.setCommerceVideoAuthInfo(awemeCommerceStruct);
                                                }
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            });
        }
        if (((Number) C300530BqF.LIZ.getValue()).intValue() == 3) {
            listLJIILJJIL.add(new C1601650rmV() { // from class: X.0rlf
                @Override // X.C1601650rmV
                public final void LIZIZ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
                    int i = c1601460rmC.LIZIZ;
                    if (i == 8) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (feedItemList.getItems() != null) {
                        arrayList.addAll(feedItemList.getItems());
                    }
                    C307420C3g.LIZ(i, "full_feed_process_data_prepare_live_view");
                    if (!C086I.LIZIZ(arrayList)) {
                        ((ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class)).q4().p5().LIZIZ(0, C2421209eE.LIZ(), arrayList);
                    }
                    C307420C3g.LIZIZ(i, "full_feed_process_data_prepare_live_view");
                    C307420C3g.LIZ(i, "full_feed_process_data_report_feed_show");
                    if ((C0COD.LIZLLL() & 4) == 4) {
                        C1022030chd.LJJIIJZLJL(arrayList, new InterfaceC1022050chf() { // from class: X.0d2h
                            @Override // X.InterfaceC1022050chf
                            public final void invoke(Object[] objArr) {
                                Aweme[] awemeArr = (Aweme[]) objArr;
                                try {
                                    InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
                                    C844470XAv.LIZ.getClass();
                                    interfaceC1035050d2dLIZLLL.LJJIIJZLJL(C844470XAv.LIZ(), awemeArr[0]);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        });
                        C591640NIk.LIZ(0, arrayList);
                    } else {
                        C1022030chd.LJJIIJ(0, arrayList, new InterfaceC1022050chf() { // from class: X.0d2i
                            @Override // X.InterfaceC1022050chf
                            public final void invoke(Object[] objArr) {
                                Aweme[] awemeArr = (Aweme[]) objArr;
                                try {
                                    InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
                                    C844470XAv.LIZ.getClass();
                                    interfaceC1035050d2dLIZLLL.LJJIIJZLJL(C844470XAv.LIZ(), awemeArr[0]);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        });
                    }
                    C307420C3g.LIZIZ(i, "full_feed_process_data_report_feed_show");
                    if (C0COD.LIZ()) {
                        C0N4K.LIZJ(arrayList);
                    } else {
                        C0N4K.LIZIZ(arrayList);
                    }
                }

                @Override // X.C1601650rmV
                public final void LIZJ(C1601460rmC c1601460rmC, final FeedItemList feedItemList) {
                    int i = c1601460rmC.LIZIZ;
                    if (i == 8) {
                        return;
                    }
                    if (C2264471DkD.LIZLLL("homepage_hot")) {
                        MeasurementContext.LIZ.getClass();
                        C584230Mvl.LIZ().LJIIL(new C0N2B() { // from class: X.0N2G
                            @Override // X.C0N2B
                            public final void LIZ(MeasurementContext measurementContext) {
                                FeedItemList feedItemList2 = feedItemList;
                                C0N24.LIZ(measurementContext, feedItemList2.getItems(), "homepage_hot", feedItemList2.getRequestId());
                            }
                        });
                    }
                    C1023060cjI.LJI(feedItemList.getItems());
                    AdSessionPositionHelper adSessionPositionHelper = AdSessionPositionHelper.LIZ;
                    List<Aweme> items = feedItemList.getItems();
                    adSessionPositionHelper.getClass();
                    AdSessionPositionHelper.LJIIJJI("fyp", items);
                    ICommerceCommonService iCommerceCommonService = (ICommerceCommonService) PluggableExtentionKt.pluggableSpi(ICommerceCommonService.class);
                    Objects.requireNonNull(iCommerceCommonService);
                    if (iCommerceCommonService.LIZJ()) {
                        C1019400cdO.LJFF("soft_ads", feedItemList.getItems());
                        C1019400cdO.LJFF("roi2", feedItemList.getItems());
                    }
                    C307420C3g.LIZ(i, "full_feed_process_data_set_vma");
                    List<Aweme> items2 = feedItemList.getItems();
                    if (items2 != null) {
                        int size = items2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            AwemeExtKt.getUploadMiscInfoStruct((Aweme) ListProtector.get(items2, i2));
                        }
                    }
                    C307420C3g.LIZIZ(i, "full_feed_process_data_set_vma");
                }
            });
        }
        if (((TopGifterColdStartConfig) C0J8K.LIZIZ.getValue()).mainEnable) {
            listLJIILJJIL.add(new InterfaceC1333005Jo<FeedItemList>() { // from class: X.0rlt
                @Override // X.InterfaceC1333005Jo
                public final String getTag() {
                    return "live_response";
                }

                @Override // X.InterfaceC1333005Jo
                public final int getType() {
                    return 1;
                }

                @Override // X.InterfaceC1333005Jo
                public final void LIZ(C1440305kP<FeedItemList> c1440305kP) {
                    ILiveOuterService iLiveOuterService2;
                    InterfaceC1601520rmI interfaceC1601520rmIS3;
                    if (c1440305kP.LIZIZ.LIZIZ == 0 && (iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC1601520rmIS3 = iLiveOuterService2.S3()) != null) {
                        interfaceC1601520rmIS3.LJIIJ();
                    }
                }
            });
        }
        if (((Boolean) C275290Aqd.LIZ.getValue()).booleanValue()) {
            listLJIILJJIL.add(new C1601650rmV() { // from class: X.0rEx
                @Override // X.C1601650rmV
                public final void LIZIZ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
                    LiveRoomStruct liveRoomStructLJI;
                    UrlModel urlModel;
                    ILiveOuterService iLiveOuterService2;
                    InterfaceC20673515v3 interfaceC20673515v3K4;
                    for (Aweme aweme : feedItemList.getItems()) {
                        if (AwemeSaaSExtKt.isLive(aweme) && (liveRoomStructLJI = C0J4Y.LJI(aweme)) != null && (urlModel = liveRoomStructLJI.blurredCover) != null && (iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null) {
                            interfaceC20673515v3K4.LJJJIL(urlModel.getUrlList());
                        }
                    }
                }
            });
        }
        if (((Boolean) C270740AjI.LIZ.getValue()).booleanValue()) {
            listLJIILJJIL.add(new C1601650rmV() { // from class: X.0Dh3
                public final Set<String> LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());

                @Override // X.C1601650rmV
                public final void LIZIZ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
                    int size;
                    List<PhotoModeImageUrlModel> imageList;
                    PhotoModeImageInfo photoModeImageInfo;
                    List<PhotoModeImageUrlModel> imageList2;
                    try {
                        List<Aweme> items = feedItemList.getItems();
                        if (items != null) {
                            ArrayList<Aweme> arrayList = new ArrayList();
                            for (Aweme aweme : items) {
                                Aweme aweme2 = aweme;
                                if (AwemeExtKt.isPhotoMode(aweme2) && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (imageList2 = photoModeImageInfo.getImageList()) != null && (!imageList2.isEmpty())) {
                                    arrayList.add(aweme);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C844470XAv.LIZ.getClass();
                                Context contextLIZ = C844470XAv.LIZ();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    LIZLLL(contextLIZ, (Aweme) it2.next(), 0, EnumC1334360kpO.HIGH);
                                }
                                SettingsManager.LIZLLL().getClass();
                                int iLJ = SettingsManager.LJ("fyp_photo_mode_response_preload_count", 3);
                                if (iLJ <= 0) {
                                    return;
                                }
                                for (Aweme aweme3 : arrayList) {
                                    PhotoModeImageInfo photoModeImageInfo2 = aweme3.getPhotoModeImageInfo();
                                    if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                                        size = imageList.size();
                                    } else {
                                        size = 0;
                                    }
                                    int iMin = Math.min(iLJ, size - 1);
                                    if (1 <= iMin) {
                                        int i = 1;
                                        while (true) {
                                            LIZLLL(contextLIZ, aweme3, i, EnumC1334360kpO.MEDIUM);
                                            if (i != iMin) {
                                                i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                    }
                }

                public final void LIZLLL(Context context, Aweme aweme, int i, EnumC1334360kpO enumC1334360kpO) {
                    String aid = aweme.getAid();
                    if (aid == null) {
                        return;
                    }
                    Set<String> set = this.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(aid);
                    sbLIZ.append('#');
                    sbLIZ.append(i);
                    if (!set.add(C2188811AlT.LIZIZ(sbLIZ))) {
                        return;
                    }
                    C1EE2.LIZIZ.LJJIIZ("homepage_hot", context, aweme, i, enumC1334360kpO, null, null);
                }
            });
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        Object objLJJZ = iEcomSearchService != null ? iEcomSearchService.LJJZ() : null;
        if ((objLJJZ instanceof C1601650rmV) && objLJJZ != null) {
            listLJIILJJIL.add(objLJJZ);
        }
        listLJIILJJIL.addAll(RecommendFeedProcessorRegistry.INSTANCE.responseProcessors());
        return listLJIILJJIL;
    }
}
