package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreDataLruPool;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.experiment.performance.ExploreBackToFrontPreloadConfig;
import com.ss.android.ugc.aweme.explore.experiment.performance.ExploreVideoDownloadConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15T0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15T0 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(522));
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(627));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1577));
    public static final RunnableC1313405Ca LJIIIIZZ = RunnableC1313405Ca.LL;

    public static IAwemeService LIZJ() {
        return (IAwemeService) LJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public static void LJ() {
        Collection collectionLLIIII;
        Collection collectionLLIIII2;
        List listLJLIL;
        ArrayList arrayList;
        ?? LL;
        Collection collectionLLIIII3;
        List<ExplorePostItem> list;
        List<ExplorePostItem> list2;
        List<ExplorePostItem> list3;
        if (((Number) C0AHF.LIZ.getValue()).intValue() == 1) {
            C20524315Sv.LL.getClass();
            ExploreAwemeList exploreAwemeListLIZ = C20524315Sv.LIZ();
            if (exploreAwemeListLIZ == null || (list3 = exploreAwemeListLIZ.items) == null || (collectionLLIIII = C13LP.LLIIII(list3)) == null) {
                collectionLLIIII = C13BV.INSTANCE;
            }
            List listLJLIL2 = C13LP.LJLIL(LIZIZ(), collectionLLIIII);
            ExploreAwemeList exploreAwemeListLJFF = C15T8.LL.LJFF();
            if (exploreAwemeListLJFF == null || (list2 = exploreAwemeListLJFF.items) == null || (collectionLLIIII2 = C13LP.LLIIII(list2)) == null) {
                collectionLLIIII2 = C13BV.INSTANCE;
            }
            List listLJLIL3 = C13LP.LJLIL(LJI(), collectionLLIIII2);
            if (C278070Av7.LIZ()) {
                C20524115St.LL.getClass();
                ExploreAwemeList exploreAwemeListLIZLLL = C20524115St.LIZLLL();
                if (exploreAwemeListLIZLLL == null || (list = exploreAwemeListLIZLLL.items) == null || (collectionLLIIII3 = C13LP.LLIIII(list)) == null) {
                    collectionLLIIII3 = C13BV.INSTANCE;
                }
                listLJLIL = C13LP.LJLIL(LIZLLL(), collectionLLIIII3);
            } else {
                listLJLIL = C13BV.INSTANCE;
            }
            if (((Number) C0AHG.LIZ.getValue()).intValue() <= 0) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((ArrayList) listLJLIL2).iterator();
                while (it2.hasNext()) {
                    Aweme aweme = ((ExplorePostItem) it2.next()).aweme;
                    if (aweme != null) {
                        arrayList2.add(aweme);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = ((ArrayList) listLJLIL3).iterator();
                while (it3.hasNext()) {
                    Aweme aweme2 = ((ExplorePostItem) it3.next()).aweme;
                    if (aweme2 != null) {
                        arrayList3.add(aweme2);
                    }
                }
                List listLJLIL4 = C13LP.LJLIL(arrayList3, arrayList2);
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = listLJLIL.iterator();
                while (it4.hasNext()) {
                    Aweme aweme3 = ((ExplorePostItem) it4.next()).aweme;
                    if (aweme3 != null) {
                        arrayList4.add(aweme3);
                    }
                }
                C15VJ.LIZLLL(contextLIZ, ((Number) C0AHH.LIZ.getValue()).intValue() == 2 ? EnumC1334360kpO.LOW : EnumC1334360kpO.IMMEDIATE, C13LP.LJLIL(arrayList4, listLJLIL4), ((Boolean) C0AHE.LIZ.getValue()).booleanValue());
            } else {
                ArrayList arrayList5 = (ArrayList) listLJLIL2;
                if (!arrayList5.isEmpty()) {
                    LL = new ArrayList();
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Aweme aweme4 = ((ExplorePostItem) it5.next()).aweme;
                        if (aweme4 != null) {
                            LL.add(aweme4);
                        }
                    }
                } else {
                    ArrayList arrayList6 = (ArrayList) listLJLIL3;
                    if (true ^ arrayList6.isEmpty()) {
                        arrayList = new ArrayList();
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            Aweme aweme5 = ((ExplorePostItem) it6.next()).aweme;
                            if (aweme5 != null) {
                                arrayList.add(aweme5);
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                        Iterator it7 = listLJLIL.iterator();
                        while (it7.hasNext()) {
                            Aweme aweme6 = ((ExplorePostItem) it7.next()).aweme;
                            if (aweme6 != null) {
                                arrayList.add(aweme6);
                            }
                        }
                    }
                    LL = C13LP.LL(arrayList, ((Number) C0AHG.LIZ.getValue()).intValue());
                }
                C844470XAv.LIZ.getClass();
                C15VJ.LIZLLL(C844470XAv.LIZ(), ((Number) C0AHH.LIZ.getValue()).intValue() == 2 ? EnumC1334360kpO.LOW : EnumC1334360kpO.IMMEDIATE, LL, ((Boolean) C0AHE.LIZ.getValue()).booleanValue());
            }
            if (C1335180kqi.LIZJ().enable && C1335180kqi.LIZIZ()) {
                ArrayList arrayList7 = new ArrayList();
                Iterator it8 = ((ArrayList) listLJLIL2).iterator();
                while (it8.hasNext()) {
                    Aweme aweme7 = ((ExplorePostItem) it8.next()).aweme;
                    if (aweme7 != null) {
                        arrayList7.add(aweme7);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it9 = ((ArrayList) listLJLIL3).iterator();
                while (it9.hasNext()) {
                    Aweme aweme8 = ((ExplorePostItem) it9.next()).aweme;
                    if (aweme8 != null) {
                        arrayList8.add(aweme8);
                    }
                }
                List listLJLIL5 = C13LP.LJLIL(arrayList8, arrayList7);
                ArrayList arrayList9 = new ArrayList();
                Iterator it10 = listLJLIL.iterator();
                while (it10.hasNext()) {
                    Aweme aweme9 = ((ExplorePostItem) it10.next()).aweme;
                    if (aweme9 != null) {
                        arrayList9.add(aweme9);
                    }
                }
                for (Aweme aweme10 : (ArrayList) C13LP.LJLIL(arrayList9, listLJLIL5)) {
                    String aid = aweme10.getAid();
                    Video video = aweme10.getVideo();
                    C15VC.LIZ((InterfaceC497601wk) LJII.getValue(), new C20530015Va(aid, C438710HIf.LIZ(video != null ? video.getCover() : null), aweme10, false, 24));
                }
            }
            if (((ExploreVideoDownloadConfig) C1153400g7W.LIZIZ.getValue()).enable) {
                ArrayList arrayList10 = new ArrayList();
                Iterator it11 = ((ArrayList) listLJLIL3).iterator();
                while (it11.hasNext()) {
                    Aweme aweme11 = ((ExplorePostItem) it11.next()).aweme;
                    if (aweme11 != null) {
                        arrayList10.add(aweme11);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                Iterator it12 = ((ArrayList) listLJLIL2).iterator();
                while (it12.hasNext()) {
                    Aweme aweme12 = ((ExplorePostItem) it12.next()).aweme;
                    if (aweme12 != null) {
                        arrayList11.add(aweme12);
                    }
                }
                List listLJLIL6 = C13LP.LJLIL(arrayList11, arrayList10);
                ArrayList arrayList12 = new ArrayList();
                Iterator it13 = listLJLIL.iterator();
                while (it13.hasNext()) {
                    Aweme aweme13 = ((ExplorePostItem) it13.next()).aweme;
                    if (aweme13 != null) {
                        arrayList12.add(aweme13);
                    }
                }
                List listLJLIL7 = C13LP.LJLIL(arrayList12, listLJLIL6);
                C01GW c01gw = C1153400g7W.LIZIZ;
                if (((ExploreVideoDownloadConfig) c01gw.getValue()).enable) {
                    int iMin = Math.min(((ExploreVideoDownloadConfig) c01gw.getValue()).downloadVideoCnt, ((ArrayList) listLJLIL7).size());
                    for (int i = 0; i < iMin; i++) {
                        Aweme aweme14 = (Aweme) ListProtector.get(listLJLIL7, i);
                        if (AwemeExtKt.isPhotoMode(aweme14)) {
                            Set<String> set = C591510NHx.LIZ;
                            C591510NHx.LIZ(((ExploreVideoDownloadConfig) C1153400g7W.LIZIZ.getValue()).preloadPhotoModeAudioSize, aweme14);
                        } else {
                            Set<String> set2 = C591510NHx.LIZ;
                            C591510NHx.LIZ(((ExploreVideoDownloadConfig) C1153400g7W.LIZIZ.getValue()).preloadVideoSize, aweme14);
                        }
                    }
                }
            }
        }
    }

    public static void LJFF() {
        Collection collectionLLIIII;
        Collection collectionLLIIII2;
        List listLJLIL;
        Collection collectionLLIIII3;
        List<ExplorePostItem> list;
        List<ExplorePostItem> list2;
        List<ExplorePostItem> list3;
        if (((Number) C0AHF.LIZ.getValue()).intValue() == 1) {
            C20524315Sv.LL.getClass();
            ExploreAwemeList exploreAwemeListLIZ = C20524315Sv.LIZ();
            if (exploreAwemeListLIZ == null || (list3 = exploreAwemeListLIZ.items) == null || (collectionLLIIII = C13LP.LLIIII(list3)) == null) {
                collectionLLIIII = C13BV.INSTANCE;
            }
            List listLJLIL2 = C13LP.LJLIL(LIZIZ(), collectionLLIIII);
            ExploreAwemeList exploreAwemeListLJFF = C15T8.LL.LJFF();
            if (exploreAwemeListLJFF == null || (list2 = exploreAwemeListLJFF.items) == null || (collectionLLIIII2 = C13LP.LLIIII(list2)) == null) {
                collectionLLIIII2 = C13BV.INSTANCE;
            }
            List listLJLIL3 = C13LP.LJLIL(LJI(), collectionLLIIII2);
            if (C278070Av7.LIZ()) {
                C20524115St.LL.getClass();
                ExploreAwemeList exploreAwemeListLIZLLL = C20524115St.LIZLLL();
                if (exploreAwemeListLIZLLL == null || (list = exploreAwemeListLIZLLL.items) == null || (collectionLLIIII3 = C13LP.LLIIII(list)) == null) {
                    collectionLLIIII3 = C13BV.INSTANCE;
                }
                listLJLIL = C13LP.LJLIL(LIZLLL(), collectionLLIIII3);
            } else {
                listLJLIL = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) listLJLIL2).iterator();
            while (it2.hasNext()) {
                Aweme aweme = ((ExplorePostItem) it2.next()).aweme;
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = ((ArrayList) listLJLIL3).iterator();
            while (it3.hasNext()) {
                Aweme aweme2 = ((ExplorePostItem) it3.next()).aweme;
                if (aweme2 != null) {
                    arrayList2.add(aweme2);
                }
            }
            List listLJLIL4 = C13LP.LJLIL(arrayList2, arrayList);
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = listLJLIL.iterator();
            while (it4.hasNext()) {
                Aweme aweme3 = ((ExplorePostItem) it4.next()).aweme;
                if (aweme3 != null) {
                    arrayList3.add(aweme3);
                }
            }
            List listLJLIL5 = C13LP.LJLIL(arrayList3, listLJLIL4);
            if (((ArrayList) listLJLIL5).isEmpty()) {
                return;
            }
            C844470XAv.LIZ.getClass();
            C15VJ.LIZLLL(C844470XAv.LIZ(), EnumC1334360kpO.LOW, listLJLIL5, ((ExploreBackToFrontPreloadConfig) C0CWO.LIZIZ.getValue()).loadBitmap);
        }
    }

    public static void LJII() {
        ArrayList<String> arrayList;
        ExploreAwemeList exploreAwemeListLIZLLL;
        List<ExplorePostItem> list;
        ExploreAwemeList exploreAwemeListLIZ;
        List<ExplorePostItem> list2;
        Object c098200Yq;
        List<ExplorePostItem> list3;
        Video video;
        UrlModel cover;
        List<String> urlList;
        Object objLJJJLL;
        List<ExplorePostItem> list4;
        ExploreAwemeList exploreAwemeListLJFF = C15T8.LL.LJFF();
        if (exploreAwemeListLJFF != null && (list4 = exploreAwemeListLJFF.items) != null) {
            for (ExplorePostItem explorePostItem : list4) {
                IAwemeService iAwemeServiceLIZJ = LIZJ();
                if (iAwemeServiceLIZJ != null) {
                    iAwemeServiceLIZJ.LLILLL(explorePostItem.aweme);
                }
            }
        }
        C2171408f2 c2171408f2 = C2171408f2.LIZ;
        if (exploreAwemeListLJFF == null || (list3 = exploreAwemeListLJFF.items) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<ExplorePostItem> it2 = list3.iterator();
            while (it2.hasNext()) {
                Aweme aweme = it2.next().aweme;
                if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                    arrayList.add(objLJJJLL);
                }
            }
        }
        c2171408f2.getClass();
        if (C15TM.LIZIZ().preConnectUseLastDomain && arrayList != null) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            for (String str : arrayList) {
                if (str != null) {
                    try {
                        c098200Yq = UriProtector.parse(str).getHost();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    String str2 = (String) c098200Yq;
                    if (str2 != null && str2.length() > 0) {
                        linkedHashSet.add(str2);
                        if (linkedHashSet.size() >= 4) {
                            break;
                        }
                    }
                }
            }
            if (!linkedHashSet.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(linkedHashSet, 10));
                for (String str3 : linkedHashSet) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(str3);
                    arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
                }
                C2171408f2.LJ = arrayList2;
            }
        }
        C20524315Sv.LL.getClass();
        if (C20524315Sv.LIZLLL("cold_boot", false, false) && (exploreAwemeListLIZ = C20524315Sv.LIZ()) != null && (list2 = exploreAwemeListLIZ.items) != null) {
            for (ExplorePostItem explorePostItem2 : list2) {
                IAwemeService iAwemeServiceLIZJ2 = LIZJ();
                if (iAwemeServiceLIZJ2 != null) {
                    iAwemeServiceLIZJ2.LLILLL(explorePostItem2.aweme);
                }
            }
        }
        if (C278070Av7.LIZ()) {
            C20524115St.LL.getClass();
            if (!C20524115St.LJ() || (exploreAwemeListLIZLLL = C20524115St.LIZLLL()) == null || (list = exploreAwemeListLIZLLL.items) == null) {
                return;
            }
            for (ExplorePostItem explorePostItem3 : list) {
                IAwemeService iAwemeServiceLIZJ3 = LIZJ();
                if (iAwemeServiceLIZJ3 != null) {
                    iAwemeServiceLIZJ3.LLILLL(explorePostItem3.aweme);
                }
            }
        }
    }

    public static List LIZIZ() {
        if (!C20524515Sx.LIZ().enableFakeRefresh) {
            return C13BV.INSTANCE;
        }
        List<ExploreAwemeList> listLJIIJJI = ((ExploreDataLruPool) C20524615Sy.LIZ.getValue()).LJIIJJI();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJIIJJI).iterator();
        while (it2.hasNext()) {
            Iterable iterable = ((ExploreAwemeList) it2.next()).items;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable, arrayList);
        }
        return arrayList;
    }

    public static List LIZLLL() {
        if (!C20524515Sx.LIZ().enableHotCache || !C278070Av7.LIZ()) {
            return C13BV.INSTANCE;
        }
        List<ExploreAwemeList> listLJIIJJI = C20524215Su.LIZ().LJIIJJI();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJIIJJI).iterator();
        while (it2.hasNext()) {
            Iterable iterable = ((ExploreAwemeList) it2.next()).items;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable, arrayList);
        }
        return arrayList;
    }

    public static List LJI() {
        if (!C20524515Sx.LIZ().enablePreload) {
            return C13BV.INSTANCE;
        }
        List<ExploreAwemeList> listLJIIJJI = ((ExploreDataLruPool) C20524715Sz.LIZ.getValue()).LJIIJJI();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJIIJJI).iterator();
        while (it2.hasNext()) {
            Iterable iterable = ((ExploreAwemeList) it2.next()).items;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable, arrayList);
        }
        return arrayList;
    }

    public static void LJIIIIZZ() {
        for (ExplorePostItem explorePostItem : LJI()) {
            IAwemeService iAwemeServiceLIZJ = LIZJ();
            if (iAwemeServiceLIZJ != null) {
                iAwemeServiceLIZJ.LLILLL(explorePostItem.aweme);
            }
        }
        for (ExplorePostItem explorePostItem2 : LIZIZ()) {
            IAwemeService iAwemeServiceLIZJ2 = LIZJ();
            if (iAwemeServiceLIZJ2 != null) {
                iAwemeServiceLIZJ2.LLILLL(explorePostItem2.aweme);
            }
        }
        for (ExplorePostItem explorePostItem3 : LIZLLL()) {
            IAwemeService iAwemeServiceLIZJ3 = LIZJ();
            if (iAwemeServiceLIZJ3 != null) {
                iAwemeServiceLIZJ3.LLILLL(explorePostItem3.aweme);
            }
        }
    }

    public static void LIZ(Runnable runnable) {
        if (((Boolean) C0AH9.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL((InterfaceC497601wk) LJII.getValue(), null, null, new C05CY(runnable, null), 3);
        } else {
            runnable.run();
        }
    }
}
