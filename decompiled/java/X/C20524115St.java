package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreDataLruPool;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20524115St implements InterfaceC586170Myt {
    public static volatile ExploreAwemeList LLILLL;
    public static AnonymousClass0956 LLILZLL;
    public static AnonymousClass0956 LLIZ;
    public static AnonymousClass0956 LLIZLLLIL;
    public static final C20524115St LL = new C20524115St();
    public static final ReentrantLock LLILLJJLI = new ReentrantLock();
    public static final C11NJ LLILZ = new C11NJ();
    public static final InterfaceC625970Ogt LLILZIL = C2192401ArG.LIZ(C589170N8x.LIZ("explore"), "explore_hot_cache");
    public static final C01GW LLJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(539));
    public static final C01GW LLJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(537));

    public static ExploreAwemeList LIZLLL() {
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

    public static void LIZJ() {
        if (!(C305140Bxg.LIZ().enable && C305140Bxg.LIZ().disEnableHotCache) && C305140Bxg.LIZIZ()) {
            AnonymousClass0956 anonymousClass0956 = LLILZLL;
            if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                LLILZLL = C23250099c.LIZLLL((C1841870y1x) LLJ.getValue(), null, null, new C15T3(System.currentTimeMillis(), null), 3);
            } else {
                C2153908cD c2153908cD = C2153908cD.LIZ;
                C20524015Ss.LIZ.getClass();
                C20524015Ss.LIZ("job_still_active");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0202 A[Catch: Exception -> 0x022e, TryCatch #0 {Exception -> 0x022e, blocks: (B:15:0x0030, B:18:0x0050, B:20:0x0056, B:21:0x0062, B:23:0x0078, B:25:0x007c, B:31:0x008a, B:39:0x009d, B:42:0x00a9, B:44:0x00b3, B:47:0x00c4, B:50:0x00ca, B:53:0x00d5, B:54:0x00de, B:56:0x00e4, B:58:0x00ee, B:60:0x00f4, B:62:0x00fa, B:63:0x00fe, B:65:0x0118, B:49:0x00c8, B:66:0x011b, B:68:0x0128, B:106:0x01ef, B:108:0x01f3, B:110:0x0202, B:111:0x020d, B:113:0x0214, B:121:0x022a, B:122:0x022d, B:69:0x012d, B:71:0x0142, B:73:0x014c, B:76:0x015d, B:79:0x0163, B:82:0x016e, B:83:0x0177, B:85:0x017d, B:87:0x0187, B:89:0x018d, B:91:0x0193, B:92:0x0197, B:94:0x01b1, B:78:0x0161, B:95:0x01b4, B:97:0x01c1, B:101:0x01c9, B:103:0x01cd, B:104:0x01dd, B:112:0x0212), top: B:135:0x0030, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ() {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20524115St.LJ():boolean");
    }

    public static void LIZ(ExploreAwemeList exploreAwemeList) {
        List listLLIIII;
        if (!C0BEE.LIZ() && ((Boolean) C278060Av6.LIZ.getValue()).booleanValue()) {
            List<ExplorePostItem> list = exploreAwemeList.items;
            if (list == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
                listLLIIII = C13BV.INSTANCE;
            }
            C2153908cD c2153908cD = C2153908cD.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                Aweme aweme = ((ExplorePostItem) it2.next()).aweme;
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
            C15VJ.LIZLLL(contextLIZ, EnumC1334360kpO.HIGH, arrayList, false);
        }
    }

    public static void LIZIZ(ExploreAwemeList exploreAwemeList) {
        if (C15T4.LIZ().enable) {
            Iterable iterable = exploreAwemeList.items;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            List listLLIIII = C13LP.LLIIII(iterable);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listLLIIII) {
                Aweme aweme = ((ExplorePostItem) obj).aweme;
                if (aweme != null && C582980Mtk.LIZIZ(aweme)) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.getFirst();
            List list2 = (List) pair.getSecond();
            if (!C0BEE.LIZ()) {
                LLIZLLLIL = C23250099c.LIZLLL((C1841870y1x) LLJI.getValue(), null, null, new C15T2(list, null), 3);
            }
            if (!C0BEE.LIZ()) {
                LLIZ = C23250099c.LIZLLL((C1841870y1x) LLJI.getValue(), null, null, new C15T1(list2, null), 3);
            }
        }
    }

    public static void LJFF(EnumC1782530wUF enumC1782530wUF) {
        ReentrantLock reentrantLock = LLILLJJLI;
        reentrantLock.lock();
        try {
            LLILLL = null;
            reentrantLock.unlock();
            InterfaceC625970Ogt interfaceC625970Ogt = LLILZIL;
            if (interfaceC625970Ogt.getLong("key_hot_cache_explore_ttl", 0L) > 0) {
                interfaceC625970Ogt.LJIIIIZZ("key_hot_cache_explore_ttl", 0L);
            }
            if (C20524515Sx.LIZ().enableHotCache) {
                ExploreDataLruPool exploreDataLruPoolLIZ = C20524215Su.LIZ();
                ReentrantLock reentrantLock2 = exploreDataLruPoolLIZ.LJI;
                reentrantLock2.lock();
                try {
                    exploreDataLruPoolLIZ.LJFF.size();
                    C13E8<C15CJ> c13e8 = exploreDataLruPoolLIZ.LJFF;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13e8, 10));
                    Iterator<C15CJ> it2 = c13e8.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZ);
                    }
                    exploreDataLruPoolLIZ.LJFF.clear();
                    exploreDataLruPoolLIZ.LJIIIIZZ = true;
                    C2153908cD c2153908cD = C2153908cD.LIZ;
                    exploreDataLruPoolLIZ.LJI();
                    if (!arrayList.isEmpty()) {
                        exploreDataLruPoolLIZ.LIZIZ(arrayList);
                    }
                    reentrantLock2.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            C20524015Ss.LIZ.getClass();
            C0NJJ.LIZ("explore_hot_cache_clear", C0NJJ.LIZIZ(new Pair("clear_reason", Integer.valueOf(enumC1782530wUF.getValue()))));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            ReentrantLock reentrantLock = LLILLJJLI;
            reentrantLock.lock();
            try {
                LLILLL = null;
                reentrantLock.unlock();
                AnonymousClass0956 anonymousClass0956 = LLILZLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                LLILZLL = null;
                AnonymousClass0956 anonymousClass09562 = LLIZ;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                AnonymousClass0956 anonymousClass09563 = LLIZLLLIL;
                if (anonymousClass09563 != null) {
                    anonymousClass09563.LIZIZ(null);
                }
                LLIZLLLIL = null;
                LLIZ = null;
                if (C20524515Sx.LIZ().enableHotCache) {
                    C20524215Su.LIZ().LJIIJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
