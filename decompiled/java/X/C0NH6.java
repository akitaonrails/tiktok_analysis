package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS109S0100000_9;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.api.FeedCacheForLoadMoreApi;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localcache.IM2LocalCacheService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS152S1100000_3;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NH6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NH6 implements C0NGM, InterfaceC590770NFb {
    public static final C0S4J LJIILLIIL = new C0S4J("GoldenHouse");
    public final C591020NGa LIZ;
    public final C0NGR LIZIZ;
    public C0NGO LIZJ;
    public final AtomicInteger LIZLLL;
    public final HashMap<C0NHJ, C0NHE> LJ;
    public final C0NHL LJFF;
    public final C01GW LJI;
    public final C591400NHm LJII;
    public final C591350NHh LJIIIIZZ;
    public C1DFK LJIIIZ;
    public C1DFK LJIIJ;
    public AnonymousClass0956 LJIIJJI;
    public final ArrayList<C0NHY> LJIIL;
    public final ArrayList<C0NGJ> LJIILIIL;
    public C0NG8 LJIILJJIL;
    public final C0NJD<C0NHK> LJIILL;

    @Override // X.C0NGM
    public final void LIZ() {
        C591400NHm c591400NHm = this.LJII;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c591400NHm, C2107308Nj.LIZ.LLIILII(), null, new C0NH8(this, null), 2);
        EnumC308730C8h.Companion.getClass();
        if (C308750C8j.LIZ().getAutoCleanCache()) {
            C23250099c.LIZLLL(this.LJII, null, null, new C591040NGc(this, null), 3);
        }
    }

    public final C0NHK LJIIJ() {
        return this.LJIILL.LIZ();
    }

    public final int LJIIJJI() {
        List<CacheEntry> list = this.LIZJ.LIZLLL.get().LIZIZ;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<CacheEntry> it2 = list.iterator();
            while (it2.hasNext()) {
                if ((!it2.next().LIZ) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i + this.LIZLLL.get();
    }

    public final void LJIILL() {
        C0NEM.LIZ.LIZJ(this);
        C0NG8 c0ng8 = this.LJIILJJIL;
        if (c0ng8 != null) {
            IM2LocalCacheService iM2LocalCacheService = (IM2LocalCacheService) PluggableExtentionKt.pluggableSpi$default(IM2LocalCacheService.class, false, false, false, 14, null);
            if (iM2LocalCacheService != null) {
                iM2LocalCacheService.LIZJ(c0ng8.LJFF);
            }
            c0ng8.LIZ = false;
            c0ng8.LIZIZ = false;
            c0ng8.LIZJ = false;
            c0ng8.LIZLLL.set(0);
            c0ng8.LJ.set(0L);
        }
        this.LJIILJJIL = null;
        this.LJIIL.clear();
        this.LJIILIIL.clear();
        this.LIZJ.LJIIIIZZ();
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL(this.LJFF);
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0NHE) it2.next()).LIZJ();
        }
        LJIILLIIL.LJIIJJI(AFwS195S0000000_9.get$arr$(502));
        C591400NHm c591400NHm = this.LJII;
        c591400NHm.LLILLL.LIZIZ(null);
        c591400NHm.LLILLL = new C23119094b(c591400NHm.LLILLJJLI);
        this.LJIIJ = new C1DFK(this.LJII.LLILLL);
        this.LJIIIZ = new C1DFK(this.LJII.LLILLL);
        this.LIZJ = new C0NGO(this.LIZ, this.LIZIZ, this);
        this.LJIILL.LIZIZ(C0NHK.UNINITIALIZED);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0NHL] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0NHg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0NGa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0NHl] */
    public C0NH6() {
        ?? r2 = new C0NGH() { // from class: X.0NGa
            @Override // X.C0NGH
            public final void LIZ(List<? extends CacheEntry> list) {
                final boolean z = false;
                if (((C300690BqV.LIZ() >> 0) & 1) == 1) {
                    z = true;
                }
                Collections.sort(list, new Comparator<CacheEntry>() { // from class: X.0NGZ
                    @Override // java.util.Comparator
                    public final int compare(CacheEntry cacheEntry, CacheEntry cacheEntry2) {
                        boolean z2;
                        int iCompare;
                        CacheEntry cacheEntry3 = cacheEntry;
                        CacheEntry cacheEntry4 = cacheEntry2;
                        boolean z3 = false;
                        if (cacheEntry3 == null || cacheEntry4 == null) {
                            return 0;
                        }
                        if (cacheEntry3.LIZ != cacheEntry4.LIZ) {
                            if (!cacheEntry3.LIZ) {
                                return -1;
                            }
                        } else {
                            if (!cacheEntry3.LIZ && z) {
                                if (cacheEntry3.LIZIZ == -1.0f) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                boolean z4 = !z2;
                                if (cacheEntry4.LIZIZ == -1.0f) {
                                    z3 = true;
                                }
                                if (z4 != (!z3)) {
                                    if (!z4) {
                                        return -1;
                                    }
                                } else if (z4 && (iCompare = Float.compare(cacheEntry4.LIZIZ, cacheEntry3.LIZIZ)) != 0) {
                                    return iCompare;
                                }
                            }
                            return (int) (cacheEntry4.sortKey - cacheEntry3.sortKey);
                        }
                        return 1;
                    }
                });
            }
        };
        this.LIZ = r2;
        EnumC308730C8h.Companion.getClass();
        C0NGR c0ngr = new C0NGR(C308750C8j.LIZ().getCapacity());
        this.LIZIZ = c0ngr;
        this.LIZJ = new C0NGO(r2, c0ngr, this);
        this.LIZLLL = new AtomicInteger(0);
        HashMap<C0NHJ, C0NHE> map = new HashMap<>();
        map.put(C0NHJ.INITIALIZE, new C0NHE() { // from class: X.0NHF
            @Override // X.C0NHE
            public final void LIZJ() {
            }

            @Override // X.C0NHE
            public final void LIZ() {
                C0S4J c0s4j = C0NH6.LJIILLIIL;
                int size = C591300NHc.LIZ().getSize();
                C591300NHc.LIZ().getClass();
                EnumC308730C8h.Companion.getClass();
                if (size < C308750C8j.LIZ().getCapacity()) {
                    C01GW c01gw = C307080C1y.LIZ;
                    if (((Number) c01gw.getValue()).intValue() <= 0) {
                        LIZLLL();
                        return;
                    }
                    C786410Ut5.LJLIIL(((long) ((Number) c01gw.getValue()).intValue()) * 1000, C2113808Pw.LIZIZ.LL, new ARunnableS109S0100000_9(this, 179));
                }
            }

            @Override // X.C0NHE
            public final C0NHJ LIZIZ() {
                return C0NHJ.INITIALIZE;
            }
        });
        map.put(C0NHJ.ENTER_BACKGROUND, new C0NHE() { // from class: X.0NHM
            public C11JF LIZ;

            @Override // X.C0NHE
            public final void LIZJ() {
                C11JF c11jf = this.LIZ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                this.LIZ = null;
            }

            @Override // X.C0NHE
            public final void LIZ() {
                this.LIZ = C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.0NHO
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("BackgroundSupplyCacheStrategy@fb12.observeAppEnterBackground$1");
                        if (((C606810Nr5) obj).LIZIZ) {
                            LIZLLL();
                        }
                        C1C7U.LIZIZ("BackgroundSupplyCacheStrategy@fb12.observeAppEnterBackground$1");
                    }
                });
            }

            @Override // X.C0NHE
            public final C0NHJ LIZIZ() {
                return C0NHJ.ENTER_BACKGROUND;
            }
        });
        map.put(C0NHJ.CACHE_NOT_ENOUGH, new C0NHE() { // from class: X.0NHN
            @Override // X.C0NHE
            public final void LIZJ() {
            }

            @Override // X.C0NHE
            public final void LIZ() {
                C0S4J c0s4j = C0NH6.LJIILLIIL;
                C0NH6 c0nh6LIZ = C591300NHc.LIZ();
                c0nh6LIZ.LJIIL.add(new C0NHY() { // from class: X.0NHW
                    @Override // X.C0NHY
                    public final void LIZIZ() {
                    }

                    @Override // X.C0NHY
                    public final void LIZ() {
                        LIZLLL();
                    }
                });
            }

            @Override // X.C0NHE
            public final C0NHJ LIZIZ() {
                return C0NHJ.CACHE_NOT_ENOUGH;
            }
        });
        this.LJ = map;
        this.LJFF = new InterfaceC427710Gpt() { // from class: X.0NHL
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                String uid;
                if (i != 1 && i != 2) {
                    return;
                }
                String uid2 = null;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (user2 != null) {
                    uid2 = user2.getUid();
                }
                if (Intrinsics.LJFF(uid, uid2)) {
                    return;
                }
                C0NH6 c0nh6 = this.LL;
                c0nh6.getClass();
                C0NH6.LJIILLIIL.LIZIZ(AFwS195S0000000_9.get$arr$(503));
                c0nh6.LJIILL();
                c0nh6.LJIIL();
            }
        };
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C0NHU());
        this.LJI = c01gwLIZ;
        C591400NHm c591400NHm = new C591400NHm(C0PEM.LIZJ.plus((CoroutineContext) c01gwLIZ.getValue()));
        this.LJII = c591400NHm;
        this.LJIIIIZZ = new C591350NHh(new InterfaceC591370NHj<C591320NHe, C0NHP>() { // from class: X.0NHg
            @Override // X.InterfaceC591370NHj
            public final Object LIZ(C591320NHe c591320NHe, InterfaceC1364105Vn interfaceC1364105Vn) {
                List<Aweme> items;
                String requestId;
                LinkedHashMap linkedHashMap;
                String requestId2;
                String str;
                String aid;
                Object obj;
                C592002So c592002So;
                List<C5186020i> list;
                String str2;
                ComposePbAndJson<C1620570sH1, FeedItemList> composePbAndJson = ((FeedCacheForLoadMoreApi.FeedCacheForLoadMoreService) FeedCacheForLoadMoreApi.LIZ.getValue()).offlineFeedList(11, c591320NHe.LIZ).execute().LIZIZ;
                String str3 = C1605000rru.LIZ;
                FeedItemList feedItemListLIZJ = composePbAndJson.LIZJ(new C1620390sGj(composePbAndJson, 11));
                Integer numLJ = null;
                if (feedItemListLIZJ != null) {
                    items = feedItemListLIZJ.getItems();
                } else {
                    items = null;
                }
                if (feedItemListLIZJ == null || (requestId = feedItemListLIZJ.getRequestId()) == null || requestId.length() <= 0) {
                    requestId = null;
                }
                if (((Boolean) C283900BAu.LIZ.getValue()).booleanValue() && feedItemListLIZJ != null && (c592002So = feedItemListLIZJ.pbData) != null && (list = c592002So.aweme_list) != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (C5186020i c5186020i : list) {
                        C5186020i c5186020i2 = c5186020i;
                        if (c5186020i2 != null) {
                            str2 = c5186020i2.aweme_id;
                        } else {
                            str2 = null;
                        }
                        linkedHashMap.put(str2, c5186020i);
                    }
                } else {
                    linkedHashMap = null;
                }
                if (items != null) {
                    for (Aweme aweme : items) {
                        if (requestId != null && aweme != null) {
                            aweme.setRequestId(requestId);
                        }
                        if (((Boolean) C283900BAu.LIZ.getValue()).booleanValue() && aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                            if (linkedHashMap != null) {
                                obj = linkedHashMap.get(aweme.getAid());
                            } else {
                                obj = null;
                            }
                            C0OBE.LIZIZ(aweme, "g_cache_pb", obj);
                        }
                    }
                }
                if (feedItemListLIZJ != null) {
                    requestId2 = feedItemListLIZJ.getRequestId();
                } else {
                    requestId2 = null;
                }
                Feed0VVManager.LJ(0, requestId2, items, false);
                if (feedItemListLIZJ != null) {
                    str = feedItemListLIZJ.status_msg;
                    numLJ = C2286608xc.LJ(feedItemListLIZJ.error_code);
                } else {
                    str = null;
                }
                return new C0NHP(items, str, numLJ);
            }
        }, new InterfaceC591370NHj<C591320NHe, C0NHP>() { // from class: X.0NHl
            @Override // X.InterfaceC591370NHj
            public final /* bridge */ /* synthetic */ Object LIZ(C591320NHe c591320NHe, InterfaceC1364105Vn interfaceC1364105Vn) {
                return null;
            }
        });
        this.LJIIIZ = new C1DFK(c591400NHm.LLILLL);
        this.LJIIJ = new C1DFK(c591400NHm.LLILLL);
        this.LJIIL = new ArrayList<>();
        this.LJIILIIL = new ArrayList<>();
        this.LJIILL = new C0NJD<>(C0NHK.UNINITIALIZED);
    }

    public final void LJIIL() {
        if (!C0NHD.LIZIZ()) {
            this.LJIILL.LIZIZ(C0NHK.DISABLED);
            return;
        }
        C0NJD<C0NHK> c0njd = this.LJIILL;
        C0NHK c0nhk = C0NHK.UNINITIALIZED;
        C0NHK c0nhk2 = C0NHK.LOADING;
        AtomicReference<C0NHK> atomicReference = c0njd.LIZ;
        while (!atomicReference.compareAndSet(c0nhk, c0nhk2)) {
            if (atomicReference.get() != c0nhk) {
                return;
            }
        }
        C0NEM.LIZ.LIZIZ(this);
        if (((C300690BqV.LIZ() >> 0) & 1) == 1) {
            C0NG8 c0ng8 = new C0NG8(this);
            IM2LocalCacheService iM2LocalCacheService = (IM2LocalCacheService) PluggableExtentionKt.pluggableSpi$default(IM2LocalCacheService.class, false, false, false, 14, null);
            if (iM2LocalCacheService != null) {
                iM2LocalCacheService.LJ(c0ng8.LJFF);
            }
            C0CN5.LIZJ(15000L, new ARunnableS109S0100000_9(c0ng8, 180), true);
            this.LJIILJJIL = c0ng8;
        }
        LJIILLIIL.LJIIJJI(new C0NHZ());
        C0NH0.LIZ = System.currentTimeMillis();
        C23250099c.LIZLLL(this.LJII, null, null, new C591230NGv(this, null), 3);
        C1DFK c1dfk = this.LJIIJ;
        if (c1dfk != null) {
            c1dfk.LJII(new C0NHT(this));
        }
        C1DFK c1dfk2 = this.LJIIIZ;
        if (c1dfk2 != null) {
            c1dfk2.LJII(new AwS588S0100000_9(this, 585));
        }
    }

    @Override // X.InterfaceC590770NFb
    public final int getSize() {
        if (LJIIJ() == C0NHK.DISABLED) {
            return 0;
        }
        C0NGO c0ngo = this.LIZJ;
        if (c0ngo.LJI) {
            return c0ngo.LJFF();
        }
        C0NGX.LIZ.getClass();
        return C0NHX.LIZ((Keva) C0NGX.LIZIZ.getValue(), C0NGX.LIZ()).length;
    }

    @Override // X.InterfaceC590770NFb
    public final C0N9C LIZJ() {
        return C0N9C.GOLDEN_HOUSE;
    }

    @Override // X.C0NGM
    public final void LIZIZ(List<? extends CacheEntry> list) {
        LJIILLIIL.LJIIJJI(new AwS553S0100000_9(list, (List<C0Y8T>) 1765));
        C591400NHm c591400NHm = this.LJII;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c591400NHm, C2107308Nj.LIZ.LLIILII(), null, new C0NGI(this, list, null), 2);
    }

    @Override // X.InterfaceC590770NFb
    public final void LIZLLL(C0NHH c0nhh) {
        if (c0nhh.LIZ == C0N9C.GOLDEN_HOUSE) {
            String str = c0nhh.LIZIZ;
            if (str.length() == 0) {
                return;
            }
            C0NGO c0ngo = this.LIZJ;
            C23250099c.LIZLLL(c0ngo.LJIIIIZZ, null, null, new C0NGV(c0ngo, str, null), 3);
        }
    }

    @Override // X.InterfaceC590770NFb
    public final C591480NHu LJFF(C0NEN c0nen) {
        return (C591480NHu) C23250099c.LJ(C23271099x.INSTANCE, new C0NHA(this, null));
    }

    @Override // X.InterfaceC590770NFb
    public final int LJI(C0NEN c0nen) {
        int length;
        if (LJIIJ() == C0NHK.DISABLED) {
            return 0;
        }
        C0NGO c0ngo = this.LIZJ;
        if (c0ngo.LJI) {
            length = c0ngo.LJFF();
        } else {
            C0NGX.LIZ.getClass();
            length = C0NHX.LIZ((Keva) C0NGX.LIZIZ.getValue(), C0NGX.LIZ()).length;
        }
        return length + this.LIZLLL.get();
    }

    @Override // X.InterfaceC590770NFb
    public final void LJII(C0NHH c0nhh) {
        Aweme aweme;
        List listSingletonList;
        if (LJIIJ() != C0NHK.DISABLED && (aweme = c0nhh.LIZLLL) != null && (listSingletonList = Collections.singletonList(aweme)) != null) {
            String str = c0nhh.LJ;
            if (str == null) {
                str = "unknown";
            }
            LJIILJJIL(str, listSingletonList, Collections.singletonList(c0nhh));
        }
    }

    @Override // X.InterfaceC590770NFb
    public final C591480NHu LJIIIIZZ(C0NEN c0nen) {
        return C0NEJ.LIZ();
    }

    public static void LJIILIIL(C0NH6 c0nh6, CacheEntry cacheEntry) {
        c0nh6.getClass();
        if (cacheEntry != null) {
            LJIILLIIL.LJIIJJI(new AwS553S0100000_9(cacheEntry, 1769));
            Aweme aweme = cacheEntry.value;
            if (aweme != null) {
                AwemeBizExtKt.setPullType(aweme, 11);
            }
            Aweme aweme2 = cacheEntry.value;
            if (aweme2 != null) {
                AwemeBizExtKt.setCacheSourceType(aweme2, C0N9C.GOLDEN_HOUSE.ordinal());
            }
            Iterator<C0NHY> it2 = c0nh6.LJIIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
            return;
        }
        LJIILLIIL.LJII(AFwS195S0000000_9.get$arr$(504));
        Iterator<C0NHY> it3 = c0nh6.LJIIL.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC590770NFb
    public final void LJ(C0NEN c0nen, C0NEK c0nek) {
        C23250099c.LIZLLL(this.LJII, null, null, new C0NH9(this, c0nek, null), 3);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0NH2] */
    public final void LJIIIZ(List<? extends Aweme> list, final String str, final CountDownLatch countDownLatch) {
        List<SimBitRate> bitRate;
        final int bitRate2;
        UrlModel originCover;
        List<String> urlList;
        List<BitRate> bitRate3;
        BitRate bitRate4;
        List<SimBitRate> bitRate5;
        if (list.isEmpty()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        int size = list.size();
        this.LIZLLL.getAndAdd(size);
        int i = 0;
        for (Aweme aweme : list) {
            int i2 = i + 1;
            List<BitRate> bitRate6 = null;
            if (i >= 0) {
                final Aweme aweme2 = aweme;
                final int size2 = list.size();
                final long j = (((long) size) + jCurrentTimeMillis) - ((long) i);
                LJIILLIIL.LIZIZ(new C5182020e(aweme2, 355));
                EnumC308730C8h.Companion.getClass();
                if (C308750C8j.LIZ().getVideoHighQuality()) {
                    SimVideoUrlModel simVideoUrlModelLJFF = C1483340ohg.LJFF(aweme2);
                    C0NF7.LIZ(aweme2, simVideoUrlModelLJFF, EnumC587720N3i.GOLDEN_CACHE, true);
                    if (simVideoUrlModelLJFF != null && (bitRate5 = simVideoUrlModelLJFF.getBitRate()) != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<SimBitRate> it2 = bitRate5.iterator();
                        while (it2.hasNext()) {
                            BitRate bitRateLIZ = C1481240oeI.LIZ(it2.next());
                            if (bitRateLIZ != null) {
                                arrayList.add(bitRateLIZ);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            aweme2.getVideo().setBitRate(arrayList);
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("select bit_rate: ");
                    Video video = aweme2.getVideo();
                    if (video != null) {
                        bitRate6 = video.getBitRate();
                    }
                    sbLIZ.append(bitRate6);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    SimVideoUrlModel simVideoUrlModelLJFF2 = C1483340ohg.LJFF(aweme2);
                    if (simVideoUrlModelLJFF2 != null && (bitRate = simVideoUrlModelLJFF2.getBitRate()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<SimBitRate> it3 = bitRate.iterator();
                        while (it3.hasNext()) {
                            BitRate bitRateLIZ2 = C1481240oeI.LIZ(it3.next());
                            if (bitRateLIZ2 != null) {
                                arrayList2.add(bitRateLIZ2);
                            }
                        }
                        Iterator it4 = arrayList2.iterator();
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            if (it4.hasNext()) {
                                int bitRate7 = ((BitRate) next).getBitRate();
                                do {
                                    Object next2 = it4.next();
                                    int bitRate8 = ((BitRate) next2).getBitRate();
                                    if (bitRate7 > bitRate8) {
                                        next = next2;
                                        bitRate7 = bitRate8;
                                    }
                                } while (it4.hasNext());
                            }
                            if (next != null) {
                                aweme2.getVideo().setBitRate(Collections.singletonList(next));
                                Video video2 = aweme2.getVideo();
                                if (video2 != null) {
                                    bitRate6 = video2.getBitRate();
                                }
                                Objects.toString(bitRate6);
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                }
                Video video3 = aweme2.getVideo();
                if (video3 != null && (bitRate3 = video3.getBitRate()) != null && (bitRate4 = (BitRate) C13LP.LJJJLL(bitRate3)) != null) {
                    bitRate2 = bitRate4.getBitRate();
                } else {
                    bitRate2 = 0;
                }
                C591050NGd c591050NGd = C591050NGd.LIZ;
                long j2 = jCurrentTimeMillis;
                ?? r13 = new C0NHS() { // from class: X.0NH2
                    @Override // X.C0NHS
                    public final void LIZ() {
                        C0NH1 c0nh1 = C0NH1.LIZ;
                        String str2 = str;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        int i3 = size2;
                        c0nh1.getClass();
                        Pair[] pairArr = new Pair[8];
                        pairArr[0] = new Pair("cache_type", 2);
                        pairArr[1] = new Pair("is_background", Integer.valueOf(C1906580ziK.LJI() ? 1 : 0));
                        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                        pairArr[2] = new Pair("network_status", iNetworkStateService != null ? Integer.valueOf(iNetworkStateService.getEffectiveConnectionType()) : null);
                        pairArr[3] = new Pair("internet_speed", String.valueOf(C1479130oat.LJII()));
                        pairArr[4] = new Pair("enter_method", str2);
                        pairArr[5] = new Pair("duration_feed_request_response", Long.valueOf(jCurrentTimeMillis2));
                        C0S4J c0s4j = C0NH6.LJIILLIIL;
                        pairArr[6] = new Pair("remaining_cache_cnt", Integer.valueOf(C591300NHc.LIZ().getSize()));
                        pairArr[7] = new Pair("cache_video_cnt", Integer.valueOf(i3));
                        C0NH1.LIZ("cache_video_request", C591500NHw.LIZ(pairArr));
                        C0NH6.LJIILLIIL.LIZIZ(new C5182020e(aweme2, 356));
                    }

                    @Override // X.C0NHS
                    public final void LIZIZ() {
                        C0NH6.LJIILLIIL.LJII(new AwS553S0100000_9(aweme2, 1766));
                        CountDownLatch countDownLatch2 = countDownLatch;
                        if (countDownLatch2 != null) {
                            countDownLatch2.countDown();
                        }
                        C0NH1 c0nh1 = C0NH1.LIZ;
                        String str2 = str;
                        c0nh1.getClass();
                        Pair[] pairArr = new Pair[7];
                        pairArr[0] = new Pair("cache_type", 2);
                        pairArr[1] = new Pair("is_background", Integer.valueOf(C1906580ziK.LJI() ? 1 : 0));
                        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                        pairArr[2] = new Pair("network_status", iNetworkStateService != null ? Integer.valueOf(iNetworkStateService.getEffectiveConnectionType()) : null);
                        pairArr[3] = new Pair("internet_speed", String.valueOf(C1479130oat.LJII()));
                        pairArr[4] = new Pair("is_success", "2");
                        pairArr[5] = new Pair("duration", 0);
                        pairArr[6] = new Pair("enter_method", str2);
                        C0NH1.LIZ("cache_video_request_response", C591500NHw.LIZ(pairArr));
                        this.LIZLLL.addAndGet(-1);
                    }

                    @Override // X.C0NHS
                    public final void LIZJ(long j3) {
                        C0NH6.LJIILLIIL.LJII(new AwS553S0100000_9(aweme2, 1767));
                        CountDownLatch countDownLatch2 = countDownLatch;
                        if (countDownLatch2 != null) {
                            countDownLatch2.countDown();
                        }
                        C0NH1 c0nh1 = C0NH1.LIZ;
                        String str2 = str;
                        c0nh1.getClass();
                        C0NH1.LJ(null, false, j3, str2);
                        this.LIZLLL.addAndGet(-1);
                    }

                    @Override // X.C0NHS
                    public final void LIZLLL(long j3, long j4, Aweme aweme3, String str2) {
                        String aid = aweme3.getAid();
                        if (aid == null) {
                            return;
                        }
                        CacheEntry cacheEntry = new CacheEntry(aid, System.currentTimeMillis(), j, aweme3, str2, str, C0NH4.LIZ(aweme3), false, false, -1.0f, "", bitRate2);
                        C0NH1 c0nh1 = C0NH1.LIZ;
                        String str3 = str;
                        c0nh1.getClass();
                        C0NH1.LJ(cacheEntry, true, j4, str3);
                        C0NH6.LJIILLIIL.LJIIJJI(new C207400r2(j3, str2, aweme3));
                        C0NH6 c0nh6 = this;
                        C23250099c.LIZLLL(c0nh6.LJII, null, null, new C0NGF(c0nh6, cacheEntry, new AwS410S0200000_9(countDownLatch, c0nh6, 90), null), 3);
                    }
                };
                c591050NGd.getClass();
                C0NHI c0nhi = new C0NHI(aweme2, r13);
                String strLIZJ = C1483340ohg.LIZJ(aweme2, new C0NI4(Integer.MAX_VALUE, EnumC591520NHy.PRELOAD_TASK_PRIORITY_LOW, new C0NIL(C0NKA.GHouse, c0nhi.LIZJ), c0nhi));
                c0nhi.LIZLLL = System.currentTimeMillis();
                if (strLIZJ == null) {
                    C1483340ohg.LJJIIZI(c0nhi.LIZJ);
                    SimVideoUrlModel simVideoUrlModelLJFF3 = C1483340ohg.LJFF(aweme2);
                    if (simVideoUrlModelLJFF3 != null) {
                        C1478160oZK.LIZ().LJJJJZ(simVideoUrlModelLJFF3);
                    }
                    r13.LIZIZ();
                    r13.LIZJ(0L);
                } else {
                    Video video4 = aweme2.getVideo();
                    if (video4 != null && (originCover = video4.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && !urlList.isEmpty()) {
                        C823050WQl.LIZLLL().submit(new ARunnableS106S0100000_6(UriProtector.parse((String) ListProtector.get(originCover.getUrlList(), 0)), 235));
                    }
                }
                i = i2;
                jCurrentTimeMillis = j2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LJIILJJIL(String str, List list, List list2) {
        if (LJIIJ() == C0NHK.DISABLED) {
            return;
        }
        LJIILLIIL.LJIIJJI(new AwS152S1100000_3(str, (String) list, (List<? extends Aweme>) 7));
        if (!list.isEmpty() && this.LIZIZ.LIZ - LJIIJJI() > 0) {
            C23250099c.LIZLLL(this.LJII, null, null, new C0NH7(this, list, str, list2, null), 3);
        }
    }
}
