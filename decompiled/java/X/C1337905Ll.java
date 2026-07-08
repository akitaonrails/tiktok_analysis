package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05Ll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1337905Ll<MODEL> extends C1440305kP<MODEL> {
    public static final ConcurrentHashMap<String, Double> LJIIJ = new ConcurrentHashMap<>();
    public final List<InterfaceC1333005Jo<MODEL>> LJ;
    public final C1601460rmC LJFF;
    public final MODEL LJI;
    public final AbstractC1604130rqV LJII;
    public final C1DEU LJIIIIZZ;
    public final C1DEU LJIIIZ;

    @Override // X.C1440305kP
    public final void LIZ() {
        Object c098200Yq;
        try {
            System.currentTimeMillis();
            C23250099c.LJ(C23271099x.INSTANCE, new C1338005Lm(this, null));
            System.currentTimeMillis();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "AdaptiveParallelRequestChain#proceed");
        }
    }

    public final void LIZJ(InterfaceC1333005Jo<?> interfaceC1333005Jo) {
        Object c098200Yq;
        double dDoubleValue;
        String name = interfaceC1333005Jo.getClass().getName();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            interfaceC1333005Jo.LIZ(this);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            AbstractC1604130rqV abstractC1604130rqV = this.LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("processor error: ");
            sbLIZ.append(name);
            abstractC1604130rqV.LJI(C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
            C1AF0.LJFF(thM5exceptionOrNullimpl, "Adaptive#doProcess");
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        ConcurrentHashMap<String, Double> concurrentHashMap = LJIIJ;
        Double d = concurrentHashMap.get(name);
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = jCurrentTimeMillis2;
        }
        if (dDoubleValue == 0.0d) {
            concurrentHashMap.put(name, Double.valueOf(jCurrentTimeMillis2));
        } else {
            concurrentHashMap.put(name, Double.valueOf((jCurrentTimeMillis2 * 0.15d) + (dDoubleValue * 0.85d)));
        }
    }

    public final Object LIZIZ(double d, C1DEU c1deu, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<InterfaceC1333005Jo<MODEL>> list = this.LJ;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1333005Jo<MODEL> interfaceC1333005Jo : list) {
            Double d2 = LJIIJ.get(interfaceC1333005Jo.getClass().getName());
            if (d2 != null && d2.doubleValue() < d) {
                arrayList2.add(interfaceC1333005Jo);
            } else {
                arrayList.add(interfaceC1333005Jo);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.getFirst();
        List list3 = (List) pair.getSecond();
        if (list2.isEmpty()) {
            Iterator<InterfaceC1333005Jo<MODEL>> it2 = this.LJ.iterator();
            while (it2.hasNext()) {
                LIZJ(it2.next());
            }
            return Unit.LIZ;
        }
        Object objLJ = C2296808zG.LJ(new C1337605Li(list3, list2, c1deu, this, null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1337905Ll(List<? extends InterfaceC1333005Jo<MODEL>> list, C1601460rmC c1601460rmC, MODEL model, AbstractC1604130rqV abstractC1604130rqV) {
        super(list, c1601460rmC, model, abstractC1604130rqV);
        this.LJ = list;
        this.LJFF = c1601460rmC;
        this.LJI = model;
        this.LJII = abstractC1604130rqV;
        this.LJIIIIZZ = C2252461DEe.LIZ(2);
        this.LJIIIZ = C2252461DEe.LIZ(4);
    }
}
