package X;

import Y.AComparatorS37S0000000_18;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS1S0102000_3;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreDataLruPool;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.explore.data.PreloadInfo;
import com.ss.android.ugc.aweme.explore.experiment.ExploreFirstPreloadVideoConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS70S0100100_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15T8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15T8 implements InterfaceC586170Myt {
    public static final C15T8 LL;
    public static ExploreAwemeList LLILLJJLI;
    public static final Map<Long, ExploreTopicAwemeListResponse> LLILLL;
    public static final ConcurrentHashMap<Long, ExploreTopicAwemeListResponse> LLILZ;
    public static ExploreAwemeList LLILZIL;
    public static volatile Long LLILZLL;
    public static final Map<Long, ExploreAwemeList> LLIZ;
    public static final C01GW LLIZLLLIL;
    public static Map<Long, Long> LLJ;
    public static volatile boolean LLJI;

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.ss.android.ugc.aweme.explore.data.ExploreAwemeList LJFF() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15T8.LJFF():com.ss.android.ugc.aweme.explore.data.ExploreAwemeList");
    }

    public final synchronized boolean LJIILIIL() {
        return LLILLJJLI != null;
    }

    static {
        C15T8 c15t8 = new C15T8();
        LL = c15t8;
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(c15t8);
        LLILLL = new LinkedHashMap();
        LLILZ = new ConcurrentHashMap<>();
        LLIZ = new LinkedHashMap();
        LLIZLLLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(529));
        LLJ = new LinkedHashMap();
    }

    public static void LIZLLL() {
        HashMap map;
        synchronized (LLJ) {
            try {
                map = new HashMap(LLJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (map.size() <= 15) {
            return;
        }
        for (Map.Entry entry : C13LP.LL(C13LP.LJLLLL(new AComparatorS37S0000000_18(21), map.entrySet()), map.size() - 15)) {
            C15T8 c15t8 = LL;
            long jLongValue = ((Number) entry.getKey()).longValue();
            c15t8.getClass();
            LJIJ(jLongValue);
        }
        LJIILLIIL();
    }

    public static Keva LJII() {
        return (Keva) LLIZLLLIL.getValue();
    }

    public static InterfaceC625970Ogt LJIIIIZZ() {
        return C2192401ArG.LIZ(C589170N8x.LIZ("explore"), "explore_feed_cache_v2");
    }

    public static InterfaceC625970Ogt LJIIJ() {
        return C2192401ArG.LIZ(C589170N8x.LIZ("explore"), "explore_topic_feed_cache");
    }

    public static void LJIILLIIL() {
        HashMap map;
        try {
            synchronized (LLJ) {
                try {
                    map = new HashMap(LLJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            LJIIJ().LIZIZ("key_topic_feed_access_index", C09C2.LIZ().LJIILL(map));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(th2, 2720);
            c2153908cD.getClass();
            C2153908cD.LIZ("explore_topic_feed_cache", awS562S0100000_18);
        }
    }

    public final void LJ() {
        if (LLJI) {
            return;
        }
        synchronized (this) {
            try {
                if (LLJI) {
                    return;
                }
                try {
                    LL.getClass();
                    String string = LJIIJ().getString("key_topic_feed_access_index", "");
                    if (string == null) {
                        string = "";
                    }
                    if (string.length() > 0) {
                        try {
                            Map<Long, Long> map = (Map) C09C2.LIZ().LJIIIIZZ(string, new TypeToken<Map<Long, Long>>() { // from class: X.0grV
                            }.getType());
                            if (map != null) {
                                LLJ = map;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } finally {
                    try {
                    } catch (Throwable th2) {
                    }
                }
                LLJI = true;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    public static boolean LJIIJJI() {
        ExploreAwemeList exploreAwemeList;
        List<ExplorePostItem> list;
        return (!C294800Bh0.LIZ() || (exploreAwemeList = LLILZIL) == null || (list = exploreAwemeList.items) == null || list.isEmpty()) ? false : true;
    }

    public static void LIZJ(Long l) {
        List<Aweme> list;
        if (l != null) {
            l.longValue();
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponseRemove = LLILZ.remove(l);
            if (exploreTopicAwemeListResponseRemove != null && (list = exploreTopicAwemeListResponseRemove.items) != null && !list.isEmpty()) {
                LIZIZ(l.longValue(), exploreTopicAwemeListResponseRemove, EnumC1841880y1y.FALLBACK);
            }
        }
    }

    public static ExploreTopicAwemeListResponse LJIIIZ(Long l) {
        if (l != null) {
            l.longValue();
            return LLILZ.get(l);
        }
        return null;
    }

    public static boolean LJIILJJIL(Long l) {
        boolean z = false;
        if (l != null) {
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = LLILZ.get(Long.valueOf(l.longValue()));
            if (exploreTopicAwemeListResponse != null) {
                List<Aweme> list = exploreTopicAwemeListResponse.items;
                if (list == null || list.isEmpty()) {
                    z = true;
                }
                return !z;
            }
        }
        return false;
    }

    public static void LJIJ(long j) {
        LLILLL.remove(Long.valueOf(j));
        LLILZ.remove(Long.valueOf(j));
        synchronized (LLJ) {
            try {
                LLJ.remove(Long.valueOf(j));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            LJIIJ().LIZ(LJIJJLI(j));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS70S0100100_18 awS70S0100100_18 = new AwS70S0100100_18(j, th2, 2);
            c2153908cD.getClass();
            C2153908cD.LIZ("explore_topic_feed_cache", awS70S0100100_18);
        }
    }

    public static String LJIJJLI(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_topic_feed_data_");
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIL(long j) {
        if (j <= 0 || !C288840BTu.LIZ()) {
            return;
        }
        synchronized (LLJ) {
            try {
                LLJ.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final ExploreTopicAwemeListResponse LJI(Long l) {
        if (l != null) {
            l.longValue();
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = LLILZ.get(l);
            if (exploreTopicAwemeListResponse != null) {
                return exploreTopicAwemeListResponse;
            }
            LJIILL(l.longValue());
            return (ExploreTopicAwemeListResponse) ((LinkedHashMap) LLILLL).get(l);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(boolean r19) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15T8.LJIIL(boolean):boolean");
    }

    public final void LJIILL(long j) {
        boolean zContainsKey;
        List<Aweme> list;
        if (j <= 0 || !C288840BTu.LIZ() || LLILLL.containsKey(Long.valueOf(j))) {
            return;
        }
        LJ();
        synchronized (LLJ) {
            try {
                zContainsKey = LLJ.containsKey(Long.valueOf(j));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!zContainsKey) {
            return;
        }
        String str = "";
        try {
            String string = LJIIJ().getString(LJIJJLI(j), "");
            if (string != null) {
                str = string;
            }
            if (str.length() != 0) {
                ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = (ExploreTopicAwemeListResponse) C09C2.LIZ().LJII(str, ExploreTopicAwemeListResponse.class);
                if (exploreTopicAwemeListResponse != null && (list = exploreTopicAwemeListResponse.items) != null && !list.isEmpty()) {
                    LLILLL.put(Long.valueOf(j), exploreTopicAwemeListResponse);
                    return;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            C020U c020u = new C020U(j, th2, 7);
            c2153908cD.getClass();
            C2153908cD.LIZ("explore_topic_feed_cache", c020u);
        }
        synchronized (LLJ) {
            try {
                LLJ.remove(Long.valueOf(j));
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        try {
            LJIIJ().LIZ(LJIJJLI(j));
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
    }

    public final void LJIJJ(Collection<Long> collection) {
        ArrayList arrayList;
        if (!C288840BTu.LIZ() || ((ArrayList) collection).isEmpty()) {
            return;
        }
        LJ();
        Set setLLIIJI = C13LP.LLIIJI(collection);
        synchronized (LLJ) {
            try {
                Set<Long> setKeySet = LLJ.keySet();
                arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (!setLLIIJI.contains(Long.valueOf(((Number) obj).longValue()))) {
                        arrayList.add(obj);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            LL.getClass();
            LJIJ(jLongValue);
        }
        LJIILLIIL();
    }

    public static void LIZ(int i, ExploreAwemeList exploreAwemeList) {
        Long l;
        long jLongValue;
        Long l2;
        PreloadInfo preloadInfo;
        List<ExplorePostItem> list = exploreAwemeList.items;
        if (list != null && !list.isEmpty()) {
            int iIntValue = ((Number) C0AHC.LIZ.getValue()).intValue();
            if (1 <= iIntValue && iIntValue < list.size()) {
                exploreAwemeList.items = new ArrayList(list.subList(0, iIntValue));
            }
            C15UU.LIZ.getClass();
            if (C15UU.LIZLLL(i)) {
                EnumC1568370qup enumC1568370qup = EnumC1568370qup.SERVER_PREFETCH;
                if (i == enumC1568370qup.getValue() && ((preloadInfo = exploreAwemeList.preloadInfo) == null || !Intrinsics.LJFF(preloadInfo.preloadStatus, Boolean.TRUE))) {
                    return;
                }
                if (i == enumC1568370qup.getValue()) {
                    C15TA.LIZ.getClass();
                    if (C15TA.LJJIJLIJ == null) {
                        C15TA.LJJIJLIJ = exploreAwemeList.getRequestId();
                    }
                }
                LJIIIIZZ().LIZJ("key_cache_explore_preload_once", 1);
                if (((ExploreFirstPreloadVideoConfig) C1868410yil.LIZIZ.getValue()).isPrefetchDataEnable() && list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ExplorePostItem> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Aweme aweme = it2.next().aweme;
                        if (aweme != null) {
                            arrayList.add(aweme);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C01GW c01gw = C1868410yil.LIZIZ;
                        int i2 = ((ExploreFirstPreloadVideoConfig) c01gw.getValue()).preloadVideoCount;
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        int i3 = ((ExploreFirstPreloadVideoConfig) c01gw.getValue()).preloadAudioSizeKBs;
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        Set<String> set = C591510NHx.LIZ;
                        if (!arrayList.isEmpty() && i2 > 0) {
                            C823050WQl.LIZLLL().submit(new ARunnableS1S0102000_3(arrayList, i2, i3, 2));
                        }
                    }
                }
                if (C20524515Sx.LIZ().enablePreload) {
                    if (i == EnumC1568370qup.SERVER_PREFETCH.getValue()) {
                        PreloadInfo preloadInfo2 = exploreAwemeList.preloadInfo;
                        if (preloadInfo2 != null && (l2 = preloadInfo2.preloadTtl) != null && l2.longValue() > 0) {
                            jLongValue = l2.longValue();
                        } else {
                            return;
                        }
                    } else {
                        jLongValue = ((Number) C276710Asv.LIZ.getValue()).longValue();
                    }
                    ((ExploreDataLruPool) C20524715Sz.LIZ.getValue()).LJIIIIZZ(jLongValue, exploreAwemeList);
                } else {
                    PreloadInfo preloadInfo3 = exploreAwemeList.preloadInfo;
                    if (preloadInfo3 != null && (l = preloadInfo3.preloadTtl) != null && l.longValue() > 0) {
                        long jLongValue2 = l.longValue();
                        if (C276730Asx.LIZ()) {
                            LL.getClass();
                            LJIIIIZZ().LJIIIIZZ("key_cache_explore_ttl", jLongValue2);
                            LJIIIIZZ().LIZJ("key_last_clear_reason", -1);
                        } else {
                            LL.getClass();
                            LJII().storeLong("key_cache_explore_ttl", jLongValue2);
                        }
                    }
                    if (C276730Asx.LIZ()) {
                        LJIIIIZZ().LJIIIIZZ("key_cache_explore_timestamp", System.currentTimeMillis());
                        LJIIIIZZ().LIZJ("key_last_clear_reason", -1);
                    } else {
                        LJII().storeLong("key_cache_explore_timestamp", System.currentTimeMillis());
                    }
                }
            }
            LLILLJJLI = exploreAwemeList;
            C823050WQl.LIZLLL().execute(new ARunnableS131S0100000_31(exploreAwemeList, 183));
        }
    }

    public static void LJIIZILJ(long j, ExploreAwemeList exploreAwemeList) {
        List<ExplorePostItem> list;
        if (C294800Bh0.LIZ() && (list = exploreAwemeList.items) != null && !list.isEmpty()) {
            Map<Long, ExploreAwemeList> map = LLIZ;
            synchronized (map) {
                try {
                    map.put(Long.valueOf(j), exploreAwemeList);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LIZIZ(final long j, ExploreTopicAwemeListResponse exploreTopicAwemeListResponse, EnumC1841880y1y enumC1841880y1y) {
        List<Aweme> list;
        if (j > 0 && exploreTopicAwemeListResponse != null && (list = exploreTopicAwemeListResponse.items) != null && !list.isEmpty()) {
            if (enumC1841880y1y == EnumC1841880y1y.PREFETCH) {
                LLILZ.put(Long.valueOf(j), exploreTopicAwemeListResponse);
                return;
            }
            LLILLL.put(Long.valueOf(j), exploreTopicAwemeListResponse);
            if (!C288840BTu.LIZ()) {
                return;
            }
            LJIL(j);
            LIZLLL();
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.15T9
                public final void LIZ() {
                    C15T8 c15t8 = C15T8.LL;
                    long j2 = j;
                    c15t8.getClass();
                    try {
                        C15T8.LIZLLL();
                        Map<Long, ExploreTopicAwemeListResponse> map = C15T8.LLILLL;
                        synchronized (map) {
                            try {
                                ExploreTopicAwemeListResponse exploreTopicAwemeListResponse2 = (ExploreTopicAwemeListResponse) ((LinkedHashMap) map).get(Long.valueOf(j2));
                                if (exploreTopicAwemeListResponse2 == null) {
                                    return;
                                }
                                List<Aweme> list2 = exploreTopicAwemeListResponse2.items;
                                if (list2 == null) {
                                    return;
                                }
                                if (list2.isEmpty()) {
                                    return;
                                }
                                ArrayList arrayList = list2.size() > 12 ? new ArrayList(list2.subList(0, 12)) : new ArrayList(list2);
                                ExploreTopicAwemeListResponse exploreTopicAwemeListResponse3 = new ExploreTopicAwemeListResponse();
                                exploreTopicAwemeListResponse3.items = arrayList;
                                exploreTopicAwemeListResponse3.setRequestId(exploreTopicAwemeListResponse2.getRequestId());
                                exploreTopicAwemeListResponse3.logPb = exploreTopicAwemeListResponse2.logPb;
                                exploreTopicAwemeListResponse3.hasMore = exploreTopicAwemeListResponse2.hasMore;
                                exploreTopicAwemeListResponse3.topBanner = exploreTopicAwemeListResponse2.topBanner;
                                C15T8.LJIIJ().LIZIZ(C15T8.LJIJJLI(j2), C09C2.LIZ().LJIILL(exploreTopicAwemeListResponse3));
                                C15T8.LJIILLIIL();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C2153908cD c2153908cD = C2153908cD.LIZ;
                        C020U c020u = new C020U(j2, th2, 6);
                        c2153908cD.getClass();
                        C2153908cD.LIZ("explore_topic_feed_cache", c020u);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExploreMetadataCache@f72f.cacheExploreTopicAwemeList$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExploreMetadataCache@f72f.cacheExploreTopicAwemeList$1");
                }
            });
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            LJII().storeString("key_cache_explore_list", null);
            LJII().storeBoolean("key_cache_explore_available", false);
            LJIJI(this, EnumC1782540wUG.ACCOUNT_OPERATION.getValue(), String.valueOf(i), 0L, 4);
            LLILLJJLI = null;
            ((LinkedHashMap) LLILLL).clear();
            LLILZ.clear();
            synchronized (LLJ) {
                try {
                    LLJ.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            LLJI = false;
            LLILZLL = null;
            LLILZIL = null;
            Map<Long, ExploreAwemeList> map = LLIZ;
            synchronized (map) {
                try {
                    ((LinkedHashMap) map).clear();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(X.C15T8 r9, final int r10, final java.lang.String r11, long r12, int r14) {
        /*
            r0 = r14 & 2
            java.lang.String r3 = ""
            if (r0 == 0) goto L7
            r11 = r3
        L7:
            r0 = r14 & 4
            r1 = 0
            if (r0 == 0) goto Lf
            r12 = 0
        Lf:
            r9.getClass()
            boolean r0 = X.C276730Asx.LIZ()
            r9 = 0
            java.lang.String r5 = "key_cache_explore_timestamp"
            if (r0 == 0) goto La9
            X.0Ogt r0 = LJIIIIZZ()
            long r6 = r0.getLong(r5, r1)
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            long r6 = r8.longValue()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto La9
        L2f:
            com.bytedance.keva.Keva r0 = LJII()
            long r6 = r0.getLong(r5, r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            long r6 = r4.longValue()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L44
            r9 = r4
        L44:
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4f
            if (r8 != 0) goto La7
            r0 = r9
        L4b:
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L4f:
            com.bytedance.keva.Keva r0 = LJII()
            r0.storeLong(r5, r1)
            com.bytedance.keva.Keva r0 = LJII()
            java.lang.String r4 = "key_cache_explore_ttl"
            r0.storeLong(r4, r1)
            if (r8 == 0) goto L9c
            X.0wUG r0 = X.EnumC1782540wUG.ACCOUNT_OPERATION
            int r0 = r0.getValue()
            if (r10 == r0) goto L88
            X.0Ogt r0 = LJIIIIZZ()
            r0.LJIIIIZZ(r5, r1)
            X.0Ogt r0 = LJIIIIZZ()
            r0.LJIIIIZZ(r4, r1)
            X.0Ogt r1 = LJIIIIZZ()
            java.lang.String r0 = "key_last_clear_reason"
            r1.LIZJ(r0, r10)
            X.0UDb r0 = new X.0UDb
            r0.<init>(r10, r11, r3)
            X.C20532515Vz.LIZ(r0)
        L88:
            com.ss.android.ugc.aweme.explore.experiment.ExploreLruCacheConfig r0 = X.C20524515Sx.LIZ()
            boolean r0 = r0.enablePreload
            if (r0 == 0) goto L9b
            X.01GW r0 = X.C20524715Sz.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.explore.data.ExploreDataLruPool r0 = (com.ss.android.ugc.aweme.explore.data.ExploreDataLruPool) r0
            r0.LJIIJ()
        L9b:
            return
        L9c:
            if (r9 == 0) goto L88
            X.0UDb r0 = new X.0UDb
            r0.<init>(r10, r11, r3)
            X.C20532515Vz.LIZ(r0)
            goto L88
        La7:
            r0 = r8
            goto L4b
        La9:
            r8 = r9
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15T8.LJIJI(X.15T8, int, java.lang.String, long, int):void");
    }
}
