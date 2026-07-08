package X;

import Y.AfS172S0100000_3;
import androidx.lifecycle.Lifecycle;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1554890qZ5 {
    public final InterfaceC665370Q7z LIZ;
    public final Map<C1554820qYy<?>, InterfaceC1555100qZQ<?>> LIZIZ = new ConcurrentHashMap();
    public C0PWZ LIZJ = C1554790qYv.LIZ;
    public final List<InterfaceC665370Q7z> LIZLLL = new ArrayList();

    public void LJ() {
    }

    public void LJFF() {
        if (C1557550qdN.LJ) {
            ((ArrayList) LJIIIIZZ().getTree().LIZLLL).remove(this.LIZ);
        }
        Iterator it2 = ((ConcurrentHashMap) this.LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1555100qZQ) ((Map.Entry) it2.next()).getValue()).destroy();
        }
        ((ConcurrentHashMap) this.LIZIZ).clear();
    }

    public final InterfaceC665370Q7z LJIIIIZZ() {
        return this.LIZJ.k0();
    }

    public InterfaceC665370Q7z LJI() {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = LJIIIIZZ();
        if (C1557550qdN.LJ) {
            ((ArrayList) interfaceC665370Q7zLJIIIIZZ.getTree().LIZLLL).remove(this.LIZ);
        }
        this.LIZJ = C1554790qYv.LIZ;
        return interfaceC665370Q7zLJIIIIZZ;
    }

    public C1554890qZ5(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = interfaceC665370Q7z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0qYq] */
    public void LIZ(final InterfaceC1554770qYt interfaceC1554770qYt) {
        final ?? r0 = new InterfaceC1554750qYr() { // from class: X.0qYq
            @Override // X.InterfaceC1554750qYr
            public final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC665370Q7z interfaceC665370Q7z2) {
                C1554890qZ5 tree;
                C1554890qZ5 c1554890qZ5 = this.LIZ;
                C1557550qdN.LIZ("vprovider_provide", new C1554650qYh(c1554890qZ5, interfaceC665370Q7z));
                GScope gScope = GScope.LL;
                if (!Intrinsics.LJFF(interfaceC665370Q7z2, gScope) && (tree = interfaceC665370Q7z2.getTree()) != null) {
                    tree.LJI();
                }
                if (C1557550qdN.LJ) {
                    ((ArrayList) interfaceC665370Q7z.getTree().LIZLLL).add(c1554890qZ5.LIZ);
                }
                c1554890qZ5.getClass();
                if (!Intrinsics.LJFF(interfaceC665370Q7z, gScope)) {
                    interfaceC665370Q7z.getTree().LJ();
                }
            }
        };
        this.LIZJ = new C0PWZ(interfaceC1554770qYt, r0) { // from class: X.0qYs
            public final InterfaceC1554770qYt LIZ;
            public final boolean LIZIZ = false;
            public final InterfaceC1554750qYr LIZJ;
            public InterfaceC665370Q7z LIZLLL;

            @Override // X.C0PWZ
            public final boolean isExternal() {
                return false;
            }

            @Override // X.C0PWZ
            public final InterfaceC665370Q7z k0() {
                InterfaceC665370Q7z interfaceC665370Q7zLIZ;
                if (this.LIZIZ) {
                    interfaceC665370Q7zLIZ = this.LIZ.LIZ();
                    if (!Intrinsics.LJFF(this.LIZLLL, interfaceC665370Q7zLIZ)) {
                        InterfaceC1554750qYr interfaceC1554750qYr = this.LIZJ;
                        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZLLL;
                        if (interfaceC665370Q7z == null) {
                            interfaceC665370Q7z = GScope.LL;
                        }
                        interfaceC1554750qYr.LIZ(interfaceC665370Q7zLIZ, interfaceC665370Q7z);
                    }
                    this.LIZLLL = interfaceC665370Q7zLIZ;
                } else {
                    interfaceC665370Q7zLIZ = this.LIZLLL;
                    if (interfaceC665370Q7zLIZ == null) {
                        InterfaceC665370Q7z interfaceC665370Q7zLIZ2 = this.LIZ.LIZ();
                        InterfaceC1554750qYr interfaceC1554750qYr2 = this.LIZJ;
                        InterfaceC665370Q7z interfaceC665370Q7z2 = this.LIZLLL;
                        if (interfaceC665370Q7z2 == null) {
                            interfaceC665370Q7z2 = GScope.LL;
                        }
                        interfaceC1554750qYr2.LIZ(interfaceC665370Q7zLIZ2, interfaceC665370Q7z2);
                        this.LIZLLL = interfaceC665370Q7zLIZ2;
                        return interfaceC665370Q7zLIZ2;
                    }
                }
                return interfaceC665370Q7zLIZ;
            }

            {
                this.LIZ = interfaceC1554770qYt;
                this.LIZJ = r0;
            }
        };
    }

    public void LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C1554890qZ5 tree;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = LJIIIIZZ();
        if (Intrinsics.LJFF(interfaceC665370Q7zLJIIIIZZ, interfaceC665370Q7z)) {
            return;
        }
        C1557550qdN.LIZ("vprovider_provide", new C1554650qYh(this, interfaceC665370Q7z));
        GScope gScope = GScope.LL;
        if (!Intrinsics.LJFF(interfaceC665370Q7zLJIIIIZZ, gScope) && interfaceC665370Q7zLJIIIIZZ != null && (tree = interfaceC665370Q7zLJIIIIZZ.getTree()) != null) {
            tree.LJI();
        }
        this.LIZJ = new C1554800qYw(interfaceC665370Q7z, false);
        if (C1557550qdN.LJ) {
            ((ArrayList) interfaceC665370Q7z.getTree().LIZLLL).add(this.LIZ);
        }
        if (!Intrinsics.LJFF(interfaceC665370Q7z, gScope)) {
            interfaceC665370Q7z.getTree().LJ();
        }
    }

    public final void LIZJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C1554890qZ5 tree;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = LJIIIIZZ();
        if (Intrinsics.LJFF(interfaceC665370Q7zLJIIIIZZ, interfaceC665370Q7z)) {
            return;
        }
        C1557550qdN.LIZ("vprovider_provide", new C1554650qYh(this, interfaceC665370Q7z));
        GScope gScope = GScope.LL;
        if (!Intrinsics.LJFF(interfaceC665370Q7zLJIIIIZZ, gScope) && interfaceC665370Q7zLJIIIIZZ != null && (tree = interfaceC665370Q7zLJIIIIZZ.getTree()) != null) {
            tree.LJI();
        }
        this.LIZJ = new C1554800qYw(interfaceC665370Q7z, true);
        if (C1557550qdN.LJ) {
            ((ArrayList) interfaceC665370Q7z.getTree().LIZLLL).add(this.LIZ);
        }
        if (!Intrinsics.LJFF(interfaceC665370Q7z, gScope)) {
            interfaceC665370Q7z.getTree().LJ();
        }
    }

    public final void LIZLLL(String str, final InterfaceC2753014t interfaceC2753014t, Class cls) {
        InterfaceC1555100qZQ interfaceC1555100qZQ;
        Object host = this.LIZ.getHost();
        if (host != null && (host instanceof C199Y)) {
            C199Y c199y = (C199Y) host;
            Lifecycle lifecycle = c199y.getLifecycle();
            if ((lifecycle instanceof AbstractC1563340qmi) && ((AbstractC1563340qmi) lifecycle).LJI(EnumC682280QpW.VSCOPE_ATTACH)) {
                c199y.throwSAFLifecycleCheckException("attach ability to ActivityScope", true, false);
            }
        }
        C1554820qYy c1554820qYy = new C1554820qYy(cls, str);
        Object obj = ((ConcurrentHashMap) this.LIZIZ).get(c1554820qYy);
        if ((obj instanceof InterfaceC1555100qZQ) && (interfaceC1555100qZQ = (InterfaceC1555100qZQ) obj) != null) {
            interfaceC1555100qZQ.LIZIZ(new C1554910qZ7(interfaceC2753014t));
            return;
        }
        C1557550qdN.LIZ("vprovider_bind", new C1554900qZ6(this, c1554820qYy, interfaceC2753014t, cls));
        InterfaceC1555100qZQ<T> interfaceC1555100qZQ2 = new InterfaceC1555100qZQ<T>(interfaceC2753014t) { // from class: X.0qsi
            public final C11PQ<T> LIZ;
            public final C19475711Hn LIZIZ;
            public final List<InterfaceC420801kM> LIZJ;

            @Override // X.InterfaceC1555100qZQ
            public final void destroy() {
                Iterator<InterfaceC420801kM> it2 = this.LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().dispose();
                }
            }

            @Override // X.InterfaceC1555100qZQ
            public final T getSource() {
                return this.LIZ.LJLZ();
            }

            {
                C11PQ<T> c11pqLJLLLLLL = C11PQ.LJLLLLLL(interfaceC2753014t);
                this.LIZ = c11pqLJLLLLLL;
                this.LIZIZ = new C19475711Hn(c11pqLJLLLLLL);
                this.LIZJ = new ArrayList();
            }

            @Override // X.InterfaceC1555100qZQ
            public final C11JF LIZ(C09JN c09jn) {
                InterfaceC420801kM interfaceC420801kMLJJLJLI = this.LIZIZ.LJJLJLI(new AfS172S0100000_3(c09jn, 95));
                ((ArrayList) this.LIZJ).add(interfaceC420801kMLJJLJLI);
                return (C11JF) interfaceC420801kMLJJLJLI;
            }

            @Override // X.InterfaceC1555100qZQ
            public final void LIZIZ(Function1<? super T, ? extends T> function1) {
                this.LIZ.onNext(function1.invoke(getSource()));
            }
        };
        ((ConcurrentHashMap) this.LIZIZ).put(c1554820qYy, interfaceC1555100qZQ2);
        interfaceC1555100qZQ2.LIZIZ(new C1554920qZ8(interfaceC2753014t));
    }

    public final <T extends InterfaceC2753014t> InterfaceC1555100qZQ<T> LJII(C1554820qYy<T> c1554820qYy, List<C1554890qZ5> list, InterfaceC1554780qYu interfaceC1554780qYu) {
        InterfaceC1555100qZQ<T> interfaceC1555100qZQ;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.contains(this)) {
            C1557550qdN.LIZ("vprovider_provide", new C1554830qYz(c1554820qYy, this));
            return null;
        }
        if (!((ConcurrentHashMap) this.LIZIZ).containsKey(c1554820qYy) && !Intrinsics.LJFF(this, C1554930qZ9.LJ)) {
            Object host = this.LIZ.getHost();
            if ((host instanceof InterfaceC687720QyI) && ((InterfaceC687720QyI) host).Pk()) {
                C1557550qdN.LIZ("vprovider_provide", new C1554840qZ0(this, host, c1554820qYy));
                return null;
            }
            C1557550qdN.LIZ("vprovider_provide", new AwS425S0200000_24((C1554820qYy) c1554820qYy, this, (C1554890qZ5) 98));
            arrayList.add(this);
            if (interfaceC1554780qYu != null && interfaceC1554780qYu.LIZ(this.LIZJ)) {
                return null;
            }
            return LJIIIIZZ().getTree().LJII(c1554820qYy, list, interfaceC1554780qYu);
        }
        Object obj = ((ConcurrentHashMap) this.LIZIZ).get(c1554820qYy);
        if (!(obj instanceof InterfaceC1555100qZQ) || (interfaceC1555100qZQ = (InterfaceC1555100qZQ) obj) == null) {
            return null;
        }
        C1557550qdN.LIZ("vprovider_provide", new AwS425S0200000_24((C1554820qYy) c1554820qYy, this, (C1554890qZ5) 99));
        InterfaceC1554870qZ3 interfaceC1554870qZ3 = C1557550qdN.LIZJ;
        if (interfaceC1554870qZ3 != null) {
            interfaceC1554870qZ3.LIZIZ(this, c1554820qYy, interfaceC1555100qZQ);
        }
        return interfaceC1555100qZQ;
    }

    public final <T extends InterfaceC2753014t> InterfaceC1555100qZQ<T> LJIIIZ(String str, Class<T> cls, InterfaceC1554780qYu interfaceC1554780qYu) {
        InterfaceC1555100qZQ<T> interfaceC1555100qZQLIZLLL;
        C1554820qYy<T> c1554820qYy = new C1554820qYy<>(cls, str);
        InterfaceC1554870qZ3 interfaceC1554870qZ3 = C1557550qdN.LIZJ;
        if (interfaceC1554870qZ3 != null) {
            interfaceC1555100qZQLIZLLL = interfaceC1554870qZ3.LIZLLL(c1554820qYy, this);
        } else {
            interfaceC1555100qZQLIZLLL = null;
        }
        if (interfaceC1555100qZQLIZLLL != null) {
            C1557550qdN.LIZ("vprovider_provide", new C1554860qZ2(this, interfaceC1555100qZQLIZLLL));
            return interfaceC1555100qZQLIZLLL;
        }
        C1557550qdN.LIZ("vprovider_provide", new C1554880qZ4(c1554820qYy, this));
        try {
            return LJII(c1554820qYy, new ArrayList(), interfaceC1554780qYu);
        } catch (StackOverflowError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("vProvider: stack over flow when provide: ");
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = this.LIZ;
            ArrayList arrayList = new ArrayList();
            int i = 1;
            while (!Intrinsics.LJFF(interfaceC665370Q7zLJIIIIZZ, GScope.LL)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("scope: ");
                sbLIZ2.append(interfaceC665370Q7zLJIIIIZZ);
                sbLIZ2.append(", host: ");
                sbLIZ2.append(interfaceC665370Q7zLJIIIIZZ.getHost());
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC665370Q7zLJIIIIZZ = interfaceC665370Q7zLJIIIIZZ.getTree().LJIIIIZZ();
                i++;
                if (i >= 21) {
                    break;
                }
            }
            sbLIZ.append(arrayList.toString());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
