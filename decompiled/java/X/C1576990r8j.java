package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.minidrama.common.component.service.MiniDramaLimitedFreePopUpConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterBannerConfig;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper;
import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaThreeColumnCacheWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0r8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576990r8j {
    public static MiniDramaThreeColumnCacheWrapper LIZJ;
    public static boolean LJ;
    public static volatile Set<String> LJI;
    public static final C1576990r8j LIZ = new C1576990r8j();
    public static MiniDramaTabCacheWrapper[] LIZIZ = new MiniDramaTabCacheWrapper[C00ZD.LIZ()];
    public static final C1576980r8i LIZLLL = new C1576980r8i("MiniDramaTabPreload");
    public static String LJFF = "";

    public static void LJIILLIIL() {
        LJ = true;
    }

    public final Set<String> LIZJ() {
        Set<String> setLLIIJI;
        synchronized (this) {
            try {
                setLLIIJI = C13LP.LLIIJI(LIZ.LIZ());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return setLLIIJI;
    }

    public static Set LJII() {
        C1576980r8i c1576980r8i = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_fully_cached_aids");
        String strLIZ = C1576980r8i.LIZ(c1576980r8i, C2188811AlT.LIZIZ(sbLIZ));
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (strLIZ.length() == 0) {
            return C08CX.INSTANCE;
        }
        List listLJJLIIIJ = a0.LJJLIIIJ(strLIZ, new char[]{','}, false, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJ) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static MiniDramaThreeColumnCacheWrapper LJIIJJI() {
        String strLIZ = C1576980r8i.LIZ(LIZLLL, LJ());
        if (strLIZ == null) {
            return null;
        }
        try {
            return (MiniDramaThreeColumnCacheWrapper) C105700ad.LIZ(strLIZ, MiniDramaThreeColumnCacheWrapper.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Set<String> LIZ() {
        Set<String> setLLIIIZ;
        Set<String> set = LJI;
        if (set != null) {
            return set;
        }
        synchronized (this) {
            try {
                setLLIIIZ = LJI;
                if (setLLIIIZ == null) {
                    LIZ.getClass();
                    setLLIIIZ = C13LP.LLIIIZ(LJII());
                    LJI = setLLIIIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return setLLIIIZ;
    }

    public static String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mini_drama_tab_preload_cache_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mini_drama_tab_three_column_preload_cache_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ());
        sbLIZ.append("_proto_v2");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaThreeColumnCacheWrapper LJIIJ() {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1576990r8j.LJIIJ():com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaThreeColumnCacheWrapper");
    }

    public static Integer LIZIZ(long j) {
        int iLIZ = C00ZD.LIZ();
        for (int i = 0; i < iLIZ; i++) {
            MiniDramaTabCacheWrapper miniDramaTabCacheWrapper = (MiniDramaTabCacheWrapper) C13LQ.LJJIIZ(i, LIZIZ);
            if (miniDramaTabCacheWrapper == null || !miniDramaTabCacheWrapper.LIZIZ(j)) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public static void LJI(Set set) {
        String strLJJLIIIJ;
        if (set.isEmpty()) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62);
        }
        C1576980r8i c1576980r8i = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_fully_cached_aids");
        c1576980r8i.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), strLJJLIIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff A[PHI: r5
      0x01ff: PHI (r5v1 com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper) = 
      (r5v2 com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper)
      (r5v4 com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper)
     binds: [B:104:0x01fd, B:100:0x01f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021f A[PHI: r2
      0x021f: PHI (r2v7 com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper) = 
      (r2v6 com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper)
      (r2v11 com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper)
     binds: [B:29:0x0068, B:109:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9 A[PHI: r10
      0x00f9: PHI (r10v5 byte[]) = (r10v3 byte[]), (r10v3 byte[]), (r10v3 byte[]), (r10v3 byte[]), (r10v6 byte[]) binds: [B:41:0x00b8, B:56:0x00f6, B:54:0x00f1, B:43:0x00c2, B:38:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    /* JADX WARN: Type inference failed for: r0v108, types: [com.bytedance.keva.Keva] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[], com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper LJIIIIZZ(boolean r34) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1576990r8j.LJIIIIZZ(boolean):com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper");
    }

    public static MiniDramaTabCacheWrapper LJIIIZ(int i) {
        C1576980r8i c1576980r8i = LIZLLL;
        String strLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append("_slot_");
        sbLIZ.append(i);
        String strLIZ = C1576980r8i.LIZ(c1576980r8i, C2188811AlT.LIZIZ(sbLIZ));
        if (strLIZ == null || strLIZ.length() == 0) {
            return null;
        }
        try {
            return (MiniDramaTabCacheWrapper) C105700ad.LIZ(strLIZ, MiniDramaTabCacheWrapper.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper r6) {
        /*
            boolean r0 = X.C297580BlU.LIZIZ()
            if (r0 != 0) goto L7
            return
        L7:
            r5 = 0
            if (r6 == 0) goto L3e
            int r4 = r6.slotIndex
        Lc:
            com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper[] r0 = X.C1576990r8j.LIZIZ
            java.lang.Object r0 = X.C13LQ.LJJIIZ(r4, r0)
            com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper r0 = (com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper) r0
            r6 = 0
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp r0 = r0.resp
            if (r0 == 0) goto L46
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.feedItemList
            if (r0 == 0) goto L46
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAid()
            if (r0 == 0) goto L28
            r2.add(r0)
            goto L28
        L3e:
            r4 = 0
            goto Lc
        L40:
            java.util.Set r3 = X.C13LP.LLIIJI(r2)
            if (r3 != 0) goto L48
        L46:
            X.08CX r3 = X.C08CX.INSTANCE
        L48:
            com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper[] r1 = X.C1576990r8j.LIZIZ
            int r0 = r1.length
            if (r4 >= r0) goto L4f
            r1[r4] = r6
        L4f:
            X.0r8i r2 = X.C1576990r8j.LIZLLL
            java.lang.String r0 = LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = "_slot_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = ""
            r2.LIZIZ(r1, r0)
            boolean r0 = X.C0BWJ.LIZ()
            if (r0 == 0) goto L7c
            java.lang.String r1 = LJIIZILJ(r4)
            byte[] r0 = new byte[r5]
            r2.LIZJ(r1, r0)
        L7c:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc4
            X.0gAb r0 = X.C1155310gAb.LIZ
            r0.getClass()
            boolean r0 = X.C1155310gAb.LIZJ()
            if (r0 == 0) goto Lc4
            java.util.Set r0 = LJII()
            java.util.Set r2 = X.C13LP.LLIIIZ(r0)
            r2.removeAll(r3)
            LJI(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[OfflinePlay] removeSlotCache slot="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " removed "
            r1.append(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = " aids from disk, remaining="
            r1.append(r0)
            int r0 = r2.size()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1576990r8j.LJIIL(com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.util.List<X.0rAo>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.util.List<X.0rAh>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List, java.util.List<X.0rAh>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public static void LJIILL(MiniDramaThreeColumnCacheWrapper miniDramaThreeColumnCacheWrapper) {
        ?? arrayList;
        C1578280rAo c1578280rAoLIZ;
        ?? arrayList2;
        C1577190r93 c1577190r93Build;
        ?? arrayList3;
        ProtoAdapter<C1577160r90> protoAdapter = C1577160r90.ADAPTER;
        C1577180r92 c1577180r92 = new C1577180r92();
        c1577180r92.LIZLLL = miniDramaThreeColumnCacheWrapper.timeStamp;
        SeriesCenterListResponse seriesCenterListResponse = miniDramaThreeColumnCacheWrapper.resp;
        C1577050r8p c1577050r8pBuild = null;
        C1578240rAk c1578240rAkLJII = null;
        if (seriesCenterListResponse != null) {
            C1577040r8o c1577040r8o = new C1577040r8o();
            c1577040r8o.LIZLLL = seriesCenterListResponse.cursor;
            c1577040r8o.LJ = seriesCenterListResponse.hasMore;
            List<SeriesCenterCenterScene> list = seriesCenterListResponse.scenes;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<SeriesCenterCenterScene> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1578130rAZ.LIZ(it2.next()));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C1516540pZE.LIZ(arrayList);
            c1577040r8o.LJFF = arrayList;
            SeriesCenterCenterScene seriesCenterCenterScene = seriesCenterListResponse.currentScene;
            if (seriesCenterCenterScene != null) {
                c1578280rAoLIZ = C1578130rAZ.LIZ(seriesCenterCenterScene);
            } else {
                c1578280rAoLIZ = null;
            }
            c1577040r8o.LJI = c1578280rAoLIZ;
            List<ShortDramaOverview> list2 = seriesCenterListResponse.collections;
            if (list2 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<ShortDramaOverview> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(C1578130rAZ.LIZLLL(it3.next()));
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            C1516540pZE.LIZ(arrayList2);
            c1577040r8o.LJII = arrayList2;
            c1577040r8o.LJIIIIZZ = seriesCenterListResponse.reload;
            SeriesCenterBannerConfig seriesCenterBannerConfig = seriesCenterListResponse.bannerConfig;
            if (seriesCenterBannerConfig != null) {
                C1577200r94 c1577200r94 = new C1577200r94();
                c1577200r94.LIZLLL = seriesCenterBannerConfig.imageUrl;
                c1577200r94.LJ = seriesCenterBannerConfig.title;
                c1577190r93Build = c1577200r94.build();
            } else {
                c1577190r93Build = null;
            }
            c1577040r8o.LJIIIZ = c1577190r93Build;
            SkylightBlocks skylightBlocks = seriesCenterListResponse.skylightBlocks;
            if (skylightBlocks != null) {
                c1578240rAkLJII = C1578130rAZ.LJII(skylightBlocks);
            }
            c1577040r8o.LJIIJ = c1578240rAkLJII;
            c1577040r8o.LJIIJJI = seriesCenterListResponse.dramaTabBlockReason;
            c1577040r8o.LJIIL = seriesCenterListResponse.dramaTabBlockText;
            c1577040r8o.LJIILIIL = seriesCenterListResponse.feedbackLink;
            List<ShortDramaOverview> list3 = seriesCenterListResponse.safeCollections;
            if (list3 != null) {
                arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<ShortDramaOverview> it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(C1578130rAZ.LIZLLL(it4.next()));
                }
            } else {
                arrayList3 = C13BV.INSTANCE;
            }
            C1516540pZE.LIZ(arrayList3);
            c1577040r8o.LJIILJJIL = arrayList3;
            c1577050r8pBuild = c1577040r8o.build();
        }
        c1577180r92.LJ = c1577050r8pBuild;
        LIZLLL.LIZJ(LJFF(), protoAdapter.encode(c1577180r92.build()));
    }

    public static String LJIIZILJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_proto_v2");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("_slot_");
        sbLIZ2.append(i);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJIILIIL(SeriesFeedResp seriesFeedResp, int i) {
        long jLIZIZ;
        if (C298310Bmf.LIZ()) {
            jLIZIZ = System.currentTimeMillis();
        } else {
            jLIZIZ = ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
        }
        MiniDramaTabCacheWrapper miniDramaTabCacheWrapper = new MiniDramaTabCacheWrapper(Long.valueOf(jLIZIZ), seriesFeedResp, i);
        MiniDramaTabCacheWrapper[] miniDramaTabCacheWrapperArr = LIZIZ;
        if (i >= miniDramaTabCacheWrapperArr.length) {
            LIZIZ = (MiniDramaTabCacheWrapper[]) Arrays.copyOf(miniDramaTabCacheWrapperArr, i + 1);
        }
        LIZIZ[i] = miniDramaTabCacheWrapper;
        if (C0BWJ.LIZ()) {
            LJIILJJIL(miniDramaTabCacheWrapper, i);
            return;
        }
        String strLIZIZ = C105700ad.LIZIZ(miniDramaTabCacheWrapper);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        C1576980r8i c1576980r8i = LIZLLL;
        String strLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append("_slot_");
        sbLIZ.append(i);
        c1576980r8i.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), strLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, java.util.List<X.020i>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public static void LJIILJJIL(MiniDramaTabCacheWrapper miniDramaTabCacheWrapper, int i) {
        ?? arrayList;
        C1577210r95 c1577210r95;
        C1578240rAk c1578240rAkLJII;
        C1577130r8x c1577130r8xBuild;
        Integer numValueOf;
        C1578240rAk c1578240rAkLJII2;
        ProtoAdapter<C1577150r8z> protoAdapter = C1577150r8z.ADAPTER;
        C1577170r91 c1577170r91 = new C1577170r91();
        c1577170r91.LIZLLL = miniDramaTabCacheWrapper.timeStamp;
        SeriesFeedResp seriesFeedResp = miniDramaTabCacheWrapper.resp;
        C1577080r8s c1577080r8s = null;
        Integer numValueOf2 = null;
        if (seriesFeedResp != null) {
            C1577030r8n c1577030r8n = new C1577030r8n();
            c1577030r8n.LIZLLL = seriesFeedResp.statusCode;
            c1577030r8n.LJ = seriesFeedResp.statusMsg;
            c1577030r8n.LJFF = Integer.valueOf(Intrinsics.LJFF(seriesFeedResp.hasMore, Boolean.TRUE) ? 1 : 0);
            List<? extends Aweme> list = seriesFeedResp.feedItemList;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<? extends Aweme> it2 = list.iterator();
                while (it2.hasNext()) {
                    Object objLIZ = C0OBE.LIZ(it2.next(), "g_cache_pb");
                    if (objLIZ != null) {
                        arrayList.add(objLIZ);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C1516540pZE.LIZ(arrayList);
            c1577030r8n.LJI = arrayList;
            LogPbBean logPbBean = seriesFeedResp.logPb;
            if (logPbBean != null) {
                c1577210r95 = new C1577210r95(logPbBean.getImprId());
            } else {
                c1577210r95 = null;
            }
            c1577030r8n.LJII = c1577210r95;
            SkylightBlocks skylightBlocks = seriesFeedResp.skylightBlocks;
            if (skylightBlocks != null) {
                c1578240rAkLJII = C1578130rAZ.LJII(skylightBlocks);
            } else {
                c1578240rAkLJII = null;
            }
            c1577030r8n.LJIIIIZZ = c1578240rAkLJII;
            c1577030r8n.LJIIIZ = seriesFeedResp.showLimitedFreePop;
            MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig = seriesFeedResp.limitedFreePopConfig;
            if (miniDramaLimitedFreePopUpConfig != null) {
                C1577140r8y c1577140r8y = new C1577140r8y();
                c1577140r8y.LIZLLL = miniDramaLimitedFreePopUpConfig.title;
                c1577140r8y.LJ = miniDramaLimitedFreePopUpConfig.subTitle;
                c1577140r8y.LJFF = miniDramaLimitedFreePopUpConfig.buttonText;
                c1577140r8y.LJI = miniDramaLimitedFreePopUpConfig.highlightText;
                c1577140r8y.LJII = miniDramaLimitedFreePopUpConfig.highlightColor;
                c1577140r8y.LJIIIIZZ = miniDramaLimitedFreePopUpConfig.popUpImageUrl;
                c1577130r8xBuild = c1577140r8y.build();
            } else {
                c1577130r8xBuild = null;
            }
            c1577030r8n.LJIIJ = c1577130r8xBuild;
            EnumC1577000r8k enumC1577000r8k = seriesFeedResp.landingTab;
            if (enumC1577000r8k != null) {
                numValueOf = Integer.valueOf(enumC1577000r8k.getValue());
            } else {
                numValueOf = null;
            }
            c1577030r8n.LJIIJJI = numValueOf;
            c1577030r8n.LJIIL = seriesFeedResp.dramaTabBlockReason;
            c1577030r8n.LJIILIIL = seriesFeedResp.dramaTabBlockText;
            c1577030r8n.LJIILJJIL = seriesFeedResp.feedbackLink;
            SkylightBlocks skylightBlocks2 = seriesFeedResp.skylightBlocksV2;
            if (skylightBlocks2 != null) {
                c1578240rAkLJII2 = C1578130rAZ.LJII(skylightBlocks2);
            } else {
                c1578240rAkLJII2 = null;
            }
            c1577030r8n.LJIILL = c1578240rAkLJII2;
            C1577080r8s c1577080r8sBuild = c1577030r8n.build();
            ?? LIZ2 = C2188811AlT.LIZ();
            LIZ2.append("[P2] toFeedResponseProto awemes.size=");
            List<? extends Aweme> list2 = seriesFeedResp.feedItemList;
            if (list2 != null) {
                numValueOf2 = Integer.valueOf(list2.size());
            }
            LIZ2.append(numValueOf2);
            LIZ2.append(" blockReason=");
            LIZ2.append(seriesFeedResp.dramaTabBlockReason);
            LIZ2.append(" landingTab=");
            LIZ2.append(seriesFeedResp.landingTab);
            C2188811AlT.LIZIZ(LIZ2);
            c1577080r8s = c1577080r8sBuild;
        }
        c1577170r91.LJ = c1577080r8s;
        LIZLLL.LIZJ(LJIIZILJ(i), protoAdapter.encode(c1577170r91.build()));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LJIJ(com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks r11, com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem r12) {
        /*
            r3 = 9
            r2 = 0
            r6 = 1
            r5 = 0
            if (r11 == 0) goto Lbd
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo> r0 = r11.blocks
            if (r0 == 0) goto Lbd
            java.util.Iterator r4 = r0.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r1 = r4.next()
            r0 = r1
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo r0 = (com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo) r0
            java.lang.Integer r0 = r0.cardStyle
            if (r0 == 0) goto Lf
            int r0 = r0.intValue()
            if (r0 != r3) goto Lf
        L26:
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo r1 = (com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo) r1
            if (r1 == 0) goto Lbd
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem> r0 = r1.historyList
            if (r0 == 0) goto Lbd
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto Lbd
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L8c
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8c
        L43:
            int r1 = r7.size()
            r0 = 5
            if (r1 < r0) goto L4d
            X.C19719612Di.LJJIJIIJI(r7)
        L4d:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r7, r5, r12)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo> r1 = r11.blocks
            if (r1 == 0) goto Lb3
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r5 = r1.next()
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo r5 = (com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo) r5
            java.lang.Integer r0 = r5.cardStyle
            if (r0 == 0) goto L88
            int r0 = r0.intValue()
            if (r0 != r3) goto L88
            java.lang.Integer r6 = r5.cardStyle
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem> r8 = r5.trendingList
            java.util.List<com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene> r9 = r5.sceneList
            java.util.List<com.ss.android.ugc.aweme.minidrama.tab.v2.navbar.NavItem> r10 = r5.navList
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo r5 = new com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo
            r5.<init>(r6, r7, r8, r9, r10)
        L88:
            r2.add(r5)
            goto L65
        L8c:
            java.util.Iterator r4 = r7.iterator()
        L90:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem r0 = (com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem) r0
            java.lang.Long r1 = r0.collectionId
            java.lang.Long r0 = r12.collectionId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L90
            kotlin.jvm.internal.AwS603S0100000_24 r1 = new kotlin.jvm.internal.AwS603S0100000_24
            r0 = 7
            r1.<init>(r12, r0)
            X.C19719612Di.LJJIIJ(r7, r1, r6)
            goto L4d
        Lb0:
            r1 = r2
            goto L26
        Lb3:
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks r1 = r11.copy(r2)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r1)
            return r0
        Lbd:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1576990r8j.LJIJ(com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks, com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem):kotlin.Pair");
    }
}
