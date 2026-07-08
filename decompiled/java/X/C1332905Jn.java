package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05Jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1332905Jn<MODEL> extends C1440305kP<MODEL> {
    public final List<InterfaceC1333005Jo<MODEL>> LJ;
    public final MODEL LJFF;
    public final AbstractC1604130rqV LJI;

    public final void LIZJ() throws Throwable {
        C1332705Jl c1332705Jl = C1332705Jl.LIZ;
        List<InterfaceC1333005Jo<MODEL>> list = this.LJ;
        c1332705Jl.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1332705Jl.LIZJ;
        Object pair = linkedHashMap.get(list);
        if (pair == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC1333005Jo<MODEL> interfaceC1333005Jo : list) {
                if (interfaceC1333005Jo.getType() == 0) {
                    arrayList.add(interfaceC1333005Jo);
                } else {
                    arrayList2.add(interfaceC1333005Jo);
                }
            }
            pair = new Pair(arrayList, arrayList2);
            linkedHashMap.put(list, pair);
        }
        Pair pair2 = (Pair) pair;
        List list2 = (List) pair2.getFirst();
        List list3 = (List) pair2.getSecond();
        C1332705Jl.LIZ.getClass();
        C23250099c.LJ((AbstractC23273099z) C1332705Jl.LIZIZ.getValue(), new C1332605Jk(this, list2, list3, null));
    }

    @Override // X.C1440305kP
    public final void LIZ() {
        Object c098200Yq;
        try {
            LIZJ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "ParallelRequestChain#parallelProcess");
        }
    }

    public final void LIZIZ(InterfaceC1333005Jo<?> interfaceC1333005Jo) {
        Object c098200Yq;
        try {
            c098200Yq = null;
            if ((interfaceC1333005Jo instanceof InterfaceC1333005Jo) && interfaceC1333005Jo != null) {
                interfaceC1333005Jo.LIZ(this);
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            AbstractC1604130rqV abstractC1604130rqV = this.LJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("processor process error. processor:");
            sbLIZ.append(interfaceC1333005Jo.getClass().getName());
            abstractC1604130rqV.LJI(C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
            C1AF0.LJFF(thM5exceptionOrNullimpl, "ParallelRequestChain#doProcess");
            C1332705Jl c1332705Jl = C1332705Jl.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("refactor processor process error. processor:");
            sbLIZ2.append(interfaceC1333005Jo.getClass().getName());
            sbLIZ2.append(". error:");
            sbLIZ2.append(thM5exceptionOrNullimpl);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1332705Jl.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1332905Jn(List<? extends InterfaceC1333005Jo<MODEL>> list, C1601460rmC c1601460rmC, MODEL model, AbstractC1604130rqV abstractC1604130rqV) {
        super(list, c1601460rmC, model, abstractC1604130rqV);
        this.LJ = list;
        this.LJFF = model;
        this.LJI = abstractC1604130rqV;
    }
}
