package X;

import Y.ARunnableS102S0200000_33;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.ab.RealTimeSignalConfigModel;
import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItem;
import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.feed.model.live.HotReloadFeedParams;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1AdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183771AdL implements InterfaceC591550NIb {
    public static final /* synthetic */ int LIZJ = 0;
    public final C2183811AdP LIZ = new Object() { // from class: X.1AdP
    };
    public final HashMap<String, InterfaceC2183821AdQ> LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1AdP] */
    public C2183771AdL() {
        HashMap<String, InterfaceC2183821AdQ> map = new HashMap<>();
        this.LIZIZ = map;
        map.put("fyp_real_time_client_info.ttm_play.fyp_consumption.fyp_context", new InterfaceC2183821AdQ() { // from class: X.1AdW
            @Override // X.InterfaceC2183821AdQ
            public final Object LIZ(C1601460rmC c1601460rmC) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("day_view_time", Long.valueOf(C2183861AdU.LIZ.LIZLLL().getLong("key_day_view_time", 0L)));
                jSONObject.putOpt("play_num", Integer.valueOf(C1DD1.LIZJ()));
                jSONObject.putOpt("batch_num_all", Integer.valueOf(C1DD1.LIZIZ()));
                jSONObject.putOpt("batch_num", Integer.valueOf(C1DD1.LIZ()));
                jSONObject.putOpt("play_num_all", Integer.valueOf(C1DD1.LIZLLL()));
                return jSONObject;
            }
        });
        map.put("fyp_real_time_client_info.ttm_play.fyp_consumption.fyp_sequence.unconsumption_item_list", new InterfaceC2183821AdQ() { // from class: X.1AdK
            @Override // X.InterfaceC2183821AdQ
            public final Object LIZ(C1601460rmC c1601460rmC) throws JSONException {
                List<? extends Aweme> list;
                AwemeRawAd awemeRawAd;
                boolean z;
                EcommerceInfo ecommerceInfo;
                Long adId;
                Long creativeId;
                HotReloadFeedParams hotReloadFeedParams;
                C286020BIy.LIZ.getClass();
                if (!C286020BIy.LIZ() || (list = c1601460rmC.LJJIJ) == null || list.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("timestamp", Long.valueOf(System.currentTimeMillis()));
                JSONArray jSONArray = new JSONArray();
                boolean zLIZ = C0BTE.LIZ();
                List<? extends Aweme> list2 = c1601460rmC.LJJIJ;
                if (list2 != null) {
                    for (Aweme aweme : list2) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
                        jSONObject2.putOpt("model_type", Integer.valueOf(aweme.getAwemeType()));
                        jSONObject2.putOpt("is_ad", Boolean.valueOf(aweme.isAd()));
                        if (zLIZ) {
                            jSONObject2.putOpt("is_live", Boolean.valueOf(AwemeSaaSExtKt.isLive(aweme)));
                            LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
                            if (liveRoomStructLJI != null) {
                                hotReloadFeedParams = liveRoomStructLJI.hotReloadFeedParams;
                            } else {
                                hotReloadFeedParams = null;
                            }
                            jSONObject2.putOpt("live_hot_refresh_info", hotReloadFeedParams);
                        }
                        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
                        if ((iECommerceAnchorService != null && iECommerceAnchorService.LJJJJZ(aweme)) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && Intrinsics.LJFF(ecommerceInfo.isEcom(), Boolean.TRUE))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jSONObject2.putOpt("is_ecom", Boolean.valueOf(z));
                        if (aweme.isAd()) {
                            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                            if (awemeRawAdLJJIJLIJ != null) {
                                adId = awemeRawAdLJJIJLIJ.getAdId();
                            } else {
                                adId = null;
                            }
                            jSONObject2.putOpt("ad_id", String.valueOf(adId));
                            AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
                            if (awemeRawAdLJJIJLIJ2 != null) {
                                creativeId = awemeRawAdLJJIJLIJ2.getCreativeId();
                            } else {
                                creativeId = null;
                            }
                            jSONObject2.putOpt("creative_id", String.valueOf(creativeId));
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.putOpt("items", jSONArray);
                return jSONObject;
            }
        });
        map.put("fyp_real_time_client_info.ttm_play.fyp_consumption.fyp_sequence.client_recall_candidate", new InterfaceC2183821AdQ() { // from class: X.1AdX
            @Override // X.InterfaceC2183821AdQ
            public final Object LIZ(C1601460rmC c1601460rmC) throws JSONException {
                SessionUnconsumptionItemList sessionUnconsumptionItemListLIZ;
                int i = c1601460rmC.LIZIZ;
                boolean z = false;
                if (C295980Biu.LIZ() && (i == 0 || i == 1 || i == 2 || i == 4)) {
                    z = true;
                }
                Object obj = null;
                obj = null;
                obj = null;
                if (z && (sessionUnconsumptionItemListLIZ = C1347505Pd.LIZ(i)) != null && (true ^ sessionUnconsumptionItemListLIZ.items.isEmpty())) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("timestamp", Long.valueOf(sessionUnconsumptionItemListLIZ.timestamp));
                    JSONArray jSONArray = new JSONArray();
                    for (SessionUnconsumptionItem sessionUnconsumptionItem : sessionUnconsumptionItemListLIZ.items) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt(FollowStatusChangeMethod.PARAM_UID, sessionUnconsumptionItem.aid);
                        jSONObject2.putOpt("model_type", Integer.valueOf(sessionUnconsumptionItem.awemeType));
                        jSONObject2.putOpt("is_ad", Boolean.valueOf(sessionUnconsumptionItem.isAd));
                        jSONObject2.putOpt("is_ecom", Boolean.valueOf(sessionUnconsumptionItem.isEcom));
                        jSONObject2.putOpt("is_cache", Boolean.valueOf(sessionUnconsumptionItem.isCache));
                        jSONObject2.putOpt("timestamp", Long.valueOf(sessionUnconsumptionItem.ts));
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.putOpt("items", jSONArray);
                    obj = jSONObject;
                }
                return obj;
            }
        });
    }

    @Override // X.InterfaceC591550NIb
    public final void LIZ(InterfaceC582850MtX interfaceC582850MtX) {
        if (!(interfaceC582850MtX instanceof C2183781AdM)) {
            return;
        }
        C01GW c01gw = C2183791AdN.LIZIZ;
        long j = ((RealTimeSignalConfigModel) c01gw.getValue()).delayTime;
        C2183781AdM c2183781AdM = (C2183781AdM) interfaceC582850MtX;
        if (c2183781AdM.LIZLLL) {
            if (c2183781AdM.LJFF - c2183781AdM.LJ > C301820BsK.LIZ + ((RealTimeSignalConfigModel) c01gw.getValue()).threshold) {
                return;
            }
        }
        C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new ARunnableS102S0200000_33(interfaceC582850MtX, this, 3));
    }

    public final void LIZJ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObjectOptJSONObject5;
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("fyp_real_time_client_info");
        if ((jSONObjectOptJSONObject6 == null || (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject6.optJSONObject("ttm_play")) == null || (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("fyp_consumption")) == null || (jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("fyp_sequence")) == null || jSONObjectOptJSONObject5.optJSONArray("consumption_items") == null) && (jSONObjectOptJSONObject = jSONObject.optJSONObject("fyp_consumption_final")) != null && (strOptString = jSONObjectOptJSONObject.optString("fyp_consumption")) != null && (jSONObjectOptJSONObject2 = new JSONObject(strOptString).optJSONObject("fyp_sequence")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("consumption_items")) != null) {
            LIZIZ(jSONObject, "fyp_real_time_client_info.ttm_play.fyp_consumption.fyp_sequence.consumption_items", jSONArrayOptJSONArray);
            jSONObject.remove("fyp_consumption_final");
        }
    }

    public static void LIZLLL(C1601460rmC c1601460rmC, C1DC8 c1dc8, JSONObject jSONObject) {
        List<C1DCH> list;
        JSONArray jSONArrayOptJSONArray;
        int length;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        C1DCB c1dcb = c1dc8.consumption_data;
        if (c1dcb != null) {
            list = c1dcb.consumption_items;
        } else {
            list = null;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("fyp_real_time_client_info");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("ttm_play")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("fyp_consumption")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("fyp_sequence")) != null) {
            jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("consumption_items");
        } else {
            jSONArrayOptJSONArray = null;
        }
        MLCommonService.Companion.getClass();
        IMLCommonService iMLCommonService = C0NAL.LIZ;
        JSONObject jSONObjectLIZ = C591500NHw.LIZ(new Pair("event", "ttm_feature_compare"), new Pair("enter_from", Integer.valueOf(c1601460rmC.LIZIZ)), new Pair("content", Boolean.valueOf(iMLCommonService.containFlashFeedConfig("fyp_real_time_client_info"))), new Pair("content2", Boolean.valueOf(iMLCommonService.containTTMFeatureScene("ttm_play_fyp_consumption"))));
        Pair[] pairArr = new Pair[3];
        int size = -1;
        if (jSONArrayOptJSONArray != null) {
            length = jSONArrayOptJSONArray.length();
        } else {
            length = -1;
        }
        pairArr[0] = new Pair("count", Integer.valueOf(length));
        if (list != null) {
            size = list.size();
        }
        pairArr[1] = new Pair("size", Integer.valueOf(size));
        pairArr[2] = new Pair("cost", Integer.valueOf(c1601460rmC.LJJJIL));
        C793770VBv.LJII("ttk_cd_monitor_normal_event", jSONObjectLIZ, C591500NHw.LIZ(pairArr), null);
    }

    public final void LIZIZ(JSONObject jSONObject, String str, Object obj) throws JSONException {
        getClass();
        int i = 0;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listLJJLIIIJILLIZJL) {
            if (!a0.LJJJIL((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size() - 1;
        for (Object obj3 : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = (String) obj3;
                if (i == size) {
                    jSONObject.putOpt(str2, obj);
                } else {
                    if (!jSONObject.has(str2)) {
                        jSONObject.putOpt(str2, new JSONObject());
                    }
                    jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject, str2);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
