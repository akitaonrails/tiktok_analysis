package X;

import Y.AObjectS346S0100000_2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05l9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1444905l9 extends C2217421BqW implements Function2<C1445005lA, InterfaceC1445905lJ, C1445005lA> {
    public C1444905l9(Object obj) {
        super(2, obj, C1446305lN.class, "reduce", "reduce(Lcom/tiktok/kmp/fcp/supplier/FcpPolicyState;Lcom/tiktok/kmp/fcp/redux/Action;)Lcom/tiktok/kmp/fcp/supplier/FcpPolicyState;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1445005lA invoke(C1445005lA c1445005lA, InterfaceC1445905lJ interfaceC1445905lJ) {
        InterfaceC1443605kw result;
        InterfaceC1445405lE interfaceC1445405lE;
        InterfaceC1445405lE interfaceC1445405lE2;
        InterfaceC1445405lE interfaceC1445405lE3;
        C1445005lA c1445005lA2 = c1445005lA;
        InterfaceC1445905lJ interfaceC1445905lJ2 = interfaceC1445905lJ;
        C1446305lN c1446305lN = (C1446305lN) this.receiver;
        c1446305lN.getClass();
        if (interfaceC1445905lJ2 instanceof C12841050t) {
            List<C1445305lD> list = ((C12841050t) interfaceC1445905lJ2).LIZ;
            if (!list.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(c1445005lA2.LIZJ);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C1445305lD c1445305lD : list) {
                    String str = c1445305lD.LIZ;
                    InterfaceC1444205l2 interfaceC1444205l2 = (InterfaceC1444205l2) linkedHashMap.get(str);
                    if (interfaceC1444205l2 == null) {
                        linkedHashMap.put(str, c1446305lN.LIZ.LIZ(c1445305lD));
                        linkedHashSet.add(str);
                    } else {
                        interfaceC1444205l2.LIZJ(c1445305lD.LIZJ);
                        interfaceC1444205l2.LJIILLIIL(c1445305lD.LIZLLL);
                        interfaceC1444205l2.LJIIIIZZ(c1445305lD.LJ);
                        interfaceC1444205l2.LJIJJ(c1445305lD.LJFF);
                        interfaceC1444205l2.LJIIJ(c1445305lD.LJI);
                        interfaceC1444205l2.LJIJI(c1445305lD.LJIIIIZZ);
                        interfaceC1444205l2.LJI(c1445305lD.LJIIIZ);
                        interfaceC1444205l2.LJIIZILJ(c1445305lD.LJIIJJI);
                        interfaceC1444205l2.LJIIL(c1445305lD.LJIIL);
                    }
                }
                for (C1445305lD c1445305lD2 : list) {
                    String str2 = c1445305lD2.LIZ;
                    InterfaceC1444205l2 interfaceC1444205l22 = (InterfaceC1444205l2) linkedHashMap.get(str2);
                    if (interfaceC1444205l22 != null) {
                        if (linkedHashSet.contains(str2)) {
                            String str3 = c1445305lD2.LIZIZ;
                            if (str3 != null && (interfaceC1445405lE = (InterfaceC1445405lE) linkedHashMap.get(str3)) != null) {
                                interfaceC1445405lE.LJIIIZ(interfaceC1444205l22);
                            }
                        } else {
                            String parentKey = interfaceC1444205l22.getParentKey();
                            String str4 = c1445305lD2.LIZIZ;
                            if (!Intrinsics.LJFF(parentKey, str4)) {
                                if (parentKey != null && (interfaceC1445405lE3 = (InterfaceC1445405lE) linkedHashMap.get(parentKey)) != null) {
                                    interfaceC1445405lE3.LIZLLL(interfaceC1444205l22);
                                }
                                if (str4 != null && (interfaceC1445405lE2 = (InterfaceC1445405lE) linkedHashMap.get(str4)) != null) {
                                    interfaceC1445405lE2.LJIIIZ(interfaceC1444205l22);
                                }
                                interfaceC1444205l22.setParentKey(str4);
                            }
                        }
                    }
                }
                InterfaceC1444205l2 interfaceC1444205l23 = (InterfaceC1444205l2) linkedHashMap.get(c1445005lA2.LIZ);
                if (interfaceC1444205l23 == null) {
                    interfaceC1444205l23 = c1445005lA2.LIZIZ;
                }
                return new C1445005lA(c1445005lA2.LIZ, interfaceC1444205l23, linkedHashMap);
            }
        } else if (interfaceC1445905lJ2 instanceof C1445105lB) {
            C1445105lB c1445105lB = (C1445105lB) interfaceC1445905lJ2;
            InterfaceC1444205l2 interfaceC1444205l24 = c1445005lA2.LIZIZ;
            if (interfaceC1444205l24 != null) {
                c1446305lN.LIZIZ.LIZ(interfaceC1444205l24, c1445105lB.LIZ, c1445105lB.LIZIZ, new AObjectS346S0100000_2(c1445105lB, 4));
                return c1445005lA2;
            }
        } else if (interfaceC1445905lJ2 instanceof C1445705lH) {
            InterfaceC1444205l2 interfaceC1444205l25 = c1445005lA2.LIZIZ;
            if (interfaceC1444205l25 != null && (result = interfaceC1444205l25.getResult()) != null) {
                C23250099c.LIZLLL(c1446305lN.LIZJ, null, null, new C1444505l5(c1445005lA2, C13LP.LLIIJI(result.LIZ()), null), 3);
                return c1445005lA2;
            }
        } else {
            if (interfaceC1445905lJ2 instanceof C1445805lI) {
                if (!c1445005lA2.LIZJ.isEmpty()) {
                    C23250099c.LIZLLL(c1446305lN.LIZJ, null, null, new C1444805l8(c1445005lA2, null), 3);
                }
                return new C1445005lA(c1445005lA2.LIZ, 6);
            }
            if (interfaceC1445905lJ2 instanceof C12840050s) {
                List<Pair<String, Object>> list2 = ((C12840050s) interfaceC1445905lJ2).LIZ;
                if (!c1445005lA2.LIZJ.isEmpty() && !list2.isEmpty()) {
                    Iterator<T> it2 = c1445005lA2.LIZJ.values().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1444305l3) it2.next()).LJ().LIZLLL(list2);
                    }
                }
            }
        }
        return c1445005lA2;
    }
}
