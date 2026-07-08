package X;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jg5.AvS542S0100000_25;

/* JADX INFO: renamed from: X.1DRF, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DRF {
    public final InterfaceC2255791DQz LIZ;
    public final C1DRG LIZIZ;
    public final Map<C1287930jcV, AbstractC20611515l3<?>> LIZJ;
    public final Map<Class<Object>, C00DL<?, ?>> LIZLLL;
    public final Map<C00FZ, Map<?, AbstractC20611515l3<?>>> LJ;
    public final Map<C047200Fa, Set<AbstractC20611515l3<?>>> LJFF;
    public final Map<C00FY, List<AbstractC20611515l3<?>>> LJI;
    public final Map<C1287930jcV, List<C1287930jcV>> LJII;
    public final C1DRR<Type, String> LJIIIIZZ;
    public final C1DRN LJIIIZ;
    public boolean LJIIJ;

    public C1DRF() {
        this(new C1664660tQ8(""), null);
    }

    public final C1DRG LIZIZ() {
        return new C1DRG(this.LIZ, this.LIZIZ, this.LJIIJ, this);
    }

    public final void LIZLLL(InterfaceC1153404fE interfaceC1153404fE) {
        C1DRN c1drn = this.LJIIIZ;
        c1drn.getClass();
        C1DRJ c1drj = new C1DRJ(interfaceC1153404fE);
        if (c1drn.LIZ == null) {
            c1drn.LIZ = c1drj;
        }
        C1DRJ c1drj2 = c1drn.LIZIZ;
        if (c1drj2 != null) {
            c1drj2.LIZIZ = c1drj;
        }
        c1drn.LIZIZ = c1drj;
    }

    public C1DRF(C1664660tQ8 c1664660tQ8, C1DRG c1drg) {
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
        this.LJII = new HashMap();
        this.LJIIIIZZ = new C1DRR<>();
        this.LJIIIZ = new C1DRN();
        this.LIZ = c1664660tQ8;
        this.LIZIZ = c1drg;
        if (c1drg != null) {
            c1664660tQ8.LIZIZ = c1drg.LIZ;
        }
    }

    public final void LIZ(Class cls, Class cls2) {
        C1287930jcV c1287930jcV = new C1287930jcV(null, cls);
        C1287930jcV c1287930jcV2 = new C1287930jcV(null, cls2);
        List arrayList = (List) ((HashMap) this.LJII).get(c1287930jcV);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) this.LJII).put(c1287930jcV, arrayList);
        }
        arrayList.add(c1287930jcV2);
    }

    public final <T> C21308518aB<T> LIZJ(final Class<T> cls, final String str, AbstractC20611515l3<T> abstractC20611515l3) {
        C1287930jcV c1287930jcV = new C1287930jcV(str, cls);
        if (!this.LIZJ.containsKey(c1287930jcV)) {
            this.LIZJ.put(c1287930jcV, abstractC20611515l3);
            return (C21308518aB<T>) new C21308418aA<CHILD>(this, cls, str) { // from class: X.18aB
            };
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("duplicate already contain ");
        sbLIZ.append(cls);
        sbLIZ.append(" ");
        sbLIZ.append(((LinkedHashMap) this.LIZJ).get(c1287930jcV));
        sbLIZ.append(" in ObjectContainerBuilder(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(")");
        throw new C1DRU(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C21308518aB LJ(Class cls, String str, Object obj) {
        return LIZJ(cls, str, new C20611615l4(new AvS542S0100000_25(obj, 44)));
    }

    public final <T> C21308518aB<T> LJFF(Class<T> cls, String str, AbstractC20611515l3<T> abstractC20611515l3) {
        return LIZJ(cls, str, new C20611615l4(abstractC20611515l3));
    }
}
