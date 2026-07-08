package X;

import Y.ARunnableS107S0100000_7;
import Y.ARunnableS12S1200000_7;
import Y.AfS103S0300000_7;
import Y.AfS132S0000000_7;
import Y.AfS140S0200000_4;
import Y.AfS143S0200000_7;
import Y.AfS1S0300100_7;
import Y.AfS27S0301000_7;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.experiment.LiveStatusBatchUpdateExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0J7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7Y implements C0J8Z {
    public static final Long LJIIL = 0L;
    public static final C486770J7b LJIILIIL = new C0J6I<C0J7Y>() { // from class: X.0J7b
        @Override // X.C0J6I
        public final C0J7Y LIZ() {
            return new C0J7Y();
        }
    };
    public final Map<Long, Long> LIZ = new HashMap(20);
    public volatile boolean LIZIZ = false;
    public final C13M7 LIZJ = new C13M7();
    public final C13M7 LIZLLL = new C13M7();
    public final Map<Long, Long> LJ = new HashMap(20);
    public final Map<String, Long> LJFF = new ConcurrentHashMap();
    public final LruCache<Long, Long> LJI = new LruCache<>(19);
    public final Map<Long, Long> LJII = new HashMap(40);
    public final LruCache<Long, Long> LJIIIIZZ = new LruCache<>(40);
    public C0J7L LJIIIZ = null;
    public final ArrayDeque<C0J7L> LJIIJ = new ArrayDeque<>(10);
    public final LiveStateApi LJIIJJI;

    public final void LJIILL() {
        C13M7 c13m7 = this.LIZJ;
        if (c13m7 == null || c13m7.isEmpty() || LiveStatusBatchUpdateExp.LIZ().batchUpdateUserNum >= this.LIZJ.size()) {
            return;
        }
        this.LIZJ.clear();
        this.LIZIZ = false;
    }

    public C0J7Y() {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(Live.getLiveDomain());
        this.LJIIJJI = (LiveStateApi) iRetrofitService.createNewRetrofit(C2188811AlT.LIZIZ(sbLIZ)).create(LiveStateApi.class);
    }

    public static long LJIILIIL() {
        try {
            return ((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZJ(Boolean.FALSE, "enable_refresh_foru_avatar_live_status")).booleanValue() ? ((Integer) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZJ(Integer.valueOf(C538540LAe.LLJJJIL), "mt_refresh_foru_avatar_live_state_interval")).intValue() : C0CLW.LIZIZ.LIZ.getAutoLiveStateIntervalMills().longValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 60000L;
        }
    }

    public static boolean LJIILLIIL() {
        return !((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().LIZJ(Boolean.FALSE, "live_preview_card_mpd_enable")).booleanValue();
    }

    public static boolean LJIJJ() {
        boolean zBooleanValue = false;
        if (((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().LIZJ(Boolean.FALSE, "enable_refresh_foru_avatar_live_status")).booleanValue()) {
            return false;
        }
        if (!C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            try {
                zBooleanValue = C0CLW.LIZIZ.LIZ.getEnableAutoLiveState().booleanValue();
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return !zBooleanValue;
    }

    public final void LJIJI() {
        boolean zLJI = MethodIDManager.LJI(202158);
        C0J7L c0j7l = this.LJIIIZ;
        if (c0j7l != null && c0j7l.LL) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C0J7L c0j7lPollLast = this.LJIIJ.pollLast();
        this.LJIIIZ = c0j7lPollLast;
        if (c0j7lPollLast == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            c0j7lPollLast.run();
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // X.C0J8Z
    public final boolean LIZJ() {
        return this.LIZIZ;
    }

    public static void LJIIZILJ(List list) {
        RoomFeedCellStruct roomStruct;
        LiveRoomStruct newLiveRoomData;
        String strLJIIIIZZ;
        LiveCoreSDKData liveCoreSDKData;
        if (LJIILLIIL()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            FollowFeed followFeed = (FollowFeed) it2.next();
            if (followFeed.getFeedType() == 65298 && (roomStruct = followFeed.getRoomStruct()) != null && (newLiveRoomData = roomStruct.getNewLiveRoomData()) != null) {
                StreamUrlStruct streamUrlStruct = newLiveRoomData.stream_url;
                if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getPullData() != null) {
                    strLJIIIIZZ = C2348809Ig.LJIIIIZZ(newLiveRoomData.stream_url.liveCoreSDKData.getPullData());
                } else {
                    strLJIIIIZZ = null;
                }
                if (!TextUtils.isEmpty(strLJIIIIZZ)) {
                    arrayList.add(strLJIIIIZZ);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().LJJ(arrayList);
        }
    }

    @Override // X.C0J8Z
    public final boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.LIZJ.remove(str);
    }

    @Override // X.C0J8Z
    public final void LIZIZ(long j) {
        ((HashMap) this.LIZ).remove(Long.valueOf(j));
        ((HashMap) this.LJ).remove(Long.valueOf(j));
        this.LJI.remove(Long.valueOf(j));
    }

    @Override // X.C0J8Z
    public final void LJFF(List<Aweme> list) {
        if (!LJIJJ() && !C086I.LIZIZ(list)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (Aweme aweme : list) {
                if ("homepage_follow".equals(Integer.valueOf(aweme.getAwemeType()))) {
                    aweme.getAwemeType();
                }
                if (aweme.getAuthor() != null) {
                    LJIJ(jCurrentTimeMillis, aweme.getAuthor());
                }
                LJIIJJI(aweme.getAuthor(), jCurrentTimeMillis);
            }
        }
        try {
            if (!LJIILLIIL()) {
                C823050WQl.LIZLLL().submit(new ARunnableS107S0100000_7(list, 7));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "preloadMPDForLive");
        }
    }

    @Override // X.C0J8Z
    public final void LJI(List<FollowFeed> list) {
        LiveRoomStruct newLiveRoomData;
        try {
            LJIIZILJ(list);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "preloadMPDForLiveInFollow");
        }
        if (LJIJJ() || C086I.LIZIZ(list)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65298) {
                RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
                if (roomStruct != null && (newLiveRoomData = roomStruct.getNewLiveRoomData()) != null) {
                    User user = newLiveRoomData.owner;
                    user.roomId = newLiveRoomData.id;
                    LJIJ(jCurrentTimeMillis, user);
                    LJIIJJI(newLiveRoomData.owner, jCurrentTimeMillis);
                }
            } else {
                Aweme aweme = followFeed.getAweme();
                if (aweme != null) {
                    LJIJ(jCurrentTimeMillis, aweme.getAuthor());
                    LJIIJJI(aweme.getAuthor(), jCurrentTimeMillis);
                }
            }
        }
    }

    @Override // X.C0J8Z
    public final void LJ(Runnable runnable, String str) {
        if (TextUtils.equals(str, "homepage_hot")) {
            if (C487180J8q.LIZIZ == 0) {
                runnable.run();
                return;
            } else {
                ((LinkedList) C487180J8q.LIZLLL.getValue()).addLast(runnable);
                return;
            }
        }
        if (!TextUtils.equals(str, "homepage_follow")) {
            return;
        }
        if (C487180J8q.LIZJ == 0) {
            runnable.run();
        } else {
            ((LinkedList) C487180J8q.LJ.getValue()).addLast(runnable);
        }
    }

    @Override // X.C0J8Z
    public final boolean LJII(Aweme aweme, User user) {
        Long l;
        String uid = user.getUid();
        if (TextUtils.isEmpty(uid)) {
            return false;
        }
        String aid = aweme.getAid();
        if (TextUtils.isEmpty(aid)) {
            return false;
        }
        C13M7 c13m7 = this.LIZJ;
        if ((c13m7 != null && c13m7.contains(aid)) || this.LIZLLL.contains(uid) || (!TextUtils.isEmpty(uid) && (l = (Long) ((ConcurrentHashMap) this.LJFF).get(uid)) != null && System.currentTimeMillis() - l.longValue() < LiveStatusBatchUpdateExp.LIZ().cacheExpiredIntervalMs)) {
            return false;
        }
        return true;
    }

    public final void LJIIJJI(User user, long j) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            Long lValueOf = CastLongProtector.valueOf(user.getUid());
            this.LJIIIIZZ.put(lValueOf, Long.valueOf(user.roomId));
            ((HashMap) this.LJII).put(lValueOf, Long.valueOf(j));
        }
    }

    public final void LJIIL(List<User> list, Map<Long, Long> map) {
        long j;
        if (!C086I.LIZIZ(list)) {
            for (User user : list) {
                if (user != null) {
                    try {
                        j = CastLongProtector.parseLong(user.getUid());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        j = 0;
                    }
                    Long l = map.get(Long.valueOf(j));
                    if (l == null) {
                        l = 0L;
                    }
                    if (l.longValue() != 0) {
                        ((HashMap) this.LIZ).put(Long.valueOf(j), l);
                        ((HashMap) this.LJ).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                    }
                    this.LJIIIIZZ.put(Long.valueOf(j), l);
                    ((HashMap) this.LJII).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    public final void LJIILJJIL(List list, boolean z) {
        if (z) {
            LJIILL();
        }
        Map<String, Long> map = this.LJFF;
        if (map != null && !((ConcurrentHashMap) map).isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((ConcurrentHashMap) this.LJFF).entrySet()) {
                if (entry != null) {
                    String str = (String) entry.getKey();
                    Long l = (Long) entry.getValue();
                    if (!TextUtils.isEmpty(str) && l != null) {
                        if (jCurrentTimeMillis - l.longValue() >= LiveStatusBatchUpdateExp.LIZ().cacheExpiredIntervalMs) {
                            arrayList.add(str);
                            try {
                                long j = CastLongProtector.parseLong(str);
                                if (l.equals(((HashMap) this.LIZ).get(Long.valueOf(j)))) {
                                    ((HashMap) this.LIZ).remove(Long.valueOf(j));
                                }
                                if (l.equals(((HashMap) this.LJ).get(Long.valueOf(j)))) {
                                    ((HashMap) this.LJ).remove(Long.valueOf(j));
                                }
                                if (l.equals(this.LJIIIIZZ.get(Long.valueOf(j)))) {
                                    this.LJIIIIZZ.remove(Long.valueOf(j));
                                }
                                if (l.equals(((HashMap) this.LJII).get(Long.valueOf(j)))) {
                                    ((HashMap) this.LJII).remove(Long.valueOf(j));
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } else {
                        arrayList.add(str);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ConcurrentHashMap) this.LJFF).remove(it2.next());
            }
        }
        if (!C086I.LIZIZ(list)) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                this.LIZLLL.remove(((User) it3.next()).getUid());
            }
        }
    }

    public final void LJIJ(long j, User user) {
        if (!LJIJJ() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long lValueOf = CastLongProtector.valueOf(user.getUid());
            long j2 = user.roomId;
            if (j2 != 0) {
                ((HashMap) this.LIZ).put(lValueOf, Long.valueOf(j2));
                ((HashMap) this.LJ).put(lValueOf, Long.valueOf(j));
                this.LJI.put(lValueOf, Long.valueOf(user.roomId));
            }
        }
    }

    @Override // X.C0J8Z
    public final void LIZLLL(User user, C09JN c09jn, String str) {
        Set<Long> set;
        if (!LJIJJ() && user != null && !TextUtils.isEmpty(user.getUid())) {
            try {
                Long lValueOf = CastLongProtector.valueOf(user.getUid());
                C0J7L c0j7l = this.LJIIIZ;
                if (c0j7l != null && (set = c0j7l.LLILZ) != null && ((HashSet) set).contains(lValueOf)) {
                    ((ArrayList) this.LJIIIZ.LLILZIL).add(c09jn);
                } else {
                    this.LJIIJ.addFirst(new C0J7L(this, lValueOf, Long.valueOf(user.roomId), c09jn, str));
                    LJIJI();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.C0J8Z
    public final void LJIIIZ(List list, AfS140S0200000_4 afS140S0200000_4, String str) {
        long j;
        if (LJIJJ() || C086I.LIZIZ(list)) {
            return;
        }
        long jLongValue = 0;
        try {
            j = CastLongProtector.parseLong(((User) ListProtector.get(list, 0)).getUid());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((HashMap) this.LJII).get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        }
        if (jCurrentTimeMillis - Long.valueOf(jLongValue).longValue() < LJIILIIL()) {
            try {
                afS140S0200000_4.accept(this.LIZ);
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onResult:");
                sbLIZ.append(Log.getStackTraceString(e2));
                C2344809Gs.LJFF("LiveStateManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!C086I.LIZIZ(list)) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                sb.append(((User) it2.next()).getUid());
                sb.append(",");
            }
        }
        String string = sb.toString();
        if (string.endsWith(",")) {
            string = string.substring(0, string.length() - 1);
        }
        this.LJIIJJI.liveStates(string, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS103S0300000_7(list, this, afS140S0200000_4, 0), new AfS132S0000000_7(4));
    }

    @Override // X.C0J8Z
    public final void LJIIIIZZ(User user, List list, AfS27S0301000_7 afS27S0301000_7, String str) {
        long j;
        long jLongValue = 0;
        try {
            j = CastLongProtector.parseLong(user.getUid());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((HashMap) this.LJII).get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        }
        if (jCurrentTimeMillis - Long.valueOf(jLongValue).longValue() < LJIILIIL()) {
            try {
                afS27S0301000_7.accept(this.LJIIIIZZ.get(Long.valueOf(j)));
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onResult:");
                sbLIZ.append(Log.getStackTraceString(e2));
                C2344809Gs.LJFF("LiveStateManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(user.getUid());
        sb.append(",");
        if (!C086I.LIZIZ(list)) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                sb.append(((User) it2.next()).getUid());
                sb.append(",");
            }
        }
        String string = sb.toString();
        if (string.endsWith(",")) {
            string = string.substring(0, string.length() - 1);
        }
        this.LJIIJJI.liveStates(string, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS1S0300100_7(j, this, afS27S0301000_7, list, 0), new AfS132S0000000_7(3));
    }

    @Override // X.C0J8Z
    public final void LJIIJ(final List list, final Map map, final ARunnableS107S0100000_7 aRunnableS107S0100000_7, final String str) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty() || C486790J7d.LIZIZ()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String uid = ((User) it2.next()).getUid();
            this.LIZLLL.add(uid);
            sb.append(uid);
            sb.append(",");
        }
        String string = sb.toString();
        if (string.endsWith(",")) {
            string = string.substring(0, string.length() - 1);
        }
        this.LJIIJJI.liveStates(string, "tiktok_video_head_timer").LJJLL(new C09JN() { // from class: X.0J7Z
            @Override // X.C09JN
            public final void accept(Object obj) {
                Map<Long, Long> mapLIZ;
                C0J7Y c0j7y = this.LL;
                List<User> list2 = list;
                Map map2 = map;
                Runnable runnable = aRunnableS107S0100000_7;
                String str2 = str;
                LiveStateResponse liveStateResponse = (LiveStateResponse) obj;
                c0j7y.getClass();
                C1C7U.LIZ("LiveStateManager@a4a7.refreshUserListForFeed$1L");
                if (liveStateResponse != null) {
                    LiveStateResponse.MapUserIdRoomId mapUserIdRoomId = liveStateResponse.mapUserIdRoomId;
                    if (mapUserIdRoomId != null && (mapLIZ = mapUserIdRoomId.LIZ()) != null && !C086I.LIZIZ(list2)) {
                        c0j7y.LJIILL();
                        for (User user : list2) {
                            if (user != null) {
                                String uid2 = user.getUid();
                                if (!TextUtils.isEmpty(uid2)) {
                                    try {
                                        long j = CastLongProtector.parseLong(uid2);
                                        Long l = mapLIZ.get(Long.valueOf(j));
                                        if (l == null) {
                                            l = 0L;
                                        }
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        ((ConcurrentHashMap) c0j7y.LJFF).put(uid2, Long.valueOf(jCurrentTimeMillis));
                                        if (l.longValue() != 0) {
                                            ((HashMap) c0j7y.LIZ).put(Long.valueOf(j), l);
                                        } else {
                                            ((HashMap) c0j7y.LIZ).remove(Long.valueOf(j));
                                        }
                                        ((HashMap) c0j7y.LJ).put(Long.valueOf(j), Long.valueOf(jCurrentTimeMillis));
                                        c0j7y.LJIIIIZZ.put(Long.valueOf(j), l);
                                        ((HashMap) c0j7y.LJII).put(Long.valueOf(j), Long.valueOf(jCurrentTimeMillis));
                                        List<Aweme> list3 = (List) map2.get(uid2);
                                        if (!C086I.LIZIZ(list3)) {
                                            boolean z = LiveStatusBatchUpdateExp.LIZ().batchUpdateUserStatus;
                                            boolean z2 = LiveStatusBatchUpdateExp.LIZ().batchDeleteLiveCard;
                                            if (z || z2) {
                                                for (Aweme aweme : list3) {
                                                    if (aweme != null) {
                                                        if (l.longValue() == 0) {
                                                            if (z2 && AwemeSaaSExtKt.isLive(aweme)) {
                                                                c0j7y.LIZJ.add(aweme.getAid());
                                                                c0j7y.LIZIZ = true;
                                                            }
                                                        } else {
                                                            User author = aweme.getAuthor();
                                                            if (z && author != null && author.roomId == 0) {
                                                                author.roomId = l.longValue();
                                                            }
                                                        }
                                                    }
                                                }
                                                if (c0j7y.LIZIZ && runnable != null) {
                                                    if (C486790J7d.LIZIZ()) {
                                                        c0j7y.LJ(runnable, str2);
                                                    } else {
                                                        C486790J7d.LIZJ(new ARunnableS12S1200000_7(runnable, c0j7y, str2, 0));
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            }
                        }
                    }
                    c0j7y.LJIILJJIL(list2, false);
                }
                C1C7U.LIZIZ("LiveStateManager@a4a7.refreshUserListForFeed$1L");
            }
        }, new AfS143S0200000_7((Object) this, (EmoteModel) list, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 0));
    }
}
