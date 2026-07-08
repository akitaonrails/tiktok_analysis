package com.bytedance.android.live.ai;

import X.AbstractC1134010fcF;
import X.AbstractC1148530fzf;
import X.AbstractC1148550fzh;
import X.AbstractC2203101BKi;
import X.C1141780fom;
import X.C1148690fzv;
import X.C1148700fzw;
import X.C15FP;
import X.C15FQ;
import X.InterfaceC1148660fzs;
import X.InterfaceC20489715Fn;
import X.InterfaceC2787016b;
import android.media.AudioManager;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.livesetting.clientai.LiveGiftPanelPredictOpenSettings;
import com.bytedance.android.livesdk.livesetting.clientai.LivePitayaFeatureProducerSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveUserWatchDurationLayoutSettings;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS205S0000000_17;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.BagItem;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAiAnnotationRegister implements InterfaceC1148660fzs {
    @Override // X.InterfaceC1148660fzs
    public List<InterfaceC2787016b> getFeaturesProducerList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC1148530fzf() { // from class: X.0fzr
            public final String LIZ = "f_balance";
            public final C01GW LIZIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(237));

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZ;
            }

            @Override // X.AbstractC1148530fzf
            public final JSONObject LIZJ(JSONObject jSONObject) {
                Object obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("user_balance", Long.valueOf(((IWalletCenter) this.LIZIZ.getValue()).No0()));
                    C189200o6.m2constructorimpl(jSONObject2);
                    obj = jSONObject2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                Object obj2 = obj;
                if (zM7isFailureimpl) {
                    obj2 = null;
                }
                return (JSONObject) obj2;
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzi
            public final String LIZ = "f_live_watch_duration_layer";
            public final String LIZIZ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                return Float.valueOf(LiveUserWatchDurationLayoutSettings.INSTANCE.getValue());
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LivePitayaFeatureProducerSettings.INSTANCE.enabled();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZ;
            }
        });
        arrayList.add(new AbstractC1148530fzf() { // from class: X.0fze
            public final String LIZ = "f_live_task_info";
            public final String LIZIZ = "live_revenue_feature";

            @Override // X.AbstractC1148530fzf, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LivePitayaFeatureProducerSettings.INSTANCE.enabled();
            }

            @Override // X.AbstractC1148530fzf, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZ;
            }

            @Override // X.AbstractC1148530fzf
            public final JSONObject LIZJ(JSONObject jSONObject) {
                Object obj;
                JSONObject jSONObject2;
                Object obj2 = null;
                try {
                    C1126800fQc.LIZ.KE0().getClass();
                    TaskInfoResponse.Data data = TaskManagerV2.LIZLLL;
                    if (data != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("raw_data", new JSONObject(C19748512Ol.LIZJ.LJIILL(data)));
                        jSONObject2 = jSONObject3;
                    } else {
                        jSONObject2 = null;
                    }
                    C189200o6.m2constructorimpl(jSONObject2);
                    obj = jSONObject2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                if (!C189200o6.m7isFailureimpl(obj)) {
                    obj2 = obj;
                }
                return (JSONObject) obj2;
            }
        });
        arrayList.add(new AbstractC1148530fzf() { // from class: X.0fzu
            public final String LIZ = "f_incentive_cheating_feature";
            public final String LIZIZ = "global_live_incentive_native";

            @Override // X.AbstractC1148530fzf, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZ;
            }

            @Override // X.AbstractC1148530fzf
            public final JSONObject LIZJ(JSONObject jSONObject) {
                AudioManager audioManager;
                Object objH2 = C786410Ut5.H2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context(), "audio");
                Float fValueOf = null;
                if (objH2 instanceof AudioManager) {
                    audioManager = (AudioManager) objH2;
                } else {
                    audioManager = null;
                }
                JSONObject jSONObject2 = new JSONObject();
                if (audioManager != null) {
                    try {
                        fValueOf = Float.valueOf(audioManager.getStreamVolume(3) / C786410Ut5.Z3(audioManager, 3));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return jSONObject2;
                    }
                }
                jSONObject2.putOpt("output_volume", fValueOf);
                Map<String, Float> mapLIZIZ = C157W.LIZ().LIZIZ();
                if (mapLIZIZ == null) {
                    mapLIZIZ = C2097608Jq.LJ();
                }
                jSONObject2.putOpt("har_status", new JSONObject(mapLIZIZ));
                jSONObject2.putOpt("live_user_consume_amt_avg_layer", Integer.valueOf(LiveGiftUserConsumeLayerSetting.INSTANCE.getValue()));
                C189200o6.m2constructorimpl(Unit.LIZ);
                return jSONObject2;
            }
        });
        arrayList.add(new AbstractC1134010fcF() { // from class: X.0fUe
            public final String LIZ = "f_live_backpack_item_list";
            public final String LIZIZ = "live_revenue_feature";

            @Override // X.AbstractC1134010fcF
            public final JSONArray LIZJ() throws JSONException {
                List<BagItem> list = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class);
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                JSONArray jSONArray = new JSONArray();
                for (BagItem bagItem : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("group_id", Long.valueOf(bagItem.groupId));
                    jSONObject.putOpt("activate_at", Long.valueOf(bagItem.activateAt));
                    jSONObject.putOpt("count", Long.valueOf(bagItem.count));
                    jSONObject.putOpt("gift_price", Long.valueOf(bagItem.giftPrice));
                    jSONObject.putOpt("min_expire_at", Long.valueOf(bagItem.minExpireAt));
                    jSONObject.putOpt("item_id", Long.valueOf(bagItem.itemId));
                    jSONObject.putOpt("item_type", Integer.valueOf(bagItem.itemType));
                    jSONObject.putOpt("combo", Boolean.valueOf(bagItem.combo));
                    jSONObject.putOpt("available", Boolean.valueOf(bagItem.available));
                    jSONObject.putOpt("name", bagItem.name);
                    jSONObject.putOpt("toast", bagItem.toast);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }

            @Override // X.AbstractC1134010fcF, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LivePitayaFeatureProducerSettings.INSTANCE.enabled();
            }

            @Override // X.AbstractC1134010fcF, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZ;
            }
        });
        arrayList.add(new AbstractC1148530fzf() { // from class: X.0Wbs
            public final String LIZ = "f_sum_gifts_total_price";

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZ;
            }

            @Override // X.AbstractC1148530fzf
            public final JSONObject LIZJ(JSONObject jSONObject) {
                long jCurrentTimeMillis;
                Object obj;
                ConcurrentLinkedDeque<Pair<Long, Integer>> concurrentLinkedDeque = C826710Wbt.LIZ;
                ConcurrentLinkedDeque<Pair<Long, Integer>> concurrentLinkedDeque2 = C826710Wbt.LIZ;
                Long l = null;
                if (jSONObject == null) {
                    obj = null;
                } else {
                    try {
                        obj = jSONObject.get("timestamp");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (obj instanceof Long) {
                    l = (Long) obj;
                }
                if (l != null) {
                    jCurrentTimeMillis = l.longValue();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                long j = jCurrentTimeMillis - ((long) 10000);
                long j2 = jCurrentTimeMillis - ((long) 30000);
                long j3 = jCurrentTimeMillis - ((long) C538540LAe.LLJJJIL);
                JSONObject jSONObject2 = new JSONObject();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                for (Pair<Long, Integer> pair : concurrentLinkedDeque2) {
                    long jLongValue = pair.getFirst().longValue();
                    int iIntValue = pair.getSecond().intValue();
                    if (jLongValue >= j3) {
                        i2 += iIntValue;
                        if (jLongValue >= j2) {
                            i3 += iIntValue;
                            if (jLongValue >= j) {
                                i += iIntValue;
                            }
                        }
                    }
                }
                try {
                    jSONObject2.putOpt("gift_price_10s", Integer.valueOf(i));
                    jSONObject2.putOpt("gift_price_30s", Integer.valueOf(i3));
                    jSONObject2.putOpt("gift_price_60s", Integer.valueOf(i2));
                    return jSONObject2;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    String str = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e2);
                    sbLIZ.append(" occurred when creating our features.");
                    C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
                    return new JSONObject();
                }
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzn
            public final C01GW LIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(6));
            public final String LIZIZ = "f_live_fans_club_level";
            public final String LIZJ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                Object c098200Yq;
                C1095140ebY c1095140ebYUw0;
                try {
                    IFansClubService iFansClubService = (IFansClubService) this.LIZ.getValue();
                    c098200Yq = Float.valueOf((iFansClubService == null || (c1095140ebYUw0 = iFansClubService.uw0()) == null) ? -1.0f : c1095140ebYUw0.LIZ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return (Float) c098200Yq;
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LivePitayaFeatureProducerSettings.INSTANCE.enabled();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZIZ;
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzq
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(11));
            public final String LIZIZ = "f_live_gift_level_status";
            public final String LIZJ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                Object c098200Yq;
                C1094360eaI c1094360eaIHP;
                try {
                    IUserLevelService iUserLevelService = (IUserLevelService) this.LIZ.getValue();
                    c098200Yq = Float.valueOf((iUserLevelService == null || (c1094360eaIHP = iUserLevelService.HP()) == null) ? -1.0f : c1094360eaIHP.LJFF);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return (Float) c098200Yq;
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LiveGiftPanelPredictOpenSettings.INSTANCE.enable();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZIZ;
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzj
            public final String LIZ = "f_live_consumption_layer";
            public final String LIZIZ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                return Float.valueOf(LiveGiftUserConsumeLayerSetting.INSTANCE.getValue());
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LivePitayaFeatureProducerSettings.INSTANCE.enabled();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZ;
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzm
            public final C01GW LIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(8));
            public final String LIZIZ = "f_live_gifter_level";
            public final String LIZJ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                Object c098200Yq;
                C1094360eaI c1094360eaIHP;
                try {
                    IUserLevelService iUserLevelService = (IUserLevelService) this.LIZ.getValue();
                    c098200Yq = Float.valueOf((iUserLevelService == null || (c1094360eaIHP = iUserLevelService.HP()) == null) ? -1.0f : c1094360eaIHP.LIZ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return (Float) c098200Yq;
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LivePitayaFeatureProducerSettings.INSTANCE.enabled();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZIZ;
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzk
            public final String LIZ = "f_live_follow_stat";
            public final String LIZIZ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                Object c098200Yq;
                User owner;
                FollowInfo followInfo;
                try {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    Room roomLJJLI = C500260Jjc.LJJLI();
                    c098200Yq = Float.valueOf((roomLJJLI == null || (owner = roomLJJLI.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) ? -1.0f : followInfo.getFollowStatus());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return (Float) c098200Yq;
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LivePitayaFeatureProducerSettings.INSTANCE.enabled();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZ;
            }
        });
        arrayList.add(new AbstractC1148530fzf() { // from class: X.0fzg
            public final C01GW LIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(123));
            public final String LIZIZ = "f_match_context";

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC1148530fzf
            public final JSONObject LIZJ(JSONObject jSONObject) {
                Object obj;
                Object obj2 = null;
                if (!TextUtils.equals("in_pk", ((IInteractService) this.LIZ.getValue()).xw0())) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    ((IInteractService) this.LIZ.getValue()).zx0(jSONObject2);
                    C189200o6.m2constructorimpl(jSONObject2);
                    obj = jSONObject2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                if (!C189200o6.m7isFailureimpl(obj)) {
                    obj2 = obj;
                }
                return (JSONObject) obj2;
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzp
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(7));
            public final String LIZIZ = "f_live_fans_club_level_status";
            public final String LIZJ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                Object c098200Yq;
                C1095140ebY c1095140ebYUw0;
                try {
                    IFansClubService iFansClubService = (IFansClubService) this.LIZ.getValue();
                    c098200Yq = Float.valueOf((iFansClubService == null || (c1095140ebYUw0 = iFansClubService.uw0()) == null) ? -1.0f : c1095140ebYUw0.LJ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return (Float) c098200Yq;
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LiveGiftPanelPredictOpenSettings.INSTANCE.enable();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZIZ;
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzl
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(10));
            public final String LIZIZ = "f_live_is_super_fans_member";
            public final String LIZJ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                Object c098200Yq;
                try {
                    IFansClubService iFansClubService = (IFansClubService) this.LIZ.getValue();
                    c098200Yq = Float.valueOf(iFansClubService != null ? iFansClubService.wd2() ? 1.0f : 0.0f : -1.0f);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return (Float) c098200Yq;
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LiveGiftPanelPredictOpenSettings.INSTANCE.enable();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZIZ;
            }
        });
        arrayList.add(new AbstractC1148550fzh() { // from class: X.0fzo
            public final C01GW LIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(9));
            public final String LIZIZ = "f_live_has_coin";
            public final String LIZJ = "live_revenue_feature";

            @Override // X.AbstractC1148550fzh
            public final Float LIZJ() {
                Object c098200Yq;
                IWalletCenter iWalletCenterWalletCenter;
                try {
                    IWalletService iWalletService = (IWalletService) this.LIZ.getValue();
                    c098200Yq = Float.valueOf(((iWalletService == null || (iWalletCenterWalletCenter = iWalletService.walletCenter()) == null) ? 0L : iWalletCenterWalletCenter.No0()) > 0 ? 1.0f : 0.0f);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return (Float) c098200Yq;
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final boolean isEnable() {
                return LivePitayaFeatureProducerSettings.INSTANCE.enabled();
            }

            @Override // X.AbstractC1148550fzh, X.InterfaceC2787016b
            public final String LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC2787016b
            public final String getFeatureName() {
                return this.LIZIZ;
            }
        });
        return arrayList;
    }

    @Override // X.InterfaceC1148660fzs
    public List<InterfaceC20489715Fn> getTriggerCustomLoggerList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C15FP());
        arrayList.add(new C1141780fom());
        arrayList.add(new C15FQ());
        return arrayList;
    }

    @Override // X.InterfaceC1148660fzs
    public List<AbstractC2203101BKi> getTriggerFunctionHandlerList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC2203101BKi() { // from class: X.0Zv4
            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return "apply_guide_can_trigger";
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[EDGE_INSN: B:36:0x00a8->B:35:0x00a8 BREAK  A[LOOP:0: B:15:0x0058->B:39:0x0058]] */
            @Override // X.InterfaceC2203111BKj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(org.json.JSONArray r7) {
                /*
                    r6 = this;
                    X.0aAp r1 = X.C924810aAp.LJ()
                    boolean r0 = r1.LJJJJJL
                    r5 = 1
                    if (r0 == 0) goto La8
                    long r3 = java.lang.System.currentTimeMillis()
                    long r0 = r1.LJJJJL
                    long r3 = r3 - r0
                    r1 = 5000(0x1388, double:2.4703E-320)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 <= 0) goto La8
                    com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
                    java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
                    java.lang.Object r1 = r1.gg0(r0)
                    com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
                    if (r1 == 0) goto La8
                    java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
                    X.006A r0 = X.C1161920gLG.LIZJ(r0)
                    com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
                    boolean r0 = r0.Io0(r1)
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    boolean r0 = X.C500260Jjc.LJJJI(r0)
                    if (r0 == 0) goto La8
                    com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
                    X.0awC r1 = r0.LLJLL()
                    if (r1 == 0) goto La8
                    boolean r0 = X.C931790aM5.LIZIZ()
                    if (r0 == 0) goto L76
                    X.0a86 r0 = X.C940770aaZ.LIZ()
                    X.0a3Q r0 = r0.getDataSource()
                    java.util.List r0 = r0.LJIIIZ()
                    java.util.Iterator r2 = r0.iterator()
                L58:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto La8
                    java.lang.Object r1 = r2.next()
                    r0 = r1
                    X.0b0m r0 = (X.C957020b0m) r0
                    tikcast.linkmic.common.PosIdentity r0 = r0.getPosIdentity()
                    if (r0 == 0) goto L58
                    int r0 = r0.type
                    if (r0 != 0) goto L58
                    if (r1 == 0) goto La8
                L71:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                    return r0
                L76:
                    X.0aVw r0 = r1.LLIIJLIL()
                    X.0aVo r0 = r0.LJJJJZ()
                    java.util.List r0 = r0.getAllLayoutWindows()
                    java.util.Iterator r3 = r0.iterator()
                L86:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto La8
                    java.lang.Object r2 = r3.next()
                    r1 = r2
                    X.0aVq r1 = (X.InterfaceC937840aVq) r1
                    boolean r0 = r1.LJIILIIL()
                    if (r0 == 0) goto L86
                    java.lang.String r0 = r1.LJ()
                    if (r0 == 0) goto La5
                    int r0 = r0.length()
                    if (r0 != 0) goto L86
                La5:
                    if (r2 == 0) goto La8
                    goto L71
                La8:
                    r5 = 0
                    goto L71
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C915040Zv4.LIZ(org.json.JSONArray):java.lang.Object");
            }
        });
        arrayList.add(new AbstractC2203101BKi() { // from class: X.00n0
            public final String LIZ = "pk_infos";

            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return this.LIZ;
            }

            @Override // X.InterfaceC2203111BKj
            public final Object LIZ(JSONArray jSONArray) {
                int size;
                boolean z;
                List list = (List) DataChannelGlobal.LLILZ.gg0(C1148160fz4.class);
                int i = 0;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                if (size > 0) {
                    z = true;
                } else {
                    z = false;
                }
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    i = 1;
                }
                try {
                    C189200o6.m2constructorimpl(jSONObject.putOpt("has_match_items", Integer.valueOf(i)));
                    return jSONObject;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return jSONObject;
                }
            }
        });
        arrayList.add(new AbstractC2203101BKi() { // from class: X.00mz
            public final C01GW LIZ = C292401Bi.LIZ(AnonymousClass0206.get$arr$(526));
            public final String LIZIZ = "ab_params";

            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2203111BKj
            public final Object LIZ(JSONArray jSONArray) {
                Object c098200Yq;
                LinkedHashMap linkedHashMap;
                Map<String, Object> map;
                try {
                    C182200my c182200my = (C182200my) ((Map) this.LIZ.getValue()).get((String) jSONArray.get(0));
                    if (c182200my != null && (map = c182200my.LIZIZ) != null) {
                        linkedHashMap = new LinkedHashMap(map);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                    c098200Yq = new JSONObject(linkedHashMap);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    return new JSONObject();
                }
                return c098200Yq;
            }
        });
        arrayList.add(new AbstractC2203101BKi() { // from class: X.1BKb
            public final String LIZ = "trigger_records";

            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return this.LIZ;
            }

            @Override // X.InterfaceC2203111BKj
            public final Object LIZ(JSONArray jSONArray) {
                C2203041BKc c2203041BKc;
                try {
                    String str = (String) jSONArray.get(0);
                    String str2 = (String) jSONArray.get(1);
                    AtomicBoolean atomicBoolean = C2203061BKe.LIZ;
                    ConcurrentHashMap<String, C2203041BKc> concurrentHashMap = C2203061BKe.LJII.get(str);
                    if (concurrentHashMap == null || (c2203041BKc = concurrentHashMap.get(str2)) == null) {
                        c2203041BKc = new C2203041BKc();
                    }
                    return new JSONObject().putOpt("last_timestamp", Long.valueOf(c2203041BKc.LIZ)).putOpt("times", Integer.valueOf(c2203041BKc.LIZIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return new JSONObject();
                }
            }
        });
        arrayList.add(new C1148690fzv());
        arrayList.add(new AbstractC2203101BKi() { // from class: X.00nf
            public final C01GW LIZ = C292401Bi.LIZ(AnonymousClass0206.get$arr$(527));
            public final String LIZIZ = "user_info";

            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2203111BKj
            public final Object LIZ(JSONArray jSONArray) {
                Object c098200Yq;
                String string;
                try {
                    JSONObject jSONObject = new JSONObject();
                    InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                    String str = CardStruct.IStatusCode.DEFAULT;
                    if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                        string = CardStruct.IStatusCode.DEFAULT;
                    }
                    JSONObject jSONObjectPutOpt = jSONObject.putOpt("user_id", string);
                    String serverDeviceId = ((IHostAppContext) this.LIZ.getValue()).getServerDeviceId();
                    if (serverDeviceId != null) {
                        str = serverDeviceId;
                    }
                    c098200Yq = jSONObjectPutOpt.putOpt("device_id", str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    new JSONObject();
                }
                return C189200o6.m1boximpl(c098200Yq);
            }
        });
        arrayList.add(new C1148700fzw());
        arrayList.add(new AbstractC2203101BKi() { // from class: X.0J0U
            public final String LIZ = "current_room_info";
            public DataChannel LIZIZ;

            @Override // X.AbstractC2203101BKi
            public final void LIZJ() {
                this.LIZIZ = null;
            }

            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return this.LIZ;
            }

            @Override // X.InterfaceC2203111BKj
            public final Object LIZ(JSONArray jSONArray) {
                Object c098200Yq;
                long jLongValue;
                int i;
                Object objValueOf;
                String str;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
                if (c0ir5 == null) {
                    return new JSONObject();
                }
                Room room = c0ir5.LIZIZ;
                if (room == null) {
                    return new JSONObject();
                }
                try {
                    JSONObject jSONObjectPutOpt = new JSONObject().putOpt("room_id", Long.valueOf(room.getId()));
                    String title = room.getTitle();
                    String str2 = "";
                    if (title == null) {
                        title = "";
                    }
                    JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("title", title);
                    C0IXL c0ixl = c0ir5.LJFF;
                    if (c0ixl != null && (str = c0ixl.LIZ) != null) {
                        str2 = str;
                    }
                    JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("enter_method", str2);
                    Long l = c0ir5.LIZLLL;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    JSONObject jSONObjectPutOpt4 = jSONObjectPutOpt3.putOpt("anchor_id", Long.valueOf(jLongValue));
                    DataChannel dataChannel = this.LIZIZ;
                    int i2 = 1;
                    if (dataChannel != null) {
                        objValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
                    } else {
                        if (C500260Jjc.LJIJ(dataChannelGlobal)) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        objValueOf = Integer.valueOf(i);
                    }
                    JSONObject jSONObjectPutOpt5 = jSONObjectPutOpt4.putOpt("is_anchor", objValueOf).putOpt("enter_room_ts", Long.valueOf(C0J0V.LIZ));
                    if (!C0J0V.LIZIZ) {
                        i2 = 0;
                    }
                    c098200Yq = jSONObjectPutOpt5.putOpt("is_watching", Integer.valueOf(i2)).putOpt("online_audience_number", Integer.valueOf(C0IUA.LIZJ));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    return new JSONObject();
                }
                return c098200Yq;
            }

            @Override // X.AbstractC2203101BKi
            public final void LIZIZ(Fragment fragment, DataChannel dataChannel) {
                this.LIZIZ = dataChannel;
            }
        });
        arrayList.add(new AbstractC2203101BKi() { // from class: X.0KA0
            public final String LIZ = "app_states";

            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return this.LIZ;
            }

            @Override // X.InterfaceC2203111BKj
            public final Object LIZ(JSONArray jSONArray) {
                return new JSONObject().putOpt("app_states", Integer.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() ? 1 : 0));
            }
        });
        arrayList.add(new AbstractC2203101BKi() { // from class: X.0a7E
            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return "is_connected";
            }

            @Override // X.InterfaceC2203111BKj
            public final Object LIZ(JSONArray jSONArray) {
                boolean z;
                if (!C930540aK4.LJ() && !C930540aK4.LIZJ()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        arrayList.add(new AbstractC2203101BKi() { // from class: X.0aTY
            @Override // X.InterfaceC2203111BKj
            public final String getName() {
                return "is_guest";
            }

            @Override // X.InterfaceC2203111BKj
            public final Object LIZ(JSONArray jSONArray) {
                return Boolean.valueOf(C930540aK4.LJ());
            }
        });
        return arrayList;
    }
}
