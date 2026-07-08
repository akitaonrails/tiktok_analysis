package X;

import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15TW, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TW {
    public static final C15TW LIZ = new C15TW();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    public static final ConcurrentHashMap<Long, C1178204jE> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, C05XL<Unit>> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Set<String>> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Set<String>> LJFF = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Set<String>> LJI = new ConcurrentHashMap<>();
    public static boolean LJII;

    public static ExploreTopicAwemeListResponse LJ(ExploreAwemeList exploreAwemeList) {
        ArrayList arrayList;
        ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = new ExploreTopicAwemeListResponse();
        List<ExplorePostItem> list = exploreAwemeList.items;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<ExplorePostItem> it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = it2.next().aweme;
                if (aweme != null) {
                    arrayList2.add(aweme);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        exploreTopicAwemeListResponse.items = arrayList;
        exploreTopicAwemeListResponse.hasMore = exploreAwemeList.hasMore;
        exploreTopicAwemeListResponse.logPb = exploreAwemeList.logPb;
        exploreTopicAwemeListResponse.setRequestId(exploreAwemeList.getRequestId());
        exploreTopicAwemeListResponse.topBanner = exploreAwemeList.topBanner;
        return exploreTopicAwemeListResponse;
    }

    public static Object LIZ(long j, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        if (!C294800Bh0.LIZ()) {
            return Unit.LIZ;
        }
        C05XL<Unit> c05xl = LIZLLL.get(C2286608xc.LJFF(j));
        if (c05xl == null) {
            return Unit.LIZ;
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C453201pa(c05xl, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public static Object LIZJ(List list, Long l, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (l == null) {
            return new ExploreAwemeList();
        }
        ExploreFeedRequestOverride exploreFeedRequestOverride = new ExploreFeedRequestOverride(19, list, Long.valueOf(l.longValue()));
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C15TX c15tx = C15TX.LLILZLL;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(c2252611DEt, 299);
        c15tx.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1568360quo(c15tx, exploreFeedRequestOverride, awS610S0100000_31, null), 3);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LIZIZ(List list, long j, boolean z, String str) {
        if (!C294800Bh0.LIZ()) {
            return;
        }
        Set<String> setLLIIJI = C13LP.LLIIJI(list);
        ConcurrentHashMap<Long, C05XL<Unit>> concurrentHashMap = LIZLLL;
        if ((concurrentHashMap.containsKey(Long.valueOf(j)) && Intrinsics.LJFF(LJ.get(Long.valueOf(j)), setLLIIJI)) || Intrinsics.LJFF(LJFF.get(Long.valueOf(j)), setLLIIJI)) {
            return;
        }
        C1178204jE c1178204jE = new C1178204jE(list);
        LIZJ.put(Long.valueOf(j), c1178204jE);
        LJ.put(Long.valueOf(j), setLLIIJI);
        C099F c099fLIZIZ = C090F.LIZIZ();
        concurrentHashMap.put(Long.valueOf(j), c099fLIZIZ);
        C23250099c.LIZLLL(LIZIZ, null, null, new C15TY(z, j, str, c1178204jE, setLLIIJI, list, c099fLIZIZ, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(long r14, java.lang.String r16, X.C1178204jE r17, java.util.Set r18, kotlin.jvm.internal.AwS575S0100000_31 r19, X.InterfaceC1364105Vn r20) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15TW.LIZLLL(long, java.lang.String, X.04jE, java.util.Set, kotlin.jvm.internal.AwS575S0100000_31, X.05Vn):java.lang.Object");
    }
}
