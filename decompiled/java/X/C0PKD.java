package X;

import Y.AObjectS63S0000000_10;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardBaseProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.NonMatching;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PKD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PKD {
    public static final C0PKD LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public static List<? extends ISearchCardProtocol<InterfaceC594520NTm>> LJ;
    public static List<? extends ISearchCardProtocol<InterfaceC594520NTm>> LJFF;
    public static final ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC594520NTm>> LJI;
    public static final C0PHG LJII;
    public volatile List LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0PKD.class, "originProtocols", "getOriginProtocols()Ljava/util/List;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZIZ = new C0PKD();
        LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(692));
        C13BV c13bv = C13BV.INSTANCE;
        LJ = c13bv;
        LJFF = c13bv;
        LJI = new ConcurrentHashMap<>();
        LJII = C0PHG.LIZIZ;
    }

    public static List LIZIZ() {
        Object c098200Yq;
        ArrayList arrayList = new ArrayList();
        C0PKD c0pkd = LIZIZ;
        List listLJJLL = c0pkd.LIZ;
        if (listLJJLL == null) {
            synchronized (c0pkd) {
                listLJJLL = c0pkd.LIZ;
                if (listLJJLL == null) {
                    listLJJLL = C13LQ.LJJLL(new Object[]{new AObjectS63S0000000_10(c0pkd, 22), new AObjectS63S0000000_10(c0pkd, 28), new AObjectS63S0000000_10(c0pkd, 60), new AObjectS63S0000000_10(c0pkd, 20), new AObjectS63S0000000_10(c0pkd, 55), new AObjectS63S0000000_10(c0pkd, 17), new AObjectS63S0000000_10(c0pkd, 27), new AObjectS63S0000000_10(c0pkd, 33), new AObjectS63S0000000_10(c0pkd, 36), new AObjectS63S0000000_10(c0pkd, 39), new AObjectS63S0000000_10(c0pkd, 54), new AObjectS63S0000000_10(c0pkd, 12), new AObjectS63S0000000_10(c0pkd, 41), new AObjectS63S0000000_10(c0pkd, 2), new AObjectS63S0000000_10(c0pkd, 30), new AObjectS63S0000000_10(c0pkd, 42), new AObjectS63S0000000_10(c0pkd, 45), new AObjectS63S0000000_10(c0pkd, 48), new AObjectS63S0000000_10(c0pkd, 51), new AObjectS63S0000000_10(c0pkd, 25), new AObjectS63S0000000_10(c0pkd, 31), new AObjectS63S0000000_10(c0pkd, 34), new AObjectS63S0000000_10(c0pkd, 37), new AObjectS63S0000000_10(c0pkd, 40), new AObjectS63S0000000_10(c0pkd, 43), new AObjectS63S0000000_10(c0pkd, 46), new AObjectS63S0000000_10(c0pkd, 49), new AObjectS63S0000000_10(c0pkd, 52), new AObjectS63S0000000_10(c0pkd, 56), new AObjectS63S0000000_10(c0pkd, 58), new AObjectS63S0000000_10(c0pkd, 62), new AObjectS63S0000000_10(c0pkd, 64), new AObjectS63S0000000_10(c0pkd, 66), new AObjectS63S0000000_10(c0pkd, 1), new AObjectS63S0000000_10(c0pkd, 4), new AObjectS63S0000000_10(c0pkd, 7), new AObjectS63S0000000_10(c0pkd, 10), new AObjectS63S0000000_10(c0pkd, 14), new AObjectS63S0000000_10(c0pkd, 16), new AObjectS63S0000000_10(c0pkd, 18), new AObjectS63S0000000_10(c0pkd, 23), new AObjectS63S0000000_10(c0pkd, 26), new AObjectS63S0000000_10(c0pkd, 29), new AObjectS63S0000000_10(c0pkd, 32), new AObjectS63S0000000_10(c0pkd, 35), new AObjectS63S0000000_10(c0pkd, 38), new AObjectS63S0000000_10(c0pkd, 44), new AObjectS63S0000000_10(c0pkd, 47), new AObjectS63S0000000_10(c0pkd, 50), new AObjectS63S0000000_10(c0pkd, 53), new AObjectS63S0000000_10(c0pkd, 57), new AObjectS63S0000000_10(c0pkd, 59), new AObjectS63S0000000_10(c0pkd, 61), new AObjectS63S0000000_10(c0pkd, 63), new AObjectS63S0000000_10(c0pkd, 65), new AObjectS63S0000000_10(c0pkd, 5), new AObjectS63S0000000_10(c0pkd, 8), new AObjectS63S0000000_10(c0pkd, 11), new AObjectS63S0000000_10(c0pkd, 13), new AObjectS63S0000000_10(c0pkd, 15), new AObjectS63S0000000_10(c0pkd, 19), new AObjectS63S0000000_10(c0pkd, 21), new AObjectS63S0000000_10(c0pkd, 24)});
                    c0pkd.LIZ = listLJJLL;
                }
            }
        }
        ArrayList<ISearchCardBaseProtocol> arrayList2 = new ArrayList();
        Iterator it2 = listLJJLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            try {
                c098200Yq = (ISearchCardBaseProtocol) ((Function0) it2.next()).invoke();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq;
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        for (ISearchCardBaseProtocol iSearchCardBaseProtocol : arrayList2) {
            if (!(iSearchCardBaseProtocol instanceof ISearchCardProtocol)) {
                iSearchCardBaseProtocol = null;
            }
            if (iSearchCardBaseProtocol != null) {
                arrayList.add(iSearchCardBaseProtocol);
            }
        }
        C0QG3.LIZ.getClass();
        arrayList.addAll(C0QG3.LIZIZ.LIZ());
        return arrayList;
    }

    public static List LIZ() {
        if (!C1111804Wm.LIZ()) {
            return (List) LIZLLL.getValue();
        }
        List<? extends ISearchCardProtocol<InterfaceC594520NTm>> list = LJFF;
        return list.isEmpty() ^ true ? C13LP.LJLIL(list, (Collection) LIZLLL.getValue()) : (List) LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ISearchCardProtocol LIZJ(InterfaceC594520NTm interfaceC594520NTm) {
        ISearchCardProtocol iSearchCardProtocol;
        Object next;
        Aweme aweme;
        if (C0BRB.LIZ() && (interfaceC594520NTm instanceof SearchMixFeed)) {
            C0PLT c0plt = (C0PLT) interfaceC594520NTm;
            if (c0plt.getFeedType() == 65280 && !C1010120cOQ.LJIJI(c0plt.getAweme()) && !C1010120cOQ.LJIL(c0plt.getAweme()) && (aweme = c0plt.getAweme()) != null && aweme.getAwemeType() == 0) {
                return NonMatching.LL;
            }
        }
        List listLIZ = LIZ();
        Object obj = null;
        try {
            Iterator it2 = listLIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    ISearchCardProtocol iSearchCardProtocol2 = (ISearchCardProtocol) next;
                    if ((iSearchCardProtocol2.getDataType().LIZIZ(interfaceC594520NTm) && iSearchCardProtocol2.Hd1(interfaceC594520NTm)) || ((interfaceC594520NTm instanceof C0PFN) && iSearchCardProtocol2.getDataType().LIZIZ(((C0PFN) interfaceC594520NTm).LIZ()) && iSearchCardProtocol2.Hd1(((C0PFN) interfaceC594520NTm).LIZ()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            iSearchCardProtocol = (ISearchCardProtocol) next;
        } catch (ConcurrentModificationException e) {
            TryCatchGuardChecker.doCheck(e);
            for (Object obj2 : new ArrayList(listLIZ)) {
                ISearchCardProtocol iSearchCardProtocol3 = (ISearchCardProtocol) obj2;
                if (!iSearchCardProtocol3.getDataType().LIZIZ(interfaceC594520NTm) || !iSearchCardProtocol3.Hd1(interfaceC594520NTm)) {
                    if (interfaceC594520NTm instanceof C0PFN) {
                        C0PFN c0pfn = (C0PFN) interfaceC594520NTm;
                        if (!iSearchCardProtocol3.getDataType().LIZIZ(c0pfn.LIZ()) || !iSearchCardProtocol3.Hd1(c0pfn.LIZ())) {
                        }
                    }
                }
                obj = obj2;
            }
            iSearchCardProtocol = (ISearchCardProtocol) obj;
        }
        if (iSearchCardProtocol == null) {
            return NonMatching.LL;
        }
        return iSearchCardProtocol;
    }
}
