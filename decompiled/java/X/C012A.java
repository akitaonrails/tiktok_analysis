package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.GiftRecommendInfo;
import com.bytedance.android.livesdk.gift.model.PanelRefresh;
import com.bytedance.android.livesdk.gift.model.PanelRefreshData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.012A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012A {
    public static WeakReference<DataChannel> LIZIZ;
    public static final C012A LIZ = new C012A();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final List<PanelRefresh> LIZLLL = new ArrayList();
    public static final Map<String, Pair<Long, Long>> LJ = new LinkedHashMap();
    public static final Set<String> LJFF = C13LQ.LJLIIL(new String[]{"livesdk_stream_goal_finished", "livesdk_gift_gallery_lit_up_success", "livesdk_custom_log_match_win"});
    public static final long LJI = 120000;

    public static boolean LJ() {
        IInteractService iInteractService = C1128450fTH.LIZ;
        User userLIZJ = C1125800fP0.LIZJ();
        return C1128450fTH.LJIJJ(userLIZJ != null ? userLIZJ.getId() : 0L) == C0JG7.CURRENT_ANCHOR;
    }

    public static void LJFF() {
        Long l;
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        WeakReference<DataChannel> weakReference = LIZIZ;
        if (((weakReference == null || (dataChannel2 = weakReference.get()) == null) ? null : dataChannel2.gg0(RoomChannel.class)) == null) {
            C20441214yg.LIZIZ("GiftClientAiHelper", "saveSendResponseListToKV: room is closed");
            ((ArrayList) LIZLLL).clear();
            return;
        }
        WeakReference<DataChannel> weakReference2 = LIZIZ;
        long ownerUserId = (weakReference2 == null || (dataChannel = weakReference2.get()) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? 0L : room.getOwnerUserId();
        List<PanelRefresh> list = LIZLLL;
        PanelRefresh panelRefresh = (PanelRefresh) C13LP.LJJLIIIJL(list);
        long jLongValue = (panelRefresh == null || (l = panelRefresh.toUserId) == null) ? -1L : l.longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSendResponseList: anchorId ");
        sbLIZ.append(ownerUserId);
        sbLIZ.append(", toUserId ");
        sbLIZ.append(jLongValue);
        C20441214yg.LIZIZ("GiftClientAiHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (ownerUserId != jLongValue) {
            ((ArrayList) list).clear();
        } else {
            ArrayList arrayList = (ArrayList) list;
            int size = arrayList.size();
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                PanelRefresh panelRefresh2 = (PanelRefresh) it2.next();
                if (panelRefresh2.timestamp <= 0) {
                    it2.remove();
                } else if (i < size - 1) {
                    panelRefresh2.galleryData = null;
                    panelRefresh2.userLevel = null;
                    panelRefresh2.fanClub = null;
                    panelRefresh2.roomId = null;
                    panelRefresh2.toUserId = null;
                }
                i++;
            }
        }
        if (((ArrayList) LIZLLL).size() > 0) {
            AtomicBoolean atomicBoolean = LIZJ;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            C11NZ.LJLJJLL(10L, TimeUnit.SECONDS).LJJLJLI(new C09JN() { // from class: X.012B
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GiftClientAiHelper@a97d.startSendDataKVTimer$1");
                    C012A.LIZJ.set(false);
                    C012A.LIZ.getClass();
                    C012A.LJFF();
                    C1C7U.LIZIZ("GiftClientAiHelper@a97d.startSendDataKVTimer$1");
                }
            });
        }
    }

    public static C012D LIZJ() {
        Map<Long, C012D> map;
        Set setEntrySet;
        Map.Entry entry;
        C012H c012hLIZ = C012J.LIZ(LJ());
        if (c012hLIZ == null || (map = c012hLIZ.LJI) == null || (setEntrySet = ((LinkedHashMap) map).entrySet()) == null || (entry = (Map.Entry) C13LP.LJJJLIIL(setEntrySet)) == null) {
            return null;
        }
        return (C012D) entry.getValue();
    }

    public static C012L LIZLLL() {
        C012H c012hLIZ = C012J.LIZ(LJ());
        if (c012hLIZ != null) {
            return c012hLIZ.LJII;
        }
        return null;
    }

    public static void LIZ(Map map) {
        boolean z;
        C012H c012hLIZ = C012J.LIZ(LJ());
        if (c012hLIZ != null) {
            boolean z2 = true;
            if (map != null && !map.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            Set setKeySet = null;
            if (!z) {
                Map.Entry entry = (Map.Entry) C13LP.LJJJJZ(map.entrySet());
                long jLongValue = ((Number) entry.getKey()).longValue();
                GiftRecommendInfo giftRecommendInfo = (GiftRecommendInfo) entry.getValue();
                String str = giftRecommendInfo.starlingKey;
                String strLIZJ = C012H.LIZJ(giftRecommendInfo);
                C012C c012c = c012hLIZ.LJFF;
                if (c012c != null) {
                    z2 = c012c.LIZLLL;
                }
                c012hLIZ.LJFF = new C012C(jLongValue, str, strLIZJ, z2);
            } else {
                c012hLIZ.LJFF = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cacheExclusiveRecommendInfo giftPanelData ");
            sbLIZ.append(c012hLIZ.LJFF);
            sbLIZ.append(", recommendInfos keys $");
            if (map != null) {
                setKeySet = map.keySet();
            }
            sbLIZ.append(setKeySet);
            C20441214yg.LJIIIZ("RecommendGiftWrapper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZIZ(long j) {
        Iterator it2 = ((LinkedHashMap) LJ).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (j - ((Number) ((Pair) entry.getValue()).getSecond()).longValue() > LJI) {
                it2.remove();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cleanExpiredCelebrationEvents: removed expired event ");
                sbLIZ.append((String) entry.getKey());
                C20441214yg.LIZIZ("GiftClientAiHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LJI(String str) {
        long id;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendFeature2: eventName ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("GiftClientAiHelper", C2188811AlT.LIZIZ(sbLIZ));
        long id2 = 0;
        if (LJFF.contains(str)) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            LIZIZ(jCurrentTimeMillis);
            LJ.put(str, new Pair<>(Long.valueOf(id), Long.valueOf(jCurrentTimeMillis)));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sendFeature2: recorded celebration event ");
            sbLIZ2.append(str);
            sbLIZ2.append(" for room ");
            sbLIZ2.append(id);
            sbLIZ2.append(" at ");
            sbLIZ2.append(jCurrentTimeMillis);
            C20441214yg.LIZIZ("GiftClientAiHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Map<String, Object> map = C015G.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room2 != null) {
            id2 = room2.getId();
        }
        linkedHashMap.put("room_id", Long.valueOf(id2));
        C015G.LIZIZ(linkedHashMap, str, null);
    }

    public static void LJII(PanelRefreshData panelRefreshData) {
        try {
            C19748512Ol.LIZIZ.LJIILL(panelRefreshData);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("toJsonString: ");
            sbLIZ.append(e);
            C20441214yg.LJIIIZ("GiftClientAiHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LJIIIIZZ(long j) {
        Boolean boolValueOf;
        Map<Long, C012D> map;
        LIZ.getClass();
        C012H c012hLIZ = C012J.LIZ(LJ());
        if (c012hLIZ != null) {
            Map<Long, C012D> map2 = c012hLIZ.LJI;
            if (map2 != null) {
                boolValueOf = Boolean.valueOf(map2.containsKey(Long.valueOf(j)));
            } else {
                boolValueOf = null;
            }
            if (C176600m4.LIZIZ(boolValueOf) && (map = c012hLIZ.LJI) != null) {
                C012D c012d = (C012D) ((LinkedHashMap) map).get(Long.valueOf(j));
                if (c012d != null) {
                    c012d.LJIIIIZZ = C963140bAe.LIZIZ();
                }
            }
        }
    }
}
