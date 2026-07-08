package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Nen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599190Nen implements InterfaceC599480NfG {
    public final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    public final ConcurrentHashMap<String, C599170Nel> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Set<C09AE>> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC599180Nem> LIZLLL = new ConcurrentHashMap<>();
    public final Map<Object, C599210Nep> LJ = new LinkedHashMap();
    public final C2252331DDr LJFF;
    public final AnonymousClass0950 LJI;

    public C599190Nen() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 64, null, 4);
        this.LJFF = c2252331DDrLIZIZ;
        this.LJI = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    @Override // X.InterfaceC599480NfG
    public final void jb(Object obj) {
        C599210Nep c599210Nep = (C599210Nep) ((LinkedHashMap) this.LJ).get(obj);
        if (c599210Nep != null) {
            Iterator it2 = ((ConcurrentHashMap) c599210Nep.LIZIZ).values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((Set) it2.next()).iterator();
                while (it3.hasNext()) {
                    ((C599220Neq) it3.next()).LIZIZ.LIZIZ(null);
                }
            }
            for (Object obj2 : c599210Nep.LIZLLL) {
                this.LIZIZ.remove(obj2);
                Set<C09AE> set = this.LIZJ.get(obj2);
                if (set != null) {
                    Iterator<T> it4 = set.iterator();
                    while (it4.hasNext()) {
                        ((C09AE) it4.next()).LIZIZ(null);
                    }
                }
                this.LIZJ.remove(obj2);
            }
        }
        this.LJ.remove(obj);
    }

    @Override // X.InterfaceC599480NfG
    public final void H6(Object obj, String str) {
        C599210Nep c599210Nep = (C599210Nep) ((LinkedHashMap) this.LJ).get(obj);
        if (c599210Nep == null || !c599210Nep.LIZLLL.contains(str)) {
            return;
        }
        Set<C09AE> set = this.LIZJ.get(str);
        if (set != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                ((C09AE) it2.next()).LIZIZ(null);
            }
        }
        this.LIZJ.remove(str);
        this.LIZIZ.remove(str);
        Set<String> set2 = c599210Nep.LIZLLL;
        if (C19719512Dh.LJIIIIZZ(set2) && set2 != null) {
            set2.remove(str);
        }
        if (((ConcurrentHashMap) c599210Nep.LIZIZ).isEmpty() && c599210Nep.LIZLLL.isEmpty()) {
            this.LJ.remove(obj);
        }
    }

    @Override // X.InterfaceC599480NfG
    public final void LIZIZ(Object obj, C599200Neo c599200Neo) {
        Object obj2;
        long jCurrentTimeMillis;
        Number number;
        Long lValueOf;
        Map<String, Object> map = c599200Neo.LIZLLL;
        if (map != null) {
            obj2 = map.get("paap_start_time");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Number) && (number = (Number) obj2) != null && (lValueOf = Long.valueOf(number.longValue())) != null) {
            jCurrentTimeMillis = lValueOf.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        c599200Neo.LJ = jCurrentTimeMillis;
        C599320Nf0.LIZ(c599200Neo.LIZ, EnumC599500NfI.EVENT, EnumC599160Nek.START, EnumC599330Nf1.PUBLISH, obj, null, null, 0L);
        C23250099c.LIZLLL(this.LIZ, null, null, new C01K6(new C10333042h(this, c599200Neo, null), null), 3);
    }

    @Override // X.InterfaceC599480NfG
    public final void Q(InterfaceC634840OvC interfaceC634840OvC, String str) {
        C599290Nex.LIZ(this, interfaceC634840OvC, str, new C598290NdL(interfaceC634840OvC, str, null));
    }

    @Override // X.InterfaceC599480NfG
    public final void U0(Object obj, String str) {
        Set set;
        ConcurrentHashMap concurrentHashMap;
        Set set2;
        C599210Nep c599210Nep = (C599210Nep) ((LinkedHashMap) this.LJ).get(obj);
        if (c599210Nep == null || (set = (Set) ((ConcurrentHashMap) c599210Nep.LIZIZ).get(str)) == null) {
            return;
        }
        Iterator it2 = C13LP.LLIIJI(set).iterator();
        while (it2.hasNext()) {
            ((C599220Neq) it2.next()).LIZIZ.LIZIZ(null);
        }
        Map<String, Set<C599220Neq>> map = c599210Nep.LIZIZ;
        if ((map instanceof ConcurrentHashMap) && (concurrentHashMap = (ConcurrentHashMap) map) != null && (set2 = (Set) concurrentHashMap.get(str)) != null) {
            set2.clear();
        }
        if (((ConcurrentHashMap) c599210Nep.LIZIZ).isEmpty() && c599210Nep.LIZLLL.isEmpty()) {
            this.LJ.remove(obj);
        }
    }

    @Override // X.InterfaceC599480NfG
    public final void LIZ(String str, Function2 function2, Object obj) {
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LIZ, null, null, new C599230Ner(this, str, obj, function2, null), 3);
        C599210Nep c599210Nep = (C599210Nep) ((LinkedHashMap) this.LJ).get(obj);
        if (c599210Nep == null) {
            c599210Nep = new C599210Nep();
            this.LJ.put(obj, c599210Nep);
        }
        Set<C599220Neq> setNewSetFromMap = c599210Nep.LIZ.get(str);
        if (setNewSetFromMap == null) {
            setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            c599210Nep.LIZ.put(str, setNewSetFromMap);
            if (setNewSetFromMap == null) {
                return;
            }
        }
        setNewSetFromMap.add(new C599220Neq(function2, anonymousClass0956LIZLLL));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059 A[PHI: r1
      0x0059: PHI (r1v3 java.util.Set<X.09AE>) = (r1v2 java.util.Set<X.09AE>), (r1v5 java.util.Set<X.09AE>) binds: [B:7:0x0047, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC599480NfG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r11, java.util.Map<java.lang.String, ? extends java.lang.Object> r12, java.util.Map<java.lang.String, ? extends java.lang.Object> r13, X.InterfaceC599180Nem r14) {
        /*
            r10 = this;
            r6 = r10
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Nel> r0 = r6.LIZIZ
            r3 = r11
            java.lang.Object r4 = r0.get(r3)
            X.0Nel r4 = (X.C599170Nel) r4
            r9 = 0
            r5 = r14
            if (r4 != 0) goto L2d
            X.05pC r2 = new X.05pC
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Method '"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "' not found"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = -1
            r2.<init>(r0, r1, r9)
            r5.LIZ(r2)
            return
        L2d:
            X.1DEx r0 = r4.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0Nej r2 = new X.0Nej
            r8 = r13
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0 = 3
            X.0956 r2 = X.C23250099c.LIZLLL(r1, r9, r9, r2, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<X.09AE>> r0 = r6.LIZJ
            java.lang.Object r1 = r0.get(r3)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L59
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<X.09AE>> r0 = r6.LIZJ
            r0.put(r3, r1)
            if (r1 == 0) goto L5c
        L59:
            r1.add(r2)
        L5c:
            kotlin.jvm.internal.AwS94S1200000_9 r1 = new kotlin.jvm.internal.AwS94S1200000_9
            r0 = 10
            r1.<init>(r6, r3, r2, r0)
            r2.LJII(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C599190Nen.LIZLLL(java.lang.String, java.util.Map, java.util.Map, X.0Nem):void");
    }

    @Override // X.InterfaceC599480NfG
    public final void q2(int i, String str, String str2, Map map) {
        InterfaceC599180Nem interfaceC599180Nem = this.LIZLLL.get(str);
        if (interfaceC599180Nem == null) {
            return;
        }
        if (i == 0) {
            interfaceC599180Nem.LIZIZ(new C1470305pF(map, 2));
        } else {
            if (str2 == null) {
                str2 = "Lynx action failed";
            }
            interfaceC599180Nem.LIZ(new C1470005pC(i, str2, map));
        }
        this.LIZLLL.remove(str);
    }

    @Override // X.InterfaceC599480NfG
    public final void LIZJ(Object obj, String str, AbstractC2252651DEx abstractC2252651DEx, long j, boolean z, InterfaceC1631620sYq<? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1470205pE>, ? extends Object> interfaceC1631620sYq) {
        this.LIZIZ.put(str, new C599170Nel(obj, interfaceC1631620sYq, abstractC2252651DEx, j, z));
        C599210Nep c599210Nep = (C599210Nep) ((LinkedHashMap) this.LJ).get(obj);
        if (c599210Nep == null) {
            c599210Nep = new C599210Nep();
            this.LJ.put(obj, c599210Nep);
        }
        c599210Nep.LIZJ.add(str);
    }

    public static void LJ(C599190Nen c599190Nen, Exception exc, String str, EnumC599500NfI enumC599500NfI, EnumC599160Nek enumC599160Nek, EnumC599330Nf1 enumC599330Nf1, Object obj, EnumC586340MzA enumC586340MzA, long j, int i) {
        long j2 = j;
        EnumC586340MzA enumC586340MzA2 = enumC586340MzA;
        Object obj2 = obj;
        if ((i & 32) != 0) {
            obj2 = null;
        }
        if ((i & 64) != 0) {
            enumC586340MzA2 = EnumC586340MzA.UNKNOWN_ERROR;
        }
        if ((i & 128) != 0) {
            j2 = 0;
        }
        c599190Nen.getClass();
        C599320Nf0.LIZ(str, enumC599500NfI, enumC599160Nek, enumC599330Nf1, obj2, exc.getMessage(), enumC586340MzA2, j2);
    }
}
