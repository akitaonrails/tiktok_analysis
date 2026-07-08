package X;

import Y.ARunnableS100S0200000_31;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreDataLruPool;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20524315Sv implements InterfaceC586170Myt {
    public static final C20524315Sv LL;
    public static final ReentrantLock LLILLJJLI;
    public static volatile ExploreAwemeList LLILLL;
    public static volatile List<ExploreCardInsertResultStruct> LLILZ;
    public static volatile List<String> LLILZIL;

    static {
        C20524315Sv c20524315Sv = new C20524315Sv();
        LL = c20524315Sv;
        LLILLJJLI = new ReentrantLock();
        LLILZIL = new CopyOnWriteArrayList();
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(c20524315Sv);
        C1906580ziK.LIZJ().LIZJ().LJJLJLI(new C09JN() { // from class: X.0CNV
            /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.String r2 = "ExploreUnconsumedDataCache@fc7.<init>$1"
                    X.C1C7U.LIZ(r2)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r0 = r4.booleanValue()
                    if (r0 == 0) goto L40
                    X.01GW r0 = X.C278050Av5.LIZ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L34
                    X.15Sv r0 = X.C20524315Sv.LL
                    r0.getClass()
                    X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Throwable -> L30
                    r0.getClass()     // Catch: java.lang.Throwable -> L30
                    android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: java.lang.Throwable -> L30
                    boolean r0 = X.C2188561Al4.LJIIJ(r0)     // Catch: java.lang.Throwable -> L30
                    if (r0 == 0) goto L34
                    goto L3e
                L30:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L34:
                    java.util.concurrent.ExecutorService r1 = X.C823050WQl.LIZLLL()
                    X.0CNW r0 = new java.lang.Runnable() { // from class: X.0CNW
                        static {
                            /*
                                X.0CNW r0 = new X.0CNW
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:X.0CNW) X.0CNW.LL X.0CNW
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0CNW.<clinit>():void");
                        }

                        {
                            /*
                                r0 = this;
                                r0.<init>()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0CNW.<init>():void");
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                r3 = this;
                                java.lang.String r2 = "ExploreUnconsumedDataCache@fc7.<init>$1$2"
                                X.C1C7U.LIZ(r2)
                                X.15Sv r0 = X.C20524315Sv.LL     // Catch: java.lang.Throwable -> Le
                                r0.getClass()     // Catch: java.lang.Throwable -> Le
                                X.C20524315Sv.LJII()     // Catch: java.lang.Throwable -> Le
                                goto L19
                            Le:
                                r1 = move-exception
                                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                                boolean r0 = X.C2179971ATj.LIZ(r1)
                                if (r0 != 0) goto L19
                                throw r1
                            L19:
                                X.C1C7U.LIZIZ(r2)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0CNW.run():void");
                        }
                    }
                    r1.execute(r0)
                    goto L40
                L3e:
                    X.08cD r0 = X.C2153908cD.LIZ
                L40:
                    X.C1C7U.LIZIZ(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0CNV.accept(java.lang.Object):void");
            }
        });
    }

    public static ExploreAwemeList LIZ() {
        ReentrantLock reentrantLock = LLILLJJLI;
        reentrantLock.lock();
        try {
            ExploreAwemeList exploreAwemeList = LLILLL;
            reentrantLock.unlock();
            return exploreAwemeList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static InterfaceC625970Ogt LIZIZ() {
        return C2192401ArG.LIZ(C589170N8x.LIZ("explore"), "explore_unconsumed_cache");
    }

    public static boolean LJ() {
        List<ExplorePostItem> list;
        List<ExplorePostItem> list2;
        ExplorePostItem explorePostItem;
        Aweme aweme;
        ExploreAwemeList exploreAwemeList = LLILLL;
        if (exploreAwemeList == null || (list = exploreAwemeList.items) == null || LLILZIL.size() != list.size()) {
            return false;
        }
        int i = 0;
        for (String str : LLILZIL) {
            int i2 = i + 1;
            String aid = null;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            ExploreAwemeList exploreAwemeList2 = LLILLL;
            if (exploreAwemeList2 != null && (list2 = exploreAwemeList2.items) != null && (explorePostItem = (ExplorePostItem) C13LP.LJJJLZIJ(i, list2)) != null && (aweme = explorePostItem.aweme) != null) {
                aid = aweme.getAid();
            }
            if (!Intrinsics.LJFF(str, aid)) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public static final boolean LIZJ() {
        if (C20524515Sx.LIZ().enableFakeRefresh) {
            if (!C20323014fc.LIZ().enable || !C20323014fc.LIZ().enableLaunchRefresh) {
                return false;
            }
            if (((ExploreDataLruPool) C20524615Sy.LIZ.getValue()).LIZLLL(false)) {
                return true;
            }
        }
        return LIZLLL("refresh", false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.util.List<com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.ss.android.ugc.aweme.explore.data.ExploreAwemeList] */
    public static void LJII() {
        List<ExplorePostItem> listSubList;
        if (C20323014fc.LIZ().enable) {
            if (C20323014fc.LIZ().enableLaunchRefresh || C0B1W.LIZ()) {
                C259800zU c259800zU = new C259800zU();
                C259800zU c259800zU2 = new C259800zU();
                ReentrantLock reentrantLock = LLILLJJLI;
                reentrantLock.lock();
                try {
                    if (LLILLL != null) {
                        LL.getClass();
                        if (!LJ()) {
                            ?? r4 = LLILLL;
                            if (r4 == 0) {
                                reentrantLock.unlock();
                                return;
                            }
                            c259800zU.element = r4;
                            List<ExplorePostItem> list = r4.items;
                            if (list != null) {
                                int i = C20323014fc.LIZ().maxCacheCnt;
                                List<ExplorePostItem> list2 = ((ExploreAwemeList) c259800zU.element).items;
                                listSubList = list.subList(0, Math.min(i, list2 != null ? list2.size() : 0));
                            } else {
                                listSubList = null;
                            }
                            r4.items = listSubList;
                            c259800zU2.element = LLILZ;
                            reentrantLock.unlock();
                            C823050WQl.LIZLLL().execute(new ARunnableS100S0200000_31(c259800zU, c259800zU2, 75));
                            return;
                        }
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
    }

    public static void LJFF(ExploreAwemeList exploreAwemeList) {
        if (!C20323014fc.LIZ().enable || exploreAwemeList.LLILZLL) {
            return;
        }
        ExploreAwemeList exploreAwemeList2 = new ExploreAwemeList();
        ArrayList arrayList = new ArrayList();
        exploreAwemeList2.items = arrayList;
        Collection collection = exploreAwemeList.items;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        arrayList.addAll(collection);
        exploreAwemeList2.logPb = exploreAwemeList.logPb;
        exploreAwemeList2.setRequestId(exploreAwemeList.getRequestId());
        exploreAwemeList2.hasMore = exploreAwemeList.hasMore;
        exploreAwemeList2.algoMap = exploreAwemeList.algoMap;
        exploreAwemeList2.cards = exploreAwemeList.cards;
        if (C20524515Sx.LIZ().enableFakeRefresh) {
            ((ExploreDataLruPool) C20524615Sy.LIZ.getValue()).LJIIIIZZ(C20323014fc.LIZ().expireTime, exploreAwemeList2);
        }
        ReentrantLock reentrantLock = LLILLJJLI;
        reentrantLock.lock();
        try {
            LLILLL = exploreAwemeList2;
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void LJI(ExploreAwemeList exploreAwemeList) {
        if (exploreAwemeList.cards == null) {
            return;
        }
        ReentrantLock reentrantLock = LLILLJJLI;
        reentrantLock.lock();
        try {
            LLILZ = exploreAwemeList.cards;
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static boolean LIZLLL(final String str, boolean z, boolean z2) {
        int size;
        EnumC1779040wOc enumC1779040wOc;
        List<ExplorePostItem> list;
        List<ExplorePostItem> list2;
        int size2;
        EnumC1779040wOc enumC1779040wOc2;
        int size3;
        EnumC1779040wOc enumC1779040wOc3;
        int size4;
        EnumC1779040wOc enumC1779040wOc4;
        final boolean z3 = false;
        if (!C20323014fc.LIZ().enable) {
            return false;
        }
        if (z2) {
            if (!C20323014fc.LIZ().enableLaunchRefresh) {
                return false;
            }
        } else if (!C20323014fc.LIZ().enableManualRefresh) {
            return false;
        }
        Integer numValueOf = null;
        if (C20524515Sx.LIZ().enableFakeRefresh) {
            ReentrantLock reentrantLock = LLILLJJLI;
            reentrantLock.lock();
            try {
                ExploreAwemeList exploreAwemeList = LLILLL;
                reentrantLock.unlock();
                if (exploreAwemeList != null && exploreAwemeList.LLILZLL) {
                    int i = C20323014fc.LIZ().validModelCnt;
                    List<ExplorePostItem> list3 = exploreAwemeList.items;
                    if (list3 != null) {
                        size4 = list3.size();
                    } else {
                        size4 = 0;
                    }
                    if (size4 >= i) {
                        z3 = true;
                    }
                    if (z) {
                        if (z3) {
                            enumC1779040wOc4 = EnumC1779040wOc.SUCCESS;
                        } else {
                            enumC1779040wOc4 = EnumC1779040wOc.NO_ENOUGH_CACHE;
                        }
                        final int value = enumC1779040wOc4.getValue();
                        C20532515Vz.LIZ(new C15W0(z3, str, value) { // from class: X.00HK
                            public final boolean LIZ;
                            public final String LIZIZ;
                            public final int LIZJ;

                            @Override // X.C15W0
                            public final Map<String, String> LIZ() {
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("is_success", this.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                                pairArr[1] = new Pair(Scene.SCENE_SERVICE, this.LIZIZ);
                                pairArr[2] = new Pair("invalid_reason", String.valueOf(this.LIZJ));
                                return C2097608Jq.LJIIIIZZ(pairArr);
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C00HK)) {
                                    return false;
                                }
                                C00HK c00hk = (C00HK) obj;
                                return this.LIZ == c00hk.LIZ && Intrinsics.LJFF(this.LIZIZ, c00hk.LIZIZ) && this.LIZJ == c00hk.LIZJ;
                            }

                            @Override // X.C15W0
                            public final String getEventName() {
                                return "explore_fake_refresh_result";
                            }

                            public final int hashCode() {
                                return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("FakeRefreshET(isSuccess=");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(", scene=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", failureReason=");
                                sbLIZ.append(this.LIZJ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            {
                                this.LIZ = z3;
                                this.LIZIZ = str;
                                this.LIZJ = value;
                            }
                        });
                    }
                    return z3;
                }
                ExploreAwemeList exploreAwemeListLJII = ((ExploreDataLruPool) C20524615Sy.LIZ.getValue()).LJII();
                if (exploreAwemeListLJII != null) {
                    List<ExplorePostItem> list4 = exploreAwemeListLJII.items;
                    if (list4 != null) {
                        Iterator<ExplorePostItem> it2 = list4.iterator();
                        while (it2.hasNext()) {
                            Aweme aweme = it2.next().aweme;
                            if (aweme == null || aweme.getAid() == null) {
                                C2153908cD.LIZ.getClass();
                                C2153908cD.LIZJ(6, "illegal Aweme need del (lru)", "hyppp");
                                break;
                            }
                        }
                        C19719612Di.LJJIIJ(list4, AFwS274S0000000_30.get$arr$(335), true);
                    }
                    int i2 = C20323014fc.LIZ().validModelCnt;
                    List<ExplorePostItem> list5 = exploreAwemeListLJII.items;
                    if (list5 != null) {
                        size3 = list5.size();
                    } else {
                        size3 = 0;
                    }
                    if (size3 >= i2) {
                        z3 = true;
                        exploreAwemeListLJII.LLILZLL = true;
                        reentrantLock = LLILLJJLI;
                        reentrantLock.lock();
                        try {
                            LLILLL = exploreAwemeListLJII;
                            reentrantLock.unlock();
                            C584850Mwl.LIZ.LJI(exploreAwemeListLJII.getRequestId(), exploreAwemeListLJII.logPb);
                        } finally {
                        }
                    }
                    if (z) {
                        if (z3) {
                            enumC1779040wOc3 = EnumC1779040wOc.SUCCESS;
                        } else {
                            enumC1779040wOc3 = EnumC1779040wOc.NO_ENOUGH_CACHE;
                        }
                        final int value2 = enumC1779040wOc3.getValue();
                        C20532515Vz.LIZ(new C15W0(z3, str, value2) { // from class: X.00HK
                            public final boolean LIZ;
                            public final String LIZIZ;
                            public final int LIZJ;

                            @Override // X.C15W0
                            public final Map<String, String> LIZ() {
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("is_success", this.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                                pairArr[1] = new Pair(Scene.SCENE_SERVICE, this.LIZIZ);
                                pairArr[2] = new Pair("invalid_reason", String.valueOf(this.LIZJ));
                                return C2097608Jq.LJIIIIZZ(pairArr);
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C00HK)) {
                                    return false;
                                }
                                C00HK c00hk = (C00HK) obj;
                                return this.LIZ == c00hk.LIZ && Intrinsics.LJFF(this.LIZIZ, c00hk.LIZIZ) && this.LIZJ == c00hk.LIZJ;
                            }

                            @Override // X.C15W0
                            public final String getEventName() {
                                return "explore_fake_refresh_result";
                            }

                            public final int hashCode() {
                                return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("FakeRefreshET(isSuccess=");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(", scene=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", failureReason=");
                                sbLIZ.append(this.LIZJ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            {
                                this.LIZ = z3;
                                this.LIZIZ = str;
                                this.LIZJ = value2;
                            }
                        });
                    }
                    return z3;
                }
            } finally {
            }
        }
        ReentrantLock reentrantLock2 = LLILLJJLI;
        reentrantLock2.lock();
        try {
            ExploreAwemeList exploreAwemeList2 = LLILLL;
            reentrantLock2.unlock();
            if (exploreAwemeList2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("iscachevalida ");
                List<ExplorePostItem> list6 = exploreAwemeList2.items;
                if (list6 != null) {
                    numValueOf = Integer.valueOf(list6.size());
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                List<ExplorePostItem> list7 = exploreAwemeList2.items;
                if (list7 != null) {
                    size2 = list7.size();
                } else {
                    size2 = 0;
                }
                if (size2 >= C20323014fc.LIZ().validModelCnt) {
                    z3 = true;
                }
                if (z && !exploreAwemeList2.LLILZLL) {
                    if (z3) {
                        enumC1779040wOc2 = EnumC1779040wOc.SUCCESS;
                    } else {
                        enumC1779040wOc2 = EnumC1779040wOc.NO_ENOUGH_CACHE;
                    }
                    final int value3 = enumC1779040wOc2.getValue();
                    C20532515Vz.LIZ(new C15W0(z3, str, value3) { // from class: X.00HK
                        public final boolean LIZ;
                        public final String LIZIZ;
                        public final int LIZJ;

                        @Override // X.C15W0
                        public final Map<String, String> LIZ() {
                            Pair[] pairArr = new Pair[3];
                            pairArr[0] = new Pair("is_success", this.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                            pairArr[1] = new Pair(Scene.SCENE_SERVICE, this.LIZIZ);
                            pairArr[2] = new Pair("invalid_reason", String.valueOf(this.LIZJ));
                            return C2097608Jq.LJIIIIZZ(pairArr);
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C00HK)) {
                                return false;
                            }
                            C00HK c00hk = (C00HK) obj;
                            return this.LIZ == c00hk.LIZ && Intrinsics.LJFF(this.LIZIZ, c00hk.LIZIZ) && this.LIZJ == c00hk.LIZJ;
                        }

                        @Override // X.C15W0
                        public final String getEventName() {
                            return "explore_fake_refresh_result";
                        }

                        public final int hashCode() {
                            return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
                        }

                        public final String toString() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("FakeRefreshET(isSuccess=");
                            sbLIZ2.append(this.LIZ);
                            sbLIZ2.append(", scene=");
                            sbLIZ2.append(this.LIZIZ);
                            sbLIZ2.append(", failureReason=");
                            sbLIZ2.append(this.LIZJ);
                            sbLIZ2.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        {
                            this.LIZ = z3;
                            this.LIZIZ = str;
                            this.LIZJ = value3;
                        }
                    });
                }
            } else {
                long j = LIZIZ().getLong("key_cache_explore_timestamp", 0L);
                if (j <= 0) {
                    if (z) {
                        final int value4 = EnumC1779040wOc.NO_CACHE.getValue();
                        C20532515Vz.LIZ(new C15W0(z3, str, value4) { // from class: X.00HK
                            public final boolean LIZ;
                            public final String LIZIZ;
                            public final int LIZJ;

                            @Override // X.C15W0
                            public final Map<String, String> LIZ() {
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("is_success", this.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                                pairArr[1] = new Pair(Scene.SCENE_SERVICE, this.LIZIZ);
                                pairArr[2] = new Pair("invalid_reason", String.valueOf(this.LIZJ));
                                return C2097608Jq.LJIIIIZZ(pairArr);
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C00HK)) {
                                    return false;
                                }
                                C00HK c00hk = (C00HK) obj;
                                return this.LIZ == c00hk.LIZ && Intrinsics.LJFF(this.LIZIZ, c00hk.LIZIZ) && this.LIZJ == c00hk.LIZJ;
                            }

                            @Override // X.C15W0
                            public final String getEventName() {
                                return "explore_fake_refresh_result";
                            }

                            public final int hashCode() {
                                return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
                            }

                            public final String toString() {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("FakeRefreshET(isSuccess=");
                                sbLIZ2.append(this.LIZ);
                                sbLIZ2.append(", scene=");
                                sbLIZ2.append(this.LIZIZ);
                                sbLIZ2.append(", failureReason=");
                                sbLIZ2.append(this.LIZJ);
                                sbLIZ2.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ2);
                            }

                            {
                                this.LIZ = z3;
                                this.LIZIZ = str;
                                this.LIZJ = value4;
                            }
                        });
                        reentrantLock2.lock();
                        try {
                            ExploreAwemeList exploreAwemeList3 = new ExploreAwemeList();
                            exploreAwemeList3.LLILZLL = true;
                            LLILLL = exploreAwemeList3;
                            reentrantLock2.unlock();
                            return false;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                            reentrantLock2.unlock();
                        }
                    }
                } else if (System.currentTimeMillis() - j >= TimeUnit.SECONDS.toMillis(C20323014fc.LIZ().expireTime)) {
                    if (z) {
                        final int value5 = EnumC1779040wOc.EXPIRED.getValue();
                        C20532515Vz.LIZ(new C15W0(z3, str, value5) { // from class: X.00HK
                            public final boolean LIZ;
                            public final String LIZIZ;
                            public final int LIZJ;

                            @Override // X.C15W0
                            public final Map<String, String> LIZ() {
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("is_success", this.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                                pairArr[1] = new Pair(Scene.SCENE_SERVICE, this.LIZIZ);
                                pairArr[2] = new Pair("invalid_reason", String.valueOf(this.LIZJ));
                                return C2097608Jq.LJIIIIZZ(pairArr);
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C00HK)) {
                                    return false;
                                }
                                C00HK c00hk = (C00HK) obj;
                                return this.LIZ == c00hk.LIZ && Intrinsics.LJFF(this.LIZIZ, c00hk.LIZIZ) && this.LIZJ == c00hk.LIZJ;
                            }

                            @Override // X.C15W0
                            public final String getEventName() {
                                return "explore_fake_refresh_result";
                            }

                            public final int hashCode() {
                                return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
                            }

                            public final String toString() {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("FakeRefreshET(isSuccess=");
                                sbLIZ2.append(this.LIZ);
                                sbLIZ2.append(", scene=");
                                sbLIZ2.append(this.LIZIZ);
                                sbLIZ2.append(", failureReason=");
                                sbLIZ2.append(this.LIZJ);
                                sbLIZ2.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ2);
                            }

                            {
                                this.LIZ = z3;
                                this.LIZIZ = str;
                                this.LIZJ = value5;
                            }
                        });
                        reentrantLock2.lock();
                        try {
                            ExploreAwemeList exploreAwemeList4 = new ExploreAwemeList();
                            exploreAwemeList4.LLILZLL = true;
                            LLILLL = exploreAwemeList4;
                            reentrantLock2.unlock();
                            return false;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                            reentrantLock2.unlock();
                        }
                    }
                } else {
                    ExploreAwemeList exploreAwemeList5 = (ExploreAwemeList) GsonProtectorUtils.fromJson(C09C2.LIZ(), LIZIZ().getString("key_cache_explore_list", ""), ExploreAwemeList.class);
                    if (exploreAwemeList5 != null) {
                        List<ExplorePostItem> list8 = exploreAwemeList5.items;
                        if (list8 != null) {
                            Iterator<ExplorePostItem> it3 = list8.iterator();
                            while (it3.hasNext()) {
                                Aweme aweme2 = it3.next().aweme;
                                if (aweme2 == null || aweme2.getAid() == null) {
                                    C2153908cD.LIZ.getClass();
                                    C2153908cD.LIZJ(6, "illegal Aweme need del", "hyppp");
                                    break;
                                }
                            }
                            C19719612Di.LJJIIJ(list8, AFwS274S0000000_30.get$arr$(336), true);
                        }
                        exploreAwemeList5.LLILZLL = true;
                        ReentrantLock reentrantLock3 = LLILLJJLI;
                        reentrantLock3.lock();
                        try {
                            LLILLL = exploreAwemeList5;
                            reentrantLock3.unlock();
                            C584850Mwl.LIZ.LJI(exploreAwemeList5.getRequestId(), exploreAwemeList5.logPb);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                            reentrantLock3.unlock();
                        }
                    } else {
                        exploreAwemeList5 = null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("iscachevalidb ");
                    if (exploreAwemeList5 != null && (list2 = exploreAwemeList5.items) != null) {
                        numValueOf = Integer.valueOf(list2.size());
                    }
                    sbLIZ2.append(numValueOf);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    try {
                        List<ExploreCardInsertResultStruct> list9 = (List) C09C2.LIZ().LJIIIIZZ(LIZIZ().getString("key_cache_explore_cards", ""), new TypeToken<List<? extends ExploreCardInsertResultStruct>>() { // from class: X.15Sw
                        }.getType());
                        ReentrantLock reentrantLock4 = LLILLJJLI;
                        reentrantLock4.lock();
                        try {
                            LLILZ = list9;
                            reentrantLock4.unlock();
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                            reentrantLock4.unlock();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (exploreAwemeList5 != null && (list = exploreAwemeList5.items) != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    if (size >= C20323014fc.LIZ().validModelCnt) {
                        z3 = true;
                    }
                    if (z) {
                        if (z3) {
                            enumC1779040wOc = EnumC1779040wOc.SUCCESS;
                        } else {
                            enumC1779040wOc = EnumC1779040wOc.NO_ENOUGH_CACHE;
                        }
                        final int value6 = enumC1779040wOc.getValue();
                        C20532515Vz.LIZ(new C15W0(z3, str, value6) { // from class: X.00HK
                            public final boolean LIZ;
                            public final String LIZIZ;
                            public final int LIZJ;

                            @Override // X.C15W0
                            public final Map<String, String> LIZ() {
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("is_success", this.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                                pairArr[1] = new Pair(Scene.SCENE_SERVICE, this.LIZIZ);
                                pairArr[2] = new Pair("invalid_reason", String.valueOf(this.LIZJ));
                                return C2097608Jq.LJIIIIZZ(pairArr);
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C00HK)) {
                                    return false;
                                }
                                C00HK c00hk = (C00HK) obj;
                                return this.LIZ == c00hk.LIZ && Intrinsics.LJFF(this.LIZIZ, c00hk.LIZIZ) && this.LIZJ == c00hk.LIZJ;
                            }

                            @Override // X.C15W0
                            public final String getEventName() {
                                return "explore_fake_refresh_result";
                            }

                            public final int hashCode() {
                                return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
                            }

                            public final String toString() {
                                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                sbLIZ22.append("FakeRefreshET(isSuccess=");
                                sbLIZ22.append(this.LIZ);
                                sbLIZ22.append(", scene=");
                                sbLIZ22.append(this.LIZIZ);
                                sbLIZ22.append(", failureReason=");
                                sbLIZ22.append(this.LIZJ);
                                sbLIZ22.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ22);
                            }

                            {
                                this.LIZ = z3;
                                this.LIZIZ = str;
                                this.LIZJ = value6;
                            }
                        });
                        return z3;
                    }
                }
            }
            return z3;
        } finally {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock2.unlock();
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            ReentrantLock reentrantLock = LLILLJJLI;
            reentrantLock.lock();
            try {
                LLILLL = null;
                LLILZ = null;
                reentrantLock.unlock();
                if (C20524515Sx.LIZ().enableFakeRefresh) {
                    ((ExploreDataLruPool) C20524615Sy.LIZ.getValue()).LJIIJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
