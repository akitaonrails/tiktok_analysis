package X;

import Y.AObjectS114S0000000_11;
import Y.AObjectS311S0200000_11;
import Y.AObjectS354S0100000_11;
import Y.AObjectS64S0000000_11;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Rhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702870Rhd implements InterfaceC699310Rbt {
    public static final /* synthetic */ int LIZJ = 0;
    public final C703290RiJ LIZ;
    public final Function2<String, String, Unit> LIZIZ;

    @Override // X.InterfaceC699310Rbt
    public final void LIZIZ() {
        LJII("cancelJobs", null);
        final C703290RiJ c703290RiJ = this.LIZ;
        c703290RiJ.LJIIIZ("cancelJobs", null);
        c703290RiJ.LJIIIIZZ(new Function0() { // from class: X.0Rhf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C703290RiJ c703290RiJ2 = c703290RiJ;
                c703290RiJ2.LIZIZ(((LinkedHashMap) c703290RiJ2.LJFF).keySet());
                return Unit.LIZ;
            }
        });
    }

    @Override // X.InterfaceC699310Rbt
    public final C702940Rhk LJ() {
        C702940Rhk c702940RhkLIZIZ;
        C703290RiJ c703290RiJ = this.LIZ;
        c703290RiJ.getClass();
        synchronized (c703290RiJ.LIZJ.LIZ) {
            try {
                C702940Rhk c702940RhkLIZJ = c703290RiJ.LJI().getState().LIZIZ;
                if (c702940RhkLIZJ == null) {
                    c702940RhkLIZJ = c703290RiJ.LJII.LIZJ();
                }
                c703290RiJ.LJII.getClass();
                c702940RhkLIZIZ = C703020Rhs.LIZIZ(c702940RhkLIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStrategySnapShot, version=");
        sbLIZ.append(c702940RhkLIZIZ.LIZ);
        sbLIZ.append(", slotStateCount=");
        sbLIZ.append(c702940RhkLIZIZ.LIZIZ.size());
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getStrategySnapShot, version=");
        sbLIZ2.append(c702940RhkLIZIZ.LIZ);
        sbLIZ2.append(", slotStateCount=");
        sbLIZ2.append(c702940RhkLIZIZ.LIZIZ.size());
        LJII(C2188811AlT.LIZIZ(sbLIZ2), null);
        return c702940RhkLIZIZ;
    }

    @Override // X.InterfaceC699310Rbt
    public final void close() {
        LJII("close", null);
        C703290RiJ c703290RiJ = this.LIZ;
        c703290RiJ.LJIIIZ("cancelJobs", null);
        synchronized (c703290RiJ.LIZJ.LIZ) {
            try {
                c703290RiJ.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c703290RiJ.LJIIIZ("close", null);
        C2296808zG.LIZJ(c703290RiJ.LIZLLL, null);
    }

    public C702870Rhd(C1DFH c1dfh) {
        AObjectS64S0000000_11 aObjectS64S0000000_11 = new AObjectS64S0000000_11(4);
        C702920Rhi c702920Rhi = C702920Rhi.LL;
        this.LIZ = new C703290RiJ(c1dfh, aObjectS64S0000000_11, c702920Rhi, EnumC703530Rih.ASYNC);
        this.LIZIZ = c702920Rhi;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.04h2] */
    @Override // X.InterfaceC699310Rbt
    public final C1164604h2 LIZ(C1937007iK c1937007iK) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindSlotRules start, ruleCount=");
        sbLIZ.append(c1937007iK.LIZ.size());
        LJII(C2188811AlT.LIZIZ(sbLIZ), null);
        C703290RiJ c703290RiJ = this.LIZ;
        c703290RiJ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bindSlotRules start, ruleCount=");
        sbLIZ2.append(c1937007iK.LIZ.size());
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), null);
        synchronized (c703290RiJ.LIZJ.LIZ) {
            try {
                c703290RiJ.LIZLLL(new C1937107iL(c1937007iK));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        final int size = c1937007iK.LIZ.size();
        ?? r3 = new Object(size) { // from class: X.04h2
            public final int LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1164604h2) && this.LIZ == ((C1164604h2) obj).LIZ;
            }

            public final int hashCode() {
                return this.LIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BindSlotRulesResult(boundRuleCount=");
                sbLIZ3.append(this.LIZ);
                sbLIZ3.append(')');
                return C2188811AlT.LIZIZ(sbLIZ3);
            }

            {
                this.LIZ = size;
            }
        };
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("bindSlotRules end, boundRuleCount=");
        sbLIZ3.append(size);
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("bindSlotRules end, boundRuleCount=");
        sbLIZ4.append(size);
        LJII(C2188811AlT.LIZIZ(sbLIZ4), null);
        return r3;
    }

    @Override // X.InterfaceC699310Rbt
    public final C1170104hv LIZJ(final List<C700060Rd6> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commitCandidates start, candidateCount=");
        sbLIZ.append(list.size());
        LJII(C2188811AlT.LIZIZ(sbLIZ), null);
        final C703290RiJ c703290RiJ = this.LIZ;
        c703290RiJ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("commitCandidates start, candidateCount=");
        sbLIZ2.append(list.size());
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), null);
        C1200204mm c1200204mm = (C1200204mm) c703290RiJ.LJIIIIZZ(new Function0() { // from class: X.0Rhl
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.HashMap, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ?? linkedHashMap;
                C702940Rhk c702940Rhk;
                C703290RiJ c703290RiJ2 = c703290RiJ;
                List list2 = list;
                C702990Rhp state = c703290RiJ2.LJI().getState();
                C700400Rde c700400Rde = state.LIZLLL;
                C700400Rde c700400Rde2 = null;
                if (c700400Rde == null && ((c702940Rhk = state.LIZIZ) == null || (c700400Rde = c702940Rhk.LIZJ) == null)) {
                    linkedHashMap = C2097608Jq.LJ();
                } else {
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(c700400Rde.LIZ, null);
                    for (C700400Rde c700400Rde3 : c700400Rde.LIZJ.values()) {
                        linkedHashMap.put(c700400Rde3.LIZ, c700400Rde.LIZ);
                        c700400Rde3.LIZIZ(new AObjectS311S0200000_11(c700400Rde3, linkedHashMap, 1));
                    }
                }
                c703290RiJ2.LIZLLL(new C1233204s6(list2));
                C702990Rhp state2 = c703290RiJ2.LJI().getState();
                C1170104hv c1170104hv = new C1170104hv(C13LP.LJLLJ(state2.LJIIIIZZ.keySet()));
                List<String> list3 = state2.LJIIJ;
                List<Pair> listLJLLLL = C13LP.LJLLLL(new C512401z8(37), C2097808Js.LJIL(state2.LJIIIZ));
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJLLLL, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
                for (Pair pair : listLJLLLL) {
                    Pair pair2 = new Pair(pair.getFirst(), pair.getSecond());
                    linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                }
                C702940Rhk c702940RhkLIZJ = state2.LIZIZ;
                if (c702940RhkLIZJ == null) {
                    c702940RhkLIZJ = c703290RiJ2.LJII.LIZJ();
                }
                C700400Rde c700400Rde4 = state2.LIZLLL;
                if (c700400Rde4 == null) {
                    C702940Rhk c702940Rhk2 = state2.LIZIZ;
                    if (c702940Rhk2 != null) {
                        c700400Rde2 = c702940Rhk2.LIZJ;
                    }
                } else {
                    c700400Rde2 = c700400Rde4;
                }
                return new C1200204mm(c1170104hv, list3, linkedHashMap2, C703090Rhz.LIZ(state2, c702940RhkLIZJ, c700400Rde2, linkedHashMap));
            }
        });
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("commitCandidates end, committedSlotCount=");
        sbLIZ3.append(c1200204mm.LIZ.LIZ.size());
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("commitCandidates acceptedParentBySlot=");
        sbLIZ4.append(c1200204mm.LIZJ);
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4), null);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("commitCandidates slotTree:\n");
        sbLIZ5.append(c1200204mm.LIZLLL);
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5), null);
        if (!c1200204mm.LIZIZ.isEmpty()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("commitCandidates conflictSlots=");
            sbLIZ6.append(c1200204mm.LIZIZ);
            c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ6), null);
        }
        C1170104hv c1170104hv = c1200204mm.LIZ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("commitCandidates end, committedSlotCount=");
        sbLIZ7.append(c1170104hv.LIZ.size());
        LJII(C2188811AlT.LIZIZ(sbLIZ7), null);
        return c1170104hv;
    }

    @Override // X.InterfaceC699310Rbt
    public final C699130Rbb LJFF(final C588670N6z c588670N6z) {
        String str = c588670N6z.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeStrategy start, timingKeys=");
        sbLIZ.append(c588670N6z.LIZ);
        LJII(C2188811AlT.LIZIZ(sbLIZ), str);
        final C703290RiJ c703290RiJ = this.LIZ;
        c703290RiJ.getClass();
        final String str2 = c588670N6z.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("executeStrategy start, timingKeys=");
        sbLIZ2.append(c588670N6z.LIZ);
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), str2);
        C702880Rhe c702880Rhe = (C702880Rhe) c703290RiJ.LJIIIIZZ(new Function0() { // from class: X.0RiI
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C07X3 c07x3;
                C700400Rde c700400Rde;
                Set<String> setKeySet;
                C703310RiL next;
                C703310RiL next2;
                String strLIZIZ;
                final C703290RiJ c703290RiJ2 = c703290RiJ;
                C588670N6z c588670N6z2 = c588670N6z;
                final String str3 = str2;
                C702990Rhp state = c703290RiJ2.LJI().getState();
                long j = state.LJI + 1;
                Iterable iterable = c588670N6z2.LIZ;
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                Set setLLIIJI = C13LP.LLIIJI(iterable);
                List<String> list = c588670N6z2.LIZ;
                C703340RiO c703340RiO = new C703340RiO(list == null || list.isEmpty(), setLLIIJI);
                C703270RiH c703270RiH = c703290RiJ2.LJIIIIZZ;
                c703270RiH.getClass();
                C702940Rhk c702940Rhk = state.LIZIZ;
                if (c702940Rhk == null) {
                    c07x3 = new C07X3(new C07X2(C13BV.INSTANCE), new C1200104ml(C2097608Jq.LJ()));
                } else {
                    C700390Rdd c700390Rdd = new C700390Rdd(c702940Rhk.LIZJ);
                    Set setLLIIJI2 = C13LP.LLIIJI(C15442062u.LJIIIZ(C15442062u.LJIIIZ(((Map) c700390Rdd.LIZIZ.getValue()).keySet(), state.LIZ.keySet()), c702940Rhk.LIZIZ.keySet()));
                    C703430RiX c703430RiX = new C703430RiX(setLLIIJI2);
                    C703350RiP c703350RiP = new C703350RiP(c700390Rdd, new AObjectS354S0100000_11(c703430RiX, 1));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : setLLIIJI2) {
                        C700400Rde c700400Rde2 = (C700400Rde) ((Map) c700390Rdd.LIZIZ.getValue()).get(obj);
                        if (!C13LP.LJJJJ((c700400Rde2 == null || (c700400Rde = c700400Rde2.LIZIZ) == null) ? null : c700400Rde.LIZ, setLLIIJI2)) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it2 = C13LP.LJLLJ(arrayList2).iterator();
                    while (it2.hasNext()) {
                        C703430RiX c703430RiX2 = c703430RiX;
                        C703270RiH.LIZ(c703350RiP, c702940Rhk, state, c703430RiX2, c703270RiH, c700390Rdd, c703340RiO, arrayList, (String) it2.next());
                        c703430RiX = c703430RiX2;
                    }
                    for (String str4 : C13LP.LJLLJ(setLLIIJI2)) {
                        if (!c703350RiP.LIZJ.contains(str4)) {
                            C703270RiH.LIZ(c703350RiP, c702940Rhk, state, c703430RiX, c703270RiH, c700390Rdd, c703340RiO, arrayList, str4);
                        }
                    }
                    C07X2 c07x2 = new C07X2(arrayList);
                    List<Pair> listLJLLLL = C13LP.LJLLLL(new C512401z8(40), C2097808Js.LJIL(c703430RiX.LIZ));
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJLLLL, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (Pair pair : listLJLLLL) {
                        Object first = pair.getFirst();
                        C703360RiQ c703360RiQ = (C703360RiQ) pair.getSecond();
                        c703360RiQ.getClass();
                        String str5 = c703360RiQ.LIZ;
                        String str6 = c703360RiQ.LIZIZ;
                        if (str6 == null) {
                            str6 = "no_rule_matched";
                        }
                        Pair pair2 = new Pair(first, new C703370RiR(c703360RiQ.LIZLLL, c703360RiQ.LJ, C13LP.LLIIII(c703360RiQ.LJFF), str5, str6, c703360RiQ.LIZJ));
                        linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                    }
                    c07x3 = new C07X3(c07x2, new C1200104ml(linkedHashMap));
                }
                List<C703410RiV> list2 = c07x3.LIZ.LIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (C703410RiV c703410RiV : list2) {
                    String str7 = c703410RiV.LIZ;
                    Object arrayList3 = linkedHashMap2.get(str7);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap2.put(str7, arrayList3);
                    }
                    ((List) arrayList3).add(c703410RiV);
                }
                List listLJLLJ = C13LP.LJLLJ(linkedHashMap2.keySet());
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    Object key = entry.getKey();
                    List<C703410RiV> list3 = (List) entry.getValue();
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    for (C703410RiV c703410RiV2 : list3) {
                        c703410RiV2.getClass();
                        EnumC703190Ri9 enumC703190Ri9 = c703410RiV2.LIZIZ;
                        String str8 = c703410RiV2.LIZJ;
                        long j2 = c703410RiV2.LIZLLL.LIZ;
                        if (j2 < 0) {
                            j2 = 0;
                        }
                        arrayList4.add(new Object(enumC703190Ri9, str8, new C703510Rif(j2)) { // from class: X.0RiZ
                            public final EnumC703190Ri9 LIZ;
                            public final String LIZIZ;
                            public final C703510Rif LIZJ;

                            public final boolean equals(Object obj2) {
                                if (this == obj2) {
                                    return true;
                                }
                                if (!(obj2 instanceof C703450RiZ)) {
                                    return false;
                                }
                                C703450RiZ c703450RiZ = (C703450RiZ) obj2;
                                return this.LIZ == c703450RiZ.LIZ && Intrinsics.LJFF(this.LIZIZ, c703450RiZ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c703450RiZ.LIZJ);
                            }

                            public final int hashCode() {
                                int iHashCode = this.LIZ.hashCode() * 31;
                                String str9 = this.LIZIZ;
                                return ((iHashCode + (str9 == null ? 0 : str9.hashCode())) * 31) + this.LIZJ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("PendingOperationSignature(actionType=");
                                sbLIZ3.append(this.LIZ);
                                sbLIZ3.append(", timingKey=");
                                sbLIZ3.append(this.LIZIZ);
                                sbLIZ3.append(", rawData=");
                                sbLIZ3.append(this.LIZJ);
                                sbLIZ3.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ3);
                            }

                            {
                                this.LIZ = enumC703190Ri9;
                                this.LIZIZ = str8;
                                this.LIZJ = c703510Rif;
                            }
                        });
                    }
                    linkedHashMap3.put(key, arrayList4);
                }
                Map<String, List<C703160Ri6>> map = state.LIZ;
                if (c703340RiO.LIZIZ) {
                    setKeySet = map.keySet();
                } else {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry<String, List<C703160Ri6>> entry2 : map.entrySet()) {
                        List<C703160Ri6> value = entry2.getValue();
                        if (!(value instanceof Collection) || !value.isEmpty()) {
                            Iterator<C703160Ri6> it3 = value.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                if (c703340RiO.LIZ(it3.next())) {
                                    linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                                    break;
                                }
                            }
                        }
                    }
                    setKeySet = linkedHashMap4.keySet();
                }
                C703330RiN c703330RiN = new C703330RiN(linkedHashMap2, listLJLLJ, C13LP.LJLLJ(C13LP.LLIIII(setKeySet)), linkedHashMap3, c07x3.LIZIZ, c07x3.LIZ.LIZ.size());
                Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(c703290RiJ2.LJI);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : listLJLLJ) {
                    if (!Intrinsics.LJFF(mapLJIIZILJ.get(obj2), c703330RiN.LIZLLL.get(obj2))) {
                        arrayList5.add(obj2);
                    }
                }
                Set setKeySet2 = mapLJIIZILJ.keySet();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : setKeySet2) {
                    if (c703330RiN.LIZJ.contains(obj3) && !c703330RiN.LIZ.containsKey(obj3)) {
                        arrayList6.add(obj3);
                    }
                }
                List listLJLLJ2 = C13LP.LJLLJ(arrayList6);
                Map<String, List<C703410RiV>> map2 = c703330RiN.LIZ;
                List<String> list4 = c703330RiN.LIZIZ;
                List<String> list5 = c703330RiN.LIZJ;
                Map<String, List<C703450RiZ>> map3 = c703330RiN.LIZLLL;
                C1200104ml c1200104ml = c703330RiN.LJ;
                C703320RiM c703320RiM = new C703320RiM(map2, list4, list5, arrayList5, listLJLLJ2, map3, c1200104ml, c703330RiN.LJFF);
                C703440RiY c703440RiY = new C703440RiY(j, c703340RiO, c703320RiM);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("executeStrategy plan, executeId=");
                sbLIZ3.append(j);
                sbLIZ3.append(", touchedSlotIds=");
                sbLIZ3.append(list4);
                sbLIZ3.append(", slotIdsToRestart=");
                sbLIZ3.append(arrayList5);
                sbLIZ3.append(", slotIdsToCancelOnly=");
                sbLIZ3.append(listLJLLJ2);
                c703290RiJ2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), str3);
                C703490Rid c703490Rid = new C703490Rid(c703290RiJ2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("executeStrategy diagnostics summary, executeId=");
                sbLIZ4.append(j);
                sbLIZ4.append(", isDefaultExecution=");
                sbLIZ4.append(c703340RiO.LIZIZ);
                sbLIZ4.append(", timingSet=");
                sbLIZ4.append(c703340RiO.LIZ);
                sbLIZ4.append(", relevantSlotCount=");
                sbLIZ4.append(list5.size());
                c703490Rid.invoke(C2188811AlT.LIZIZ(sbLIZ4), str3);
                for (String str9 : list5) {
                    C703370RiR c703370RiR = c1200104ml.LIZ.get(str9);
                    List<C703410RiV> list6 = map2.get(str9);
                    if (list6 == null) {
                        list6 = C13BV.INSTANCE;
                    }
                    if (list6.isEmpty()) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("executeStrategy notTriggered, executeId=");
                        sbLIZ5.append(j);
                        sbLIZ5.append(", slotId=");
                        sbLIZ5.append(str9);
                        sbLIZ5.append(", ");
                        if (c703370RiR == null) {
                            strLIZIZ = "reason=no_diagnostic";
                        } else {
                            Iterator<C703310RiL> it4 = c703370RiR.LJFF.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it4.next();
                                C703310RiL c703310RiL = next;
                                if (c703310RiL.LIZJ && !c703310RiL.LIZLLL) {
                                    break;
                                }
                            }
                            C703310RiL c703310RiL2 = next;
                            String str10 = c703310RiL2 != null ? c703310RiL2.LJ : null;
                            Iterator<C703310RiL> it5 = c703370RiR.LJFF.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it5.next();
                                if (next2.LIZJ) {
                                    break;
                                }
                            }
                            C703310RiL c703310RiL3 = next2;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("reason=");
                            sbLIZ6.append(c703370RiR.LIZIZ);
                            sbLIZ6.append(", blockedByAncestorRule=");
                            sbLIZ6.append(c703370RiR.LIZJ);
                            sbLIZ6.append(", timingFilteredRuleCount=");
                            sbLIZ6.append(c703370RiR.LIZLLL);
                            sbLIZ6.append(", triggeredRuleCount=");
                            sbLIZ6.append(c703370RiR.LJ);
                            sbLIZ6.append(", firstFailureReason=");
                            sbLIZ6.append(str10);
                            sbLIZ6.append(", availability=");
                            sbLIZ6.append(c703310RiL3 != null ? c703310RiL3.LJII : null);
                            sbLIZ6.append(", usedDefaultAvailability=");
                            sbLIZ6.append(c703310RiL3 != null ? Boolean.valueOf(c703310RiL3.LJIIIIZZ) : null);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                        }
                        sbLIZ5.append(strLIZIZ);
                        c703490Rid.invoke(C2188811AlT.LIZIZ(sbLIZ5), str3);
                    } else {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("executeStrategy triggered, executeId=");
                        sbLIZ7.append(j);
                        sbLIZ7.append(", slotId=");
                        sbLIZ7.append(str9);
                        sbLIZ7.append(", operationCount=");
                        sbLIZ7.append(list6.size());
                        sbLIZ7.append(", operations=");
                        sbLIZ7.append(C13LP.LJJLIIIJ(list6, null, e3.e, e3.f, 0, null, new AObjectS114S0000000_11(0), 25));
                        c703490Rid.invoke(C2188811AlT.LIZIZ(sbLIZ7), str3);
                    }
                }
                final long j3 = c703440RiY.LIZ;
                c703290RiJ2.LIZIZ(C13LP.LJLIL(c703320RiM.LIZLLL, c703320RiM.LJ));
                if (!c703320RiM.LIZLLL.isEmpty()) {
                    c703290RiJ2.LIZLLL(new C1262804ws(j3, C13LP.LLIIJI(c703320RiM.LIZLLL)));
                }
                for (Map.Entry<String, List<C703410RiV>> entry3 : c703320RiM.LIZ.entrySet()) {
                    final String key2 = entry3.getKey();
                    List<C703410RiV> value2 = entry3.getValue();
                    if (c703320RiM.LIZLLL.contains(key2)) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("executeStrategy launch, executeId=");
                        sbLIZ8.append(j3);
                        sbLIZ8.append(", slotId=");
                        sbLIZ8.append(key2);
                        sbLIZ8.append(", operationCount=");
                        sbLIZ8.append(value2.size());
                        c703290RiJ2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ8), str3);
                        final AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(c703290RiJ2.LIZLLL, null, c703290RiJ2.LJ, new C703300RiK(c703290RiJ2, j3, key2, value2, str3, null), 1);
                        List<C703450RiZ> list7 = c703320RiM.LJFF.get(key2);
                        if (list7 == null) {
                            list7 = C13BV.INSTANCE;
                        }
                        c703290RiJ2.LJFF.put(key2, anonymousClass0956LIZLLL);
                        c703290RiJ2.LJI.put(key2, list7);
                        anonymousClass0956LIZLLL.LJII(new Function1() { // from class: X.0Rii
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                final C703290RiJ c703290RiJ3 = c703290RiJ2;
                                final String str11 = key2;
                                final C09AE c09ae = anonymousClass0956LIZLLL;
                                final long j4 = j3;
                                final String str12 = str3;
                                c703290RiJ3.LJIIIIZZ(new Function0() { // from class: X.0Ria
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        C703290RiJ c703290RiJ4 = c703290RiJ3;
                                        String str13 = str11;
                                        C09AE c09ae2 = c09ae;
                                        long j5 = j4;
                                        String str14 = str12;
                                        if (Intrinsics.LJFF(((LinkedHashMap) c703290RiJ4.LJFF).get(str13), c09ae2)) {
                                            c703290RiJ4.LJFF.remove(str13);
                                            c703290RiJ4.LJI.remove(str13);
                                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                            sbLIZ9.append("executeStrategy complete, executeId=");
                                            sbLIZ9.append(j5);
                                            sbLIZ9.append(", slotId=");
                                            sbLIZ9.append(str13);
                                            c703290RiJ4.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ9), str14);
                                        }
                                        return Unit.LIZ;
                                    }
                                });
                                return Unit.LIZ;
                            }
                        });
                    } else {
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("executeStrategy skipRestart, executeId=");
                        sbLIZ9.append(j3);
                        sbLIZ9.append(", slotId=");
                        sbLIZ9.append(key2);
                        c703290RiJ2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ9), str3);
                    }
                }
                return new C702880Rhe(c703440RiY.LIZ, c703320RiM.LIZIZ, c703320RiM.LJII);
            }
        });
        long j = c702880Rhe.LIZ;
        List<String> list = c702880Rhe.LIZIZ;
        int i = c702880Rhe.LIZJ;
        C699130Rbb c699130Rbb = new C699130Rbb(j, list, i);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("executeStrategy end, executeId=");
        sbLIZ3.append(j);
        sbLIZ3.append(", touchedSlotIds=");
        sbLIZ3.append(list);
        sbLIZ3.append(", scheduledOperationCount=");
        sbLIZ3.append(i);
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), str2);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("executeStrategy end, executeId=");
        sbLIZ4.append(j);
        sbLIZ4.append(", touchedSlotIds=");
        sbLIZ4.append(list);
        sbLIZ4.append(", scheduledOperationCount=");
        sbLIZ4.append(i);
        LJII(C2188811AlT.LIZIZ(sbLIZ4), str);
        return c699130Rbb;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.04xi] */
    public final C1268004xi LJI(final C702940Rhk c702940Rhk) {
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindStrategySnapShot start, hasSnapshot=");
        final boolean z3 = true;
        if (c702940Rhk != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        LJII(C2188811AlT.LIZIZ(sbLIZ), null);
        final C703290RiJ c703290RiJ = this.LIZ;
        c703290RiJ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bindStrategySnapShot start, hasSnapshot=");
        if (c702940Rhk != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ2.append(z2);
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), null);
        C702940Rhk c702940Rhk2 = (C702940Rhk) c703290RiJ.LJIIIIZZ(new Function0() { // from class: X.0Rhg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C703290RiJ c703290RiJ2 = c703290RiJ;
                C702940Rhk c702940Rhk3 = c702940Rhk;
                c703290RiJ2.LIZIZ(((LinkedHashMap) c703290RiJ2.LJFF).keySet());
                c703290RiJ2.LIZLLL(new C702910Rhh(c702940Rhk3));
                C702940Rhk c702940Rhk4 = c703290RiJ2.LJI().getState().LIZIZ;
                return c702940Rhk4 == null ? c703290RiJ2.LJII.LIZJ() : c702940Rhk4;
            }
        });
        if (c702940Rhk == null) {
            z3 = false;
        }
        final long j = c702940Rhk2.LIZ;
        final int size = c702940Rhk2.LIZIZ.size();
        ?? r7 = new Object(z3, j, size) { // from class: X.04xi
            public final boolean LIZ;
            public final long LIZIZ;
            public final int LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1268004xi)) {
                    return false;
                }
                C1268004xi c1268004xi = (C1268004xi) obj;
                return this.LIZ == c1268004xi.LIZ && this.LIZIZ == c1268004xi.LIZIZ && this.LIZJ == c1268004xi.LIZJ;
            }

            public final int hashCode() {
                return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
            }

            public final String toString() {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BindSnapshotResult(restored=");
                sbLIZ3.append(this.LIZ);
                sbLIZ3.append(", snapshotVersion=");
                sbLIZ3.append(this.LIZIZ);
                sbLIZ3.append(", restoredSlotCount=");
                sbLIZ3.append(this.LIZJ);
                sbLIZ3.append(')');
                return C2188811AlT.LIZIZ(sbLIZ3);
            }

            {
                this.LIZ = z3;
                this.LIZIZ = j;
                this.LIZJ = size;
            }
        };
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("bindStrategySnapShot end, restored=");
        sbLIZ3.append(z3);
        sbLIZ3.append(", snapshotVersion=");
        sbLIZ3.append(j);
        sbLIZ3.append(", restoredSlotCount=");
        sbLIZ3.append(size);
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("bindStrategySnapShot end, restored=");
        sbLIZ4.append(z3);
        sbLIZ4.append(", snapshotVersion=");
        sbLIZ4.append(j);
        sbLIZ4.append(", restoredSlotCount=");
        sbLIZ4.append(size);
        LJII(C2188811AlT.LIZIZ(sbLIZ4), null);
        return r7;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Rco] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0RdW] */
    @Override // X.InterfaceC699310Rbt
    public final C699880Rco LIZLLL(final String str, final C699350Rbx c699350Rbx) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observerSlotStrategy register, slotId=");
        sbLIZ.append(str);
        LJII(C2188811AlT.LIZIZ(sbLIZ), null);
        final C703290RiJ c703290RiJ = this.LIZ;
        c703290RiJ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("observerSlotStrategy register, slotId=");
        sbLIZ2.append(str);
        c703290RiJ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), null);
        final Function0 function0 = (Function0) c703290RiJ.LJIIIIZZ(new Function0() { // from class: X.0Rhc
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final C703290RiJ c703290RiJ2 = c703290RiJ;
                final String str2 = str;
                final InterfaceC699850Rcl interfaceC699850Rcl = c699350Rbx;
                InterfaceC1449905lx<C702990Rhp> interfaceC1449905lxLJI = c703290RiJ2.LJI();
                final Function1 function1 = new Function1() { // from class: X.0Rhy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C703290RiJ c703290RiJ3 = c703290RiJ2;
                        String str3 = str2;
                        C702990Rhp c702990Rhp = (C702990Rhp) obj;
                        c703290RiJ3.getClass();
                        C702940Rhk c702940RhkLIZJ = c702990Rhp.LIZIZ;
                        if (c702940RhkLIZJ == null) {
                            c702940RhkLIZJ = c703290RiJ3.LJII.LIZJ();
                        }
                        C703070Rhx c703070Rhx = c702940RhkLIZJ.LIZIZ.get(str3);
                        if (c703070Rhx == null) {
                            return new C699410Rc3(str3, C703100Ri0.LIZ(str3, null, c702990Rhp.LIZ).LIZ, 0L, null, null);
                        }
                        return new C699410Rc3(str3, c703070Rhx.LIZ, c703070Rhx.LIZJ, c703070Rhx.LIZIZ, c702940RhkLIZJ.LIZLLL.get(str3));
                    }
                };
                final AObjectS311S0200000_11 aObjectS311S0200000_11 = new AObjectS311S0200000_11(new Function1() { // from class: X.0Rcm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C703290RiJ c703290RiJ3 = c703290RiJ2;
                        String str3 = str2;
                        InterfaceC699850Rcl interfaceC699850Rcl2 = interfaceC699850Rcl;
                        C699410Rc3 c699410Rc3 = (C699410Rc3) obj;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("observerSlotStrategy callback, slotId=");
                        sbLIZ3.append(str3);
                        sbLIZ3.append(", availability=");
                        sbLIZ3.append(c699410Rc3.LIZIZ);
                        sbLIZ3.append(", revision=");
                        sbLIZ3.append(c699410Rc3.LIZJ);
                        sbLIZ3.append(", timingKey=");
                        sbLIZ3.append(c699410Rc3.LJ);
                        c703290RiJ3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
                        interfaceC699850Rcl2.LIZ(c699410Rc3);
                        return Unit.LIZ;
                    }
                }, function1, 0);
                Function2<Boolean, Function1<? super C702990Rhp, Unit>, Function0<Unit>> function2LIZLLL = interfaceC1449905lxLJI.LIZLLL();
                Boolean bool = Boolean.TRUE;
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = function1.invoke(interfaceC1449905lxLJI.getState());
                final C013C c013c = new C013C();
                c013c.element = true;
                return function2LIZLLL.invoke(bool, new Function1() { // from class: X.0DjG
                    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C013C c013c2 = c013c;
                        Function1 function12 = aObjectS311S0200000_11;
                        Function1 function13 = function1;
                        C259800zU c259800zU2 = c259800zU;
                        if (c013c2.element) {
                            c013c2.element = false;
                            function12.invoke(obj);
                        } else {
                            ?? Invoke = function13.invoke(obj);
                            if (!Intrinsics.LJFF(Invoke, c259800zU2.element)) {
                                c259800zU2.element = Invoke;
                                function12.invoke(obj);
                            }
                        }
                        return Unit.LIZ;
                    }
                });
            }
        });
        final ?? r1 = new InterfaceC699870Rcn() { // from class: X.0RdW
            @Override // X.InterfaceC699870Rcn
            public final void cancel() {
                C703290RiJ c703290RiJ2 = c703290RiJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("observerSlotStrategy cancel, slotId=");
                sbLIZ3.append(str);
                c703290RiJ2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
                C703290RiJ c703290RiJ3 = c703290RiJ;
                Function0<Unit> function02 = function0;
                synchronized (c703290RiJ3.LIZJ.LIZ) {
                    try {
                        function02.invoke();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        };
        return new InterfaceC699870Rcn() { // from class: X.0Rco
            @Override // X.InterfaceC699870Rcn
            public final void cancel() {
                C702870Rhd c702870Rhd = this.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("observerSlotStrategy cancel, slotId=");
                sbLIZ3.append(str);
                c702870Rhd.LJII(C2188811AlT.LIZIZ(sbLIZ3), null);
                r1.cancel();
            }
        };
    }

    public final void LJII(String str, String str2) {
        boolean z;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.LIZIZ.invoke("SlotStrategyService", str);
            return;
        }
        Function2<String, String, Unit> function2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[uniqueId=");
        sbLIZ.append(str2);
        sbLIZ.append("] ");
        sbLIZ.append(str);
        function2.invoke("SlotStrategyService", C2188811AlT.LIZIZ(sbLIZ));
    }
}
