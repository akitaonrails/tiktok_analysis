package X;

import Y.AObjectS281S0200000_2;
import Y.AObjectS97S0400000_2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1446505lP implements C0RXZ {
    public final InterfaceC1446405lO LIZ;
    public final InterfaceC1447905ld LIZIZ;
    public final C1447305lX LIZJ;
    public final InterfaceC699620RcO LIZLLL;
    public final InterfaceC1448505lj LJ;
    public final boolean LJFF;
    public boolean LJII;
    public final C054G LJI = C2296808zG.LIZ(C0PEM.LIZ);
    public final C1DEV LJIIIIZZ = C2191201ApK.LIZ();

    @Override // X.C0RXZ
    public final void LIZJ() {
        this.LJII = false;
    }

    @Override // X.C0RXZ
    public final void LJIIIIZZ() {
        this.LJII = true;
    }

    @Override // X.C0RXZ
    public final void LIZIZ() {
        List<String> listLIZ;
        InterfaceC1443605kw result;
        InterfaceC1444205l2 interfaceC1444205l2 = this.LIZ.getState().LIZIZ;
        if (interfaceC1444205l2 == null || (result = interfaceC1444205l2.getResult()) == null || (listLIZ = result.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        this.LIZIZ.LIZIZ(new C1447105lV(listLIZ));
        this.LIZ.LIZJ(C1445705lH.LIZ);
    }

    @Override // X.C0RXZ
    public final C1447405lY LJFF() {
        return this.LIZIZ.getState();
    }

    @Override // X.C0RXZ
    public final C1445005lA LJIIJ() {
        return this.LIZ.getState();
    }

    @Override // X.C0RXZ
    public final void reset() {
        this.LIZ.LIZJ(C1445805lI.LIZ);
        this.LIZIZ.LIZIZ(C1448205lg.LIZ);
    }

    @Override // X.C0RXZ
    public final InterfaceC699620RcO LJIIJJI() {
        return this.LIZLLL;
    }

    @Override // X.C0RXZ
    public final InterfaceC1446405lO LJIILIIL() {
        return this.LIZ;
    }

    @Override // X.C0RXZ
    public final Function0<Unit> LIZ(InterfaceC1448605lk interfaceC1448605lk) {
        return this.LIZ.LIZ(interfaceC1448605lk);
    }

    @Override // X.C0RXZ
    public final void LIZLLL(List<String> list) {
        LJIILJJIL(new AObjectS281S0200000_2(this, list, 0));
    }

    @Override // X.C0RXZ
    public final void LJIIL(List<C1445305lD> list) {
        this.LIZ.LIZJ(new C12841050t(list));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1445305lD c1445305lD : list) {
            if (c1445305lD.LJFF) {
                arrayList.add(c1445305lD);
            } else {
                arrayList2.add(c1445305lD);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.getFirst();
        List list3 = (List) pair.getSecond();
        InterfaceC1447905ld interfaceC1447905ld = this.LIZIZ;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C1445305lD) it2.next()).LIZ);
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C1445305lD) it3.next()).LIZ);
        }
        interfaceC1447905ld.LIZIZ(new C1447505lZ(arrayList3, arrayList4));
    }

    public final void LJIILJJIL(Function0<Unit> function0) {
        if (!this.LJFF) {
            function0.invoke();
        } else {
            C23250099c.LIZLLL(this.LJI, null, null, new C411901iv(this, function0, null), 3);
        }
    }

    @Override // X.C0RXZ
    public final Function0 LJII(C2217481Bqc c2217481Bqc, Function1 function1) {
        return this.LIZIZ.LIZ(c2217481Bqc, function1);
    }

    @Override // X.C0RXZ
    public final void LJ(List<? extends Pair<String, ? extends Object>> list, AbstractC1443905kz abstractC1443905kz, Function0<Unit> function0) {
        if (!this.LJII) {
            return;
        }
        LJIILJJIL(new AObjectS97S0400000_2(this, list, abstractC1443905kz, function0, 0));
    }

    @Override // X.C0RXZ
    public final void LJI(List<String> list, List<? extends Pair<String, ? extends Object>> list2, Function0<Unit> function0) {
        LJIILJJIL(new AObjectS97S0400000_2(this, list, list2, function0, 1));
    }

    @Override // X.C0RXZ
    public final void LJIIIZ(Pair<String, ? extends Object> pair, List<? extends Pair<String, ? extends Object>> list, Function0<Unit> function0) {
        LJIILJJIL(new AObjectS97S0400000_2(this, pair, list, function0, 2));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.05lQ] */
    public final void LJIJJLI(List<? extends Pair<String, ? extends Object>> list, final AbstractC1443905kz abstractC1443905kz, final Function0<Unit> function0) {
        InterfaceC699620RcO interfaceC699620RcO;
        this.LIZ.LIZJ(new C12840050s(list));
        InterfaceC1444205l2 interfaceC1444205l2 = this.LIZ.getState().LIZIZ;
        if (interfaceC1444205l2 != null && (interfaceC699620RcO = this.LIZLLL) != null) {
            LJIJJ(abstractC1443905kz instanceof C1443205ks, this, interfaceC699620RcO, interfaceC1444205l2);
        }
        this.LIZ.LIZJ(new C1445105lB(abstractC1443905kz, this.LJFF, new Function0() { // from class: X.05lQ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC699620RcO interfaceC699620RcO2;
                C1443205ks c1443205ks;
                List<String> list2;
                InterfaceC1443605kw result;
                C1446505lP c1446505lP = this.LL;
                Function0 function02 = function0;
                AbstractC1443905kz abstractC1443905kz2 = abstractC1443905kz;
                InterfaceC1444205l2 interfaceC1444205l22 = c1446505lP.LIZ.getState().LIZIZ;
                Set setLLIIJI = null;
                if (interfaceC1444205l22 != null && (result = interfaceC1444205l22.getResult()) != null) {
                    c1446505lP.LIZIZ.LIZIZ(new C1447805lc(result));
                }
                InterfaceC1444205l2 interfaceC1444205l23 = c1446505lP.LIZ.getState().LIZIZ;
                if (interfaceC1444205l23 != null && (interfaceC699620RcO2 = c1446505lP.LIZLLL) != null) {
                    Map<String, InterfaceC1444205l2> map = c1446505lP.LIZ.getState().LIZJ;
                    if ((abstractC1443905kz2 instanceof C1443205ks) && (c1443205ks = (C1443205ks) abstractC1443905kz2) != null && (list2 = c1443205ks.LIZ) != null) {
                        setLLIIJI = C13LP.LLIIJI(list2);
                    }
                    C1446505lP.LJIILLIIL(map, interfaceC1444205l23, c1446505lP, setLLIIJI, interfaceC699620RcO2, interfaceC1444205l23);
                }
                if (function02 != null) {
                    function02.invoke();
                }
                c1446505lP.LIZ.LIZIZ();
                return Unit.LIZ;
            }
        }));
    }

    public static final void LJIJJ(boolean z, C1446505lP c1446505lP, final InterfaceC699620RcO interfaceC699620RcO, InterfaceC1444205l2 interfaceC1444205l2) {
        final String str;
        final String str2;
        final Map<String, Object> map;
        String str3;
        Map<String, Object> map2;
        String str4;
        Map<String, Object> map3;
        String str5;
        Map<String, Object> map4;
        if (interfaceC1444205l2.LIZIZ() == null && interfaceC1444205l2.getNodeType() != EnumC1450305m1.BY_PASS) {
            final String identifier = interfaceC1444205l2.getIdentifier();
            if (interfaceC1444205l2.LJFF()) {
                str = "STANDARD";
            } else {
                str = "NORMAL";
            }
            final Map<String, Object> extraInfo = interfaceC1444205l2.getExtraInfo();
            if (extraInfo.isEmpty()) {
                extraInfo = null;
            }
            if (z) {
                Function0<Unit> function0 = new Function0() { // from class: X.05le
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        InterfaceC699620RcO interfaceC699620RcO2 = interfaceC699620RcO;
                        String str6 = identifier;
                        String str7 = str;
                        Map<String, ? extends Object> map5 = extraInfo;
                        Boolean bool = Boolean.TRUE;
                        interfaceC699620RcO2.LIZLLL(str6, str7, bool, null, null, bool, null, null, bool, null, null, bool, null, null, map5);
                        return Unit.LIZ;
                    }
                };
                InterfaceC1448505lj interfaceC1448505lj = c1446505lP.LJ;
                if (interfaceC1448505lj != null) {
                    interfaceC1448505lj.LIZ(function0);
                } else {
                    function0.invoke();
                }
            } else {
                InterfaceC12836050o interfaceC12836050oLJ = interfaceC1444205l2.LJ();
                final Boolean boolLJ = interfaceC12836050oLJ.LJ("active");
                C1199704mh c1199704mhLIZIZ = interfaceC12836050oLJ.LIZIZ("active");
                if (c1199704mhLIZIZ != null) {
                    str2 = c1199704mhLIZIZ.LIZ;
                    map = c1199704mhLIZIZ.LIZIZ;
                } else {
                    str2 = null;
                    map = null;
                }
                final Boolean boolLJ2 = interfaceC12836050oLJ.LJ("signal");
                C1199704mh c1199704mhLIZIZ2 = interfaceC12836050oLJ.LIZIZ("signal");
                if (c1199704mhLIZIZ2 != null) {
                    str3 = c1199704mhLIZIZ2.LIZ;
                    map2 = c1199704mhLIZIZ2.LIZIZ;
                } else {
                    str3 = null;
                    map2 = null;
                }
                final Boolean boolLJ3 = interfaceC12836050oLJ.LJ("density");
                C1199704mh c1199704mhLIZIZ3 = interfaceC12836050oLJ.LIZIZ("density");
                if (c1199704mhLIZIZ3 != null) {
                    str4 = c1199704mhLIZIZ3.LIZ;
                    map3 = c1199704mhLIZIZ3.LIZIZ;
                } else {
                    str4 = null;
                    map3 = null;
                }
                final Boolean boolLJ4 = interfaceC12836050oLJ.LJ("enable");
                C1199704mh c1199704mhLIZIZ4 = interfaceC12836050oLJ.LIZIZ("enable");
                if (c1199704mhLIZIZ4 != null) {
                    str5 = c1199704mhLIZIZ4.LIZ;
                    map4 = c1199704mhLIZIZ4.LIZIZ;
                } else {
                    str5 = null;
                    map4 = null;
                }
                final Map<String, Object> map5 = map4;
                final Map<String, Object> map6 = extraInfo;
                final String str6 = str4;
                final Map<String, Object> map7 = map3;
                final String str7 = str5;
                final Map<String, Object> map8 = map2;
                final String str8 = str3;
                Function0<Unit> function02 = new Function0() { // from class: X.05lf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        interfaceC699620RcO.LIZLLL(identifier, str, boolLJ, str2, map, boolLJ2, str8, map8, boolLJ3, str6, map7, boolLJ4, str7, map5, map6);
                        return Unit.LIZ;
                    }
                };
                InterfaceC1448505lj interfaceC1448505lj2 = c1446505lP.LJ;
                if (interfaceC1448505lj2 != null) {
                    interfaceC1448505lj2.LIZ(function02);
                } else {
                    function02.invoke();
                }
            }
        }
        Iterator<InterfaceC1444205l2> it2 = interfaceC1444205l2.LIZ().iterator();
        while (it2.hasNext()) {
            LJIJJ(z, c1446505lP, interfaceC699620RcO, it2.next());
        }
    }

    public final void LJIILL(List list, List list2, C1443805ky c1443805ky, Function0 function0) {
        boolean z;
        List listLLIIII = C13LP.LLIIII(C13LP.LJJL(C13LP.LLIIJI(this.LIZIZ.getState().LIZLLL), list));
        List listLJLI = C13LP.LJLI(list, C13LP.LLIIJI(listLLIIII));
        this.LIZIZ.LIZIZ(new C1447005lU(listLLIIII));
        for (Object obj : listLJLI) {
            if (this.LIZJ.LJ.invoke((String) obj).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.LIZJ.LIZIZ.invoke((String) obj, Boolean.valueOf(z));
            this.LIZJ.LIZLLL.invoke((String) obj, Boolean.valueOf(z));
        }
        if (listLJLI.isEmpty()) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (!this.LJII) {
                return;
            }
            LJIJJLI(list2, c1443805ky, function0);
        }
    }

    public C1446505lP(C1446305lN c1446305lN, C1447605la c1447605la, C1447305lX c1447305lX, InterfaceC699620RcO interfaceC699620RcO, InterfaceC1448505lj interfaceC1448505lj, boolean z) {
        this.LIZ = c1446305lN;
        this.LIZIZ = c1447605la;
        this.LIZJ = c1447305lX;
        this.LIZLLL = interfaceC699620RcO;
        this.LJ = interfaceC1448505lj;
        this.LJFF = z;
    }

    public static final void LJIILLIIL(Map<String, ? extends InterfaceC1444205l2> map, InterfaceC1444205l2 interfaceC1444205l2, C1446505lP c1446505lP, Set<String> set, final InterfaceC699620RcO interfaceC699620RcO, InterfaceC1444205l2 interfaceC1444205l22) {
        Set setLLIIJI;
        Set setLLIIJI2;
        final List<String> listLIZ;
        Map<String, Object> mapInvoke;
        InterfaceC1444205l2 interfaceC1444205l23;
        List<String> listLIZ2;
        List<String> listLIZIZ;
        Set<String> set2 = set;
        LJIJI(map, interfaceC1444205l2, c1446505lP, set2, interfaceC699620RcO, interfaceC1444205l22);
        InterfaceC1443605kw result = interfaceC1444205l22.getResult();
        if (result == null || (listLIZIZ = result.LIZIZ()) == null || (setLLIIJI = C13LP.LLIIJI(listLIZIZ)) == null) {
            setLLIIJI = C08CX.INSTANCE;
        }
        if (result == null || (listLIZ2 = result.LIZ()) == null || (setLLIIJI2 = C13LP.LLIIJI(listLIZ2)) == null) {
            setLLIIJI2 = C08CX.INSTANCE;
        }
        if (result == null || (listLIZ = result.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        final String identifier = interfaceC1444205l22.getIdentifier();
        Function1<InterfaceC1444205l2, Map<String, Object>> function1LJIILIIL = interfaceC1444205l22.LJIILIIL();
        if (function1LJIILIIL != null) {
            mapInvoke = function1LJIILIIL.invoke(interfaceC1444205l22);
        } else {
            mapInvoke = null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        LJIJ(linkedHashSet, setLLIIJI, setLLIIJI2, arrayList, arrayList2, arrayList3, set2, arrayList4, arrayList5, arrayList6, arrayList7, interfaceC1444205l22);
        for (Object obj : setLLIIJI) {
            if (!linkedHashSet.contains(obj) && (interfaceC1444205l23 = map.get(obj)) != null) {
                linkedHashSet = linkedHashSet;
                setLLIIJI = setLLIIJI;
                setLLIIJI2 = setLLIIJI2;
                arrayList = arrayList;
                arrayList2 = arrayList2;
                arrayList3 = arrayList3;
                set2 = set2;
                arrayList4 = arrayList4;
                arrayList5 = arrayList5;
                arrayList6 = arrayList6;
                arrayList7 = arrayList7;
                LJIIZILJ(linkedHashSet, setLLIIJI, setLLIIJI2, arrayList, arrayList2, arrayList3, set2, arrayList4, arrayList5, arrayList6, arrayList7, interfaceC1444205l23);
            }
        }
        if (Intrinsics.LJFF(interfaceC1444205l22, interfaceC1444205l2) && interfaceC1444205l22.getNodeType() != EnumC1450305m1.BY_PASS && !linkedHashSet.contains(interfaceC1444205l22.getIdentifier())) {
            arrayList = arrayList;
            arrayList2 = arrayList2;
            arrayList3 = arrayList3;
            arrayList4 = arrayList4;
            arrayList5 = arrayList5;
            arrayList6 = arrayList6;
            arrayList7 = arrayList7;
            LJIIZILJ(linkedHashSet, setLLIIJI, setLLIIJI2, arrayList, arrayList2, arrayList3, set2, arrayList4, arrayList5, arrayList6, arrayList7, interfaceC1444205l22);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList8 = arrayList;
        final ArrayList arrayList9 = arrayList2;
        final ArrayList arrayList10 = arrayList3;
        final ArrayList arrayList11 = arrayList4;
        final ArrayList arrayList12 = arrayList5;
        final ArrayList arrayList13 = arrayList6;
        final ArrayList arrayList14 = arrayList7;
        final Map<String, Object> map2 = mapInvoke;
        Function0<Unit> function0 = new Function0() { // from class: X.05lS
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList15 = arrayList8;
                InterfaceC699620RcO interfaceC699620RcO2 = interfaceC699620RcO;
                ArrayList arrayList16 = arrayList9;
                ArrayList arrayList17 = arrayList10;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = arrayList12;
                String str = identifier;
                List<String> list = listLIZ;
                ArrayList arrayList20 = arrayList13;
                ArrayList arrayList21 = arrayList14;
                Map<String, ? extends Object> map3 = map2;
                int size = arrayList15.size();
                int i = 0;
                while (i < size) {
                    interfaceC699620RcO2.LJ((String) ListProtector.get(arrayList15, i), (String) ListProtector.get(arrayList16, i), ((Boolean) ListProtector.get(arrayList17, i)).booleanValue(), (String) ListProtector.get(arrayList18, i), ((Boolean) ListProtector.get(arrayList19, i)).booleanValue(), str, list, (String) ListProtector.get(arrayList20, i), (Map) ListProtector.get(arrayList21, i), map3);
                    i++;
                    str = str;
                }
                return Unit.LIZ;
            }
        };
        InterfaceC1448505lj interfaceC1448505lj = c1446505lP.LJ;
        if (interfaceC1448505lj != null) {
            interfaceC1448505lj.LIZ(function0);
        } else {
            function0.invoke();
        }
    }

    public static final void LJIJI(Map<String, ? extends InterfaceC1444205l2> map, InterfaceC1444205l2 interfaceC1444205l2, C1446505lP c1446505lP, Set<String> set, InterfaceC699620RcO interfaceC699620RcO, InterfaceC1444205l2 interfaceC1444205l22) {
        for (InterfaceC1444205l2 interfaceC1444205l23 : interfaceC1444205l22.LIZ()) {
            if (interfaceC1444205l23.getNodeType() == EnumC1450305m1.BY_PASS) {
                if (interfaceC1444205l23.LIZIZ() != null) {
                    LJIILLIIL(map, interfaceC1444205l2, c1446505lP, set, interfaceC699620RcO, interfaceC1444205l23);
                } else {
                    LJIJI(map, interfaceC1444205l2, c1446505lP, set, interfaceC699620RcO, interfaceC1444205l23);
                }
            }
        }
    }

    public static final void LJIIZILJ(Set<String> set, Set<String> set2, Set<String> set3, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Boolean> arrayList3, Set<String> set4, ArrayList<String> arrayList4, ArrayList<Boolean> arrayList5, ArrayList<String> arrayList6, ArrayList<Map<String, Object>> arrayList7, InterfaceC1444205l2 interfaceC1444205l2) {
        String str;
        boolean z;
        String str2;
        String identifier = interfaceC1444205l2.getIdentifier();
        set.add(identifier);
        boolean zContains = set2.contains(identifier);
        boolean zContains2 = set3.contains(identifier);
        arrayList.add(identifier);
        if (interfaceC1444205l2.LJFF()) {
            str = "STANDARD";
        } else {
            str = "NORMAL";
        }
        arrayList2.add(str);
        arrayList3.add(Boolean.valueOf(zContains2));
        if (set4 != null && set4.contains(identifier)) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "release_slot";
        if (zContains2) {
            str2 = "win";
        } else if (z) {
            str2 = "release_slot";
        } else if (zContains) {
            str2 = "lose";
        } else {
            str2 = "not participated";
        }
        arrayList4.add(str2);
        arrayList5.add(Boolean.valueOf(zContains));
        Map<String, Object> map = null;
        if (!z) {
            if (zContains && !zContains2) {
                str3 = "low_priority";
            } else {
                str3 = null;
            }
        }
        arrayList6.add(str3);
        Map<String, Object> extraInfo = interfaceC1444205l2.getExtraInfo();
        if (!extraInfo.isEmpty()) {
            map = extraInfo;
        }
        arrayList7.add(map);
    }

    public static final void LJIJ(Set<String> set, Set<String> set2, Set<String> set3, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Boolean> arrayList3, Set<String> set4, ArrayList<String> arrayList4, ArrayList<Boolean> arrayList5, ArrayList<String> arrayList6, ArrayList<Map<String, Object>> arrayList7, InterfaceC1444205l2 interfaceC1444205l2) {
        for (InterfaceC1444205l2 interfaceC1444205l22 : interfaceC1444205l2.LIZ()) {
            if (interfaceC1444205l22.getNodeType() == EnumC1450305m1.BY_PASS) {
                if (interfaceC1444205l22.LIZIZ() == null) {
                    LJIJ(set, set2, set3, arrayList, arrayList2, arrayList3, set4, arrayList4, arrayList5, arrayList6, arrayList7, interfaceC1444205l22);
                }
            } else {
                LJIIZILJ(set, set2, set3, arrayList, arrayList2, arrayList3, set4, arrayList4, arrayList5, arrayList6, arrayList7, interfaceC1444205l22);
            }
        }
    }
}
