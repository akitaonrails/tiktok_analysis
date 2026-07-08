package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Yf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879690Yf9 implements InterfaceC882100Yj2 {
    public final C1491005sa LL = C1491005sa.LIZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(525));
    public final String LLILLL = "ChatListVisibleTabUpdater";
    public final String LLILZ = "visible_tab_updater";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1559));
    public final boolean LLILZLL = true;
    public final C13BV LLIZ = C13BV.INSTANCE;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(524));
    public Set<? extends FilterTabType> LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        ((Map) this.LLIZLLLIL.getValue()).clear();
        this.LLJ = null;
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJ().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJ().addAll(list);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.13BV] */
    @Override // X.InterfaceC882100Yj2
    public final void LJIILLIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
        ?? arrayList;
        int size;
        C0Y8T c0y8t;
        Object obj;
        IMUser iMUser;
        if (!(interfaceC879010Ye3 instanceof C878950Ydx)) {
            return;
        }
        ArrayList<String> arrayList2 = C879710YfB.LIZ;
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        Set setLIZ = C879710YfB.LIZ(c19212010Ec.LIZJ());
        if (setLIZ.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            Set setLLIIJI = C13LP.LLIIJI(c19212010Ec.LJIIIIZZ());
            arrayList = new ArrayList();
            for (Object obj2 : setLIZ) {
                if (setLLIIJI.contains(obj2)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zLJJIIZI = a0.LJJIIZI(str, "refresh", false);
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (Intrinsics.LJFF(interfaceC879010Ye3, C881500Yi4.LIZLLL()) || (zLJJIIZI && arrayList.contains(((C878950Ydx) interfaceC879010Ye3).LLILLL))) {
            String str2 = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("observeRawDataChange start: ");
            sbLIZ.append(str);
            sbLIZ.append(", pagekey: ");
            sbLIZ.append(interfaceC879010Ye3);
            C2188811AlT.LIZIZ(sbLIZ);
            C309160C9y.LIZLLL(str2);
            if (u.LJIIZILJ(str, "preload_all", false)) {
                this.LLJI = true;
            }
            Set<EnumC880480YgQ> second = C19212010Ec.LIZJ.LJLIIIL().getSecond();
            for (FilterTabType filterTabType : arrayList) {
                Map map = (Map) this.LLIZLLLIL.getValue();
                Object linkedHashSet = map.get(filterTabType);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    map.put(filterTabType, linkedHashSet);
                }
                Set set = (Set) linkedHashSet;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
                    Object obj3 = c879540Yeu.LIZJ;
                    String uid = null;
                    if ((obj3 instanceof C0Y8T) && (c0y8t = (C0Y8T) obj3) != null) {
                        C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
                        if (c1490405sU != null) {
                            obj = c1490405sU.LIZIZ;
                        } else {
                            obj = null;
                        }
                        if (obj instanceof IMUser) {
                            iMUser = (IMUser) obj;
                        } else {
                            iMUser = null;
                        }
                        Set<EnumC880480YgQ> set2 = C880490YgR.LLILLL;
                        if (iMUser != null) {
                            uid = iMUser.getUid();
                        }
                        boolean zLIZ = C880370YgF.LIZ(filterTabType, second, c0y8t, iMUser, uid, null);
                        InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
                        if (zLIZ) {
                            set.add(interfaceC1491305sd);
                        } else {
                            set.remove(interfaceC1491305sd);
                        }
                    }
                }
                Iterator it3 = collection2.iterator();
                while (it3.hasNext()) {
                    set.remove(it3.next());
                }
            }
            if (!this.LLJI) {
                C309160C9y.LIZLLL(this.LLILLL);
                return;
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj4 : arrayList) {
                Set set3 = (Set) ((Map) this.LLIZLLLIL.getValue()).get(obj4);
                if (set3 != null) {
                    size = set3.size();
                } else {
                    size = 0;
                }
                linkedHashMap.put(obj4, Integer.valueOf(size));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((Number) entry.getValue()).intValue() <= 0) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Set<? extends FilterTabType> setKeySet = linkedHashMap2.keySet();
            if (Intrinsics.LJFF(setKeySet, this.LLJ)) {
                String str3 = this.LLILLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("postHiddenTabs, the same hidden tabs, return, postHiddenTabs=");
                sbLIZ2.append(setKeySet);
                sbLIZ2.append(", convCount=");
                sbLIZ2.append(linkedHashMap);
                C2188811AlT.LIZIZ(sbLIZ2);
                C309160C9y.LIZLLL(str3);
                return;
            }
            this.LLJ = setKeySet;
            String str4 = this.LLILLL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("postHiddenTabs=");
            sbLIZ3.append(setKeySet);
            sbLIZ3.append(", convCount=");
            sbLIZ3.append(linkedHashMap);
            C2188811AlT.LIZIZ(sbLIZ3);
            C309160C9y.LIZLLL(str4);
            C0CNO.LIZLLL(0L, new AwS558S0100000_14(setKeySet, (Set<? extends FilterTabType>) 1560));
        }
    }
}
