package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.feed.api.TopLiveSkylightEntranceEvent;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.feed.watchlater.LiveWatchLaterMaxSizeSetting;
import com.bytedance.android.livesdk.feed.watchlater.WatchLaterApi;
import com.bytedance.android.livesdk.feed.watchlater.WatchLaterEducationDialog;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.api.audience.WatchLaterListResp;

/* JADX INFO: renamed from: X.0IZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468640IZi implements InterfaceC468710IZp, C0CW2<DownlinkLiveStatusData> {
    public static volatile boolean LLILLL;
    public static final C468640IZi LL = new C468640IZi();
    public static final LinkedHashMap<Long, C468600IZe> LLILLJJLI = new LinkedHashMap<>();
    public static final C468620IZg LLILZ = new C0IVA() { // from class: X.0IZg
        @Override // X.C0IVA
        public final void LIZ(EnumC471750Iej enumC471750Iej, long j) {
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
        @Override // X.C0IVA
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.EnumC471750Iej r12, boolean r13) {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C468620IZg.LIZIZ(X.0Iej, boolean):void");
        }
    };

    public static final int LIZ() {
        int i;
        LinkedHashMap<Long, C468600IZe> linkedHashMap = LLILLJJLI;
        synchronized (linkedHashMap) {
            try {
                Collection<C468600IZe> collectionValues = linkedHashMap.values();
                i = 0;
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator<T> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        if (((C468600IZe) it2.next()).LIZ() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    public static final Rect LJI() {
        Rect liveIconRect;
        IHostWatch iHostWatch = (IHostWatch) C1161920gLG.LIZJ(IHostWatch.class);
        if (iHostWatch == null || (liveIconRect = iHostWatch.getLiveIconRect()) == null || liveIconRect.isEmpty()) {
            return null;
        }
        float fExactCenterX = liveIconRect.exactCenterX();
        float fExactCenterY = liveIconRect.exactCenterY();
        float fWidth = liveIconRect.width() / 4.0f;
        float fHeight = liveIconRect.height() / 4.0f;
        return new Rect((int) (fExactCenterX - fWidth), (int) (fExactCenterY - fHeight), (int) (fExactCenterX + fWidth), (int) (fExactCenterY + fHeight));
    }

    public static void LJIIL() {
        w.LIZ.getClass();
        if (Intrinsics.LJFF(w.LJIIIZ(), "live_merge")) {
            C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0IZj
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WatchLaterManager@a847.refreshSkylightData$1");
                    try {
                        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).zX1();
                        CommonSkylightDataManager.LIZ.LJIJ(EnumC471750Iej.WATCH_LATER_CHANGE);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WatchLaterManager@a847.refreshSkylightData$1");
                }
            });
        }
    }

    public static void LIZLLL() {
        C480460Ism.LIZ().getClass();
        ((WatchLaterApi) C480460Ism.LIZLLL(WatchLaterApi.class)).getWatchLaterList().LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0IZh
            @Override // X.C09JN
            public final void accept(Object obj) {
                List<WatchLaterListResp.Item> list;
                Pair pair;
                C1C7U.LIZ("WatchLaterManager@a847.fetchAndReplaceLocalList$1");
                WatchLaterListResp.Data data = ((WatchLaterListResp) obj).data;
                if (data == null || (list = data.watchLaterList) == null) {
                    list = C13BV.INSTANCE;
                }
                LinkedHashMap<Long, C468600IZe> linkedHashMap = C468640IZi.LLILLJJLI;
                synchronized (linkedHashMap) {
                    try {
                        linkedHashMap.clear();
                        for (WatchLaterListResp.Item item : list) {
                            linkedHashMap.put(Long.valueOf(item.roomId), new C468600IZe(item.anchorId, EnumC468660IZk.LLILLL));
                        }
                        Collection<C468600IZe> collectionValues = C468640IZi.LLILLJJLI.values();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                        Iterator<T> it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(String.valueOf(((C468600IZe) it2.next()).LIZ));
                        }
                        Set setLLIIJI = C13LP.LLIIJI(arrayList);
                        Collection<C468600IZe> collectionValues2 = C468640IZi.LLILLJJLI.values();
                        int i = 0;
                        if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                            Iterator<T> it3 = collectionValues2.iterator();
                            while (it3.hasNext()) {
                                if (((C468600IZe) it3.next()).LIZ() && (i = i + 1) < 0) {
                                    C1697810uHb.LJIJ();
                                    throw null;
                                }
                            }
                        }
                        pair = new Pair(setLLIIJI, Integer.valueOf(i));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                Set<String> set = (Set) pair.getFirst();
                int iIntValue = ((Number) pair.getSecond()).intValue();
                ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkLiveStatusData("live_watch_later", set);
                C784440Upu.LIZ().LIZIZ(new C468580IZc(iIntValue));
                C1440005kM.LIZ(new C468770IZv(null, null, null, 1, 7));
                C1C7U.LIZIZ("WatchLaterManager@a847.fetchAndReplaceLocalList$1");
            }
        }, new C09JN() { // from class: X.0IZl
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("WatchLaterManager@a847.fetchAndReplaceLocalList$2");
                C1C7U.LIZIZ("WatchLaterManager@a847.fetchAndReplaceLocalList$2");
            }
        });
    }

    public static final Rect LJ() {
        int iLJIIZILJ = C497740JfY.LJJ() ? C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(30.0f)) : (int) C497740JfY.LIZIZ(30.0f);
        int iLIZIZ = ((int) C497740JfY.LIZIZ(26.0f)) + C497740JfY.LJIJ();
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(18.0f);
        return new Rect(iLJIIZILJ - iLIZIZ2, iLIZIZ - iLIZIZ2, iLJIIZILJ + iLIZIZ2, iLIZIZ + iLIZIZ2);
    }

    public static final Rect LJFF() {
        int iLIZIZ = C497740JfY.LJJ() ? (int) C497740JfY.LIZIZ(54.0f) : C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(54.0f));
        int iLIZIZ2 = ((int) C497740JfY.LIZIZ(26.0f)) + C497740JfY.LJIJ();
        int iLIZIZ3 = (int) C497740JfY.LIZIZ(18.0f);
        return new Rect(iLIZIZ - iLIZIZ3, iLIZIZ2 - iLIZIZ3, iLIZIZ + iLIZIZ3, iLIZIZ2 + iLIZIZ3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(long r4) {
        /*
            r3 = this;
            com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting.INSTANCE
            int r0 = r0.getValue()
            r2 = 1
            if (r0 <= 0) goto L42
            android.graphics.Rect r0 = LJI()
            if (r0 == 0) goto L42
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostUser> r0 = com.bytedance.android.livesdkapi.host.IHostUser.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostUser r0 = (com.bytedance.android.livesdkapi.host.IHostUser) r0
            boolean r0 = r0.isNeedProtectMinor()
            if (r0 != 0) goto L42
            java.util.LinkedHashMap<java.lang.Long, X.0IZe> r1 = X.C468640IZi.LLILLJJLI
            monitor-enter(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L3c
            X.0IZe r0 = (X.C468600IZe) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L39
            boolean r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L3c
            if (r0 != r2) goto L39
            goto L3a
        L39:
            r2 = 0
        L3a:
            monitor-exit(r1)
            return r2
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            throw r0
        L42:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C468640IZi.LIZIZ(long):int");
    }

    public final void LIZJ(Context context, Room room, boolean z) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = 22;
        feedItem.item = room;
        C0IVW c0ivw = new C0IVW(context, feedItem);
        c0ivw.LJIILLIIL = true;
        c0ivw.LIZJ = "live_merge";
        c0ivw.LJIILJJIL = true;
        if (z) {
            c0ivw.LIZLLL = "toplive_live_cover";
        } else {
            c0ivw.LIZLLL = "watch_later";
        }
        if (LIZ() > 1) {
            c0ivw.LJIILL = true;
        } else {
            DataChannelGlobal.LLILZ.FQ2(TopLiveSkylightEntranceEvent.class, new C477110InN(false, "watch_later_click", "watch_later_click", true));
        }
        C0IVV.LIZIZ(c0ivw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // X.C0CW2
    public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
        ?? arrayList;
        Pair pair;
        List<DownlinkLiveStatusItem> liveStatusChangeList = ((DownlinkLiveStatusData) baseDownlinkData).getLiveStatusChangeList();
        int i = 0;
        if (liveStatusChangeList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (DownlinkLiveStatusItem downlinkLiveStatusItem : liveStatusChangeList) {
                if (downlinkLiveStatusItem.roomStatus == 4) {
                    arrayList2.add(downlinkLiveStatusItem);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((DownlinkLiveStatusItem) it2.next()).roomId));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (true ^ arrayList.isEmpty()) {
            LinkedHashMap<Long, C468600IZe> linkedHashMap = LLILLJJLI;
            synchronized (linkedHashMap) {
                try {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        linkedHashMap.remove(Long.valueOf(((Number) it3.next()).longValue()));
                    }
                    Collection<C468600IZe> collectionValues = LLILLJJLI.values();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                    Iterator it4 = collectionValues.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(String.valueOf(((C468600IZe) it4.next()).LIZ));
                    }
                    Set setLLIIJI = C13LP.LLIIJI(arrayList3);
                    Collection<C468600IZe> collectionValues2 = LLILLJJLI.values();
                    if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                        Iterator it5 = collectionValues2.iterator();
                        while (it5.hasNext()) {
                            if (((C468600IZe) it5.next()).LIZ() && (i = i + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    pair = new Pair(setLLIIJI, Integer.valueOf(i));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Set<String> set = (Set) pair.getFirst();
            int iIntValue = ((Number) pair.getSecond()).intValue();
            ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkLiveStatusData("live_watch_later", set);
            C784440Upu.LIZ().LIZIZ(new C468580IZc(iIntValue));
            LJIIL();
        }
        awS125S0110000_7.invoke();
    }

    public static final void LJIIJ(Room room, String str, String str2, String str3, String str4) {
        String string;
        FollowInfo followInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_watch_later_success");
        c474500IjALIZ.LJJII(str, "enter_from_merge");
        c474500IjALIZ.LJJII(str2, "enter_method");
        c474500IjALIZ.LJJII(str3, "action_type");
        User owner = room.getOwner();
        Long lValueOf = null;
        if (owner != null) {
            string = Long.valueOf(owner.getId()).toString();
        } else {
            string = null;
        }
        c474500IjALIZ.LJJII(string, "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(room.getId()), "room_id");
        c474500IjALIZ.LJJII(str4, "panel_source");
        User owner2 = room.getOwner();
        if (owner2 != null && (followInfo = owner2.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        }
        c474500IjALIZ.LJJII(lValueOf, "follow_status");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIJJI(int i, final long j, long j2, final Context context, final InterfaceC468570IZb interfaceC468570IZb) {
        EnumC468660IZk enumC468660IZk;
        int i2;
        long j3;
        LinkedHashMap<Long, C468600IZe> linkedHashMap = LLILLJJLI;
        synchronized (linkedHashMap) {
            try {
                Long lValueOf = Long.valueOf(j);
                C468600IZe c468600IZe = linkedHashMap.get(lValueOf);
                if (c468600IZe == null) {
                    if (j2 < 0) {
                        j3 = 0;
                    } else {
                        j3 = j2;
                    }
                    c468600IZe = new C468600IZe(j3, EnumC468660IZk.LL);
                    linkedHashMap.put(lValueOf, c468600IZe);
                }
                C468600IZe c468600IZe2 = c468600IZe;
                if (c468600IZe2.LIZ <= 0 && j2 > 0) {
                    c468600IZe2.LIZ = j2;
                }
                C468600IZe c468600IZe3 = c468600IZe;
                EnumC468660IZk enumC468660IZk2 = c468600IZe3.LIZIZ;
                int i3 = 0;
                if (enumC468660IZk2 != EnumC468660IZk.LLILLJJLI && enumC468660IZk2 != EnumC468660IZk.LLILZ) {
                    if (!c468600IZe3.LIZ()) {
                        Collection<C468600IZe> collectionValues = linkedHashMap.values();
                        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator<T> it2 = collectionValues.iterator();
                            i2 = 0;
                            while (it2.hasNext()) {
                                if (((C468600IZe) it2.next()).LIZ() && (i2 = i2 + 1) < 0) {
                                    C1697810uHb.LJIJ();
                                    throw null;
                                }
                            }
                        }
                        if (i2 >= LiveWatchLaterMaxSizeSetting.INSTANCE.getValue()) {
                            C766270U4b.LJFF(2131856913, context);
                            linkedHashMap.remove(Long.valueOf(j));
                            return;
                        }
                    }
                    if (c468600IZe3.LIZ()) {
                        enumC468660IZk = EnumC468660IZk.LLILZ;
                    } else {
                        enumC468660IZk = EnumC468660IZk.LLILLJJLI;
                    }
                    c468600IZe3.LIZIZ = enumC468660IZk;
                    long j4 = c468600IZe3.LIZ;
                    Collection<C468600IZe> collectionValues2 = LLILLJJLI.values();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues2, 10));
                    Iterator<T> it3 = collectionValues2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(String.valueOf(((C468600IZe) it3.next()).LIZ));
                    }
                    Set setLLIIJI = C13LP.LLIIJI(arrayList);
                    Collection<C468600IZe> collectionValues3 = LLILLJJLI.values();
                    if (!(collectionValues3 instanceof Collection) || !collectionValues3.isEmpty()) {
                        Iterator<T> it4 = collectionValues3.iterator();
                        while (it4.hasNext()) {
                            if (((C468600IZe) it4.next()).LIZ() && (i3 = i3 + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    Pair pair = new Pair(setLLIIJI, Integer.valueOf(i3));
                    Set<String> set = (Set) pair.getFirst();
                    int iIntValue = ((Number) pair.getSecond()).intValue();
                    ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkLiveStatusData("live_watch_later", set);
                    C784440Upu.LIZ().LIZIZ(new C468580IZc(iIntValue));
                    int iOrdinal = enumC468660IZk.ordinal();
                    if (iOrdinal != 1) {
                        if (iOrdinal == 3) {
                            C480460Ism.LIZ().getClass();
                            ((WatchLaterApi) C480460Ism.LIZLLL(WatchLaterApi.class)).removeFromWatchLater(j, j4).LJIILIIL(new C0UO0()).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.0IZm
                                @Override // X.InterfaceC781210Ukh
                                public final void run() {
                                    C468640IZi.LJIIL();
                                }
                            }).LJJLL(new C09JN() { // from class: X.0IZa
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    int i4;
                                    Pair pair2;
                                    C1C7U.LIZ("WatchLaterManager@a847.removeFromWatchLater$2");
                                    long j5 = j;
                                    LinkedHashMap<Long, C468600IZe> linkedHashMap2 = C468640IZi.LLILLJJLI;
                                    synchronized (linkedHashMap2) {
                                        try {
                                            linkedHashMap2.remove(Long.valueOf(j5));
                                            Collection<C468600IZe> collectionValues4 = linkedHashMap2.values();
                                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collectionValues4, 10));
                                            Iterator<T> it5 = collectionValues4.iterator();
                                            while (it5.hasNext()) {
                                                arrayList2.add(String.valueOf(((C468600IZe) it5.next()).LIZ));
                                            }
                                            Set setLLIIJI2 = C13LP.LLIIJI(arrayList2);
                                            Collection<C468600IZe> collectionValues5 = C468640IZi.LLILLJJLI.values();
                                            if ((collectionValues5 instanceof Collection) && collectionValues5.isEmpty()) {
                                                i4 = 0;
                                            } else {
                                                Iterator<T> it6 = collectionValues5.iterator();
                                                i4 = 0;
                                                while (it6.hasNext()) {
                                                    if (((C468600IZe) it6.next()).LIZ() && (i4 = i4 + 1) < 0) {
                                                        C1697810uHb.LJIJ();
                                                        throw null;
                                                    }
                                                }
                                            }
                                            pair2 = new Pair(setLLIIJI2, Integer.valueOf(i4));
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    Set<String> set2 = (Set) pair2.getFirst();
                                    int iIntValue2 = ((Number) pair2.getSecond()).intValue();
                                    ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkLiveStatusData("live_watch_later", set2);
                                    C784440Upu.LIZ().LIZIZ(new C468580IZc(iIntValue2));
                                    interfaceC468570IZb.LIZ(0, false);
                                    C1C7U.LIZIZ("WatchLaterManager@a847.removeFromWatchLater$2");
                                }
                            }, new C09JN(j, context) { // from class: X.0IZd
                                public final /* synthetic */ long LL;

                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    int i4;
                                    Pair pair2;
                                    C1C7U.LIZ("WatchLaterManager@a847.removeFromWatchLater$3");
                                    long j5 = this.LL;
                                    LinkedHashMap<Long, C468600IZe> linkedHashMap2 = C468640IZi.LLILLJJLI;
                                    synchronized (linkedHashMap2) {
                                        try {
                                            C468600IZe c468600IZe4 = linkedHashMap2.get(Long.valueOf(j5));
                                            if (c468600IZe4 != null) {
                                                c468600IZe4.LIZIZ = EnumC468660IZk.LLILLL;
                                            }
                                            Collection<C468600IZe> collectionValues4 = linkedHashMap2.values();
                                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collectionValues4, 10));
                                            Iterator<T> it5 = collectionValues4.iterator();
                                            while (it5.hasNext()) {
                                                arrayList2.add(String.valueOf(((C468600IZe) it5.next()).LIZ));
                                            }
                                            Set setLLIIJI2 = C13LP.LLIIJI(arrayList2);
                                            Collection<C468600IZe> collectionValues5 = C468640IZi.LLILLJJLI.values();
                                            if ((collectionValues5 instanceof Collection) && collectionValues5.isEmpty()) {
                                                i4 = 0;
                                            } else {
                                                Iterator<T> it6 = collectionValues5.iterator();
                                                i4 = 0;
                                                while (it6.hasNext()) {
                                                    if (((C468600IZe) it6.next()).LIZ() && (i4 = i4 + 1) < 0) {
                                                        C1697810uHb.LJIJ();
                                                        throw null;
                                                    }
                                                }
                                            }
                                            pair2 = new Pair(setLLIIJI2, Integer.valueOf(i4));
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    Set<String> set2 = (Set) pair2.getFirst();
                                    int iIntValue2 = ((Number) pair2.getSecond()).intValue();
                                    ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkLiveStatusData("live_watch_later", set2);
                                    C784440Upu.LIZ().LIZIZ(new C468580IZc(iIntValue2));
                                    try {
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    if (!C036E.LIZ.LIZIZ()) {
                                        C766270U4b.LIZLLL(2131829438);
                                    }
                                    C1C7U.LIZIZ("WatchLaterManager@a847.removeFromWatchLater$3");
                                }
                            });
                            return;
                        }
                        return;
                    }
                    C0JT6<Boolean> c0jt6 = InterfaceC1106030et7.M9;
                    Boolean boolLIZ = c0jt6.LIZ();
                    if (boolLIZ != null && !boolLIZ.booleanValue()) {
                        LJIILIIL(i, j, j4, context, interfaceC468570IZb, false);
                    } else {
                        c0jt6.LIZJ(Boolean.FALSE);
                        LJIILIIL(i, j, j4, context, interfaceC468570IZb, true);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LJIIIIZZ(String str, String str2, String str3, Room room, int i, String str4) {
        String string;
        String str5;
        FollowInfo followInfo;
        if (i == -1) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_watch_later_icon_click");
        c474500IjALIZ.LJJII(str, "enter_from_merge");
        c474500IjALIZ.LJJII(str2, "enter_method");
        c474500IjALIZ.LJJII(str3, "action_type");
        User owner = room.getOwner();
        Long lValueOf = null;
        if (owner != null) {
            string = Long.valueOf(owner.getId()).toString();
        } else {
            string = null;
        }
        c474500IjALIZ.LJJII(string, "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(room.getId()), "room_id");
        c474500IjALIZ.LJJII(str4, "panel_source");
        if (i == 0) {
            str5 = "watch_later";
        } else {
            str5 = "cancel_watch_later";
        }
        c474500IjALIZ.LJJII(str5, "button_status");
        User owner2 = room.getOwner();
        if (owner2 != null && (followInfo = owner2.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        }
        c474500IjALIZ.LJJII(lValueOf, "follow_status");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIIZ(String str, String str2, String str3, Room room, int i, String str4) {
        String string;
        String str5;
        FollowInfo followInfo;
        if (i == -1) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_watch_later_icon_show");
        c474500IjALIZ.LJJII(str, "enter_from_merge");
        c474500IjALIZ.LJJII(str2, "enter_method");
        c474500IjALIZ.LJJII(str3, "action_type");
        User owner = room.getOwner();
        Long lValueOf = null;
        if (owner != null) {
            string = Long.valueOf(owner.getId()).toString();
        } else {
            string = null;
        }
        c474500IjALIZ.LJJII(string, "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(room.getId()), "room_id");
        c474500IjALIZ.LJJII(str4, "panel_source");
        if (i == 0) {
            str5 = "watch_later";
        } else {
            str5 = "cancel_watch_later";
        }
        c474500IjALIZ.LJJII(str5, "button_status");
        User owner2 = room.getOwner();
        if (owner2 != null && (followInfo = owner2.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        }
        c474500IjALIZ.LJJII(lValueOf, "follow_status");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(final int i, final long j, final long j2, final Context context, final InterfaceC468570IZb interfaceC468570IZb, final boolean z) {
        C480460Ism.LIZ().getClass();
        ((WatchLaterApi) C480460Ism.LIZLLL(WatchLaterApi.class)).saveToWatchLater(j, j2).LJIILIIL(new C0UO0()).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.0IZn
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C468640IZi.LJIIL();
            }
        }).LJJLL(new C09JN() { // from class: X.0IZf
            @Override // X.C09JN
            public final void accept(Object obj) {
                int i2;
                Pair pair;
                Context context2;
                FragmentManager supportFragmentManager;
                C19EG c19eg;
                Resources resources;
                Configuration configuration;
                C1C7U.LIZ("WatchLaterManager@a847.saveToWatchLater$2");
                long j3 = j;
                long j4 = j2;
                LinkedHashMap<Long, C468600IZe> linkedHashMap = C468640IZi.LLILLJJLI;
                synchronized (linkedHashMap) {
                    try {
                        linkedHashMap.put(Long.valueOf(j3), new C468600IZe(j4, EnumC468660IZk.LLILLL));
                        Collection<C468600IZe> collectionValues = linkedHashMap.values();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                        Iterator<T> it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(String.valueOf(((C468600IZe) it2.next()).LIZ));
                        }
                        Set setLLIIJI = C13LP.LLIIJI(arrayList);
                        Collection<C468600IZe> collectionValues2 = C468640IZi.LLILLJJLI.values();
                        if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator<T> it3 = collectionValues2.iterator();
                            i2 = 0;
                            while (it3.hasNext()) {
                                if (((C468600IZe) it3.next()).LIZ() && (i2 = i2 + 1) < 0) {
                                    C1697810uHb.LJIJ();
                                    throw null;
                                }
                            }
                        }
                        pair = new Pair(setLLIIJI, Integer.valueOf(i2));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                Set<String> set = (Set) pair.getFirst();
                int iIntValue = ((Number) pair.getSecond()).intValue();
                ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkLiveStatusData("live_watch_later", set);
                C784440Upu.LIZ().LIZIZ(new C468580IZc(iIntValue));
                if (z) {
                    if (i == 0 || ((context2 = context) != null && (resources = context2.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2)) {
                        interfaceC468570IZb.LIZ(1, true);
                    } else {
                        String str = WatchLaterEducationDialog._pnsPageId;
                        Context context3 = context;
                        int i3 = i;
                        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(interfaceC468570IZb, StrategyCenter.ENABLE_SMART_SERVICE);
                        if ((context3 instanceof C19EG) && (c19eg = (C19EG) context3) != null) {
                            supportFragmentManager = c19eg.getSupportFragmentManager();
                        } else {
                            supportFragmentManager = null;
                        }
                        if (C19322110iZ.LJFF(supportFragmentManager, new WatchLaterEducationDialog(i3, awS551S0100000_7), "WatchLaterEducationDialog", null, 0) == 0) {
                            awS551S0100000_7.invoke();
                        }
                    }
                } else {
                    interfaceC468570IZb.LIZ(1, false);
                }
                C1C7U.LIZIZ("WatchLaterManager@a847.saveToWatchLater$2");
            }
        }, new C09JN(j, context) { // from class: X.0IZZ
            public final /* synthetic */ long LL;

            @Override // X.C09JN
            public final void accept(Object obj) {
                int i2;
                Pair pair;
                C1C7U.LIZ("WatchLaterManager@a847.saveToWatchLater$3");
                long j3 = this.LL;
                LinkedHashMap<Long, C468600IZe> linkedHashMap = C468640IZi.LLILLJJLI;
                synchronized (linkedHashMap) {
                    try {
                        linkedHashMap.remove(Long.valueOf(j3));
                        Collection<C468600IZe> collectionValues = linkedHashMap.values();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                        Iterator<T> it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(String.valueOf(((C468600IZe) it2.next()).LIZ));
                        }
                        Set setLLIIJI = C13LP.LLIIJI(arrayList);
                        Collection<C468600IZe> collectionValues2 = C468640IZi.LLILLJJLI.values();
                        if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator<T> it3 = collectionValues2.iterator();
                            i2 = 0;
                            while (it3.hasNext()) {
                                if (((C468600IZe) it3.next()).LIZ() && (i2 = i2 + 1) < 0) {
                                    C1697810uHb.LJIJ();
                                    throw null;
                                }
                            }
                        }
                        pair = new Pair(setLLIIJI, Integer.valueOf(i2));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                Set<String> set = (Set) pair.getFirst();
                int iIntValue = ((Number) pair.getSecond()).intValue();
                ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkLiveStatusData("live_watch_later", set);
                C784440Upu.LIZ().LIZIZ(new C468580IZc(iIntValue));
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!C036E.LIZ.LIZIZ()) {
                    C766270U4b.LIZLLL(2131829438);
                }
                C1C7U.LIZIZ("WatchLaterManager@a847.saveToWatchLater$3");
            }
        });
    }
}
