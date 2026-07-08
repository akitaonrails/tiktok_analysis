package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.ab.FcpKmpDecisionExp;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0RfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701370RfD implements InterfaceC697220RWm {
    public Function1<? super C700170RdH, ? extends InterfaceC695090ROh> LL;
    public Function0<FeedComponentPriorityData> LLILLJJLI;
    public InterfaceC700020Rd2<?> LLILLL;
    public Function0<? extends List<String>> LLILZ;
    public String LLILZIL;
    public C701810Rfv LLILZLL;
    public C701270Rf3 LLIZ;
    public C700170RdH LLIZLLLIL;
    public ForkJoinPool LLJ;
    public Function1<? super FcpNodeProtocol, Boolean> LLJI;
    public Function0<Unit> LLJIJIL;
    public ListenableFuture<Unit> LLJILJIL;
    public InterfaceC697640RYc LLJILJILJ;
    public Function0<Boolean> LLJILLL;
    public C700150RdF LLJJ;
    public Function0<? extends C0RXZ> LLJJI;
    public Function0<? extends InterfaceC699620RcO> LLJJIJI;
    public Function0<? extends InterfaceC699200Rbi<?>> LLJJIJIIJIL;
    public InterfaceC700280RdS LLJJIJIL;
    public InterfaceC700270RdR LLJJJ;
    public AbstractC738140SxQ LLJJJIL;
    public FcpNodeProtocol LLJJJJ;
    public Executor LLJJJJLIIL;
    public final List<C197000pM> LLJJIII = new ArrayList();
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new C702270Rgf());
    public final List<InterfaceC702410Rgt> LLJJL = new ArrayList();
    public final C701440RfK LLJJLIIIJLLLLLLLZ = new C701440RfK(this);
    public final C701430RfJ LLJL = new C701430RfJ(this);
    public final AtomicInteger LLJLIL = new AtomicInteger(0);
    public final AtomicInteger LLJLILLLLZIIL = new AtomicInteger(0);
    public final AtomicBoolean LLJLL = new AtomicBoolean(false);
    public final AtomicBoolean LLJLLIL = new AtomicBoolean(false);

    @Override // X.InterfaceC697220RWm
    public final void lm() {
        C701040Reg c701040Reg;
        ConcurrentHashMap<String, FcpNodeProtocol> concurrentHashMapLJFF;
        this.LLJLLIL.set(false);
        if (FcpKmpDecisionExp.LIZ(this.LLILZIL)) {
            C700150RdF c700150RdF = this.LLJJ;
            if (c700150RdF != null) {
                C700170RdH c700170RdH = this.LLIZLLLIL;
                c700150RdF.LIZ.reset();
                if (c700170RdH == null || (c701040Reg = c700170RdH.LIZ) == null || (concurrentHashMapLJFF = c701040Reg.LJFF()) == null) {
                    return;
                }
                concurrentHashMapLJFF.clear();
                return;
            }
            return;
        }
        C701810Rfv c701810Rfv = this.LLILZLL;
        if (c701810Rfv == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        new C701580RfY(jCurrentTimeMillis, this);
        C0T6L.LIZLLL();
        try {
            Iterator it2 = C13LP.LJLJJLL(this.LLJJL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC702410Rgt) it2.next()).hl();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLJLILLLLZIIL.set(0);
        ListenableFuture<Unit> listenableFuture = this.LLJILJIL;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx = c701810Rfv.LIZIZ;
            if (interfaceC1449905lx != null) {
                interfaceC1449905lx.LIZ().invoke(new C702430Rgv("fcp_execute_reset_action", null));
            }
        } else {
            InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv = c701810Rfv.LIZ;
            if (interfaceC703670Riv != null) {
                interfaceC703670Riv.LIZ().invoke(new C702560Rh8("fcp_execute_reset_action", null));
            }
        }
        new C701710Rfl(System.currentTimeMillis(), this, jCurrentTimeMillis);
        C0T6L.LIZLLL();
    }

    @Override // X.InterfaceC697220RWm
    public final C700970ReZ In() {
        C701270Rf3 c701270Rf3 = this.LLIZ;
        if (c701270Rf3 != null) {
            return c701270Rf3.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC697220RWm
    public final C0RXZ ca() {
        C700150RdF c700150RdF = this.LLJJ;
        if (c700150RdF != null) {
            return c700150RdF.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC697220RWm
    public final C0RXZ li() {
        Function0<? extends C0RXZ> function0 = this.LLJJI;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    @Override // X.InterfaceC697220RWm
    public final void ol() {
        if (this.LLJLL.compareAndSet(true, false)) {
            C701270Rf3 c701270Rf3 = this.LLIZ;
            new AwS555S0100000_11(this, 1345);
            C0T6L.LIZLLL();
        }
    }

    @Override // X.InterfaceC697220RWm
    public final String xg() {
        InterfaceC700020Rd2<?> interfaceC700020Rd2 = this.LLILLL;
        if (interfaceC700020Rd2 != null) {
            return interfaceC700020Rd2.LJLI();
        }
        return null;
    }

    @Override // X.InterfaceC697220RWm
    public final void zf() {
        if (this.LLJLL.compareAndSet(false, true)) {
            C701270Rf3 c701270Rf3 = this.LLIZ;
            new C701780Rfs(this);
            C0T6L.LIZLLL();
        }
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Td() {
        C700950ReX c700950ReX;
        List<C700970ReZ> list;
        C700970ReZ c700970ReZIn = In();
        if (c700970ReZIn == null || (c700950ReX = c700970ReZIn.LJFF) == null || (list = c700950ReX.LIZ) == null) {
            return C2097608Jq.LJ();
        }
        ArrayList<FcpNodeProtocol> arrayList = new ArrayList();
        Iterator<C700970ReZ> it2 = list.iterator();
        while (it2.hasNext()) {
            FcpNodeProtocol fcpNodeProtocol = it2.next().LIZLLL;
            if (fcpNodeProtocol != null) {
                arrayList.add(fcpNodeProtocol);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (FcpNodeProtocol fcpNodeProtocol2 : arrayList) {
            String strLLLII = fcpNodeProtocol2.LLLII();
            if (strLLLII == null) {
                strLLLII = "";
            }
            Pair pair = new Pair(strLLLII, fcpNodeProtocol2);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Xh() {
        C700950ReX c700950ReX;
        List<C700970ReZ> list;
        C700970ReZ c700970ReZIn = In();
        if (c700970ReZIn == null || (c700950ReX = c700970ReZIn.LJFF) == null || (list = c700950ReX.LIZIZ) == null) {
            return C2097608Jq.LJ();
        }
        ArrayList<FcpNodeProtocol> arrayList = new ArrayList();
        Iterator<C700970ReZ> it2 = list.iterator();
        while (it2.hasNext()) {
            FcpNodeProtocol fcpNodeProtocol = it2.next().LIZLLL;
            if (fcpNodeProtocol != null) {
                arrayList.add(fcpNodeProtocol);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (FcpNodeProtocol fcpNodeProtocol2 : arrayList) {
            String strLLLII = fcpNodeProtocol2.LLLII();
            if (strLLLII == null) {
                strLLLII = "";
            }
            Pair pair = new Pair(strLLLII, fcpNodeProtocol2);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> q6() {
        C700950ReX c700950ReX;
        List<C700970ReZ> list;
        C700970ReZ c700970ReZIn = In();
        if (c700970ReZIn == null || (c700950ReX = c700970ReZIn.LJFF) == null || (list = c700950ReX.LIZLLL) == null) {
            return C2097608Jq.LJ();
        }
        ArrayList<FcpNodeProtocol> arrayList = new ArrayList();
        Iterator<C700970ReZ> it2 = list.iterator();
        while (it2.hasNext()) {
            FcpNodeProtocol fcpNodeProtocol = it2.next().LIZLLL;
            if (fcpNodeProtocol != null) {
                arrayList.add(fcpNodeProtocol);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (FcpNodeProtocol fcpNodeProtocol2 : arrayList) {
            String strLLLII = fcpNodeProtocol2.LLLII();
            if (strLLLII == null) {
                strLLLII = "";
            }
            Pair pair = new Pair(strLLLII, fcpNodeProtocol2);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC697220RWm
    public final C700170RdH J9() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC697220RWm
    public final String o1() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC697220RWm
    public final void Ah(InterfaceC702410Rgt interfaceC702410Rgt) {
        ((ArrayList) this.LLJJL).add(interfaceC702410Rgt);
    }

    public final List LIZIZ(InterfaceC695090ROh interfaceC695090ROh) {
        C701040Reg c701040Reg;
        C700170RdH c700170RdH;
        List<InterfaceC695090ROh> listLJ = interfaceC695090ROh.LJ();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC695090ROh> it2 = listLJ.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(LIZIZ(it2.next()));
        }
        C701270Rf3 c701270Rf3 = this.LLIZ;
        if (c701270Rf3 != null && (c700170RdH = c701270Rf3.LIZIZ) != null) {
            c701040Reg = c700170RdH.LIZ;
        } else {
            c701040Reg = null;
        }
        arrayList.addAll(interfaceC695090ROh.LJII(c701040Reg));
        return arrayList;
    }

    @Override // X.InterfaceC697220RWm
    public final void Xg(InterfaceC702410Rgt interfaceC702410Rgt) {
        ((ArrayList) this.LLJJL).remove(interfaceC702410Rgt);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    @Override // X.InterfaceC697220RWm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gg(final X.C700260RdQ r21) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C701370RfD.gg(X.0RdQ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    @Override // X.InterfaceC697220RWm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(kotlin.jvm.functions.Function1<? super X.InterfaceC1449905lx<X.C701270Rf3>, ? extends kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super X.InterfaceC1445905lJ, ? extends X.InterfaceC1445905lJ>, ? extends kotlin.jvm.functions.Function1<? super X.InterfaceC1445905lJ, ? extends X.InterfaceC1445905lJ>>>[] r18, kotlin.jvm.functions.Function1<? super X.InterfaceC703670Riv<X.C701270Rf3>, ? extends kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super X.InterfaceC700750ReD, ? extends X.InterfaceC700750ReD>, ? extends kotlin.jvm.functions.Function1<? super X.InterfaceC700750ReD, ? extends X.InterfaceC700750ReD>>>... r19) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C701370RfD.U(kotlin.jvm.functions.Function1[], kotlin.jvm.functions.Function1[]):void");
    }

    public final void LIZ(String str, int i, EnumC197200pO enumC197200pO, C700950ReX c700950ReX, C700950ReX c700950ReX2) {
        String strLIZ;
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZ2 = null;
        if (c700950ReX != null) {
            strLIZ = C701230Rez.LIZ(c700950ReX);
        } else {
            strLIZ = null;
        }
        if (c700950ReX2 != null) {
            strLIZ2 = C701230Rez.LIZ(c700950ReX2);
        }
        C197000pM c197000pM = new C197000pM(str2, i, jCurrentTimeMillis, enumC197200pO, strLIZ, strLIZ2);
        synchronized (this.LLJJIII) {
            try {
                ((ArrayList) this.LLJJIII).add(c197000pM);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService == null) {
            return;
        }
        iFeedDebugService.LJIIL();
    }

    @Override // X.InterfaceC697220RWm
    public final void N7(Function1<? super C700170RdH, ? extends InterfaceC695090ROh> function1, String str, ForkJoinPool forkJoinPool, Function0<FeedComponentPriorityData> function0, InterfaceC700020Rd2<?> interfaceC700020Rd2, Function0<? extends List<String>> function02, Function1<? super FcpNodeProtocol, Boolean> function12, Executor executor, InterfaceC697640RYc interfaceC697640RYc, Function0<Boolean> function03, Function0<? extends InterfaceC699620RcO> function04, Function0<? extends InterfaceC699200Rbi<?>> function05, InterfaceC700280RdS interfaceC700280RdS, InterfaceC700270RdR interfaceC700270RdR, AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, Function0<? extends C0RXZ> function06) {
        this.LL = function1;
        this.LLJ = forkJoinPool;
        if (str == null) {
            str = "";
        }
        this.LLILZIL = str;
        this.LLILLJJLI = function0;
        this.LLILLL = interfaceC700020Rd2;
        this.LLILZ = function02;
        this.LLJI = function12;
        this.LLJJJJLIIL = executor;
        this.LLJILJILJ = interfaceC697640RYc;
        this.LLJILLL = function03;
        this.LLJJIJI = function04;
        this.LLJJIJIIJIL = function05;
        this.LLJJIJIL = interfaceC700280RdS;
        this.LLJJJ = interfaceC700270RdR;
        this.LLJJJIL = abstractC738140SxQ;
        this.LLJJJJ = fcpNodeProtocol;
        this.LLJJI = function06;
    }
}
