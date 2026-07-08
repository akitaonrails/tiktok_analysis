package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRealTimeApiSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0fXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131190fXh {
    public final Room LIZ;
    public final DataChannel LIZIZ;
    public final List<GiftPage> LIZJ;
    public final C1128740fTk LIZLLL;
    public final C1128720fTi LJ;
    public final IInteractService LJFF;
    public final long LJI;
    public final long LJII;

    public static void LIZLLL(C1129560fV4 c1129560fV4, GiftPage giftPage) {
        ArrayList arrayList;
        if (giftPage == null) {
            return;
        }
        List<Gift> list = giftPage.frequentlyUsedGifts;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Gift> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().id));
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        c1129560fV4.LJ = arrayList;
        c1129560fV4.LJFF.clear();
        List<Gift> list2 = giftPage.favouriteGifts;
        if (list2 != null) {
            Iterator<Gift> it3 = list2.iterator();
            while (it3.hasNext()) {
                c1129560fV4.LJFF.add(Long.valueOf(it3.next().id));
            }
        }
        c1129560fV4.LJIIJ.clear();
    }

    public final C1129560fV4 LIZJ(User user, boolean z) {
        Boolean boolValueOf;
        boolean zLIZ;
        long jLIZ;
        long jLIZ2;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        C2176881AHm c2176881AHm2;
        EnumC774050UXz enumC774050UXz;
        C1131690fYV c1131690fYV = new C1131690fYV();
        c1131690fYV.LIZ = this.LIZ;
        DataChannel dataChannel = this.LIZIZ;
        List<Long> list = null;
        if (dataChannel != null && (c2176881AHm2 = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null && (enumC774050UXz = c2176881AHm2.LIZ) != null) {
            boolValueOf = Boolean.valueOf(enumC774050UXz.isViewerWishAudience());
        } else {
            boolValueOf = null;
        }
        c1131690fYV.LIZIZ = C500260Jjc.LJJJI(boolValueOf);
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null && (c2176881AHm = (C2176881AHm) dataChannel2.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null) {
            list = c1125770fOx.LIZ;
        }
        c1131690fYV.LIZJ = list;
        c1131690fYV.LIZLLL = Long.valueOf(C1128450fTH.LJJIJIIJI());
        DataChannel dataChannel3 = this.LIZIZ;
        if (dataChannel3 != null) {
            zLIZ = C146500hD.LIZ(dataChannel3);
        } else {
            zLIZ = false;
        }
        c1131690fYV.LJIILIIL = zLIZ;
        DataChannel dataChannel4 = this.LIZIZ;
        if (dataChannel4 != null) {
            jLIZ = C01AU.LIZ(dataChannel4);
        } else {
            jLIZ = 0;
        }
        c1131690fYV.LJIILJJIL = jLIZ;
        DataChannel dataChannel5 = this.LIZIZ;
        if (dataChannel5 != null) {
            jLIZ2 = C1131540fYG.LIZ(dataChannel5);
        } else {
            jLIZ2 = -1;
        }
        c1131690fYV.LJIILL = jLIZ2;
        if (c1131690fYV.LIZ != null) {
            return new C1129560fV4(c1131690fYV.LIZ, c1131690fYV.LIZIZ, c1131690fYV.LIZJ, c1131690fYV.LIZLLL, c1131690fYV.LJ, c1131690fYV.LJFF, c1131690fYV.LJI, c1131690fYV.LJII, c1131690fYV.LJIIIIZZ, c1131690fYV.LJIIIZ, c1131690fYV.LJIIJ, c1131690fYV.LJIIJJI, c1131690fYV.LJIIL, c1131690fYV.LJIILIIL, c1131690fYV.LJIILJJIL, c1131690fYV.LJIILL);
        }
        "Room is required".toString();
        throw new IllegalArgumentException("Room is required");
    }

    public C1131190fXh(Room room, DataChannel dataChannel, List list) {
        C1128740fTk c1128740fTk = (C1128740fTk) new C1130180fW4().LIZJ.getValue();
        this.LIZ = room;
        this.LIZIZ = dataChannel;
        this.LIZJ = list;
        this.LIZLLL = c1128740fTk;
        this.LJ = new C1128720fTi();
        this.LJFF = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        LiveGiftRealTimeApiSettings liveGiftRealTimeApiSettings = LiveGiftRealTimeApiSettings.INSTANCE;
        long j = 60;
        this.LJI = liveGiftRealTimeApiSettings.reasonBlockDays() * ((long) 24) * j * j * 1000;
        this.LJII = liveGiftRealTimeApiSettings.reasonMaxShowCounts();
    }

    public final void LJ(long j, Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            if (j - ((Number) entry.getValue()).longValue() > this.LJI) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.keySet().iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            map2.remove(Long.valueOf(jLongValue));
            map.remove(Long.valueOf(jLongValue));
        }
    }

    public final void LIZ(Map<Long, Integer> map, Map<Long, Long> map2, List<Long> list, long j) {
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            int iIntValue = entry.getValue().intValue();
            if (map2.containsKey(Long.valueOf(jLongValue))) {
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.contains(Long.valueOf(jLongValue))) {
                    arrayList.add(Long.valueOf(jLongValue));
                }
            } else if (iIntValue >= this.LJII) {
                map2.put(Long.valueOf(jLongValue), Long.valueOf(j));
                ((ArrayList) list).add(Long.valueOf(jLongValue));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.gift.model.GiftRealTimeUpdateParams LIZIZ(X.C1121570fIB r29, java.util.List<? extends com.bytedance.android.livesdk.model.Gift> r30, X.C1132190fZJ r31, X.C1129560fV4 r32) {
        /*
            Method dump skipped, instruction units count: 1181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1131190fXh.LIZIZ(X.0fIB, java.util.List, X.0fZJ, X.0fV4):com.bytedance.android.livesdk.gift.model.GiftRealTimeUpdateParams");
    }
}
