package X;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.livesetting.feed.TopLivePreFetchPoolSettingConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.feed.LiveFeedDataStateApi;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckServiceV2;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS26S0000100_7;

/* JADX INFO: renamed from: X.0IUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467340IUi {
    public static C0ITP LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static int LJ;
    public static boolean LJFF;
    public static int LJIIIIZZ;
    public static C11JF LJIIL;
    public static final C467340IUi LIZ = new C467340IUi();
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(410));
    public static int LJII = 1;
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(411));
    public static List<Long> LJIIJ = new ArrayList();
    public static String LJIIJJI = "";
    public static final String LJIILIIL = "toplive_cache";
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(408));
    public static final C01GW LJIILL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(409));

    public static void LJI() {
        Map<String, Object> mapUx;
        LJFF = true;
        LJ = 1;
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService != null && (mapUx = iLiveFeedApiService.ux(-1L)) != null) {
            Object obj = mapUx.get("feed_url");
            strLIZ = C0IUV.LIZ(obj instanceof String ? (String) obj : null);
        }
        HashMap map = new HashMap();
        if (C469460Ib2.LIZJ()) {
            map.put("is_non_personalized", "1");
        }
        LJIIL = C467110ITl.LIZIZ(strLIZ, LIZJ().getReqFrom(), new InterfaceC466760ISc() { // from class: X.0ITY
            @Override // X.InterfaceC466760ISc
            public final void LIZ(Throwable th) {
                String message;
                C467340IUi.LJ = 2;
                C20441214yg.LJI("TopLiveEntrancePreDataManagerV2", th);
                C467340IUi.LIZ();
                if (th == null || (message = th.getMessage()) == null) {
                    message = "";
                }
                C467340IUi.LJFF(message, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.util.List] */
            /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
            @Override // X.InterfaceC466760ISc
            public final void LIZIZ(C0ITP c0itp) {
                String str;
                ?? arrayList;
                List<FeedItem> list;
                List<FeedItem> list2;
                String str2;
                Long lValueOf;
                ILiveStatusCheckServiceV2 iLiveStatusCheckServiceV2;
                List<FeedItem> list3;
                long ownerUserId;
                Room room;
                FeedExtra feedExtra;
                FeedExtra feedExtra2;
                C467340IUi.LJ = 3;
                C467340IUi.LIZJ = SystemClock.uptimeMillis();
                if (c0itp != null && (feedExtra2 = c0itp.LIZIZ) != null) {
                    feedExtra2.hasMore = true;
                }
                C467340IUi.LIZ();
                if (c0itp == null || (feedExtra = c0itp.LIZIZ) == null || (str = feedExtra.unreadExtra) == null) {
                    str = "";
                }
                C467340IUi.LJIIJJI = str;
                if (c0itp != null && (list3 = c0itp.LIZ) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    for (FeedItem feedItem : list3) {
                        if (feedItem != null && (room = feedItem.getRoom()) != null) {
                            ownerUserId = room.getOwnerUserId();
                        } else {
                            ownerUserId = 0;
                        }
                        arrayList.add(Long.valueOf(ownerUserId));
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                String strLJJLIIIJ = null;
                if (!arrayList.isEmpty() && (iLiveStatusCheckServiceV2 = (ILiveStatusCheckServiceV2) C467340IUi.LJIILL.getValue()) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Number) it2.next()).longValue()));
                    }
                    iLiveStatusCheckServiceV2.hM0(arrayList2, C467340IUi.LJIILIIL, true, null);
                }
                if (c0itp != null) {
                    list = c0itp.LIZ;
                } else {
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    C0ITP c0itp2 = C467340IUi.LIZIZ;
                    if (c0itp2 != null && (list2 = c0itp2.LIZ) != null && !list2.isEmpty() && !LiveDedupOptExp.INSTANCE.disableUnread() && c0itp2 != null) {
                        FeedExtra feedExtra3 = c0itp2.LIZIZ;
                        if (feedExtra3 != null) {
                            str2 = feedExtra3.unreadExtra;
                        } else {
                            str2 = null;
                            if (c0itp2 != null) {
                            }
                            if (str2 != null && str2.length() != 0 && strLJJLIIIJ != null && strLJJLIIIJ.length() != 0) {
                                C480460Ism.LIZ().getClass();
                                ((LiveFeedDataStateApi) C480460Ism.LIZIZ(LiveFeedDataStateApi.class)).collectUnreadRequest(str2, strLJJLIIIJ).LJIILIIL(new C0UO0()).LJJLL(new C516901zr(28), new C09JN() { // from class: X.00Ly
                                    @Override // X.C09JN
                                    public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                        C1C7U.LIZ("TopLiveDataManager@dfec.reportUnreadFeedData$2");
                                        C1C7U.LIZIZ("TopLiveDataManager@dfec.reportUnreadFeedData$2");
                                    }
                                });
                            }
                        }
                        List<FeedItem> list4 = c0itp2.LIZ;
                        if (list4 != null) {
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                            Iterator<FeedItem> it3 = list4.iterator();
                            while (it3.hasNext()) {
                                Room room2 = it3.next().getRoom();
                                if (room2 != null) {
                                    lValueOf = Long.valueOf(room2.getId());
                                } else {
                                    lValueOf = null;
                                }
                                arrayList3.add(lValueOf);
                            }
                            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
                        }
                        if (str2 != null) {
                            C480460Ism.LIZ().getClass();
                            ((LiveFeedDataStateApi) C480460Ism.LIZIZ(LiveFeedDataStateApi.class)).collectUnreadRequest(str2, strLJJLIIIJ).LJIILIIL(new C0UO0()).LJJLL(new C516901zr(28), new C09JN() { // from class: X.00Ly
                                @Override // X.C09JN
                                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                    C1C7U.LIZ("TopLiveDataManager@dfec.reportUnreadFeedData$2");
                                    C1C7U.LIZIZ("TopLiveDataManager@dfec.reportUnreadFeedData$2");
                                }
                            });
                        }
                    }
                    C467340IUi.LIZIZ = c0itp;
                    C467340IUi.LJFF("", true);
                    return;
                }
                C467340IUi.LJFF("item is empty", false);
            }
        }, map);
        LJII++;
        C786410Ut5.LJLIIL(LIZJ().getCacheTime(), LIZIZ(), new Runnable() { // from class: X.0IUj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TopLiveEntrancePreDataManagerV2@84a2.startInternal$1");
                try {
                    C467340IUi.LJIIIIZZ = 2;
                    C467340IUi.LJI();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TopLiveEntrancePreDataManagerV2@84a2.startInternal$1");
            }
        });
    }

    public static void LIZ() {
        C11JF c11jf;
        C11JF c11jf2 = LJIIL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = LJIIL) != null) {
            c11jf.dispose();
        }
        LJIIL = null;
    }

    public static Handler LIZIZ() {
        return (Handler) LJI.getValue();
    }

    public static TopLivePreFetchPoolSettingConfig LIZJ() {
        return (TopLivePreFetchPoolSettingConfig) LJIIIZ.getValue();
    }

    public static final void LIZLLL(long j) {
        List<FeedItem> list;
        List<FeedItem> list2;
        C0ITP c0itp = LIZIZ;
        if (c0itp != null && (list2 = c0itp.LIZ) != null) {
            C19719612Di.LJJIIJ(list2, new AwS26S0000100_7(j, 13), true);
        }
        C0ITP c0itp2 = LIZIZ;
        if (c0itp2 == null || (list = c0itp2.LIZ) == null || list.isEmpty()) {
            LIZIZ = null;
        }
        ((ArrayList) LJIIJ).remove(Long.valueOf(j));
    }

    public static void LJ(int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_prefetch_enter_v2");
        c474500IjALIZ.LJJII(Long.valueOf(SystemClock.uptimeMillis() - LIZJ), "cached_time");
        c474500IjALIZ.LJJII(Long.valueOf(LIZLLL), "app_start_time");
        c474500IjALIZ.LJJII(Integer.valueOf(LJII - 1), "request_times");
        c474500IjALIZ.LJJII(Integer.valueOf(((Boolean) LJIILJJIL.getValue()).booleanValue() ? 1 : 0), "hit_strategy");
        c474500IjALIZ.LJJII(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Integer.valueOf(LJ), "net_status");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_prefetch_request_v2");
        c474500IjALIZ.LJJII(Integer.valueOf(LJII - 1), "request_times");
        c474500IjALIZ.LJJII(Integer.valueOf(LJIIIIZZ), "type");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(str, "error_msg");
        c474500IjALIZ.LIZ();
    }
}
