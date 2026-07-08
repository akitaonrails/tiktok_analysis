package X;

import Y.AObjectS63S0000000_10;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.legacy.ISearchTransitionalCardBaseProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.legacy.SearchTransitionalCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.NonMatching;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PHG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHG {
    public static final C0PHG LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public static List<? extends SearchTransitionalCardProtocol<InterfaceC594520NTm>> LJ;
    public static List<? extends SearchTransitionalCardProtocol<InterfaceC594520NTm>> LJFF;
    public static final ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC594520NTm>> LJI;
    public volatile List LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0PHG.class, "originProtocols", "getOriginProtocols()Ljava/util/List;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZIZ = new C0PHG();
        LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(691));
        C13BV c13bv = C13BV.INSTANCE;
        LJ = c13bv;
        LJFF = c13bv;
        LJI = new ConcurrentHashMap<>();
    }

    public static List LIZIZ() {
        Object c098200Yq;
        ArrayList arrayList = new ArrayList();
        C0PHG c0phg = LIZIZ;
        List listLJJLL = c0phg.LIZ;
        if (listLJJLL == null) {
            synchronized (c0phg) {
                listLJJLL = c0phg.LIZ;
                if (listLJJLL == null) {
                    listLJJLL = C13LQ.LJJLL(new Object[]{new AObjectS63S0000000_10(c0phg, 3), new AObjectS63S0000000_10(c0phg, 6), new AObjectS63S0000000_10(c0phg, 9)});
                    c0phg.LIZ = listLJJLL;
                }
            }
        }
        ArrayList<ISearchTransitionalCardBaseProtocol> arrayList2 = new ArrayList();
        Iterator it2 = listLJJLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            try {
                c098200Yq = (ISearchTransitionalCardBaseProtocol) ((Function0) it2.next()).invoke();
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
        for (ISearchTransitionalCardBaseProtocol iSearchTransitionalCardBaseProtocol : arrayList2) {
            if (!(iSearchTransitionalCardBaseProtocol instanceof SearchTransitionalCardProtocol)) {
                iSearchTransitionalCardBaseProtocol = null;
            }
            if (iSearchTransitionalCardBaseProtocol != null) {
                arrayList.add(iSearchTransitionalCardBaseProtocol);
            }
        }
        return arrayList;
    }

    public static List LIZ() {
        if (!C1111804Wm.LIZ()) {
            return (List) LIZLLL.getValue();
        }
        List<? extends SearchTransitionalCardProtocol<InterfaceC594520NTm>> list = LJFF;
        return list.isEmpty() ^ true ? C13LP.LJLIL(list, (Collection) LIZLLL.getValue()) : (List) LIZLLL.getValue();
    }

    public static ISearchCardProtocol LIZJ(InterfaceC594520NTm interfaceC594520NTm) {
        Object next;
        Iterator it2 = LIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                SearchTransitionalCardProtocol searchTransitionalCardProtocol = (SearchTransitionalCardProtocol) next;
                if (searchTransitionalCardProtocol.getDataType().LIZIZ(interfaceC594520NTm) && searchTransitionalCardProtocol.Hd1(interfaceC594520NTm)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SearchTransitionalCardProtocol searchTransitionalCardProtocol2 = (SearchTransitionalCardProtocol) next;
        if (searchTransitionalCardProtocol2 == null) {
            return NonMatching.LL;
        }
        return searchTransitionalCardProtocol2;
    }
}
