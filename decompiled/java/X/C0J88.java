package X;

import Y.ARunnableS76S0200000_7;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInjectLiveFeatureSetting;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ab.TopGifterColdStartConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.FrequencyGroup;
import webcast.api.room.StrategyData;

/* JADX INFO: renamed from: X.0J88, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J88 implements InterfaceC1601520rmI {
    public static final C0J88 LJ = new C0J88();
    public long LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(new C0J87());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C0J85());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C0J86());

    @Override // X.InterfaceC1601520rmI
    public final Aweme LJI() {
        C0J89.LIZ.getClass();
        if (C0J89.LIZJ == C0J8B.SUCCESS) {
            return C0J89.LJIIIIZZ;
        }
        return null;
    }

    @Override // X.InterfaceC1601520rmI
    public final boolean LJIIIIZZ() {
        C0J89.LIZ.getClass();
        return (C0J89.LIZJ == C0J8B.IDLE || C0J89.LJ || C0J89.LJI) ? false : true;
    }

    @Override // X.InterfaceC1601520rmI
    public final void LJIIJ() {
        C0J89.LIZ.getClass();
        C0J89.LJ = true;
    }

    public final Set<String> LJIILL() {
        return (Set) this.LIZ.getValue();
    }

    public final String LJIILLIIL() {
        if (LJIILL().isEmpty()) {
            return null;
        }
        return C13LP.LJJLIIIJ(LJIILL(), ",", null, null, 0, null, null, 62);
    }

    @Override // X.InterfaceC1601520rmI
    public final void LIZ(boolean z) throws JSONException {
        String strLJIILLIIL;
        long j;
        boolean zLJI = MethodIDManager.LJI(196681);
        if (LiveDedupOptExp.INSTANCE.disableUnread()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            Keva repo = Keva.getRepo("live_history_repo");
            strLJIILLIIL = repo.getString("live_history_list", "");
            j = repo.getLong("live_history_time", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            linkedHashMap.put("trigger_method", "quit");
            repo.erase("live_history_list");
            repo.erase("live_history_time");
        } else {
            strLJIILLIIL = LJIILLIIL();
            LJIILL().clear();
            j = this.LIZIZ;
            linkedHashMap.put("trigger_method", "refresh");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report");
        sbLIZ.append(z);
        sbLIZ.append("      ");
        sbLIZ.append(strLJIILLIIL);
        C20441214yg.LIZIZ("LivePreviewService", C2188811AlT.LIZIZ(sbLIZ));
        if (strLJIILLIIL != null && strLJIILLIIL.length() != 0) {
            linkedHashMap.put("unwatched_room_id", strLJIILLIIL);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("channel_id", 112);
            jSONObject.put("req_from", "fyp_preview_live_unread");
            jSONObject.put("gen_time", j);
            jSONObject.put("is_backup", 0);
            C20684815ws.LJIILLIIL("livesdk_live_refresh_req", linkedHashMap);
            ((LiveStateApi) this.LIZJ.getValue()).collectUnreadRequest(C786410Ut5.J3(jSONObject), strLJIILLIIL).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0J8H
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LivePreviewService@8bf3.report$1");
                    C1C7U.LIZIZ("LivePreviewService@8bf3.report$1");
                }
            }, new C09JN() { // from class: X.0J8I
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LivePreviewService@8bf3.report$2");
                    C1C7U.LIZIZ("LivePreviewService@8bf3.report$2");
                }
            });
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1601520rmI
    public final void LIZIZ(C0J8D c0j8d) {
        C0J89.LIZ.getClass();
        C0J89.LIZLLL = c0j8d;
    }

    @Override // X.InterfaceC1601520rmI
    public final void LIZJ(List list) {
        LJIILL().addAll(list);
    }

    @Override // X.InterfaceC1601520rmI
    public final void LJ(Set<String> set) {
        LJIILL().removeAll(set);
    }

    @Override // X.InterfaceC1601520rmI
    public final void LJII(boolean z) {
        if (z) {
            LJIILL().clear();
            return;
        }
        String strLJIILLIIL = LJIILLIIL();
        if (strLJIILLIIL == null) {
            return;
        }
        Keva.getRepo("live_history_repo").storeString("live_history_list", strLJIILLIIL);
        Keva.getRepo("live_history_repo").storeLong("live_history_time", this.LIZIZ);
    }

    @Override // X.InterfaceC1601520rmI
    public final void LJIIIZ(C1601490rmF c1601490rmF) {
        C0J89 c0j89 = C0J89.LIZ;
        WeakReference<C0J8J> weakReference = new WeakReference<>(c1601490rmF);
        c0j89.getClass();
        C0J89.LJIILJJIL = weakReference;
    }

    @Override // X.InterfaceC1601520rmI
    public final C11NZ<Object> LJIILIIL(String str) throws JSONException {
        if (LiveDedupOptExp.INSTANCE.disableUnread()) {
            return null;
        }
        long jCurrentTimeMillis = this.LIZIZ;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", 112);
        jSONObject.put("req_from", "fyp_preview_live_unread");
        jSONObject.put("gen_time", jCurrentTimeMillis);
        jSONObject.put("is_backup", 0);
        return ((LiveStateApi) this.LIZJ.getValue()).collectUnreadRequest(C786410Ut5.J3(jSONObject), str).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0J8E
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return ((BaseResponse) obj).data;
            }
        }).LJIILIIL(new C0UO0());
    }

    @Override // X.InterfaceC1601520rmI
    public final void LJIILJJIL(Message message) {
        boolean z;
        C0J89.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveCacheData ");
        if (message == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C0J89.LIZLLL = C0J8D.DIRECT_UPDATE;
        C0J89.LJFF = message;
        C0J89.LJFF(false);
    }

    @Override // X.InterfaceC1601520rmI
    public final void remove(String str) {
        LJIILL().remove(str);
    }

    @Override // X.InterfaceC1601520rmI
    public final void LIZLLL(int i, List<? extends Aweme> list) {
        Long lValueOf;
        User user;
        C0J89.LIZ.getClass();
        ArrayList<Aweme> arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            for (Aweme aweme : arrayList) {
                if (aweme != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C0J89.LIZ.getClass();
                    c2344009Gk.LJII(C0J89.LIZ());
                    c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                    c2344009Gk.LJIIIIZZ("delete_reason", String.valueOf(i));
                    LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
                    String uid = null;
                    if (liveRoomStructLJI != null) {
                        lValueOf = Long.valueOf(liveRoomStructLJI.id);
                    } else {
                        lValueOf = null;
                    }
                    c2344009Gk.LJ(lValueOf, "room_id");
                    LiveRoomStruct liveRoomStructLJI2 = C0J4Y.LJI(aweme);
                    if (liveRoomStructLJI2 != null && (user = liveRoomStructLJI2.owner) != null) {
                        uid = user.getUid();
                    }
                    c2344009Gk.LJIIIIZZ("anchor_id", uid);
                    C20684815ws.LJIILLIIL("livesdk_strategy_top_gifter_live_card_deleted", c2344009Gk.LIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC1601520rmI
    public final void LJIIJJI(long j, List list) {
        LiveRoomStruct newLiveRoomDataExt;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (AwemeSaaSExtKt.isLive(aweme) && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null) {
                    LJIILL().add(String.valueOf(newLiveRoomDataExt.id));
                    this.LIZIZ = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }
            }
        }
    }

    @Override // X.InterfaceC1601520rmI
    public final void LJFF(boolean z, boolean z2, boolean z3) {
        int i;
        Integer num;
        FrequencyGroup frequencyGroup;
        C0J89.LIZ.getClass();
        boolean z4 = C0J89.LJIIIZ;
        C0J89.LJIIIZ = false;
        C01GW c01gw = C0J8K.LIZIZ;
        if (((TopGifterColdStartConfig) c01gw.getValue()).mainEnable) {
            C01GW c01gw2 = C0J89.LJIIL;
            StrategyData strategyData = (StrategyData) c01gw2.getValue();
            if (strategyData != null && strategyData.globalFrequency != null) {
                if (!z4) {
                    C0J89.LJ(1);
                    return;
                }
                if (!z) {
                    if (!z2) {
                        if (z3) {
                            StrategyData strategyData2 = (StrategyData) c01gw2.getValue();
                            if (strategyData2 != null && (frequencyGroup = strategyData2.globalFrequency) != null) {
                                long j = frequencyGroup.dailyCount;
                                long j2 = frequencyGroup.triggerGap;
                                long j3 = C0J89.LIZIZ().getLong("live_last_timestamp", 0L);
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                boolean zLIZLLL = C963140bAe.LIZLLL(j3, jCurrentTimeMillis);
                                long j4 = C0J89.LIZIZ().getLong("live_day_count", 0L);
                                if (zLIZLLL && j4 >= j) {
                                    num = 5;
                                } else {
                                    if (jCurrentTimeMillis - j3 <= j2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                                        num = 6;
                                    }
                                    C0J89.LIZJ = C0J8B.REQUESTING;
                                    C0J89.LJ = false;
                                    C238400w2 c238400w2 = new C238400w2();
                                    c238400w2.element = ((TopGifterColdStartConfig) c01gw.getValue()).timeout;
                                    C238400w2 c238400w22 = new C238400w2();
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    c238400w22.element = jUptimeMillis;
                                    long j5 = jUptimeMillis - C202094145s.LJIILL;
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LJII(C0J89.LIZ());
                                    c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                                    c2344009Gk.LIZLLL(j5, "duration");
                                    C20684815ws.LJIILLIIL("livesdk_strategy_top_gifter_launch_succeed", c2344009Gk.LIZ);
                                    C823050WQl.LIZLLL().execute(new ARunnableS76S0200000_7(c238400w2, c238400w22, 28));
                                    return;
                                }
                            } else {
                                num = 0;
                            }
                            if (num != null) {
                                C0J89.LJ(num.intValue());
                                return;
                            }
                            C0J89.LIZJ = C0J8B.REQUESTING;
                            C0J89.LJ = false;
                            C238400w2 c238400w23 = new C238400w2();
                            c238400w23.element = ((TopGifterColdStartConfig) c01gw.getValue()).timeout;
                            C238400w2 c238400w222 = new C238400w2();
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            c238400w222.element = jUptimeMillis2;
                            long j52 = jUptimeMillis2 - C202094145s.LJIILL;
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJII(C0J89.LIZ());
                            c2344009Gk2.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                            c2344009Gk2.LIZLLL(j52, "duration");
                            C20684815ws.LJIILLIIL("livesdk_strategy_top_gifter_launch_succeed", c2344009Gk2.LIZ);
                            C823050WQl.LIZLLL().execute(new ARunnableS76S0200000_7(c238400w23, c238400w222, 28));
                            return;
                        }
                        i = 3;
                    }
                    i = 2;
                } else if (!z2) {
                    if (z3) {
                        i = 4;
                    } else {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
                C0J89.LJ(i);
            }
        }
    }

    @Override // X.InterfaceC1601520rmI
    public final C11NZ LJIIL(int i, String str, String str2, Map map) {
        if (!LiveInjectLiveFeatureSetting.INSTANCE.injectEnable()) {
            return ((LiveStateApi) this.LIZJ.getValue()).getLiveCardList(str, "tikcast_feed_fyp_replenish", str2, i, map).LJIILIIL(new C0UO0());
        }
        return ((LiveStateApi) this.LIZLLL.getValue()).getLiveCardList(str, "tikcast_feed_fyp_replenish", str2, i, map).LJIILIIL(new C0UO0());
    }
}
