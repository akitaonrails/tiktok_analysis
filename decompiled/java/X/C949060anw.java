package X;

import Y.AObjectS117S0000000_15;
import Y.AObjectS358S0100000_15;
import Y.ARunnableS106S0100000_6;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicLayoutEffectResourceSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0anw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949060anw implements InterfaceC946970akZ {
    public static C949070anx LIZIZ;
    public static C949140ao4 LJIIJ;
    public static final C949060anw LIZ = new C949060anw();
    public static final List<InterfaceC940910aan> LIZJ = new ArrayList();
    public static final List<C949040anu<InterfaceC1631620sYq<C947420alI, C947420alI, InterfaceC949240aoE, Unit>>> LIZLLL = new ArrayList();
    public static final Map<String, List<C949040anu<InterfaceC1631620sYq<C947590alZ, C947590alZ, InterfaceC949240aoE, Unit>>>> LJ = new LinkedHashMap();
    public static final List<C949040anu<InterfaceC1631620sYq<Map<String, C947590alZ>, Map<String, C947590alZ>, InterfaceC949240aoE, Unit>>> LJFF = new ArrayList();
    public static final List<C949040anu<InterfaceC1631620sYq<EnumC947440alK, EnumC947440alK, InterfaceC949240aoE, Unit>>> LJI = new ArrayList();
    public static final List<Pair<C949040anu<InterfaceC949260aoG>, Set<EnumC947020ake>>> LJII = new ArrayList();
    public static final Map<String, EnumC947020ake> LJIIIIZZ = new LinkedHashMap();
    public static final Set<Long> LJIIIZ = new LinkedHashSet();

    public static C949140ao4 LJIIZILJ() {
        C949140ao4 c949140ao4 = LJIIJ;
        if (c949140ao4 != null) {
            return c949140ao4;
        }
        C949140ao4 c949140ao42 = new C949140ao4();
        LJIIJ = c949140ao42;
        return c949140ao42;
    }

    @Override // X.InterfaceC946970akZ
    public final void LIZLLL() {
        C949190ao9.LIZ("KMPLiveDanceService", "quitGame");
        LJIIJ = null;
        LIZIZ = null;
    }

    @Override // X.InterfaceC946970akZ
    public final C947420alI LJII() {
        C949070anx c949070anx = LIZIZ;
        if (c949070anx != null) {
            return c949070anx.getCurrentState();
        }
        return null;
    }

    @Override // X.InterfaceC946970akZ
    public final boolean LJIIIIZZ() {
        C949070anx c949070anx = LIZIZ;
        if (c949070anx != null) {
            return c949070anx.LIZ((C947420alI) c949070anx.getCurrentState());
        }
        return false;
    }

    @Override // X.InterfaceC946970akZ
    public final void LJIILL() {
        Iterator<InterfaceC940910aan> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().unsubscribe();
        }
        ((ArrayList) LIZJ).clear();
        ((ArrayList) LIZLLL).clear();
        ((LinkedHashMap) LJ).clear();
        ((ArrayList) LJFF).clear();
        ((ArrayList) LJI).clear();
        ((ArrayList) LJII).clear();
        LJIIIZ.clear();
    }

    public static String LJIJ(EnumC947020ake enumC947020ake) {
        C947420alI c947420alILIZIZ;
        C947500alQ c947500alQ;
        C947420alI c947420alILIZIZ2;
        C947500alQ c947500alQ2;
        int i = C947030akf.LIZ[enumC947020ake.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LJIIZILJ();
                        return LinkMicLayoutEffectResourceSetting.INSTANCE.getResourceId();
                    }
                    throw new C1954807lC();
                }
                C949070anx c949070anx = LIZIZ;
                if (c949070anx != null && (c947420alILIZIZ2 = c949070anx.getCurrentState()) != null && (c947500alQ2 = c947420alILIZIZ2.LJFF) != null) {
                    return c947500alQ2.LIZIZ;
                }
                return null;
            }
            C949070anx c949070anx2 = LIZIZ;
            if (c949070anx2 != null && (c947420alILIZIZ = c949070anx2.getCurrentState()) != null && (c947500alQ = c947420alILIZIZ.LJ) != null) {
                return c947500alQ.LIZIZ;
            }
            return null;
        }
        LJIIZILJ();
        return MultiGuestSocialGameLetsDanceSetting.config().scoreEffectResourceId;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ao3] */
    @Override // X.InterfaceC946970akZ
    public final C949130ao3 LIZ(final InterfaceC1631620sYq interfaceC1631620sYq) {
        EnumC947440alK enumC947440alK;
        C947420alI c947420alILIZIZ;
        C949070anx c949070anx = LIZIZ;
        ArrayList arrayList = (ArrayList) LJI;
        arrayList.add(new C949040anu(interfaceC1631620sYq));
        if (c949070anx == null || (c947420alILIZIZ = c949070anx.getCurrentState()) == null || (enumC947440alK = c947420alILIZIZ.LIZJ) == null) {
            enumC947440alK = EnumC947440alK.NONE;
        }
        interfaceC1631620sYq.invoke(null, enumC947440alK, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeToGamePhase currentSubscription size=");
        sbLIZ.append(arrayList.size());
        C949190ao9.LIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ));
        return new InterfaceC940910aan() { // from class: X.0ao3
            @Override // X.InterfaceC940910aan
            public final void unsubscribe() {
                List<C949040anu<InterfaceC1631620sYq<EnumC947440alK, EnumC947440alK, InterfaceC949240aoE, Unit>>> list = C949060anw.LJI;
                int size = ((ArrayList) list).size();
                C19719612Di.LJJIIJ(list, new AObjectS358S0100000_15(interfaceC1631620sYq, 58), true);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("subscribeToGamePhase unsubscribe, listener: ");
                sbLIZ2.append(interfaceC1631620sYq.hashCode());
                sbLIZ2.append(", res=");
                sbLIZ2.append(size != ((ArrayList) list).size());
                C949190ao9.LIZIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
    }

    @Override // X.InterfaceC946970akZ
    public final String LIZJ(EnumC947020ake enumC947020ake) {
        String str;
        C947420alI c947420alILIZIZ;
        C947500alQ c947500alQ;
        String strLJIJ = LJIJ(enumC947020ake);
        C949070anx c949070anx = LIZIZ;
        if (c949070anx == null || (c947420alILIZIZ = c949070anx.getCurrentState()) == null || (c947500alQ = c947420alILIZIZ.LJ) == null || (str = c947500alQ.LIZ) == null) {
            str = "live_dance";
        }
        if (strLJIJ != null) {
            Map<String, C949120ao2> map = LJIIZILJ().LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(strLJIJ);
            C949120ao2 c949120ao2 = (C949120ao2) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
            if (c949120ao2 != null) {
                return c949120ao2.LJ;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0aoC] */
    @Override // X.InterfaceC946970akZ
    public final C949220aoC LJ(final AwS664S0100000_15 awS664S0100000_15) {
        C947420alI c947420alILIZIZ;
        ((ArrayList) LIZLLL).add(new C949040anu(awS664S0100000_15));
        C949070anx c949070anx = LIZIZ;
        if (c949070anx != null && (c947420alILIZIZ = c949070anx.getCurrentState()) != null) {
            awS664S0100000_15.invoke(null, c947420alILIZIZ, null);
        }
        return new InterfaceC940910aan() { // from class: X.0aoC
            @Override // X.InterfaceC940910aan
            public final void unsubscribe() {
                C19719612Di.LJJIIJ(C949060anw.LIZLLL, new AObjectS358S0100000_15(awS664S0100000_15, 59), true);
            }
        };
    }

    @Override // X.InterfaceC946970akZ
    public final boolean LJFF(EnumC947020ake enumC947020ake) {
        String strLJIJ = LJIJ(enumC947020ake);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isResourceReady: ");
        sbLIZ.append(enumC947020ake);
        sbLIZ.append(". resourceId: ");
        sbLIZ.append(strLJIJ);
        C949190ao9.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (strLJIJ != null) {
            return LJIIZILJ().LIZ(strLJIJ);
        }
        return false;
    }

    @Override // X.InterfaceC946970akZ
    public final void LJI(C947420alI c947420alI) {
        Object c098200Yq;
        long j;
        C947420alI c947420alILIZIZ;
        try {
            j = c947420alI.LIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (LJIIIZ.contains(Long.valueOf(j))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("KMPLetsDanceService startGame ignored: sessionId=");
            sbLIZ.append(j);
            C949190ao9.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("KMPLetsDanceService startGame: ");
        sbLIZ2.append(c947420alI);
        C949190ao9.LIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ2));
        Iterator it2 = ((ArrayList) LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC940910aan) it2.next()).unsubscribe();
        }
        List<InterfaceC940910aan> list = LIZJ;
        ((ArrayList) list).clear();
        C949070anx c949070anx = new C949070anx(c947420alI);
        LIZIZ = c949070anx;
        C949100ao0 c949100ao0 = new C949100ao0();
        C949310aoL<C947420alI, InterfaceC949240aoE> c949310aoL = c949070anx.LIZLLL;
        final AnonymousClass0956 anonymousClass0956LJJI = C09IC.LJJI(c949310aoL.LIZIZ, new C861640Xr8(new C949110ao1(c949100ao0, null), c949310aoL.LJII));
        ((ArrayList) list).add(new InterfaceC940910aan() { // from class: X.0aoH
            @Override // X.InterfaceC940910aan
            public final void unsubscribe() {
                anonymousClass0956LJJI.LIZIZ(null);
            }
        });
        if (C947620alc.LIZ() != EnumC947600ala.AUDIENCE) {
            LJIIJJI(C1697810uHb.LJIIJJI(EnumC947020ake.SCORE_EFFECT, EnumC947020ake.GAME_MATERIAL, EnumC947020ake.GAME_BG_LOTTIE, EnumC947020ake.LAYOUT_RESOURCE));
        } else {
            LJIIJJI(C1697810uHb.LJIIJJI(EnumC947020ake.GAME_BG_LOTTIE, EnumC947020ake.LAYOUT_RESOURCE));
        }
        C949070anx c949070anx2 = LIZIZ;
        if (c949070anx2 != null && (c947420alILIZIZ = c949070anx2.getCurrentState()) != null) {
            LJIJI(null, c947420alILIZIZ, null);
        }
        c098200Yq = Boolean.valueOf(LJIIIZ.add(Long.valueOf(j)));
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("KMPLetsDanceService startGame failed: ");
            sbLIZ3.append(thM5exceptionOrNullimpl);
            C949190ao9.LIZIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ant] */
    @Override // X.InterfaceC946970akZ
    public final C949030ant LJIIIZ(final AwS664S0100000_15 awS664S0100000_15) {
        Map<String, C947590alZ> mapLJ;
        C947420alI c947420alILIZIZ;
        C949070anx c949070anx = LIZIZ;
        if (c949070anx == null || (c947420alILIZIZ = c949070anx.getCurrentState()) == null || (mapLJ = c947420alILIZIZ.LJIIIIZZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        awS664S0100000_15.invoke(C2097608Jq.LJ(), mapLJ, null);
        ((ArrayList) LJFF).add(new C949040anu(awS664S0100000_15));
        return new InterfaceC940910aan() { // from class: X.0ant
            @Override // X.InterfaceC940910aan
            public final void unsubscribe() {
                C19719612Di.LJJIIJ(C949060anw.LJFF, new AObjectS358S0100000_15(awS664S0100000_15, 57), true);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0aoF] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0aoD] */
    @Override // X.InterfaceC946970akZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.util.List<? extends X.EnumC947020ake> r17) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C949060anw.LJIIJJI(java.util.List):void");
    }

    @Override // X.InterfaceC946970akZ
    public final C949180ao8 LJIIL(InterfaceC949260aoG interfaceC949260aoG) {
        return LIZIZ(C13LQ.LJJLL(EnumC947020ake.values()), interfaceC949260aoG);
    }

    @Override // X.InterfaceC946970akZ
    public final C949120ao2 LJIILIIL(EnumC947020ake enumC947020ake) {
        String str;
        C947420alI c947420alILIZIZ;
        C947500alQ c947500alQ;
        String strLJIJ = LJIJ(enumC947020ake);
        if (strLJIJ == null) {
            return null;
        }
        C949070anx c949070anx = LIZIZ;
        if (c949070anx == null || (c947420alILIZIZ = c949070anx.getCurrentState()) == null || (c947500alQ = c947420alILIZIZ.LJ) == null || (str = c947500alQ.LIZ) == null) {
            str = "live_dance";
        }
        Map<String, C949120ao2> map = LJIIZILJ().LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(strLJIJ);
        return (C949120ao2) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC946970akZ
    public final C947590alZ LJIILLIIL(String str) {
        C947420alI c947420alILIZIZ;
        Map<String, C947590alZ> map;
        C949070anx c949070anx = LIZIZ;
        if (c949070anx != null && (c947420alILIZIZ = c949070anx.getCurrentState()) != null && (map = c947420alILIZIZ.LJIIIIZZ) != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0ao8] */
    @Override // X.InterfaceC946970akZ
    public final C949180ao8 LIZIZ(List list, final InterfaceC949260aoG interfaceC949260aoG) {
        List<Pair<C949040anu<InterfaceC949260aoG>, Set<EnumC947020ake>>> list2 = LJII;
        ArrayList arrayList = (ArrayList) list2;
        arrayList.add(new Pair(new C949040anu(interfaceC949260aoG), C13LP.LLIIJI(list)));
        int i = 0;
        if (!(list2 instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((C949040anu) ((Pair) it2.next()).getFirst()).LIZ() != null && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        C949190ao9.LIZ("KMPLiveDanceService", "subscribeResourceDownload listener: " + interfaceC949260aoG.hashCode() + ", size=" + i);
        return new InterfaceC940910aan() { // from class: X.0ao8
            @Override // X.InterfaceC940910aan
            public final void unsubscribe() {
                List<Pair<C949040anu<InterfaceC949260aoG>, Set<EnumC947020ake>>> list3 = C949060anw.LJII;
                int size = ((ArrayList) list3).size();
                C19719612Di.LJJIIJ(list3, new AObjectS358S0100000_15(interfaceC949260aoG, 56), true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unsubscribe resource listener: ");
                sbLIZ.append(interfaceC949260aoG.hashCode());
                sbLIZ.append(", changed=");
                sbLIZ.append(size != ((ArrayList) list3).size());
                C949190ao9.LIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0anv] */
    @Override // X.InterfaceC946970akZ
    public final C949050anv LJIIJ(final String str, final InterfaceC1631620sYq interfaceC1631620sYq) {
        C947590alZ c947590alZ;
        C947420alI c947420alILIZIZ;
        Map<String, C947590alZ> map;
        C949070anx c949070anx = LIZIZ;
        if (c949070anx != null && (c947420alILIZIZ = c949070anx.getCurrentState()) != null && (map = c947420alILIZIZ.LJIIIIZZ) != null) {
            c947590alZ = map.get(str);
        } else {
            c947590alZ = null;
        }
        interfaceC1631620sYq.invoke(null, c947590alZ, null);
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJ;
        Object arrayList = linkedHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(str, arrayList);
        }
        ((List) arrayList).add(new C949040anu(interfaceC1631620sYq));
        return new InterfaceC940910aan() { // from class: X.0anv
            @Override // X.InterfaceC940910aan
            public final void unsubscribe() {
                Map<String, List<C949040anu<InterfaceC1631620sYq<C947590alZ, C947590alZ, InterfaceC949240aoE, Unit>>>> map2 = C949060anw.LJ;
                List list = (List) ((LinkedHashMap) map2).get(str);
                if (list != null) {
                    list.size();
                    C19719612Di.LJJIIJ(list, new AObjectS358S0100000_15(interfaceC1631620sYq, 60), true);
                    if (list.isEmpty()) {
                        map2.remove(str);
                    }
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    @Override // X.InterfaceC946970akZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.C947420alI r15, X.InterfaceC1364105Vn<? super X.C947420alI> r16) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C949060anw.LJIILJJIL(X.0alI, X.05Vn):java.lang.Object");
    }

    public static void LJIJI(final C947420alI c947420alI, final C947420alI c947420alI2, final InterfaceC949240aoE interfaceC949240aoE) {
        EnumC947440alK enumC947440alK;
        final boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KMP notifyExternalListener: ");
        sbLIZ.append(c947420alI);
        sbLIZ.append(" -> ");
        sbLIZ.append(c947420alI2);
        sbLIZ.append(", cause: ");
        sbLIZ.append(interfaceC949240aoE);
        C949190ao9.LIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ));
        Map<String, C947590alZ> map = null;
        if (c947420alI != null) {
            enumC947440alK = c947420alI.LIZJ;
        } else {
            enumC947440alK = null;
        }
        if (enumC947440alK != c947420alI2.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (c947420alI != null) {
            map = c947420alI.LJIIIIZZ;
        }
        final boolean z2 = !Intrinsics.LJFF(map, c947420alI2.LJIIIIZZ);
        final boolean z3 = !Intrinsics.LJFF(c947420alI, c947420alI2);
        C786410Ut5.LJJZZIII(C788390UwH.LIZ, new ARunnableS106S0100000_6(new Function0() { // from class: X.0anz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Iterable iterableLJII;
                List list;
                Map<String, C947590alZ> map2;
                Map<String, C947590alZ> map3;
                Map<String, C947590alZ> map4;
                Set<String> setKeySet;
                Map<String, C947590alZ> mapLJ;
                boolean z4 = z3;
                boolean z5 = z;
                boolean z6 = z2;
                C947420alI c947420alI3 = c947420alI;
                C947420alI c947420alI4 = c947420alI2;
                InterfaceC949240aoE interfaceC949240aoE2 = interfaceC949240aoE;
                if (z4) {
                    Iterator it2 = ((ArrayList) C949060anw.LIZLLL).iterator();
                    while (it2.hasNext()) {
                        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) ((C949040anu) it2.next()).LIZ();
                        if (interfaceC1631620sYq != null) {
                            interfaceC1631620sYq.invoke(c947420alI3, c947420alI4, interfaceC949240aoE2);
                        }
                    }
                    C19719612Di.LJJIIJ(C949060anw.LIZLLL, new AObjectS117S0000000_15(10), true);
                }
                if (z5) {
                    Iterator it3 = ((ArrayList) C949060anw.LJI).iterator();
                    while (it3.hasNext()) {
                        InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) ((C949040anu) it3.next()).LIZ();
                        if (interfaceC1631620sYq2 != null) {
                            interfaceC1631620sYq2.invoke(c947420alI3 != null ? c947420alI3.LIZJ : null, c947420alI4.LIZJ, interfaceC949240aoE2);
                        }
                    }
                    C19719612Di.LJJIIJ(C949060anw.LJI, new AObjectS117S0000000_15(11), true);
                }
                if (z6) {
                    Iterator it4 = ((ArrayList) C949060anw.LJFF).iterator();
                    while (it4.hasNext()) {
                        InterfaceC1631620sYq interfaceC1631620sYq3 = (InterfaceC1631620sYq) ((C949040anu) it4.next()).LIZ();
                        if (interfaceC1631620sYq3 != null) {
                            if (c947420alI3 == null || (mapLJ = c947420alI3.LJIIIIZZ) == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            interfaceC1631620sYq3.invoke(mapLJ, c947420alI4.LJIIIIZZ, interfaceC949240aoE2);
                        }
                    }
                    C19719612Di.LJJIIJ(C949060anw.LJFF, new AObjectS117S0000000_15(12), true);
                }
                if (c947420alI3 == null || (map4 = c947420alI3.LJIIIIZZ) == null || (setKeySet = map4.keySet()) == null || (iterableLJII = C15442062u.LJII(setKeySet, c947420alI4.LJIIIIZZ.keySet())) == null) {
                    iterableLJII = C08CX.INSTANCE;
                }
                for (Object obj : iterableLJII) {
                    C947590alZ c947590alZ = (c947420alI3 == null || (map3 = c947420alI3.LJIIIIZZ) == null) ? null : map3.get(obj);
                    List list2 = (List) ((LinkedHashMap) C949060anw.LJ).get(obj);
                    if (list2 != null) {
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            InterfaceC1631620sYq interfaceC1631620sYq4 = (InterfaceC1631620sYq) ((C949040anu) it5.next()).LIZ();
                            if (interfaceC1631620sYq4 != null) {
                                interfaceC1631620sYq4.invoke(c947590alZ, null, interfaceC949240aoE2);
                            }
                        }
                        C19719612Di.LJJIIJ(list2, new AObjectS117S0000000_15(13), true);
                        if (list2.isEmpty()) {
                            C949060anw.LJ.remove(obj);
                        }
                    }
                }
                for (Map.Entry<String, C947590alZ> entry : c947420alI4.LJIIIIZZ.entrySet()) {
                    String key = entry.getKey();
                    C947590alZ value = entry.getValue();
                    C947590alZ c947590alZ2 = (c947420alI3 == null || (map2 = c947420alI3.LJIIIIZZ) == null) ? null : map2.get(key);
                    if (!Intrinsics.LJFF(c947590alZ2, value) && (list = (List) ((LinkedHashMap) C949060anw.LJ).get(key)) != null) {
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            InterfaceC1631620sYq interfaceC1631620sYq5 = (InterfaceC1631620sYq) ((C949040anu) it6.next()).LIZ();
                            if (interfaceC1631620sYq5 != null) {
                                interfaceC1631620sYq5.invoke(c947590alZ2, value, interfaceC949240aoE2);
                            }
                        }
                        C19719612Di.LJJIIJ(list, new AObjectS117S0000000_15(8), true);
                        if (list.isEmpty()) {
                            C949060anw.LJ.remove(key);
                        }
                    }
                }
                return Unit.LIZ;
            }
        }, 4));
    }

    public static void LJIJJ(String str, final Long l, final InterfaceC1631620sYq interfaceC1631620sYq) {
        String str2;
        C947420alI c947420alILIZIZ;
        C947500alQ c947500alQ;
        C947420alI c947420alILIZIZ2;
        C947500alQ c947500alQ2;
        final EnumC947020ake enumC947020ake = (EnumC947020ake) ((LinkedHashMap) LJIIIIZZ).get(str);
        if (enumC947020ake == null) {
            LJIIZILJ();
            if (Intrinsics.LJFF(str, MultiGuestSocialGameLetsDanceSetting.config().scoreEffectResourceId)) {
                enumC947020ake = EnumC947020ake.SCORE_EFFECT;
            } else {
                C949070anx c949070anx = LIZIZ;
                String str3 = null;
                if (c949070anx != null && (c947420alILIZIZ2 = c949070anx.getCurrentState()) != null && (c947500alQ2 = c947420alILIZIZ2.LJ) != null) {
                    str2 = c947500alQ2.LIZIZ;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    enumC947020ake = EnumC947020ake.GAME_MATERIAL;
                } else {
                    C949070anx c949070anx2 = LIZIZ;
                    if (c949070anx2 != null && (c947420alILIZIZ = c949070anx2.getCurrentState()) != null && (c947500alQ = c947420alILIZIZ.LJFF) != null) {
                        str3 = c947500alQ.LIZIZ;
                    }
                    if (Intrinsics.LJFF(str, str3)) {
                        enumC947020ake = EnumC947020ake.GAME_BG_LOTTIE;
                    } else {
                        LJIIZILJ();
                        if (!Intrinsics.LJFF(str, LinkMicLayoutEffectResourceSetting.INSTANCE.getResourceId())) {
                            return;
                        } else {
                            enumC947020ake = EnumC947020ake.LAYOUT_RESOURCE;
                        }
                    }
                }
            }
            if (enumC947020ake == null) {
                return;
            }
        }
        C786410Ut5.LJJZZIII(C788390UwH.LIZ, new ARunnableS106S0100000_6(new Function0() { // from class: X.0ao6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EnumC947020ake enumC947020ake2 = enumC947020ake;
                InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
                Long l2 = l;
                for (Pair pair : (ArrayList) C949060anw.LJII) {
                    C949040anu c949040anu = (C949040anu) pair.getFirst();
                    Set set = (Set) pair.getSecond();
                    Object objLIZ = c949040anu.LIZ();
                    if (objLIZ != null && set.contains(enumC947020ake2)) {
                        interfaceC1631620sYq2.invoke(enumC947020ake2, l2, objLIZ);
                    }
                }
                C19719612Di.LJJIIJ(C949060anw.LJII, new AObjectS117S0000000_15(9), true);
                return Unit.LIZ;
            }
        }, 4));
    }
}
