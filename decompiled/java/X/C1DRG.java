package X;

import Y.ARunnableS119S0100000_19;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1DRG, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DRG {
    public static final C20595084z LJIJ = new C20595084z();
    public final InterfaceC2255791DQz LIZ;
    public final boolean LIZIZ;
    public final C1DRL LIZJ;
    public final C1DRG LIZLLL;
    public final Map<C1287930jcV, AbstractC20611515l3<?>> LJ;
    public final Map<Class<Object>, C00DL<?, ?>> LJFF;
    public final Map<C00FZ, Map<?, AbstractC20611515l3<?>>> LJI;
    public final Map<C00FY, List<AbstractC20611515l3<?>>> LJII;
    public final Map<C047200Fa, Set<AbstractC20611515l3<?>>> LJIIIIZZ;
    public final Map<C1287930jcV, List<C1287930jcV>> LJIIIZ;
    public final Map<C1287930jcV, C1DRQ> LJIIJ;
    public final Map<C1287930jcV, Object> LJIIJJI;
    public final Map<C1287930jcV, List<InterfaceC1287950jcX<?>>> LJIIL;
    public final Set<C1287930jcV> LJIILIIL;
    public final C1DRR<Type, String> LJIILJJIL;
    public final C1DRN LJIILL;
    public volatile RuntimeException LJIILLIIL;
    public final C1287940jcW LJIIZILJ;

    public final String LIZIZ() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ.getValue().toString());
        sb.append("(*)");
        for (InterfaceC2255791DQz interfaceC2255791DQzLIZIZ = this.LIZ.LIZIZ(); interfaceC2255791DQzLIZIZ != null; interfaceC2255791DQzLIZIZ = interfaceC2255791DQzLIZIZ.LIZIZ()) {
            sb.append(" -> ");
            sb.append(interfaceC2255791DQzLIZIZ.getValue().toString());
        }
        return sb.toString();
    }

    public C1DRG(C1DRF... c1drfArr) {
        this(new C1664660tQ8(""), null, false, c1drfArr);
    }

    public final <T> void LIZ(C1287930jcV c1287930jcV) {
        if (this.LJ.get(c1287930jcV) != null) {
            ((HashSet) this.LJIILIIL).add(c1287930jcV);
            return;
        }
        C1DRG c1drg = this.LIZLLL;
        if (c1drg == null) {
            return;
        }
        c1drg.LIZ(c1287930jcV);
    }

    public final boolean LIZJ(Class cls) {
        return LIZLLL(new C1287930jcV(null, cls));
    }

    public final boolean LIZLLL(C1287930jcV c1287930jcV) {
        if (this.LJ.get(c1287930jcV) != null) {
            return true;
        }
        C1DRG c1drg = this.LIZLLL;
        if (c1drg != null) {
            return c1drg.LIZLLL(c1287930jcV);
        }
        return false;
    }

    public final <T> T LJI(Class<T> cls) {
        return (T) LJII(cls, null);
    }

    public final <T> C1DRH<T> LJIIIZ(C1287930jcV c1287930jcV) {
        AbstractC20611515l3<?> abstractC20611515l3 = this.LJ.get(c1287930jcV);
        if (abstractC20611515l3 != null) {
            return new C1DRH<>(this, abstractC20611515l3, this.LJIIJ, this.LJIIIZ, this.LJIIZILJ);
        }
        C1DRG c1drg = this.LIZLLL;
        if (c1drg != null) {
            return c1drg.LJIIIZ(c1287930jcV);
        }
        return null;
    }

    public final <T> T LJIIJ(Class<T> cls) {
        return (T) LJIIL(null, cls);
    }

    public final <T> void LJIILL(C1287930jcV c1287930jcV) {
        if (this.LJ.get(c1287930jcV) != null) {
            ((HashSet) this.LJIILIIL).remove(c1287930jcV);
            return;
        }
        C1DRG c1drg = this.LIZLLL;
        if (c1drg == null) {
            return;
        }
        c1drg.LJIILL(c1287930jcV);
    }

    public final <T> T LJ(C1287930jcV c1287930jcV, C1DRO<C1DRH<T>> c1dro) {
        if (this.LJIILLIIL == null) {
            try {
                this.LJIILJJIL.getClass();
                return (T) LJFF(c1287930jcV, c1dro);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LJIILLIIL = e;
                C20595084z c20595084z = LJIJ;
                C786410Ut5.LJL(c20595084z.LIZ, new ARunnableS119S0100000_19(e, 155));
                throw e;
            }
        }
        throw this.LJIILLIIL;
    }

    public final synchronized <T> T LJFF(C1287930jcV c1287930jcV, C1DRO<C1DRH<T>> c1dro) {
        T t = (T) ((HashMap) this.LJIIJJI).get(c1287930jcV);
        if (t != null) {
            return t;
        }
        C1DRH<?> c1drhLIZ = c1dro.LIZ();
        if (c1drhLIZ == null) {
            return null;
        }
        AbstractC20611515l3<T> abstractC20611515l3 = c1drhLIZ.LIZIZ;
        if (abstractC20611515l3 == null) {
            return null;
        }
        boolean z = false;
        if (this.LJIIJ.containsKey(c1287930jcV)) {
            Set<C1287930jcV> setKeySet = ((LinkedHashMap) this.LJIIJ).keySet();
            StringBuilder sb = new StringBuilder();
            for (C1287930jcV c1287930jcV2 : setKeySet) {
                C1DRQ c1drq = (C1DRQ) ((LinkedHashMap) this.LJIIJ).get(c1287930jcV2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1287930jcV2.LIZ());
                sbLIZ.append(" ");
                sbLIZ.append(c1drq.LIZ);
                sbLIZ.append("\n ╚> ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            sb.append(c1287930jcV.LIZ());
            final String strJ4 = C786410Ut5.j4("circle dependency: \n %s", new Object[]{sb.toString()});
            throw new RuntimeException(strJ4) { // from class: X.1DRS
            };
        }
        if (abstractC20611515l3 instanceof C20611615l4) {
            this.LJIIJ.put(c1287930jcV, new C1DRQ("singleton"));
        } else {
            this.LJIIJ.put(c1287930jcV, new C1DRQ(""));
        }
        try {
            T tLIZIZ = abstractC20611515l3.LIZIZ(this.LIZJ.LIZ(c1drhLIZ));
            if (tLIZIZ != null) {
                if (!((HashMap) this.LJIIJJI).containsKey(c1287930jcV)) {
                    if (abstractC20611515l3 instanceof C20611615l4) {
                        ((HashMap) this.LJIIJJI).put(c1287930jcV, tLIZIZ);
                    }
                    abstractC20611515l3.LIZ(tLIZIZ, this);
                    if (abstractC20611515l3 instanceof C20611615l4) {
                        ((HashMap) this.LJIIJJI).remove(c1287930jcV);
                    }
                    this.LJIIJ.remove(c1287930jcV);
                    List<C1287930jcV> list = c1drhLIZ.LIZLLL.get(c1287930jcV);
                    if (list != null) {
                        Iterator<C1287930jcV> it2 = list.iterator();
                        while (it2.hasNext()) {
                            this.LJIIJ.remove(it2.next());
                        }
                    }
                    InterfaceC1287970jcZ interfaceC1287970jcZ = c1drhLIZ.LJ;
                    if (interfaceC1287970jcZ != null) {
                        if (this.LJIIJ.size() != 0) {
                            z = true;
                        }
                        interfaceC1287970jcZ.LIZ(c1287930jcV, tLIZIZ, z);
                    }
                    return tLIZIZ;
                }
                throw new C1DRT("Why duplicate key!!!");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Provider should return nonnull value ");
            sbLIZ2.append(abstractC20611515l3);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIJ.remove(c1287930jcV);
            List<C1287930jcV> list2 = c1drhLIZ.LIZLLL.get(c1287930jcV);
            if (list2 != null) {
                Iterator<C1287930jcV> it3 = list2.iterator();
                while (it3.hasNext()) {
                    this.LJIIJ.remove(it3.next());
                }
            }
            throw th;
        }
    }

    public final <T> T LJII(Class<T> cls, String str) {
        if (this.LJIILLIIL == null) {
            try {
                return (T) LJIIIIZZ(str, cls);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LJIILLIIL = e;
                C20595084z c20595084z = LJIJ;
                C786410Ut5.LJL(c20595084z.LIZ, new ARunnableS119S0100000_19(e, 154));
                throw e;
            }
        }
        throw this.LJIILLIIL;
    }

    public final Object LJIIIIZZ(String str, Type type) {
        Object objLJIIL = LJIIL(str, type);
        if (objLJIIL != null) {
            return objLJIIL;
        }
        StringBuilder sb = new StringBuilder();
        C1287930jcV c1287930jcV = new C1287930jcV(str, type);
        if (this.LJIIJ.size() > 0) {
            for (C1287930jcV c1287930jcV2 : ((LinkedHashMap) this.LJIIJ).keySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1287930jcV2.LIZ());
                sbLIZ.append("\n ╚> ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            sb.append(c1287930jcV.LIZ());
            throw new C1664780tQK(C786410Ut5.j4("Dependency not registered: \n %s \n ObjectContainer dependency hierarchy: %s", new Object[]{sb.toString(), LIZIZ()}));
        }
        sb.append(c1287930jcV.LIZ());
        throw new C1664780tQK(C786410Ut5.j4("Dependency not registered %s \n ObjectContainer dependency hierarchy: %s", new Object[]{sb.toString(), LIZIZ()}));
    }

    public final <T> T LJIIJJI(Class<T> cls, String str) {
        return (T) LJIIL(str, cls);
    }

    public final Object LJIIL(String str, Type type) {
        if (type == C1DRG.class) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        }
        C1287930jcV c1287930jcV = new C1287930jcV(str, type);
        return LJ(c1287930jcV, new C1DRV(LJIIIZ(c1287930jcV)));
    }

    public final AbstractC1664760tQI LJIILIIL(String str, Type type) {
        if (type == C1DRG.class) {
            if (TextUtils.isEmpty(str)) {
                return new AbstractC1664760tQI<Object>() { // from class: X.1DRK
                    @Override // X.AbstractC1664760tQI
                    public final Object LIZ() {
                        return this.LIZIZ;
                    }
                };
            }
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        }
        final C1287930jcV c1287930jcV = new C1287930jcV(str, type);
        final C1DRH c1drhLJIIIZ = LJIIIZ(c1287930jcV);
        if (c1drhLJIIIZ == null) {
            return null;
        }
        return new AbstractC1664760tQI<Object>() { // from class: X.1DRI
            @Override // X.AbstractC1664760tQI
            public final Object LIZ() {
                Object objLJ = this.LIZLLL.LJ(c1287930jcV, new C1DRV(c1drhLJIIIZ));
                if (objLJ != null) {
                    return objLJ;
                }
                throw new C1DRT("impossible");
            }
        };
    }

    public final boolean LJIILJJIL(C1287930jcV c1287930jcV, AbstractC2255761DQw abstractC2255761DQw) {
        if (this.LJ.get(c1287930jcV) != null) {
            List arrayList = (List) ((HashMap) this.LJIIL).get(c1287930jcV);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.LJIIL).put(c1287930jcV, arrayList);
            }
            arrayList.add(abstractC2255761DQw);
            return true;
        }
        C1DRG c1drg = this.LIZLLL;
        if (c1drg != null) {
            return c1drg.LJIILJJIL(c1287930jcV, abstractC2255761DQw);
        }
        return false;
    }

    public final <T> boolean LJIILLIIL(C1287930jcV c1287930jcV, InterfaceC1287950jcX<T> interfaceC1287950jcX) {
        if (this.LJ.get(c1287930jcV) != null) {
            List list = (List) ((HashMap) this.LJIIL).get(c1287930jcV);
            if (list == null) {
                return false;
            }
            return list.remove(interfaceC1287950jcX);
        }
        C1DRG c1drg = this.LIZLLL;
        if (c1drg == null) {
            return false;
        }
        return c1drg.LJIILLIIL(c1287930jcV, interfaceC1287950jcX);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0jcW] */
    public C1DRG(InterfaceC2255791DQz interfaceC2255791DQz, C1DRG c1drg, boolean z, C1DRF... c1drfArr) {
        this.LJIIJ = new LinkedHashMap();
        this.LJIIJJI = new HashMap();
        this.LJIIL = new HashMap();
        this.LJIILIIL = new HashSet();
        this.LJIILJJIL = new C1DRR<>();
        this.LJIILL = new C1DRN();
        this.LJIILLIIL = null;
        this.LJIIZILJ = new InterfaceC1287970jcZ() { // from class: X.0jcW
            @Override // X.InterfaceC1287970jcZ
            public final void LIZ(C1287930jcV c1287930jcV, Object obj, boolean z2) {
                List list;
                if (((HashMap) this.LIZ.LJIIL).size() != 0 && !((HashSet) this.LIZ.LJIILIIL).contains(c1287930jcV) && (list = (List) ((HashMap) this.LIZ.LJIIL).get(c1287930jcV)) != null && list.size() > 0) {
                    if (list.size() == 1) {
                        ((InterfaceC1287950jcX) ListProtector.get(list, 0)).LIZ((Class) c1287930jcV.LIZ, obj, c1287930jcV.LIZIZ, z2);
                        return;
                    }
                    Iterator it2 = new ArrayList(list).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1287950jcX) it2.next()).LIZ((Class) c1287930jcV.LIZ, obj, c1287930jcV.LIZIZ, z2);
                    }
                }
            }
        };
        this.LIZ = interfaceC2255791DQz;
        this.LIZLLL = c1drg;
        this.LIZIZ = z;
        if (z) {
            this.LIZJ = new C1DRL() { // from class: X.1DRM
                @Override // X.C1DRL
                public final C1DRG LIZ(C1DRH c1drh) {
                    C1DRG c1drg2 = this.LIZ;
                    c1drg2.getClass();
                    C1DRG c1drg3 = c1drh.LIZ;
                    if (c1drg3.LIZIZ) {
                        return c1drg3;
                    }
                    return c1drg2;
                }
            };
        } else {
            this.LIZJ = new C1DRL() { // from class: X.1DRP
                @Override // X.C1DRL
                public final C1DRG LIZ(C1DRH c1drh) {
                    C1DRG c1drg2 = this.LIZ;
                    c1drg2.getClass();
                    return c1drg2;
                }
            };
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (C1DRF c1drf : c1drfArr) {
            for (Map.Entry entry : ((LinkedHashMap) c1drf.LIZJ).entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("duplicate already contain ");
                    sbLIZ.append(((C1287930jcV) entry.getKey()).LIZ());
                    sbLIZ.append(" ");
                    sbLIZ.append(entry.getValue());
                    throw new C1DRU(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            for (Map.Entry entry2 : ((LinkedHashMap) c1drf.LIZLLL).entrySet()) {
                if (!linkedHashMap2.containsKey(entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("duplicate already contain ");
                    sbLIZ2.append(entry2.getKey());
                    sbLIZ2.append(" ");
                    sbLIZ2.append(entry2.getValue());
                    throw new C1DRU(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            for (Map.Entry entry3 : ((LinkedHashMap) c1drf.LJ).entrySet()) {
                if (!linkedHashMap3.containsKey(entry3.getKey())) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("duplicate already contain ");
                    sbLIZ3.append(entry3.getKey());
                    sbLIZ3.append(" ");
                    sbLIZ3.append(entry3.getValue());
                    throw new C1DRU(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            for (Map.Entry entry4 : ((LinkedHashMap) c1drf.LJI).entrySet()) {
                if (!linkedHashMap4.containsKey(entry4.getKey())) {
                    linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("duplicate already contain ");
                    sbLIZ4.append(entry4.getKey());
                    sbLIZ4.append(" ");
                    sbLIZ4.append(entry4.getValue());
                    throw new C1DRU(C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
            for (Map.Entry entry5 : ((LinkedHashMap) c1drf.LJFF).entrySet()) {
                if (!linkedHashMap5.containsKey(entry5.getKey())) {
                    linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("duplicate already contain ");
                    sbLIZ5.append(entry5.getKey());
                    sbLIZ5.append(" ");
                    sbLIZ5.append(entry5.getValue());
                    throw new C1DRU(C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
            for (Map.Entry entry6 : ((HashMap) c1drf.LJII).entrySet()) {
                if (linkedHashMap6.containsKey(entry6.getKey())) {
                    ((List) linkedHashMap6.get(entry6.getKey())).addAll((Collection) entry6.getValue());
                } else {
                    linkedHashMap6.put(entry6.getKey(), entry6.getValue());
                }
            }
            C1DRR<Type, String> c1drr = this.LJIILJJIL;
            C1DRR<Type, String> c1drr2 = c1drf.LJIIIIZZ;
            c1drr.getClass();
            c1drr2.getClass();
            C1DRN c1drn = this.LJIILL;
            C1DRN c1drn2 = c1drf.LJIIIZ;
            c1drn.getClass();
            C1DRJ c1drj = c1drn2.LIZ;
            if (c1drj != null) {
                if (c1drn.LIZ == null) {
                    c1drn.LIZ = c1drj;
                }
                C1DRJ c1drj2 = c1drn.LIZIZ;
                if (c1drj2 != null) {
                    c1drj2.LIZIZ = c1drj;
                }
                c1drn.LIZIZ = c1drn2.LIZIZ;
            }
        }
        Map<C1287930jcV, AbstractC20611515l3<?>> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.LJ = mapUnmodifiableMap;
        this.LJFF = Collections.unmodifiableMap(linkedHashMap2);
        this.LJI = Collections.unmodifiableMap(linkedHashMap3);
        this.LJII = Collections.unmodifiableMap(linkedHashMap4);
        this.LJIIIIZZ = Collections.unmodifiableMap(linkedHashMap5);
        this.LJIIIZ = Collections.unmodifiableMap(linkedHashMap6);
        if (this.LJIILL.LIZ != null) {
            LinkedList linkedList = new LinkedList();
            Iterator<C1287930jcV> it2 = mapUnmodifiableMap.keySet().iterator();
            while (it2.hasNext()) {
                linkedList.add(it2.next().LIZ);
            }
            Iterator<Class<Object>> it3 = this.LJFF.keySet().iterator();
            while (it3.hasNext()) {
                linkedList.add(it3.next());
            }
            C1DRJ c1drj3 = this.LJIILL.LIZ;
            if (c1drj3 != null) {
                c1drj3.LIZ(linkedList);
            }
        }
    }
}
