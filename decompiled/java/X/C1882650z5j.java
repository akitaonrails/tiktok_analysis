package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.base.GlobalMixEventBase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0z5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882650z5j implements InterfaceC1141530foN {
    public static final C1882650z5j LL = new C1882650z5j();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1882670z5l());
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C1882680z5m());
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C1882690z5n());

    public static ConcurrentHashMap LIZ() {
        return (ConcurrentHashMap) LLILLJJLI.getValue();
    }

    public static final void LIZLLL(InterfaceC1882630z5h interfaceC1882630z5h) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = (CopyOnWriteArraySet) LIZ().remove(interfaceC1882630z5h);
        if (copyOnWriteArraySet != null) {
            for (String str : copyOnWriteArraySet) {
                C1882650z5j c1882650z5j = LL;
                C01GW c01gw = LLILLL;
                AtomicInteger atomicInteger = (AtomicInteger) ((ConcurrentHashMap) c01gw.getValue()).get(str);
                if (atomicInteger == null || atomicInteger.decrementAndGet() <= 0) {
                    C1548820qPI.LJIIIIZZ(str, c1882650z5j);
                    ((ConcurrentHashMap) c01gw.getValue()).remove(str);
                }
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Object c098200Yq;
        C1881280z3W c1881280z3W;
        try {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                c1881280z3W = new C1881280z3W(interfaceC1107590evd);
            } else {
                c1881280z3W = null;
            }
            C500260Jjc.LJJLIIIJILLIZJL(new C1882660z5k(c262100zr, c1881280z3W));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("GlobalMixEventCenter", "onReceiveJsEvent error", thM5exceptionOrNullimpl);
        }
    }

    public static final void LIZIZ(String str, GlobalMixEventBase globalMixEventBase) {
        C500260Jjc.LJJLIIIJILLIZJL(new C1882640z5i(str, globalMixEventBase));
    }

    public static final void LIZJ(String str, InterfaceC1882630z5h interfaceC1882630z5h) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMapLIZ = LIZ();
        Object copyOnWriteArraySet = concurrentHashMapLIZ.get(interfaceC1882630z5h);
        if (copyOnWriteArraySet == null && (objPutIfAbsent = concurrentHashMapLIZ.putIfAbsent(interfaceC1882630z5h, (copyOnWriteArraySet = new CopyOnWriteArraySet()))) != null) {
            copyOnWriteArraySet = objPutIfAbsent;
        }
        if (((CopyOnWriteArraySet) copyOnWriteArraySet).add(str)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LLILLL.getValue();
            Object atomicInteger = concurrentHashMap.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger(0);
                C1548820qPI.LIZLLL(str, LL);
                Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(str, atomicInteger);
                if (objPutIfAbsent2 != null) {
                    atomicInteger = objPutIfAbsent2;
                }
            }
            ((AtomicInteger) atomicInteger).incrementAndGet();
        }
    }
}
