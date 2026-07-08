package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881970Yip implements InterfaceC882100Yj2 {
    public final C1517705wt LL = new C1517705wt(C13LQ.LJLIIL(new InterfaceC1517505wr[]{C1517305wp.LIZ, C1517405wq.LIZ}));
    public final String LLILLJJLI = "ChatListActivityStatusUpdater";
    public final String LLILLL = "activity_status_updater";
    public final C01GW LLILZ = C452501pT.LIZIZ(new C881520Yi6(this));
    public final boolean LLILZIL = true;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C881980Yiq());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C882010Yit());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C882130Yj5());
    public final C01GW LLJ = C452501pT.LIZIZ(new C881990Yir());
    public final C01GW LLJI = C452501pT.LIZIZ(new C882000Yis());

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILLIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLILZLL.getValue();
    }

    public final InterfaceC897330ZId LJIJJ() {
        InterfaceC882030Yiv interfaceC882030Yiv = (InterfaceC882030Yiv) this.LLIZLLLIL.getValue();
        if (interfaceC882030Yiv != null) {
            return interfaceC882030Yiv.get();
        }
        return null;
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJLI() {
        return (CopyOnWriteArrayList) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        InterfaceC897330ZId interfaceC897330ZIdLJIJJ = LJIJJ();
        if (interfaceC897330ZIdLJIJJ != null) {
            interfaceC897330ZIdLJIJJ.LJII();
        }
        ((ConcurrentHashMap) this.LLJ.getValue()).clear();
        ((ConcurrentHashMap) this.LLJI.getValue()).clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJLI().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
        InterfaceC897330ZId interfaceC897330ZIdLJIJJ = LJIJJ();
        if (interfaceC897330ZIdLJIJJ != null) {
            interfaceC897330ZIdLJIJJ.LJ();
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJ(final InterfaceC879010Ye3 interfaceC879010Ye3) {
        C0NYY c0nyy = new C0NYY() { // from class: X.0Yho
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                InterfaceC879010Ye3 interfaceC879010Ye32 = interfaceC879010Ye3;
                C1729806q0.LIZ(interfaceC879010Ye32, new C881330Yhn(this, map, interfaceC879010Ye32, null));
                return Unit.LIZ;
            }
        };
        ((ConcurrentHashMap) this.LLJI.getValue()).put(interfaceC879010Ye3, c0nyy);
        InterfaceC897330ZId interfaceC897330ZIdLJIJJ = LJIJJ();
        if (interfaceC897330ZIdLJIJJ != null) {
            interfaceC897330ZIdLJIJJ.LIZIZ(false, c0nyy);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        InterfaceC897330ZId interfaceC897330ZIdLJIJJ;
        ((ConcurrentHashMap) this.LLJ.getValue()).remove(interfaceC879010Ye3);
        C0NYY c0nyy = (C0NYY) ((ConcurrentHashMap) this.LLJI.getValue()).remove(interfaceC879010Ye3);
        if (c0nyy != null && (interfaceC897330ZIdLJIJJ = LJIJJ()) != null) {
            interfaceC897330ZIdLJIJJ.LJIIJ(c0nyy);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJLI().addAll(list);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
        ConcurrentHashMap concurrentHashMap;
        Collection collectionValues;
        C881350Yhp c881350Yhp = (C881350Yhp) ((ConcurrentHashMap) this.LLJ.getValue()).get(interfaceC879010Ye3);
        if (c881350Yhp != null && (concurrentHashMap = (ConcurrentHashMap) c881350Yhp.LIZ.getValue()) != null && (collectionValues = concurrentHashMap.values()) != null) {
            C19719612Di.LJJIII(collectionValues, new AwS593S0100000_14(interfaceC1491305sd, 217), true);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        C0Y8T c0y8t;
        String string;
        C882020Yiu c882020Yiu = C882020Yiu.LIZ;
        T t = 0;
        T t2 = 0;
        if (!Intrinsics.LJFF(abstractC1491605sg, c882020Yiu)) {
            return null;
        }
        T t3 = c879540Yeu.LIZJ;
        if (!(t3 instanceof C0Y8T) || (c0y8t = (C0Y8T) t3) == null) {
            return null;
        }
        InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
        if (!Intrinsics.LJFF(interfaceC1490905sZ, C882110Yj3.INSTANCE) && !Intrinsics.LJFF(interfaceC1490905sZ, C1709506mj.INSTANCE)) {
            if (!Intrinsics.LJFF(interfaceC1490905sZ, C1606306Qr.INSTANCE)) {
                return null;
            }
            boolean zLJIIIZ = C0ZFW.LIZ.LJIIIZ(c0y8t);
            List<Long> memberIds = c0y8t.getMemberIds();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(memberIds, 10));
            Iterator<Long> it2 = memberIds.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!C10EU.LJIIZILJ((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (!zLJIIIZ || !C1727806pg.LIZ.LIZ("group_chat_operation_enable_activity_status", c0y8t.getConversationId(), C461720I8s.LIZIZ(), false)) {
                return null;
            }
            C595700NYa c595700NYa = new C595700NYa(c0y8t.getConversationId(), arrayList2);
            InterfaceC897380ZIi.LIZIZ.getClass();
            C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(c595700NYa);
            if (c595660NXwLIZIZ == null) {
                return null;
            }
            if (c1490405sU == null) {
                return new C1490405sU<>(C882020Yiu.LIZ, new C882070Yiz(c595660NXwLIZIZ, 14));
            }
            C882070Yiz c882070Yiz = (C882070Yiz) c1490405sU.LIZIZ;
            if (c882070Yiz != null) {
                c882070Yiz.LIZ = c595660NXwLIZIZ;
                t2 = c882070Yiz;
            }
            c1490405sU.LIZIZ = t2;
            return c1490405sU;
        }
        Long lValueOf = Long.valueOf(C0YNP.LJII(c0y8t.getConversationId()));
        if (lValueOf.longValue() == -1 || (string = lValueOf.toString()) == null) {
            return null;
        }
        C595710NYb c595710NYb = new C595710NYb(string);
        InterfaceC897380ZIi.LIZIZ.getClass();
        C595660NXw c595660NXwLIZIZ2 = C897370ZIh.LIZ().LIZIZ(c595710NYb);
        if (c595660NXwLIZIZ2 == null) {
            return null;
        }
        if (c1490405sU == null) {
            return new C1490405sU<>(c882020Yiu, new C882070Yiz(c595660NXwLIZIZ2, 14));
        }
        C882070Yiz c882070Yiz2 = (C882070Yiz) c1490405sU.LIZIZ;
        if (c882070Yiz2 != null) {
            c882070Yiz2.LIZ = c595660NXwLIZIZ2;
            t = c882070Yiz2;
        }
        c1490405sU.LIZIZ = t;
        return c1490405sU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        C0Y8T c0y8t;
        Object c595710NYb;
        String string;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LLJ.getValue();
        Object c881350Yhp = concurrentHashMap.get(interfaceC879010Ye3);
        if (c881350Yhp == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC879010Ye3, (c881350Yhp = new C881350Yhp()))) != null) {
            c881350Yhp = objPutIfAbsent;
        }
        C881350Yhp c881350Yhp2 = (C881350Yhp) c881350Yhp;
        ((ConcurrentHashMap) c881350Yhp2.LIZ.getValue()).clear();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
            T t = c879540Yeu.LIZJ;
            if ((t instanceof C0Y8T) && (c0y8t = (C0Y8T) t) != null) {
                Object obj = c879540Yeu.LIZ;
                if (!Intrinsics.LJFF(obj, C882110Yj3.INSTANCE) && !Intrinsics.LJFF(obj, C1709506mj.INSTANCE)) {
                    if (Intrinsics.LJFF(obj, C1606306Qr.INSTANCE)) {
                        boolean zLJIIIZ = C0ZFW.LIZ.LJIIIZ(c0y8t);
                        List<Long> memberIds = c0y8t.getMemberIds();
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(memberIds, 10));
                        Iterator<Long> it3 = memberIds.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(it3.next().toString());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (!C10EU.LJIIZILJ((String) obj2)) {
                                arrayList3.add(obj2);
                            }
                        }
                        if (zLJIIIZ && C1727806pg.LIZ.LIZ("group_chat_operation_enable_activity_status", c0y8t.getConversationId(), C461720I8s.LIZIZ(), false)) {
                            ((ConcurrentHashMap) c881350Yhp2.LIZ.getValue()).put(c0y8t.getConversationId(), c879540Yeu.LIZIZ);
                            c595710NYb = new C595700NYa(c0y8t.getConversationId(), arrayList3);
                            arrayList.add(c595710NYb);
                        }
                    }
                } else {
                    Long lValueOf = Long.valueOf(C0YNP.LJII(c0y8t.getConversationId()));
                    if (lValueOf.longValue() != -1 && (string = lValueOf.toString()) != null) {
                        ((ConcurrentHashMap) c881350Yhp2.LIZ.getValue()).put(string, c879540Yeu.LIZIZ);
                        c595710NYb = new C595710NYb(string);
                        arrayList.add(c595710NYb);
                    }
                }
            }
        }
        InterfaceC897330ZId interfaceC897330ZIdLJIJJ = LJIJJ();
        if (interfaceC897330ZIdLJIJJ != null) {
            interfaceC897330ZIdLJIJJ.LJIIIIZZ(arrayList);
        }
    }
}
