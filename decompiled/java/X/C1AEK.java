package X;

import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.LiveInnerFlowAbility;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrl;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.feed.model.live.LiveUser;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AEK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AEK extends C1AEP {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zBooleanValue;
        Object obj;
        String string;
        Object obj2;
        long jCurrentTimeMillis;
        boolean z;
        String strLJJJLL;
        boolean z2;
        View view;
        LiveUser liveUser;
        LiveStreamUrl liveStreamUrl;
        LiveStreamUrlExtra.SrConfig srConfig;
        Long lValueOf;
        Integer numValueOf;
        String str;
        LiveStreamUrlExtra.SrConfig srConfig2;
        Long lValueOf2;
        Integer numValueOf2;
        String str2;
        Type type;
        Type type2;
        View view2;
        String strLJIIJJI;
        Object obj3;
        C1AEO c1aeo = (C1AEO) xBaseParamModel;
        long j = CastLongProtector.parseLong(c1aeo.getRoomId());
        String playerTag = c1aeo.getPlayerTag();
        if (C123100dR.LIZ(playerTag)) {
            C1440005kM.LIZ(new C034A(Long.valueOf(j)));
        }
        Boolean hasCommerceGoods = c1aeo.getHasCommerceGoods();
        if (hasCommerceGoods != null) {
            zBooleanValue = hasCommerceGoods.booleanValue();
        } else {
            zBooleanValue = false;
        }
        String enterFromMerge = c1aeo.getEnterFromMerge();
        String enterMethod = c1aeo.getEnterMethod();
        String autoRouteSchema = c1aeo.getAutoRouteSchema();
        String owner = c1aeo.getOwner();
        if (owner == null) {
            owner = "";
        }
        HashMap<String, String> map = new HashMap<>();
        Map<String, Object> logExtra = c1aeo.getLogExtra();
        if (logExtra != null) {
            Iterator<T> it2 = logExtra.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                map.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        Map<String, Object> logExtra2 = c1aeo.getLogExtra();
        if (logExtra2 != null) {
            obj = logExtra2.get("list_item_id");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || obj == null) {
            obj = "";
        }
        map.put("list_item_id", obj);
        map.put("source_page_type", "live");
        String streamData = c1aeo.getStreamData();
        if (streamData == null) {
            streamData = "";
        }
        String strValueOf = (String) map.get("click_timestamp");
        if (strValueOf == null) {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        Map<String, Object> extra = c1aeo.getExtra();
        if (extra != null && (obj3 = extra.get("btm")) != null) {
            string = obj3.toString();
        } else {
            string = null;
        }
        Map<String, Object> extra2 = c1aeo.getExtra();
        if (extra2 != null) {
            obj2 = extra2.get("bcm");
        } else {
            obj2 = null;
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j;
        roomsData.enterFromMerge = enterFromMerge;
        EnterRoomConfig.TimeStamp timeStamp = roomsData.timeStamps;
        if (timeStamp != null) {
            try {
                jCurrentTimeMillis = CastLongProtector.parseLong(strValueOf);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            timeStamp.enterRoomStarTimeReal = jCurrentTimeMillis;
        }
        enterRoomConfig.mRoomsData.enterMethod = enterMethod;
        if (autoRouteSchema != null && !a0.LJJJIL(autoRouteSchema) && (strLJIIJJI = C1742080vR0.LJIIJJI(1, autoRouteSchema)) != null) {
            enterRoomConfig.mRoomsData.extraSchema = ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).prefetchPdpEnterLiveRoom(strLJIIJJI);
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (zBooleanValue) {
            z = true;
        } else {
            z = false;
        }
        roomsData2.hasCommerceGoods = Boolean.valueOf(z);
        EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
        eCWrapData.autoOpenProductBag = 0;
        eCWrapData.autoOpenProductBagTrackParams = "{}";
        eCWrapData.isFromECContext = 1;
        eCWrapData.ecCommonExtraParam = map;
        eCWrapData.optAutoRouteSchemeRouting = 1;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String str3 = (String) map.get("search_id");
        if (str3 == null) {
            str3 = "";
        }
        logData.search_id = str3;
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        String str4 = (String) map.get("search_type");
        if (str4 == null) {
            str4 = "";
        }
        logData2.search_type = str4;
        EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
        String str5 = (String) map.get("search_keyword");
        if (str5 == null) {
            str5 = "";
        }
        logData3.search_keyword = str5;
        EnterRoomConfig.LogData logData4 = enterRoomConfig.mLogData;
        String str6 = (String) map.get("source_module");
        if (str6 != null) {
            strLJJJLL = a0.LJJJLL("_outer_flow", str6);
        } else {
            strLJJJLL = null;
        }
        logData4.sourceModule = strLJJJLL;
        EnterRoomConfig.LogData logData5 = enterRoomConfig.mLogData;
        String str7 = (String) map.get("list_item_id");
        if (str7 == null) {
            str7 = "";
        }
        logData5.list_item_id = str7;
        EnterRoomConfig.LogData logData6 = enterRoomConfig.mLogData;
        String str8 = (String) map.get("search_result_id");
        if (str8 == null) {
            str8 = "";
        }
        logData6.search_result_id_v2 = str8;
        enterRoomConfig.mLogData.search_result_type = 2;
        if (string != null) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view2 = interfaceC634840OvC.getView();
            } else {
                view2 = null;
            }
            PageFinder pageFinderVia = PageFinder.via(view2);
            C212367188v c212367188v = BcmParams.Companion;
            String strValueOf2 = String.valueOf(obj2);
            c212367188v.getClass();
            enterRoomConfig.mLogData.sourceBtmToken = btmSDK.createJumpSourceBtmToken(string, pageFinderVia, C212367188v.LIZ(strValueOf2));
        }
        if (C703302op.LIZ(enterRoomConfig.mLogData.sourceModule)) {
            map.put("source_module", enterRoomConfig.mLogData.sourceModule + "_outer_flow");
        }
        C013C c013c = new C013C();
        C118300cf c118300cf = new C118300cf();
        if ((!a0.LJJJIL(streamData)) && (!a0.LJJJIL(owner))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a0.LJJJIL(streamData)) {
            c118300cf.element |= 4;
        }
        if (a0.LJJJIL(owner)) {
            c118300cf.element |= 2;
        }
        if (z2) {
            NewLiveRoomStruct newLiveRoomStruct = new NewLiveRoomStruct();
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJII(LiveUser.class));
                } else {
                    type2 = new TypeToken<LiveUser>() { // from class: X.00Wx
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, owner, type2);
                if (!(objFromJson instanceof LiveUser)) {
                    objFromJson = null;
                }
                liveUser = (LiveUser) objFromJson;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
                liveUser = null;
            }
            newLiveRoomStruct.owner = liveUser;
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(LiveStreamUrl.class));
                } else {
                    type = new TypeToken<LiveStreamUrl>() { // from class: X.1AEq
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, streamData, type);
                if (!(objFromJson2 instanceof LiveStreamUrl)) {
                    objFromJson2 = null;
                }
                liveStreamUrl = (LiveStreamUrl) objFromJson2;
            } catch (s e3) {
                TryCatchGuardChecker.doCheck(e3);
                liveStreamUrl = null;
            }
            newLiveRoomStruct.stream_url = liveStreamUrl;
            newLiveRoomStruct.id = j;
            if (C123100dR.LIZ(playerTag)) {
                String multiStreamData = newLiveRoomStruct.getMultiStreamData();
                String multiStreamDefaultQualitySdkKey = newLiveRoomStruct.getMultiStreamDefaultQualitySdkKey();
                int iOrdinal = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
                LiveStreamUrlExtra streamUrlExtra = newLiveRoomStruct.getStreamUrlExtra();
                if (streamUrlExtra != null) {
                    srConfig2 = streamUrlExtra.getSrConfig();
                } else {
                    srConfig2 = null;
                }
                String options = newLiveRoomStruct.getOptions();
                LiveStreamUrl liveStreamUrl2 = newLiveRoomStruct.stream_url;
                if (liveStreamUrl2 != null) {
                    lValueOf2 = Long.valueOf(liveStreamUrl2.aliveTimestamp);
                } else {
                    lValueOf2 = null;
                }
                LiveStreamUrl liveStreamUrl3 = newLiveRoomStruct.stream_url;
                if (liveStreamUrl3 != null) {
                    numValueOf2 = Integer.valueOf(liveStreamUrl3.drmType);
                } else {
                    numValueOf2 = null;
                }
                LiveStreamUrl liveStreamUrl4 = newLiveRoomStruct.stream_url;
                if (liveStreamUrl4 != null) {
                    str2 = liveStreamUrl4.streamLanguage;
                } else {
                    str2 = null;
                }
                C0J4Y.LIZLLL(enterRoomConfig, multiStreamData, multiStreamDefaultQualitySdkKey, iOrdinal, srConfig2, options, lValueOf2, numValueOf2, str2);
                InterfaceC480520Iss interfaceC480520IssLLJJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLJJ(playerTag, true);
                if (interfaceC480520IssLLJJ == null) {
                    c118300cf.element |= 1;
                } else if (C123100dR.LIZ(interfaceC480520IssLLJJ.LJJIZ()) && Intrinsics.LJFF(interfaceC480520IssLLJJ.LJJIZ(), newLiveRoomStruct.getMultiStreamData())) {
                    interfaceC480520IssLLJJ.LJJJJI(false);
                    enterRoomConfig.mStreamData.sharePullStreamData = newLiveRoomStruct.getMultiStreamData();
                    enterRoomConfig.mRoomsData.warmUpPlayerTag = playerTag;
                    c013c.element = true;
                } else {
                    c118300cf.element |= 8;
                }
            }
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            long j2 = newLiveRoomStruct.id;
            roomsData3.roomId = j2;
            enterRoomConfig.mStreamData.streamRoomId = j2;
            String multiStreamData2 = newLiveRoomStruct.getMultiStreamData();
            String multiStreamDefaultQualitySdkKey2 = newLiveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            int iOrdinal2 = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
            LiveStreamUrlExtra streamUrlExtra2 = newLiveRoomStruct.getStreamUrlExtra();
            if (streamUrlExtra2 != null) {
                srConfig = streamUrlExtra2.getSrConfig();
            } else {
                srConfig = null;
            }
            String options2 = newLiveRoomStruct.getOptions();
            LiveStreamUrl liveStreamUrl5 = newLiveRoomStruct.stream_url;
            if (liveStreamUrl5 != null) {
                lValueOf = Long.valueOf(liveStreamUrl5.aliveTimestamp);
            } else {
                lValueOf = null;
            }
            LiveStreamUrl liveStreamUrl6 = newLiveRoomStruct.stream_url;
            if (liveStreamUrl6 != null) {
                numValueOf = Integer.valueOf(liveStreamUrl6.drmType);
            } else {
                numValueOf = null;
            }
            LiveStreamUrl liveStreamUrl7 = newLiveRoomStruct.stream_url;
            if (liveStreamUrl7 != null) {
                str = liveStreamUrl7.streamLanguage;
            } else {
                str = null;
            }
            C0J4Y.LIZLLL(enterRoomConfig, multiStreamData2, multiStreamDefaultQualitySdkKey2, iOrdinal2, srConfig, options2, lValueOf, numValueOf, str);
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            view = interfaceC634840OvC2.getView();
            if (view != null) {
                ((LiveInnerFlowAbility) C1558520qew.LIZJ(C1558360qeg.LJ(view, null), LiveInnerFlowAbility.class)).ge1(enterRoomConfig, String.valueOf(j));
            }
        } else {
            view = null;
        }
        Object obj4 = map.get("search_id");
        Object obj5 = map.get("search_result_id");
        Object obj6 = map.get("search_entrance");
        if (C0BYT.LIZ() && view != null && (obj4 != null || obj5 != null || obj6 != null)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj4 == null) {
                obj4 = "";
            }
            linkedHashMap.put("search_id", obj4);
            if (obj5 == null) {
                obj5 = "";
            }
            linkedHashMap.put("search_result_id", obj5);
            if (obj6 == null) {
                obj6 = "";
            }
            linkedHashMap.put("search_entrance", obj6);
            ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLIIJ(view, "c0", "d0", linkedHashMap, null);
        }
        String containerID = null;
        C1018703yb.LIZLLL("rd_ec_webcast_room_schema", new C603560Nlq(j, enterFromMerge, enterMethod, streamData, owner, playerTag, c013c, c118300cf));
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            containerID = interfaceC634840OvC3.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C1AET.class, containerID), "");
    }
}
