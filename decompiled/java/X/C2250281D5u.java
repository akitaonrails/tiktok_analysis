package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1D5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250281D5u implements C1D60 {
    public final C1D66 LIZ;
    public final C1D3H LIZIZ;
    public C1D61 LIZJ;
    public final Map<C13IQ<? extends InterfaceC2250311D5x>, InterfaceC2250311D5x> LIZLLL;
    public final Map<C1D61, List<C13IQ<? extends InterfaceC2250311D5x>>> LJ;
    public final Map<C1D61, CountDownLatch> LJFF;
    public final Map<C13IQ<? extends InterfaceC2250311D5x>, C2250321D5y> LJI;
    public final Map<C1D3H, InterfaceC497601wk> LJII;

    public final void LIZJ() {
        for (Map.Entry entry : ((LinkedHashMap) this.LJI).entrySet()) {
            C13IQ<? extends InterfaceC2250311D5x> c13iq = (C13IQ) entry.getKey();
            if (((C2250321D5y) entry.getValue()).LJ == C1D3K.WAITING_DEPENDENCIES && ((LinkedHashMap) this.LIZLLL).get(c13iq) != null && LIZIZ(c13iq)) {
                LIZLLL(c13iq);
            }
        }
    }

    public C2250281D5u(C1D66 c1d66) {
        C1D3H c1d3h = C1D3H.EXEC_ON_MAIN;
        this.LIZ = c1d66;
        this.LIZIZ = c1d3h;
        this.LIZJ = EnumC648820Pce.INIT;
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJII = C2097608Jq.LJIIJ(new Pair(c1d3h, C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII().plus(C2296908zH.LIZ()))), new Pair(C1D3H.MULTI_THREAD, C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()))));
    }

    @Override // X.C1D60
    public final void LIZ(C2250331D5z c2250331D5z) {
        List<C13IQ> listLLIIII;
        C2250321D5y c2250321D5y;
        C1D61 c1d61 = c2250331D5z.LIZ;
        this.LIZJ = c1d61;
        Iterable iterable = (Iterable) ((LinkedHashMap) this.LJ).get(c1d61);
        if (iterable != null && (listLLIIII = C13LP.LLIIII(iterable)) != null) {
            for (C13IQ c13iq : listLLIIII) {
                InterfaceC2250311D5x interfaceC2250311D5x = (InterfaceC2250311D5x) ((LinkedHashMap) this.LIZLLL).get(c13iq);
                if (interfaceC2250311D5x != null && (c2250321D5y = (C2250321D5y) ((LinkedHashMap) this.LJI).get(c13iq)) != null) {
                    c2250321D5y.LIZ.add(c2250331D5z.LIZ);
                    C2250291D5v c2250291D5v = new C2250291D5v(this, c2250331D5z, c2250321D5y, interfaceC2250311D5x, c13iq);
                    int i = C1D3I.LIZ[c2250331D5z.LIZIZ.ordinal()];
                    if (i == 1) {
                        continue;
                    } else if (i != 2) {
                        if (i == 3) {
                            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) ((LinkedHashMap) this.LJII).get(C1D3H.EXEC_ON_MAIN);
                            if (interfaceC497601wk != null) {
                                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1702690uPT(c2250291D5v, c2250331D5z, c2250321D5y, null), 3);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        try {
                            c2250291D5v.invoke();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("all on one ");
                            sbLIZ.append(c2250331D5z.LIZ.getStageName());
                            C2188811AlT.LIZIZ(sbLIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c2250321D5y.LJ = C1D3K.FAILED;
                        }
                    }
                }
            }
        }
    }

    public final boolean LIZIZ(C13IQ<? extends InterfaceC2250311D5x> c13iq) {
        InterfaceC2250311D5x interfaceC2250311D5x;
        InterfaceC2250311D5x interfaceC2250311D5x2 = (InterfaceC2250311D5x) ((LinkedHashMap) this.LIZLLL).get(c13iq);
        if (interfaceC2250311D5x2 == null) {
            return false;
        }
        for (C13IQ<? extends InterfaceC2250311D5x> c13iq2 : interfaceC2250311D5x2.getDependencies()) {
            C2250321D5y c2250321D5y = (C2250321D5y) ((LinkedHashMap) this.LJI).get(c13iq2);
            if (c2250321D5y == null || (interfaceC2250311D5x = (InterfaceC2250311D5x) ((LinkedHashMap) this.LIZLLL).get(c13iq2)) == null) {
                return false;
            }
            if (!interfaceC2250311D5x.getDependencies().isEmpty()) {
                if (!c2250321D5y.LIZJ || !c2250321D5y.LIZLLL) {
                    return false;
                }
            } else if (!c2250321D5y.LIZJ) {
                return false;
            }
        }
        return true;
    }

    public final void LIZLLL(C13IQ<? extends InterfaceC2250311D5x> c13iq) {
        C2250321D5y c2250321D5y;
        InterfaceC2250311D5x interfaceC2250311D5x = (InterfaceC2250311D5x) ((LinkedHashMap) this.LIZLLL).get(c13iq);
        if (interfaceC2250311D5x == null || (c2250321D5y = (C2250321D5y) ((LinkedHashMap) this.LJI).get(c13iq)) == null) {
            return;
        }
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) ((LinkedHashMap) this.LJII).get(this.LIZIZ);
        if (interfaceC497601wk != null) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C2250301D5w(this, c2250321D5y, interfaceC2250311D5x, c13iq, null), 3);
        }
    }

    public final CountDownLatch LJ(C1D6D c1d6d) {
        return (CountDownLatch) ((LinkedHashMap) this.LJFF).get(c1d6d);
    }
}
